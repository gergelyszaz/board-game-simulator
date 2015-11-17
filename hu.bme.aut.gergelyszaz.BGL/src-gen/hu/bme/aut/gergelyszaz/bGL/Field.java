/**
 */
package hu.bme.aut.gergelyszaz.bGL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Field#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Field#getX <em>X</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Field#getY <em>Y</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Field#getZ <em>Z</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Field#getNeighbours <em>Neighbours</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Field#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Field#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(int)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getField_X()
   * @model
   * @generated
   */
  int getX();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Field#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(int value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' attribute.
   * @see #setY(int)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getField_Y()
   * @model
   * @generated
   */
  int getY();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Field#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(int value);

  /**
   * Returns the value of the '<em><b>Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Z</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Z</em>' attribute.
   * @see #setZ(int)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getField_Z()
   * @model
   * @generated
   */
  int getZ();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Field#getZ <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Z</em>' attribute.
   * @see #getZ()
   * @generated
   */
  void setZ(int value);

  /**
   * Returns the value of the '<em><b>Neighbours</b></em>' reference list.
   * The list contents are of type {@link hu.bme.aut.gergelyszaz.bGL.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Neighbours</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Neighbours</em>' reference list.
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getField_Neighbours()
   * @model
   * @generated
   */
  EList<Field> getNeighbours();

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.aut.gergelyszaz.bGL.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getField_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVariables();

} // Field
