package hu.bme.aut.gergelyszaz.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.aut.gergelyszaz.services.BGLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBGLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'Players'", "'{'", "'}'", "'Board'", "'Tokens'", "';'", "'('", "','", "')'", "':'", "'='", "'||'", "'&&'", "'<'", "'=='", "'+'", "'-'", "'*'", "'/'", "'!'", "'true'", "'false'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBGLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBGLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBGLParser.tokenNames; }
    public String getGrammarFileName() { return "../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g"; }



     	private BGLGrammarAccess grammarAccess;
     	
        public InternalBGLParser(TokenStream input, BGLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected BGLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:76:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_player_3_0 = null;

        EObject lv_board_4_0 = null;

        EObject lv_tokens_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:79:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) ) ) ) )+ {...}?) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) ) ) ) )+ {...}?) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) ) ) ) )+ {...}?) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) ) ) ) )+ {...}?) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) ) ) ) )+ {...}?) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:83:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:86:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) ) ) ) )+ {...}?)
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) ) ) ) )+ {...}?
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                int LA1_0 = input.LA(1);

                if ( LA1_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                    alt1=1;
                }
                else if ( (LA1_0==RULE_ID|| LA1_0 >=14 && LA1_0<=15) && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                    alt1=3;
                }


                switch (alt1) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:90:5: {...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:90:100: ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:91:6: ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:94:6: ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:94:7: {...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:94:16: (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:94:18: otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleModel167); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getGameKeyword_0_0());
            	          
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:98:1: ( (lv_name_2_0= RULE_ID ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:99:1: (lv_name_2_0= RULE_ID )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:99:1: (lv_name_2_0= RULE_ID )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:100:3: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel184); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getModelRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"name",
            	              		lv_name_2_0, 
            	              		"ID");
            	      	    
            	    }

            	    }


            	    }

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:116:2: ( (lv_player_3_0= rulePlayer ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:117:1: (lv_player_3_0= rulePlayer )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:117:1: (lv_player_3_0= rulePlayer )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:118:3: lv_player_3_0= rulePlayer
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getPlayerPlayerParserRuleCall_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePlayer_in_ruleModel210);
            	    lv_player_3_0=rulePlayer();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"player",
            	              		lv_player_3_0, 
            	              		"Player");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:141:4: ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:141:4: ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:142:5: {...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:142:100: ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:143:6: ({...}? => ( (lv_board_4_0= ruleBoard ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:146:6: ({...}? => ( (lv_board_4_0= ruleBoard ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:146:7: {...}? => ( (lv_board_4_0= ruleBoard ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:146:16: ( (lv_board_4_0= ruleBoard ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:147:1: (lv_board_4_0= ruleBoard )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:147:1: (lv_board_4_0= ruleBoard )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:148:3: lv_board_4_0= ruleBoard
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getBoardBoardParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBoard_in_ruleModel286);
            	    lv_board_4_0=ruleBoard();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"board",
            	              		lv_board_4_0, 
            	              		"Board");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:171:4: ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) ) ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:171:4: ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:172:5: {...}? => ( ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:172:100: ( ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:173:6: ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 2);
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:176:6: ({...}? => ( (lv_tokens_5_0= ruleTokens ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:176:7: {...}? => ( (lv_tokens_5_0= ruleTokens ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:176:16: ( (lv_tokens_5_0= ruleTokens ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:177:1: (lv_tokens_5_0= ruleTokens )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:177:1: (lv_tokens_5_0= ruleTokens )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:178:3: lv_tokens_5_0= ruleTokens
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getTokensTokensParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTokens_in_ruleModel361);
            	    lv_tokens_5_0=ruleTokens();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"tokens",
            	              		lv_tokens_5_0, 
            	              		"Tokens");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup());

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePlayer"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:217:1: entryRulePlayer returns [EObject current=null] : iv_rulePlayer= rulePlayer EOF ;
    public final EObject entryRulePlayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayer = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:218:2: (iv_rulePlayer= rulePlayer EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:219:2: iv_rulePlayer= rulePlayer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlayerRule()); 
            }
            pushFollow(FOLLOW_rulePlayer_in_entryRulePlayer442);
            iv_rulePlayer=rulePlayer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlayer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlayer452); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:226:1: rulePlayer returns [EObject current=null] : ( ( (lv_name_0_0= 'Players' ) ) ( (lv_playercount_1_0= RULE_INT ) ) (otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )? ) ;
    public final EObject rulePlayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_playercount_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:229:28: ( ( ( (lv_name_0_0= 'Players' ) ) ( (lv_playercount_1_0= RULE_INT ) ) (otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )? ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:230:1: ( ( (lv_name_0_0= 'Players' ) ) ( (lv_playercount_1_0= RULE_INT ) ) (otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )? )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:230:1: ( ( (lv_name_0_0= 'Players' ) ) ( (lv_playercount_1_0= RULE_INT ) ) (otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )? )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:230:2: ( (lv_name_0_0= 'Players' ) ) ( (lv_playercount_1_0= RULE_INT ) ) (otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )?
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:230:2: ( (lv_name_0_0= 'Players' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:231:1: (lv_name_0_0= 'Players' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:231:1: (lv_name_0_0= 'Players' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:232:3: lv_name_0_0= 'Players'
            {
            lv_name_0_0=(Token)match(input,12,FOLLOW_12_in_rulePlayer495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getPlayerAccess().getNamePlayersKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPlayerRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "Players");
              	    
            }

            }


            }

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:245:2: ( (lv_playercount_1_0= RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:246:1: (lv_playercount_1_0= RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:246:1: (lv_playercount_1_0= RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:247:3: lv_playercount_1_0= RULE_INT
            {
            lv_playercount_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePlayer525); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_playercount_1_0, grammarAccess.getPlayerAccess().getPlayercountINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPlayerRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"playercount",
                      		lv_playercount_1_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:263:2: (otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:263:4: otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePlayer543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_2_0());
                          
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:267:1: ( (lv_attributes_3_0= ruleAttribute ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:268:1: (lv_attributes_3_0= ruleAttribute )
                    	    {
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:268:1: (lv_attributes_3_0= ruleAttribute )
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:269:3: lv_attributes_3_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPlayerAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttribute_in_rulePlayer564);
                    	    lv_attributes_3_0=ruleAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPlayerRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_3_0, 
                    	              		"Attribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_rulePlayer577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleBoard"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:297:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:298:2: (iv_ruleBoard= ruleBoard EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:299:2: iv_ruleBoard= ruleBoard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoardRule()); 
            }
            pushFollow(FOLLOW_ruleBoard_in_entryRuleBoard615);
            iv_ruleBoard=ruleBoard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoard; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoard625); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:306:1: ruleBoard returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_fields_3_0 = null;

        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:309:28: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:310:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:310:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ) ) ) )+ {...}?) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:312:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ) ) ) )+ {...}?) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:312:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ) ) ) )+ {...}?) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:313:2: ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getBoardAccess().getUnorderedGroup());
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:316:2: ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ) ) ) )+ {...}?)
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:317:3: ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ) ) ) )+ {...}?
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:317:3: ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ) ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=3;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    int LA6_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0) ) {
                        alt6=1;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA6_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1) ) {
                        alt6=2;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA6_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1) ) {
                        alt6=2;
                    }


                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:319:4: ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:319:4: ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:320:5: {...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleBoard", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:320:100: ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:321:6: ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getBoardAccess().getUnorderedGroup(), 0);
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:324:6: ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:324:7: {...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleBoard", "true");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:324:16: ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:324:17: ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )*
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:324:17: ( (lv_name_1_0= 'Board' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:325:1: (lv_name_1_0= 'Board' )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:325:1: (lv_name_1_0= 'Board' )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:326:3: lv_name_1_0= 'Board'
            	    {
            	    lv_name_1_0=(Token)match(input,15,FOLLOW_15_in_ruleBoard713); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_name_1_0, grammarAccess.getBoardAccess().getNameBoardKeyword_0_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getBoardRule());
            	      	        }
            	             		setWithLastConsumed(current, "name", lv_name_1_0, "Board");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleBoard738); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_0_1());
            	          
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:343:1: ( (lv_fields_3_0= ruleField ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==RULE_ID) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( (LA4_2==18) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:344:1: (lv_fields_3_0= ruleField )
            	    	    {
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:344:1: (lv_fields_3_0= ruleField )
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:345:3: lv_fields_3_0= ruleField
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getBoardAccess().getFieldsFieldParserRuleCall_0_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleField_in_ruleBoard759);
            	    	    lv_fields_3_0=ruleField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getBoardRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"fields",
            	    	              		lv_fields_3_0, 
            	    	              		"Field");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoardAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:368:4: ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ) ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:368:4: ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:369:5: {...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleBoard", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:369:100: ( ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:370:6: ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getBoardAccess().getUnorderedGroup(), 1);
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:373:6: ({...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:373:7: {...}? => ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleBoard", "true");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:373:16: ( ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:373:17: ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}'
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:373:17: ( (lv_attributes_4_0= ruleAttribute ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_ID) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:374:1: (lv_attributes_4_0= ruleAttribute )
            	    	    {
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:374:1: (lv_attributes_4_0= ruleAttribute )
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:375:3: lv_attributes_4_0= ruleAttribute
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getBoardAccess().getAttributesAttributeParserRuleCall_1_0_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleAttribute_in_ruleBoard837);
            	    	    lv_attributes_4_0=ruleAttribute();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getBoardRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"attributes",
            	    	              		lv_attributes_4_0, 
            	    	              		"Attribute");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleBoard850); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_1_1());
            	          
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoardAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBoardAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleBoard", "getUnorderedGroupHelper().canLeave(grammarAccess.getBoardAccess().getUnorderedGroup())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getBoardAccess().getUnorderedGroup());

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleTokens"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:418:1: entryRuleTokens returns [EObject current=null] : iv_ruleTokens= ruleTokens EOF ;
    public final EObject entryRuleTokens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTokens = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:419:2: (iv_ruleTokens= ruleTokens EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:420:2: iv_ruleTokens= ruleTokens EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTokensRule()); 
            }
            pushFollow(FOLLOW_ruleTokens_in_entryRuleTokens932);
            iv_ruleTokens=ruleTokens();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTokens; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTokens942); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTokens"


    // $ANTLR start "ruleTokens"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:427:1: ruleTokens returns [EObject current=null] : ( ( (lv_name_0_0= 'Tokens' ) ) otherlv_1= '{' ( (lv_tokentypes_2_0= ruleTokenType ) )* otherlv_3= '}' ) ;
    public final EObject ruleTokens() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_tokentypes_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:430:28: ( ( ( (lv_name_0_0= 'Tokens' ) ) otherlv_1= '{' ( (lv_tokentypes_2_0= ruleTokenType ) )* otherlv_3= '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:431:1: ( ( (lv_name_0_0= 'Tokens' ) ) otherlv_1= '{' ( (lv_tokentypes_2_0= ruleTokenType ) )* otherlv_3= '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:431:1: ( ( (lv_name_0_0= 'Tokens' ) ) otherlv_1= '{' ( (lv_tokentypes_2_0= ruleTokenType ) )* otherlv_3= '}' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:431:2: ( (lv_name_0_0= 'Tokens' ) ) otherlv_1= '{' ( (lv_tokentypes_2_0= ruleTokenType ) )* otherlv_3= '}'
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:431:2: ( (lv_name_0_0= 'Tokens' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:432:1: (lv_name_0_0= 'Tokens' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:432:1: (lv_name_0_0= 'Tokens' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:433:3: lv_name_0_0= 'Tokens'
            {
            lv_name_0_0=(Token)match(input,16,FOLLOW_16_in_ruleTokens985); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getTokensAccess().getNameTokensKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTokensRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "Tokens");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleTokens1010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTokensAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:450:1: ( (lv_tokentypes_2_0= ruleTokenType ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:451:1: (lv_tokentypes_2_0= ruleTokenType )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:451:1: (lv_tokentypes_2_0= ruleTokenType )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:452:3: lv_tokentypes_2_0= ruleTokenType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTokensAccess().getTokentypesTokenTypeParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTokenType_in_ruleTokens1031);
            	    lv_tokentypes_2_0=ruleTokenType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTokensRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"tokentypes",
            	              		lv_tokentypes_2_0, 
            	              		"TokenType");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleTokens1044); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTokensAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTokens"


    // $ANTLR start "entryRuleTokenType"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:480:1: entryRuleTokenType returns [EObject current=null] : iv_ruleTokenType= ruleTokenType EOF ;
    public final EObject entryRuleTokenType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTokenType = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:481:2: (iv_ruleTokenType= ruleTokenType EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:482:2: iv_ruleTokenType= ruleTokenType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTokenTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTokenType_in_entryRuleTokenType1080);
            iv_ruleTokenType=ruleTokenType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTokenType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTokenType1090); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTokenType"


    // $ANTLR start "ruleTokenType"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:489:1: ruleTokenType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variables_1_0= ruleVariable ) )* (otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )? ) ;
    public final EObject ruleTokenType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:492:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variables_1_0= ruleVariable ) )* (otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )? ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:493:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variables_1_0= ruleVariable ) )* (otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )? )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:493:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variables_1_0= ruleVariable ) )* (otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )? )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:493:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_variables_1_0= ruleVariable ) )* (otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )?
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:493:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:494:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:494:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:495:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTokenType1132); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getTokenTypeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTokenTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:511:2: ( (lv_variables_1_0= ruleVariable ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==22) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:512:1: (lv_variables_1_0= ruleVariable )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:512:1: (lv_variables_1_0= ruleVariable )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:513:3: lv_variables_1_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTokenTypeAccess().getVariablesVariableParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleTokenType1158);
            	    lv_variables_1_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTokenTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variables",
            	              		lv_variables_1_0, 
            	              		"Variable");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:529:3: (otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:529:5: otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleTokenType1172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTokenTypeAccess().getLeftCurlyBracketKeyword_2_0());
                          
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:533:1: ( (lv_attributes_3_0= ruleAttribute ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:534:1: (lv_attributes_3_0= ruleAttribute )
                    	    {
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:534:1: (lv_attributes_3_0= ruleAttribute )
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:535:3: lv_attributes_3_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTokenTypeAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleTokenType1193);
                    	    lv_attributes_3_0=ruleAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTokenTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_3_0, 
                    	              		"Attribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTokenType1206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTokenTypeAccess().getRightCurlyBracketKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTokenType"


    // $ANTLR start "entryRuleAttribute"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:563:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:564:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:565:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1244);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1254); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:572:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:575:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:576:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:576:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:576:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';'
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:576:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:577:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:577:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:578:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAttribute1313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getSemicolonKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleField"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:606:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:607:2: (iv_ruleField= ruleField EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:608:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField1349);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1359); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:615:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* otherlv_10= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token otherlv_3=null;
        Token lv_y_4_0=null;
        Token otherlv_5=null;
        Token lv_z_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:618:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* otherlv_10= ';' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:619:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* otherlv_10= ';' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:619:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* otherlv_10= ';' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:619:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* otherlv_10= ';'
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:619:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:620:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:620:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:621:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1401); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleField1418); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:641:1: ( (lv_x_2_0= RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:642:1: (lv_x_2_0= RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:642:1: (lv_x_2_0= RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:643:3: lv_x_2_0= RULE_INT
            {
            lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_x_2_0, grammarAccess.getFieldAccess().getXINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"x",
                      		lv_x_2_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleField1452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getCommaKeyword_3());
                  
            }
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:663:1: ( (lv_y_4_0= RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:664:1: (lv_y_4_0= RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:664:1: (lv_y_4_0= RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:665:3: lv_y_4_0= RULE_INT
            {
            lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_y_4_0, grammarAccess.getFieldAccess().getYINTTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"y",
                      		lv_y_4_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleField1486); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getCommaKeyword_5());
                  
            }
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:685:1: ( (lv_z_6_0= RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:686:1: (lv_z_6_0= RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:686:1: (lv_z_6_0= RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:687:3: lv_z_6_0= RULE_INT
            {
            lv_z_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1503); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_z_6_0, grammarAccess.getFieldAccess().getZINTTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"z",
                      		lv_z_6_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleField1520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFieldAccess().getRightParenthesisKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleField1532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getColonKeyword_8());
                  
            }
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:711:1: ( (otherlv_9= RULE_ID ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:712:1: (otherlv_9= RULE_ID )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:712:1: (otherlv_9= RULE_ID )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:713:3: otherlv_9= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFieldRule());
            	      	        }
            	              
            	    }
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1552); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_9, grammarAccess.getFieldAccess().getNeighboursFieldCrossReference_9_0()); 
            	      	
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleField1565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getFieldAccess().getSemicolonKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleVariable"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:738:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:739:2: (iv_ruleVariable= ruleVariable EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:740:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1603);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1613); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:747:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:750:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:751:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:751:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:751:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:751:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:752:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:752:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:753:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleVariable1672); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
                  
            }
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:773:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:774:1: (lv_expression_2_0= ruleExpression )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:774:1: (lv_expression_2_0= ruleExpression )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:775:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleVariable1693);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:799:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:800:2: (iv_ruleExpression= ruleExpression EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:801:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1729);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1739); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:808:1: ruleExpression returns [EObject current=null] : this_BooleanExpression_0= ruleBooleanExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpression_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:811:28: (this_BooleanExpression_0= ruleBooleanExpression )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:813:5: this_BooleanExpression_0= ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleExpression1785);
            this_BooleanExpression_0=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBooleanExpression"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:829:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:830:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:831:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression1819);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression1829); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:838:1: ruleBooleanExpression returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:841:28: ( (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:842:1: (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:842:1: (this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:843:5: this_Comparison_0= ruleComparison ( ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBooleanExpressionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleBooleanExpression1876);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:851:1: ( ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=23 && LA13_0<=24)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:851:2: ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:851:2: ( () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:851:3: () ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:851:3: ()
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:852:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:857:2: ( ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:858:1: ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:858:1: ( (lv_op_2_1= '||' | lv_op_2_2= '&&' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:859:1: (lv_op_2_1= '||' | lv_op_2_2= '&&' )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:859:1: (lv_op_2_1= '||' | lv_op_2_2= '&&' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==23) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==24) ) {
            	        alt12=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:860:3: lv_op_2_1= '||'
            	            {
            	            lv_op_2_1=(Token)match(input,23,FOLLOW_23_in_ruleBooleanExpression1906); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getBooleanExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBooleanExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:872:8: lv_op_2_2= '&&'
            	            {
            	            lv_op_2_2=(Token)match(input,24,FOLLOW_24_in_ruleBooleanExpression1935); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getBooleanExpressionAccess().getOpAmpersandAmpersandKeyword_1_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getBooleanExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:887:3: ( (lv_right_3_0= ruleComparison ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:888:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:888:1: (lv_right_3_0= ruleComparison )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:889:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBooleanExpressionAccess().getRightComparisonParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleBooleanExpression1973);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Comparison");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleComparison"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:913:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:914:2: (iv_ruleComparison= ruleComparison EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:915:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison2011);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison2021); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:922:1: ruleComparison returns [EObject current=null] : (this_Equals_0= ruleEquals ( ( () ( (lv_op_2_0= '<' ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Equals_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:925:28: ( (this_Equals_0= ruleEquals ( ( () ( (lv_op_2_0= '<' ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:926:1: (this_Equals_0= ruleEquals ( ( () ( (lv_op_2_0= '<' ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:926:1: (this_Equals_0= ruleEquals ( ( () ( (lv_op_2_0= '<' ) ) ) ( (lv_right_3_0= ruleEquals ) ) )* )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:927:5: this_Equals_0= ruleEquals ( ( () ( (lv_op_2_0= '<' ) ) ) ( (lv_right_3_0= ruleEquals ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getEqualsParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEquals_in_ruleComparison2068);
            this_Equals_0=ruleEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Equals_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:935:1: ( ( () ( (lv_op_2_0= '<' ) ) ) ( (lv_right_3_0= ruleEquals ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:935:2: ( () ( (lv_op_2_0= '<' ) ) ) ( (lv_right_3_0= ruleEquals ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:935:2: ( () ( (lv_op_2_0= '<' ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:935:3: () ( (lv_op_2_0= '<' ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:935:3: ()
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:936:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:941:2: ( (lv_op_2_0= '<' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:942:1: (lv_op_2_0= '<' )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:942:1: (lv_op_2_0= '<' )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:943:3: lv_op_2_0= '<'
            	    {
            	    lv_op_2_0=(Token)match(input,25,FOLLOW_25_in_ruleComparison2096); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getComparisonRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "<");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:956:3: ( (lv_right_3_0= ruleEquals ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:957:1: (lv_right_3_0= ruleEquals )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:957:1: (lv_right_3_0= ruleEquals )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:958:3: lv_right_3_0= ruleEquals
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightEqualsParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEquals_in_ruleComparison2131);
            	    lv_right_3_0=ruleEquals();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Equals");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleEquals"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:982:1: entryRuleEquals returns [EObject current=null] : iv_ruleEquals= ruleEquals EOF ;
    public final EObject entryRuleEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquals = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:983:2: (iv_ruleEquals= ruleEquals EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:984:2: iv_ruleEquals= ruleEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleEquals_in_entryRuleEquals2169);
            iv_ruleEquals=ruleEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquals2179); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquals"


    // $ANTLR start "ruleEquals"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:991:1: ruleEquals returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( () ( (lv_op_2_0= '==' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) ;
    public final EObject ruleEquals() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Addition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:994:28: ( (this_Addition_0= ruleAddition ( ( () ( (lv_op_2_0= '==' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:995:1: (this_Addition_0= ruleAddition ( ( () ( (lv_op_2_0= '==' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:995:1: (this_Addition_0= ruleAddition ( ( () ( (lv_op_2_0= '==' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )* )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:996:5: this_Addition_0= ruleAddition ( ( () ( (lv_op_2_0= '==' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualsAccess().getAdditionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleEquals2226);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1004:1: ( ( () ( (lv_op_2_0= '==' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1004:2: ( () ( (lv_op_2_0= '==' ) ) ) ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1004:2: ( () ( (lv_op_2_0= '==' ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1004:3: () ( (lv_op_2_0= '==' ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1004:3: ()
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1005:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1010:2: ( (lv_op_2_0= '==' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1011:1: (lv_op_2_0= '==' )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1011:1: (lv_op_2_0= '==' )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1012:3: lv_op_2_0= '=='
            	    {
            	    lv_op_2_0=(Token)match(input,26,FOLLOW_26_in_ruleEquals2254); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getEqualsAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEqualsRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "==");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1025:3: ( (lv_right_3_0= ruleAddition ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1026:1: (lv_right_3_0= ruleAddition )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1026:1: (lv_right_3_0= ruleAddition )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1027:3: lv_right_3_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEqualsAccess().getRightAdditionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddition_in_ruleEquals2289);
            	    lv_right_3_0=ruleAddition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEqualsRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Addition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquals"


    // $ANTLR start "entryRuleAddition"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1051:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1052:2: (iv_ruleAddition= ruleAddition EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1053:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition2327);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition2337); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1060:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1063:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1064:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1064:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1065:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2384);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1073:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=27 && LA17_0<=28)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1073:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1073:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==27) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==28) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1073:3: ( () otherlv_2= '+' )
            	            {
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1073:3: ( () otherlv_2= '+' )
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1073:4: () otherlv_2= '+'
            	            {
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1073:4: ()
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1074:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleAddition2407); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1084:6: ( () otherlv_4= '-' )
            	            {
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1084:6: ( () otherlv_4= '-' )
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1084:7: () otherlv_4= '-'
            	            {
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1084:7: ()
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1085:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleAddition2436); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1094:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1095:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1095:1: (lv_right_5_0= ruleMultiplication )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1096:3: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2459);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"Multiplication");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1120:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1121:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1122:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication2497);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication2507); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1129:1: ruleMultiplication returns [EObject current=null] : (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Prefixed_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1132:28: ( (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1133:1: (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1133:1: (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1134:5: this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getPrefixedParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrefixed_in_ruleMultiplication2554);
            this_Prefixed_0=rulePrefixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Prefixed_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1142:1: ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=29 && LA19_0<=30)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1142:2: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1142:2: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1142:3: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1142:3: ()
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1143:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1148:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1149:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1149:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1150:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1150:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==29) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==30) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1151:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,29,FOLLOW_29_in_ruleMultiplication2584); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMultiplicationRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1163:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,30,FOLLOW_30_in_ruleMultiplication2613); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMultiplicationRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1178:3: ( (lv_right_3_0= rulePrefixed ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1179:1: (lv_right_3_0= rulePrefixed )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1179:1: (lv_right_3_0= rulePrefixed )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1180:3: lv_right_3_0= rulePrefixed
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrefixedParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrefixed_in_ruleMultiplication2651);
            	    lv_right_3_0=rulePrefixed();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Prefixed");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrefixed"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1204:1: entryRulePrefixed returns [EObject current=null] : iv_rulePrefixed= rulePrefixed EOF ;
    public final EObject entryRulePrefixed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixed = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1205:2: (iv_rulePrefixed= rulePrefixed EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1206:2: iv_rulePrefixed= rulePrefixed EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedRule()); 
            }
            pushFollow(FOLLOW_rulePrefixed_in_entryRulePrefixed2689);
            iv_rulePrefixed=rulePrefixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixed; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefixed2699); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixed"


    // $ANTLR start "rulePrefixed"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1213:1: rulePrefixed returns [EObject current=null] : ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrefixed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1216:28: ( ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1217:1: ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1217:1: ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt20=1;
                }
                break;
            case 28:
                {
                alt20=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 18:
            case 32:
            case 33:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1217:2: ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1217:2: ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1217:3: () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1217:3: ()
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1218:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixedAccess().getBooleanNegationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1223:2: ( ( '!' )=>otherlv_1= '!' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1223:3: ( '!' )=>otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulePrefixed2754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrefixedAccess().getExclamationMarkKeyword_0_1());
                          
                    }

                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1228:2: ( (lv_expression_2_0= ruleAtomic ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1229:1: (lv_expression_2_0= ruleAtomic )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1229:1: (lv_expression_2_0= ruleAtomic )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1230:3: lv_expression_2_0= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrefixed2776);
                    lv_expression_2_0=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixedRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"Atomic");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1247:6: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1247:6: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1247:7: () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1247:7: ()
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1248:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixedAccess().getArithmeticSignedAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1253:2: ( ( '-' )=>otherlv_4= '-' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1253:3: ( '-' )=>otherlv_4= '-'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_rulePrefixed2813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrefixedAccess().getHyphenMinusKeyword_1_1());
                          
                    }

                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1258:2: ( (lv_expression_5_0= ruleAtomic ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1259:1: (lv_expression_5_0= ruleAtomic )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1259:1: (lv_expression_5_0= ruleAtomic )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1260:3: lv_expression_5_0= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrefixed2835);
                    lv_expression_5_0=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixedRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_5_0, 
                              		"Atomic");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1278:5: this_Atomic_6= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedAccess().getAtomicParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrefixed2864);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Atomic_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixed"


    // $ANTLR start "entryRuleAtomic"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1294:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1295:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1296:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic2899);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic2909); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1303:1: ruleAtomic returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Token lv_value_8_1=null;
        Token lv_value_8_2=null;
        Token otherlv_10=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1306:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1307:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1307:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt22=1;
                }
                break;
            case RULE_INT:
                {
                alt22=2;
                }
                break;
            case RULE_STRING:
                {
                alt22=3;
                }
                break;
            case 32:
            case 33:
                {
                alt22=4;
                }
                break;
            case RULE_ID:
                {
                alt22=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1307:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1307:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1307:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleAtomic2947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAtomic2969);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAtomic2980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1325:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1325:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1325:7: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1325:7: ()
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1326:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1331:2: ( (lv_value_4_0= RULE_INT ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1332:1: (lv_value_4_0= RULE_INT )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1332:1: (lv_value_4_0= RULE_INT )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1333:3: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomic3014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_4_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1350:6: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1350:6: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1350:7: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1350:7: ()
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1351:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getStringLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1356:2: ( (lv_value_6_0= RULE_STRING ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1357:1: (lv_value_6_0= RULE_STRING )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1357:1: (lv_value_6_0= RULE_STRING )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1358:3: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic3053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_6_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_6_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1375:6: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1375:6: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1375:7: () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1375:7: ()
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1376:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getBooleanLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1381:2: ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1382:1: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1382:1: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1383:1: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1383:1: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==32) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==33) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1384:3: lv_value_8_1= 'true'
                            {
                            lv_value_8_1=(Token)match(input,32,FOLLOW_32_in_ruleAtomic3095); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_8_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAtomicRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_8_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1396:8: lv_value_8_2= 'false'
                            {
                            lv_value_8_2=(Token)match(input,33,FOLLOW_33_in_ruleAtomic3124); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_8_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_3_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAtomicRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_8_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1412:6: ( () ( (otherlv_10= RULE_ID ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1412:6: ( () ( (otherlv_10= RULE_ID ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1412:7: () ( (otherlv_10= RULE_ID ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1412:7: ()
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1413:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getVariableReferenceAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1418:2: ( (otherlv_10= RULE_ID ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1419:1: (otherlv_10= RULE_ID )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1419:1: (otherlv_10= RULE_ID )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1420:3: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                              
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic3177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_10, grammarAccess.getAtomicAccess().getRefVariableCrossReference_4_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel184 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rulePlayer_in_ruleModel210 = new BitSet(new long[]{0x000000000001C812L});
    public static final BitSet FOLLOW_ruleBoard_in_ruleModel286 = new BitSet(new long[]{0x000000000001C812L});
    public static final BitSet FOLLOW_ruleTokens_in_ruleModel361 = new BitSet(new long[]{0x000000000001C812L});
    public static final BitSet FOLLOW_rulePlayer_in_entryRulePlayer442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlayer452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePlayer495 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePlayer525 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_rulePlayer543 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulePlayer564 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_rulePlayer577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoard_in_entryRuleBoard615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoard625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBoard713 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBoard738 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_ruleField_in_ruleBoard759 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleBoard837 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleBoard850 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_ruleTokens_in_entryRuleTokens932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTokens942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTokens985 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTokens1010 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleTokenType_in_ruleTokens1031 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleTokens1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTokenType_in_entryRuleTokenType1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTokenType1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTokenType1132 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTokenType1158 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_13_in_ruleTokenType1172 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleTokenType1193 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleTokenType1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1296 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttribute1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1401 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleField1418 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1435 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleField1452 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1469 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleField1486 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1503 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleField1520 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleField1532 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1552 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleField1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1655 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleVariable1672 = new BitSet(new long[]{0x0000000390040070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariable1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleExpression1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression1819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleBooleanExpression1876 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_ruleBooleanExpression1906 = new BitSet(new long[]{0x0000000390040070L});
    public static final BitSet FOLLOW_24_in_ruleBooleanExpression1935 = new BitSet(new long[]{0x0000000390040070L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleBooleanExpression1973 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison2011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquals_in_ruleComparison2068 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleComparison2096 = new BitSet(new long[]{0x0000000390040070L});
    public static final BitSet FOLLOW_ruleEquals_in_ruleComparison2131 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleEquals_in_entryRuleEquals2169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquals2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleEquals2226 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleEquals2254 = new BitSet(new long[]{0x0000000390040070L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleEquals2289 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition2327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2384 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_27_in_ruleAddition2407 = new BitSet(new long[]{0x0000000390040070L});
    public static final BitSet FOLLOW_28_in_ruleAddition2436 = new BitSet(new long[]{0x0000000390040070L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2459 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication2497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixed_in_ruleMultiplication2554 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_29_in_ruleMultiplication2584 = new BitSet(new long[]{0x0000000390040070L});
    public static final BitSet FOLLOW_30_in_ruleMultiplication2613 = new BitSet(new long[]{0x0000000390040070L});
    public static final BitSet FOLLOW_rulePrefixed_in_ruleMultiplication2651 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_rulePrefixed_in_entryRulePrefixed2689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefixed2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePrefixed2754 = new BitSet(new long[]{0x0000000390040070L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrefixed2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePrefixed2813 = new BitSet(new long[]{0x0000000390040070L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrefixed2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrefixed2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic2899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAtomic2947 = new BitSet(new long[]{0x0000000390040070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAtomic2969 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAtomic2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomic3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAtomic3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAtomic3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic3177 = new BitSet(new long[]{0x0000000000000002L});

}
