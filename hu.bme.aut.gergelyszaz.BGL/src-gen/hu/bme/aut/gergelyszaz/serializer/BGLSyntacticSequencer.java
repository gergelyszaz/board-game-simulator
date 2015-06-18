package hu.bme.aut.gergelyszaz.serializer;

import com.google.inject.Inject;
import hu.bme.aut.gergelyszaz.services.BGLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class BGLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BGLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Atomic_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_Atomic_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_Board_RightCurlyBracketKeyword_1_1_a;
	protected AbstractElementAlias match_Board_RightCurlyBracketKeyword_1_1_p;
	protected AbstractElementAlias match_Player___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	protected AbstractElementAlias match_TokenType___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BGLGrammarAccess) access;
		match_Atomic_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0());
		match_Atomic_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0());
		match_Board_RightCurlyBracketKeyword_1_1_a = new TokenAlias(true, true, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_1_1());
		match_Board_RightCurlyBracketKeyword_1_1_p = new TokenAlias(true, false, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_1_1());
		match_Player___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_2_2()));
		match_TokenType___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTokenTypeAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getTokenTypeAccess().getRightCurlyBracketKeyword_2_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Atomic_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_Atomic_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Atomic_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_Atomic_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Board_RightCurlyBracketKeyword_1_1_a.equals(syntax))
				emit_Board_RightCurlyBracketKeyword_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Board_RightCurlyBracketKeyword_1_1_p.equals(syntax))
				emit_Board_RightCurlyBracketKeyword_1_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Player___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_Player___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TokenType___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q.equals(syntax))
				emit_TokenType___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_Atomic_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_Atomic_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '}'*
	 */
	protected void emit_Board_RightCurlyBracketKeyword_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '}'+
	 */
	protected void emit_Board_RightCurlyBracketKeyword_1_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Player___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_TokenType___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
