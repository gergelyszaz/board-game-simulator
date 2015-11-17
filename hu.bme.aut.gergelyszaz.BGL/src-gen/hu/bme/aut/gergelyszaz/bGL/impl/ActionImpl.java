/**
 */
package hu.bme.aut.gergelyszaz.bGL.impl;

import hu.bme.aut.gergelyszaz.bGL.Action;
import hu.bme.aut.gergelyszaz.bGL.BGLPackage;
import hu.bme.aut.gergelyszaz.bGL.Token;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.impl.ActionImpl#getToken <em>Token</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.impl.ActionImpl#getObjectOfSelect <em>Object Of Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getToken() <em>Token</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToken()
   * @generated
   * @ordered
   */
  protected Token token;

  /**
   * The default value of the '{@link #getObjectOfSelect() <em>Object Of Select</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectOfSelect()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_OF_SELECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjectOfSelect() <em>Object Of Select</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectOfSelect()
   * @generated
   * @ordered
   */
  protected String objectOfSelect = OBJECT_OF_SELECT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return BGLPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BGLPackage.ACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Token getToken()
  {
    if (token != null && token.eIsProxy())
    {
      InternalEObject oldToken = (InternalEObject)token;
      token = (Token)eResolveProxy(oldToken);
      if (token != oldToken)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BGLPackage.ACTION__TOKEN, oldToken, token));
      }
    }
    return token;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Token basicGetToken()
  {
    return token;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToken(Token newToken)
  {
    Token oldToken = token;
    token = newToken;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BGLPackage.ACTION__TOKEN, oldToken, token));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObjectOfSelect()
  {
    return objectOfSelect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectOfSelect(String newObjectOfSelect)
  {
    String oldObjectOfSelect = objectOfSelect;
    objectOfSelect = newObjectOfSelect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BGLPackage.ACTION__OBJECT_OF_SELECT, oldObjectOfSelect, objectOfSelect));
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
      case BGLPackage.ACTION__NAME:
        return getName();
      case BGLPackage.ACTION__TOKEN:
        if (resolve) return getToken();
        return basicGetToken();
      case BGLPackage.ACTION__OBJECT_OF_SELECT:
        return getObjectOfSelect();
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
      case BGLPackage.ACTION__NAME:
        setName((String)newValue);
        return;
      case BGLPackage.ACTION__TOKEN:
        setToken((Token)newValue);
        return;
      case BGLPackage.ACTION__OBJECT_OF_SELECT:
        setObjectOfSelect((String)newValue);
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
      case BGLPackage.ACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BGLPackage.ACTION__TOKEN:
        setToken((Token)null);
        return;
      case BGLPackage.ACTION__OBJECT_OF_SELECT:
        setObjectOfSelect(OBJECT_OF_SELECT_EDEFAULT);
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
      case BGLPackage.ACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BGLPackage.ACTION__TOKEN:
        return token != null;
      case BGLPackage.ACTION__OBJECT_OF_SELECT:
        return OBJECT_OF_SELECT_EDEFAULT == null ? objectOfSelect != null : !OBJECT_OF_SELECT_EDEFAULT.equals(objectOfSelect);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", objectOfSelect: ");
    result.append(objectOfSelect);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
