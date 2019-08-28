/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.generator

import com.wamas.ide.launching.lcDsl.EnvironmentVariable
import com.wamas.ide.launching.lcDsl.LaunchConfig
import com.wamas.ide.launching.lcDsl.LaunchModeType
import java.util.List
import java.util.Map
import java.util.function.Function
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.debug.ui.IDebugUIConstants
import org.eclipse.jdt.launching.JavaRuntime

import static extension com.wamas.ide.launching.validation.LcDslValidator.getExpanded
import static extension com.wamas.ide.launching.validation.LcDslValidator.mapSaveSuperConfig
import com.wamas.ide.launching.validation.LcDslValidator
import com.wamas.ide.launching.lcDsl.PluginWithVersion
import org.osgi.framework.Version

/**
 * Collects raw values for launch configuration fields, taking into account inheritance
 */
class RecursiveCollectors {

	static Map<LaunchModeType, String> favoriteGroupMap = newHashMap(
		LaunchModeType.RUN -> IDebugUIConstants.ID_RUN_LAUNCH_GROUP,
		LaunchModeType.DEBUG -> IDebugUIConstants.ID_DEBUG_LAUNCH_GROUP,
		LaunchModeType.PROFILE -> IDebugUIConstants.ID_PROFILE_LAUNCH_GROUP,
		LaunchModeType.COVERAGE -> "com.mountainminds.eclemma.ui.launchGroup.coverage"
	)

	static def mapToFavoriteType(LaunchModeType t) {
		favoriteGroupMap.get(t)
	}

	static def List<String> collectArguments(LaunchConfig config) {
		collectFlatList(config, [progArgs?.map[arguments?.map[value]]?.flatten])
	}

	static def List<String> collectVmArguments(LaunchConfig config) {
		var result = newArrayList

		val mem = collectFlatObject(config, [memory])
		if (mem !== null) {
			if (mem.min > 0)
				result.add("-Xms" + mem.min + mem.minUnit.literal)
			if (mem.max > 0)
				result.add("-Xmx" + mem.max + mem.maxUnit.literal)
			if (mem.perm > 0)
				result.add("-XX:MaxPermSize=" + mem.perm + mem.permUnit.literal)
		}

		result.addAll(collectFlatList(config, [vmArgs?.map[arguments?.map[value]]?.flatten]))
		result
	}

	static def collectJavaMainType(LaunchConfig config) {
		collectFlatObject(config, [mainType?.mainClass?.name])
	}

	static def collectJavaMainProject(LaunchConfig config) {
		val prjName = collectFlatObject(config, [mainProject?.project?.name])
		if (prjName === null) {
			val s = collectFlatBoolean(config, true, [mainProject?.self])
			if (s) {
				return ResourcesPlugin.workspace.root.getFile(new Path(config.eResource.URI.toPlatformString(true)))?.
					project?.name
			}
		}
		return prjName
	}

	static def collectJavaStopInMain(LaunchConfig config) {
		collectFlatBoolean(config, true, [stopInMain])
	}

	static def collectJavaMainSearchInherited(LaunchConfig config) {
		collectFlatBoolean(config, true, [javaMainSearch?.inherited])
	}

	static def collectJavaMainSearchSystem(LaunchConfig config) {
		collectFlatBoolean(config, true, [javaMainSearch?.system])
	}

	static def collectWorkingDir(LaunchConfig config) {
		collectFlatObject(config, [workingDir?.workingDir?.name?.value])
	}

	static def collectRedirectOutFile(LaunchConfig config) {
		collectFlatObject(config, [redirect?.outFile?.name?.value])
	}

	static def collectRedirectOutAppend(LaunchConfig config) {
		collectFlatBoolean(config, false, [
			if (redirect === null)
				return true
			redirect.noAppend
		])
	}

	static def collectRedirectInFile(LaunchConfig config) {
		collectFlatObject(config, [redirect?.inFile?.name?.value])
	}

	static def collectNoConsole(LaunchConfig config) {
		collectFlatBoolean(config, true, [noConsole])
	}

	static def collectReplaceEnv(LaunchConfig config) {
		collectFlatBoolean(config, true, [replaceEnv])
	}

	static def collectForeground(LaunchConfig config) {
		collectFlatBoolean(config, true, [foreground])
	}

	static def collectNoValidate(LaunchConfig config) {
		collectFlatBoolean(config, true, [noValidate])
	}

	static def collectWorkspace(LaunchConfig config) {
		collectFlatObject(config, [workspace?.workspace?.name?.value])
	}

	static def collectClearOptions(LaunchConfig config) {
		collectFlatObject(config, [clears])
	}

	static def collectTracing(LaunchConfig config) {
		collectFlatList(config, [traces])?.groupBy[plugin].mapValues[map[what].flatten]
	}

	static def collectApplication(LaunchConfig config) {
		collectFlatObject(config, [application?.name])
	}

	static def collectProduct(LaunchConfig config) {
		collectFlatObject(config, [product?.name])
	}

	static def collectSwInstall(LaunchConfig config) {
		collectFlatBoolean(config, true, [swInstallSupport])
	}

	static def collectConfigIniTemplate(LaunchConfig config) {
		collectFlatObject(config, [configIniTemplate?.path?.name?.value])
	}

	static def collectRAPServletPath(LaunchConfig config) {
		collectFlatObject(config, [servletConfig?.servletPath])
	}

	static def collectRAPServletPort(LaunchConfig config) {
		collectFlatObject(config, [servletConfig?.serverPort])
	}

	static def collectRAPSessionTimeout(LaunchConfig config) {
		collectFlatObject(config, [servletConfig?.sessionTimeout])
	}

	static def collectRAPContextPath(LaunchConfig config) {
		collectFlatObject(config, [servletConfig?.contextPath])
	}

	static def collectRAPDevMode(LaunchConfig config) {
		collectFlatBoolean(config, true, [servletConfig?.devMode])
	}

	static def collectRAPBrowserMode(LaunchConfig config) {
		val o = collectFlatObject(config, [servletConfig?.browserMode])
		if (o == null)
			return null;

		return o.name()
	}

	static def collectPlugins(LaunchConfig config) {
		collectFlatList(config, [plugins?.map[plugin]])
	}

	static def collectIgnores(LaunchConfig config) {
		// if "plugin" in base and "ignore" in sub -> ignore
		// if "ignore" in base and "plugin" in sub -> don't ignore!
		val rawIgnores = collectHierarchicalMap(config, 0, [ignore?.map[plugin]])
		val rawPlugins = collectHierarchicalMap(config, 0, [plugins?.map[plugin]])

		// now remove ignores where there is a 'plugin' with a lower hierarchy number
		rawIgnores.filter [ ignore, level |
			for (entry : rawPlugins.filter[p, pl|pl <= level].entrySet) {
				val p = entry.key.plugin
				if (p.matches(ignore)) {
					return false;
				}
			}
			true
		].keySet
	}

	/**
	 * Check whether 'a' matches (satisfies) 'b'.
	 */
	static def matches(PluginWithVersion a, PluginWithVersion b) {
		if (a.name != b.name) {
			return false
		}
		
		if(a.version === null || b.version === null) {
			return b.version === null // matches if b has no version but a does
		}

		val va = new Version(a.version)
		val vb = new Version(b.version)

		return va.compareTo(vb) >= 0;
	}

	private static def <T> Map<T, Integer> collectHierarchicalMap(LaunchConfig config, int level,
		Function<LaunchConfig, ? extends Iterable<T>> extractor) {
		val result = newHashMap()

		if (config.mapSaveSuperConfig !== null) {
			result.putAll(collectHierarchicalMap(config.mapSaveSuperConfig, level + 1, extractor))
		}

		val v = extractor.apply(config)
		if (v !== null)
			v.forEach[result.put(it, level)]

		result
	}

	static def collectContentProvider(LaunchConfig config) {
		collectFlatObject(config, [
			val n = contentProviderProduct?.product?.name
			if (n === null)
				return null

			return n.expanded
		])
	}

	static def collectFeatures(LaunchConfig config) {
		collectFlatList(config, [features?.map[feature]])
	}

	static def collectExecEnvPath(LaunchConfig config) {
		val e = collectFlatObject(config, [execEnv?.name])
		if (e !== null && !e.empty) {
			return JavaRuntime.newJREContainerPath(JavaRuntime.getExecutionEnvironmentsManager().getEnvironment(e))?.
				toPortableString
		}
		null
	}

	static def collectFavoriteGroups(LaunchConfig config) {
		collectFlatList(config, [
			favorites?.types?.map[favoriteGroupMap.get(it)]
		])
	}
	
	static def collectGroupMembers(LaunchConfig config) {
		collectFlatList(config, [groupMembers])
	}

	static def collectEnvMap(LaunchConfig config) {
		collectFlatEnvMap(config)
	}

	private static def Map<String, String> collectFlatEnvMap(LaunchConfig config) {
		val o = newHashMap()

		if (config.mapSaveSuperConfig !== null) {
			o.putAll(collectFlatEnvMap(config.mapSaveSuperConfig))
		}

		o.putAll(config.envVars.envVarsToMap)
		o
	}

	private static def Map<String, String> envVarsToMap(Iterable<EnvironmentVariable> vars) {
		val r = newHashMap()

		if (vars !== null && !vars.empty) {
			vars.forEach[r.put(name, value.value)]
		}

		r
	}

	/**
	 * Collects a single attribute from a launch configuration model, traversing supertypes if necessary 
	 */
	private static def <T> T collectFlatObject(LaunchConfig config, Function<LaunchConfig, T> extractor) {
		val o = extractor.apply(config)

		if (o !== null)
			return o

		if (config.mapSaveSuperConfig != null)
			return collectFlatObject(config.mapSaveSuperConfig, extractor)

		return null;
	}

	/**
	 * Collects a list of elements for an attribute from a launch configuration mode, traversing all supertypes 
	 */
	private static def <T> List<T> collectFlatList(LaunchConfig config,
		Function<LaunchConfig, ? extends Iterable<T>> extractor) {
		var result = newArrayList()

		if (config.mapSaveSuperConfig !== null) {
			result.addAll(collectFlatList(config.mapSaveSuperConfig, extractor))
		}

		val v = extractor.apply(config)
		if (v !== null)
			result.addAll(v)

		result
	}

	/**
	 * Checks the launch configuration hierarchy for the given boolean having the expected value.
	 * 
	 * @return true if any of the launch configurations in the hierarchy has a extracts the expected boolean value. false otherwise.
	 */
	private static def boolean collectFlatBoolean(LaunchConfig config, boolean expected,
		Function<LaunchConfig, Boolean> extractor) {
		val o = extractor.apply(config)

		if (o !== null && o == expected)
			return true

		if (config.mapSaveSuperConfig !== null)
			return collectFlatBoolean(config.mapSaveSuperConfig, expected, extractor)

		return false;
	}

}
