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

@SuppressWarnings("all")
public class InternalBGLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GAME'", "'PLAYERS'", "'BOARD'", "'{'", "'}'", "'RULES'", "'TURN'", "'TOKEN'", "'('", "','", "')'", "':'", "';'", "'SPAWN'", "'MOVE'", "'SELECT'", "'FIELD'", "'WHERE'", "'OR'", "'AND'", "'!=='", "'==='", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'.'", "'+'", "'-'", "'*'", "'/'", "'='"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:76:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_player_3_0 = null;

        EObject lv_board_4_0 = null;

        EObject lv_tokens_5_0 = null;

        EObject lv_rules_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:79:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:83:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            	
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:86:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?)
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=5;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( (LA2_0==13||LA2_0==15) && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                    alt2=3;
                }
                else if ( LA2_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {
                    alt2=4;
                }


                switch (alt2) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:90:5: {...}? => ( ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:90:100: ( ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:91:6: ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:94:6: ({...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:94:7: {...}? => (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:94:16: (otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:94:18: otherlv_1= 'GAME' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleModel167); 

            	        	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getGAMEKeyword_0_0());
            	        
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:98:1: ( (lv_name_2_0= RULE_ID ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:99:1: (lv_name_2_0= RULE_ID )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:99:1: (lv_name_2_0= RULE_ID )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:100:3: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel184); 

            	    			newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_1_0()); 
            	    		

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

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:116:2: ( (lv_player_3_0= rulePlayer ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:117:1: (lv_player_3_0= rulePlayer )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:117:1: (lv_player_3_0= rulePlayer )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:118:3: lv_player_3_0= rulePlayer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPlayerPlayerParserRuleCall_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlayer_in_ruleModel210);
            	    lv_player_3_0=rulePlayer();

            	    state._fsp--;


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
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:146:16: ( (lv_board_4_0= ruleBoard ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:147:1: (lv_board_4_0= ruleBoard )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:147:1: (lv_board_4_0= ruleBoard )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:148:3: lv_board_4_0= ruleBoard
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getBoardBoardParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBoard_in_ruleModel286);
            	    lv_board_4_0=ruleBoard();

            	    state._fsp--;


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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:171:4: ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:171:4: ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:172:5: {...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:172:100: ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:173:6: ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:176:6: ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==18) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:176:7: {...}? => ( (lv_tokens_5_0= ruleToken ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:176:16: ( (lv_tokens_5_0= ruleToken ) )
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:177:1: (lv_tokens_5_0= ruleToken )
            	    	    {
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:177:1: (lv_tokens_5_0= ruleToken )
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:178:3: lv_tokens_5_0= ruleToken
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getModelAccess().getTokensTokenParserRuleCall_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleToken_in_ruleModel361);
            	    	    lv_tokens_5_0=ruleToken();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"tokens",
            	    	            		lv_tokens_5_0, 
            	    	            		"Token");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:201:4: ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:201:4: ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:202:5: {...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:202:100: ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:203:6: ({...}? => ( (lv_rules_6_0= ruleRules ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:206:6: ({...}? => ( (lv_rules_6_0= ruleRules ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:206:7: {...}? => ( (lv_rules_6_0= ruleRules ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:206:16: ( (lv_rules_6_0= ruleRules ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:207:1: (lv_rules_6_0= ruleRules )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:207:1: (lv_rules_6_0= ruleRules )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:208:3: lv_rules_6_0= ruleRules
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getRulesRulesParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRules_in_ruleModel437);
            	    lv_rules_6_0=ruleRules();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rules",
            	            		lv_rules_6_0, 
            	            		"Rules");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup());
            	

            }


            }

             leaveRule(); 
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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:247:1: entryRulePlayer returns [EObject current=null] : iv_rulePlayer= rulePlayer EOF ;
    public final EObject entryRulePlayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayer = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:248:2: (iv_rulePlayer= rulePlayer EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:249:2: iv_rulePlayer= rulePlayer EOF
            {
             newCompositeNode(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_rulePlayer_in_entryRulePlayer518);
            iv_rulePlayer=rulePlayer();

            state._fsp--;

             current =iv_rulePlayer; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlayer528); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:256:1: rulePlayer returns [EObject current=null] : ( ( (lv_name_0_0= 'PLAYERS' ) ) ( (lv_playercount_1_0= RULE_INT ) ) ) ;
    public final EObject rulePlayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_playercount_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:259:28: ( ( ( (lv_name_0_0= 'PLAYERS' ) ) ( (lv_playercount_1_0= RULE_INT ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:260:1: ( ( (lv_name_0_0= 'PLAYERS' ) ) ( (lv_playercount_1_0= RULE_INT ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:260:1: ( ( (lv_name_0_0= 'PLAYERS' ) ) ( (lv_playercount_1_0= RULE_INT ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:260:2: ( (lv_name_0_0= 'PLAYERS' ) ) ( (lv_playercount_1_0= RULE_INT ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:260:2: ( (lv_name_0_0= 'PLAYERS' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:261:1: (lv_name_0_0= 'PLAYERS' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:261:1: (lv_name_0_0= 'PLAYERS' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:262:3: lv_name_0_0= 'PLAYERS'
            {
            lv_name_0_0=(Token)match(input,12,FOLLOW_12_in_rulePlayer571); 

                    newLeafNode(lv_name_0_0, grammarAccess.getPlayerAccess().getNamePLAYERSKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlayerRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "PLAYERS");
            	    

            }


            }

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:275:2: ( (lv_playercount_1_0= RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:276:1: (lv_playercount_1_0= RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:276:1: (lv_playercount_1_0= RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:277:3: lv_playercount_1_0= RULE_INT
            {
            lv_playercount_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePlayer601); 

            			newLeafNode(lv_playercount_1_0, grammarAccess.getPlayerAccess().getPlayercountINTTerminalRuleCall_1_0()); 
            		

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


            }

             leaveRule(); 
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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:301:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:302:2: (iv_ruleBoard= ruleBoard EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:303:2: iv_ruleBoard= ruleBoard EOF
            {
             newCompositeNode(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_ruleBoard_in_entryRuleBoard642);
            iv_ruleBoard=ruleBoard();

            state._fsp--;

             current =iv_ruleBoard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoard652); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:310:1: ruleBoard returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:313:28: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:314:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:314:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '}' ) ) ) ) )+ {...}?) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:316:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '}' ) ) ) ) )+ {...}?) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:316:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '}' ) ) ) ) )+ {...}?) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:317:2: ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '}' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBoardAccess().getUnorderedGroup());
            	
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:320:2: ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '}' ) ) ) ) )+ {...}?)
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:321:3: ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '}' ) ) ) ) )+ {...}?
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:321:3: ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '}' ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    int LA4_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==15) ) {
                    int LA4_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1) ) {
                        alt4=2;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:323:4: ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:323:4: ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:324:5: {...}? => ( ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBoard", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:324:100: ( ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:325:6: ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoardAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:328:6: ({...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:328:7: {...}? => ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoard", "true");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:328:16: ( ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:328:17: ( (lv_name_1_0= 'BOARD' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )*
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:328:17: ( (lv_name_1_0= 'BOARD' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:329:1: (lv_name_1_0= 'BOARD' )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:329:1: (lv_name_1_0= 'BOARD' )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:330:3: lv_name_1_0= 'BOARD'
            	    {
            	    lv_name_1_0=(Token)match(input,13,FOLLOW_13_in_ruleBoard740); 

            	            newLeafNode(lv_name_1_0, grammarAccess.getBoardAccess().getNameBOARDKeyword_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getBoardRule());
            	    	        }
            	           		setWithLastConsumed(current, "name", lv_name_1_0, "BOARD");
            	    	    

            	    }


            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleBoard765); 

            	        	newLeafNode(otherlv_2, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_0_1());
            	        
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:347:1: ( (lv_fields_3_0= ruleField ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==RULE_ID) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:348:1: (lv_fields_3_0= ruleField )
            	    	    {
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:348:1: (lv_fields_3_0= ruleField )
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:349:3: lv_fields_3_0= ruleField
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getBoardAccess().getFieldsFieldParserRuleCall_0_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleField_in_ruleBoard786);
            	    	    lv_fields_3_0=ruleField();

            	    	    state._fsp--;


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
            	    	    break;

            	    	default :
            	    	    break loop3;
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
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:372:4: ({...}? => ( ({...}? => (otherlv_4= '}' ) ) ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:372:4: ({...}? => ( ({...}? => (otherlv_4= '}' ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:373:5: {...}? => ( ({...}? => (otherlv_4= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBoard", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:373:100: ( ({...}? => (otherlv_4= '}' ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:374:6: ({...}? => (otherlv_4= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoardAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:377:6: ({...}? => (otherlv_4= '}' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:377:7: {...}? => (otherlv_4= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoard", "true");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:377:16: (otherlv_4= '}' )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:377:18: otherlv_4= '}'
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleBoard855); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoardAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBoardAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleBoard", "getUnorderedGroupHelper().canLeave(grammarAccess.getBoardAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getBoardAccess().getUnorderedGroup());
            	

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleRules"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:404:1: entryRuleRules returns [EObject current=null] : iv_ruleRules= ruleRules EOF ;
    public final EObject entryRuleRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRules = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:405:2: (iv_ruleRules= ruleRules EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:406:2: iv_ruleRules= ruleRules EOF
            {
             newCompositeNode(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_ruleRules_in_entryRuleRules937);
            iv_ruleRules=ruleRules();

            state._fsp--;

             current =iv_ruleRules; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRules947); 

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
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:413:1: ruleRules returns [EObject current=null] : ( ( (lv_name_0_0= 'RULES' ) ) otherlv_1= '{' ( (lv_turnrules_2_0= ruleTurnRules ) ) otherlv_3= '}' ) ;
    public final EObject ruleRules() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_turnrules_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:416:28: ( ( ( (lv_name_0_0= 'RULES' ) ) otherlv_1= '{' ( (lv_turnrules_2_0= ruleTurnRules ) ) otherlv_3= '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:417:1: ( ( (lv_name_0_0= 'RULES' ) ) otherlv_1= '{' ( (lv_turnrules_2_0= ruleTurnRules ) ) otherlv_3= '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:417:1: ( ( (lv_name_0_0= 'RULES' ) ) otherlv_1= '{' ( (lv_turnrules_2_0= ruleTurnRules ) ) otherlv_3= '}' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:417:2: ( (lv_name_0_0= 'RULES' ) ) otherlv_1= '{' ( (lv_turnrules_2_0= ruleTurnRules ) ) otherlv_3= '}'
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:417:2: ( (lv_name_0_0= 'RULES' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:418:1: (lv_name_0_0= 'RULES' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:418:1: (lv_name_0_0= 'RULES' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:419:3: lv_name_0_0= 'RULES'
            {
            lv_name_0_0=(Token)match(input,16,FOLLOW_16_in_ruleRules990); 

                    newLeafNode(lv_name_0_0, grammarAccess.getRulesAccess().getNameRULESKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRulesRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "RULES");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleRules1015); 

                	newLeafNode(otherlv_1, grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_1());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:436:1: ( (lv_turnrules_2_0= ruleTurnRules ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:437:1: (lv_turnrules_2_0= ruleTurnRules )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:437:1: (lv_turnrules_2_0= ruleTurnRules )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:438:3: lv_turnrules_2_0= ruleTurnRules
            {
             
            	        newCompositeNode(grammarAccess.getRulesAccess().getTurnrulesTurnRulesParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTurnRules_in_ruleRules1036);
            lv_turnrules_2_0=ruleTurnRules();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRulesRule());
            	        }
                   		set(
                   			current, 
                   			"turnrules",
                    		lv_turnrules_2_0, 
                    		"TurnRules");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleRules1048); 

                	newLeafNode(otherlv_3, grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleTurnRules"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:466:1: entryRuleTurnRules returns [EObject current=null] : iv_ruleTurnRules= ruleTurnRules EOF ;
    public final EObject entryRuleTurnRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnRules = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:467:2: (iv_ruleTurnRules= ruleTurnRules EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:468:2: iv_ruleTurnRules= ruleTurnRules EOF
            {
             newCompositeNode(grammarAccess.getTurnRulesRule()); 
            pushFollow(FOLLOW_ruleTurnRules_in_entryRuleTurnRules1084);
            iv_ruleTurnRules=ruleTurnRules();

            state._fsp--;

             current =iv_ruleTurnRules; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnRules1094); 

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
    // $ANTLR end "entryRuleTurnRules"


    // $ANTLR start "ruleTurnRules"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:475:1: ruleTurnRules returns [EObject current=null] : ( ( (lv_name_0_0= 'TURN' ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' ) ;
    public final EObject ruleTurnRules() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:478:28: ( ( ( (lv_name_0_0= 'TURN' ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:479:1: ( ( (lv_name_0_0= 'TURN' ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:479:1: ( ( (lv_name_0_0= 'TURN' ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:479:2: ( (lv_name_0_0= 'TURN' ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}'
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:479:2: ( (lv_name_0_0= 'TURN' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:480:1: (lv_name_0_0= 'TURN' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:480:1: (lv_name_0_0= 'TURN' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:481:3: lv_name_0_0= 'TURN'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_17_in_ruleTurnRules1137); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTurnRulesAccess().getNameTURNKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTurnRulesRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "TURN");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleTurnRules1162); 

                	newLeafNode(otherlv_1, grammarAccess.getTurnRulesAccess().getLeftCurlyBracketKeyword_1());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:498:1: ( (lv_actions_2_0= ruleAction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=24 && LA5_0<=26)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:499:1: (lv_actions_2_0= ruleAction )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:499:1: (lv_actions_2_0= ruleAction )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:500:3: lv_actions_2_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTurnRulesAccess().getActionsActionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleTurnRules1183);
            	    lv_actions_2_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTurnRulesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_2_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleTurnRules1196); 

                	newLeafNode(otherlv_3, grammarAccess.getTurnRulesAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurnRules"


    // $ANTLR start "entryRuleToken"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:528:1: entryRuleToken returns [EObject current=null] : iv_ruleToken= ruleToken EOF ;
    public final EObject entryRuleToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToken = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:529:2: (iv_ruleToken= ruleToken EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:530:2: iv_ruleToken= ruleToken EOF
            {
             newCompositeNode(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_ruleToken_in_entryRuleToken1232);
            iv_ruleToken=ruleToken();

            state._fsp--;

             current =iv_ruleToken; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToken1242); 

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
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:537:1: ruleToken returns [EObject current=null] : (otherlv_0= 'TOKEN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:540:28: ( (otherlv_0= 'TOKEN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:541:1: (otherlv_0= 'TOKEN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:541:1: (otherlv_0= 'TOKEN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:541:3: otherlv_0= 'TOKEN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleToken1279); 

                	newLeafNode(otherlv_0, grammarAccess.getTokenAccess().getTOKENKeyword_0());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:545:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:546:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:546:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:547:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleToken1296); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTokenAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTokenRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleToken1313); 

                	newLeafNode(otherlv_2, grammarAccess.getTokenAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleToken1325); 

                	newLeafNode(otherlv_3, grammarAccess.getTokenAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleField"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:579:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:580:2: (iv_ruleField= ruleField EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:581:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1361);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1371); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:588:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* otherlv_10= ';' ) ;
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
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:591:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* otherlv_10= ';' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:592:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* otherlv_10= ';' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:592:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* otherlv_10= ';' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:592:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* otherlv_10= ';'
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:592:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:593:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:593:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:594:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1413); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            		

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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleField1430); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getLeftParenthesisKeyword_1());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:614:1: ( (lv_x_2_0= RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:615:1: (lv_x_2_0= RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:615:1: (lv_x_2_0= RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:616:3: lv_x_2_0= RULE_INT
            {
            lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1447); 

            			newLeafNode(lv_x_2_0, grammarAccess.getFieldAccess().getXINTTerminalRuleCall_2_0()); 
            		

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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleField1464); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getCommaKeyword_3());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:636:1: ( (lv_y_4_0= RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:637:1: (lv_y_4_0= RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:637:1: (lv_y_4_0= RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:638:3: lv_y_4_0= RULE_INT
            {
            lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1481); 

            			newLeafNode(lv_y_4_0, grammarAccess.getFieldAccess().getYINTTerminalRuleCall_4_0()); 
            		

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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleField1498); 

                	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getCommaKeyword_5());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:658:1: ( (lv_z_6_0= RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:659:1: (lv_z_6_0= RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:659:1: (lv_z_6_0= RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:660:3: lv_z_6_0= RULE_INT
            {
            lv_z_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1515); 

            			newLeafNode(lv_z_6_0, grammarAccess.getFieldAccess().getZINTTerminalRuleCall_6_0()); 
            		

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleField1532); 

                	newLeafNode(otherlv_7, grammarAccess.getFieldAccess().getRightParenthesisKeyword_7());
                
            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleField1544); 

                	newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getColonKeyword_8());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:684:1: ( (otherlv_9= RULE_ID ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:685:1: (otherlv_9= RULE_ID )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:685:1: (otherlv_9= RULE_ID )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:686:3: otherlv_9= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFieldRule());
            	    	        }
            	            
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1564); 

            	    		newLeafNode(otherlv_9, grammarAccess.getFieldAccess().getNeighboursFieldCrossReference_9_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleField1577); 

                	newLeafNode(otherlv_10, grammarAccess.getFieldAccess().getSemicolonKeyword_10());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleAction"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:709:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:710:2: (iv_ruleAction= ruleAction EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:711:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1613);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1623); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:718:1: ruleAction returns [EObject current=null] : ( ( ( (lv_name_0_0= 'SPAWN' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_name_2_0= 'MOVE' ) ) | ( ( (lv_name_3_0= 'SELECT' ) ) ( ( (lv_objectOfSelect_4_1= 'TOKEN' | lv_objectOfSelect_4_2= 'FIELD' ) ) ) otherlv_5= 'WHERE' ( (lv_filter_6_0= ruleOrExp ) ) ) | ( (lv_assignment_7_0= ruleValueAssignment ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_objectOfSelect_4_1=null;
        Token lv_objectOfSelect_4_2=null;
        Token otherlv_5=null;
        EObject lv_filter_6_0 = null;

        EObject lv_assignment_7_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:721:28: ( ( ( ( (lv_name_0_0= 'SPAWN' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_name_2_0= 'MOVE' ) ) | ( ( (lv_name_3_0= 'SELECT' ) ) ( ( (lv_objectOfSelect_4_1= 'TOKEN' | lv_objectOfSelect_4_2= 'FIELD' ) ) ) otherlv_5= 'WHERE' ( (lv_filter_6_0= ruleOrExp ) ) ) | ( (lv_assignment_7_0= ruleValueAssignment ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:722:1: ( ( ( (lv_name_0_0= 'SPAWN' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_name_2_0= 'MOVE' ) ) | ( ( (lv_name_3_0= 'SELECT' ) ) ( ( (lv_objectOfSelect_4_1= 'TOKEN' | lv_objectOfSelect_4_2= 'FIELD' ) ) ) otherlv_5= 'WHERE' ( (lv_filter_6_0= ruleOrExp ) ) ) | ( (lv_assignment_7_0= ruleValueAssignment ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:722:1: ( ( ( (lv_name_0_0= 'SPAWN' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_name_2_0= 'MOVE' ) ) | ( ( (lv_name_3_0= 'SELECT' ) ) ( ( (lv_objectOfSelect_4_1= 'TOKEN' | lv_objectOfSelect_4_2= 'FIELD' ) ) ) otherlv_5= 'WHERE' ( (lv_filter_6_0= ruleOrExp ) ) ) | ( (lv_assignment_7_0= ruleValueAssignment ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:722:2: ( ( (lv_name_0_0= 'SPAWN' ) ) ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:722:2: ( ( (lv_name_0_0= 'SPAWN' ) ) ( (otherlv_1= RULE_ID ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:722:3: ( (lv_name_0_0= 'SPAWN' ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:722:3: ( (lv_name_0_0= 'SPAWN' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:723:1: (lv_name_0_0= 'SPAWN' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:723:1: (lv_name_0_0= 'SPAWN' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:724:3: lv_name_0_0= 'SPAWN'
                    {
                    lv_name_0_0=(Token)match(input,24,FOLLOW_24_in_ruleAction1667); 

                            newLeafNode(lv_name_0_0, grammarAccess.getActionAccess().getNameSPAWNKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "SPAWN");
                    	    

                    }


                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:737:2: ( (otherlv_1= RULE_ID ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:738:1: (otherlv_1= RULE_ID )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:738:1: (otherlv_1= RULE_ID )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:739:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction1700); 

                    		newLeafNode(otherlv_1, grammarAccess.getActionAccess().getTokenTokenCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:751:6: ( (lv_name_2_0= 'MOVE' ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:751:6: ( (lv_name_2_0= 'MOVE' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:752:1: (lv_name_2_0= 'MOVE' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:752:1: (lv_name_2_0= 'MOVE' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:753:3: lv_name_2_0= 'MOVE'
                    {
                    lv_name_2_0=(Token)match(input,25,FOLLOW_25_in_ruleAction1725); 

                            newLeafNode(lv_name_2_0, grammarAccess.getActionAccess().getNameMOVEKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_2_0, "MOVE");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:767:6: ( ( (lv_name_3_0= 'SELECT' ) ) ( ( (lv_objectOfSelect_4_1= 'TOKEN' | lv_objectOfSelect_4_2= 'FIELD' ) ) ) otherlv_5= 'WHERE' ( (lv_filter_6_0= ruleOrExp ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:767:6: ( ( (lv_name_3_0= 'SELECT' ) ) ( ( (lv_objectOfSelect_4_1= 'TOKEN' | lv_objectOfSelect_4_2= 'FIELD' ) ) ) otherlv_5= 'WHERE' ( (lv_filter_6_0= ruleOrExp ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:767:7: ( (lv_name_3_0= 'SELECT' ) ) ( ( (lv_objectOfSelect_4_1= 'TOKEN' | lv_objectOfSelect_4_2= 'FIELD' ) ) ) otherlv_5= 'WHERE' ( (lv_filter_6_0= ruleOrExp ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:767:7: ( (lv_name_3_0= 'SELECT' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:768:1: (lv_name_3_0= 'SELECT' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:768:1: (lv_name_3_0= 'SELECT' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:769:3: lv_name_3_0= 'SELECT'
                    {
                    lv_name_3_0=(Token)match(input,26,FOLLOW_26_in_ruleAction1763); 

                            newLeafNode(lv_name_3_0, grammarAccess.getActionAccess().getNameSELECTKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "SELECT");
                    	    

                    }


                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:782:2: ( ( (lv_objectOfSelect_4_1= 'TOKEN' | lv_objectOfSelect_4_2= 'FIELD' ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:783:1: ( (lv_objectOfSelect_4_1= 'TOKEN' | lv_objectOfSelect_4_2= 'FIELD' ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:783:1: ( (lv_objectOfSelect_4_1= 'TOKEN' | lv_objectOfSelect_4_2= 'FIELD' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:784:1: (lv_objectOfSelect_4_1= 'TOKEN' | lv_objectOfSelect_4_2= 'FIELD' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:784:1: (lv_objectOfSelect_4_1= 'TOKEN' | lv_objectOfSelect_4_2= 'FIELD' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==18) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==27) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:785:3: lv_objectOfSelect_4_1= 'TOKEN'
                            {
                            lv_objectOfSelect_4_1=(Token)match(input,18,FOLLOW_18_in_ruleAction1796); 

                                    newLeafNode(lv_objectOfSelect_4_1, grammarAccess.getActionAccess().getObjectOfSelectTOKENKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActionRule());
                            	        }
                                   		setWithLastConsumed(current, "objectOfSelect", lv_objectOfSelect_4_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:797:8: lv_objectOfSelect_4_2= 'FIELD'
                            {
                            lv_objectOfSelect_4_2=(Token)match(input,27,FOLLOW_27_in_ruleAction1825); 

                                    newLeafNode(lv_objectOfSelect_4_2, grammarAccess.getActionAccess().getObjectOfSelectFIELDKeyword_2_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActionRule());
                            	        }
                                   		setWithLastConsumed(current, "objectOfSelect", lv_objectOfSelect_4_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleAction1853); 

                        	newLeafNode(otherlv_5, grammarAccess.getActionAccess().getWHEREKeyword_2_2());
                        
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:816:1: ( (lv_filter_6_0= ruleOrExp ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:817:1: (lv_filter_6_0= ruleOrExp )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:817:1: (lv_filter_6_0= ruleOrExp )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:818:3: lv_filter_6_0= ruleOrExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getFilterOrExpParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExp_in_ruleAction1874);
                    lv_filter_6_0=ruleOrExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"filter",
                            		lv_filter_6_0, 
                            		"OrExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:835:6: ( (lv_assignment_7_0= ruleValueAssignment ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:835:6: ( (lv_assignment_7_0= ruleValueAssignment ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:836:1: (lv_assignment_7_0= ruleValueAssignment )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:836:1: (lv_assignment_7_0= ruleValueAssignment )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:837:3: lv_assignment_7_0= ruleValueAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getAssignmentValueAssignmentParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueAssignment_in_ruleAction1902);
                    lv_assignment_7_0=ruleValueAssignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"assignment",
                            		lv_assignment_7_0, 
                            		"ValueAssignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleOrExp"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:861:1: entryRuleOrExp returns [EObject current=null] : iv_ruleOrExp= ruleOrExp EOF ;
    public final EObject entryRuleOrExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExp = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:862:2: (iv_ruleOrExp= ruleOrExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:863:2: iv_ruleOrExp= ruleOrExp EOF
            {
             newCompositeNode(grammarAccess.getOrExpRule()); 
            pushFollow(FOLLOW_ruleOrExp_in_entryRuleOrExp1938);
            iv_ruleOrExp=ruleOrExp();

            state._fsp--;

             current =iv_ruleOrExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExp1948); 

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
    // $ANTLR end "entryRuleOrExp"


    // $ANTLR start "ruleOrExp"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:870:1: ruleOrExp returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleAndExp ) ) ( ( (lv_operators_1_0= 'OR' ) ) ( (lv_expressions_2_0= ruleAndExp ) ) )* ) ;
    public final EObject ruleOrExp() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:873:28: ( ( ( (lv_expressions_0_0= ruleAndExp ) ) ( ( (lv_operators_1_0= 'OR' ) ) ( (lv_expressions_2_0= ruleAndExp ) ) )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:874:1: ( ( (lv_expressions_0_0= ruleAndExp ) ) ( ( (lv_operators_1_0= 'OR' ) ) ( (lv_expressions_2_0= ruleAndExp ) ) )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:874:1: ( ( (lv_expressions_0_0= ruleAndExp ) ) ( ( (lv_operators_1_0= 'OR' ) ) ( (lv_expressions_2_0= ruleAndExp ) ) )* )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:874:2: ( (lv_expressions_0_0= ruleAndExp ) ) ( ( (lv_operators_1_0= 'OR' ) ) ( (lv_expressions_2_0= ruleAndExp ) ) )*
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:874:2: ( (lv_expressions_0_0= ruleAndExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:875:1: (lv_expressions_0_0= ruleAndExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:875:1: (lv_expressions_0_0= ruleAndExp )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:876:3: lv_expressions_0_0= ruleAndExp
            {
             
            	        newCompositeNode(grammarAccess.getOrExpAccess().getExpressionsAndExpParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAndExp_in_ruleOrExp1994);
            lv_expressions_0_0=ruleAndExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrExpRule());
            	        }
                   		add(
                   			current, 
                   			"expressions",
                    		lv_expressions_0_0, 
                    		"AndExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:892:2: ( ( (lv_operators_1_0= 'OR' ) ) ( (lv_expressions_2_0= ruleAndExp ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:892:3: ( (lv_operators_1_0= 'OR' ) ) ( (lv_expressions_2_0= ruleAndExp ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:892:3: ( (lv_operators_1_0= 'OR' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:893:1: (lv_operators_1_0= 'OR' )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:893:1: (lv_operators_1_0= 'OR' )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:894:3: lv_operators_1_0= 'OR'
            	    {
            	    lv_operators_1_0=(Token)match(input,29,FOLLOW_29_in_ruleOrExp2013); 

            	            newLeafNode(lv_operators_1_0, grammarAccess.getOrExpAccess().getOperatorsORKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOrExpRule());
            	    	        }
            	           		addWithLastConsumed(current, "operators", lv_operators_1_0, "OR");
            	    	    

            	    }


            	    }

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:907:2: ( (lv_expressions_2_0= ruleAndExp ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:908:1: (lv_expressions_2_0= ruleAndExp )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:908:1: (lv_expressions_2_0= ruleAndExp )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:909:3: lv_expressions_2_0= ruleAndExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpAccess().getExpressionsAndExpParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExp_in_ruleOrExp2047);
            	    lv_expressions_2_0=ruleAndExp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExpRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_2_0, 
            	            		"AndExp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExp"


    // $ANTLR start "entryRuleAndExp"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:933:1: entryRuleAndExp returns [EObject current=null] : iv_ruleAndExp= ruleAndExp EOF ;
    public final EObject entryRuleAndExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExp = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:934:2: (iv_ruleAndExp= ruleAndExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:935:2: iv_ruleAndExp= ruleAndExp EOF
            {
             newCompositeNode(grammarAccess.getAndExpRule()); 
            pushFollow(FOLLOW_ruleAndExp_in_entryRuleAndExp2085);
            iv_ruleAndExp=ruleAndExp();

            state._fsp--;

             current =iv_ruleAndExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExp2095); 

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
    // $ANTLR end "entryRuleAndExp"


    // $ANTLR start "ruleAndExp"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:942:1: ruleAndExp returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleBooleanExp ) ) ( ( (lv_operators_1_0= 'AND' ) ) ( (lv_expressions_2_0= ruleBooleanExp ) ) )* ) ;
    public final EObject ruleAndExp() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:945:28: ( ( ( (lv_expressions_0_0= ruleBooleanExp ) ) ( ( (lv_operators_1_0= 'AND' ) ) ( (lv_expressions_2_0= ruleBooleanExp ) ) )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:946:1: ( ( (lv_expressions_0_0= ruleBooleanExp ) ) ( ( (lv_operators_1_0= 'AND' ) ) ( (lv_expressions_2_0= ruleBooleanExp ) ) )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:946:1: ( ( (lv_expressions_0_0= ruleBooleanExp ) ) ( ( (lv_operators_1_0= 'AND' ) ) ( (lv_expressions_2_0= ruleBooleanExp ) ) )* )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:946:2: ( (lv_expressions_0_0= ruleBooleanExp ) ) ( ( (lv_operators_1_0= 'AND' ) ) ( (lv_expressions_2_0= ruleBooleanExp ) ) )*
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:946:2: ( (lv_expressions_0_0= ruleBooleanExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:947:1: (lv_expressions_0_0= ruleBooleanExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:947:1: (lv_expressions_0_0= ruleBooleanExp )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:948:3: lv_expressions_0_0= ruleBooleanExp
            {
             
            	        newCompositeNode(grammarAccess.getAndExpAccess().getExpressionsBooleanExpParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanExp_in_ruleAndExp2141);
            lv_expressions_0_0=ruleBooleanExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndExpRule());
            	        }
                   		add(
                   			current, 
                   			"expressions",
                    		lv_expressions_0_0, 
                    		"BooleanExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:964:2: ( ( (lv_operators_1_0= 'AND' ) ) ( (lv_expressions_2_0= ruleBooleanExp ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:964:3: ( (lv_operators_1_0= 'AND' ) ) ( (lv_expressions_2_0= ruleBooleanExp ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:964:3: ( (lv_operators_1_0= 'AND' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:965:1: (lv_operators_1_0= 'AND' )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:965:1: (lv_operators_1_0= 'AND' )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:966:3: lv_operators_1_0= 'AND'
            	    {
            	    lv_operators_1_0=(Token)match(input,30,FOLLOW_30_in_ruleAndExp2160); 

            	            newLeafNode(lv_operators_1_0, grammarAccess.getAndExpAccess().getOperatorsANDKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndExpRule());
            	    	        }
            	           		addWithLastConsumed(current, "operators", lv_operators_1_0, "AND");
            	    	    

            	    }


            	    }

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:979:2: ( (lv_expressions_2_0= ruleBooleanExp ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:980:1: (lv_expressions_2_0= ruleBooleanExp )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:980:1: (lv_expressions_2_0= ruleBooleanExp )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:981:3: lv_expressions_2_0= ruleBooleanExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpAccess().getExpressionsBooleanExpParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanExp_in_ruleAndExp2194);
            	    lv_expressions_2_0=ruleBooleanExp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExpRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_2_0, 
            	            		"BooleanExp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExp"


    // $ANTLR start "entryRuleBooleanExp"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1005:1: entryRuleBooleanExp returns [EObject current=null] : iv_ruleBooleanExp= ruleBooleanExp EOF ;
    public final EObject entryRuleBooleanExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExp = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1006:2: (iv_ruleBooleanExp= ruleBooleanExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1007:2: iv_ruleBooleanExp= ruleBooleanExp EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpRule()); 
            pushFollow(FOLLOW_ruleBooleanExp_in_entryRuleBooleanExp2232);
            iv_ruleBooleanExp=ruleBooleanExp();

            state._fsp--;

             current =iv_ruleBooleanExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExp2242); 

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
    // $ANTLR end "entryRuleBooleanExp"


    // $ANTLR start "ruleBooleanExp"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1014:1: ruleBooleanExp returns [EObject current=null] : ( ( ( (lv_left_0_0= ruleAttributeOrInt ) ) ( ( (lv_operator_1_1= '!==' | lv_operator_1_2= '===' | lv_operator_1_3= '==' | lv_operator_1_4= '!=' | lv_operator_1_5= '>' | lv_operator_1_6= '>=' | lv_operator_1_7= '<' | lv_operator_1_8= '<=' ) ) ) ( (lv_right_2_0= ruleAttributeOrInt ) ) ) | (otherlv_3= '(' ( (lv_nestedExp_4_0= ruleOrExp ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleBooleanExp() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        Token lv_operator_1_3=null;
        Token lv_operator_1_4=null;
        Token lv_operator_1_5=null;
        Token lv_operator_1_6=null;
        Token lv_operator_1_7=null;
        Token lv_operator_1_8=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_nestedExp_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1017:28: ( ( ( ( (lv_left_0_0= ruleAttributeOrInt ) ) ( ( (lv_operator_1_1= '!==' | lv_operator_1_2= '===' | lv_operator_1_3= '==' | lv_operator_1_4= '!=' | lv_operator_1_5= '>' | lv_operator_1_6= '>=' | lv_operator_1_7= '<' | lv_operator_1_8= '<=' ) ) ) ( (lv_right_2_0= ruleAttributeOrInt ) ) ) | (otherlv_3= '(' ( (lv_nestedExp_4_0= ruleOrExp ) ) otherlv_5= ')' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1018:1: ( ( ( (lv_left_0_0= ruleAttributeOrInt ) ) ( ( (lv_operator_1_1= '!==' | lv_operator_1_2= '===' | lv_operator_1_3= '==' | lv_operator_1_4= '!=' | lv_operator_1_5= '>' | lv_operator_1_6= '>=' | lv_operator_1_7= '<' | lv_operator_1_8= '<=' ) ) ) ( (lv_right_2_0= ruleAttributeOrInt ) ) ) | (otherlv_3= '(' ( (lv_nestedExp_4_0= ruleOrExp ) ) otherlv_5= ')' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1018:1: ( ( ( (lv_left_0_0= ruleAttributeOrInt ) ) ( ( (lv_operator_1_1= '!==' | lv_operator_1_2= '===' | lv_operator_1_3= '==' | lv_operator_1_4= '!=' | lv_operator_1_5= '>' | lv_operator_1_6= '>=' | lv_operator_1_7= '<' | lv_operator_1_8= '<=' ) ) ) ( (lv_right_2_0= ruleAttributeOrInt ) ) ) | (otherlv_3= '(' ( (lv_nestedExp_4_0= ruleOrExp ) ) otherlv_5= ')' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_INT)) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1018:2: ( ( (lv_left_0_0= ruleAttributeOrInt ) ) ( ( (lv_operator_1_1= '!==' | lv_operator_1_2= '===' | lv_operator_1_3= '==' | lv_operator_1_4= '!=' | lv_operator_1_5= '>' | lv_operator_1_6= '>=' | lv_operator_1_7= '<' | lv_operator_1_8= '<=' ) ) ) ( (lv_right_2_0= ruleAttributeOrInt ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1018:2: ( ( (lv_left_0_0= ruleAttributeOrInt ) ) ( ( (lv_operator_1_1= '!==' | lv_operator_1_2= '===' | lv_operator_1_3= '==' | lv_operator_1_4= '!=' | lv_operator_1_5= '>' | lv_operator_1_6= '>=' | lv_operator_1_7= '<' | lv_operator_1_8= '<=' ) ) ) ( (lv_right_2_0= ruleAttributeOrInt ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1018:3: ( (lv_left_0_0= ruleAttributeOrInt ) ) ( ( (lv_operator_1_1= '!==' | lv_operator_1_2= '===' | lv_operator_1_3= '==' | lv_operator_1_4= '!=' | lv_operator_1_5= '>' | lv_operator_1_6= '>=' | lv_operator_1_7= '<' | lv_operator_1_8= '<=' ) ) ) ( (lv_right_2_0= ruleAttributeOrInt ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1018:3: ( (lv_left_0_0= ruleAttributeOrInt ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1019:1: (lv_left_0_0= ruleAttributeOrInt )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1019:1: (lv_left_0_0= ruleAttributeOrInt )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1020:3: lv_left_0_0= ruleAttributeOrInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanExpAccess().getLeftAttributeOrIntParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeOrInt_in_ruleBooleanExp2289);
                    lv_left_0_0=ruleAttributeOrInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanExpRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_0_0, 
                            		"AttributeOrInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1036:2: ( ( (lv_operator_1_1= '!==' | lv_operator_1_2= '===' | lv_operator_1_3= '==' | lv_operator_1_4= '!=' | lv_operator_1_5= '>' | lv_operator_1_6= '>=' | lv_operator_1_7= '<' | lv_operator_1_8= '<=' ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1037:1: ( (lv_operator_1_1= '!==' | lv_operator_1_2= '===' | lv_operator_1_3= '==' | lv_operator_1_4= '!=' | lv_operator_1_5= '>' | lv_operator_1_6= '>=' | lv_operator_1_7= '<' | lv_operator_1_8= '<=' ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1037:1: ( (lv_operator_1_1= '!==' | lv_operator_1_2= '===' | lv_operator_1_3= '==' | lv_operator_1_4= '!=' | lv_operator_1_5= '>' | lv_operator_1_6= '>=' | lv_operator_1_7= '<' | lv_operator_1_8= '<=' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1038:1: (lv_operator_1_1= '!==' | lv_operator_1_2= '===' | lv_operator_1_3= '==' | lv_operator_1_4= '!=' | lv_operator_1_5= '>' | lv_operator_1_6= '>=' | lv_operator_1_7= '<' | lv_operator_1_8= '<=' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1038:1: (lv_operator_1_1= '!==' | lv_operator_1_2= '===' | lv_operator_1_3= '==' | lv_operator_1_4= '!=' | lv_operator_1_5= '>' | lv_operator_1_6= '>=' | lv_operator_1_7= '<' | lv_operator_1_8= '<=' )
                    int alt11=8;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt11=1;
                        }
                        break;
                    case 32:
                        {
                        alt11=2;
                        }
                        break;
                    case 33:
                        {
                        alt11=3;
                        }
                        break;
                    case 34:
                        {
                        alt11=4;
                        }
                        break;
                    case 35:
                        {
                        alt11=5;
                        }
                        break;
                    case 36:
                        {
                        alt11=6;
                        }
                        break;
                    case 37:
                        {
                        alt11=7;
                        }
                        break;
                    case 38:
                        {
                        alt11=8;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }

                    switch (alt11) {
                        case 1 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1039:3: lv_operator_1_1= '!=='
                            {
                            lv_operator_1_1=(Token)match(input,31,FOLLOW_31_in_ruleBooleanExp2309); 

                                    newLeafNode(lv_operator_1_1, grammarAccess.getBooleanExpAccess().getOperatorExclamationMarkEqualsSignEqualsSignKeyword_0_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1051:8: lv_operator_1_2= '==='
                            {
                            lv_operator_1_2=(Token)match(input,32,FOLLOW_32_in_ruleBooleanExp2338); 

                                    newLeafNode(lv_operator_1_2, grammarAccess.getBooleanExpAccess().getOperatorEqualsSignEqualsSignEqualsSignKeyword_0_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_1_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1063:8: lv_operator_1_3= '=='
                            {
                            lv_operator_1_3=(Token)match(input,33,FOLLOW_33_in_ruleBooleanExp2367); 

                                    newLeafNode(lv_operator_1_3, grammarAccess.getBooleanExpAccess().getOperatorEqualsSignEqualsSignKeyword_0_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_1_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1075:8: lv_operator_1_4= '!='
                            {
                            lv_operator_1_4=(Token)match(input,34,FOLLOW_34_in_ruleBooleanExp2396); 

                                    newLeafNode(lv_operator_1_4, grammarAccess.getBooleanExpAccess().getOperatorExclamationMarkEqualsSignKeyword_0_1_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_1_4, null);
                            	    

                            }
                            break;
                        case 5 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1087:8: lv_operator_1_5= '>'
                            {
                            lv_operator_1_5=(Token)match(input,35,FOLLOW_35_in_ruleBooleanExp2425); 

                                    newLeafNode(lv_operator_1_5, grammarAccess.getBooleanExpAccess().getOperatorGreaterThanSignKeyword_0_1_0_4());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_1_5, null);
                            	    

                            }
                            break;
                        case 6 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1099:8: lv_operator_1_6= '>='
                            {
                            lv_operator_1_6=(Token)match(input,36,FOLLOW_36_in_ruleBooleanExp2454); 

                                    newLeafNode(lv_operator_1_6, grammarAccess.getBooleanExpAccess().getOperatorGreaterThanSignEqualsSignKeyword_0_1_0_5());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_1_6, null);
                            	    

                            }
                            break;
                        case 7 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1111:8: lv_operator_1_7= '<'
                            {
                            lv_operator_1_7=(Token)match(input,37,FOLLOW_37_in_ruleBooleanExp2483); 

                                    newLeafNode(lv_operator_1_7, grammarAccess.getBooleanExpAccess().getOperatorLessThanSignKeyword_0_1_0_6());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_1_7, null);
                            	    

                            }
                            break;
                        case 8 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1123:8: lv_operator_1_8= '<='
                            {
                            lv_operator_1_8=(Token)match(input,38,FOLLOW_38_in_ruleBooleanExp2512); 

                                    newLeafNode(lv_operator_1_8, grammarAccess.getBooleanExpAccess().getOperatorLessThanSignEqualsSignKeyword_0_1_0_7());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_1_8, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1138:2: ( (lv_right_2_0= ruleAttributeOrInt ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1139:1: (lv_right_2_0= ruleAttributeOrInt )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1139:1: (lv_right_2_0= ruleAttributeOrInt )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1140:3: lv_right_2_0= ruleAttributeOrInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanExpAccess().getRightAttributeOrIntParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeOrInt_in_ruleBooleanExp2549);
                    lv_right_2_0=ruleAttributeOrInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanExpRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_2_0, 
                            		"AttributeOrInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1157:6: (otherlv_3= '(' ( (lv_nestedExp_4_0= ruleOrExp ) ) otherlv_5= ')' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1157:6: (otherlv_3= '(' ( (lv_nestedExp_4_0= ruleOrExp ) ) otherlv_5= ')' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1157:8: otherlv_3= '(' ( (lv_nestedExp_4_0= ruleOrExp ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBooleanExp2569); 

                        	newLeafNode(otherlv_3, grammarAccess.getBooleanExpAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1161:1: ( (lv_nestedExp_4_0= ruleOrExp ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1162:1: (lv_nestedExp_4_0= ruleOrExp )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1162:1: (lv_nestedExp_4_0= ruleOrExp )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1163:3: lv_nestedExp_4_0= ruleOrExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanExpAccess().getNestedExpOrExpParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExp_in_ruleBooleanExp2590);
                    lv_nestedExp_4_0=ruleOrExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanExpRule());
                    	        }
                           		set(
                           			current, 
                           			"nestedExp",
                            		lv_nestedExp_4_0, 
                            		"OrExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleBooleanExp2602); 

                        	newLeafNode(otherlv_5, grammarAccess.getBooleanExpAccess().getRightParenthesisKeyword_1_2());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExp"


    // $ANTLR start "entryRuleAttributeName"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1191:1: entryRuleAttributeName returns [EObject current=null] : iv_ruleAttributeName= ruleAttributeName EOF ;
    public final EObject entryRuleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeName = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1192:2: (iv_ruleAttributeName= ruleAttributeName EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1193:2: iv_ruleAttributeName= ruleAttributeName EOF
            {
             newCompositeNode(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_ruleAttributeName_in_entryRuleAttributeName2639);
            iv_ruleAttributeName=ruleAttributeName();

            state._fsp--;

             current =iv_ruleAttributeName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeName2649); 

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
    // $ANTLR end "entryRuleAttributeName"


    // $ANTLR start "ruleAttributeName"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1200:1: ruleAttributeName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_child_3_0= ruleAttributeName ) ) ) ) ;
    public final EObject ruleAttributeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_parent_1_0=null;
        Token otherlv_2=null;
        EObject lv_child_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1203:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_child_3_0= ruleAttributeName ) ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1204:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_child_3_0= ruleAttributeName ) ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1204:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_child_3_0= ruleAttributeName ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==39) ) {
                    alt13=2;
                }
                else if ( (LA13_1==EOF||LA13_1==RULE_ID||LA13_1==15||LA13_1==21||(LA13_1>=24 && LA13_1<=26)||(LA13_1>=29 && LA13_1<=38)||(LA13_1>=40 && LA13_1<=44)) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1204:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1204:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1205:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1205:1: (lv_name_0_0= RULE_ID )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1206:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeName2691); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getAttributeNameAccess().getNameIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1223:6: ( ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_child_3_0= ruleAttributeName ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1223:6: ( ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_child_3_0= ruleAttributeName ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1223:7: ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_child_3_0= ruleAttributeName ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1223:7: ( (lv_parent_1_0= RULE_ID ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1224:1: (lv_parent_1_0= RULE_ID )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1224:1: (lv_parent_1_0= RULE_ID )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1225:3: lv_parent_1_0= RULE_ID
                    {
                    lv_parent_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeName2720); 

                    			newLeafNode(lv_parent_1_0, grammarAccess.getAttributeNameAccess().getParentIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parent",
                            		lv_parent_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleAttributeName2737); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeNameAccess().getFullStopKeyword_1_1());
                        
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1245:1: ( (lv_child_3_0= ruleAttributeName ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1246:1: (lv_child_3_0= ruleAttributeName )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1246:1: (lv_child_3_0= ruleAttributeName )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1247:3: lv_child_3_0= ruleAttributeName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeNameAccess().getChildAttributeNameParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeName_in_ruleAttributeName2758);
                    lv_child_3_0=ruleAttributeName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeNameRule());
                    	        }
                           		set(
                           			current, 
                           			"child",
                            		lv_child_3_0, 
                            		"AttributeName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeName"


    // $ANTLR start "entryRuleAttributeOrInt"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1271:1: entryRuleAttributeOrInt returns [EObject current=null] : iv_ruleAttributeOrInt= ruleAttributeOrInt EOF ;
    public final EObject entryRuleAttributeOrInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeOrInt = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1272:2: (iv_ruleAttributeOrInt= ruleAttributeOrInt EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1273:2: iv_ruleAttributeOrInt= ruleAttributeOrInt EOF
            {
             newCompositeNode(grammarAccess.getAttributeOrIntRule()); 
            pushFollow(FOLLOW_ruleAttributeOrInt_in_entryRuleAttributeOrInt2795);
            iv_ruleAttributeOrInt=ruleAttributeOrInt();

            state._fsp--;

             current =iv_ruleAttributeOrInt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeOrInt2805); 

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
    // $ANTLR end "entryRuleAttributeOrInt"


    // $ANTLR start "ruleAttributeOrInt"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1280:1: ruleAttributeOrInt returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleAttributeName ) ) | ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleAttributeOrInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject lv_attribute_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1283:28: ( ( ( (lv_attribute_0_0= ruleAttributeName ) ) | ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1284:1: ( ( (lv_attribute_0_0= ruleAttributeName ) ) | ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1284:1: ( ( (lv_attribute_0_0= ruleAttributeName ) ) | ( (lv_value_1_0= RULE_INT ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_INT) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1284:2: ( (lv_attribute_0_0= ruleAttributeName ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1284:2: ( (lv_attribute_0_0= ruleAttributeName ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1285:1: (lv_attribute_0_0= ruleAttributeName )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1285:1: (lv_attribute_0_0= ruleAttributeName )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1286:3: lv_attribute_0_0= ruleAttributeName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeOrIntAccess().getAttributeAttributeNameParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeName_in_ruleAttributeOrInt2851);
                    lv_attribute_0_0=ruleAttributeName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeOrIntRule());
                    	        }
                           		set(
                           			current, 
                           			"attribute",
                            		lv_attribute_0_0, 
                            		"AttributeName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1303:6: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1303:6: ( (lv_value_1_0= RULE_INT ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1304:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1304:1: (lv_value_1_0= RULE_INT )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1305:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAttributeOrInt2874); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getAttributeOrIntAccess().getValueINTTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeOrIntRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeOrInt"


    // $ANTLR start "entryRuleAddtionExp"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1329:1: entryRuleAddtionExp returns [EObject current=null] : iv_ruleAddtionExp= ruleAddtionExp EOF ;
    public final EObject entryRuleAddtionExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddtionExp = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1330:2: (iv_ruleAddtionExp= ruleAddtionExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1331:2: iv_ruleAddtionExp= ruleAddtionExp EOF
            {
             newCompositeNode(grammarAccess.getAddtionExpRule()); 
            pushFollow(FOLLOW_ruleAddtionExp_in_entryRuleAddtionExp2915);
            iv_ruleAddtionExp=ruleAddtionExp();

            state._fsp--;

             current =iv_ruleAddtionExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddtionExp2925); 

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
    // $ANTLR end "entryRuleAddtionExp"


    // $ANTLR start "ruleAddtionExp"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1338:1: ruleAddtionExp returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleMultiplicationExp ) ) ( ( (lv_operators_1_0= '+' ) ) | (otherlv_2= '-' ( (lv_expressions_3_0= ruleMultiplicationExp ) ) ) )* ) ;
    public final EObject ruleAddtionExp() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token otherlv_2=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1341:28: ( ( ( (lv_expressions_0_0= ruleMultiplicationExp ) ) ( ( (lv_operators_1_0= '+' ) ) | (otherlv_2= '-' ( (lv_expressions_3_0= ruleMultiplicationExp ) ) ) )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1342:1: ( ( (lv_expressions_0_0= ruleMultiplicationExp ) ) ( ( (lv_operators_1_0= '+' ) ) | (otherlv_2= '-' ( (lv_expressions_3_0= ruleMultiplicationExp ) ) ) )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1342:1: ( ( (lv_expressions_0_0= ruleMultiplicationExp ) ) ( ( (lv_operators_1_0= '+' ) ) | (otherlv_2= '-' ( (lv_expressions_3_0= ruleMultiplicationExp ) ) ) )* )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1342:2: ( (lv_expressions_0_0= ruleMultiplicationExp ) ) ( ( (lv_operators_1_0= '+' ) ) | (otherlv_2= '-' ( (lv_expressions_3_0= ruleMultiplicationExp ) ) ) )*
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1342:2: ( (lv_expressions_0_0= ruleMultiplicationExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1343:1: (lv_expressions_0_0= ruleMultiplicationExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1343:1: (lv_expressions_0_0= ruleMultiplicationExp )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1344:3: lv_expressions_0_0= ruleMultiplicationExp
            {
             
            	        newCompositeNode(grammarAccess.getAddtionExpAccess().getExpressionsMultiplicationExpParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicationExp_in_ruleAddtionExp2971);
            lv_expressions_0_0=ruleMultiplicationExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAddtionExpRule());
            	        }
                   		add(
                   			current, 
                   			"expressions",
                    		lv_expressions_0_0, 
                    		"MultiplicationExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1360:2: ( ( (lv_operators_1_0= '+' ) ) | (otherlv_2= '-' ( (lv_expressions_3_0= ruleMultiplicationExp ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==40) ) {
                    alt15=1;
                }
                else if ( (LA15_0==41) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1360:3: ( (lv_operators_1_0= '+' ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1360:3: ( (lv_operators_1_0= '+' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1361:1: (lv_operators_1_0= '+' )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1361:1: (lv_operators_1_0= '+' )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1362:3: lv_operators_1_0= '+'
            	    {
            	    lv_operators_1_0=(Token)match(input,40,FOLLOW_40_in_ruleAddtionExp2990); 

            	            newLeafNode(lv_operators_1_0, grammarAccess.getAddtionExpAccess().getOperatorsPlusSignKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAddtionExpRule());
            	    	        }
            	           		addWithLastConsumed(current, "operators", lv_operators_1_0, "+");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1376:6: (otherlv_2= '-' ( (lv_expressions_3_0= ruleMultiplicationExp ) ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1376:6: (otherlv_2= '-' ( (lv_expressions_3_0= ruleMultiplicationExp ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1376:8: otherlv_2= '-' ( (lv_expressions_3_0= ruleMultiplicationExp ) )
            	    {
            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleAddtionExp3022); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAddtionExpAccess().getHyphenMinusKeyword_1_1_0());
            	        
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1380:1: ( (lv_expressions_3_0= ruleMultiplicationExp ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1381:1: (lv_expressions_3_0= ruleMultiplicationExp )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1381:1: (lv_expressions_3_0= ruleMultiplicationExp )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1382:3: lv_expressions_3_0= ruleMultiplicationExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAddtionExpAccess().getExpressionsMultiplicationExpParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicationExp_in_ruleAddtionExp3043);
            	    lv_expressions_3_0=ruleMultiplicationExp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAddtionExpRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_3_0, 
            	            		"MultiplicationExp");
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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddtionExp"


    // $ANTLR start "entryRuleMultiplicationExp"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1406:1: entryRuleMultiplicationExp returns [EObject current=null] : iv_ruleMultiplicationExp= ruleMultiplicationExp EOF ;
    public final EObject entryRuleMultiplicationExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExp = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1407:2: (iv_ruleMultiplicationExp= ruleMultiplicationExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1408:2: iv_ruleMultiplicationExp= ruleMultiplicationExp EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationExpRule()); 
            pushFollow(FOLLOW_ruleMultiplicationExp_in_entryRuleMultiplicationExp3082);
            iv_ruleMultiplicationExp=ruleMultiplicationExp();

            state._fsp--;

             current =iv_ruleMultiplicationExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationExp3092); 

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
    // $ANTLR end "entryRuleMultiplicationExp"


    // $ANTLR start "ruleMultiplicationExp"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1415:1: ruleMultiplicationExp returns [EObject current=null] : ( ( ( (lv_expressions_0_0= ruleAttributeOrInt ) ) ( ( (lv_operators_1_0= '*' ) ) | (otherlv_2= '/' ( (lv_expressions_3_0= ruleAttributeOrInt ) ) ) )* ) | (otherlv_4= '(' this_AddtionExp_5= ruleAddtionExp otherlv_6= ')' ) ) ;
    public final EObject ruleMultiplicationExp() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_3_0 = null;

        EObject this_AddtionExp_5 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1418:28: ( ( ( ( (lv_expressions_0_0= ruleAttributeOrInt ) ) ( ( (lv_operators_1_0= '*' ) ) | (otherlv_2= '/' ( (lv_expressions_3_0= ruleAttributeOrInt ) ) ) )* ) | (otherlv_4= '(' this_AddtionExp_5= ruleAddtionExp otherlv_6= ')' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1419:1: ( ( ( (lv_expressions_0_0= ruleAttributeOrInt ) ) ( ( (lv_operators_1_0= '*' ) ) | (otherlv_2= '/' ( (lv_expressions_3_0= ruleAttributeOrInt ) ) ) )* ) | (otherlv_4= '(' this_AddtionExp_5= ruleAddtionExp otherlv_6= ')' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1419:1: ( ( ( (lv_expressions_0_0= ruleAttributeOrInt ) ) ( ( (lv_operators_1_0= '*' ) ) | (otherlv_2= '/' ( (lv_expressions_3_0= ruleAttributeOrInt ) ) ) )* ) | (otherlv_4= '(' this_AddtionExp_5= ruleAddtionExp otherlv_6= ')' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)) ) {
                alt17=1;
            }
            else if ( (LA17_0==19) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1419:2: ( ( (lv_expressions_0_0= ruleAttributeOrInt ) ) ( ( (lv_operators_1_0= '*' ) ) | (otherlv_2= '/' ( (lv_expressions_3_0= ruleAttributeOrInt ) ) ) )* )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1419:2: ( ( (lv_expressions_0_0= ruleAttributeOrInt ) ) ( ( (lv_operators_1_0= '*' ) ) | (otherlv_2= '/' ( (lv_expressions_3_0= ruleAttributeOrInt ) ) ) )* )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1419:3: ( (lv_expressions_0_0= ruleAttributeOrInt ) ) ( ( (lv_operators_1_0= '*' ) ) | (otherlv_2= '/' ( (lv_expressions_3_0= ruleAttributeOrInt ) ) ) )*
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1419:3: ( (lv_expressions_0_0= ruleAttributeOrInt ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1420:1: (lv_expressions_0_0= ruleAttributeOrInt )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1420:1: (lv_expressions_0_0= ruleAttributeOrInt )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1421:3: lv_expressions_0_0= ruleAttributeOrInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiplicationExpAccess().getExpressionsAttributeOrIntParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeOrInt_in_ruleMultiplicationExp3139);
                    lv_expressions_0_0=ruleAttributeOrInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultiplicationExpRule());
                    	        }
                           		add(
                           			current, 
                           			"expressions",
                            		lv_expressions_0_0, 
                            		"AttributeOrInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1437:2: ( ( (lv_operators_1_0= '*' ) ) | (otherlv_2= '/' ( (lv_expressions_3_0= ruleAttributeOrInt ) ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==42) ) {
                            alt16=1;
                        }
                        else if ( (LA16_0==43) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1437:3: ( (lv_operators_1_0= '*' ) )
                    	    {
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1437:3: ( (lv_operators_1_0= '*' ) )
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1438:1: (lv_operators_1_0= '*' )
                    	    {
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1438:1: (lv_operators_1_0= '*' )
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1439:3: lv_operators_1_0= '*'
                    	    {
                    	    lv_operators_1_0=(Token)match(input,42,FOLLOW_42_in_ruleMultiplicationExp3158); 

                    	            newLeafNode(lv_operators_1_0, grammarAccess.getMultiplicationExpAccess().getOperatorsAsteriskKeyword_0_1_0_0());
                    	        

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMultiplicationExpRule());
                    	    	        }
                    	           		addWithLastConsumed(current, "operators", lv_operators_1_0, "*");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1453:6: (otherlv_2= '/' ( (lv_expressions_3_0= ruleAttributeOrInt ) ) )
                    	    {
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1453:6: (otherlv_2= '/' ( (lv_expressions_3_0= ruleAttributeOrInt ) ) )
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1453:8: otherlv_2= '/' ( (lv_expressions_3_0= ruleAttributeOrInt ) )
                    	    {
                    	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleMultiplicationExp3190); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getMultiplicationExpAccess().getSolidusKeyword_0_1_1_0());
                    	        
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1457:1: ( (lv_expressions_3_0= ruleAttributeOrInt ) )
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1458:1: (lv_expressions_3_0= ruleAttributeOrInt )
                    	    {
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1458:1: (lv_expressions_3_0= ruleAttributeOrInt )
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1459:3: lv_expressions_3_0= ruleAttributeOrInt
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultiplicationExpAccess().getExpressionsAttributeOrIntParserRuleCall_0_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttributeOrInt_in_ruleMultiplicationExp3211);
                    	    lv_expressions_3_0=ruleAttributeOrInt();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultiplicationExpRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressions",
                    	            		lv_expressions_3_0, 
                    	            		"AttributeOrInt");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1476:6: (otherlv_4= '(' this_AddtionExp_5= ruleAddtionExp otherlv_6= ')' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1476:6: (otherlv_4= '(' this_AddtionExp_5= ruleAddtionExp otherlv_6= ')' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1476:8: otherlv_4= '(' this_AddtionExp_5= ruleAddtionExp otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleMultiplicationExp3234); 

                        	newLeafNode(otherlv_4, grammarAccess.getMultiplicationExpAccess().getLeftParenthesisKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getMultiplicationExpAccess().getAddtionExpParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleAddtionExp_in_ruleMultiplicationExp3256);
                    this_AddtionExp_5=ruleAddtionExp();

                    state._fsp--;

                     
                            current = this_AddtionExp_5; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleMultiplicationExp3267); 

                        	newLeafNode(otherlv_6, grammarAccess.getMultiplicationExpAccess().getRightParenthesisKeyword_1_2());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicationExp"


    // $ANTLR start "entryRuleValueAssignment"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1501:1: entryRuleValueAssignment returns [EObject current=null] : iv_ruleValueAssignment= ruleValueAssignment EOF ;
    public final EObject entryRuleValueAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueAssignment = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1502:2: (iv_ruleValueAssignment= ruleValueAssignment EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1503:2: iv_ruleValueAssignment= ruleValueAssignment EOF
            {
             newCompositeNode(grammarAccess.getValueAssignmentRule()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment3304);
            iv_ruleValueAssignment=ruleValueAssignment();

            state._fsp--;

             current =iv_ruleValueAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueAssignment3314); 

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
    // $ANTLR end "entryRuleValueAssignment"


    // $ANTLR start "ruleValueAssignment"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1510:1: ruleValueAssignment returns [EObject current=null] : ( ( (lv_name_0_0= ruleAttributeName ) ) otherlv_1= '=' ( (lv_addition_2_0= ruleAddtionExp ) ) ) ;
    public final EObject ruleValueAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_0_0 = null;

        EObject lv_addition_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1513:28: ( ( ( (lv_name_0_0= ruleAttributeName ) ) otherlv_1= '=' ( (lv_addition_2_0= ruleAddtionExp ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1514:1: ( ( (lv_name_0_0= ruleAttributeName ) ) otherlv_1= '=' ( (lv_addition_2_0= ruleAddtionExp ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1514:1: ( ( (lv_name_0_0= ruleAttributeName ) ) otherlv_1= '=' ( (lv_addition_2_0= ruleAddtionExp ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1514:2: ( (lv_name_0_0= ruleAttributeName ) ) otherlv_1= '=' ( (lv_addition_2_0= ruleAddtionExp ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1514:2: ( (lv_name_0_0= ruleAttributeName ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1515:1: (lv_name_0_0= ruleAttributeName )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1515:1: (lv_name_0_0= ruleAttributeName )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1516:3: lv_name_0_0= ruleAttributeName
            {
             
            	        newCompositeNode(grammarAccess.getValueAssignmentAccess().getNameAttributeNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeName_in_ruleValueAssignment3360);
            lv_name_0_0=ruleAttributeName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"AttributeName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleValueAssignment3372); 

                	newLeafNode(otherlv_1, grammarAccess.getValueAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1536:1: ( (lv_addition_2_0= ruleAddtionExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1537:1: (lv_addition_2_0= ruleAddtionExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1537:1: (lv_addition_2_0= ruleAddtionExp )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1538:3: lv_addition_2_0= ruleAddtionExp
            {
             
            	        newCompositeNode(grammarAccess.getValueAssignmentAccess().getAdditionAddtionExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAddtionExp_in_ruleValueAssignment3393);
            lv_addition_2_0=ruleAddtionExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"addition",
                    		lv_addition_2_0, 
                    		"AddtionExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel184 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rulePlayer_in_ruleModel210 = new BitSet(new long[]{0x000000000005A802L});
    public static final BitSet FOLLOW_ruleBoard_in_ruleModel286 = new BitSet(new long[]{0x000000000005A802L});
    public static final BitSet FOLLOW_ruleToken_in_ruleModel361 = new BitSet(new long[]{0x000000000005A802L});
    public static final BitSet FOLLOW_ruleRules_in_ruleModel437 = new BitSet(new long[]{0x000000000005A802L});
    public static final BitSet FOLLOW_rulePlayer_in_entryRulePlayer518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlayer528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePlayer571 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePlayer601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoard_in_entryRuleBoard642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoard652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBoard740 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBoard765 = new BitSet(new long[]{0x000000000000A012L});
    public static final BitSet FOLLOW_ruleField_in_ruleBoard786 = new BitSet(new long[]{0x000000000000A012L});
    public static final BitSet FOLLOW_15_in_ruleBoard855 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_ruleRules_in_entryRuleRules937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRules947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRules990 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRules1015 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleTurnRules_in_ruleRules1036 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRules1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnRules_in_entryRuleTurnRules1084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnRules1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTurnRules1137 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTurnRules1162 = new BitSet(new long[]{0x0000000007008010L});
    public static final BitSet FOLLOW_ruleAction_in_ruleTurnRules1183 = new BitSet(new long[]{0x0000000007008010L});
    public static final BitSet FOLLOW_15_in_ruleTurnRules1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_entryRuleToken1232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToken1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleToken1279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleToken1296 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleToken1313 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleToken1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1413 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleField1430 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1447 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleField1464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1481 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleField1498 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1515 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleField1532 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleField1544 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1564 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleField1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAction1667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAction1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAction1763 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_18_in_ruleAction1796 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27_in_ruleAction1825 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAction1853 = new BitSet(new long[]{0x0000000007080030L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleAction1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_ruleAction1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_entryRuleOrExp1938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExp1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleOrExp1994 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleOrExp2013 = new BitSet(new long[]{0x0000000007080030L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleOrExp2047 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_entryRuleAndExp2085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExp2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_ruleAndExp2141 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleAndExp2160 = new BitSet(new long[]{0x0000000007080030L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_ruleAndExp2194 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_entryRuleBooleanExp2232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExp2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_ruleBooleanExp2289 = new BitSet(new long[]{0x0000007F80000000L});
    public static final BitSet FOLLOW_31_in_ruleBooleanExp2309 = new BitSet(new long[]{0x0000000007000030L});
    public static final BitSet FOLLOW_32_in_ruleBooleanExp2338 = new BitSet(new long[]{0x0000000007000030L});
    public static final BitSet FOLLOW_33_in_ruleBooleanExp2367 = new BitSet(new long[]{0x0000000007000030L});
    public static final BitSet FOLLOW_34_in_ruleBooleanExp2396 = new BitSet(new long[]{0x0000000007000030L});
    public static final BitSet FOLLOW_35_in_ruleBooleanExp2425 = new BitSet(new long[]{0x0000000007000030L});
    public static final BitSet FOLLOW_36_in_ruleBooleanExp2454 = new BitSet(new long[]{0x0000000007000030L});
    public static final BitSet FOLLOW_37_in_ruleBooleanExp2483 = new BitSet(new long[]{0x0000000007000030L});
    public static final BitSet FOLLOW_38_in_ruleBooleanExp2512 = new BitSet(new long[]{0x0000000007000030L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_ruleBooleanExp2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBooleanExp2569 = new BitSet(new long[]{0x0000000007080030L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleBooleanExp2590 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBooleanExp2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_entryRuleAttributeName2639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeName2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeName2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeName2720 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleAttributeName2737 = new BitSet(new long[]{0x0000000007000010L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleAttributeName2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_entryRuleAttributeOrInt2795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeOrInt2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleAttributeOrInt2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAttributeOrInt2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddtionExp_in_entryRuleAddtionExp2915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddtionExp2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExp_in_ruleAddtionExp2971 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_40_in_ruleAddtionExp2990 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_41_in_ruleAddtionExp3022 = new BitSet(new long[]{0x0000000007080030L});
    public static final BitSet FOLLOW_ruleMultiplicationExp_in_ruleAddtionExp3043 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExp_in_entryRuleMultiplicationExp3082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExp3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_ruleMultiplicationExp3139 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleMultiplicationExp3158 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_43_in_ruleMultiplicationExp3190 = new BitSet(new long[]{0x0000000007000030L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_ruleMultiplicationExp3211 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_19_in_ruleMultiplicationExp3234 = new BitSet(new long[]{0x0000000007080030L});
    public static final BitSet FOLLOW_ruleAddtionExp_in_ruleMultiplicationExp3256 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMultiplicationExp3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment3304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueAssignment3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleValueAssignment3360 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleValueAssignment3372 = new BitSet(new long[]{0x0000000007080030L});
    public static final BitSet FOLLOW_ruleAddtionExp_in_ruleValueAssignment3393 = new BitSet(new long[]{0x0000000000000002L});

}
