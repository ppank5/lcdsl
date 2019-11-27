/**
 * generated by Xtext 2.22.0
 */
package com.wamas.ide.launching.lcDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rap Servlet Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.RapServletConfig#getServletPath <em>Servlet Path</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.RapServletConfig#getBrowserMode <em>Browser Mode</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.RapServletConfig#getServerPort <em>Server Port</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.RapServletConfig#getSessionTimeout <em>Session Timeout</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.RapServletConfig#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.RapServletConfig#isDevMode <em>Dev Mode</em>}</li>
 * </ul>
 *
 * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getRapServletConfig()
 * @model
 * @generated
 */
public interface RapServletConfig extends EObject
{
  /**
   * Returns the value of the '<em><b>Servlet Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Servlet Path</em>' attribute.
   * @see #setServletPath(String)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getRapServletConfig_ServletPath()
   * @model
   * @generated
   */
  String getServletPath();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.RapServletConfig#getServletPath <em>Servlet Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Servlet Path</em>' attribute.
   * @see #getServletPath()
   * @generated
   */
  void setServletPath(String value);

  /**
   * Returns the value of the '<em><b>Browser Mode</b></em>' attribute.
   * The literals are from the enumeration {@link com.wamas.ide.launching.lcDsl.BrowserLaunchMode}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Browser Mode</em>' attribute.
   * @see com.wamas.ide.launching.lcDsl.BrowserLaunchMode
   * @see #setBrowserMode(BrowserLaunchMode)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getRapServletConfig_BrowserMode()
   * @model
   * @generated
   */
  BrowserLaunchMode getBrowserMode();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.RapServletConfig#getBrowserMode <em>Browser Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Browser Mode</em>' attribute.
   * @see com.wamas.ide.launching.lcDsl.BrowserLaunchMode
   * @see #getBrowserMode()
   * @generated
   */
  void setBrowserMode(BrowserLaunchMode value);

  /**
   * Returns the value of the '<em><b>Server Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server Port</em>' attribute.
   * @see #setServerPort(int)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getRapServletConfig_ServerPort()
   * @model
   * @generated
   */
  int getServerPort();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.RapServletConfig#getServerPort <em>Server Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server Port</em>' attribute.
   * @see #getServerPort()
   * @generated
   */
  void setServerPort(int value);

  /**
   * Returns the value of the '<em><b>Session Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Session Timeout</em>' attribute.
   * @see #setSessionTimeout(int)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getRapServletConfig_SessionTimeout()
   * @model
   * @generated
   */
  int getSessionTimeout();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.RapServletConfig#getSessionTimeout <em>Session Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Session Timeout</em>' attribute.
   * @see #getSessionTimeout()
   * @generated
   */
  void setSessionTimeout(int value);

  /**
   * Returns the value of the '<em><b>Context Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context Path</em>' attribute.
   * @see #setContextPath(String)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getRapServletConfig_ContextPath()
   * @model
   * @generated
   */
  String getContextPath();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.RapServletConfig#getContextPath <em>Context Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context Path</em>' attribute.
   * @see #getContextPath()
   * @generated
   */
  void setContextPath(String value);

  /**
   * Returns the value of the '<em><b>Dev Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dev Mode</em>' attribute.
   * @see #setDevMode(boolean)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getRapServletConfig_DevMode()
   * @model
   * @generated
   */
  boolean isDevMode();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.RapServletConfig#isDevMode <em>Dev Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dev Mode</em>' attribute.
   * @see #isDevMode()
   * @generated
   */
  void setDevMode(boolean value);

} // RapServletConfig
