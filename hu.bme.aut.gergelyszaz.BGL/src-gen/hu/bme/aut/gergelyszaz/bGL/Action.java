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
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Action#getFilter <em>Filter</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Action#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Action#getGotoCondition <em>Goto Condition</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Action#getLabel <em>Label</em>}</li>
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

  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(OrExp)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAction_Filter()
   * @model containment="true"
   * @generated
   */
  OrExp getFilter();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Action#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(OrExp value);

  /**
   * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment</em>' containment reference.
   * @see #setAssignment(ValueAssignment)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAction_Assignment()
   * @model containment="true"
   * @generated
   */
  ValueAssignment getAssignment();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Action#getAssignment <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment</em>' containment reference.
   * @see #getAssignment()
   * @generated
   */
  void setAssignment(ValueAssignment value);

  /**
   * Returns the value of the '<em><b>Goto Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goto Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goto Condition</em>' containment reference.
   * @see #setGotoCondition(GotoCondition)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAction_GotoCondition()
   * @model containment="true"
   * @generated
   */
  GotoCondition getGotoCondition();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Action#getGotoCondition <em>Goto Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goto Condition</em>' containment reference.
   * @see #getGotoCondition()
   * @generated
   */
  void setGotoCondition(GotoCondition value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference.
   * @see #setLabel(Label)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAction_Label()
   * @model containment="true"
   * @generated
   */
  Label getLabel();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Action#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(Label value);

} // Action
