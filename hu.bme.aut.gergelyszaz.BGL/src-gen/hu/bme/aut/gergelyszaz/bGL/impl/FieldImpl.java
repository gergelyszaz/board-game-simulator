/**
 */
package hu.bme.aut.gergelyszaz.bGL.impl;

import hu.bme.aut.gergelyszaz.bGL.BGLPackage;
import hu.bme.aut.gergelyszaz.bGL.Field;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.impl.FieldImpl#getX <em>X</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.impl.FieldImpl#getY <em>Y</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.impl.FieldImpl#getZ <em>Z</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.impl.FieldImpl#getNeighbours <em>Neighbours</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends MinimalEObjectImpl.Container implements Field
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
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final int X_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected int x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final int Y_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected int y = Y_EDEFAULT;

  /**
   * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected static final int Z_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected int z = Z_EDEFAULT;

  /**
   * The cached value of the '{@link #getNeighbours() <em>Neighbours</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeighbours()
   * @generated
   * @ordered
   */
  protected EList<Field> neighbours;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldImpl()
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
    return BGLPackage.Literals.FIELD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BGLPackage.FIELD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(int newX)
  {
    int oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BGLPackage.FIELD__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY(int newY)
  {
    int oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BGLPackage.FIELD__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getZ()
  {
    return z;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZ(int newZ)
  {
    int oldZ = z;
    z = newZ;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BGLPackage.FIELD__Z, oldZ, z));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field> getNeighbours()
  {
    if (neighbours == null)
    {
      neighbours = new EObjectResolvingEList<Field>(Field.class, this, BGLPackage.FIELD__NEIGHBOURS);
    }
    return neighbours;
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
      case BGLPackage.FIELD__NAME:
        return getName();
      case BGLPackage.FIELD__X:
        return getX();
      case BGLPackage.FIELD__Y:
        return getY();
      case BGLPackage.FIELD__Z:
        return getZ();
      case BGLPackage.FIELD__NEIGHBOURS:
        return getNeighbours();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BGLPackage.FIELD__NAME:
        setName((String)newValue);
        return;
      case BGLPackage.FIELD__X:
        setX((Integer)newValue);
        return;
      case BGLPackage.FIELD__Y:
        setY((Integer)newValue);
        return;
      case BGLPackage.FIELD__Z:
        setZ((Integer)newValue);
        return;
      case BGLPackage.FIELD__NEIGHBOURS:
        getNeighbours().clear();
        getNeighbours().addAll((Collection<? extends Field>)newValue);
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
      case BGLPackage.FIELD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BGLPackage.FIELD__X:
        setX(X_EDEFAULT);
        return;
      case BGLPackage.FIELD__Y:
        setY(Y_EDEFAULT);
        return;
      case BGLPackage.FIELD__Z:
        setZ(Z_EDEFAULT);
        return;
      case BGLPackage.FIELD__NEIGHBOURS:
        getNeighbours().clear();
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
      case BGLPackage.FIELD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BGLPackage.FIELD__X:
        return x != X_EDEFAULT;
      case BGLPackage.FIELD__Y:
        return y != Y_EDEFAULT;
      case BGLPackage.FIELD__Z:
        return z != Z_EDEFAULT;
      case BGLPackage.FIELD__NEIGHBOURS:
        return neighbours != null && !neighbours.isEmpty();
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
    result.append(", x: ");
    result.append(x);
    result.append(", y: ");
    result.append(y);
    result.append(", z: ");
    result.append(z);
    result.append(')');
    return result.toString();
  }

} //FieldImpl
