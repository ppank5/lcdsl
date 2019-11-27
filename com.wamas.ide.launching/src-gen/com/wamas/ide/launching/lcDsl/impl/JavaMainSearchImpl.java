/**
 * generated by Xtext 2.22.0
 */
package com.wamas.ide.launching.lcDsl.impl;

import com.wamas.ide.launching.lcDsl.JavaMainSearch;
import com.wamas.ide.launching.lcDsl.LcDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Main Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.JavaMainSearchImpl#isSystem <em>System</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.JavaMainSearchImpl#isInherited <em>Inherited</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaMainSearchImpl extends MinimalEObjectImpl.Container implements JavaMainSearch
{
  /**
   * The default value of the '{@link #isSystem() <em>System</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSystem()
   * @generated
   * @ordered
   */
  protected static final boolean SYSTEM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSystem() <em>System</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSystem()
   * @generated
   * @ordered
   */
  protected boolean system = SYSTEM_EDEFAULT;

  /**
   * The default value of the '{@link #isInherited() <em>Inherited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInherited()
   * @generated
   * @ordered
   */
  protected static final boolean INHERITED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInherited() <em>Inherited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInherited()
   * @generated
   * @ordered
   */
  protected boolean inherited = INHERITED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JavaMainSearchImpl()
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
    return LcDslPackage.Literals.JAVA_MAIN_SEARCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isSystem()
  {
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSystem(boolean newSystem)
  {
    boolean oldSystem = system;
    system = newSystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.JAVA_MAIN_SEARCH__SYSTEM, oldSystem, system));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isInherited()
  {
    return inherited;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInherited(boolean newInherited)
  {
    boolean oldInherited = inherited;
    inherited = newInherited;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.JAVA_MAIN_SEARCH__INHERITED, oldInherited, inherited));
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
      case LcDslPackage.JAVA_MAIN_SEARCH__SYSTEM:
        return isSystem();
      case LcDslPackage.JAVA_MAIN_SEARCH__INHERITED:
        return isInherited();
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
      case LcDslPackage.JAVA_MAIN_SEARCH__SYSTEM:
        setSystem((Boolean)newValue);
        return;
      case LcDslPackage.JAVA_MAIN_SEARCH__INHERITED:
        setInherited((Boolean)newValue);
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
      case LcDslPackage.JAVA_MAIN_SEARCH__SYSTEM:
        setSystem(SYSTEM_EDEFAULT);
        return;
      case LcDslPackage.JAVA_MAIN_SEARCH__INHERITED:
        setInherited(INHERITED_EDEFAULT);
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
      case LcDslPackage.JAVA_MAIN_SEARCH__SYSTEM:
        return system != SYSTEM_EDEFAULT;
      case LcDslPackage.JAVA_MAIN_SEARCH__INHERITED:
        return inherited != INHERITED_EDEFAULT;
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
    result.append(" (system: ");
    result.append(system);
    result.append(", inherited: ");
    result.append(inherited);
    result.append(')');
    return result.toString();
  }

} //JavaMainSearchImpl
