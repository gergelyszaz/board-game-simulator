/**
 */
package hu.bme.aut.gergelyszaz.bGL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.VariableReference#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends Expression
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Variable)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getVariableReference_Ref()
   * @model
   * @generated
   */
  Variable getRef();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.VariableReference#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Variable value);

} // VariableReference
