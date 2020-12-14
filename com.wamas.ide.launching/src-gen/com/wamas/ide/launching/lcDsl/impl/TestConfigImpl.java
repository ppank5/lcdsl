/**
 * generated by Xtext 2.22.0
 */
package com.wamas.ide.launching.lcDsl.impl;

import com.wamas.ide.launching.lcDsl.LcDslPackage;
import com.wamas.ide.launching.lcDsl.TestConfig;
import com.wamas.ide.launching.lcDsl.TestRunnerType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.TestConfigImpl#getRunner <em>Runner</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.TestConfigImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.TestConfigImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.TestConfigImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.TestConfigImpl#getExcludeTags <em>Exclude Tags</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.TestConfigImpl#getIncludeTags <em>Include Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestConfigImpl extends MinimalEObjectImpl.Container implements TestConfig
{
  /**
   * The default value of the '{@link #getRunner() <em>Runner</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRunner()
   * @generated
   * @ordered
   */
  protected static final TestRunnerType RUNNER_EDEFAULT = TestRunnerType.JUNIT4;

  /**
   * The cached value of the '{@link #getRunner() <em>Runner</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRunner()
   * @generated
   * @ordered
   */
  protected TestRunnerType runner = RUNNER_EDEFAULT;

  /**
   * The default value of the '{@link #getContainer() <em>Container</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainer()
   * @generated
   * @ordered
   */
  protected static final String CONTAINER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContainer() <em>Container</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainer()
   * @generated
   * @ordered
   */
  protected String container = CONTAINER_EDEFAULT;

  /**
   * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected static final String CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected String class_ = CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final String METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected String method = METHOD_EDEFAULT;

  /**
   * The default value of the '{@link #getExcludeTags() <em>Exclude Tags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcludeTags()
   * @generated
   * @ordered
   */
  protected static final String EXCLUDE_TAGS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExcludeTags() <em>Exclude Tags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcludeTags()
   * @generated
   * @ordered
   */
  protected String excludeTags = EXCLUDE_TAGS_EDEFAULT;

  /**
   * The default value of the '{@link #getIncludeTags() <em>Include Tags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeTags()
   * @generated
   * @ordered
   */
  protected static final String INCLUDE_TAGS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIncludeTags() <em>Include Tags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeTags()
   * @generated
   * @ordered
   */
  protected String includeTags = INCLUDE_TAGS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestConfigImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LcDslPackage.Literals.TEST_CONFIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestRunnerType getRunner()
  {
    return runner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRunner(TestRunnerType newRunner)
  {
    TestRunnerType oldRunner = runner;
    runner = newRunner == null ? RUNNER_EDEFAULT : newRunner;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.TEST_CONFIG__RUNNER, oldRunner, runner));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getContainer()
  {
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContainer(String newContainer)
  {
    String oldContainer = container;
    container = newContainer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.TEST_CONFIG__CONTAINER, oldContainer, container));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClass(String newClass)
  {
    String oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.TEST_CONFIG__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMethod(String newMethod)
  {
    String oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.TEST_CONFIG__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getExcludeTags()
  {
    return excludeTags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExcludeTags(String newExcludeTags)
  {
    String oldExcludeTags = excludeTags;
    excludeTags = newExcludeTags;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.TEST_CONFIG__EXCLUDE_TAGS, oldExcludeTags, excludeTags));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getIncludeTags()
  {
    return includeTags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIncludeTags(String newIncludeTags)
  {
    String oldIncludeTags = includeTags;
    includeTags = newIncludeTags;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.TEST_CONFIG__INCLUDE_TAGS, oldIncludeTags, includeTags));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LcDslPackage.TEST_CONFIG__RUNNER:
        return getRunner();
      case LcDslPackage.TEST_CONFIG__CONTAINER:
        return getContainer();
      case LcDslPackage.TEST_CONFIG__CLASS:
        return getClass_();
      case LcDslPackage.TEST_CONFIG__METHOD:
        return getMethod();
      case LcDslPackage.TEST_CONFIG__EXCLUDE_TAGS:
        return getExcludeTags();
      case LcDslPackage.TEST_CONFIG__INCLUDE_TAGS:
        return getIncludeTags();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LcDslPackage.TEST_CONFIG__RUNNER:
        setRunner((TestRunnerType)newValue);
        return;
      case LcDslPackage.TEST_CONFIG__CONTAINER:
        setContainer((String)newValue);
        return;
      case LcDslPackage.TEST_CONFIG__CLASS:
        setClass((String)newValue);
        return;
      case LcDslPackage.TEST_CONFIG__METHOD:
        setMethod((String)newValue);
        return;
      case LcDslPackage.TEST_CONFIG__EXCLUDE_TAGS:
        setExcludeTags((String)newValue);
        return;
      case LcDslPackage.TEST_CONFIG__INCLUDE_TAGS:
        setIncludeTags((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LcDslPackage.TEST_CONFIG__RUNNER:
        setRunner(RUNNER_EDEFAULT);
        return;
      case LcDslPackage.TEST_CONFIG__CONTAINER:
        setContainer(CONTAINER_EDEFAULT);
        return;
      case LcDslPackage.TEST_CONFIG__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case LcDslPackage.TEST_CONFIG__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case LcDslPackage.TEST_CONFIG__EXCLUDE_TAGS:
        setExcludeTags(EXCLUDE_TAGS_EDEFAULT);
        return;
      case LcDslPackage.TEST_CONFIG__INCLUDE_TAGS:
        setIncludeTags(INCLUDE_TAGS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LcDslPackage.TEST_CONFIG__RUNNER:
        return runner != RUNNER_EDEFAULT;
      case LcDslPackage.TEST_CONFIG__CONTAINER:
        return CONTAINER_EDEFAULT == null ? container != null : !CONTAINER_EDEFAULT.equals(container);
      case LcDslPackage.TEST_CONFIG__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case LcDslPackage.TEST_CONFIG__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
      case LcDslPackage.TEST_CONFIG__EXCLUDE_TAGS:
        return EXCLUDE_TAGS_EDEFAULT == null ? excludeTags != null : !EXCLUDE_TAGS_EDEFAULT.equals(excludeTags);
      case LcDslPackage.TEST_CONFIG__INCLUDE_TAGS:
        return INCLUDE_TAGS_EDEFAULT == null ? includeTags != null : !INCLUDE_TAGS_EDEFAULT.equals(includeTags);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (runner: ");
    result.append(runner);
    result.append(", container: ");
    result.append(container);
    result.append(", class: ");
    result.append(class_);
    result.append(", method: ");
    result.append(method);
    result.append(", excludeTags: ");
    result.append(excludeTags);
    result.append(", includeTags: ");
    result.append(includeTags);
    result.append(')');
    return result.toString();
  }

} //TestConfigImpl