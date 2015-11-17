/**
 */
package hu.bme.aut.gergelyszaz.bGL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Action#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Action#getToken <em>Token</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Action#getObjectOfSelect <em>Object Of Select</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
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
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Token</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Token</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Token</em>' reference.
   * @see #setToken(Token)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAction_Token()
   * @model
   * @generated
   */
  Token getToken();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Action#getToken <em>Token</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Token</em>' reference.
   * @see #getToken()
   * @generated
   */
  void setToken(Token value);

  /**
   * Returns the value of the '<em><b>Object Of Select</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Of Select</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Of Select</em>' attribute.
   * @see #setObjectOfSelect(String)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAction_ObjectOfSelect()
   * @model
   * @generated
   */
  String getObjectOfSelect();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Action#getObjectOfSelect <em>Object Of Select</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Of Select</em>' attribute.
   * @see #getObjectOfSelect()
   * @generated
   */
  void setObjectOfSelect(String value);

} // Action
