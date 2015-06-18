/**
 */
package hu.bme.aut.gergelyszaz.bGL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.AndOrExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.AndOrExpression#getOp <em>Op</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.AndOrExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAndOrExpression()
 * @model
 * @generated
 */
public interface AndOrExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAndOrExpression_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.AndOrExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAndOrExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.AndOrExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAndOrExpression_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.AndOrExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // AndOrExpression
