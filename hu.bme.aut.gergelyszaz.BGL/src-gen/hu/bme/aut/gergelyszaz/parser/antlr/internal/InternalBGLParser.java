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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'Players'", "'{'", "'}'", "'Board'", "'Rules'", "'Turn'", "'Token'", "'('", "','", "')'", "':'", "';'", "'Spawn'", "'Move'", "'Select'", "'token'", "'field'", "'='"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:76:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?) ) ) ;
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
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:79:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:83:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            	
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:86:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?)
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+ {...}?
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_board_4_0= ruleBoard ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tokens_5_0= ruleToken ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRules ) ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=5;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( (LA2_0==RULE_ID|| LA2_0 >=14 && LA2_0<=15) && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
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
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:90:5: {...}? => ( ({...}? => (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
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
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:94:16: (otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:94:18: otherlv_1= 'Game' ( (lv_name_2_0= RULE_ID ) ) ( (lv_player_3_0= rulePlayer ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleModel167); 

            	        	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getGameKeyword_0_0());
            	        
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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:256:1: rulePlayer returns [EObject current=null] : ( ( (lv_name_0_0= 'Players' ) ) ( (lv_playercount_1_0= RULE_INT ) ) (otherlv_2= '{' ( (lv_attributes_3_0= ruleVariable ) )* otherlv_4= '}' )? ) ;
    public final EObject rulePlayer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_playercount_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:259:28: ( ( ( (lv_name_0_0= 'Players' ) ) ( (lv_playercount_1_0= RULE_INT ) ) (otherlv_2= '{' ( (lv_attributes_3_0= ruleVariable ) )* otherlv_4= '}' )? ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:260:1: ( ( (lv_name_0_0= 'Players' ) ) ( (lv_playercount_1_0= RULE_INT ) ) (otherlv_2= '{' ( (lv_attributes_3_0= ruleVariable ) )* otherlv_4= '}' )? )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:260:1: ( ( (lv_name_0_0= 'Players' ) ) ( (lv_playercount_1_0= RULE_INT ) ) (otherlv_2= '{' ( (lv_attributes_3_0= ruleVariable ) )* otherlv_4= '}' )? )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:260:2: ( (lv_name_0_0= 'Players' ) ) ( (lv_playercount_1_0= RULE_INT ) ) (otherlv_2= '{' ( (lv_attributes_3_0= ruleVariable ) )* otherlv_4= '}' )?
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:260:2: ( (lv_name_0_0= 'Players' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:261:1: (lv_name_0_0= 'Players' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:261:1: (lv_name_0_0= 'Players' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:262:3: lv_name_0_0= 'Players'
            {
            lv_name_0_0=(Token)match(input,12,FOLLOW_12_in_rulePlayer571); 

                    newLeafNode(lv_name_0_0, grammarAccess.getPlayerAccess().getNamePlayersKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlayerRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Players");
            	    

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

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:293:2: (otherlv_2= '{' ( (lv_attributes_3_0= ruleVariable ) )* otherlv_4= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:293:4: otherlv_2= '{' ( (lv_attributes_3_0= ruleVariable ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePlayer619); 

                        	newLeafNode(otherlv_2, grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:297:1: ( (lv_attributes_3_0= ruleVariable ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:298:1: (lv_attributes_3_0= ruleVariable )
                    	    {
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:298:1: (lv_attributes_3_0= ruleVariable )
                    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:299:3: lv_attributes_3_0= ruleVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPlayerAccess().getAttributesVariableParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVariable_in_rulePlayer640);
                    	    lv_attributes_3_0=ruleVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPlayerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_3_0, 
                    	            		"Variable");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_rulePlayer653); 

                        	newLeafNode(otherlv_4, grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_2_2());
                        

                    }
                    break;

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:327:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:328:2: (iv_ruleBoard= ruleBoard EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:329:2: iv_ruleBoard= ruleBoard EOF
            {
             newCompositeNode(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_ruleBoard_in_entryRuleBoard691);
            iv_ruleBoard=ruleBoard();

            state._fsp--;

             current =iv_ruleBoard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoard701); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:336:1: ruleBoard returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_fields_3_0 = null;

        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:339:28: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:340:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:340:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) ) ) ) )+ {...}?) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:342:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) ) ) ) )+ {...}?) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:342:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) ) ) ) )+ {...}?) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:343:2: ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBoardAccess().getUnorderedGroup());
            	
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:346:2: ( ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) ) ) ) )+ {...}?)
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:347:3: ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) ) ) ) )+ {...}?
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:347:3: ( ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    int LA7_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0) ) {
                        alt7=1;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA7_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1) ) {
                        alt7=2;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA7_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1) ) {
                        alt7=2;
                    }


                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:349:4: ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:349:4: ({...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:350:5: {...}? => ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBoard", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:350:100: ( ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:351:6: ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoardAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:354:6: ({...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:354:7: {...}? => ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoard", "true");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:354:16: ( ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )* )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:354:17: ( (lv_name_1_0= 'Board' ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) )*
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:354:17: ( (lv_name_1_0= 'Board' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:355:1: (lv_name_1_0= 'Board' )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:355:1: (lv_name_1_0= 'Board' )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:356:3: lv_name_1_0= 'Board'
            	    {
            	    lv_name_1_0=(Token)match(input,15,FOLLOW_15_in_ruleBoard789); 

            	            newLeafNode(lv_name_1_0, grammarAccess.getBoardAccess().getNameBoardKeyword_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getBoardRule());
            	    	        }
            	           		setWithLastConsumed(current, "name", lv_name_1_0, "Board");
            	    	    

            	    }


            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleBoard814); 

            	        	newLeafNode(otherlv_2, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_0_1());
            	        
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:373:1: ( (lv_fields_3_0= ruleField ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_ID) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( (LA5_2==19) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:374:1: (lv_fields_3_0= ruleField )
            	    	    {
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:374:1: (lv_fields_3_0= ruleField )
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:375:3: lv_fields_3_0= ruleField
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getBoardAccess().getFieldsFieldParserRuleCall_0_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleField_in_ruleBoard835);
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


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoardAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:398:4: ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) ) ) )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:398:4: ({...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:399:5: {...}? => ( ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBoard", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:399:100: ( ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:400:6: ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBoardAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:403:6: ({...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' ) )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:403:7: {...}? => ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBoard", "true");
            	    }
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:403:16: ( ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}' )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:403:17: ( (lv_attributes_4_0= ruleVariable ) )* otherlv_5= '}'
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:403:17: ( (lv_attributes_4_0= ruleVariable ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==RULE_ID) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:404:1: (lv_attributes_4_0= ruleVariable )
            	    	    {
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:404:1: (lv_attributes_4_0= ruleVariable )
            	    	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:405:3: lv_attributes_4_0= ruleVariable
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getBoardAccess().getAttributesVariableParserRuleCall_1_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleVariable_in_ruleBoard913);
            	    	    lv_attributes_4_0=ruleVariable();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getBoardRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"attributes",
            	    	            		lv_attributes_4_0, 
            	    	            		"Variable");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleBoard926); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_1_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoardAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:448:1: entryRuleRules returns [EObject current=null] : iv_ruleRules= ruleRules EOF ;
    public final EObject entryRuleRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRules = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:449:2: (iv_ruleRules= ruleRules EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:450:2: iv_ruleRules= ruleRules EOF
            {
             newCompositeNode(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_ruleRules_in_entryRuleRules1008);
            iv_ruleRules=ruleRules();

            state._fsp--;

             current =iv_ruleRules; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRules1018); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:457:1: ruleRules returns [EObject current=null] : ( ( (lv_name_0_0= 'Rules' ) ) otherlv_1= '{' ( (lv_turnrules_2_0= ruleTurnRules ) ) otherlv_3= '}' ) ;
    public final EObject ruleRules() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_turnrules_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:460:28: ( ( ( (lv_name_0_0= 'Rules' ) ) otherlv_1= '{' ( (lv_turnrules_2_0= ruleTurnRules ) ) otherlv_3= '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:461:1: ( ( (lv_name_0_0= 'Rules' ) ) otherlv_1= '{' ( (lv_turnrules_2_0= ruleTurnRules ) ) otherlv_3= '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:461:1: ( ( (lv_name_0_0= 'Rules' ) ) otherlv_1= '{' ( (lv_turnrules_2_0= ruleTurnRules ) ) otherlv_3= '}' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:461:2: ( (lv_name_0_0= 'Rules' ) ) otherlv_1= '{' ( (lv_turnrules_2_0= ruleTurnRules ) ) otherlv_3= '}'
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:461:2: ( (lv_name_0_0= 'Rules' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:462:1: (lv_name_0_0= 'Rules' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:462:1: (lv_name_0_0= 'Rules' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:463:3: lv_name_0_0= 'Rules'
            {
            lv_name_0_0=(Token)match(input,16,FOLLOW_16_in_ruleRules1061); 

                    newLeafNode(lv_name_0_0, grammarAccess.getRulesAccess().getNameRulesKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRulesRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Rules");
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleRules1086); 

                	newLeafNode(otherlv_1, grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_1());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:480:1: ( (lv_turnrules_2_0= ruleTurnRules ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:481:1: (lv_turnrules_2_0= ruleTurnRules )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:481:1: (lv_turnrules_2_0= ruleTurnRules )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:482:3: lv_turnrules_2_0= ruleTurnRules
            {
             
            	        newCompositeNode(grammarAccess.getRulesAccess().getTurnrulesTurnRulesParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTurnRules_in_ruleRules1107);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleRules1119); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:510:1: entryRuleTurnRules returns [EObject current=null] : iv_ruleTurnRules= ruleTurnRules EOF ;
    public final EObject entryRuleTurnRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnRules = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:511:2: (iv_ruleTurnRules= ruleTurnRules EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:512:2: iv_ruleTurnRules= ruleTurnRules EOF
            {
             newCompositeNode(grammarAccess.getTurnRulesRule()); 
            pushFollow(FOLLOW_ruleTurnRules_in_entryRuleTurnRules1155);
            iv_ruleTurnRules=ruleTurnRules();

            state._fsp--;

             current =iv_ruleTurnRules; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnRules1165); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:519:1: ruleTurnRules returns [EObject current=null] : ( ( (lv_name_0_0= 'Turn' ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' ) ;
    public final EObject ruleTurnRules() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:522:28: ( ( ( (lv_name_0_0= 'Turn' ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:523:1: ( ( (lv_name_0_0= 'Turn' ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:523:1: ( ( (lv_name_0_0= 'Turn' ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:523:2: ( (lv_name_0_0= 'Turn' ) ) otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}'
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:523:2: ( (lv_name_0_0= 'Turn' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:524:1: (lv_name_0_0= 'Turn' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:524:1: (lv_name_0_0= 'Turn' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:525:3: lv_name_0_0= 'Turn'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_17_in_ruleTurnRules1208); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTurnRulesAccess().getNameTurnKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTurnRulesRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Turn");
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleTurnRules1233); 

                	newLeafNode(otherlv_1, grammarAccess.getTurnRulesAccess().getLeftCurlyBracketKeyword_1());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:542:1: ( (lv_actions_2_0= ruleAction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=24 && LA8_0<=26)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:543:1: (lv_actions_2_0= ruleAction )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:543:1: (lv_actions_2_0= ruleAction )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:544:3: lv_actions_2_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTurnRulesAccess().getActionsActionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleTurnRules1254);
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
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleTurnRules1267); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:572:1: entryRuleToken returns [EObject current=null] : iv_ruleToken= ruleToken EOF ;
    public final EObject entryRuleToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToken = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:573:2: (iv_ruleToken= ruleToken EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:574:2: iv_ruleToken= ruleToken EOF
            {
             newCompositeNode(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_ruleToken_in_entryRuleToken1303);
            iv_ruleToken=ruleToken();

            state._fsp--;

             current =iv_ruleToken; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToken1313); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:581:1: ruleToken returns [EObject current=null] : (otherlv_0= 'Token' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:584:28: ( (otherlv_0= 'Token' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:585:1: (otherlv_0= 'Token' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:585:1: (otherlv_0= 'Token' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:585:3: otherlv_0= 'Token' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleToken1350); 

                	newLeafNode(otherlv_0, grammarAccess.getTokenAccess().getTokenKeyword_0());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:589:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:590:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:590:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:591:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleToken1367); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleToken1384); 

                	newLeafNode(otherlv_2, grammarAccess.getTokenAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleToken1396); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:623:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:624:2: (iv_ruleField= ruleField EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:625:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1432);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1442); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:632:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* ( (lv_variables_10_0= ruleVariable ) )* otherlv_11= ';' ) ;
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
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:635:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* ( (lv_variables_10_0= ruleVariable ) )* otherlv_11= ';' ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:636:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* ( (lv_variables_10_0= ruleVariable ) )* otherlv_11= ';' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:636:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* ( (lv_variables_10_0= ruleVariable ) )* otherlv_11= ';' )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:636:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= ':' ( (otherlv_9= RULE_ID ) )* ( (lv_variables_10_0= ruleVariable ) )* otherlv_11= ';'
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:636:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:637:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:637:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:638:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1484); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleField1501); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getLeftParenthesisKeyword_1());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:658:1: ( (lv_x_2_0= RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:659:1: (lv_x_2_0= RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:659:1: (lv_x_2_0= RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:660:3: lv_x_2_0= RULE_INT
            {
            lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1518); 

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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleField1535); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getCommaKeyword_3());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:680:1: ( (lv_y_4_0= RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:681:1: (lv_y_4_0= RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:681:1: (lv_y_4_0= RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:682:3: lv_y_4_0= RULE_INT
            {
            lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1552); 

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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleField1569); 

                	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getCommaKeyword_5());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:702:1: ( (lv_z_6_0= RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:703:1: (lv_z_6_0= RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:703:1: (lv_z_6_0= RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:704:3: lv_z_6_0= RULE_INT
            {
            lv_z_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleField1586); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleField1603); 

                	newLeafNode(otherlv_7, grammarAccess.getFieldAccess().getRightParenthesisKeyword_7());
                
            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleField1615); 

                	newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getColonKeyword_8());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:728:1: ( (otherlv_9= RULE_ID ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==RULE_ID||LA9_1==23) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:729:1: (otherlv_9= RULE_ID )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:729:1: (otherlv_9= RULE_ID )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:730:3: otherlv_9= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFieldRule());
            	    	        }
            	            
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1635); 

            	    		newLeafNode(otherlv_9, grammarAccess.getFieldAccess().getNeighboursFieldCrossReference_9_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:741:3: ( (lv_variables_10_0= ruleVariable ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:742:1: (lv_variables_10_0= ruleVariable )
            	    {
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:742:1: (lv_variables_10_0= ruleVariable )
            	    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:743:3: lv_variables_10_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldAccess().getVariablesVariableParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleField1657);
            	    lv_variables_10_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_10_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleField1670); 

                	newLeafNode(otherlv_11, grammarAccess.getFieldAccess().getSemicolonKeyword_11());
                

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:771:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:772:2: (iv_ruleAction= ruleAction EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:773:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1706);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1716); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:780:1: ruleAction returns [EObject current=null] : ( ( ( (lv_name_0_0= 'Spawn' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_name_2_0= 'Move' ) ) | ( ( (lv_name_3_0= 'Select' ) ) ( ( (lv_objectOfSelect_4_1= 'token' | lv_objectOfSelect_4_2= 'field' ) ) ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_objectOfSelect_4_1=null;
        Token lv_objectOfSelect_4_2=null;

         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:783:28: ( ( ( ( (lv_name_0_0= 'Spawn' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_name_2_0= 'Move' ) ) | ( ( (lv_name_3_0= 'Select' ) ) ( ( (lv_objectOfSelect_4_1= 'token' | lv_objectOfSelect_4_2= 'field' ) ) ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:784:1: ( ( ( (lv_name_0_0= 'Spawn' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_name_2_0= 'Move' ) ) | ( ( (lv_name_3_0= 'Select' ) ) ( ( (lv_objectOfSelect_4_1= 'token' | lv_objectOfSelect_4_2= 'field' ) ) ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:784:1: ( ( ( (lv_name_0_0= 'Spawn' ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (lv_name_2_0= 'Move' ) ) | ( ( (lv_name_3_0= 'Select' ) ) ( ( (lv_objectOfSelect_4_1= 'token' | lv_objectOfSelect_4_2= 'field' ) ) ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt12=1;
                }
                break;
            case 25:
                {
                alt12=2;
                }
                break;
            case 26:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:784:2: ( ( (lv_name_0_0= 'Spawn' ) ) ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:784:2: ( ( (lv_name_0_0= 'Spawn' ) ) ( (otherlv_1= RULE_ID ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:784:3: ( (lv_name_0_0= 'Spawn' ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:784:3: ( (lv_name_0_0= 'Spawn' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:785:1: (lv_name_0_0= 'Spawn' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:785:1: (lv_name_0_0= 'Spawn' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:786:3: lv_name_0_0= 'Spawn'
                    {
                    lv_name_0_0=(Token)match(input,24,FOLLOW_24_in_ruleAction1760); 

                            newLeafNode(lv_name_0_0, grammarAccess.getActionAccess().getNameSpawnKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "Spawn");
                    	    

                    }


                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:799:2: ( (otherlv_1= RULE_ID ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:800:1: (otherlv_1= RULE_ID )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:800:1: (otherlv_1= RULE_ID )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:801:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction1793); 

                    		newLeafNode(otherlv_1, grammarAccess.getActionAccess().getTokenTokenCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:813:6: ( (lv_name_2_0= 'Move' ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:813:6: ( (lv_name_2_0= 'Move' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:814:1: (lv_name_2_0= 'Move' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:814:1: (lv_name_2_0= 'Move' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:815:3: lv_name_2_0= 'Move'
                    {
                    lv_name_2_0=(Token)match(input,25,FOLLOW_25_in_ruleAction1818); 

                            newLeafNode(lv_name_2_0, grammarAccess.getActionAccess().getNameMoveKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_2_0, "Move");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:829:6: ( ( (lv_name_3_0= 'Select' ) ) ( ( (lv_objectOfSelect_4_1= 'token' | lv_objectOfSelect_4_2= 'field' ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:829:6: ( ( (lv_name_3_0= 'Select' ) ) ( ( (lv_objectOfSelect_4_1= 'token' | lv_objectOfSelect_4_2= 'field' ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:829:7: ( (lv_name_3_0= 'Select' ) ) ( ( (lv_objectOfSelect_4_1= 'token' | lv_objectOfSelect_4_2= 'field' ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:829:7: ( (lv_name_3_0= 'Select' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:830:1: (lv_name_3_0= 'Select' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:830:1: (lv_name_3_0= 'Select' )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:831:3: lv_name_3_0= 'Select'
                    {
                    lv_name_3_0=(Token)match(input,26,FOLLOW_26_in_ruleAction1856); 

                            newLeafNode(lv_name_3_0, grammarAccess.getActionAccess().getNameSelectKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "Select");
                    	    

                    }


                    }

                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:844:2: ( ( (lv_objectOfSelect_4_1= 'token' | lv_objectOfSelect_4_2= 'field' ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:845:1: ( (lv_objectOfSelect_4_1= 'token' | lv_objectOfSelect_4_2= 'field' ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:845:1: ( (lv_objectOfSelect_4_1= 'token' | lv_objectOfSelect_4_2= 'field' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:846:1: (lv_objectOfSelect_4_1= 'token' | lv_objectOfSelect_4_2= 'field' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:846:1: (lv_objectOfSelect_4_1= 'token' | lv_objectOfSelect_4_2= 'field' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==27) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==28) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:847:3: lv_objectOfSelect_4_1= 'token'
                            {
                            lv_objectOfSelect_4_1=(Token)match(input,27,FOLLOW_27_in_ruleAction1889); 

                                    newLeafNode(lv_objectOfSelect_4_1, grammarAccess.getActionAccess().getObjectOfSelectTokenKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActionRule());
                            	        }
                                   		setWithLastConsumed(current, "objectOfSelect", lv_objectOfSelect_4_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:859:8: lv_objectOfSelect_4_2= 'field'
                            {
                            lv_objectOfSelect_4_2=(Token)match(input,28,FOLLOW_28_in_ruleAction1918); 

                                    newLeafNode(lv_objectOfSelect_4_2, grammarAccess.getActionAccess().getObjectOfSelectFieldKeyword_2_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActionRule());
                            	        }
                                   		setWithLastConsumed(current, "objectOfSelect", lv_objectOfSelect_4_2, null);
                            	    

                            }
                            break;

                    }


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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleVariable"
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:882:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:883:2: (iv_ruleVariable= ruleVariable EOF )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:884:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1971);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1981); 

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
    // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:891:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:894:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:895:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:895:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:895:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:895:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:896:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:896:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:897:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2023); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleVariable2040); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
                
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:917:1: ( (lv_value_2_0= RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:918:1: (lv_value_2_0= RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:918:1: (lv_value_2_0= RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL/src-gen/hu/bme/aut/gergelyszaz/parser/antlr/internal/InternalBGL.g:919:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariable2057); 

            			newLeafNode(lv_value_2_0, grammarAccess.getVariableAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
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
    // $ANTLR end "ruleVariable"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel184 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rulePlayer_in_ruleModel210 = new BitSet(new long[]{0x000000000005C812L});
    public static final BitSet FOLLOW_ruleBoard_in_ruleModel286 = new BitSet(new long[]{0x000000000005C812L});
    public static final BitSet FOLLOW_ruleToken_in_ruleModel361 = new BitSet(new long[]{0x000000000005C812L});
    public static final BitSet FOLLOW_ruleRules_in_ruleModel437 = new BitSet(new long[]{0x000000000005C812L});
    public static final BitSet FOLLOW_rulePlayer_in_entryRulePlayer518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlayer528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePlayer571 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePlayer601 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_rulePlayer619 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleVariable_in_rulePlayer640 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_rulePlayer653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoard_in_entryRuleBoard691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoard701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBoard789 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBoard814 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_ruleField_in_ruleBoard835 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleBoard913 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleBoard926 = new BitSet(new long[]{0x000000000000C012L});
    public static final BitSet FOLLOW_ruleRules_in_entryRuleRules1008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRules1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRules1061 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRules1086 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleTurnRules_in_ruleRules1107 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRules1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnRules_in_entryRuleTurnRules1155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnRules1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTurnRules1208 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTurnRules1233 = new BitSet(new long[]{0x0000000007004000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleTurnRules1254 = new BitSet(new long[]{0x0000000007004000L});
    public static final BitSet FOLLOW_14_in_ruleTurnRules1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_entryRuleToken1303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToken1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleToken1350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleToken1367 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleToken1384 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleToken1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1484 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleField1501 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1518 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleField1535 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1552 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleField1569 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleField1586 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleField1603 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleField1615 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1635 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleField1657 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleField1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAction1760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAction1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAction1856 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleAction1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAction1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2023 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleVariable2040 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariable2057 = new BitSet(new long[]{0x0000000000000002L});

}
