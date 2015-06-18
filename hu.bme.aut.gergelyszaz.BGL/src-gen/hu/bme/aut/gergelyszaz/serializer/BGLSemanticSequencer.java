package hu.bme.aut.gergelyszaz.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import hu.bme.aut.gergelyszaz.bGL.Action;
import hu.bme.aut.gergelyszaz.bGL.AndOrExpression;
import hu.bme.aut.gergelyszaz.bGL.ArithmeticSigned;
import hu.bme.aut.gergelyszaz.bGL.Attribute;
import hu.bme.aut.gergelyszaz.bGL.BGLPackage;
import hu.bme.aut.gergelyszaz.bGL.Board;
import hu.bme.aut.gergelyszaz.bGL.BooleanLiteral;
import hu.bme.aut.gergelyszaz.bGL.BooleanNegation;
import hu.bme.aut.gergelyszaz.bGL.BooleanType;
import hu.bme.aut.gergelyszaz.bGL.Comparison;
import hu.bme.aut.gergelyszaz.bGL.Equals;
import hu.bme.aut.gergelyszaz.bGL.Field;
import hu.bme.aut.gergelyszaz.bGL.IntType;
import hu.bme.aut.gergelyszaz.bGL.Minus;
import hu.bme.aut.gergelyszaz.bGL.Model;
import hu.bme.aut.gergelyszaz.bGL.MultiOrDiv;
import hu.bme.aut.gergelyszaz.bGL.NumberLiteral;
import hu.bme.aut.gergelyszaz.bGL.Player;
import hu.bme.aut.gergelyszaz.bGL.Plus;
import hu.bme.aut.gergelyszaz.bGL.StringLiteral;
import hu.bme.aut.gergelyszaz.bGL.StringType;
import hu.bme.aut.gergelyszaz.bGL.TokenType;
import hu.bme.aut.gergelyszaz.bGL.Tokens;
import hu.bme.aut.gergelyszaz.bGL.Variable;
import hu.bme.aut.gergelyszaz.bGL.VariableReference;
import hu.bme.aut.gergelyszaz.services.BGLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BGLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BGLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BGLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BGLPackage.ACTION:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.AND_OR_EXPRESSION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualsRule() ||
				   context == grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixedRule()) {
					sequence_BooleanExpression(context, (AndOrExpression) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.ARITHMETIC_SIGNED:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualsRule() ||
				   context == grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixedRule()) {
					sequence_Prefixed(context, (ArithmeticSigned) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.BOARD:
				if(context == grammarAccess.getBoardRule()) {
					sequence_Board(context, (Board) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualsRule() ||
				   context == grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixedRule()) {
					sequence_Atomic(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.BOOLEAN_NEGATION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualsRule() ||
				   context == grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixedRule()) {
					sequence_Prefixed(context, (BooleanNegation) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.BOOLEAN_TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (BooleanType) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.COMPARISON:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualsRule() ||
				   context == grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixedRule()) {
					sequence_Comparison(context, (Comparison) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.EQUALS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualsRule() ||
				   context == grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixedRule()) {
					sequence_Equals(context, (Equals) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.FIELD:
				if(context == grammarAccess.getFieldRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.INT_TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (IntType) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.MINUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualsRule() ||
				   context == grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixedRule()) {
					sequence_Addition(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.MULTI_OR_DIV:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualsRule() ||
				   context == grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixedRule()) {
					sequence_Multiplication(context, (MultiOrDiv) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.NUMBER_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualsRule() ||
				   context == grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixedRule()) {
					sequence_Atomic(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.PLAYER:
				if(context == grammarAccess.getPlayerRule()) {
					sequence_Player(context, (Player) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.PLUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualsRule() ||
				   context == grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixedRule()) {
					sequence_Addition(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.STRING_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualsRule() ||
				   context == grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixedRule()) {
					sequence_Atomic(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.STRING_TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (StringType) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.TOKEN_TYPE:
				if(context == grammarAccess.getTokenTypeRule()) {
					sequence_TokenType(context, (TokenType) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.TOKENS:
				if(context == grammarAccess.getTokensRule()) {
					sequence_Tokens(context, (Tokens) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case BGLPackage.VARIABLE_REFERENCE:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualsRule() ||
				   context == grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixedRule()) {
					sequence_Atomic(context, (VariableReference) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((name='Spawn' token=[TokenType|ID]) | (name='Move' field=[Field|ID]) | (name='Roll' from=INT to=INT))
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Addition_Minus_1_0_1_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.MINUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.MINUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Addition_Plus_1_0_0_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.PLUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.PLUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_Atomic(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Atomic(EObject context, NumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.NUMBER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Atomic(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ref=[Variable|ID]
	 */
	protected void sequence_Atomic(EObject context, VariableReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.VARIABLE_REFERENCE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.VARIABLE_REFERENCE__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getRefVariableIDTerminalRuleCall_4_1_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.ATTRIBUTE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='Board' fields+=Field* attributes+=Attribute*)
	 */
	protected void sequence_Board(EObject context, Board semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=BooleanExpression_AndOrExpression_1_0_0 (op='||' | op='&&') right=Comparison)
	 */
	protected void sequence_BooleanExpression(EObject context, AndOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparison_Comparison_1_0_0 op='<' right=Equals)
	 */
	protected void sequence_Comparison(EObject context, Comparison semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.COMPARISON__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.COMPARISON__LEFT));
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.COMPARISON__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.COMPARISON__OP));
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.COMPARISON__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.COMPARISON__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_0_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getComparisonAccess().getRightEqualsParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Equals_Equals_1_0_0 op='==' right=Addition)
	 */
	protected void sequence_Equals(EObject context, Equals semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.EQUALS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.EQUALS__LEFT));
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.EQUALS__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.EQUALS__OP));
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.EQUALS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.EQUALS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getEqualsAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getEqualsAccess().getRightAdditionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID x=INT y=INT z=INT neighbours+=[Field|ID]*)
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID player=Player board=Board tokens=Tokens?)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_MultiOrDiv_1_0_0 (op='*' | op='/') right=Prefixed)
	 */
	protected void sequence_Multiplication(EObject context, MultiOrDiv semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Players' playercount=INT attributes+=Attribute*)
	 */
	protected void sequence_Player(EObject context, Player semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Atomic
	 */
	protected void sequence_Prefixed(EObject context, ArithmeticSigned semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.ARITHMETIC_SIGNED__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.ARITHMETIC_SIGNED__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Atomic
	 */
	protected void sequence_Prefixed(EObject context, BooleanNegation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.BOOLEAN_NEGATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.BOOLEAN_NEGATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_0_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID variables+=Variable* attributes+=Attribute*)
	 */
	protected void sequence_TokenType(EObject context, TokenType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Tokens' tokentypes+=TokenType*)
	 */
	protected void sequence_Tokens(EObject context, Tokens semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BooleanType}
	 */
	protected void sequence_Type(EObject context, BooleanType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IntType}
	 */
	protected void sequence_Type(EObject context, IntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StringType}
	 */
	protected void sequence_Type(EObject context, StringType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=Expression)
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.VARIABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, BGLPackage.Literals.VARIABLE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BGLPackage.Literals.VARIABLE__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
}
