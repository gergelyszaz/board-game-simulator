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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GAME'", "'PLAYERS'", "'{'", "'}'", "'BOARD'", "'RULES'", "'TURN'", "'TOKEN'", "'('", "','", "')'", "'SPAWN'", "'MOVE'", "'DESTROY'", "'SELECT'", "'FIELD'", "'WHERE'", "'OR'", "'AND'", "'NOT'", "'!=='", "'==='", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'.'", "'IF'", "'GOTO'", "'LABEL'", "'+'", "'-'", "'*'", "'/'", "'='"
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
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
                else if ( LA2_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:256:1: rulePlayer returns [EObject current=null] : ( ( (lv_name_0_0= 'PLAYERS' ) ) ( (lv_playercount_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleSimpleAssignment ) )* otherlv_4= '}' ) ;
    public final EObject rulePlayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_playercount_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:259:28: ( ( ( (lv_name_0_0= 'PLAYERS' ) ) ( (lv_playercount_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleSimpleAssignment ) )* otherlv_4= '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:260:1: ( ( (lv_name_0_0= 'PLAYERS' ) ) ( (lv_playercount_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleSimpleAssignment ) )* otherlv_4= '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:260:1: ( ( (lv_name_0_0= 'PLAYERS' ) ) ( (lv_playercount_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleSimpleAssignment ) )* otherlv_4= '}' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:260:2: ( (lv_name_0_0= 'PLAYERS' ) ) ( (lv_playercount_1_0= RULE_INT ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleSimpleAssignment ) )* otherlv_4= '}'
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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePlayer618); 

                	newLeafNode(otherlv_2, grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:297:1: ( (lv_variables_3_0= ruleSimpleAssignment ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:298:1: (lv_variables_3_0= ruleSimpleAssignment )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:298:1: (lv_variables_3_0= ruleSimpleAssignment )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:299:3: lv_variables_3_0= ruleSimpleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlayerAccess().getVariablesSimpleAssignmentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleAssignment_in_rulePlayer639);
            	    lv_variables_3_0=ruleSimpleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlayerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_3_0, 
            	            		"SimpleAssignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_rulePlayer652); 

                	newLeafNode(otherlv_4, grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:327:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:328:2: (iv_ruleBoard= ruleBoard EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:329:2: iv_ruleBoard= ruleBoard EOF
            {
             newCompositeNode(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_ruleBoard_in_entryRuleBoard688);
            iv_ruleBoard=ruleBoard();

            state._fsp--;

             current =iv_ruleBoard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoard698); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:336:1: ruleBoard returns [EObject current=null] : ( ( (lv_name_0_0= 'BOARD' ) ) otherlv_1= '{' ( (lv_variables_2_0= ruleSimpleAssignment ) )* ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_variables_2_0 = null;

        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:339:28: ( ( ( (lv_name_0_0= 'BOARD' ) ) otherlv_1= '{' ( (lv_variables_2_0= ruleSimpleAssignment ) )* ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:340:1: ( ( (lv_name_0_0= 'BOARD' ) ) otherlv_1= '{' ( (lv_variables_2_0= ruleSimpleAssignment ) )* ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:340:1: ( ( (lv_name_0_0= 'BOARD' ) ) otherlv_1= '{' ( (lv_variables_2_0= ruleSimpleAssignment ) )* ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:340:2: ( (lv_name_0_0= 'BOARD' ) ) otherlv_1= '{' ( (lv_variables_2_0= ruleSimpleAssignment ) )* ( (lv_fields_3_0= ruleField ) )* otherlv_4= '}'
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:340:2: ( (lv_name_0_0= 'BOARD' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:341:1: (lv_name_0_0= 'BOARD' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:341:1: (lv_name_0_0= 'BOARD' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:342:3: lv_name_0_0= 'BOARD'
            {
            lv_name_0_0=(Token)match(input,15,FOLLOW_15_in_ruleBoard741); 

                    newLeafNode(lv_name_0_0, grammarAccess.getBoardAccess().getNameBOARDKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBoardRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "BOARD");
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleBoard766); 

                	newLeafNode(otherlv_1, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_1());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:359:1: ( (lv_variables_2_0= ruleSimpleAssignment ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==47) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:360:1: (lv_variables_2_0= ruleSimpleAssignment )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:360:1: (lv_variables_2_0= ruleSimpleAssignment )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:361:3: lv_variables_2_0= ruleSimpleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoardAccess().getVariablesSimpleAssignmentParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleAssignment_in_ruleBoard787);
            	    lv_variables_2_0=ruleSimpleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBoardRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_2_0, 
            	            		"SimpleAssignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:377:3: ( (lv_fields_3_0= ruleField ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:378:1: (lv_fields_3_0= ruleField )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:378:1: (lv_fields_3_0= ruleField )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:379:3: lv_fields_3_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBoardAccess().getFieldsFieldParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleBoard809);
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
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleBoard822); 

                	newLeafNode(otherlv_4, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:407:1: entryRuleRules returns [EObject current=null] : iv_ruleRules= ruleRules EOF ;
    public final EObject entryRuleRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRules = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:408:2: (iv_ruleRules= ruleRules EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:409:2: iv_ruleRules= ruleRules EOF
            {
             newCompositeNode(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_ruleRules_in_entryRuleRules858);
            iv_ruleRules=ruleRules();

            state._fsp--;

             current =iv_ruleRules; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRules868); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:416:1: ruleRules returns [EObject current=null] : ( ( (lv_name_0_0= 'RULES' ) ) otherlv_1= '{' ( (lv_turnrules_2_0= ruleTurnRules ) ) otherlv_3= '}' ) ;
    public final EObject ruleRules() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_turnrules_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:419:28: ( ( ( (lv_name_0_0= 'RULES' ) ) otherlv_1= '{' ( (lv_turnrules_2_0= ruleTurnRules ) ) otherlv_3= '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:420:1: ( ( (lv_name_0_0= 'RULES' ) ) otherlv_1= '{' ( (lv_turnrules_2_0= ruleTurnRules ) ) otherlv_3= '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:420:1: ( ( (lv_name_0_0= 'RULES' ) ) otherlv_1= '{' ( (lv_turnrules_2_0= ruleTurnRules ) ) otherlv_3= '}' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:420:2: ( (lv_name_0_0= 'RULES' ) ) otherlv_1= '{' ( (lv_turnrules_2_0= ruleTurnRules ) ) otherlv_3= '}'
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:420:2: ( (lv_name_0_0= 'RULES' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:421:1: (lv_name_0_0= 'RULES' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:421:1: (lv_name_0_0= 'RULES' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:422:3: lv_name_0_0= 'RULES'
            {
            lv_name_0_0=(Token)match(input,16,FOLLOW_16_in_ruleRules911); 

                    newLeafNode(lv_name_0_0, grammarAccess.getRulesAccess().getNameRULESKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRulesRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "RULES");
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleRules936); 

                	newLeafNode(otherlv_1, grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_1());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:439:1: ( (lv_turnrules_2_0= ruleTurnRules ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:440:1: (lv_turnrules_2_0= ruleTurnRules )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:440:1: (lv_turnrules_2_0= ruleTurnRules )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:441:3: lv_turnrules_2_0= ruleTurnRules
            {
             
            	        newCompositeNode(grammarAccess.getRulesAccess().getTurnrulesTurnRulesParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTurnRules_in_ruleRules957);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleRules969); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:469:1: entryRuleTurnRules returns [EObject current=null] : iv_ruleTurnRules= ruleTurnRules EOF ;
    public final EObject entryRuleTurnRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnRules = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:470:2: (iv_ruleTurnRules= ruleTurnRules EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:471:2: iv_ruleTurnRules= ruleTurnRules EOF
            {
             newCompositeNode(grammarAccess.getTurnRulesRule()); 
            pushFollow(FOLLOW_ruleTurnRules_in_entryRuleTurnRules1005);
            iv_ruleTurnRules=ruleTurnRules();

            state._fsp--;

             current =iv_ruleTurnRules; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnRules1015); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:478:1: ruleTurnRules returns [EObject current=null] : ( ( (lv_name_0_0= 'TURN' ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' ) ;
    public final EObject ruleTurnRules() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:481:28: ( ( ( (lv_name_0_0= 'TURN' ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:482:1: ( ( (lv_name_0_0= 'TURN' ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:482:1: ( ( (lv_name_0_0= 'TURN' ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:482:2: ( (lv_name_0_0= 'TURN' ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}'
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:482:2: ( (lv_name_0_0= 'TURN' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:483:1: (lv_name_0_0= 'TURN' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:483:1: (lv_name_0_0= 'TURN' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:484:3: lv_name_0_0= 'TURN'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_17_in_ruleTurnRules1058); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTurnRulesAccess().getNameTURNKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTurnRulesRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "TURN");
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleTurnRules1083); 

                	newLeafNode(otherlv_1, grammarAccess.getTurnRulesAccess().getLeftCurlyBracketKeyword_1());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:501:1: ( (lv_actions_2_0= ruleAction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=22 && LA6_0<=25)||LA6_0==40||LA6_0==42) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:502:1: (lv_actions_2_0= ruleAction )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:502:1: (lv_actions_2_0= ruleAction )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:503:3: lv_actions_2_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTurnRulesAccess().getActionsActionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleTurnRules1104);
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
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleTurnRules1117); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:531:1: entryRuleToken returns [EObject current=null] : iv_ruleToken= ruleToken EOF ;
    public final EObject entryRuleToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToken = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:532:2: (iv_ruleToken= ruleToken EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:533:2: iv_ruleToken= ruleToken EOF
            {
             newCompositeNode(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_ruleToken_in_entryRuleToken1153);
            iv_ruleToken=ruleToken();

            state._fsp--;

             current =iv_ruleToken; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToken1163); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:540:1: ruleToken returns [EObject current=null] : (otherlv_0= 'TOKEN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleSimpleAssignment ) )* otherlv_4= '}' ) ;
    public final EObject ruleToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:543:28: ( (otherlv_0= 'TOKEN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleSimpleAssignment ) )* otherlv_4= '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:544:1: (otherlv_0= 'TOKEN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleSimpleAssignment ) )* otherlv_4= '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:544:1: (otherlv_0= 'TOKEN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleSimpleAssignment ) )* otherlv_4= '}' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:544:3: otherlv_0= 'TOKEN' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleSimpleAssignment ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleToken1200); 

                	newLeafNode(otherlv_0, grammarAccess.getTokenAccess().getTOKENKeyword_0());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:548:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:549:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:549:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:550:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleToken1217); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleToken1234); 

                	newLeafNode(otherlv_2, grammarAccess.getTokenAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:570:1: ( (lv_variables_3_0= ruleSimpleAssignment ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:571:1: (lv_variables_3_0= ruleSimpleAssignment )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:571:1: (lv_variables_3_0= ruleSimpleAssignment )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:572:3: lv_variables_3_0= ruleSimpleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTokenAccess().getVariablesSimpleAssignmentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleAssignment_in_ruleToken1255);
            	    lv_variables_3_0=ruleSimpleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTokenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_3_0, 
            	            		"SimpleAssignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleToken1268); 

                	newLeafNode(otherlv_4, grammarAccess.getTokenAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:600:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:601:2: (iv_ruleField= ruleField EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:602:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1304);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1314); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:609:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* ( (lv_variables_10_0= ruleSimpleAssignment ) )* otherlv_11= '}' ) ;
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
        Token otherlv_11=null;
        EObject lv_variables_10_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:612:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* ( (lv_variables_10_0= ruleSimpleAssignment ) )* otherlv_11= '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:613:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* ( (lv_variables_10_0= ruleSimpleAssignment ) )* otherlv_11= '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:613:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* ( (lv_variables_10_0= ruleSimpleAssignment ) )* otherlv_11= '}' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:613:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* ( (lv_variables_10_0= ruleSimpleAssignment ) )* otherlv_11= '}'
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:613:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:614:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:614:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:615:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1356); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleField1373); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getLeftParenthesisKeyword_1());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:635:1: ( (lv_x_2_0= RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:636:1: (lv_x_2_0= RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:636:1: (lv_x_2_0= RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:637:3: lv_x_2_0= RULE_INT
            {
            lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1390); 

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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleField1407); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getCommaKeyword_3());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:657:1: ( (lv_y_4_0= RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:658:1: (lv_y_4_0= RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:658:1: (lv_y_4_0= RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:659:3: lv_y_4_0= RULE_INT
            {
            lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1424); 

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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleField1441); 

                	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getCommaKeyword_5());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:679:1: ( (lv_z_6_0= RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:680:1: (lv_z_6_0= RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:680:1: (lv_z_6_0= RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:681:3: lv_z_6_0= RULE_INT
            {
            lv_z_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1458); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleField1475); 

                	newLeafNode(otherlv_7, grammarAccess.getFieldAccess().getRightParenthesisKeyword_7());
                
            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleField1487); 

                	newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_8());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:705:1: ( (otherlv_9= RULE_ID ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID||LA8_1==14) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:706:1: (otherlv_9= RULE_ID )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:706:1: (otherlv_9= RULE_ID )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:707:3: otherlv_9= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFieldRule());
            	    	        }
            	            
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1507); 

            	    		newLeafNode(otherlv_9, grammarAccess.getFieldAccess().getNeighboursFieldCrossReference_9_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:718:3: ( (lv_variables_10_0= ruleSimpleAssignment ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:719:1: (lv_variables_10_0= ruleSimpleAssignment )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:719:1: (lv_variables_10_0= ruleSimpleAssignment )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:720:3: lv_variables_10_0= ruleSimpleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldAccess().getVariablesSimpleAssignmentParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleAssignment_in_ruleField1529);
            	    lv_variables_10_0=ruleSimpleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_10_0, 
            	            		"SimpleAssignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleField1542); 

                	newLeafNode(otherlv_11, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:748:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:749:2: (iv_ruleAction= ruleAction EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:750:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1578);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1588); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:757:1: ruleAction returns [EObject current=null] : ( ( ( (lv_name_0_0= 'SPAWN' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_name_2_0= 'MOVE' ) ) | ( (lv_name_3_0= 'DESTROY' ) ) | ( ( (lv_name_4_0= 'SELECT' ) ) ( ( (lv_objectOfSelect_5_1= 'TOKEN' | lv_objectOfSelect_5_2= 'FIELD' ) ) ) otherlv_6= 'WHERE' ( (lv_filter_7_0= ruleOrExp ) ) ) | ( (lv_assignment_8_0= ruleValueAssignment ) ) | ( (lv_gotoCondition_9_0= ruleGotoCondition ) ) | ( (lv_label_10_0= ruleLabel ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;
        Token lv_objectOfSelect_5_1=null;
        Token lv_objectOfSelect_5_2=null;
        Token otherlv_6=null;
        EObject lv_filter_7_0 = null;

        EObject lv_assignment_8_0 = null;

        EObject lv_gotoCondition_9_0 = null;

        EObject lv_label_10_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:760:28: ( ( ( ( (lv_name_0_0= 'SPAWN' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_name_2_0= 'MOVE' ) ) | ( (lv_name_3_0= 'DESTROY' ) ) | ( ( (lv_name_4_0= 'SELECT' ) ) ( ( (lv_objectOfSelect_5_1= 'TOKEN' | lv_objectOfSelect_5_2= 'FIELD' ) ) ) otherlv_6= 'WHERE' ( (lv_filter_7_0= ruleOrExp ) ) ) | ( (lv_assignment_8_0= ruleValueAssignment ) ) | ( (lv_gotoCondition_9_0= ruleGotoCondition ) ) | ( (lv_label_10_0= ruleLabel ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:761:1: ( ( ( (lv_name_0_0= 'SPAWN' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_name_2_0= 'MOVE' ) ) | ( (lv_name_3_0= 'DESTROY' ) ) | ( ( (lv_name_4_0= 'SELECT' ) ) ( ( (lv_objectOfSelect_5_1= 'TOKEN' | lv_objectOfSelect_5_2= 'FIELD' ) ) ) otherlv_6= 'WHERE' ( (lv_filter_7_0= ruleOrExp ) ) ) | ( (lv_assignment_8_0= ruleValueAssignment ) ) | ( (lv_gotoCondition_9_0= ruleGotoCondition ) ) | ( (lv_label_10_0= ruleLabel ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:761:1: ( ( ( (lv_name_0_0= 'SPAWN' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_name_2_0= 'MOVE' ) ) | ( (lv_name_3_0= 'DESTROY' ) ) | ( ( (lv_name_4_0= 'SELECT' ) ) ( ( (lv_objectOfSelect_5_1= 'TOKEN' | lv_objectOfSelect_5_2= 'FIELD' ) ) ) otherlv_6= 'WHERE' ( (lv_filter_7_0= ruleOrExp ) ) ) | ( (lv_assignment_8_0= ruleValueAssignment ) ) | ( (lv_gotoCondition_9_0= ruleGotoCondition ) ) | ( (lv_label_10_0= ruleLabel ) ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            case 25:
                {
                alt11=4;
                }
                break;
            case RULE_ID:
                {
                alt11=5;
                }
                break;
            case 40:
                {
                alt11=6;
                }
                break;
            case 42:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:761:2: ( ( (lv_name_0_0= 'SPAWN' ) ) ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:761:2: ( ( (lv_name_0_0= 'SPAWN' ) ) ( (otherlv_1= RULE_ID ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:761:3: ( (lv_name_0_0= 'SPAWN' ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:761:3: ( (lv_name_0_0= 'SPAWN' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:762:1: (lv_name_0_0= 'SPAWN' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:762:1: (lv_name_0_0= 'SPAWN' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:763:3: lv_name_0_0= 'SPAWN'
                    {
                    lv_name_0_0=(Token)match(input,22,FOLLOW_22_in_ruleAction1632); 

                            newLeafNode(lv_name_0_0, grammarAccess.getActionAccess().getNameSPAWNKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "SPAWN");
                    	    

                    }


                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:776:2: ( (otherlv_1= RULE_ID ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:777:1: (otherlv_1= RULE_ID )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:777:1: (otherlv_1= RULE_ID )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:778:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction1665); 

                    		newLeafNode(otherlv_1, grammarAccess.getActionAccess().getTokenTokenCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:790:6: ( (lv_name_2_0= 'MOVE' ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:790:6: ( (lv_name_2_0= 'MOVE' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:791:1: (lv_name_2_0= 'MOVE' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:791:1: (lv_name_2_0= 'MOVE' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:792:3: lv_name_2_0= 'MOVE'
                    {
                    lv_name_2_0=(Token)match(input,23,FOLLOW_23_in_ruleAction1690); 

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
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:806:6: ( (lv_name_3_0= 'DESTROY' ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:806:6: ( (lv_name_3_0= 'DESTROY' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:807:1: (lv_name_3_0= 'DESTROY' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:807:1: (lv_name_3_0= 'DESTROY' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:808:3: lv_name_3_0= 'DESTROY'
                    {
                    lv_name_3_0=(Token)match(input,24,FOLLOW_24_in_ruleAction1727); 

                            newLeafNode(lv_name_3_0, grammarAccess.getActionAccess().getNameDESTROYKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "DESTROY");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:822:6: ( ( (lv_name_4_0= 'SELECT' ) ) ( ( (lv_objectOfSelect_5_1= 'TOKEN' | lv_objectOfSelect_5_2= 'FIELD' ) ) ) otherlv_6= 'WHERE' ( (lv_filter_7_0= ruleOrExp ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:822:6: ( ( (lv_name_4_0= 'SELECT' ) ) ( ( (lv_objectOfSelect_5_1= 'TOKEN' | lv_objectOfSelect_5_2= 'FIELD' ) ) ) otherlv_6= 'WHERE' ( (lv_filter_7_0= ruleOrExp ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:822:7: ( (lv_name_4_0= 'SELECT' ) ) ( ( (lv_objectOfSelect_5_1= 'TOKEN' | lv_objectOfSelect_5_2= 'FIELD' ) ) ) otherlv_6= 'WHERE' ( (lv_filter_7_0= ruleOrExp ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:822:7: ( (lv_name_4_0= 'SELECT' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:823:1: (lv_name_4_0= 'SELECT' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:823:1: (lv_name_4_0= 'SELECT' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:824:3: lv_name_4_0= 'SELECT'
                    {
                    lv_name_4_0=(Token)match(input,25,FOLLOW_25_in_ruleAction1765); 

                            newLeafNode(lv_name_4_0, grammarAccess.getActionAccess().getNameSELECTKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_4_0, "SELECT");
                    	    

                    }


                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:837:2: ( ( (lv_objectOfSelect_5_1= 'TOKEN' | lv_objectOfSelect_5_2= 'FIELD' ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:838:1: ( (lv_objectOfSelect_5_1= 'TOKEN' | lv_objectOfSelect_5_2= 'FIELD' ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:838:1: ( (lv_objectOfSelect_5_1= 'TOKEN' | lv_objectOfSelect_5_2= 'FIELD' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:839:1: (lv_objectOfSelect_5_1= 'TOKEN' | lv_objectOfSelect_5_2= 'FIELD' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:839:1: (lv_objectOfSelect_5_1= 'TOKEN' | lv_objectOfSelect_5_2= 'FIELD' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==18) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==26) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:840:3: lv_objectOfSelect_5_1= 'TOKEN'
                            {
                            lv_objectOfSelect_5_1=(Token)match(input,18,FOLLOW_18_in_ruleAction1798); 

                                    newLeafNode(lv_objectOfSelect_5_1, grammarAccess.getActionAccess().getObjectOfSelectTOKENKeyword_3_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActionRule());
                            	        }
                                   		setWithLastConsumed(current, "objectOfSelect", lv_objectOfSelect_5_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:852:8: lv_objectOfSelect_5_2= 'FIELD'
                            {
                            lv_objectOfSelect_5_2=(Token)match(input,26,FOLLOW_26_in_ruleAction1827); 

                                    newLeafNode(lv_objectOfSelect_5_2, grammarAccess.getActionAccess().getObjectOfSelectFIELDKeyword_3_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActionRule());
                            	        }
                                   		setWithLastConsumed(current, "objectOfSelect", lv_objectOfSelect_5_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleAction1855); 

                        	newLeafNode(otherlv_6, grammarAccess.getActionAccess().getWHEREKeyword_3_2());
                        
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:871:1: ( (lv_filter_7_0= ruleOrExp ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:872:1: (lv_filter_7_0= ruleOrExp )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:872:1: (lv_filter_7_0= ruleOrExp )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:873:3: lv_filter_7_0= ruleOrExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getFilterOrExpParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExp_in_ruleAction1876);
                    lv_filter_7_0=ruleOrExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"filter",
                            		lv_filter_7_0, 
                            		"OrExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:890:6: ( (lv_assignment_8_0= ruleValueAssignment ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:890:6: ( (lv_assignment_8_0= ruleValueAssignment ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:891:1: (lv_assignment_8_0= ruleValueAssignment )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:891:1: (lv_assignment_8_0= ruleValueAssignment )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:892:3: lv_assignment_8_0= ruleValueAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getAssignmentValueAssignmentParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueAssignment_in_ruleAction1904);
                    lv_assignment_8_0=ruleValueAssignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"assignment",
                            		lv_assignment_8_0, 
                            		"ValueAssignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:909:6: ( (lv_gotoCondition_9_0= ruleGotoCondition ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:909:6: ( (lv_gotoCondition_9_0= ruleGotoCondition ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:910:1: (lv_gotoCondition_9_0= ruleGotoCondition )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:910:1: (lv_gotoCondition_9_0= ruleGotoCondition )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:911:3: lv_gotoCondition_9_0= ruleGotoCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getGotoConditionGotoConditionParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGotoCondition_in_ruleAction1931);
                    lv_gotoCondition_9_0=ruleGotoCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"gotoCondition",
                            		lv_gotoCondition_9_0, 
                            		"GotoCondition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:928:6: ( (lv_label_10_0= ruleLabel ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:928:6: ( (lv_label_10_0= ruleLabel ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:929:1: (lv_label_10_0= ruleLabel )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:929:1: (lv_label_10_0= ruleLabel )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:930:3: lv_label_10_0= ruleLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getLabelLabelParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabel_in_ruleAction1958);
                    lv_label_10_0=ruleLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_10_0, 
                            		"Label");
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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:954:1: entryRuleOrExp returns [EObject current=null] : iv_ruleOrExp= ruleOrExp EOF ;
    public final EObject entryRuleOrExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExp = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:955:2: (iv_ruleOrExp= ruleOrExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:956:2: iv_ruleOrExp= ruleOrExp EOF
            {
             newCompositeNode(grammarAccess.getOrExpRule()); 
            pushFollow(FOLLOW_ruleOrExp_in_entryRuleOrExp1994);
            iv_ruleOrExp=ruleOrExp();

            state._fsp--;

             current =iv_ruleOrExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExp2004); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:963:1: ruleOrExp returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleAndExp ) ) ( ( (lv_operators_1_0= 'OR' ) ) ( (lv_expressions_2_0= ruleAndExp ) ) )* ) ;
    public final EObject ruleOrExp() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:966:28: ( ( ( (lv_expressions_0_0= ruleAndExp ) ) ( ( (lv_operators_1_0= 'OR' ) ) ( (lv_expressions_2_0= ruleAndExp ) ) )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:967:1: ( ( (lv_expressions_0_0= ruleAndExp ) ) ( ( (lv_operators_1_0= 'OR' ) ) ( (lv_expressions_2_0= ruleAndExp ) ) )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:967:1: ( ( (lv_expressions_0_0= ruleAndExp ) ) ( ( (lv_operators_1_0= 'OR' ) ) ( (lv_expressions_2_0= ruleAndExp ) ) )* )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:967:2: ( (lv_expressions_0_0= ruleAndExp ) ) ( ( (lv_operators_1_0= 'OR' ) ) ( (lv_expressions_2_0= ruleAndExp ) ) )*
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:967:2: ( (lv_expressions_0_0= ruleAndExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:968:1: (lv_expressions_0_0= ruleAndExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:968:1: (lv_expressions_0_0= ruleAndExp )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:969:3: lv_expressions_0_0= ruleAndExp
            {
             
            	        newCompositeNode(grammarAccess.getOrExpAccess().getExpressionsAndExpParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAndExp_in_ruleOrExp2050);
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

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:985:2: ( ( (lv_operators_1_0= 'OR' ) ) ( (lv_expressions_2_0= ruleAndExp ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:985:3: ( (lv_operators_1_0= 'OR' ) ) ( (lv_expressions_2_0= ruleAndExp ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:985:3: ( (lv_operators_1_0= 'OR' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:986:1: (lv_operators_1_0= 'OR' )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:986:1: (lv_operators_1_0= 'OR' )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:987:3: lv_operators_1_0= 'OR'
            	    {
            	    lv_operators_1_0=(Token)match(input,28,FOLLOW_28_in_ruleOrExp2069); 

            	            newLeafNode(lv_operators_1_0, grammarAccess.getOrExpAccess().getOperatorsORKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOrExpRule());
            	    	        }
            	           		addWithLastConsumed(current, "operators", lv_operators_1_0, "OR");
            	    	    

            	    }


            	    }

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1000:2: ( (lv_expressions_2_0= ruleAndExp ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1001:1: (lv_expressions_2_0= ruleAndExp )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1001:1: (lv_expressions_2_0= ruleAndExp )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1002:3: lv_expressions_2_0= ruleAndExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpAccess().getExpressionsAndExpParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExp_in_ruleOrExp2103);
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
            	    break loop12;
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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1026:1: entryRuleAndExp returns [EObject current=null] : iv_ruleAndExp= ruleAndExp EOF ;
    public final EObject entryRuleAndExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExp = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1027:2: (iv_ruleAndExp= ruleAndExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1028:2: iv_ruleAndExp= ruleAndExp EOF
            {
             newCompositeNode(grammarAccess.getAndExpRule()); 
            pushFollow(FOLLOW_ruleAndExp_in_entryRuleAndExp2141);
            iv_ruleAndExp=ruleAndExp();

            state._fsp--;

             current =iv_ruleAndExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExp2151); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1035:1: ruleAndExp returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleBooleanExp ) ) ( ( (lv_operators_1_0= 'AND' ) ) ( (lv_expressions_2_0= ruleBooleanExp ) ) )* ) ;
    public final EObject ruleAndExp() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1038:28: ( ( ( (lv_expressions_0_0= ruleBooleanExp ) ) ( ( (lv_operators_1_0= 'AND' ) ) ( (lv_expressions_2_0= ruleBooleanExp ) ) )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1039:1: ( ( (lv_expressions_0_0= ruleBooleanExp ) ) ( ( (lv_operators_1_0= 'AND' ) ) ( (lv_expressions_2_0= ruleBooleanExp ) ) )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1039:1: ( ( (lv_expressions_0_0= ruleBooleanExp ) ) ( ( (lv_operators_1_0= 'AND' ) ) ( (lv_expressions_2_0= ruleBooleanExp ) ) )* )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1039:2: ( (lv_expressions_0_0= ruleBooleanExp ) ) ( ( (lv_operators_1_0= 'AND' ) ) ( (lv_expressions_2_0= ruleBooleanExp ) ) )*
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1039:2: ( (lv_expressions_0_0= ruleBooleanExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1040:1: (lv_expressions_0_0= ruleBooleanExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1040:1: (lv_expressions_0_0= ruleBooleanExp )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1041:3: lv_expressions_0_0= ruleBooleanExp
            {
             
            	        newCompositeNode(grammarAccess.getAndExpAccess().getExpressionsBooleanExpParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanExp_in_ruleAndExp2197);
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

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1057:2: ( ( (lv_operators_1_0= 'AND' ) ) ( (lv_expressions_2_0= ruleBooleanExp ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1057:3: ( (lv_operators_1_0= 'AND' ) ) ( (lv_expressions_2_0= ruleBooleanExp ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1057:3: ( (lv_operators_1_0= 'AND' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1058:1: (lv_operators_1_0= 'AND' )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1058:1: (lv_operators_1_0= 'AND' )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1059:3: lv_operators_1_0= 'AND'
            	    {
            	    lv_operators_1_0=(Token)match(input,29,FOLLOW_29_in_ruleAndExp2216); 

            	            newLeafNode(lv_operators_1_0, grammarAccess.getAndExpAccess().getOperatorsANDKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndExpRule());
            	    	        }
            	           		addWithLastConsumed(current, "operators", lv_operators_1_0, "AND");
            	    	    

            	    }


            	    }

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1072:2: ( (lv_expressions_2_0= ruleBooleanExp ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1073:1: (lv_expressions_2_0= ruleBooleanExp )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1073:1: (lv_expressions_2_0= ruleBooleanExp )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1074:3: lv_expressions_2_0= ruleBooleanExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpAccess().getExpressionsBooleanExpParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanExp_in_ruleAndExp2250);
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
            	    break loop13;
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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1098:1: entryRuleBooleanExp returns [EObject current=null] : iv_ruleBooleanExp= ruleBooleanExp EOF ;
    public final EObject entryRuleBooleanExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExp = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1099:2: (iv_ruleBooleanExp= ruleBooleanExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1100:2: iv_ruleBooleanExp= ruleBooleanExp EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpRule()); 
            pushFollow(FOLLOW_ruleBooleanExp_in_entryRuleBooleanExp2288);
            iv_ruleBooleanExp=ruleBooleanExp();

            state._fsp--;

             current =iv_ruleBooleanExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExp2298); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1107:1: ruleBooleanExp returns [EObject current=null] : ( ( ( (lv_not_0_0= 'NOT' ) )? ( ( (lv_left_1_0= ruleAttributeOrInt ) ) ( ( (lv_name_2_1= '!==' | lv_name_2_2= '===' | lv_name_2_3= '==' | lv_name_2_4= '!=' | lv_name_2_5= '>' | lv_name_2_6= '>=' | lv_name_2_7= '<' | lv_name_2_8= '<=' ) ) ) ( (lv_right_3_0= ruleAttributeOrInt ) ) ) ) | (otherlv_4= '(' ( (lv_nestedExp_5_0= ruleOrExp ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleBooleanExp() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token lv_name_2_3=null;
        Token lv_name_2_4=null;
        Token lv_name_2_5=null;
        Token lv_name_2_6=null;
        Token lv_name_2_7=null;
        Token lv_name_2_8=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_nestedExp_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1110:28: ( ( ( ( (lv_not_0_0= 'NOT' ) )? ( ( (lv_left_1_0= ruleAttributeOrInt ) ) ( ( (lv_name_2_1= '!==' | lv_name_2_2= '===' | lv_name_2_3= '==' | lv_name_2_4= '!=' | lv_name_2_5= '>' | lv_name_2_6= '>=' | lv_name_2_7= '<' | lv_name_2_8= '<=' ) ) ) ( (lv_right_3_0= ruleAttributeOrInt ) ) ) ) | (otherlv_4= '(' ( (lv_nestedExp_5_0= ruleOrExp ) ) otherlv_6= ')' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1111:1: ( ( ( (lv_not_0_0= 'NOT' ) )? ( ( (lv_left_1_0= ruleAttributeOrInt ) ) ( ( (lv_name_2_1= '!==' | lv_name_2_2= '===' | lv_name_2_3= '==' | lv_name_2_4= '!=' | lv_name_2_5= '>' | lv_name_2_6= '>=' | lv_name_2_7= '<' | lv_name_2_8= '<=' ) ) ) ( (lv_right_3_0= ruleAttributeOrInt ) ) ) ) | (otherlv_4= '(' ( (lv_nestedExp_5_0= ruleOrExp ) ) otherlv_6= ')' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1111:1: ( ( ( (lv_not_0_0= 'NOT' ) )? ( ( (lv_left_1_0= ruleAttributeOrInt ) ) ( ( (lv_name_2_1= '!==' | lv_name_2_2= '===' | lv_name_2_3= '==' | lv_name_2_4= '!=' | lv_name_2_5= '>' | lv_name_2_6= '>=' | lv_name_2_7= '<' | lv_name_2_8= '<=' ) ) ) ( (lv_right_3_0= ruleAttributeOrInt ) ) ) ) | (otherlv_4= '(' ( (lv_nestedExp_5_0= ruleOrExp ) ) otherlv_6= ')' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==30) ) {
                alt16=1;
            }
            else if ( (LA16_0==19) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1111:2: ( ( (lv_not_0_0= 'NOT' ) )? ( ( (lv_left_1_0= ruleAttributeOrInt ) ) ( ( (lv_name_2_1= '!==' | lv_name_2_2= '===' | lv_name_2_3= '==' | lv_name_2_4= '!=' | lv_name_2_5= '>' | lv_name_2_6= '>=' | lv_name_2_7= '<' | lv_name_2_8= '<=' ) ) ) ( (lv_right_3_0= ruleAttributeOrInt ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1111:2: ( ( (lv_not_0_0= 'NOT' ) )? ( ( (lv_left_1_0= ruleAttributeOrInt ) ) ( ( (lv_name_2_1= '!==' | lv_name_2_2= '===' | lv_name_2_3= '==' | lv_name_2_4= '!=' | lv_name_2_5= '>' | lv_name_2_6= '>=' | lv_name_2_7= '<' | lv_name_2_8= '<=' ) ) ) ( (lv_right_3_0= ruleAttributeOrInt ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1111:3: ( (lv_not_0_0= 'NOT' ) )? ( ( (lv_left_1_0= ruleAttributeOrInt ) ) ( ( (lv_name_2_1= '!==' | lv_name_2_2= '===' | lv_name_2_3= '==' | lv_name_2_4= '!=' | lv_name_2_5= '>' | lv_name_2_6= '>=' | lv_name_2_7= '<' | lv_name_2_8= '<=' ) ) ) ( (lv_right_3_0= ruleAttributeOrInt ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1111:3: ( (lv_not_0_0= 'NOT' ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==30) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1112:1: (lv_not_0_0= 'NOT' )
                            {
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1112:1: (lv_not_0_0= 'NOT' )
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1113:3: lv_not_0_0= 'NOT'
                            {
                            lv_not_0_0=(Token)match(input,30,FOLLOW_30_in_ruleBooleanExp2342); 

                                    newLeafNode(lv_not_0_0, grammarAccess.getBooleanExpAccess().getNotNOTKeyword_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "not", lv_not_0_0, "NOT");
                            	    

                            }


                            }
                            break;

                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1126:3: ( ( (lv_left_1_0= ruleAttributeOrInt ) ) ( ( (lv_name_2_1= '!==' | lv_name_2_2= '===' | lv_name_2_3= '==' | lv_name_2_4= '!=' | lv_name_2_5= '>' | lv_name_2_6= '>=' | lv_name_2_7= '<' | lv_name_2_8= '<=' ) ) ) ( (lv_right_3_0= ruleAttributeOrInt ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1126:4: ( (lv_left_1_0= ruleAttributeOrInt ) ) ( ( (lv_name_2_1= '!==' | lv_name_2_2= '===' | lv_name_2_3= '==' | lv_name_2_4= '!=' | lv_name_2_5= '>' | lv_name_2_6= '>=' | lv_name_2_7= '<' | lv_name_2_8= '<=' ) ) ) ( (lv_right_3_0= ruleAttributeOrInt ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1126:4: ( (lv_left_1_0= ruleAttributeOrInt ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1127:1: (lv_left_1_0= ruleAttributeOrInt )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1127:1: (lv_left_1_0= ruleAttributeOrInt )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1128:3: lv_left_1_0= ruleAttributeOrInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanExpAccess().getLeftAttributeOrIntParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeOrInt_in_ruleBooleanExp2378);
                    lv_left_1_0=ruleAttributeOrInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanExpRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_1_0, 
                            		"AttributeOrInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1144:2: ( ( (lv_name_2_1= '!==' | lv_name_2_2= '===' | lv_name_2_3= '==' | lv_name_2_4= '!=' | lv_name_2_5= '>' | lv_name_2_6= '>=' | lv_name_2_7= '<' | lv_name_2_8= '<=' ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1145:1: ( (lv_name_2_1= '!==' | lv_name_2_2= '===' | lv_name_2_3= '==' | lv_name_2_4= '!=' | lv_name_2_5= '>' | lv_name_2_6= '>=' | lv_name_2_7= '<' | lv_name_2_8= '<=' ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1145:1: ( (lv_name_2_1= '!==' | lv_name_2_2= '===' | lv_name_2_3= '==' | lv_name_2_4= '!=' | lv_name_2_5= '>' | lv_name_2_6= '>=' | lv_name_2_7= '<' | lv_name_2_8= '<=' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1146:1: (lv_name_2_1= '!==' | lv_name_2_2= '===' | lv_name_2_3= '==' | lv_name_2_4= '!=' | lv_name_2_5= '>' | lv_name_2_6= '>=' | lv_name_2_7= '<' | lv_name_2_8= '<=' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1146:1: (lv_name_2_1= '!==' | lv_name_2_2= '===' | lv_name_2_3= '==' | lv_name_2_4= '!=' | lv_name_2_5= '>' | lv_name_2_6= '>=' | lv_name_2_7= '<' | lv_name_2_8= '<=' )
                    int alt15=8;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt15=1;
                        }
                        break;
                    case 32:
                        {
                        alt15=2;
                        }
                        break;
                    case 33:
                        {
                        alt15=3;
                        }
                        break;
                    case 34:
                        {
                        alt15=4;
                        }
                        break;
                    case 35:
                        {
                        alt15=5;
                        }
                        break;
                    case 36:
                        {
                        alt15=6;
                        }
                        break;
                    case 37:
                        {
                        alt15=7;
                        }
                        break;
                    case 38:
                        {
                        alt15=8;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }

                    switch (alt15) {
                        case 1 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1147:3: lv_name_2_1= '!=='
                            {
                            lv_name_2_1=(Token)match(input,31,FOLLOW_31_in_ruleBooleanExp2398); 

                                    newLeafNode(lv_name_2_1, grammarAccess.getBooleanExpAccess().getNameExclamationMarkEqualsSignEqualsSignKeyword_0_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1159:8: lv_name_2_2= '==='
                            {
                            lv_name_2_2=(Token)match(input,32,FOLLOW_32_in_ruleBooleanExp2427); 

                                    newLeafNode(lv_name_2_2, grammarAccess.getBooleanExpAccess().getNameEqualsSignEqualsSignEqualsSignKeyword_0_1_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_2_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1171:8: lv_name_2_3= '=='
                            {
                            lv_name_2_3=(Token)match(input,33,FOLLOW_33_in_ruleBooleanExp2456); 

                                    newLeafNode(lv_name_2_3, grammarAccess.getBooleanExpAccess().getNameEqualsSignEqualsSignKeyword_0_1_1_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_2_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1183:8: lv_name_2_4= '!='
                            {
                            lv_name_2_4=(Token)match(input,34,FOLLOW_34_in_ruleBooleanExp2485); 

                                    newLeafNode(lv_name_2_4, grammarAccess.getBooleanExpAccess().getNameExclamationMarkEqualsSignKeyword_0_1_1_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_2_4, null);
                            	    

                            }
                            break;
                        case 5 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1195:8: lv_name_2_5= '>'
                            {
                            lv_name_2_5=(Token)match(input,35,FOLLOW_35_in_ruleBooleanExp2514); 

                                    newLeafNode(lv_name_2_5, grammarAccess.getBooleanExpAccess().getNameGreaterThanSignKeyword_0_1_1_0_4());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_2_5, null);
                            	    

                            }
                            break;
                        case 6 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1207:8: lv_name_2_6= '>='
                            {
                            lv_name_2_6=(Token)match(input,36,FOLLOW_36_in_ruleBooleanExp2543); 

                                    newLeafNode(lv_name_2_6, grammarAccess.getBooleanExpAccess().getNameGreaterThanSignEqualsSignKeyword_0_1_1_0_5());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_2_6, null);
                            	    

                            }
                            break;
                        case 7 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1219:8: lv_name_2_7= '<'
                            {
                            lv_name_2_7=(Token)match(input,37,FOLLOW_37_in_ruleBooleanExp2572); 

                                    newLeafNode(lv_name_2_7, grammarAccess.getBooleanExpAccess().getNameLessThanSignKeyword_0_1_1_0_6());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_2_7, null);
                            	    

                            }
                            break;
                        case 8 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1231:8: lv_name_2_8= '<='
                            {
                            lv_name_2_8=(Token)match(input,38,FOLLOW_38_in_ruleBooleanExp2601); 

                                    newLeafNode(lv_name_2_8, grammarAccess.getBooleanExpAccess().getNameLessThanSignEqualsSignKeyword_0_1_1_0_7());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanExpRule());
                            	        }
                                   		setWithLastConsumed(current, "name", lv_name_2_8, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1246:2: ( (lv_right_3_0= ruleAttributeOrInt ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1247:1: (lv_right_3_0= ruleAttributeOrInt )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1247:1: (lv_right_3_0= ruleAttributeOrInt )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1248:3: lv_right_3_0= ruleAttributeOrInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanExpAccess().getRightAttributeOrIntParserRuleCall_0_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeOrInt_in_ruleBooleanExp2638);
                    lv_right_3_0=ruleAttributeOrInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanExpRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"AttributeOrInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1265:6: (otherlv_4= '(' ( (lv_nestedExp_5_0= ruleOrExp ) ) otherlv_6= ')' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1265:6: (otherlv_4= '(' ( (lv_nestedExp_5_0= ruleOrExp ) ) otherlv_6= ')' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1265:8: otherlv_4= '(' ( (lv_nestedExp_5_0= ruleOrExp ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleBooleanExp2659); 

                        	newLeafNode(otherlv_4, grammarAccess.getBooleanExpAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1269:1: ( (lv_nestedExp_5_0= ruleOrExp ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1270:1: (lv_nestedExp_5_0= ruleOrExp )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1270:1: (lv_nestedExp_5_0= ruleOrExp )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1271:3: lv_nestedExp_5_0= ruleOrExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanExpAccess().getNestedExpOrExpParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExp_in_ruleBooleanExp2680);
                    lv_nestedExp_5_0=ruleOrExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanExpRule());
                    	        }
                           		set(
                           			current, 
                           			"nestedExp",
                            		lv_nestedExp_5_0, 
                            		"OrExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleBooleanExp2692); 

                        	newLeafNode(otherlv_6, grammarAccess.getBooleanExpAccess().getRightParenthesisKeyword_1_2());
                        

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1299:1: entryRuleAttributeName returns [EObject current=null] : iv_ruleAttributeName= ruleAttributeName EOF ;
    public final EObject entryRuleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeName = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1300:2: (iv_ruleAttributeName= ruleAttributeName EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1301:2: iv_ruleAttributeName= ruleAttributeName EOF
            {
             newCompositeNode(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_ruleAttributeName_in_entryRuleAttributeName2729);
            iv_ruleAttributeName=ruleAttributeName();

            state._fsp--;

             current =iv_ruleAttributeName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeName2739); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1308:1: ruleAttributeName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_child_3_0= ruleAttributeName ) ) ) ) ;
    public final EObject ruleAttributeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_parent_1_0=null;
        Token otherlv_2=null;
        EObject lv_child_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1311:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_child_3_0= ruleAttributeName ) ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1312:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_child_3_0= ruleAttributeName ) ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1312:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_child_3_0= ruleAttributeName ) ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==39) ) {
                    alt17=2;
                }
                else if ( (LA17_1==EOF||LA17_1==RULE_ID||LA17_1==14||(LA17_1>=21 && LA17_1<=25)||(LA17_1>=28 && LA17_1<=29)||(LA17_1>=31 && LA17_1<=38)||(LA17_1>=40 && LA17_1<=47)) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1312:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1312:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1313:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1313:1: (lv_name_0_0= RULE_ID )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1314:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeName2781); 

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
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1331:6: ( ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_child_3_0= ruleAttributeName ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1331:6: ( ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_child_3_0= ruleAttributeName ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1331:7: ( (lv_parent_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_child_3_0= ruleAttributeName ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1331:7: ( (lv_parent_1_0= RULE_ID ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1332:1: (lv_parent_1_0= RULE_ID )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1332:1: (lv_parent_1_0= RULE_ID )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1333:3: lv_parent_1_0= RULE_ID
                    {
                    lv_parent_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeName2810); 

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

                    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleAttributeName2827); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeNameAccess().getFullStopKeyword_1_1());
                        
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1353:1: ( (lv_child_3_0= ruleAttributeName ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1354:1: (lv_child_3_0= ruleAttributeName )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1354:1: (lv_child_3_0= ruleAttributeName )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1355:3: lv_child_3_0= ruleAttributeName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeNameAccess().getChildAttributeNameParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeName_in_ruleAttributeName2848);
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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1379:1: entryRuleAttributeOrInt returns [EObject current=null] : iv_ruleAttributeOrInt= ruleAttributeOrInt EOF ;
    public final EObject entryRuleAttributeOrInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeOrInt = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1380:2: (iv_ruleAttributeOrInt= ruleAttributeOrInt EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1381:2: iv_ruleAttributeOrInt= ruleAttributeOrInt EOF
            {
             newCompositeNode(grammarAccess.getAttributeOrIntRule()); 
            pushFollow(FOLLOW_ruleAttributeOrInt_in_entryRuleAttributeOrInt2885);
            iv_ruleAttributeOrInt=ruleAttributeOrInt();

            state._fsp--;

             current =iv_ruleAttributeOrInt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeOrInt2895); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1388:1: ruleAttributeOrInt returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleAttributeName ) ) | ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleAttributeOrInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject lv_attribute_0_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1391:28: ( ( ( (lv_attribute_0_0= ruleAttributeName ) ) | ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1392:1: ( ( (lv_attribute_0_0= ruleAttributeName ) ) | ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1392:1: ( ( (lv_attribute_0_0= ruleAttributeName ) ) | ( (lv_value_1_0= RULE_INT ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_INT) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1392:2: ( (lv_attribute_0_0= ruleAttributeName ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1392:2: ( (lv_attribute_0_0= ruleAttributeName ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1393:1: (lv_attribute_0_0= ruleAttributeName )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1393:1: (lv_attribute_0_0= ruleAttributeName )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1394:3: lv_attribute_0_0= ruleAttributeName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeOrIntAccess().getAttributeAttributeNameParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeName_in_ruleAttributeOrInt2941);
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
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1411:6: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1411:6: ( (lv_value_1_0= RULE_INT ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1412:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1412:1: (lv_value_1_0= RULE_INT )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1413:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAttributeOrInt2964); 

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


    // $ANTLR start "entryRuleGotoCondition"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1437:1: entryRuleGotoCondition returns [EObject current=null] : iv_ruleGotoCondition= ruleGotoCondition EOF ;
    public final EObject entryRuleGotoCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGotoCondition = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1438:2: (iv_ruleGotoCondition= ruleGotoCondition EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1439:2: iv_ruleGotoCondition= ruleGotoCondition EOF
            {
             newCompositeNode(grammarAccess.getGotoConditionRule()); 
            pushFollow(FOLLOW_ruleGotoCondition_in_entryRuleGotoCondition3005);
            iv_ruleGotoCondition=ruleGotoCondition();

            state._fsp--;

             current =iv_ruleGotoCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGotoCondition3015); 

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
    // $ANTLR end "entryRuleGotoCondition"


    // $ANTLR start "ruleGotoCondition"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1446:1: ruleGotoCondition returns [EObject current=null] : (otherlv_0= 'IF' ( (lv_condition_1_0= ruleOrExp ) ) ( (lv_name_2_0= 'GOTO' ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleGotoCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_condition_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1449:28: ( (otherlv_0= 'IF' ( (lv_condition_1_0= ruleOrExp ) ) ( (lv_name_2_0= 'GOTO' ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1450:1: (otherlv_0= 'IF' ( (lv_condition_1_0= ruleOrExp ) ) ( (lv_name_2_0= 'GOTO' ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1450:1: (otherlv_0= 'IF' ( (lv_condition_1_0= ruleOrExp ) ) ( (lv_name_2_0= 'GOTO' ) ) ( (otherlv_3= RULE_ID ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1450:3: otherlv_0= 'IF' ( (lv_condition_1_0= ruleOrExp ) ) ( (lv_name_2_0= 'GOTO' ) ) ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleGotoCondition3052); 

                	newLeafNode(otherlv_0, grammarAccess.getGotoConditionAccess().getIFKeyword_0());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1454:1: ( (lv_condition_1_0= ruleOrExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1455:1: (lv_condition_1_0= ruleOrExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1455:1: (lv_condition_1_0= ruleOrExp )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1456:3: lv_condition_1_0= ruleOrExp
            {
             
            	        newCompositeNode(grammarAccess.getGotoConditionAccess().getConditionOrExpParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOrExp_in_ruleGotoCondition3073);
            lv_condition_1_0=ruleOrExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGotoConditionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"OrExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1472:2: ( (lv_name_2_0= 'GOTO' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1473:1: (lv_name_2_0= 'GOTO' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1473:1: (lv_name_2_0= 'GOTO' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1474:3: lv_name_2_0= 'GOTO'
            {
            lv_name_2_0=(Token)match(input,41,FOLLOW_41_in_ruleGotoCondition3091); 

                    newLeafNode(lv_name_2_0, grammarAccess.getGotoConditionAccess().getNameGOTOKeyword_2_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGotoConditionRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_2_0, "GOTO");
            	    

            }


            }

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1487:2: ( (otherlv_3= RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1488:1: (otherlv_3= RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1488:1: (otherlv_3= RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1489:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGotoConditionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGotoCondition3124); 

            		newLeafNode(otherlv_3, grammarAccess.getGotoConditionAccess().getGotoLabelCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleGotoCondition"


    // $ANTLR start "entryRuleLabel"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1508:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1509:2: (iv_ruleLabel= ruleLabel EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1510:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel3160);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel3170); 

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1517:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'LABEL' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1520:28: ( (otherlv_0= 'LABEL' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1521:1: (otherlv_0= 'LABEL' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1521:1: (otherlv_0= 'LABEL' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1521:3: otherlv_0= 'LABEL' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleLabel3207); 

                	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLABELKeyword_0());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1525:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1526:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1526:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1527:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel3224); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleAdditionExp"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1551:1: entryRuleAdditionExp returns [EObject current=null] : iv_ruleAdditionExp= ruleAdditionExp EOF ;
    public final EObject entryRuleAdditionExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExp = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1552:2: (iv_ruleAdditionExp= ruleAdditionExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1553:2: iv_ruleAdditionExp= ruleAdditionExp EOF
            {
             newCompositeNode(grammarAccess.getAdditionExpRule()); 
            pushFollow(FOLLOW_ruleAdditionExp_in_entryRuleAdditionExp3265);
            iv_ruleAdditionExp=ruleAdditionExp();

            state._fsp--;

             current =iv_ruleAdditionExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionExp3275); 

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
    // $ANTLR end "entryRuleAdditionExp"


    // $ANTLR start "ruleAdditionExp"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1560:1: ruleAdditionExp returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleMultiplicationExp ) ) ( ( ( (lv_operators_1_1= '+' | lv_operators_1_2= '-' ) ) ) ( (lv_expressions_2_0= ruleMultiplicationExp ) ) )* ) ;
    public final EObject ruleAdditionExp() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_1=null;
        Token lv_operators_1_2=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1563:28: ( ( ( (lv_expressions_0_0= ruleMultiplicationExp ) ) ( ( ( (lv_operators_1_1= '+' | lv_operators_1_2= '-' ) ) ) ( (lv_expressions_2_0= ruleMultiplicationExp ) ) )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1564:1: ( ( (lv_expressions_0_0= ruleMultiplicationExp ) ) ( ( ( (lv_operators_1_1= '+' | lv_operators_1_2= '-' ) ) ) ( (lv_expressions_2_0= ruleMultiplicationExp ) ) )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1564:1: ( ( (lv_expressions_0_0= ruleMultiplicationExp ) ) ( ( ( (lv_operators_1_1= '+' | lv_operators_1_2= '-' ) ) ) ( (lv_expressions_2_0= ruleMultiplicationExp ) ) )* )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1564:2: ( (lv_expressions_0_0= ruleMultiplicationExp ) ) ( ( ( (lv_operators_1_1= '+' | lv_operators_1_2= '-' ) ) ) ( (lv_expressions_2_0= ruleMultiplicationExp ) ) )*
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1564:2: ( (lv_expressions_0_0= ruleMultiplicationExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1565:1: (lv_expressions_0_0= ruleMultiplicationExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1565:1: (lv_expressions_0_0= ruleMultiplicationExp )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1566:3: lv_expressions_0_0= ruleMultiplicationExp
            {
             
            	        newCompositeNode(grammarAccess.getAdditionExpAccess().getExpressionsMultiplicationExpParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicationExp_in_ruleAdditionExp3321);
            lv_expressions_0_0=ruleMultiplicationExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdditionExpRule());
            	        }
                   		add(
                   			current, 
                   			"expressions",
                    		lv_expressions_0_0, 
                    		"MultiplicationExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1582:2: ( ( ( (lv_operators_1_1= '+' | lv_operators_1_2= '-' ) ) ) ( (lv_expressions_2_0= ruleMultiplicationExp ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=43 && LA20_0<=44)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1582:3: ( ( (lv_operators_1_1= '+' | lv_operators_1_2= '-' ) ) ) ( (lv_expressions_2_0= ruleMultiplicationExp ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1582:3: ( ( (lv_operators_1_1= '+' | lv_operators_1_2= '-' ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1583:1: ( (lv_operators_1_1= '+' | lv_operators_1_2= '-' ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1583:1: ( (lv_operators_1_1= '+' | lv_operators_1_2= '-' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1584:1: (lv_operators_1_1= '+' | lv_operators_1_2= '-' )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1584:1: (lv_operators_1_1= '+' | lv_operators_1_2= '-' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==43) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==44) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1585:3: lv_operators_1_1= '+'
            	            {
            	            lv_operators_1_1=(Token)match(input,43,FOLLOW_43_in_ruleAdditionExp3342); 

            	                    newLeafNode(lv_operators_1_1, grammarAccess.getAdditionExpAccess().getOperatorsPlusSignKeyword_1_0_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAdditionExpRule());
            	            	        }
            	                   		addWithLastConsumed(current, "operators", lv_operators_1_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1597:8: lv_operators_1_2= '-'
            	            {
            	            lv_operators_1_2=(Token)match(input,44,FOLLOW_44_in_ruleAdditionExp3371); 

            	                    newLeafNode(lv_operators_1_2, grammarAccess.getAdditionExpAccess().getOperatorsHyphenMinusKeyword_1_0_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAdditionExpRule());
            	            	        }
            	                   		addWithLastConsumed(current, "operators", lv_operators_1_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1612:2: ( (lv_expressions_2_0= ruleMultiplicationExp ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1613:1: (lv_expressions_2_0= ruleMultiplicationExp )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1613:1: (lv_expressions_2_0= ruleMultiplicationExp )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1614:3: lv_expressions_2_0= ruleMultiplicationExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionExpAccess().getExpressionsMultiplicationExpParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicationExp_in_ruleAdditionExp3408);
            	    lv_expressions_2_0=ruleMultiplicationExp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionExpRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_2_0, 
            	            		"MultiplicationExp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleAdditionExp"


    // $ANTLR start "entryRuleMultiplicationExp"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1638:1: entryRuleMultiplicationExp returns [EObject current=null] : iv_ruleMultiplicationExp= ruleMultiplicationExp EOF ;
    public final EObject entryRuleMultiplicationExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExp = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1639:2: (iv_ruleMultiplicationExp= ruleMultiplicationExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1640:2: iv_ruleMultiplicationExp= ruleMultiplicationExp EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationExpRule()); 
            pushFollow(FOLLOW_ruleMultiplicationExp_in_entryRuleMultiplicationExp3446);
            iv_ruleMultiplicationExp=ruleMultiplicationExp();

            state._fsp--;

             current =iv_ruleMultiplicationExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationExp3456); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1647:1: ruleMultiplicationExp returns [EObject current=null] : ( ( ( (lv_expressions_0_0= ruleAttributeOrInt ) ) ( ( ( (lv_operators_1_1= '*' | lv_operators_1_2= '/' ) ) ) ( (lv_expressions_2_0= ruleAttributeOrInt ) ) )* ) | (otherlv_3= '(' ( (lv_nestedExp_4_0= ruleAdditionExp ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleMultiplicationExp() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_1=null;
        Token lv_operators_1_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;

        EObject lv_nestedExp_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1650:28: ( ( ( ( (lv_expressions_0_0= ruleAttributeOrInt ) ) ( ( ( (lv_operators_1_1= '*' | lv_operators_1_2= '/' ) ) ) ( (lv_expressions_2_0= ruleAttributeOrInt ) ) )* ) | (otherlv_3= '(' ( (lv_nestedExp_4_0= ruleAdditionExp ) ) otherlv_5= ')' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1651:1: ( ( ( (lv_expressions_0_0= ruleAttributeOrInt ) ) ( ( ( (lv_operators_1_1= '*' | lv_operators_1_2= '/' ) ) ) ( (lv_expressions_2_0= ruleAttributeOrInt ) ) )* ) | (otherlv_3= '(' ( (lv_nestedExp_4_0= ruleAdditionExp ) ) otherlv_5= ')' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1651:1: ( ( ( (lv_expressions_0_0= ruleAttributeOrInt ) ) ( ( ( (lv_operators_1_1= '*' | lv_operators_1_2= '/' ) ) ) ( (lv_expressions_2_0= ruleAttributeOrInt ) ) )* ) | (otherlv_3= '(' ( (lv_nestedExp_4_0= ruleAdditionExp ) ) otherlv_5= ')' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_INT)) ) {
                alt23=1;
            }
            else if ( (LA23_0==19) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1651:2: ( ( (lv_expressions_0_0= ruleAttributeOrInt ) ) ( ( ( (lv_operators_1_1= '*' | lv_operators_1_2= '/' ) ) ) ( (lv_expressions_2_0= ruleAttributeOrInt ) ) )* )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1651:2: ( ( (lv_expressions_0_0= ruleAttributeOrInt ) ) ( ( ( (lv_operators_1_1= '*' | lv_operators_1_2= '/' ) ) ) ( (lv_expressions_2_0= ruleAttributeOrInt ) ) )* )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1651:3: ( (lv_expressions_0_0= ruleAttributeOrInt ) ) ( ( ( (lv_operators_1_1= '*' | lv_operators_1_2= '/' ) ) ) ( (lv_expressions_2_0= ruleAttributeOrInt ) ) )*
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1651:3: ( (lv_expressions_0_0= ruleAttributeOrInt ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1652:1: (lv_expressions_0_0= ruleAttributeOrInt )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1652:1: (lv_expressions_0_0= ruleAttributeOrInt )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1653:3: lv_expressions_0_0= ruleAttributeOrInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiplicationExpAccess().getExpressionsAttributeOrIntParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeOrInt_in_ruleMultiplicationExp3503);
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

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1669:2: ( ( ( (lv_operators_1_1= '*' | lv_operators_1_2= '/' ) ) ) ( (lv_expressions_2_0= ruleAttributeOrInt ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>=45 && LA22_0<=46)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1669:3: ( ( (lv_operators_1_1= '*' | lv_operators_1_2= '/' ) ) ) ( (lv_expressions_2_0= ruleAttributeOrInt ) )
                    	    {
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1669:3: ( ( (lv_operators_1_1= '*' | lv_operators_1_2= '/' ) ) )
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1670:1: ( (lv_operators_1_1= '*' | lv_operators_1_2= '/' ) )
                    	    {
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1670:1: ( (lv_operators_1_1= '*' | lv_operators_1_2= '/' ) )
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1671:1: (lv_operators_1_1= '*' | lv_operators_1_2= '/' )
                    	    {
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1671:1: (lv_operators_1_1= '*' | lv_operators_1_2= '/' )
                    	    int alt21=2;
                    	    int LA21_0 = input.LA(1);

                    	    if ( (LA21_0==45) ) {
                    	        alt21=1;
                    	    }
                    	    else if ( (LA21_0==46) ) {
                    	        alt21=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 21, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt21) {
                    	        case 1 :
                    	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1672:3: lv_operators_1_1= '*'
                    	            {
                    	            lv_operators_1_1=(Token)match(input,45,FOLLOW_45_in_ruleMultiplicationExp3524); 

                    	                    newLeafNode(lv_operators_1_1, grammarAccess.getMultiplicationExpAccess().getOperatorsAsteriskKeyword_0_1_0_0_0());
                    	                

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getMultiplicationExpRule());
                    	            	        }
                    	                   		addWithLastConsumed(current, "operators", lv_operators_1_1, null);
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1684:8: lv_operators_1_2= '/'
                    	            {
                    	            lv_operators_1_2=(Token)match(input,46,FOLLOW_46_in_ruleMultiplicationExp3553); 

                    	                    newLeafNode(lv_operators_1_2, grammarAccess.getMultiplicationExpAccess().getOperatorsSolidusKeyword_0_1_0_0_1());
                    	                

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getMultiplicationExpRule());
                    	            	        }
                    	                   		addWithLastConsumed(current, "operators", lv_operators_1_2, null);
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1699:2: ( (lv_expressions_2_0= ruleAttributeOrInt ) )
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1700:1: (lv_expressions_2_0= ruleAttributeOrInt )
                    	    {
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1700:1: (lv_expressions_2_0= ruleAttributeOrInt )
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1701:3: lv_expressions_2_0= ruleAttributeOrInt
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultiplicationExpAccess().getExpressionsAttributeOrIntParserRuleCall_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttributeOrInt_in_ruleMultiplicationExp3590);
                    	    lv_expressions_2_0=ruleAttributeOrInt();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultiplicationExpRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressions",
                    	            		lv_expressions_2_0, 
                    	            		"AttributeOrInt");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1718:6: (otherlv_3= '(' ( (lv_nestedExp_4_0= ruleAdditionExp ) ) otherlv_5= ')' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1718:6: (otherlv_3= '(' ( (lv_nestedExp_4_0= ruleAdditionExp ) ) otherlv_5= ')' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1718:8: otherlv_3= '(' ( (lv_nestedExp_4_0= ruleAdditionExp ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleMultiplicationExp3612); 

                        	newLeafNode(otherlv_3, grammarAccess.getMultiplicationExpAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1722:1: ( (lv_nestedExp_4_0= ruleAdditionExp ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1723:1: (lv_nestedExp_4_0= ruleAdditionExp )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1723:1: (lv_nestedExp_4_0= ruleAdditionExp )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1724:3: lv_nestedExp_4_0= ruleAdditionExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultiplicationExpAccess().getNestedExpAdditionExpParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditionExp_in_ruleMultiplicationExp3633);
                    lv_nestedExp_4_0=ruleAdditionExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultiplicationExpRule());
                    	        }
                           		set(
                           			current, 
                           			"nestedExp",
                            		lv_nestedExp_4_0, 
                            		"AdditionExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleMultiplicationExp3645); 

                        	newLeafNode(otherlv_5, grammarAccess.getMultiplicationExpAccess().getRightParenthesisKeyword_1_2());
                        

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1752:1: entryRuleValueAssignment returns [EObject current=null] : iv_ruleValueAssignment= ruleValueAssignment EOF ;
    public final EObject entryRuleValueAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueAssignment = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1753:2: (iv_ruleValueAssignment= ruleValueAssignment EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1754:2: iv_ruleValueAssignment= ruleValueAssignment EOF
            {
             newCompositeNode(grammarAccess.getValueAssignmentRule()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment3682);
            iv_ruleValueAssignment=ruleValueAssignment();

            state._fsp--;

             current =iv_ruleValueAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueAssignment3692); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1761:1: ruleValueAssignment returns [EObject current=null] : ( ( (lv_name_0_0= ruleAttributeName ) ) otherlv_1= '=' ( (lv_addition_2_0= ruleAdditionExp ) ) ) ;
    public final EObject ruleValueAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_0_0 = null;

        EObject lv_addition_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1764:28: ( ( ( (lv_name_0_0= ruleAttributeName ) ) otherlv_1= '=' ( (lv_addition_2_0= ruleAdditionExp ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1765:1: ( ( (lv_name_0_0= ruleAttributeName ) ) otherlv_1= '=' ( (lv_addition_2_0= ruleAdditionExp ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1765:1: ( ( (lv_name_0_0= ruleAttributeName ) ) otherlv_1= '=' ( (lv_addition_2_0= ruleAdditionExp ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1765:2: ( (lv_name_0_0= ruleAttributeName ) ) otherlv_1= '=' ( (lv_addition_2_0= ruleAdditionExp ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1765:2: ( (lv_name_0_0= ruleAttributeName ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1766:1: (lv_name_0_0= ruleAttributeName )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1766:1: (lv_name_0_0= ruleAttributeName )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1767:3: lv_name_0_0= ruleAttributeName
            {
             
            	        newCompositeNode(grammarAccess.getValueAssignmentAccess().getNameAttributeNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeName_in_ruleValueAssignment3738);
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

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleValueAssignment3750); 

                	newLeafNode(otherlv_1, grammarAccess.getValueAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1787:1: ( (lv_addition_2_0= ruleAdditionExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1788:1: (lv_addition_2_0= ruleAdditionExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1788:1: (lv_addition_2_0= ruleAdditionExp )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1789:3: lv_addition_2_0= ruleAdditionExp
            {
             
            	        newCompositeNode(grammarAccess.getValueAssignmentAccess().getAdditionAdditionExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAdditionExp_in_ruleValueAssignment3771);
            lv_addition_2_0=ruleAdditionExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"addition",
                    		lv_addition_2_0, 
                    		"AdditionExp");
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


    // $ANTLR start "entryRuleSimpleAssignment"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1813:1: entryRuleSimpleAssignment returns [EObject current=null] : iv_ruleSimpleAssignment= ruleSimpleAssignment EOF ;
    public final EObject entryRuleSimpleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAssignment = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1814:2: (iv_ruleSimpleAssignment= ruleSimpleAssignment EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1815:2: iv_ruleSimpleAssignment= ruleSimpleAssignment EOF
            {
             newCompositeNode(grammarAccess.getSimpleAssignmentRule()); 
            pushFollow(FOLLOW_ruleSimpleAssignment_in_entryRuleSimpleAssignment3807);
            iv_ruleSimpleAssignment=ruleSimpleAssignment();

            state._fsp--;

             current =iv_ruleSimpleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAssignment3817); 

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
    // $ANTLR end "entryRuleSimpleAssignment"


    // $ANTLR start "ruleSimpleAssignment"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1822:1: ruleSimpleAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attribute_2_0= ruleAttributeOrInt ) ) ) ;
    public final EObject ruleSimpleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_attribute_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1825:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attribute_2_0= ruleAttributeOrInt ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1826:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attribute_2_0= ruleAttributeOrInt ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1826:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attribute_2_0= ruleAttributeOrInt ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1826:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attribute_2_0= ruleAttributeOrInt ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1826:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1827:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1827:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1828:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleAssignment3859); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSimpleAssignmentAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleSimpleAssignment3876); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1848:1: ( (lv_attribute_2_0= ruleAttributeOrInt ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1849:1: (lv_attribute_2_0= ruleAttributeOrInt )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1849:1: (lv_attribute_2_0= ruleAttributeOrInt )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:1850:3: lv_attribute_2_0= ruleAttributeOrInt
            {
             
            	        newCompositeNode(grammarAccess.getSimpleAssignmentAccess().getAttributeAttributeOrIntParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeOrInt_in_ruleSimpleAssignment3897);
            lv_attribute_2_0=ruleAttributeOrInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"attribute",
                    		lv_attribute_2_0, 
                    		"AttributeOrInt");
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
    // $ANTLR end "ruleSimpleAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel184 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rulePlayer_in_ruleModel210 = new BitSet(new long[]{0x0000000000058802L});
    public static final BitSet FOLLOW_ruleBoard_in_ruleModel286 = new BitSet(new long[]{0x0000000000058802L});
    public static final BitSet FOLLOW_ruleToken_in_ruleModel361 = new BitSet(new long[]{0x0000000000058802L});
    public static final BitSet FOLLOW_ruleRules_in_ruleModel437 = new BitSet(new long[]{0x0000000000058802L});
    public static final BitSet FOLLOW_rulePlayer_in_entryRulePlayer518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlayer528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePlayer571 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePlayer601 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePlayer618 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleSimpleAssignment_in_rulePlayer639 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_rulePlayer652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoard_in_entryRuleBoard688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoard698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBoard741 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBoard766 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleSimpleAssignment_in_ruleBoard787 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleField_in_ruleBoard809 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleBoard822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRules_in_entryRuleRules858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRules868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRules911 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRules936 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleTurnRules_in_ruleRules957 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRules969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnRules_in_entryRuleTurnRules1005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnRules1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTurnRules1058 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTurnRules1083 = new BitSet(new long[]{0x0000050003C04010L});
    public static final BitSet FOLLOW_ruleAction_in_ruleTurnRules1104 = new BitSet(new long[]{0x0000050003C04010L});
    public static final BitSet FOLLOW_14_in_ruleTurnRules1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_entryRuleToken1153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToken1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleToken1200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleToken1217 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleToken1234 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleSimpleAssignment_in_ruleToken1255 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleToken1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1356 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleField1373 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1390 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleField1407 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1424 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleField1441 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1458 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleField1475 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleField1487 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1507 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleSimpleAssignment_in_ruleField1529 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleField1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAction1632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAction1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAction1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAction1765 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_18_in_ruleAction1798 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26_in_ruleAction1827 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAction1855 = new BitSet(new long[]{0x0000000040080030L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleAction1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_ruleAction1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGotoCondition_in_ruleAction1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleAction1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_entryRuleOrExp1994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExp2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleOrExp2050 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleOrExp2069 = new BitSet(new long[]{0x0000000040080030L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleOrExp2103 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_entryRuleAndExp2141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExp2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_ruleAndExp2197 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleAndExp2216 = new BitSet(new long[]{0x0000000040080030L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_ruleAndExp2250 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_entryRuleBooleanExp2288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExp2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBooleanExp2342 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_ruleBooleanExp2378 = new BitSet(new long[]{0x0000007F80000000L});
    public static final BitSet FOLLOW_31_in_ruleBooleanExp2398 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_32_in_ruleBooleanExp2427 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_33_in_ruleBooleanExp2456 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_34_in_ruleBooleanExp2485 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_35_in_ruleBooleanExp2514 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_36_in_ruleBooleanExp2543 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_37_in_ruleBooleanExp2572 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_38_in_ruleBooleanExp2601 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_ruleBooleanExp2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBooleanExp2659 = new BitSet(new long[]{0x0000000040080030L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleBooleanExp2680 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBooleanExp2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_entryRuleAttributeName2729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeName2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeName2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeName2810 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleAttributeName2827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleAttributeName2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_entryRuleAttributeOrInt2885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeOrInt2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleAttributeOrInt2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAttributeOrInt2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGotoCondition_in_entryRuleGotoCondition3005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGotoCondition3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleGotoCondition3052 = new BitSet(new long[]{0x0000000040080030L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleGotoCondition3073 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleGotoCondition3091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGotoCondition3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel3160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLabel3207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExp_in_entryRuleAdditionExp3265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExp3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExp_in_ruleAdditionExp3321 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleAdditionExp3342 = new BitSet(new long[]{0x0000000040080030L});
    public static final BitSet FOLLOW_44_in_ruleAdditionExp3371 = new BitSet(new long[]{0x0000000040080030L});
    public static final BitSet FOLLOW_ruleMultiplicationExp_in_ruleAdditionExp3408 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExp_in_entryRuleMultiplicationExp3446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExp3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_ruleMultiplicationExp3503 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_45_in_ruleMultiplicationExp3524 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_46_in_ruleMultiplicationExp3553 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_ruleMultiplicationExp3590 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_19_in_ruleMultiplicationExp3612 = new BitSet(new long[]{0x0000000040080030L});
    public static final BitSet FOLLOW_ruleAdditionExp_in_ruleMultiplicationExp3633 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMultiplicationExp3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment3682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueAssignment3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleValueAssignment3738 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleValueAssignment3750 = new BitSet(new long[]{0x0000000040080030L});
    public static final BitSet FOLLOW_ruleAdditionExp_in_ruleValueAssignment3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAssignment_in_entryRuleSimpleAssignment3807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAssignment3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleAssignment3859 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleSimpleAssignment3876 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_ruleSimpleAssignment3897 = new BitSet(new long[]{0x0000000000000002L});

}
