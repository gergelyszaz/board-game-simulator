package hu.bme.aut.gergelyszaz.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import hu.bme.aut.gergelyszaz.services.BGLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBGLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TOKEN'", "'FIELD'", "'!=='", "'==='", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'GAME'", "'{'", "'}'", "'('", "','", "')'", "':'", "';'", "'WHERE'", "'.'", "'-'", "'/'", "'='", "'PLAYERS'", "'BOARD'", "'RULES'", "'TURN'", "'SPAWN'", "'MOVE'", "'SELECT'", "'OR'", "'AND'", "'+'", "'*'"
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
    public String getGrammarFileName() { return "../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g"; }


     
     	private BGLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BGLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:61:1: ( ruleModel EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:62:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:69:1: ruleModel : ( ( rule__Model__UnorderedGroup ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:73:2: ( ( ( rule__Model__UnorderedGroup ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:74:1: ( ( rule__Model__UnorderedGroup ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:74:1: ( ( rule__Model__UnorderedGroup ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:75:1: ( rule__Model__UnorderedGroup )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getUnorderedGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:76:1: ( rule__Model__UnorderedGroup )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:76:2: rule__Model__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup_in_ruleModel94);
            rule__Model__UnorderedGroup();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getUnorderedGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePlayer"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:88:1: entryRulePlayer : rulePlayer EOF ;
    public final void entryRulePlayer() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:89:1: ( rulePlayer EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:90:1: rulePlayer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerRule()); 
            }
            pushFollow(FOLLOW_rulePlayer_in_entryRulePlayer121);
            rulePlayer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlayer128); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:97:1: rulePlayer : ( ( rule__Player__Group__0 ) ) ;
    public final void rulePlayer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:101:2: ( ( ( rule__Player__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:102:1: ( ( rule__Player__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:102:1: ( ( rule__Player__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:103:1: ( rule__Player__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:104:1: ( rule__Player__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:104:2: rule__Player__Group__0
            {
            pushFollow(FOLLOW_rule__Player__Group__0_in_rulePlayer154);
            rule__Player__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleBoard"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:116:1: entryRuleBoard : ruleBoard EOF ;
    public final void entryRuleBoard() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:117:1: ( ruleBoard EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:118:1: ruleBoard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardRule()); 
            }
            pushFollow(FOLLOW_ruleBoard_in_entryRuleBoard181);
            ruleBoard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoard188); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:125:1: ruleBoard : ( ( rule__Board__UnorderedGroup ) ) ;
    public final void ruleBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:129:2: ( ( ( rule__Board__UnorderedGroup ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:130:1: ( ( rule__Board__UnorderedGroup ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:130:1: ( ( rule__Board__UnorderedGroup ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:131:1: ( rule__Board__UnorderedGroup )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getUnorderedGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:132:1: ( rule__Board__UnorderedGroup )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:132:2: rule__Board__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__Board__UnorderedGroup_in_ruleBoard214);
            rule__Board__UnorderedGroup();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getUnorderedGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleRules"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:144:1: entryRuleRules : ruleRules EOF ;
    public final void entryRuleRules() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:145:1: ( ruleRules EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:146:1: ruleRules EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesRule()); 
            }
            pushFollow(FOLLOW_ruleRules_in_entryRuleRules241);
            ruleRules();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRules248); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:153:1: ruleRules : ( ( rule__Rules__Group__0 ) ) ;
    public final void ruleRules() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:157:2: ( ( ( rule__Rules__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:158:1: ( ( rule__Rules__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:158:1: ( ( rule__Rules__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:159:1: ( rule__Rules__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:160:1: ( rule__Rules__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:160:2: rule__Rules__Group__0
            {
            pushFollow(FOLLOW_rule__Rules__Group__0_in_ruleRules274);
            rule__Rules__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleTurnRules"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:172:1: entryRuleTurnRules : ruleTurnRules EOF ;
    public final void entryRuleTurnRules() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:173:1: ( ruleTurnRules EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:174:1: ruleTurnRules EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesRule()); 
            }
            pushFollow(FOLLOW_ruleTurnRules_in_entryRuleTurnRules301);
            ruleTurnRules();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnRulesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnRules308); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurnRules"


    // $ANTLR start "ruleTurnRules"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:181:1: ruleTurnRules : ( ( rule__TurnRules__Group__0 ) ) ;
    public final void ruleTurnRules() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:185:2: ( ( ( rule__TurnRules__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:186:1: ( ( rule__TurnRules__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:186:1: ( ( rule__TurnRules__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:187:1: ( rule__TurnRules__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:188:1: ( rule__TurnRules__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:188:2: rule__TurnRules__Group__0
            {
            pushFollow(FOLLOW_rule__TurnRules__Group__0_in_ruleTurnRules334);
            rule__TurnRules__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnRulesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnRules"


    // $ANTLR start "entryRuleToken"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:200:1: entryRuleToken : ruleToken EOF ;
    public final void entryRuleToken() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:201:1: ( ruleToken EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:202:1: ruleToken EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenRule()); 
            }
            pushFollow(FOLLOW_ruleToken_in_entryRuleToken361);
            ruleToken();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleToken368); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:209:1: ruleToken : ( ( rule__Token__Group__0 ) ) ;
    public final void ruleToken() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:213:2: ( ( ( rule__Token__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:214:1: ( ( rule__Token__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:214:1: ( ( rule__Token__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:215:1: ( rule__Token__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:216:1: ( rule__Token__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:216:2: rule__Token__Group__0
            {
            pushFollow(FOLLOW_rule__Token__Group__0_in_ruleToken394);
            rule__Token__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleField"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:228:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:229:1: ( ruleField EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:230:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField421);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField428); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:237:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:241:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:242:1: ( ( rule__Field__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:242:1: ( ( rule__Field__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:243:1: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:244:1: ( rule__Field__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:244:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField454);
            rule__Field__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleAction"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:256:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:257:1: ( ruleAction EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:258:1: ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction481);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction488); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:265:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:269:2: ( ( ( rule__Action__Alternatives ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:270:1: ( ( rule__Action__Alternatives ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:270:1: ( ( rule__Action__Alternatives ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:271:1: ( rule__Action__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getAlternatives()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:272:1: ( rule__Action__Alternatives )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:272:2: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_rule__Action__Alternatives_in_ruleAction514);
            rule__Action__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleOrExp"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:284:1: entryRuleOrExp : ruleOrExp EOF ;
    public final void entryRuleOrExp() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:285:1: ( ruleOrExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:286:1: ruleOrExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpRule()); 
            }
            pushFollow(FOLLOW_ruleOrExp_in_entryRuleOrExp541);
            ruleOrExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExp548); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExp"


    // $ANTLR start "ruleOrExp"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:293:1: ruleOrExp : ( ( rule__OrExp__Group__0 ) ) ;
    public final void ruleOrExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:297:2: ( ( ( rule__OrExp__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:298:1: ( ( rule__OrExp__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:298:1: ( ( rule__OrExp__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:299:1: ( rule__OrExp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:300:1: ( rule__OrExp__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:300:2: rule__OrExp__Group__0
            {
            pushFollow(FOLLOW_rule__OrExp__Group__0_in_ruleOrExp574);
            rule__OrExp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExp"


    // $ANTLR start "entryRuleAndExp"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:312:1: entryRuleAndExp : ruleAndExp EOF ;
    public final void entryRuleAndExp() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:313:1: ( ruleAndExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:314:1: ruleAndExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpRule()); 
            }
            pushFollow(FOLLOW_ruleAndExp_in_entryRuleAndExp601);
            ruleAndExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExp608); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExp"


    // $ANTLR start "ruleAndExp"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:321:1: ruleAndExp : ( ( rule__AndExp__Group__0 ) ) ;
    public final void ruleAndExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:325:2: ( ( ( rule__AndExp__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:326:1: ( ( rule__AndExp__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:326:1: ( ( rule__AndExp__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:327:1: ( rule__AndExp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:328:1: ( rule__AndExp__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:328:2: rule__AndExp__Group__0
            {
            pushFollow(FOLLOW_rule__AndExp__Group__0_in_ruleAndExp634);
            rule__AndExp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExp"


    // $ANTLR start "entryRuleBooleanExp"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:340:1: entryRuleBooleanExp : ruleBooleanExp EOF ;
    public final void entryRuleBooleanExp() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:341:1: ( ruleBooleanExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:342:1: ruleBooleanExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExp_in_entryRuleBooleanExp661);
            ruleBooleanExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExp668); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanExp"


    // $ANTLR start "ruleBooleanExp"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:349:1: ruleBooleanExp : ( ( rule__BooleanExp__Alternatives ) ) ;
    public final void ruleBooleanExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:353:2: ( ( ( rule__BooleanExp__Alternatives ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:354:1: ( ( rule__BooleanExp__Alternatives ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:354:1: ( ( rule__BooleanExp__Alternatives ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:355:1: ( rule__BooleanExp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getAlternatives()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:356:1: ( rule__BooleanExp__Alternatives )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:356:2: rule__BooleanExp__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanExp__Alternatives_in_ruleBooleanExp694);
            rule__BooleanExp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExp"


    // $ANTLR start "entryRuleAttributeName"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:368:1: entryRuleAttributeName : ruleAttributeName EOF ;
    public final void entryRuleAttributeName() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:369:1: ( ruleAttributeName EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:370:1: ruleAttributeName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeNameRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeName_in_entryRuleAttributeName721);
            ruleAttributeName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeName728); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeName"


    // $ANTLR start "ruleAttributeName"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:377:1: ruleAttributeName : ( ( rule__AttributeName__Alternatives ) ) ;
    public final void ruleAttributeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:381:2: ( ( ( rule__AttributeName__Alternatives ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:382:1: ( ( rule__AttributeName__Alternatives ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:382:1: ( ( rule__AttributeName__Alternatives ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:383:1: ( rule__AttributeName__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeNameAccess().getAlternatives()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:384:1: ( rule__AttributeName__Alternatives )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:384:2: rule__AttributeName__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeName__Alternatives_in_ruleAttributeName754);
            rule__AttributeName__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeNameAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeName"


    // $ANTLR start "entryRuleAttributeOrInt"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:396:1: entryRuleAttributeOrInt : ruleAttributeOrInt EOF ;
    public final void entryRuleAttributeOrInt() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:397:1: ( ruleAttributeOrInt EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:398:1: ruleAttributeOrInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeOrIntRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeOrInt_in_entryRuleAttributeOrInt781);
            ruleAttributeOrInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeOrIntRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeOrInt788); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeOrInt"


    // $ANTLR start "ruleAttributeOrInt"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:405:1: ruleAttributeOrInt : ( ( rule__AttributeOrInt__Alternatives ) ) ;
    public final void ruleAttributeOrInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:409:2: ( ( ( rule__AttributeOrInt__Alternatives ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:410:1: ( ( rule__AttributeOrInt__Alternatives ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:410:1: ( ( rule__AttributeOrInt__Alternatives ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:411:1: ( rule__AttributeOrInt__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeOrIntAccess().getAlternatives()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:412:1: ( rule__AttributeOrInt__Alternatives )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:412:2: rule__AttributeOrInt__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeOrInt__Alternatives_in_ruleAttributeOrInt814);
            rule__AttributeOrInt__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeOrIntAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeOrInt"


    // $ANTLR start "entryRuleAddtionExp"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:424:1: entryRuleAddtionExp : ruleAddtionExp EOF ;
    public final void entryRuleAddtionExp() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:425:1: ( ruleAddtionExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:426:1: ruleAddtionExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddtionExpRule()); 
            }
            pushFollow(FOLLOW_ruleAddtionExp_in_entryRuleAddtionExp841);
            ruleAddtionExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddtionExpRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddtionExp848); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddtionExp"


    // $ANTLR start "ruleAddtionExp"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:433:1: ruleAddtionExp : ( ( rule__AddtionExp__Group__0 ) ) ;
    public final void ruleAddtionExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:437:2: ( ( ( rule__AddtionExp__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:438:1: ( ( rule__AddtionExp__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:438:1: ( ( rule__AddtionExp__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:439:1: ( rule__AddtionExp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddtionExpAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:440:1: ( rule__AddtionExp__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:440:2: rule__AddtionExp__Group__0
            {
            pushFollow(FOLLOW_rule__AddtionExp__Group__0_in_ruleAddtionExp874);
            rule__AddtionExp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddtionExpAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddtionExp"


    // $ANTLR start "entryRuleMultiplicationExp"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:452:1: entryRuleMultiplicationExp : ruleMultiplicationExp EOF ;
    public final void entryRuleMultiplicationExp() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:453:1: ( ruleMultiplicationExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:454:1: ruleMultiplicationExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExp_in_entryRuleMultiplicationExp901);
            ruleMultiplicationExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationExp908); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicationExp"


    // $ANTLR start "ruleMultiplicationExp"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:461:1: ruleMultiplicationExp : ( ( rule__MultiplicationExp__Alternatives ) ) ;
    public final void ruleMultiplicationExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:465:2: ( ( ( rule__MultiplicationExp__Alternatives ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:466:1: ( ( rule__MultiplicationExp__Alternatives ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:466:1: ( ( rule__MultiplicationExp__Alternatives ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:467:1: ( rule__MultiplicationExp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getAlternatives()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:468:1: ( rule__MultiplicationExp__Alternatives )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:468:2: rule__MultiplicationExp__Alternatives
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Alternatives_in_ruleMultiplicationExp934);
            rule__MultiplicationExp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationExp"


    // $ANTLR start "entryRuleValueAssignment"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:480:1: entryRuleValueAssignment : ruleValueAssignment EOF ;
    public final void entryRuleValueAssignment() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:481:1: ( ruleValueAssignment EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:482:1: ruleValueAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment961);
            ruleValueAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueAssignment968); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueAssignment"


    // $ANTLR start "ruleValueAssignment"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:489:1: ruleValueAssignment : ( ( rule__ValueAssignment__Group__0 ) ) ;
    public final void ruleValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:493:2: ( ( ( rule__ValueAssignment__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:494:1: ( ( rule__ValueAssignment__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:494:1: ( ( rule__ValueAssignment__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:495:1: ( rule__ValueAssignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAssignmentAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:496:1: ( rule__ValueAssignment__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:496:2: rule__ValueAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__0_in_ruleValueAssignment994);
            rule__ValueAssignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAssignmentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueAssignment"


    // $ANTLR start "rule__Action__Alternatives"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:508:1: rule__Action__Alternatives : ( ( ( rule__Action__Group_0__0 ) ) | ( ( rule__Action__NameAssignment_1 ) ) | ( ( rule__Action__Group_2__0 ) ) | ( ( rule__Action__AssignmentAssignment_3 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:512:1: ( ( ( rule__Action__Group_0__0 ) ) | ( ( rule__Action__NameAssignment_1 ) ) | ( ( rule__Action__Group_2__0 ) ) | ( ( rule__Action__AssignmentAssignment_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt1=1;
                }
                break;
            case 39:
                {
                alt1=2;
                }
                break;
            case 40:
                {
                alt1=3;
                }
                break;
            case RULE_ID:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:513:1: ( ( rule__Action__Group_0__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:513:1: ( ( rule__Action__Group_0__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:514:1: ( rule__Action__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getGroup_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:515:1: ( rule__Action__Group_0__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:515:2: rule__Action__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_0__0_in_rule__Action__Alternatives1030);
                    rule__Action__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:519:6: ( ( rule__Action__NameAssignment_1 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:519:6: ( ( rule__Action__NameAssignment_1 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:520:1: ( rule__Action__NameAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getNameAssignment_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:521:1: ( rule__Action__NameAssignment_1 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:521:2: rule__Action__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Alternatives1048);
                    rule__Action__NameAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getNameAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:525:6: ( ( rule__Action__Group_2__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:525:6: ( ( rule__Action__Group_2__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:526:1: ( rule__Action__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getGroup_2()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:527:1: ( rule__Action__Group_2__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:527:2: rule__Action__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_2__0_in_rule__Action__Alternatives1066);
                    rule__Action__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:531:6: ( ( rule__Action__AssignmentAssignment_3 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:531:6: ( ( rule__Action__AssignmentAssignment_3 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:532:1: ( rule__Action__AssignmentAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getAssignmentAssignment_3()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:533:1: ( rule__Action__AssignmentAssignment_3 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:533:2: rule__Action__AssignmentAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Action__AssignmentAssignment_3_in_rule__Action__Alternatives1084);
                    rule__Action__AssignmentAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getAssignmentAssignment_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Action__ObjectOfSelectAlternatives_2_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:542:1: rule__Action__ObjectOfSelectAlternatives_2_1_0 : ( ( 'TOKEN' ) | ( 'FIELD' ) );
    public final void rule__Action__ObjectOfSelectAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:546:1: ( ( 'TOKEN' ) | ( 'FIELD' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:547:1: ( 'TOKEN' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:547:1: ( 'TOKEN' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:548:1: 'TOKEN'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getObjectOfSelectTOKENKeyword_2_1_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Action__ObjectOfSelectAlternatives_2_1_01118); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getObjectOfSelectTOKENKeyword_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:555:6: ( 'FIELD' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:555:6: ( 'FIELD' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:556:1: 'FIELD'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getObjectOfSelectFIELDKeyword_2_1_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Action__ObjectOfSelectAlternatives_2_1_01138); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getObjectOfSelectFIELDKeyword_2_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ObjectOfSelectAlternatives_2_1_0"


    // $ANTLR start "rule__BooleanExp__Alternatives"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:568:1: rule__BooleanExp__Alternatives : ( ( ( rule__BooleanExp__Group_0__0 ) ) | ( ( rule__BooleanExp__Group_1__0 ) ) );
    public final void rule__BooleanExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:572:1: ( ( ( rule__BooleanExp__Group_0__0 ) ) | ( ( rule__BooleanExp__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:573:1: ( ( rule__BooleanExp__Group_0__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:573:1: ( ( rule__BooleanExp__Group_0__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:574:1: ( rule__BooleanExp__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getGroup_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:575:1: ( rule__BooleanExp__Group_0__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:575:2: rule__BooleanExp__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BooleanExp__Group_0__0_in_rule__BooleanExp__Alternatives1172);
                    rule__BooleanExp__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:579:6: ( ( rule__BooleanExp__Group_1__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:579:6: ( ( rule__BooleanExp__Group_1__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:580:1: ( rule__BooleanExp__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getGroup_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:581:1: ( rule__BooleanExp__Group_1__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:581:2: rule__BooleanExp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BooleanExp__Group_1__0_in_rule__BooleanExp__Alternatives1190);
                    rule__BooleanExp__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Alternatives"


    // $ANTLR start "rule__BooleanExp__OperatorAlternatives_0_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:590:1: rule__BooleanExp__OperatorAlternatives_0_1_0 : ( ( '!==' ) | ( '===' ) | ( '==' ) | ( '!=' ) | ( '>' ) | ( '>=' ) | ( '<' ) | ( '<=' ) );
    public final void rule__BooleanExp__OperatorAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:594:1: ( ( '!==' ) | ( '===' ) | ( '==' ) | ( '!=' ) | ( '>' ) | ( '>=' ) | ( '<' ) | ( '<=' ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            case 20:
                {
                alt4=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:595:1: ( '!==' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:595:1: ( '!==' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:596:1: '!=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getOperatorExclamationMarkEqualsSignEqualsSignKeyword_0_1_0_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__BooleanExp__OperatorAlternatives_0_1_01224); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getOperatorExclamationMarkEqualsSignEqualsSignKeyword_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:603:6: ( '===' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:603:6: ( '===' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:604:1: '==='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getOperatorEqualsSignEqualsSignEqualsSignKeyword_0_1_0_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__BooleanExp__OperatorAlternatives_0_1_01244); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getOperatorEqualsSignEqualsSignEqualsSignKeyword_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:611:6: ( '==' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:611:6: ( '==' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:612:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getOperatorEqualsSignEqualsSignKeyword_0_1_0_2()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__BooleanExp__OperatorAlternatives_0_1_01264); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getOperatorEqualsSignEqualsSignKeyword_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:619:6: ( '!=' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:619:6: ( '!=' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:620:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getOperatorExclamationMarkEqualsSignKeyword_0_1_0_3()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__BooleanExp__OperatorAlternatives_0_1_01284); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getOperatorExclamationMarkEqualsSignKeyword_0_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:627:6: ( '>' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:627:6: ( '>' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:628:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getOperatorGreaterThanSignKeyword_0_1_0_4()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__BooleanExp__OperatorAlternatives_0_1_01304); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getOperatorGreaterThanSignKeyword_0_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:635:6: ( '>=' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:635:6: ( '>=' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:636:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getOperatorGreaterThanSignEqualsSignKeyword_0_1_0_5()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__BooleanExp__OperatorAlternatives_0_1_01324); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getOperatorGreaterThanSignEqualsSignKeyword_0_1_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:643:6: ( '<' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:643:6: ( '<' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:644:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getOperatorLessThanSignKeyword_0_1_0_6()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__BooleanExp__OperatorAlternatives_0_1_01344); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getOperatorLessThanSignKeyword_0_1_0_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:651:6: ( '<=' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:651:6: ( '<=' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:652:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getOperatorLessThanSignEqualsSignKeyword_0_1_0_7()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__BooleanExp__OperatorAlternatives_0_1_01364); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getOperatorLessThanSignEqualsSignKeyword_0_1_0_7()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__OperatorAlternatives_0_1_0"


    // $ANTLR start "rule__AttributeName__Alternatives"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:664:1: rule__AttributeName__Alternatives : ( ( ( rule__AttributeName__NameAssignment_0 ) ) | ( ( rule__AttributeName__Group_1__0 ) ) );
    public final void rule__AttributeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:668:1: ( ( ( rule__AttributeName__NameAssignment_0 ) ) | ( ( rule__AttributeName__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==30) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==RULE_ID||(LA5_1>=13 && LA5_1<=20)||LA5_1==23||LA5_1==26||(LA5_1>=31 && LA5_1<=33)||(LA5_1>=38 && LA5_1<=44)) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:669:1: ( ( rule__AttributeName__NameAssignment_0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:669:1: ( ( rule__AttributeName__NameAssignment_0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:670:1: ( rule__AttributeName__NameAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeNameAccess().getNameAssignment_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:671:1: ( rule__AttributeName__NameAssignment_0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:671:2: rule__AttributeName__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__NameAssignment_0_in_rule__AttributeName__Alternatives1398);
                    rule__AttributeName__NameAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeNameAccess().getNameAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:675:6: ( ( rule__AttributeName__Group_1__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:675:6: ( ( rule__AttributeName__Group_1__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:676:1: ( rule__AttributeName__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeNameAccess().getGroup_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:677:1: ( rule__AttributeName__Group_1__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:677:2: rule__AttributeName__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Group_1__0_in_rule__AttributeName__Alternatives1416);
                    rule__AttributeName__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeNameAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Alternatives"


    // $ANTLR start "rule__AttributeOrInt__Alternatives"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:686:1: rule__AttributeOrInt__Alternatives : ( ( ( rule__AttributeOrInt__AttributeAssignment_0 ) ) | ( ( rule__AttributeOrInt__ValueAssignment_1 ) ) );
    public final void rule__AttributeOrInt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:690:1: ( ( ( rule__AttributeOrInt__AttributeAssignment_0 ) ) | ( ( rule__AttributeOrInt__ValueAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:691:1: ( ( rule__AttributeOrInt__AttributeAssignment_0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:691:1: ( ( rule__AttributeOrInt__AttributeAssignment_0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:692:1: ( rule__AttributeOrInt__AttributeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeOrIntAccess().getAttributeAssignment_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:693:1: ( rule__AttributeOrInt__AttributeAssignment_0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:693:2: rule__AttributeOrInt__AttributeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AttributeOrInt__AttributeAssignment_0_in_rule__AttributeOrInt__Alternatives1449);
                    rule__AttributeOrInt__AttributeAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeOrIntAccess().getAttributeAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:697:6: ( ( rule__AttributeOrInt__ValueAssignment_1 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:697:6: ( ( rule__AttributeOrInt__ValueAssignment_1 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:698:1: ( rule__AttributeOrInt__ValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeOrIntAccess().getValueAssignment_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:699:1: ( rule__AttributeOrInt__ValueAssignment_1 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:699:2: rule__AttributeOrInt__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AttributeOrInt__ValueAssignment_1_in_rule__AttributeOrInt__Alternatives1467);
                    rule__AttributeOrInt__ValueAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeOrIntAccess().getValueAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOrInt__Alternatives"


    // $ANTLR start "rule__AddtionExp__Alternatives_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:708:1: rule__AddtionExp__Alternatives_1 : ( ( ( rule__AddtionExp__OperatorsAssignment_1_0 ) ) | ( ( rule__AddtionExp__Group_1_1__0 ) ) );
    public final void rule__AddtionExp__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:712:1: ( ( ( rule__AddtionExp__OperatorsAssignment_1_0 ) ) | ( ( rule__AddtionExp__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==43) ) {
                alt7=1;
            }
            else if ( (LA7_0==31) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:713:1: ( ( rule__AddtionExp__OperatorsAssignment_1_0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:713:1: ( ( rule__AddtionExp__OperatorsAssignment_1_0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:714:1: ( rule__AddtionExp__OperatorsAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddtionExpAccess().getOperatorsAssignment_1_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:715:1: ( rule__AddtionExp__OperatorsAssignment_1_0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:715:2: rule__AddtionExp__OperatorsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__AddtionExp__OperatorsAssignment_1_0_in_rule__AddtionExp__Alternatives_11500);
                    rule__AddtionExp__OperatorsAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddtionExpAccess().getOperatorsAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:719:6: ( ( rule__AddtionExp__Group_1_1__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:719:6: ( ( rule__AddtionExp__Group_1_1__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:720:1: ( rule__AddtionExp__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddtionExpAccess().getGroup_1_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:721:1: ( rule__AddtionExp__Group_1_1__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:721:2: rule__AddtionExp__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__AddtionExp__Group_1_1__0_in_rule__AddtionExp__Alternatives_11518);
                    rule__AddtionExp__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddtionExpAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddtionExp__Alternatives_1"


    // $ANTLR start "rule__MultiplicationExp__Alternatives"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:730:1: rule__MultiplicationExp__Alternatives : ( ( ( rule__MultiplicationExp__Group_0__0 ) ) | ( ( rule__MultiplicationExp__Group_1__0 ) ) );
    public final void rule__MultiplicationExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:734:1: ( ( ( rule__MultiplicationExp__Group_0__0 ) ) | ( ( rule__MultiplicationExp__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:735:1: ( ( rule__MultiplicationExp__Group_0__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:735:1: ( ( rule__MultiplicationExp__Group_0__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:736:1: ( rule__MultiplicationExp__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationExpAccess().getGroup_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:737:1: ( rule__MultiplicationExp__Group_0__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:737:2: rule__MultiplicationExp__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicationExp__Group_0__0_in_rule__MultiplicationExp__Alternatives1551);
                    rule__MultiplicationExp__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationExpAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:741:6: ( ( rule__MultiplicationExp__Group_1__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:741:6: ( ( rule__MultiplicationExp__Group_1__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:742:1: ( rule__MultiplicationExp__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationExpAccess().getGroup_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:743:1: ( rule__MultiplicationExp__Group_1__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:743:2: rule__MultiplicationExp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicationExp__Group_1__0_in_rule__MultiplicationExp__Alternatives1569);
                    rule__MultiplicationExp__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationExpAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Alternatives"


    // $ANTLR start "rule__MultiplicationExp__Alternatives_0_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:752:1: rule__MultiplicationExp__Alternatives_0_1 : ( ( ( rule__MultiplicationExp__OperatorsAssignment_0_1_0 ) ) | ( ( rule__MultiplicationExp__Group_0_1_1__0 ) ) );
    public final void rule__MultiplicationExp__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:756:1: ( ( ( rule__MultiplicationExp__OperatorsAssignment_0_1_0 ) ) | ( ( rule__MultiplicationExp__Group_0_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==44) ) {
                alt9=1;
            }
            else if ( (LA9_0==32) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:757:1: ( ( rule__MultiplicationExp__OperatorsAssignment_0_1_0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:757:1: ( ( rule__MultiplicationExp__OperatorsAssignment_0_1_0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:758:1: ( rule__MultiplicationExp__OperatorsAssignment_0_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationExpAccess().getOperatorsAssignment_0_1_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:759:1: ( rule__MultiplicationExp__OperatorsAssignment_0_1_0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:759:2: rule__MultiplicationExp__OperatorsAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_rule__MultiplicationExp__OperatorsAssignment_0_1_0_in_rule__MultiplicationExp__Alternatives_0_11602);
                    rule__MultiplicationExp__OperatorsAssignment_0_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationExpAccess().getOperatorsAssignment_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:763:6: ( ( rule__MultiplicationExp__Group_0_1_1__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:763:6: ( ( rule__MultiplicationExp__Group_0_1_1__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:764:1: ( rule__MultiplicationExp__Group_0_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationExpAccess().getGroup_0_1_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:765:1: ( rule__MultiplicationExp__Group_0_1_1__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:765:2: rule__MultiplicationExp__Group_0_1_1__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicationExp__Group_0_1_1__0_in_rule__MultiplicationExp__Alternatives_0_11620);
                    rule__MultiplicationExp__Group_0_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationExpAccess().getGroup_0_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Alternatives_0_1"


    // $ANTLR start "rule__Model__Group_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:776:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:780:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:781:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__01651);
            rule__Model__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__01654);
            rule__Model__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0"


    // $ANTLR start "rule__Model__Group_0__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:788:1: rule__Model__Group_0__0__Impl : ( 'GAME' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:792:1: ( ( 'GAME' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:793:1: ( 'GAME' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:793:1: ( 'GAME' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:794:1: 'GAME'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGAMEKeyword_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Model__Group_0__0__Impl1682); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGAMEKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0__Impl"


    // $ANTLR start "rule__Model__Group_0__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:807:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl rule__Model__Group_0__2 ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:811:1: ( rule__Model__Group_0__1__Impl rule__Model__Group_0__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:812:2: rule__Model__Group_0__1__Impl rule__Model__Group_0__2
            {
            pushFollow(FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__11713);
            rule__Model__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_0__2_in_rule__Model__Group_0__11716);
            rule__Model__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1"


    // $ANTLR start "rule__Model__Group_0__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:819:1: rule__Model__Group_0__1__Impl : ( ( rule__Model__NameAssignment_0_1 ) ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:823:1: ( ( ( rule__Model__NameAssignment_0_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:824:1: ( ( rule__Model__NameAssignment_0_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:824:1: ( ( rule__Model__NameAssignment_0_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:825:1: ( rule__Model__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_0_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:826:1: ( rule__Model__NameAssignment_0_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:826:2: rule__Model__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl1743);
            rule__Model__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1__Impl"


    // $ANTLR start "rule__Model__Group_0__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:836:1: rule__Model__Group_0__2 : rule__Model__Group_0__2__Impl ;
    public final void rule__Model__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:840:1: ( rule__Model__Group_0__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:841:2: rule__Model__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_0__2__Impl_in_rule__Model__Group_0__21773);
            rule__Model__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__2"


    // $ANTLR start "rule__Model__Group_0__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:847:1: rule__Model__Group_0__2__Impl : ( ( rule__Model__PlayerAssignment_0_2 ) ) ;
    public final void rule__Model__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:851:1: ( ( ( rule__Model__PlayerAssignment_0_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:852:1: ( ( rule__Model__PlayerAssignment_0_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:852:1: ( ( rule__Model__PlayerAssignment_0_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:853:1: ( rule__Model__PlayerAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPlayerAssignment_0_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:854:1: ( rule__Model__PlayerAssignment_0_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:854:2: rule__Model__PlayerAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Model__PlayerAssignment_0_2_in_rule__Model__Group_0__2__Impl1800);
            rule__Model__PlayerAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPlayerAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__2__Impl"


    // $ANTLR start "rule__Player__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:870:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:874:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:875:2: rule__Player__Group__0__Impl rule__Player__Group__1
            {
            pushFollow(FOLLOW_rule__Player__Group__0__Impl_in_rule__Player__Group__01836);
            rule__Player__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Player__Group__1_in_rule__Player__Group__01839);
            rule__Player__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__0"


    // $ANTLR start "rule__Player__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:882:1: rule__Player__Group__0__Impl : ( ( rule__Player__NameAssignment_0 ) ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:886:1: ( ( ( rule__Player__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:887:1: ( ( rule__Player__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:887:1: ( ( rule__Player__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:888:1: ( rule__Player__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:889:1: ( rule__Player__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:889:2: rule__Player__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Player__NameAssignment_0_in_rule__Player__Group__0__Impl1866);
            rule__Player__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__0__Impl"


    // $ANTLR start "rule__Player__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:899:1: rule__Player__Group__1 : rule__Player__Group__1__Impl ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:903:1: ( rule__Player__Group__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:904:2: rule__Player__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Player__Group__1__Impl_in_rule__Player__Group__11896);
            rule__Player__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__1"


    // $ANTLR start "rule__Player__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:910:1: rule__Player__Group__1__Impl : ( ( rule__Player__PlayercountAssignment_1 ) ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:914:1: ( ( ( rule__Player__PlayercountAssignment_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:915:1: ( ( rule__Player__PlayercountAssignment_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:915:1: ( ( rule__Player__PlayercountAssignment_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:916:1: ( rule__Player__PlayercountAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getPlayercountAssignment_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:917:1: ( rule__Player__PlayercountAssignment_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:917:2: rule__Player__PlayercountAssignment_1
            {
            pushFollow(FOLLOW_rule__Player__PlayercountAssignment_1_in_rule__Player__Group__1__Impl1923);
            rule__Player__PlayercountAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getPlayercountAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__1__Impl"


    // $ANTLR start "rule__Board__Group_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:931:1: rule__Board__Group_0__0 : rule__Board__Group_0__0__Impl rule__Board__Group_0__1 ;
    public final void rule__Board__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:935:1: ( rule__Board__Group_0__0__Impl rule__Board__Group_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:936:2: rule__Board__Group_0__0__Impl rule__Board__Group_0__1
            {
            pushFollow(FOLLOW_rule__Board__Group_0__0__Impl_in_rule__Board__Group_0__01957);
            rule__Board__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Board__Group_0__1_in_rule__Board__Group_0__01960);
            rule__Board__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_0__0"


    // $ANTLR start "rule__Board__Group_0__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:943:1: rule__Board__Group_0__0__Impl : ( ( rule__Board__NameAssignment_0_0 ) ) ;
    public final void rule__Board__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:947:1: ( ( ( rule__Board__NameAssignment_0_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:948:1: ( ( rule__Board__NameAssignment_0_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:948:1: ( ( rule__Board__NameAssignment_0_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:949:1: ( rule__Board__NameAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getNameAssignment_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:950:1: ( rule__Board__NameAssignment_0_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:950:2: rule__Board__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Board__NameAssignment_0_0_in_rule__Board__Group_0__0__Impl1987);
            rule__Board__NameAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getNameAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_0__0__Impl"


    // $ANTLR start "rule__Board__Group_0__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:960:1: rule__Board__Group_0__1 : rule__Board__Group_0__1__Impl rule__Board__Group_0__2 ;
    public final void rule__Board__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:964:1: ( rule__Board__Group_0__1__Impl rule__Board__Group_0__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:965:2: rule__Board__Group_0__1__Impl rule__Board__Group_0__2
            {
            pushFollow(FOLLOW_rule__Board__Group_0__1__Impl_in_rule__Board__Group_0__12017);
            rule__Board__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Board__Group_0__2_in_rule__Board__Group_0__12020);
            rule__Board__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_0__1"


    // $ANTLR start "rule__Board__Group_0__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:972:1: rule__Board__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Board__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:976:1: ( ( '{' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:977:1: ( '{' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:977:1: ( '{' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:978:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_0_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Board__Group_0__1__Impl2048); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_0__1__Impl"


    // $ANTLR start "rule__Board__Group_0__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:991:1: rule__Board__Group_0__2 : rule__Board__Group_0__2__Impl ;
    public final void rule__Board__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:995:1: ( rule__Board__Group_0__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:996:2: rule__Board__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Board__Group_0__2__Impl_in_rule__Board__Group_0__22079);
            rule__Board__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_0__2"


    // $ANTLR start "rule__Board__Group_0__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1002:1: rule__Board__Group_0__2__Impl : ( ( rule__Board__FieldsAssignment_0_2 )* ) ;
    public final void rule__Board__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1006:1: ( ( ( rule__Board__FieldsAssignment_0_2 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1007:1: ( ( rule__Board__FieldsAssignment_0_2 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1007:1: ( ( rule__Board__FieldsAssignment_0_2 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1008:1: ( rule__Board__FieldsAssignment_0_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getFieldsAssignment_0_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1009:1: ( rule__Board__FieldsAssignment_0_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1009:2: rule__Board__FieldsAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_rule__Board__FieldsAssignment_0_2_in_rule__Board__Group_0__2__Impl2106);
            	    rule__Board__FieldsAssignment_0_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getFieldsAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_0__2__Impl"


    // $ANTLR start "rule__Rules__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1025:1: rule__Rules__Group__0 : rule__Rules__Group__0__Impl rule__Rules__Group__1 ;
    public final void rule__Rules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1029:1: ( rule__Rules__Group__0__Impl rule__Rules__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1030:2: rule__Rules__Group__0__Impl rule__Rules__Group__1
            {
            pushFollow(FOLLOW_rule__Rules__Group__0__Impl_in_rule__Rules__Group__02143);
            rule__Rules__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rules__Group__1_in_rule__Rules__Group__02146);
            rule__Rules__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__0"


    // $ANTLR start "rule__Rules__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1037:1: rule__Rules__Group__0__Impl : ( ( rule__Rules__NameAssignment_0 ) ) ;
    public final void rule__Rules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1041:1: ( ( ( rule__Rules__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1042:1: ( ( rule__Rules__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1042:1: ( ( rule__Rules__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1043:1: ( rule__Rules__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1044:1: ( rule__Rules__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1044:2: rule__Rules__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Rules__NameAssignment_0_in_rule__Rules__Group__0__Impl2173);
            rule__Rules__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__0__Impl"


    // $ANTLR start "rule__Rules__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1054:1: rule__Rules__Group__1 : rule__Rules__Group__1__Impl rule__Rules__Group__2 ;
    public final void rule__Rules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1058:1: ( rule__Rules__Group__1__Impl rule__Rules__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1059:2: rule__Rules__Group__1__Impl rule__Rules__Group__2
            {
            pushFollow(FOLLOW_rule__Rules__Group__1__Impl_in_rule__Rules__Group__12203);
            rule__Rules__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rules__Group__2_in_rule__Rules__Group__12206);
            rule__Rules__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__1"


    // $ANTLR start "rule__Rules__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1066:1: rule__Rules__Group__1__Impl : ( '{' ) ;
    public final void rule__Rules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1070:1: ( ( '{' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1071:1: ( '{' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1071:1: ( '{' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1072:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Rules__Group__1__Impl2234); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__1__Impl"


    // $ANTLR start "rule__Rules__Group__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1085:1: rule__Rules__Group__2 : rule__Rules__Group__2__Impl rule__Rules__Group__3 ;
    public final void rule__Rules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1089:1: ( rule__Rules__Group__2__Impl rule__Rules__Group__3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1090:2: rule__Rules__Group__2__Impl rule__Rules__Group__3
            {
            pushFollow(FOLLOW_rule__Rules__Group__2__Impl_in_rule__Rules__Group__22265);
            rule__Rules__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rules__Group__3_in_rule__Rules__Group__22268);
            rule__Rules__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__2"


    // $ANTLR start "rule__Rules__Group__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1097:1: rule__Rules__Group__2__Impl : ( ( rule__Rules__TurnrulesAssignment_2 ) ) ;
    public final void rule__Rules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1101:1: ( ( ( rule__Rules__TurnrulesAssignment_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1102:1: ( ( rule__Rules__TurnrulesAssignment_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1102:1: ( ( rule__Rules__TurnrulesAssignment_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1103:1: ( rule__Rules__TurnrulesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesAccess().getTurnrulesAssignment_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1104:1: ( rule__Rules__TurnrulesAssignment_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1104:2: rule__Rules__TurnrulesAssignment_2
            {
            pushFollow(FOLLOW_rule__Rules__TurnrulesAssignment_2_in_rule__Rules__Group__2__Impl2295);
            rule__Rules__TurnrulesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesAccess().getTurnrulesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__2__Impl"


    // $ANTLR start "rule__Rules__Group__3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1114:1: rule__Rules__Group__3 : rule__Rules__Group__3__Impl ;
    public final void rule__Rules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1118:1: ( rule__Rules__Group__3__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1119:2: rule__Rules__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rules__Group__3__Impl_in_rule__Rules__Group__32325);
            rule__Rules__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__3"


    // $ANTLR start "rule__Rules__Group__3__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1125:1: rule__Rules__Group__3__Impl : ( '}' ) ;
    public final void rule__Rules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1129:1: ( ( '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1130:1: ( '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1130:1: ( '}' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1131:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__Rules__Group__3__Impl2353); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__3__Impl"


    // $ANTLR start "rule__TurnRules__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1152:1: rule__TurnRules__Group__0 : rule__TurnRules__Group__0__Impl rule__TurnRules__Group__1 ;
    public final void rule__TurnRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1156:1: ( rule__TurnRules__Group__0__Impl rule__TurnRules__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1157:2: rule__TurnRules__Group__0__Impl rule__TurnRules__Group__1
            {
            pushFollow(FOLLOW_rule__TurnRules__Group__0__Impl_in_rule__TurnRules__Group__02392);
            rule__TurnRules__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TurnRules__Group__1_in_rule__TurnRules__Group__02395);
            rule__TurnRules__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRules__Group__0"


    // $ANTLR start "rule__TurnRules__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1164:1: rule__TurnRules__Group__0__Impl : ( ( rule__TurnRules__NameAssignment_0 ) ) ;
    public final void rule__TurnRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1168:1: ( ( ( rule__TurnRules__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1169:1: ( ( rule__TurnRules__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1169:1: ( ( rule__TurnRules__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1170:1: ( rule__TurnRules__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1171:1: ( rule__TurnRules__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1171:2: rule__TurnRules__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TurnRules__NameAssignment_0_in_rule__TurnRules__Group__0__Impl2422);
            rule__TurnRules__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnRulesAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRules__Group__0__Impl"


    // $ANTLR start "rule__TurnRules__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1181:1: rule__TurnRules__Group__1 : rule__TurnRules__Group__1__Impl rule__TurnRules__Group__2 ;
    public final void rule__TurnRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1185:1: ( rule__TurnRules__Group__1__Impl rule__TurnRules__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1186:2: rule__TurnRules__Group__1__Impl rule__TurnRules__Group__2
            {
            pushFollow(FOLLOW_rule__TurnRules__Group__1__Impl_in_rule__TurnRules__Group__12452);
            rule__TurnRules__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TurnRules__Group__2_in_rule__TurnRules__Group__12455);
            rule__TurnRules__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRules__Group__1"


    // $ANTLR start "rule__TurnRules__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1193:1: rule__TurnRules__Group__1__Impl : ( '{' ) ;
    public final void rule__TurnRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1197:1: ( ( '{' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1198:1: ( '{' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1198:1: ( '{' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1199:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__TurnRules__Group__1__Impl2483); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnRulesAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRules__Group__1__Impl"


    // $ANTLR start "rule__TurnRules__Group__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1212:1: rule__TurnRules__Group__2 : rule__TurnRules__Group__2__Impl rule__TurnRules__Group__3 ;
    public final void rule__TurnRules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1216:1: ( rule__TurnRules__Group__2__Impl rule__TurnRules__Group__3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1217:2: rule__TurnRules__Group__2__Impl rule__TurnRules__Group__3
            {
            pushFollow(FOLLOW_rule__TurnRules__Group__2__Impl_in_rule__TurnRules__Group__22514);
            rule__TurnRules__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TurnRules__Group__3_in_rule__TurnRules__Group__22517);
            rule__TurnRules__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRules__Group__2"


    // $ANTLR start "rule__TurnRules__Group__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1224:1: rule__TurnRules__Group__2__Impl : ( ( rule__TurnRules__ActionsAssignment_2 )* ) ;
    public final void rule__TurnRules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1228:1: ( ( ( rule__TurnRules__ActionsAssignment_2 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1229:1: ( ( rule__TurnRules__ActionsAssignment_2 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1229:1: ( ( rule__TurnRules__ActionsAssignment_2 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1230:1: ( rule__TurnRules__ActionsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesAccess().getActionsAssignment_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1231:1: ( rule__TurnRules__ActionsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=38 && LA11_0<=40)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1231:2: rule__TurnRules__ActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__TurnRules__ActionsAssignment_2_in_rule__TurnRules__Group__2__Impl2544);
            	    rule__TurnRules__ActionsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnRulesAccess().getActionsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRules__Group__2__Impl"


    // $ANTLR start "rule__TurnRules__Group__3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1241:1: rule__TurnRules__Group__3 : rule__TurnRules__Group__3__Impl ;
    public final void rule__TurnRules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1245:1: ( rule__TurnRules__Group__3__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1246:2: rule__TurnRules__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TurnRules__Group__3__Impl_in_rule__TurnRules__Group__32575);
            rule__TurnRules__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRules__Group__3"


    // $ANTLR start "rule__TurnRules__Group__3__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1252:1: rule__TurnRules__Group__3__Impl : ( '}' ) ;
    public final void rule__TurnRules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1256:1: ( ( '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1257:1: ( '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1257:1: ( '}' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1258:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__TurnRules__Group__3__Impl2603); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnRulesAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRules__Group__3__Impl"


    // $ANTLR start "rule__Token__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1279:1: rule__Token__Group__0 : rule__Token__Group__0__Impl rule__Token__Group__1 ;
    public final void rule__Token__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1283:1: ( rule__Token__Group__0__Impl rule__Token__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1284:2: rule__Token__Group__0__Impl rule__Token__Group__1
            {
            pushFollow(FOLLOW_rule__Token__Group__0__Impl_in_rule__Token__Group__02642);
            rule__Token__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Token__Group__1_in_rule__Token__Group__02645);
            rule__Token__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group__0"


    // $ANTLR start "rule__Token__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1291:1: rule__Token__Group__0__Impl : ( 'TOKEN' ) ;
    public final void rule__Token__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1295:1: ( ( 'TOKEN' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1296:1: ( 'TOKEN' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1296:1: ( 'TOKEN' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1297:1: 'TOKEN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenAccess().getTOKENKeyword_0()); 
            }
            match(input,11,FOLLOW_11_in_rule__Token__Group__0__Impl2673); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenAccess().getTOKENKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group__0__Impl"


    // $ANTLR start "rule__Token__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1310:1: rule__Token__Group__1 : rule__Token__Group__1__Impl rule__Token__Group__2 ;
    public final void rule__Token__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1314:1: ( rule__Token__Group__1__Impl rule__Token__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1315:2: rule__Token__Group__1__Impl rule__Token__Group__2
            {
            pushFollow(FOLLOW_rule__Token__Group__1__Impl_in_rule__Token__Group__12704);
            rule__Token__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Token__Group__2_in_rule__Token__Group__12707);
            rule__Token__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group__1"


    // $ANTLR start "rule__Token__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1322:1: rule__Token__Group__1__Impl : ( ( rule__Token__NameAssignment_1 ) ) ;
    public final void rule__Token__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1326:1: ( ( ( rule__Token__NameAssignment_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1327:1: ( ( rule__Token__NameAssignment_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1327:1: ( ( rule__Token__NameAssignment_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1328:1: ( rule__Token__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenAccess().getNameAssignment_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1329:1: ( rule__Token__NameAssignment_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1329:2: rule__Token__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Token__NameAssignment_1_in_rule__Token__Group__1__Impl2734);
            rule__Token__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group__1__Impl"


    // $ANTLR start "rule__Token__Group__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1339:1: rule__Token__Group__2 : rule__Token__Group__2__Impl rule__Token__Group__3 ;
    public final void rule__Token__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1343:1: ( rule__Token__Group__2__Impl rule__Token__Group__3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1344:2: rule__Token__Group__2__Impl rule__Token__Group__3
            {
            pushFollow(FOLLOW_rule__Token__Group__2__Impl_in_rule__Token__Group__22764);
            rule__Token__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Token__Group__3_in_rule__Token__Group__22767);
            rule__Token__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group__2"


    // $ANTLR start "rule__Token__Group__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1351:1: rule__Token__Group__2__Impl : ( '{' ) ;
    public final void rule__Token__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1355:1: ( ( '{' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1356:1: ( '{' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1356:1: ( '{' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1357:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__Token__Group__2__Impl2795); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group__2__Impl"


    // $ANTLR start "rule__Token__Group__3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1370:1: rule__Token__Group__3 : rule__Token__Group__3__Impl ;
    public final void rule__Token__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1374:1: ( rule__Token__Group__3__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1375:2: rule__Token__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Token__Group__3__Impl_in_rule__Token__Group__32826);
            rule__Token__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group__3"


    // $ANTLR start "rule__Token__Group__3__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1381:1: rule__Token__Group__3__Impl : ( '}' ) ;
    public final void rule__Token__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1385:1: ( ( '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1386:1: ( '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1386:1: ( '}' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1387:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__Token__Group__3__Impl2854); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1408:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1412:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1413:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02893);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02896);
            rule__Field__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1420:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1424:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1425:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1425:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1426:1: ( rule__Field__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1427:1: ( rule__Field__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1427:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl2923);
            rule__Field__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1437:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1441:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1442:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12953);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12956);
            rule__Field__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1449:1: rule__Field__Group__1__Impl : ( '(' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1453:1: ( ( '(' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1454:1: ( '(' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1454:1: ( '(' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1455:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__Field__Group__1__Impl2984); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1468:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1472:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1473:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23015);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23018);
            rule__Field__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1480:1: rule__Field__Group__2__Impl : ( ( rule__Field__XAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1484:1: ( ( ( rule__Field__XAssignment_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1485:1: ( ( rule__Field__XAssignment_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1485:1: ( ( rule__Field__XAssignment_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1486:1: ( rule__Field__XAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getXAssignment_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1487:1: ( rule__Field__XAssignment_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1487:2: rule__Field__XAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__XAssignment_2_in_rule__Field__Group__2__Impl3045);
            rule__Field__XAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getXAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1497:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1501:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1502:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33075);
            rule__Field__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33078);
            rule__Field__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1509:1: rule__Field__Group__3__Impl : ( ',' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1513:1: ( ( ',' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1514:1: ( ',' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1514:1: ( ',' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1515:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommaKeyword_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__Field__Group__3__Impl3106); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getCommaKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1528:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1532:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1533:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43137);
            rule__Field__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__43140);
            rule__Field__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1540:1: rule__Field__Group__4__Impl : ( ( rule__Field__YAssignment_4 ) ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1544:1: ( ( ( rule__Field__YAssignment_4 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1545:1: ( ( rule__Field__YAssignment_4 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1545:1: ( ( rule__Field__YAssignment_4 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1546:1: ( rule__Field__YAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getYAssignment_4()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1547:1: ( rule__Field__YAssignment_4 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1547:2: rule__Field__YAssignment_4
            {
            pushFollow(FOLLOW_rule__Field__YAssignment_4_in_rule__Field__Group__4__Impl3167);
            rule__Field__YAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getYAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__5"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1557:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1561:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1562:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__53197);
            rule__Field__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__6_in_rule__Field__Group__53200);
            rule__Field__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1569:1: rule__Field__Group__5__Impl : ( ',' ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1573:1: ( ( ',' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1574:1: ( ',' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1574:1: ( ',' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1575:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommaKeyword_5()); 
            }
            match(input,25,FOLLOW_25_in_rule__Field__Group__5__Impl3228); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getCommaKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5__Impl"


    // $ANTLR start "rule__Field__Group__6"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1588:1: rule__Field__Group__6 : rule__Field__Group__6__Impl rule__Field__Group__7 ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1592:1: ( rule__Field__Group__6__Impl rule__Field__Group__7 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1593:2: rule__Field__Group__6__Impl rule__Field__Group__7
            {
            pushFollow(FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__63259);
            rule__Field__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__7_in_rule__Field__Group__63262);
            rule__Field__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__6"


    // $ANTLR start "rule__Field__Group__6__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1600:1: rule__Field__Group__6__Impl : ( ( rule__Field__ZAssignment_6 ) ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1604:1: ( ( ( rule__Field__ZAssignment_6 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1605:1: ( ( rule__Field__ZAssignment_6 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1605:1: ( ( rule__Field__ZAssignment_6 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1606:1: ( rule__Field__ZAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getZAssignment_6()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1607:1: ( rule__Field__ZAssignment_6 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1607:2: rule__Field__ZAssignment_6
            {
            pushFollow(FOLLOW_rule__Field__ZAssignment_6_in_rule__Field__Group__6__Impl3289);
            rule__Field__ZAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getZAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__6__Impl"


    // $ANTLR start "rule__Field__Group__7"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1617:1: rule__Field__Group__7 : rule__Field__Group__7__Impl rule__Field__Group__8 ;
    public final void rule__Field__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1621:1: ( rule__Field__Group__7__Impl rule__Field__Group__8 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1622:2: rule__Field__Group__7__Impl rule__Field__Group__8
            {
            pushFollow(FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__73319);
            rule__Field__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__8_in_rule__Field__Group__73322);
            rule__Field__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__7"


    // $ANTLR start "rule__Field__Group__7__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1629:1: rule__Field__Group__7__Impl : ( ')' ) ;
    public final void rule__Field__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1633:1: ( ( ')' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1634:1: ( ')' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1634:1: ( ')' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1635:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,26,FOLLOW_26_in_rule__Field__Group__7__Impl3350); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getRightParenthesisKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__7__Impl"


    // $ANTLR start "rule__Field__Group__8"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1648:1: rule__Field__Group__8 : rule__Field__Group__8__Impl rule__Field__Group__9 ;
    public final void rule__Field__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1652:1: ( rule__Field__Group__8__Impl rule__Field__Group__9 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1653:2: rule__Field__Group__8__Impl rule__Field__Group__9
            {
            pushFollow(FOLLOW_rule__Field__Group__8__Impl_in_rule__Field__Group__83381);
            rule__Field__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__9_in_rule__Field__Group__83384);
            rule__Field__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__8"


    // $ANTLR start "rule__Field__Group__8__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1660:1: rule__Field__Group__8__Impl : ( ':' ) ;
    public final void rule__Field__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1664:1: ( ( ':' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1665:1: ( ':' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1665:1: ( ':' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1666:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getColonKeyword_8()); 
            }
            match(input,27,FOLLOW_27_in_rule__Field__Group__8__Impl3412); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getColonKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__8__Impl"


    // $ANTLR start "rule__Field__Group__9"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1679:1: rule__Field__Group__9 : rule__Field__Group__9__Impl rule__Field__Group__10 ;
    public final void rule__Field__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1683:1: ( rule__Field__Group__9__Impl rule__Field__Group__10 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1684:2: rule__Field__Group__9__Impl rule__Field__Group__10
            {
            pushFollow(FOLLOW_rule__Field__Group__9__Impl_in_rule__Field__Group__93443);
            rule__Field__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__10_in_rule__Field__Group__93446);
            rule__Field__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__9"


    // $ANTLR start "rule__Field__Group__9__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1691:1: rule__Field__Group__9__Impl : ( ( rule__Field__NeighboursAssignment_9 )* ) ;
    public final void rule__Field__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1695:1: ( ( ( rule__Field__NeighboursAssignment_9 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1696:1: ( ( rule__Field__NeighboursAssignment_9 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1696:1: ( ( rule__Field__NeighboursAssignment_9 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1697:1: ( rule__Field__NeighboursAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNeighboursAssignment_9()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1698:1: ( rule__Field__NeighboursAssignment_9 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1698:2: rule__Field__NeighboursAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Field__NeighboursAssignment_9_in_rule__Field__Group__9__Impl3473);
            	    rule__Field__NeighboursAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNeighboursAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__9__Impl"


    // $ANTLR start "rule__Field__Group__10"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1708:1: rule__Field__Group__10 : rule__Field__Group__10__Impl ;
    public final void rule__Field__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1712:1: ( rule__Field__Group__10__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1713:2: rule__Field__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__10__Impl_in_rule__Field__Group__103504);
            rule__Field__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__10"


    // $ANTLR start "rule__Field__Group__10__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1719:1: rule__Field__Group__10__Impl : ( ';' ) ;
    public final void rule__Field__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1723:1: ( ( ';' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1724:1: ( ';' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1724:1: ( ';' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1725:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getSemicolonKeyword_10()); 
            }
            match(input,28,FOLLOW_28_in_rule__Field__Group__10__Impl3532); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getSemicolonKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__10__Impl"


    // $ANTLR start "rule__Action__Group_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1760:1: rule__Action__Group_0__0 : rule__Action__Group_0__0__Impl rule__Action__Group_0__1 ;
    public final void rule__Action__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1764:1: ( rule__Action__Group_0__0__Impl rule__Action__Group_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1765:2: rule__Action__Group_0__0__Impl rule__Action__Group_0__1
            {
            pushFollow(FOLLOW_rule__Action__Group_0__0__Impl_in_rule__Action__Group_0__03585);
            rule__Action__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_0__1_in_rule__Action__Group_0__03588);
            rule__Action__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_0__0"


    // $ANTLR start "rule__Action__Group_0__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1772:1: rule__Action__Group_0__0__Impl : ( ( rule__Action__NameAssignment_0_0 ) ) ;
    public final void rule__Action__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1776:1: ( ( ( rule__Action__NameAssignment_0_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1777:1: ( ( rule__Action__NameAssignment_0_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1777:1: ( ( rule__Action__NameAssignment_0_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1778:1: ( rule__Action__NameAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameAssignment_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1779:1: ( rule__Action__NameAssignment_0_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1779:2: rule__Action__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_0_0_in_rule__Action__Group_0__0__Impl3615);
            rule__Action__NameAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getNameAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_0__0__Impl"


    // $ANTLR start "rule__Action__Group_0__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1789:1: rule__Action__Group_0__1 : rule__Action__Group_0__1__Impl ;
    public final void rule__Action__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1793:1: ( rule__Action__Group_0__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1794:2: rule__Action__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_0__1__Impl_in_rule__Action__Group_0__13645);
            rule__Action__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_0__1"


    // $ANTLR start "rule__Action__Group_0__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1800:1: rule__Action__Group_0__1__Impl : ( ( rule__Action__TokenAssignment_0_1 ) ) ;
    public final void rule__Action__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1804:1: ( ( ( rule__Action__TokenAssignment_0_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1805:1: ( ( rule__Action__TokenAssignment_0_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1805:1: ( ( rule__Action__TokenAssignment_0_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1806:1: ( rule__Action__TokenAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTokenAssignment_0_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1807:1: ( rule__Action__TokenAssignment_0_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1807:2: rule__Action__TokenAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Action__TokenAssignment_0_1_in_rule__Action__Group_0__1__Impl3672);
            rule__Action__TokenAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getTokenAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_0__1__Impl"


    // $ANTLR start "rule__Action__Group_2__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1821:1: rule__Action__Group_2__0 : rule__Action__Group_2__0__Impl rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1825:1: ( rule__Action__Group_2__0__Impl rule__Action__Group_2__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1826:2: rule__Action__Group_2__0__Impl rule__Action__Group_2__1
            {
            pushFollow(FOLLOW_rule__Action__Group_2__0__Impl_in_rule__Action__Group_2__03706);
            rule__Action__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_2__1_in_rule__Action__Group_2__03709);
            rule__Action__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__0"


    // $ANTLR start "rule__Action__Group_2__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1833:1: rule__Action__Group_2__0__Impl : ( ( rule__Action__NameAssignment_2_0 ) ) ;
    public final void rule__Action__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1837:1: ( ( ( rule__Action__NameAssignment_2_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1838:1: ( ( rule__Action__NameAssignment_2_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1838:1: ( ( rule__Action__NameAssignment_2_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1839:1: ( rule__Action__NameAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameAssignment_2_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1840:1: ( rule__Action__NameAssignment_2_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1840:2: rule__Action__NameAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_2_0_in_rule__Action__Group_2__0__Impl3736);
            rule__Action__NameAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getNameAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__0__Impl"


    // $ANTLR start "rule__Action__Group_2__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1850:1: rule__Action__Group_2__1 : rule__Action__Group_2__1__Impl rule__Action__Group_2__2 ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1854:1: ( rule__Action__Group_2__1__Impl rule__Action__Group_2__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1855:2: rule__Action__Group_2__1__Impl rule__Action__Group_2__2
            {
            pushFollow(FOLLOW_rule__Action__Group_2__1__Impl_in_rule__Action__Group_2__13766);
            rule__Action__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_2__2_in_rule__Action__Group_2__13769);
            rule__Action__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__1"


    // $ANTLR start "rule__Action__Group_2__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1862:1: rule__Action__Group_2__1__Impl : ( ( rule__Action__ObjectOfSelectAssignment_2_1 ) ) ;
    public final void rule__Action__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1866:1: ( ( ( rule__Action__ObjectOfSelectAssignment_2_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1867:1: ( ( rule__Action__ObjectOfSelectAssignment_2_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1867:1: ( ( rule__Action__ObjectOfSelectAssignment_2_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1868:1: ( rule__Action__ObjectOfSelectAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getObjectOfSelectAssignment_2_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1869:1: ( rule__Action__ObjectOfSelectAssignment_2_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1869:2: rule__Action__ObjectOfSelectAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Action__ObjectOfSelectAssignment_2_1_in_rule__Action__Group_2__1__Impl3796);
            rule__Action__ObjectOfSelectAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getObjectOfSelectAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__1__Impl"


    // $ANTLR start "rule__Action__Group_2__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1879:1: rule__Action__Group_2__2 : rule__Action__Group_2__2__Impl rule__Action__Group_2__3 ;
    public final void rule__Action__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1883:1: ( rule__Action__Group_2__2__Impl rule__Action__Group_2__3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1884:2: rule__Action__Group_2__2__Impl rule__Action__Group_2__3
            {
            pushFollow(FOLLOW_rule__Action__Group_2__2__Impl_in_rule__Action__Group_2__23826);
            rule__Action__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_2__3_in_rule__Action__Group_2__23829);
            rule__Action__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__2"


    // $ANTLR start "rule__Action__Group_2__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1891:1: rule__Action__Group_2__2__Impl : ( 'WHERE' ) ;
    public final void rule__Action__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1895:1: ( ( 'WHERE' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1896:1: ( 'WHERE' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1896:1: ( 'WHERE' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1897:1: 'WHERE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getWHEREKeyword_2_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__Action__Group_2__2__Impl3857); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getWHEREKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__2__Impl"


    // $ANTLR start "rule__Action__Group_2__3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1910:1: rule__Action__Group_2__3 : rule__Action__Group_2__3__Impl ;
    public final void rule__Action__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1914:1: ( rule__Action__Group_2__3__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1915:2: rule__Action__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_2__3__Impl_in_rule__Action__Group_2__33888);
            rule__Action__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__3"


    // $ANTLR start "rule__Action__Group_2__3__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1921:1: rule__Action__Group_2__3__Impl : ( ( rule__Action__FilterAssignment_2_3 ) ) ;
    public final void rule__Action__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1925:1: ( ( ( rule__Action__FilterAssignment_2_3 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1926:1: ( ( rule__Action__FilterAssignment_2_3 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1926:1: ( ( rule__Action__FilterAssignment_2_3 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1927:1: ( rule__Action__FilterAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getFilterAssignment_2_3()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1928:1: ( rule__Action__FilterAssignment_2_3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1928:2: rule__Action__FilterAssignment_2_3
            {
            pushFollow(FOLLOW_rule__Action__FilterAssignment_2_3_in_rule__Action__Group_2__3__Impl3915);
            rule__Action__FilterAssignment_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getFilterAssignment_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__3__Impl"


    // $ANTLR start "rule__OrExp__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1946:1: rule__OrExp__Group__0 : rule__OrExp__Group__0__Impl rule__OrExp__Group__1 ;
    public final void rule__OrExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1950:1: ( rule__OrExp__Group__0__Impl rule__OrExp__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1951:2: rule__OrExp__Group__0__Impl rule__OrExp__Group__1
            {
            pushFollow(FOLLOW_rule__OrExp__Group__0__Impl_in_rule__OrExp__Group__03953);
            rule__OrExp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExp__Group__1_in_rule__OrExp__Group__03956);
            rule__OrExp__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__Group__0"


    // $ANTLR start "rule__OrExp__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1958:1: rule__OrExp__Group__0__Impl : ( ( rule__OrExp__ExpressionsAssignment_0 ) ) ;
    public final void rule__OrExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1962:1: ( ( ( rule__OrExp__ExpressionsAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1963:1: ( ( rule__OrExp__ExpressionsAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1963:1: ( ( rule__OrExp__ExpressionsAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1964:1: ( rule__OrExp__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getExpressionsAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1965:1: ( rule__OrExp__ExpressionsAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1965:2: rule__OrExp__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_rule__OrExp__ExpressionsAssignment_0_in_rule__OrExp__Group__0__Impl3983);
            rule__OrExp__ExpressionsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpAccess().getExpressionsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__Group__0__Impl"


    // $ANTLR start "rule__OrExp__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1975:1: rule__OrExp__Group__1 : rule__OrExp__Group__1__Impl ;
    public final void rule__OrExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1979:1: ( rule__OrExp__Group__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1980:2: rule__OrExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExp__Group__1__Impl_in_rule__OrExp__Group__14013);
            rule__OrExp__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__Group__1"


    // $ANTLR start "rule__OrExp__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1986:1: rule__OrExp__Group__1__Impl : ( ( rule__OrExp__Group_1__0 )* ) ;
    public final void rule__OrExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1990:1: ( ( ( rule__OrExp__Group_1__0 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1991:1: ( ( rule__OrExp__Group_1__0 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1991:1: ( ( rule__OrExp__Group_1__0 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1992:1: ( rule__OrExp__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getGroup_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1993:1: ( rule__OrExp__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1993:2: rule__OrExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExp__Group_1__0_in_rule__OrExp__Group__1__Impl4040);
            	    rule__OrExp__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__Group__1__Impl"


    // $ANTLR start "rule__OrExp__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2007:1: rule__OrExp__Group_1__0 : rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 ;
    public final void rule__OrExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2011:1: ( rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2012:2: rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__0__Impl_in_rule__OrExp__Group_1__04075);
            rule__OrExp__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExp__Group_1__1_in_rule__OrExp__Group_1__04078);
            rule__OrExp__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__Group_1__0"


    // $ANTLR start "rule__OrExp__Group_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2019:1: rule__OrExp__Group_1__0__Impl : ( ( rule__OrExp__OperatorsAssignment_1_0 ) ) ;
    public final void rule__OrExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2023:1: ( ( ( rule__OrExp__OperatorsAssignment_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2024:1: ( ( rule__OrExp__OperatorsAssignment_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2024:1: ( ( rule__OrExp__OperatorsAssignment_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2025:1: ( rule__OrExp__OperatorsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getOperatorsAssignment_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2026:1: ( rule__OrExp__OperatorsAssignment_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2026:2: rule__OrExp__OperatorsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__OrExp__OperatorsAssignment_1_0_in_rule__OrExp__Group_1__0__Impl4105);
            rule__OrExp__OperatorsAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpAccess().getOperatorsAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__Group_1__0__Impl"


    // $ANTLR start "rule__OrExp__Group_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2036:1: rule__OrExp__Group_1__1 : rule__OrExp__Group_1__1__Impl ;
    public final void rule__OrExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2040:1: ( rule__OrExp__Group_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2041:2: rule__OrExp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__1__Impl_in_rule__OrExp__Group_1__14135);
            rule__OrExp__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__Group_1__1"


    // $ANTLR start "rule__OrExp__Group_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2047:1: rule__OrExp__Group_1__1__Impl : ( ( rule__OrExp__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__OrExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2051:1: ( ( ( rule__OrExp__ExpressionsAssignment_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2052:1: ( ( rule__OrExp__ExpressionsAssignment_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2052:1: ( ( rule__OrExp__ExpressionsAssignment_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2053:1: ( rule__OrExp__ExpressionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getExpressionsAssignment_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2054:1: ( rule__OrExp__ExpressionsAssignment_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2054:2: rule__OrExp__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExp__ExpressionsAssignment_1_1_in_rule__OrExp__Group_1__1__Impl4162);
            rule__OrExp__ExpressionsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpAccess().getExpressionsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__Group_1__1__Impl"


    // $ANTLR start "rule__AndExp__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2068:1: rule__AndExp__Group__0 : rule__AndExp__Group__0__Impl rule__AndExp__Group__1 ;
    public final void rule__AndExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2072:1: ( rule__AndExp__Group__0__Impl rule__AndExp__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2073:2: rule__AndExp__Group__0__Impl rule__AndExp__Group__1
            {
            pushFollow(FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__04196);
            rule__AndExp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__04199);
            rule__AndExp__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group__0"


    // $ANTLR start "rule__AndExp__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2080:1: rule__AndExp__Group__0__Impl : ( ( rule__AndExp__ExpressionsAssignment_0 ) ) ;
    public final void rule__AndExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2084:1: ( ( ( rule__AndExp__ExpressionsAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2085:1: ( ( rule__AndExp__ExpressionsAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2085:1: ( ( rule__AndExp__ExpressionsAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2086:1: ( rule__AndExp__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getExpressionsAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2087:1: ( rule__AndExp__ExpressionsAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2087:2: rule__AndExp__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_rule__AndExp__ExpressionsAssignment_0_in_rule__AndExp__Group__0__Impl4226);
            rule__AndExp__ExpressionsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpAccess().getExpressionsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group__0__Impl"


    // $ANTLR start "rule__AndExp__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2097:1: rule__AndExp__Group__1 : rule__AndExp__Group__1__Impl ;
    public final void rule__AndExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2101:1: ( rule__AndExp__Group__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2102:2: rule__AndExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__14256);
            rule__AndExp__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group__1"


    // $ANTLR start "rule__AndExp__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2108:1: rule__AndExp__Group__1__Impl : ( ( rule__AndExp__Group_1__0 )* ) ;
    public final void rule__AndExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2112:1: ( ( ( rule__AndExp__Group_1__0 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2113:1: ( ( rule__AndExp__Group_1__0 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2113:1: ( ( rule__AndExp__Group_1__0 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2114:1: ( rule__AndExp__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getGroup_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2115:1: ( rule__AndExp__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2115:2: rule__AndExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExp__Group_1__0_in_rule__AndExp__Group__1__Impl4283);
            	    rule__AndExp__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group__1__Impl"


    // $ANTLR start "rule__AndExp__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2129:1: rule__AndExp__Group_1__0 : rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 ;
    public final void rule__AndExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2133:1: ( rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2134:2: rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__0__Impl_in_rule__AndExp__Group_1__04318);
            rule__AndExp__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExp__Group_1__1_in_rule__AndExp__Group_1__04321);
            rule__AndExp__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group_1__0"


    // $ANTLR start "rule__AndExp__Group_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2141:1: rule__AndExp__Group_1__0__Impl : ( ( rule__AndExp__OperatorsAssignment_1_0 ) ) ;
    public final void rule__AndExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2145:1: ( ( ( rule__AndExp__OperatorsAssignment_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2146:1: ( ( rule__AndExp__OperatorsAssignment_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2146:1: ( ( rule__AndExp__OperatorsAssignment_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2147:1: ( rule__AndExp__OperatorsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getOperatorsAssignment_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2148:1: ( rule__AndExp__OperatorsAssignment_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2148:2: rule__AndExp__OperatorsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AndExp__OperatorsAssignment_1_0_in_rule__AndExp__Group_1__0__Impl4348);
            rule__AndExp__OperatorsAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpAccess().getOperatorsAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group_1__0__Impl"


    // $ANTLR start "rule__AndExp__Group_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2158:1: rule__AndExp__Group_1__1 : rule__AndExp__Group_1__1__Impl ;
    public final void rule__AndExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2162:1: ( rule__AndExp__Group_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2163:2: rule__AndExp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__1__Impl_in_rule__AndExp__Group_1__14378);
            rule__AndExp__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group_1__1"


    // $ANTLR start "rule__AndExp__Group_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2169:1: rule__AndExp__Group_1__1__Impl : ( ( rule__AndExp__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__AndExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2173:1: ( ( ( rule__AndExp__ExpressionsAssignment_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2174:1: ( ( rule__AndExp__ExpressionsAssignment_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2174:1: ( ( rule__AndExp__ExpressionsAssignment_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2175:1: ( rule__AndExp__ExpressionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getExpressionsAssignment_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2176:1: ( rule__AndExp__ExpressionsAssignment_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2176:2: rule__AndExp__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExp__ExpressionsAssignment_1_1_in_rule__AndExp__Group_1__1__Impl4405);
            rule__AndExp__ExpressionsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpAccess().getExpressionsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanExp__Group_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2190:1: rule__BooleanExp__Group_0__0 : rule__BooleanExp__Group_0__0__Impl rule__BooleanExp__Group_0__1 ;
    public final void rule__BooleanExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2194:1: ( rule__BooleanExp__Group_0__0__Impl rule__BooleanExp__Group_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2195:2: rule__BooleanExp__Group_0__0__Impl rule__BooleanExp__Group_0__1
            {
            pushFollow(FOLLOW_rule__BooleanExp__Group_0__0__Impl_in_rule__BooleanExp__Group_0__04439);
            rule__BooleanExp__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BooleanExp__Group_0__1_in_rule__BooleanExp__Group_0__04442);
            rule__BooleanExp__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_0__0"


    // $ANTLR start "rule__BooleanExp__Group_0__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2202:1: rule__BooleanExp__Group_0__0__Impl : ( ( rule__BooleanExp__LeftAssignment_0_0 ) ) ;
    public final void rule__BooleanExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2206:1: ( ( ( rule__BooleanExp__LeftAssignment_0_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2207:1: ( ( rule__BooleanExp__LeftAssignment_0_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2207:1: ( ( rule__BooleanExp__LeftAssignment_0_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2208:1: ( rule__BooleanExp__LeftAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getLeftAssignment_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2209:1: ( rule__BooleanExp__LeftAssignment_0_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2209:2: rule__BooleanExp__LeftAssignment_0_0
            {
            pushFollow(FOLLOW_rule__BooleanExp__LeftAssignment_0_0_in_rule__BooleanExp__Group_0__0__Impl4469);
            rule__BooleanExp__LeftAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getLeftAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_0__0__Impl"


    // $ANTLR start "rule__BooleanExp__Group_0__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2219:1: rule__BooleanExp__Group_0__1 : rule__BooleanExp__Group_0__1__Impl rule__BooleanExp__Group_0__2 ;
    public final void rule__BooleanExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2223:1: ( rule__BooleanExp__Group_0__1__Impl rule__BooleanExp__Group_0__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2224:2: rule__BooleanExp__Group_0__1__Impl rule__BooleanExp__Group_0__2
            {
            pushFollow(FOLLOW_rule__BooleanExp__Group_0__1__Impl_in_rule__BooleanExp__Group_0__14499);
            rule__BooleanExp__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BooleanExp__Group_0__2_in_rule__BooleanExp__Group_0__14502);
            rule__BooleanExp__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_0__1"


    // $ANTLR start "rule__BooleanExp__Group_0__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2231:1: rule__BooleanExp__Group_0__1__Impl : ( ( rule__BooleanExp__OperatorAssignment_0_1 ) ) ;
    public final void rule__BooleanExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2235:1: ( ( ( rule__BooleanExp__OperatorAssignment_0_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2236:1: ( ( rule__BooleanExp__OperatorAssignment_0_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2236:1: ( ( rule__BooleanExp__OperatorAssignment_0_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2237:1: ( rule__BooleanExp__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getOperatorAssignment_0_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2238:1: ( rule__BooleanExp__OperatorAssignment_0_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2238:2: rule__BooleanExp__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_rule__BooleanExp__OperatorAssignment_0_1_in_rule__BooleanExp__Group_0__1__Impl4529);
            rule__BooleanExp__OperatorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getOperatorAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_0__1__Impl"


    // $ANTLR start "rule__BooleanExp__Group_0__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2248:1: rule__BooleanExp__Group_0__2 : rule__BooleanExp__Group_0__2__Impl ;
    public final void rule__BooleanExp__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2252:1: ( rule__BooleanExp__Group_0__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2253:2: rule__BooleanExp__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__BooleanExp__Group_0__2__Impl_in_rule__BooleanExp__Group_0__24559);
            rule__BooleanExp__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_0__2"


    // $ANTLR start "rule__BooleanExp__Group_0__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2259:1: rule__BooleanExp__Group_0__2__Impl : ( ( rule__BooleanExp__RightAssignment_0_2 ) ) ;
    public final void rule__BooleanExp__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2263:1: ( ( ( rule__BooleanExp__RightAssignment_0_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2264:1: ( ( rule__BooleanExp__RightAssignment_0_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2264:1: ( ( rule__BooleanExp__RightAssignment_0_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2265:1: ( rule__BooleanExp__RightAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getRightAssignment_0_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2266:1: ( rule__BooleanExp__RightAssignment_0_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2266:2: rule__BooleanExp__RightAssignment_0_2
            {
            pushFollow(FOLLOW_rule__BooleanExp__RightAssignment_0_2_in_rule__BooleanExp__Group_0__2__Impl4586);
            rule__BooleanExp__RightAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getRightAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_0__2__Impl"


    // $ANTLR start "rule__BooleanExp__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2282:1: rule__BooleanExp__Group_1__0 : rule__BooleanExp__Group_1__0__Impl rule__BooleanExp__Group_1__1 ;
    public final void rule__BooleanExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2286:1: ( rule__BooleanExp__Group_1__0__Impl rule__BooleanExp__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2287:2: rule__BooleanExp__Group_1__0__Impl rule__BooleanExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__BooleanExp__Group_1__0__Impl_in_rule__BooleanExp__Group_1__04622);
            rule__BooleanExp__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BooleanExp__Group_1__1_in_rule__BooleanExp__Group_1__04625);
            rule__BooleanExp__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1__0"


    // $ANTLR start "rule__BooleanExp__Group_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2294:1: rule__BooleanExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__BooleanExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2298:1: ( ( '(' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2299:1: ( '(' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2299:1: ( '(' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2300:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__BooleanExp__Group_1__0__Impl4653); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanExp__Group_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2313:1: rule__BooleanExp__Group_1__1 : rule__BooleanExp__Group_1__1__Impl rule__BooleanExp__Group_1__2 ;
    public final void rule__BooleanExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2317:1: ( rule__BooleanExp__Group_1__1__Impl rule__BooleanExp__Group_1__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2318:2: rule__BooleanExp__Group_1__1__Impl rule__BooleanExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__BooleanExp__Group_1__1__Impl_in_rule__BooleanExp__Group_1__14684);
            rule__BooleanExp__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BooleanExp__Group_1__2_in_rule__BooleanExp__Group_1__14687);
            rule__BooleanExp__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1__1"


    // $ANTLR start "rule__BooleanExp__Group_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2325:1: rule__BooleanExp__Group_1__1__Impl : ( ( rule__BooleanExp__NestedExpAssignment_1_1 ) ) ;
    public final void rule__BooleanExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2329:1: ( ( ( rule__BooleanExp__NestedExpAssignment_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2330:1: ( ( rule__BooleanExp__NestedExpAssignment_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2330:1: ( ( rule__BooleanExp__NestedExpAssignment_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2331:1: ( rule__BooleanExp__NestedExpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getNestedExpAssignment_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2332:1: ( rule__BooleanExp__NestedExpAssignment_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2332:2: rule__BooleanExp__NestedExpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BooleanExp__NestedExpAssignment_1_1_in_rule__BooleanExp__Group_1__1__Impl4714);
            rule__BooleanExp__NestedExpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getNestedExpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanExp__Group_1__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2342:1: rule__BooleanExp__Group_1__2 : rule__BooleanExp__Group_1__2__Impl ;
    public final void rule__BooleanExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2346:1: ( rule__BooleanExp__Group_1__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2347:2: rule__BooleanExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BooleanExp__Group_1__2__Impl_in_rule__BooleanExp__Group_1__24744);
            rule__BooleanExp__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1__2"


    // $ANTLR start "rule__BooleanExp__Group_1__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2353:1: rule__BooleanExp__Group_1__2__Impl : ( ')' ) ;
    public final void rule__BooleanExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2357:1: ( ( ')' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2358:1: ( ')' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2358:1: ( ')' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2359:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__BooleanExp__Group_1__2__Impl4772); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1__2__Impl"


    // $ANTLR start "rule__AttributeName__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2378:1: rule__AttributeName__Group_1__0 : rule__AttributeName__Group_1__0__Impl rule__AttributeName__Group_1__1 ;
    public final void rule__AttributeName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2382:1: ( rule__AttributeName__Group_1__0__Impl rule__AttributeName__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2383:2: rule__AttributeName__Group_1__0__Impl rule__AttributeName__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_1__0__Impl_in_rule__AttributeName__Group_1__04809);
            rule__AttributeName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributeName__Group_1__1_in_rule__AttributeName__Group_1__04812);
            rule__AttributeName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group_1__0"


    // $ANTLR start "rule__AttributeName__Group_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2390:1: rule__AttributeName__Group_1__0__Impl : ( ( rule__AttributeName__ParentAssignment_1_0 ) ) ;
    public final void rule__AttributeName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2394:1: ( ( ( rule__AttributeName__ParentAssignment_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2395:1: ( ( rule__AttributeName__ParentAssignment_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2395:1: ( ( rule__AttributeName__ParentAssignment_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2396:1: ( rule__AttributeName__ParentAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeNameAccess().getParentAssignment_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2397:1: ( rule__AttributeName__ParentAssignment_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2397:2: rule__AttributeName__ParentAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AttributeName__ParentAssignment_1_0_in_rule__AttributeName__Group_1__0__Impl4839);
            rule__AttributeName__ParentAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeNameAccess().getParentAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeName__Group_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2407:1: rule__AttributeName__Group_1__1 : rule__AttributeName__Group_1__1__Impl rule__AttributeName__Group_1__2 ;
    public final void rule__AttributeName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2411:1: ( rule__AttributeName__Group_1__1__Impl rule__AttributeName__Group_1__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2412:2: rule__AttributeName__Group_1__1__Impl rule__AttributeName__Group_1__2
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_1__1__Impl_in_rule__AttributeName__Group_1__14869);
            rule__AttributeName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributeName__Group_1__2_in_rule__AttributeName__Group_1__14872);
            rule__AttributeName__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group_1__1"


    // $ANTLR start "rule__AttributeName__Group_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2419:1: rule__AttributeName__Group_1__1__Impl : ( '.' ) ;
    public final void rule__AttributeName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2423:1: ( ( '.' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2424:1: ( '.' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2424:1: ( '.' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2425:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeNameAccess().getFullStopKeyword_1_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__AttributeName__Group_1__1__Impl4900); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeNameAccess().getFullStopKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeName__Group_1__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2438:1: rule__AttributeName__Group_1__2 : rule__AttributeName__Group_1__2__Impl ;
    public final void rule__AttributeName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2442:1: ( rule__AttributeName__Group_1__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2443:2: rule__AttributeName__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_1__2__Impl_in_rule__AttributeName__Group_1__24931);
            rule__AttributeName__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group_1__2"


    // $ANTLR start "rule__AttributeName__Group_1__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2449:1: rule__AttributeName__Group_1__2__Impl : ( ( rule__AttributeName__ChildAssignment_1_2 ) ) ;
    public final void rule__AttributeName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2453:1: ( ( ( rule__AttributeName__ChildAssignment_1_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2454:1: ( ( rule__AttributeName__ChildAssignment_1_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2454:1: ( ( rule__AttributeName__ChildAssignment_1_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2455:1: ( rule__AttributeName__ChildAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeNameAccess().getChildAssignment_1_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2456:1: ( rule__AttributeName__ChildAssignment_1_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2456:2: rule__AttributeName__ChildAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AttributeName__ChildAssignment_1_2_in_rule__AttributeName__Group_1__2__Impl4958);
            rule__AttributeName__ChildAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeNameAccess().getChildAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__Group_1__2__Impl"


    // $ANTLR start "rule__AddtionExp__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2472:1: rule__AddtionExp__Group__0 : rule__AddtionExp__Group__0__Impl rule__AddtionExp__Group__1 ;
    public final void rule__AddtionExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2476:1: ( rule__AddtionExp__Group__0__Impl rule__AddtionExp__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2477:2: rule__AddtionExp__Group__0__Impl rule__AddtionExp__Group__1
            {
            pushFollow(FOLLOW_rule__AddtionExp__Group__0__Impl_in_rule__AddtionExp__Group__04994);
            rule__AddtionExp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AddtionExp__Group__1_in_rule__AddtionExp__Group__04997);
            rule__AddtionExp__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddtionExp__Group__0"


    // $ANTLR start "rule__AddtionExp__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2484:1: rule__AddtionExp__Group__0__Impl : ( ( rule__AddtionExp__ExpressionsAssignment_0 ) ) ;
    public final void rule__AddtionExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2488:1: ( ( ( rule__AddtionExp__ExpressionsAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2489:1: ( ( rule__AddtionExp__ExpressionsAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2489:1: ( ( rule__AddtionExp__ExpressionsAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2490:1: ( rule__AddtionExp__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddtionExpAccess().getExpressionsAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2491:1: ( rule__AddtionExp__ExpressionsAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2491:2: rule__AddtionExp__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_rule__AddtionExp__ExpressionsAssignment_0_in_rule__AddtionExp__Group__0__Impl5024);
            rule__AddtionExp__ExpressionsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddtionExpAccess().getExpressionsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddtionExp__Group__0__Impl"


    // $ANTLR start "rule__AddtionExp__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2501:1: rule__AddtionExp__Group__1 : rule__AddtionExp__Group__1__Impl ;
    public final void rule__AddtionExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2505:1: ( rule__AddtionExp__Group__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2506:2: rule__AddtionExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AddtionExp__Group__1__Impl_in_rule__AddtionExp__Group__15054);
            rule__AddtionExp__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddtionExp__Group__1"


    // $ANTLR start "rule__AddtionExp__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2512:1: rule__AddtionExp__Group__1__Impl : ( ( rule__AddtionExp__Alternatives_1 )* ) ;
    public final void rule__AddtionExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2516:1: ( ( ( rule__AddtionExp__Alternatives_1 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2517:1: ( ( rule__AddtionExp__Alternatives_1 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2517:1: ( ( rule__AddtionExp__Alternatives_1 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2518:1: ( rule__AddtionExp__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddtionExpAccess().getAlternatives_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2519:1: ( rule__AddtionExp__Alternatives_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31||LA15_0==43) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2519:2: rule__AddtionExp__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__AddtionExp__Alternatives_1_in_rule__AddtionExp__Group__1__Impl5081);
            	    rule__AddtionExp__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddtionExpAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddtionExp__Group__1__Impl"


    // $ANTLR start "rule__AddtionExp__Group_1_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2533:1: rule__AddtionExp__Group_1_1__0 : rule__AddtionExp__Group_1_1__0__Impl rule__AddtionExp__Group_1_1__1 ;
    public final void rule__AddtionExp__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2537:1: ( rule__AddtionExp__Group_1_1__0__Impl rule__AddtionExp__Group_1_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2538:2: rule__AddtionExp__Group_1_1__0__Impl rule__AddtionExp__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__AddtionExp__Group_1_1__0__Impl_in_rule__AddtionExp__Group_1_1__05116);
            rule__AddtionExp__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AddtionExp__Group_1_1__1_in_rule__AddtionExp__Group_1_1__05119);
            rule__AddtionExp__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddtionExp__Group_1_1__0"


    // $ANTLR start "rule__AddtionExp__Group_1_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2545:1: rule__AddtionExp__Group_1_1__0__Impl : ( '-' ) ;
    public final void rule__AddtionExp__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2549:1: ( ( '-' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2550:1: ( '-' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2550:1: ( '-' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2551:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddtionExpAccess().getHyphenMinusKeyword_1_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__AddtionExp__Group_1_1__0__Impl5147); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddtionExpAccess().getHyphenMinusKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddtionExp__Group_1_1__0__Impl"


    // $ANTLR start "rule__AddtionExp__Group_1_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2564:1: rule__AddtionExp__Group_1_1__1 : rule__AddtionExp__Group_1_1__1__Impl ;
    public final void rule__AddtionExp__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2568:1: ( rule__AddtionExp__Group_1_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2569:2: rule__AddtionExp__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AddtionExp__Group_1_1__1__Impl_in_rule__AddtionExp__Group_1_1__15178);
            rule__AddtionExp__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddtionExp__Group_1_1__1"


    // $ANTLR start "rule__AddtionExp__Group_1_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2575:1: rule__AddtionExp__Group_1_1__1__Impl : ( ( rule__AddtionExp__ExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__AddtionExp__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2579:1: ( ( ( rule__AddtionExp__ExpressionsAssignment_1_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2580:1: ( ( rule__AddtionExp__ExpressionsAssignment_1_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2580:1: ( ( rule__AddtionExp__ExpressionsAssignment_1_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2581:1: ( rule__AddtionExp__ExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddtionExpAccess().getExpressionsAssignment_1_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2582:1: ( rule__AddtionExp__ExpressionsAssignment_1_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2582:2: rule__AddtionExp__ExpressionsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__AddtionExp__ExpressionsAssignment_1_1_1_in_rule__AddtionExp__Group_1_1__1__Impl5205);
            rule__AddtionExp__ExpressionsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddtionExpAccess().getExpressionsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddtionExp__Group_1_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExp__Group_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2596:1: rule__MultiplicationExp__Group_0__0 : rule__MultiplicationExp__Group_0__0__Impl rule__MultiplicationExp__Group_0__1 ;
    public final void rule__MultiplicationExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2600:1: ( rule__MultiplicationExp__Group_0__0__Impl rule__MultiplicationExp__Group_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2601:2: rule__MultiplicationExp__Group_0__0__Impl rule__MultiplicationExp__Group_0__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_0__0__Impl_in_rule__MultiplicationExp__Group_0__05239);
            rule__MultiplicationExp__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_0__1_in_rule__MultiplicationExp__Group_0__05242);
            rule__MultiplicationExp__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Group_0__0"


    // $ANTLR start "rule__MultiplicationExp__Group_0__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2608:1: rule__MultiplicationExp__Group_0__0__Impl : ( ( rule__MultiplicationExp__ExpressionsAssignment_0_0 ) ) ;
    public final void rule__MultiplicationExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2612:1: ( ( ( rule__MultiplicationExp__ExpressionsAssignment_0_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2613:1: ( ( rule__MultiplicationExp__ExpressionsAssignment_0_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2613:1: ( ( rule__MultiplicationExp__ExpressionsAssignment_0_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2614:1: ( rule__MultiplicationExp__ExpressionsAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getExpressionsAssignment_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2615:1: ( rule__MultiplicationExp__ExpressionsAssignment_0_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2615:2: rule__MultiplicationExp__ExpressionsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__ExpressionsAssignment_0_0_in_rule__MultiplicationExp__Group_0__0__Impl5269);
            rule__MultiplicationExp__ExpressionsAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getExpressionsAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Group_0__0__Impl"


    // $ANTLR start "rule__MultiplicationExp__Group_0__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2625:1: rule__MultiplicationExp__Group_0__1 : rule__MultiplicationExp__Group_0__1__Impl ;
    public final void rule__MultiplicationExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2629:1: ( rule__MultiplicationExp__Group_0__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2630:2: rule__MultiplicationExp__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_0__1__Impl_in_rule__MultiplicationExp__Group_0__15299);
            rule__MultiplicationExp__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Group_0__1"


    // $ANTLR start "rule__MultiplicationExp__Group_0__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2636:1: rule__MultiplicationExp__Group_0__1__Impl : ( ( rule__MultiplicationExp__Alternatives_0_1 )* ) ;
    public final void rule__MultiplicationExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2640:1: ( ( ( rule__MultiplicationExp__Alternatives_0_1 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2641:1: ( ( rule__MultiplicationExp__Alternatives_0_1 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2641:1: ( ( rule__MultiplicationExp__Alternatives_0_1 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2642:1: ( rule__MultiplicationExp__Alternatives_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getAlternatives_0_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2643:1: ( rule__MultiplicationExp__Alternatives_0_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32||LA16_0==44) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2643:2: rule__MultiplicationExp__Alternatives_0_1
            	    {
            	    pushFollow(FOLLOW_rule__MultiplicationExp__Alternatives_0_1_in_rule__MultiplicationExp__Group_0__1__Impl5326);
            	    rule__MultiplicationExp__Alternatives_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getAlternatives_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Group_0__1__Impl"


    // $ANTLR start "rule__MultiplicationExp__Group_0_1_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2657:1: rule__MultiplicationExp__Group_0_1_1__0 : rule__MultiplicationExp__Group_0_1_1__0__Impl rule__MultiplicationExp__Group_0_1_1__1 ;
    public final void rule__MultiplicationExp__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2661:1: ( rule__MultiplicationExp__Group_0_1_1__0__Impl rule__MultiplicationExp__Group_0_1_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2662:2: rule__MultiplicationExp__Group_0_1_1__0__Impl rule__MultiplicationExp__Group_0_1_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_0_1_1__0__Impl_in_rule__MultiplicationExp__Group_0_1_1__05361);
            rule__MultiplicationExp__Group_0_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_0_1_1__1_in_rule__MultiplicationExp__Group_0_1_1__05364);
            rule__MultiplicationExp__Group_0_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Group_0_1_1__0"


    // $ANTLR start "rule__MultiplicationExp__Group_0_1_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2669:1: rule__MultiplicationExp__Group_0_1_1__0__Impl : ( '/' ) ;
    public final void rule__MultiplicationExp__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2673:1: ( ( '/' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2674:1: ( '/' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2674:1: ( '/' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2675:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getSolidusKeyword_0_1_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__MultiplicationExp__Group_0_1_1__0__Impl5392); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getSolidusKeyword_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Group_0_1_1__0__Impl"


    // $ANTLR start "rule__MultiplicationExp__Group_0_1_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2688:1: rule__MultiplicationExp__Group_0_1_1__1 : rule__MultiplicationExp__Group_0_1_1__1__Impl ;
    public final void rule__MultiplicationExp__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2692:1: ( rule__MultiplicationExp__Group_0_1_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2693:2: rule__MultiplicationExp__Group_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_0_1_1__1__Impl_in_rule__MultiplicationExp__Group_0_1_1__15423);
            rule__MultiplicationExp__Group_0_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Group_0_1_1__1"


    // $ANTLR start "rule__MultiplicationExp__Group_0_1_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2699:1: rule__MultiplicationExp__Group_0_1_1__1__Impl : ( ( rule__MultiplicationExp__ExpressionsAssignment_0_1_1_1 ) ) ;
    public final void rule__MultiplicationExp__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2703:1: ( ( ( rule__MultiplicationExp__ExpressionsAssignment_0_1_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2704:1: ( ( rule__MultiplicationExp__ExpressionsAssignment_0_1_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2704:1: ( ( rule__MultiplicationExp__ExpressionsAssignment_0_1_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2705:1: ( rule__MultiplicationExp__ExpressionsAssignment_0_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getExpressionsAssignment_0_1_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2706:1: ( rule__MultiplicationExp__ExpressionsAssignment_0_1_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2706:2: rule__MultiplicationExp__ExpressionsAssignment_0_1_1_1
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__ExpressionsAssignment_0_1_1_1_in_rule__MultiplicationExp__Group_0_1_1__1__Impl5450);
            rule__MultiplicationExp__ExpressionsAssignment_0_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getExpressionsAssignment_0_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Group_0_1_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExp__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2720:1: rule__MultiplicationExp__Group_1__0 : rule__MultiplicationExp__Group_1__0__Impl rule__MultiplicationExp__Group_1__1 ;
    public final void rule__MultiplicationExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2724:1: ( rule__MultiplicationExp__Group_1__0__Impl rule__MultiplicationExp__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2725:2: rule__MultiplicationExp__Group_1__0__Impl rule__MultiplicationExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_1__0__Impl_in_rule__MultiplicationExp__Group_1__05484);
            rule__MultiplicationExp__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_1__1_in_rule__MultiplicationExp__Group_1__05487);
            rule__MultiplicationExp__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Group_1__0"


    // $ANTLR start "rule__MultiplicationExp__Group_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2732:1: rule__MultiplicationExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__MultiplicationExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2736:1: ( ( '(' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2737:1: ( '(' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2737:1: ( '(' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2738:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__MultiplicationExp__Group_1__0__Impl5515); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicationExp__Group_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2751:1: rule__MultiplicationExp__Group_1__1 : rule__MultiplicationExp__Group_1__1__Impl rule__MultiplicationExp__Group_1__2 ;
    public final void rule__MultiplicationExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2755:1: ( rule__MultiplicationExp__Group_1__1__Impl rule__MultiplicationExp__Group_1__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2756:2: rule__MultiplicationExp__Group_1__1__Impl rule__MultiplicationExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_1__1__Impl_in_rule__MultiplicationExp__Group_1__15546);
            rule__MultiplicationExp__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_1__2_in_rule__MultiplicationExp__Group_1__15549);
            rule__MultiplicationExp__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Group_1__1"


    // $ANTLR start "rule__MultiplicationExp__Group_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2763:1: rule__MultiplicationExp__Group_1__1__Impl : ( ruleAddtionExp ) ;
    public final void rule__MultiplicationExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2767:1: ( ( ruleAddtionExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2768:1: ( ruleAddtionExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2768:1: ( ruleAddtionExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2769:1: ruleAddtionExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getAddtionExpParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleAddtionExp_in_rule__MultiplicationExp__Group_1__1__Impl5576);
            ruleAddtionExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getAddtionExpParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExp__Group_1__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2780:1: rule__MultiplicationExp__Group_1__2 : rule__MultiplicationExp__Group_1__2__Impl ;
    public final void rule__MultiplicationExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2784:1: ( rule__MultiplicationExp__Group_1__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2785:2: rule__MultiplicationExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_1__2__Impl_in_rule__MultiplicationExp__Group_1__25605);
            rule__MultiplicationExp__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Group_1__2"


    // $ANTLR start "rule__MultiplicationExp__Group_1__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2791:1: rule__MultiplicationExp__Group_1__2__Impl : ( ')' ) ;
    public final void rule__MultiplicationExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2795:1: ( ( ')' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2796:1: ( ')' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2796:1: ( ')' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2797:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__MultiplicationExp__Group_1__2__Impl5633); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__Group_1__2__Impl"


    // $ANTLR start "rule__ValueAssignment__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2816:1: rule__ValueAssignment__Group__0 : rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1 ;
    public final void rule__ValueAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2820:1: ( rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2821:2: rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__0__Impl_in_rule__ValueAssignment__Group__05670);
            rule__ValueAssignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ValueAssignment__Group__1_in_rule__ValueAssignment__Group__05673);
            rule__ValueAssignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueAssignment__Group__0"


    // $ANTLR start "rule__ValueAssignment__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2828:1: rule__ValueAssignment__Group__0__Impl : ( ( rule__ValueAssignment__NameAssignment_0 ) ) ;
    public final void rule__ValueAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2832:1: ( ( ( rule__ValueAssignment__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2833:1: ( ( rule__ValueAssignment__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2833:1: ( ( rule__ValueAssignment__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2834:1: ( rule__ValueAssignment__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAssignmentAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2835:1: ( rule__ValueAssignment__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2835:2: rule__ValueAssignment__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ValueAssignment__NameAssignment_0_in_rule__ValueAssignment__Group__0__Impl5700);
            rule__ValueAssignment__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAssignmentAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueAssignment__Group__0__Impl"


    // $ANTLR start "rule__ValueAssignment__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2845:1: rule__ValueAssignment__Group__1 : rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2 ;
    public final void rule__ValueAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2849:1: ( rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2850:2: rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__1__Impl_in_rule__ValueAssignment__Group__15730);
            rule__ValueAssignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ValueAssignment__Group__2_in_rule__ValueAssignment__Group__15733);
            rule__ValueAssignment__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueAssignment__Group__1"


    // $ANTLR start "rule__ValueAssignment__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2857:1: rule__ValueAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__ValueAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2861:1: ( ( '=' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2862:1: ( '=' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2862:1: ( '=' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2863:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__ValueAssignment__Group__1__Impl5761); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAssignmentAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueAssignment__Group__1__Impl"


    // $ANTLR start "rule__ValueAssignment__Group__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2876:1: rule__ValueAssignment__Group__2 : rule__ValueAssignment__Group__2__Impl ;
    public final void rule__ValueAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2880:1: ( rule__ValueAssignment__Group__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2881:2: rule__ValueAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__2__Impl_in_rule__ValueAssignment__Group__25792);
            rule__ValueAssignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueAssignment__Group__2"


    // $ANTLR start "rule__ValueAssignment__Group__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2887:1: rule__ValueAssignment__Group__2__Impl : ( ( rule__ValueAssignment__AdditionAssignment_2 ) ) ;
    public final void rule__ValueAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2891:1: ( ( ( rule__ValueAssignment__AdditionAssignment_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2892:1: ( ( rule__ValueAssignment__AdditionAssignment_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2892:1: ( ( rule__ValueAssignment__AdditionAssignment_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2893:1: ( rule__ValueAssignment__AdditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAssignmentAccess().getAdditionAssignment_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2894:1: ( rule__ValueAssignment__AdditionAssignment_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2894:2: rule__ValueAssignment__AdditionAssignment_2
            {
            pushFollow(FOLLOW_rule__ValueAssignment__AdditionAssignment_2_in_rule__ValueAssignment__Group__2__Impl5819);
            rule__ValueAssignment__AdditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAssignmentAccess().getAdditionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueAssignment__Group__2__Impl"


    // $ANTLR start "rule__Model__UnorderedGroup"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2911:1: rule__Model__UnorderedGroup : rule__Model__UnorderedGroup__0 {...}?;
    public final void rule__Model__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2916:1: ( rule__Model__UnorderedGroup__0 {...}?)
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2917:2: rule__Model__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__0_in_rule__Model__UnorderedGroup5856);
            rule__Model__UnorderedGroup__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__Model__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UnorderedGroup"


    // $ANTLR start "rule__Model__UnorderedGroup__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2928:1: rule__Model__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) ) ) | ({...}? => ( ( ( rule__Model__RulesAssignment_3 ) ) ) ) ) ;
    public final void rule__Model__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2933:1: ( ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) ) ) | ({...}? => ( ( ( rule__Model__RulesAssignment_3 ) ) ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2934:3: ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) ) ) | ({...}? => ( ( ( rule__Model__RulesAssignment_3 ) ) ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2934:3: ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) ) ) | ({...}? => ( ( ( rule__Model__RulesAssignment_3 ) ) ) ) )
            int alt18=4;
            int LA18_0 = input.LA(1);

            if ( LA18_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt18=1;
            }
            else if ( (LA18_0==23||LA18_0==35) && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt18=2;
            }
            else if ( LA18_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                alt18=3;
            }
            else if ( LA18_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {
                alt18=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2936:4: ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2936:4: ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2937:5: {...}? => ( ( ( rule__Model__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2937:100: ( ( ( rule__Model__Group_0__0 ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2938:6: ( ( rule__Model__Group_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2944:6: ( ( rule__Model__Group_0__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2946:7: ( rule__Model__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getGroup_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2947:7: ( rule__Model__Group_0__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2947:8: rule__Model__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_0__0_in_rule__Model__UnorderedGroup__Impl5945);
                    rule__Model__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getGroup_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2953:4: ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2953:4: ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2954:5: {...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2954:100: ( ( ( rule__Model__BoardAssignment_1 ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2955:6: ( ( rule__Model__BoardAssignment_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2961:6: ( ( rule__Model__BoardAssignment_1 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2963:7: ( rule__Model__BoardAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getBoardAssignment_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2964:7: ( rule__Model__BoardAssignment_1 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2964:8: rule__Model__BoardAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__BoardAssignment_1_in_rule__Model__UnorderedGroup__Impl6036);
                    rule__Model__BoardAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getBoardAssignment_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2970:4: ({...}? => ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2970:4: ({...}? => ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2971:5: {...}? => ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2)");
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2971:100: ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2972:6: ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 2);
                    selected = true;
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2978:6: ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2979:6: ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2979:6: ( ( rule__Model__TokensAssignment_2 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2980:7: ( rule__Model__TokensAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getTokensAssignment_2()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2981:7: ( rule__Model__TokensAssignment_2 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2981:8: rule__Model__TokensAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__TokensAssignment_2_in_rule__Model__UnorderedGroup__Impl6128);
                    rule__Model__TokensAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getTokensAssignment_2()); 
                    }

                    }

                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2984:6: ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2985:7: ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getTokensAssignment_2()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2986:7: ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==11) ) {
                            int LA17_2 = input.LA(2);

                            if ( (LA17_2==RULE_ID) ) {
                                int LA17_3 = input.LA(3);

                                if ( (LA17_3==22) ) {
                                    int LA17_4 = input.LA(4);

                                    if ( (LA17_4==23) ) {
                                        int LA17_5 = input.LA(5);

                                        if ( (synpred1_InternalBGL()) ) {
                                            alt17=1;
                                        }


                                    }


                                }


                            }


                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2986:8: ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2
                    	    {
                    	    pushFollow(FOLLOW_rule__Model__TokensAssignment_2_in_rule__Model__UnorderedGroup__Impl6172);
                    	    rule__Model__TokensAssignment_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getTokensAssignment_2()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2992:4: ({...}? => ( ( ( rule__Model__RulesAssignment_3 ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2992:4: ({...}? => ( ( ( rule__Model__RulesAssignment_3 ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2993:5: {...}? => ( ( ( rule__Model__RulesAssignment_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3)");
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2993:100: ( ( ( rule__Model__RulesAssignment_3 ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2994:6: ( ( rule__Model__RulesAssignment_3 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 3);
                    selected = true;
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3000:6: ( ( rule__Model__RulesAssignment_3 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3002:7: ( rule__Model__RulesAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getRulesAssignment_3()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3003:7: ( rule__Model__RulesAssignment_3 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3003:8: rule__Model__RulesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Model__RulesAssignment_3_in_rule__Model__UnorderedGroup__Impl6270);
                    rule__Model__RulesAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getRulesAssignment_3()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UnorderedGroup__Impl"


    // $ANTLR start "rule__Model__UnorderedGroup__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3018:1: rule__Model__UnorderedGroup__0 : rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )? ;
    public final void rule__Model__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3022:1: ( rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )? )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3023:2: rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__06329);
            rule__Model__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3024:2: ( rule__Model__UnorderedGroup__1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt19=1;
            }
            else if ( (LA19_0==23||LA19_0==35) && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt19=1;
            }
            else if ( LA19_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                alt19=1;
            }
            else if ( LA19_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3024:2: rule__Model__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__Model__UnorderedGroup__1_in_rule__Model__UnorderedGroup__06332);
                    rule__Model__UnorderedGroup__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UnorderedGroup__0"


    // $ANTLR start "rule__Model__UnorderedGroup__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3031:1: rule__Model__UnorderedGroup__1 : rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__2 )? ;
    public final void rule__Model__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3035:1: ( rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__2 )? )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3036:2: rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__16357);
            rule__Model__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3037:2: ( rule__Model__UnorderedGroup__2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt20=1;
            }
            else if ( (LA20_0==23||LA20_0==35) && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt20=1;
            }
            else if ( LA20_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                alt20=1;
            }
            else if ( LA20_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3037:2: rule__Model__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_rule__Model__UnorderedGroup__2_in_rule__Model__UnorderedGroup__16360);
                    rule__Model__UnorderedGroup__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UnorderedGroup__1"


    // $ANTLR start "rule__Model__UnorderedGroup__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3044:1: rule__Model__UnorderedGroup__2 : rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__3 )? ;
    public final void rule__Model__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3048:1: ( rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__3 )? )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3049:2: rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__26385);
            rule__Model__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3050:2: ( rule__Model__UnorderedGroup__3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt21=1;
            }
            else if ( (LA21_0==23||LA21_0==35) && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt21=1;
            }
            else if ( LA21_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                alt21=1;
            }
            else if ( LA21_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3050:2: rule__Model__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_rule__Model__UnorderedGroup__3_in_rule__Model__UnorderedGroup__26388);
                    rule__Model__UnorderedGroup__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UnorderedGroup__2"


    // $ANTLR start "rule__Model__UnorderedGroup__3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3057:1: rule__Model__UnorderedGroup__3 : rule__Model__UnorderedGroup__Impl ;
    public final void rule__Model__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3061:1: ( rule__Model__UnorderedGroup__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3062:2: rule__Model__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__36413);
            rule__Model__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UnorderedGroup__3"


    // $ANTLR start "rule__Board__UnorderedGroup"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3077:1: rule__Board__UnorderedGroup : rule__Board__UnorderedGroup__0 {...}?;
    public final void rule__Board__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getBoardAccess().getUnorderedGroup());
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3082:1: ( rule__Board__UnorderedGroup__0 {...}?)
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3083:2: rule__Board__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__Board__UnorderedGroup__0_in_rule__Board__UnorderedGroup6445);
            rule__Board__UnorderedGroup__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBoardAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__Board__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getBoardAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getBoardAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__UnorderedGroup"


    // $ANTLR start "rule__Board__UnorderedGroup__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3094:1: rule__Board__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Board__Group_0__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) ) ;
    public final void rule__Board__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3099:1: ( ( ({...}? => ( ( ( rule__Board__Group_0__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3100:3: ( ({...}? => ( ( ( rule__Board__Group_0__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3100:3: ( ({...}? => ( ( ( rule__Board__Group_0__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3102:4: ({...}? => ( ( ( rule__Board__Group_0__0 ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3102:4: ({...}? => ( ( ( rule__Board__Group_0__0 ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3103:5: {...}? => ( ( ( rule__Board__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Board__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0)");
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3103:100: ( ( ( rule__Board__Group_0__0 ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3104:6: ( ( rule__Board__Group_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBoardAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3110:6: ( ( rule__Board__Group_0__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3112:7: ( rule__Board__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoardAccess().getGroup_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3113:7: ( rule__Board__Group_0__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3113:8: rule__Board__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Board__Group_0__0_in_rule__Board__UnorderedGroup__Impl6534);
                    rule__Board__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoardAccess().getGroup_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3119:4: ({...}? => ( ( ( '}' ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3119:4: ({...}? => ( ( ( '}' ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3120:5: {...}? => ( ( ( '}' ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Board__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1)");
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3120:100: ( ( ( '}' ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3121:6: ( ( '}' ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBoardAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3127:6: ( ( '}' ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3129:7: ( '}' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3130:7: ( '}' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3131:2: '}'
                    {
                    match(input,23,FOLLOW_23_in_rule__Board__UnorderedGroup__Impl6627); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoardAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__UnorderedGroup__Impl"


    // $ANTLR start "rule__Board__UnorderedGroup__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3147:1: rule__Board__UnorderedGroup__0 : rule__Board__UnorderedGroup__Impl ( rule__Board__UnorderedGroup__1 )? ;
    public final void rule__Board__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3151:1: ( rule__Board__UnorderedGroup__Impl ( rule__Board__UnorderedGroup__1 )? )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3152:2: rule__Board__UnorderedGroup__Impl ( rule__Board__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__Board__UnorderedGroup__Impl_in_rule__Board__UnorderedGroup__06688);
            rule__Board__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3153:2: ( rule__Board__UnorderedGroup__1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==22) ) {
                    int LA23_4 = input.LA(3);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0) ) {
                        alt23=1;
                    }
                }
            }
            else if ( (LA23_0==23) ) {
                int LA23_2 = input.LA(2);

                if ( getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3153:2: rule__Board__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__Board__UnorderedGroup__1_in_rule__Board__UnorderedGroup__06691);
                    rule__Board__UnorderedGroup__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__UnorderedGroup__0"


    // $ANTLR start "rule__Board__UnorderedGroup__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3160:1: rule__Board__UnorderedGroup__1 : rule__Board__UnorderedGroup__Impl ;
    public final void rule__Board__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3164:1: ( rule__Board__UnorderedGroup__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3165:2: rule__Board__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__Board__UnorderedGroup__Impl_in_rule__Board__UnorderedGroup__16716);
            rule__Board__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__UnorderedGroup__1"


    // $ANTLR start "rule__Model__NameAssignment_0_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3176:1: rule__Model__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3180:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3181:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3181:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3182:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_0_16748); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_0_1"


    // $ANTLR start "rule__Model__PlayerAssignment_0_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3191:1: rule__Model__PlayerAssignment_0_2 : ( rulePlayer ) ;
    public final void rule__Model__PlayerAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3195:1: ( ( rulePlayer ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3196:1: ( rulePlayer )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3196:1: ( rulePlayer )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3197:1: rulePlayer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPlayerPlayerParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePlayer_in_rule__Model__PlayerAssignment_0_26779);
            rulePlayer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPlayerPlayerParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PlayerAssignment_0_2"


    // $ANTLR start "rule__Model__BoardAssignment_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3206:1: rule__Model__BoardAssignment_1 : ( ruleBoard ) ;
    public final void rule__Model__BoardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3210:1: ( ( ruleBoard ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3211:1: ( ruleBoard )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3211:1: ( ruleBoard )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3212:1: ruleBoard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getBoardBoardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleBoard_in_rule__Model__BoardAssignment_16810);
            ruleBoard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getBoardBoardParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__BoardAssignment_1"


    // $ANTLR start "rule__Model__TokensAssignment_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3221:1: rule__Model__TokensAssignment_2 : ( ruleToken ) ;
    public final void rule__Model__TokensAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3225:1: ( ( ruleToken ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3226:1: ( ruleToken )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3226:1: ( ruleToken )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3227:1: ruleToken
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getTokensTokenParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleToken_in_rule__Model__TokensAssignment_26841);
            ruleToken();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getTokensTokenParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TokensAssignment_2"


    // $ANTLR start "rule__Model__RulesAssignment_3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3236:1: rule__Model__RulesAssignment_3 : ( ruleRules ) ;
    public final void rule__Model__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3240:1: ( ( ruleRules ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3241:1: ( ruleRules )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3241:1: ( ruleRules )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3242:1: ruleRules
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRulesRulesParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleRules_in_rule__Model__RulesAssignment_36872);
            ruleRules();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRulesRulesParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RulesAssignment_3"


    // $ANTLR start "rule__Player__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3251:1: rule__Player__NameAssignment_0 : ( ( 'PLAYERS' ) ) ;
    public final void rule__Player__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3255:1: ( ( ( 'PLAYERS' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3256:1: ( ( 'PLAYERS' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3256:1: ( ( 'PLAYERS' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3257:1: ( 'PLAYERS' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getNamePLAYERSKeyword_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3258:1: ( 'PLAYERS' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3259:1: 'PLAYERS'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getNamePLAYERSKeyword_0_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Player__NameAssignment_06908); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getNamePLAYERSKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getNamePLAYERSKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__NameAssignment_0"


    // $ANTLR start "rule__Player__PlayercountAssignment_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3274:1: rule__Player__PlayercountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Player__PlayercountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3278:1: ( ( RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3279:1: ( RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3279:1: ( RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3280:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getPlayercountINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Player__PlayercountAssignment_16947); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getPlayercountINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__PlayercountAssignment_1"


    // $ANTLR start "rule__Board__NameAssignment_0_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3289:1: rule__Board__NameAssignment_0_0 : ( ( 'BOARD' ) ) ;
    public final void rule__Board__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3293:1: ( ( ( 'BOARD' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3294:1: ( ( 'BOARD' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3294:1: ( ( 'BOARD' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3295:1: ( 'BOARD' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getNameBOARDKeyword_0_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3296:1: ( 'BOARD' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3297:1: 'BOARD'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getNameBOARDKeyword_0_0_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Board__NameAssignment_0_06983); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getNameBOARDKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getNameBOARDKeyword_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__NameAssignment_0_0"


    // $ANTLR start "rule__Board__FieldsAssignment_0_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3312:1: rule__Board__FieldsAssignment_0_2 : ( ruleField ) ;
    public final void rule__Board__FieldsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3316:1: ( ( ruleField ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3317:1: ( ruleField )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3317:1: ( ruleField )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3318:1: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getFieldsFieldParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleField_in_rule__Board__FieldsAssignment_0_27022);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getFieldsFieldParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__FieldsAssignment_0_2"


    // $ANTLR start "rule__Rules__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3327:1: rule__Rules__NameAssignment_0 : ( ( 'RULES' ) ) ;
    public final void rule__Rules__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3331:1: ( ( ( 'RULES' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3332:1: ( ( 'RULES' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3332:1: ( ( 'RULES' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3333:1: ( 'RULES' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesAccess().getNameRULESKeyword_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3334:1: ( 'RULES' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3335:1: 'RULES'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesAccess().getNameRULESKeyword_0_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Rules__NameAssignment_07058); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesAccess().getNameRULESKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesAccess().getNameRULESKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__NameAssignment_0"


    // $ANTLR start "rule__Rules__TurnrulesAssignment_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3350:1: rule__Rules__TurnrulesAssignment_2 : ( ruleTurnRules ) ;
    public final void rule__Rules__TurnrulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3354:1: ( ( ruleTurnRules ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3355:1: ( ruleTurnRules )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3355:1: ( ruleTurnRules )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3356:1: ruleTurnRules
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesAccess().getTurnrulesTurnRulesParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTurnRules_in_rule__Rules__TurnrulesAssignment_27097);
            ruleTurnRules();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulesAccess().getTurnrulesTurnRulesParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__TurnrulesAssignment_2"


    // $ANTLR start "rule__TurnRules__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3365:1: rule__TurnRules__NameAssignment_0 : ( ( 'TURN' ) ) ;
    public final void rule__TurnRules__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3369:1: ( ( ( 'TURN' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3370:1: ( ( 'TURN' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3370:1: ( ( 'TURN' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3371:1: ( 'TURN' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesAccess().getNameTURNKeyword_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3372:1: ( 'TURN' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3373:1: 'TURN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesAccess().getNameTURNKeyword_0_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__TurnRules__NameAssignment_07133); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnRulesAccess().getNameTURNKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnRulesAccess().getNameTURNKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRules__NameAssignment_0"


    // $ANTLR start "rule__TurnRules__ActionsAssignment_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3388:1: rule__TurnRules__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__TurnRules__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3392:1: ( ( ruleAction ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3393:1: ( ruleAction )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3393:1: ( ruleAction )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3394:1: ruleAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesAccess().getActionsActionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAction_in_rule__TurnRules__ActionsAssignment_27172);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTurnRulesAccess().getActionsActionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRules__ActionsAssignment_2"


    // $ANTLR start "rule__Token__NameAssignment_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3403:1: rule__Token__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Token__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3407:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3408:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3408:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3409:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Token__NameAssignment_17203); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__NameAssignment_1"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3418:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3422:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3423:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3423:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3424:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_07234); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_0"


    // $ANTLR start "rule__Field__XAssignment_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3433:1: rule__Field__XAssignment_2 : ( RULE_INT ) ;
    public final void rule__Field__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3437:1: ( ( RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3438:1: ( RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3438:1: ( RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3439:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getXINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__XAssignment_27265); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getXINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__XAssignment_2"


    // $ANTLR start "rule__Field__YAssignment_4"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3448:1: rule__Field__YAssignment_4 : ( RULE_INT ) ;
    public final void rule__Field__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3452:1: ( ( RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3453:1: ( RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3453:1: ( RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3454:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getYINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__YAssignment_47296); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getYINTTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__YAssignment_4"


    // $ANTLR start "rule__Field__ZAssignment_6"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3463:1: rule__Field__ZAssignment_6 : ( RULE_INT ) ;
    public final void rule__Field__ZAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3467:1: ( ( RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3468:1: ( RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3468:1: ( RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3469:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getZINTTerminalRuleCall_6_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__ZAssignment_67327); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getZINTTerminalRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__ZAssignment_6"


    // $ANTLR start "rule__Field__NeighboursAssignment_9"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3478:1: rule__Field__NeighboursAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Field__NeighboursAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3482:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3483:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3483:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3484:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNeighboursFieldCrossReference_9_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3485:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3486:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNeighboursFieldIDTerminalRuleCall_9_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NeighboursAssignment_97362); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNeighboursFieldIDTerminalRuleCall_9_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNeighboursFieldCrossReference_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NeighboursAssignment_9"


    // $ANTLR start "rule__Action__NameAssignment_0_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3497:1: rule__Action__NameAssignment_0_0 : ( ( 'SPAWN' ) ) ;
    public final void rule__Action__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3501:1: ( ( ( 'SPAWN' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3502:1: ( ( 'SPAWN' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3502:1: ( ( 'SPAWN' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3503:1: ( 'SPAWN' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameSPAWNKeyword_0_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3504:1: ( 'SPAWN' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3505:1: 'SPAWN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameSPAWNKeyword_0_0_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Action__NameAssignment_0_07402); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getNameSPAWNKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getNameSPAWNKeyword_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment_0_0"


    // $ANTLR start "rule__Action__TokenAssignment_0_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3520:1: rule__Action__TokenAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Action__TokenAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3524:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3525:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3525:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3526:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTokenTokenCrossReference_0_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3527:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3528:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTokenTokenIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__TokenAssignment_0_17445); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getTokenTokenIDTerminalRuleCall_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getTokenTokenCrossReference_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__TokenAssignment_0_1"


    // $ANTLR start "rule__Action__NameAssignment_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3539:1: rule__Action__NameAssignment_1 : ( ( 'MOVE' ) ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3543:1: ( ( ( 'MOVE' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3544:1: ( ( 'MOVE' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3544:1: ( ( 'MOVE' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3545:1: ( 'MOVE' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameMOVEKeyword_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3546:1: ( 'MOVE' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3547:1: 'MOVE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameMOVEKeyword_1_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Action__NameAssignment_17485); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getNameMOVEKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getNameMOVEKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment_1"


    // $ANTLR start "rule__Action__NameAssignment_2_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3562:1: rule__Action__NameAssignment_2_0 : ( ( 'SELECT' ) ) ;
    public final void rule__Action__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3566:1: ( ( ( 'SELECT' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3567:1: ( ( 'SELECT' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3567:1: ( ( 'SELECT' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3568:1: ( 'SELECT' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameSELECTKeyword_2_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3569:1: ( 'SELECT' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3570:1: 'SELECT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameSELECTKeyword_2_0_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Action__NameAssignment_2_07529); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getNameSELECTKeyword_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getNameSELECTKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment_2_0"


    // $ANTLR start "rule__Action__ObjectOfSelectAssignment_2_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3585:1: rule__Action__ObjectOfSelectAssignment_2_1 : ( ( rule__Action__ObjectOfSelectAlternatives_2_1_0 ) ) ;
    public final void rule__Action__ObjectOfSelectAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3589:1: ( ( ( rule__Action__ObjectOfSelectAlternatives_2_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3590:1: ( ( rule__Action__ObjectOfSelectAlternatives_2_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3590:1: ( ( rule__Action__ObjectOfSelectAlternatives_2_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3591:1: ( rule__Action__ObjectOfSelectAlternatives_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getObjectOfSelectAlternatives_2_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3592:1: ( rule__Action__ObjectOfSelectAlternatives_2_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3592:2: rule__Action__ObjectOfSelectAlternatives_2_1_0
            {
            pushFollow(FOLLOW_rule__Action__ObjectOfSelectAlternatives_2_1_0_in_rule__Action__ObjectOfSelectAssignment_2_17568);
            rule__Action__ObjectOfSelectAlternatives_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getObjectOfSelectAlternatives_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ObjectOfSelectAssignment_2_1"


    // $ANTLR start "rule__Action__FilterAssignment_2_3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3601:1: rule__Action__FilterAssignment_2_3 : ( ruleOrExp ) ;
    public final void rule__Action__FilterAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3605:1: ( ( ruleOrExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3606:1: ( ruleOrExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3606:1: ( ruleOrExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3607:1: ruleOrExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getFilterOrExpParserRuleCall_2_3_0()); 
            }
            pushFollow(FOLLOW_ruleOrExp_in_rule__Action__FilterAssignment_2_37601);
            ruleOrExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getFilterOrExpParserRuleCall_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__FilterAssignment_2_3"


    // $ANTLR start "rule__Action__AssignmentAssignment_3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3616:1: rule__Action__AssignmentAssignment_3 : ( ruleValueAssignment ) ;
    public final void rule__Action__AssignmentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3620:1: ( ( ruleValueAssignment ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3621:1: ( ruleValueAssignment )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3621:1: ( ruleValueAssignment )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3622:1: ruleValueAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getAssignmentValueAssignmentParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleValueAssignment_in_rule__Action__AssignmentAssignment_37632);
            ruleValueAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getAssignmentValueAssignmentParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__AssignmentAssignment_3"


    // $ANTLR start "rule__OrExp__ExpressionsAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3631:1: rule__OrExp__ExpressionsAssignment_0 : ( ruleAndExp ) ;
    public final void rule__OrExp__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3635:1: ( ( ruleAndExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3636:1: ( ruleAndExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3636:1: ( ruleAndExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3637:1: ruleAndExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getExpressionsAndExpParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAndExp_in_rule__OrExp__ExpressionsAssignment_07663);
            ruleAndExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpAccess().getExpressionsAndExpParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__ExpressionsAssignment_0"


    // $ANTLR start "rule__OrExp__OperatorsAssignment_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3646:1: rule__OrExp__OperatorsAssignment_1_0 : ( ( 'OR' ) ) ;
    public final void rule__OrExp__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3650:1: ( ( ( 'OR' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3651:1: ( ( 'OR' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3651:1: ( ( 'OR' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3652:1: ( 'OR' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getOperatorsORKeyword_1_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3653:1: ( 'OR' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3654:1: 'OR'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getOperatorsORKeyword_1_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__OrExp__OperatorsAssignment_1_07699); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpAccess().getOperatorsORKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpAccess().getOperatorsORKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__OperatorsAssignment_1_0"


    // $ANTLR start "rule__OrExp__ExpressionsAssignment_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3669:1: rule__OrExp__ExpressionsAssignment_1_1 : ( ruleAndExp ) ;
    public final void rule__OrExp__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3673:1: ( ( ruleAndExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3674:1: ( ruleAndExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3674:1: ( ruleAndExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3675:1: ruleAndExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getExpressionsAndExpParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAndExp_in_rule__OrExp__ExpressionsAssignment_1_17738);
            ruleAndExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpAccess().getExpressionsAndExpParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__ExpressionsAssignment_1_1"


    // $ANTLR start "rule__AndExp__ExpressionsAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3684:1: rule__AndExp__ExpressionsAssignment_0 : ( ruleBooleanExp ) ;
    public final void rule__AndExp__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3688:1: ( ( ruleBooleanExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3689:1: ( ruleBooleanExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3689:1: ( ruleBooleanExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3690:1: ruleBooleanExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getExpressionsBooleanExpParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExp_in_rule__AndExp__ExpressionsAssignment_07769);
            ruleBooleanExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpAccess().getExpressionsBooleanExpParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__ExpressionsAssignment_0"


    // $ANTLR start "rule__AndExp__OperatorsAssignment_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3699:1: rule__AndExp__OperatorsAssignment_1_0 : ( ( 'AND' ) ) ;
    public final void rule__AndExp__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3703:1: ( ( ( 'AND' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3704:1: ( ( 'AND' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3704:1: ( ( 'AND' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3705:1: ( 'AND' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getOperatorsANDKeyword_1_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3706:1: ( 'AND' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3707:1: 'AND'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getOperatorsANDKeyword_1_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__AndExp__OperatorsAssignment_1_07805); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpAccess().getOperatorsANDKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpAccess().getOperatorsANDKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__OperatorsAssignment_1_0"


    // $ANTLR start "rule__AndExp__ExpressionsAssignment_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3722:1: rule__AndExp__ExpressionsAssignment_1_1 : ( ruleBooleanExp ) ;
    public final void rule__AndExp__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3726:1: ( ( ruleBooleanExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3727:1: ( ruleBooleanExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3727:1: ( ruleBooleanExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3728:1: ruleBooleanExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getExpressionsBooleanExpParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExp_in_rule__AndExp__ExpressionsAssignment_1_17844);
            ruleBooleanExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpAccess().getExpressionsBooleanExpParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__ExpressionsAssignment_1_1"


    // $ANTLR start "rule__BooleanExp__LeftAssignment_0_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3737:1: rule__BooleanExp__LeftAssignment_0_0 : ( ruleAttributeOrInt ) ;
    public final void rule__BooleanExp__LeftAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3741:1: ( ( ruleAttributeOrInt ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3742:1: ( ruleAttributeOrInt )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3742:1: ( ruleAttributeOrInt )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3743:1: ruleAttributeOrInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getLeftAttributeOrIntParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeOrInt_in_rule__BooleanExp__LeftAssignment_0_07875);
            ruleAttributeOrInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getLeftAttributeOrIntParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__LeftAssignment_0_0"


    // $ANTLR start "rule__BooleanExp__OperatorAssignment_0_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3752:1: rule__BooleanExp__OperatorAssignment_0_1 : ( ( rule__BooleanExp__OperatorAlternatives_0_1_0 ) ) ;
    public final void rule__BooleanExp__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3756:1: ( ( ( rule__BooleanExp__OperatorAlternatives_0_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3757:1: ( ( rule__BooleanExp__OperatorAlternatives_0_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3757:1: ( ( rule__BooleanExp__OperatorAlternatives_0_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3758:1: ( rule__BooleanExp__OperatorAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getOperatorAlternatives_0_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3759:1: ( rule__BooleanExp__OperatorAlternatives_0_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3759:2: rule__BooleanExp__OperatorAlternatives_0_1_0
            {
            pushFollow(FOLLOW_rule__BooleanExp__OperatorAlternatives_0_1_0_in_rule__BooleanExp__OperatorAssignment_0_17906);
            rule__BooleanExp__OperatorAlternatives_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getOperatorAlternatives_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__OperatorAssignment_0_1"


    // $ANTLR start "rule__BooleanExp__RightAssignment_0_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3768:1: rule__BooleanExp__RightAssignment_0_2 : ( ruleAttributeOrInt ) ;
    public final void rule__BooleanExp__RightAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3772:1: ( ( ruleAttributeOrInt ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3773:1: ( ruleAttributeOrInt )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3773:1: ( ruleAttributeOrInt )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3774:1: ruleAttributeOrInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getRightAttributeOrIntParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeOrInt_in_rule__BooleanExp__RightAssignment_0_27939);
            ruleAttributeOrInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getRightAttributeOrIntParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__RightAssignment_0_2"


    // $ANTLR start "rule__BooleanExp__NestedExpAssignment_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3783:1: rule__BooleanExp__NestedExpAssignment_1_1 : ( ruleOrExp ) ;
    public final void rule__BooleanExp__NestedExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3787:1: ( ( ruleOrExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3788:1: ( ruleOrExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3788:1: ( ruleOrExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3789:1: ruleOrExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getNestedExpOrExpParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOrExp_in_rule__BooleanExp__NestedExpAssignment_1_17970);
            ruleOrExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getNestedExpOrExpParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__NestedExpAssignment_1_1"


    // $ANTLR start "rule__AttributeName__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3798:1: rule__AttributeName__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AttributeName__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3802:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3803:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3803:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3804:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeNameAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeName__NameAssignment_08001); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeNameAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__NameAssignment_0"


    // $ANTLR start "rule__AttributeName__ParentAssignment_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3813:1: rule__AttributeName__ParentAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__AttributeName__ParentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3817:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3818:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3818:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3819:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeNameAccess().getParentIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeName__ParentAssignment_1_08032); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeNameAccess().getParentIDTerminalRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__ParentAssignment_1_0"


    // $ANTLR start "rule__AttributeName__ChildAssignment_1_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3828:1: rule__AttributeName__ChildAssignment_1_2 : ( ruleAttributeName ) ;
    public final void rule__AttributeName__ChildAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3832:1: ( ( ruleAttributeName ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3833:1: ( ruleAttributeName )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3833:1: ( ruleAttributeName )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3834:1: ruleAttributeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeNameAccess().getChildAttributeNameParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeName_in_rule__AttributeName__ChildAssignment_1_28063);
            ruleAttributeName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeNameAccess().getChildAttributeNameParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__ChildAssignment_1_2"


    // $ANTLR start "rule__AttributeOrInt__AttributeAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3843:1: rule__AttributeOrInt__AttributeAssignment_0 : ( ruleAttributeName ) ;
    public final void rule__AttributeOrInt__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3847:1: ( ( ruleAttributeName ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3848:1: ( ruleAttributeName )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3848:1: ( ruleAttributeName )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3849:1: ruleAttributeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeOrIntAccess().getAttributeAttributeNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeName_in_rule__AttributeOrInt__AttributeAssignment_08094);
            ruleAttributeName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeOrIntAccess().getAttributeAttributeNameParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOrInt__AttributeAssignment_0"


    // $ANTLR start "rule__AttributeOrInt__ValueAssignment_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3858:1: rule__AttributeOrInt__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__AttributeOrInt__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3862:1: ( ( RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3863:1: ( RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3863:1: ( RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3864:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeOrIntAccess().getValueINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AttributeOrInt__ValueAssignment_18125); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeOrIntAccess().getValueINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOrInt__ValueAssignment_1"


    // $ANTLR start "rule__AddtionExp__ExpressionsAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3873:1: rule__AddtionExp__ExpressionsAssignment_0 : ( ruleMultiplicationExp ) ;
    public final void rule__AddtionExp__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3877:1: ( ( ruleMultiplicationExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3878:1: ( ruleMultiplicationExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3878:1: ( ruleMultiplicationExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3879:1: ruleMultiplicationExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddtionExpAccess().getExpressionsMultiplicationExpParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExp_in_rule__AddtionExp__ExpressionsAssignment_08156);
            ruleMultiplicationExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddtionExpAccess().getExpressionsMultiplicationExpParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddtionExp__ExpressionsAssignment_0"


    // $ANTLR start "rule__AddtionExp__OperatorsAssignment_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3888:1: rule__AddtionExp__OperatorsAssignment_1_0 : ( ( '+' ) ) ;
    public final void rule__AddtionExp__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3892:1: ( ( ( '+' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3893:1: ( ( '+' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3893:1: ( ( '+' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3894:1: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddtionExpAccess().getOperatorsPlusSignKeyword_1_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3895:1: ( '+' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3896:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddtionExpAccess().getOperatorsPlusSignKeyword_1_0_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__AddtionExp__OperatorsAssignment_1_08192); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddtionExpAccess().getOperatorsPlusSignKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddtionExpAccess().getOperatorsPlusSignKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddtionExp__OperatorsAssignment_1_0"


    // $ANTLR start "rule__AddtionExp__ExpressionsAssignment_1_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3911:1: rule__AddtionExp__ExpressionsAssignment_1_1_1 : ( ruleMultiplicationExp ) ;
    public final void rule__AddtionExp__ExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3915:1: ( ( ruleMultiplicationExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3916:1: ( ruleMultiplicationExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3916:1: ( ruleMultiplicationExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3917:1: ruleMultiplicationExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddtionExpAccess().getExpressionsMultiplicationExpParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExp_in_rule__AddtionExp__ExpressionsAssignment_1_1_18231);
            ruleMultiplicationExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddtionExpAccess().getExpressionsMultiplicationExpParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddtionExp__ExpressionsAssignment_1_1_1"


    // $ANTLR start "rule__MultiplicationExp__ExpressionsAssignment_0_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3926:1: rule__MultiplicationExp__ExpressionsAssignment_0_0 : ( ruleAttributeOrInt ) ;
    public final void rule__MultiplicationExp__ExpressionsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3930:1: ( ( ruleAttributeOrInt ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3931:1: ( ruleAttributeOrInt )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3931:1: ( ruleAttributeOrInt )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3932:1: ruleAttributeOrInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getExpressionsAttributeOrIntParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeOrInt_in_rule__MultiplicationExp__ExpressionsAssignment_0_08262);
            ruleAttributeOrInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getExpressionsAttributeOrIntParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__ExpressionsAssignment_0_0"


    // $ANTLR start "rule__MultiplicationExp__OperatorsAssignment_0_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3941:1: rule__MultiplicationExp__OperatorsAssignment_0_1_0 : ( ( '*' ) ) ;
    public final void rule__MultiplicationExp__OperatorsAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3945:1: ( ( ( '*' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3946:1: ( ( '*' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3946:1: ( ( '*' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3947:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getOperatorsAsteriskKeyword_0_1_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3948:1: ( '*' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3949:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getOperatorsAsteriskKeyword_0_1_0_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__MultiplicationExp__OperatorsAssignment_0_1_08298); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getOperatorsAsteriskKeyword_0_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getOperatorsAsteriskKeyword_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__OperatorsAssignment_0_1_0"


    // $ANTLR start "rule__MultiplicationExp__ExpressionsAssignment_0_1_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3964:1: rule__MultiplicationExp__ExpressionsAssignment_0_1_1_1 : ( ruleAttributeOrInt ) ;
    public final void rule__MultiplicationExp__ExpressionsAssignment_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3968:1: ( ( ruleAttributeOrInt ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3969:1: ( ruleAttributeOrInt )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3969:1: ( ruleAttributeOrInt )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3970:1: ruleAttributeOrInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getExpressionsAttributeOrIntParserRuleCall_0_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeOrInt_in_rule__MultiplicationExp__ExpressionsAssignment_0_1_1_18337);
            ruleAttributeOrInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getExpressionsAttributeOrIntParserRuleCall_0_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExp__ExpressionsAssignment_0_1_1_1"


    // $ANTLR start "rule__ValueAssignment__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3979:1: rule__ValueAssignment__NameAssignment_0 : ( ruleAttributeName ) ;
    public final void rule__ValueAssignment__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3983:1: ( ( ruleAttributeName ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3984:1: ( ruleAttributeName )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3984:1: ( ruleAttributeName )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3985:1: ruleAttributeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAssignmentAccess().getNameAttributeNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeName_in_rule__ValueAssignment__NameAssignment_08368);
            ruleAttributeName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAssignmentAccess().getNameAttributeNameParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueAssignment__NameAssignment_0"


    // $ANTLR start "rule__ValueAssignment__AdditionAssignment_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3994:1: rule__ValueAssignment__AdditionAssignment_2 : ( ruleAddtionExp ) ;
    public final void rule__ValueAssignment__AdditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3998:1: ( ( ruleAddtionExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3999:1: ( ruleAddtionExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3999:1: ( ruleAddtionExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4000:1: ruleAddtionExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAssignmentAccess().getAdditionAddtionExpParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAddtionExp_in_rule__ValueAssignment__AdditionAssignment_28399);
            ruleAddtionExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAssignmentAccess().getAdditionAddtionExpParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueAssignment__AdditionAssignment_2"

    // $ANTLR start synpred1_InternalBGL
    public final void synpred1_InternalBGL_fragment() throws RecognitionException {   
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2986:8: ( rule__Model__TokensAssignment_2 )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2986:9: rule__Model__TokensAssignment_2
        {
        pushFollow(FOLLOW_rule__Model__TokensAssignment_2_in_synpred1_InternalBGL6169);
        rule__Model__TokensAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalBGL

    // Delegated rules

    public final boolean synpred1_InternalBGL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalBGL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlayer_in_entryRulePlayer121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlayer128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__Group__0_in_rulePlayer154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoard_in_entryRuleBoard181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoard188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__UnorderedGroup_in_ruleBoard214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRules_in_entryRuleRules241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRules248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__0_in_ruleRules274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnRules_in_entryRuleTurnRules301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnRules308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnRules__Group__0_in_ruleTurnRules334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_entryRuleToken361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToken368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group__0_in_ruleToken394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Alternatives_in_ruleAction514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_entryRuleOrExp541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExp548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__0_in_ruleOrExp574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_entryRuleAndExp601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExp608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__0_in_ruleAndExp634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_entryRuleBooleanExp661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExp668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Alternatives_in_ruleBooleanExp694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_entryRuleAttributeName721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeName728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Alternatives_in_ruleAttributeName754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_entryRuleAttributeOrInt781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeOrInt788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeOrInt__Alternatives_in_ruleAttributeOrInt814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddtionExp_in_entryRuleAddtionExp841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddtionExp848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddtionExp__Group__0_in_ruleAddtionExp874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExp_in_entryRuleMultiplicationExp901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExp908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Alternatives_in_ruleMultiplicationExp934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueAssignment968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__0_in_ruleValueAssignment994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_0__0_in_rule__Action__Alternatives1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Alternatives1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_2__0_in_rule__Action__Alternatives1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__AssignmentAssignment_3_in_rule__Action__Alternatives1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Action__ObjectOfSelectAlternatives_2_1_01118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Action__ObjectOfSelectAlternatives_2_1_01138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0__0_in_rule__BooleanExp__Alternatives1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_1__0_in_rule__BooleanExp__Alternatives1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BooleanExp__OperatorAlternatives_0_1_01224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BooleanExp__OperatorAlternatives_0_1_01244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BooleanExp__OperatorAlternatives_0_1_01264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BooleanExp__OperatorAlternatives_0_1_01284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BooleanExp__OperatorAlternatives_0_1_01304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BooleanExp__OperatorAlternatives_0_1_01324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BooleanExp__OperatorAlternatives_0_1_01344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BooleanExp__OperatorAlternatives_0_1_01364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__NameAssignment_0_in_rule__AttributeName__Alternatives1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__0_in_rule__AttributeName__Alternatives1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeOrInt__AttributeAssignment_0_in_rule__AttributeOrInt__Alternatives1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeOrInt__ValueAssignment_1_in_rule__AttributeOrInt__Alternatives1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddtionExp__OperatorsAssignment_1_0_in_rule__AddtionExp__Alternatives_11500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddtionExp__Group_1_1__0_in_rule__AddtionExp__Alternatives_11518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0__0_in_rule__MultiplicationExp__Alternatives1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_1__0_in_rule__MultiplicationExp__Alternatives1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__OperatorsAssignment_0_1_0_in_rule__MultiplicationExp__Alternatives_0_11602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0_1_1__0_in_rule__MultiplicationExp__Alternatives_0_11620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__01651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__01654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group_0__0__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__11713 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Model__Group_0__2_in_rule__Model__Group_0__11716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__2__Impl_in_rule__Model__Group_0__21773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PlayerAssignment_0_2_in_rule__Model__Group_0__2__Impl1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__Group__0__Impl_in_rule__Player__Group__01836 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Player__Group__1_in_rule__Player__Group__01839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__NameAssignment_0_in_rule__Player__Group__0__Impl1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__Group__1__Impl_in_rule__Player__Group__11896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__PlayercountAssignment_1_in_rule__Player__Group__1__Impl1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__Group_0__0__Impl_in_rule__Board__Group_0__01957 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Board__Group_0__1_in_rule__Board__Group_0__01960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__NameAssignment_0_0_in_rule__Board__Group_0__0__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__Group_0__1__Impl_in_rule__Board__Group_0__12017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Board__Group_0__2_in_rule__Board__Group_0__12020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Board__Group_0__1__Impl2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__Group_0__2__Impl_in_rule__Board__Group_0__22079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__FieldsAssignment_0_2_in_rule__Board__Group_0__2__Impl2106 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Rules__Group__0__Impl_in_rule__Rules__Group__02143 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Rules__Group__1_in_rule__Rules__Group__02146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__NameAssignment_0_in_rule__Rules__Group__0__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__1__Impl_in_rule__Rules__Group__12203 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Rules__Group__2_in_rule__Rules__Group__12206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Rules__Group__1__Impl2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__2__Impl_in_rule__Rules__Group__22265 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Rules__Group__3_in_rule__Rules__Group__22268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__TurnrulesAssignment_2_in_rule__Rules__Group__2__Impl2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__3__Impl_in_rule__Rules__Group__32325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Rules__Group__3__Impl2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnRules__Group__0__Impl_in_rule__TurnRules__Group__02392 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TurnRules__Group__1_in_rule__TurnRules__Group__02395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnRules__NameAssignment_0_in_rule__TurnRules__Group__0__Impl2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnRules__Group__1__Impl_in_rule__TurnRules__Group__12452 = new BitSet(new long[]{0x000001C000800010L});
    public static final BitSet FOLLOW_rule__TurnRules__Group__2_in_rule__TurnRules__Group__12455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TurnRules__Group__1__Impl2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnRules__Group__2__Impl_in_rule__TurnRules__Group__22514 = new BitSet(new long[]{0x000001C000800010L});
    public static final BitSet FOLLOW_rule__TurnRules__Group__3_in_rule__TurnRules__Group__22517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnRules__ActionsAssignment_2_in_rule__TurnRules__Group__2__Impl2544 = new BitSet(new long[]{0x000001C000000012L});
    public static final BitSet FOLLOW_rule__TurnRules__Group__3__Impl_in_rule__TurnRules__Group__32575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TurnRules__Group__3__Impl2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group__0__Impl_in_rule__Token__Group__02642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Token__Group__1_in_rule__Token__Group__02645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Token__Group__0__Impl2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group__1__Impl_in_rule__Token__Group__12704 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Token__Group__2_in_rule__Token__Group__12707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__NameAssignment_1_in_rule__Token__Group__1__Impl2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group__2__Impl_in_rule__Token__Group__22764 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Token__Group__3_in_rule__Token__Group__22767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Token__Group__2__Impl2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group__3__Impl_in_rule__Token__Group__32826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Token__Group__3__Impl2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02893 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12953 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Field__Group__1__Impl2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23015 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__XAssignment_2_in_rule__Field__Group__2__Impl3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33075 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Field__Group__3__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43137 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__43140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__YAssignment_4_in_rule__Field__Group__4__Impl3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__53197 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__6_in_rule__Field__Group__53200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Field__Group__5__Impl3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__63259 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Field__Group__7_in_rule__Field__Group__63262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ZAssignment_6_in_rule__Field__Group__6__Impl3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__73319 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Field__Group__8_in_rule__Field__Group__73322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Field__Group__7__Impl3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__8__Impl_in_rule__Field__Group__83381 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Field__Group__9_in_rule__Field__Group__83384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Field__Group__8__Impl3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__9__Impl_in_rule__Field__Group__93443 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Field__Group__10_in_rule__Field__Group__93446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NeighboursAssignment_9_in_rule__Field__Group__9__Impl3473 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Field__Group__10__Impl_in_rule__Field__Group__103504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Field__Group__10__Impl3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_0__0__Impl_in_rule__Action__Group_0__03585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group_0__1_in_rule__Action__Group_0__03588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_0_0_in_rule__Action__Group_0__0__Impl3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_0__1__Impl_in_rule__Action__Group_0__13645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TokenAssignment_0_1_in_rule__Action__Group_0__1__Impl3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_2__0__Impl_in_rule__Action__Group_2__03706 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Action__Group_2__1_in_rule__Action__Group_2__03709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_2_0_in_rule__Action__Group_2__0__Impl3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_2__1__Impl_in_rule__Action__Group_2__13766 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Action__Group_2__2_in_rule__Action__Group_2__13769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__ObjectOfSelectAssignment_2_1_in_rule__Action__Group_2__1__Impl3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_2__2__Impl_in_rule__Action__Group_2__23826 = new BitSet(new long[]{0x000001C001000030L});
    public static final BitSet FOLLOW_rule__Action__Group_2__3_in_rule__Action__Group_2__23829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Action__Group_2__2__Impl3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_2__3__Impl_in_rule__Action__Group_2__33888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__FilterAssignment_2_3_in_rule__Action__Group_2__3__Impl3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__0__Impl_in_rule__OrExp__Group__03953 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__OrExp__Group__1_in_rule__OrExp__Group__03956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__ExpressionsAssignment_0_in_rule__OrExp__Group__0__Impl3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__1__Impl_in_rule__OrExp__Group__14013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__0_in_rule__OrExp__Group__1__Impl4040 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__0__Impl_in_rule__OrExp__Group_1__04075 = new BitSet(new long[]{0x000001C001000030L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__1_in_rule__OrExp__Group_1__04078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__OperatorsAssignment_1_0_in_rule__OrExp__Group_1__0__Impl4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__1__Impl_in_rule__OrExp__Group_1__14135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__ExpressionsAssignment_1_1_in_rule__OrExp__Group_1__1__Impl4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__04196 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__04199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__ExpressionsAssignment_0_in_rule__AndExp__Group__0__Impl4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__14256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__0_in_rule__AndExp__Group__1__Impl4283 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__0__Impl_in_rule__AndExp__Group_1__04318 = new BitSet(new long[]{0x000001C001000030L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__1_in_rule__AndExp__Group_1__04321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__OperatorsAssignment_1_0_in_rule__AndExp__Group_1__0__Impl4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__1__Impl_in_rule__AndExp__Group_1__14378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__ExpressionsAssignment_1_1_in_rule__AndExp__Group_1__1__Impl4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0__0__Impl_in_rule__BooleanExp__Group_0__04439 = new BitSet(new long[]{0x00000000001FE000L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0__1_in_rule__BooleanExp__Group_0__04442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__LeftAssignment_0_0_in_rule__BooleanExp__Group_0__0__Impl4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0__1__Impl_in_rule__BooleanExp__Group_0__14499 = new BitSet(new long[]{0x000001C000000030L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0__2_in_rule__BooleanExp__Group_0__14502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__OperatorAssignment_0_1_in_rule__BooleanExp__Group_0__1__Impl4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0__2__Impl_in_rule__BooleanExp__Group_0__24559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__RightAssignment_0_2_in_rule__BooleanExp__Group_0__2__Impl4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_1__0__Impl_in_rule__BooleanExp__Group_1__04622 = new BitSet(new long[]{0x000001C001000030L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_1__1_in_rule__BooleanExp__Group_1__04625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BooleanExp__Group_1__0__Impl4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_1__1__Impl_in_rule__BooleanExp__Group_1__14684 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_1__2_in_rule__BooleanExp__Group_1__14687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__NestedExpAssignment_1_1_in_rule__BooleanExp__Group_1__1__Impl4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_1__2__Impl_in_rule__BooleanExp__Group_1__24744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BooleanExp__Group_1__2__Impl4772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__0__Impl_in_rule__AttributeName__Group_1__04809 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__1_in_rule__AttributeName__Group_1__04812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__ParentAssignment_1_0_in_rule__AttributeName__Group_1__0__Impl4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__1__Impl_in_rule__AttributeName__Group_1__14869 = new BitSet(new long[]{0x000001C000000010L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__2_in_rule__AttributeName__Group_1__14872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AttributeName__Group_1__1__Impl4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__2__Impl_in_rule__AttributeName__Group_1__24931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__ChildAssignment_1_2_in_rule__AttributeName__Group_1__2__Impl4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddtionExp__Group__0__Impl_in_rule__AddtionExp__Group__04994 = new BitSet(new long[]{0x0000080080000000L});
    public static final BitSet FOLLOW_rule__AddtionExp__Group__1_in_rule__AddtionExp__Group__04997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddtionExp__ExpressionsAssignment_0_in_rule__AddtionExp__Group__0__Impl5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddtionExp__Group__1__Impl_in_rule__AddtionExp__Group__15054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddtionExp__Alternatives_1_in_rule__AddtionExp__Group__1__Impl5081 = new BitSet(new long[]{0x0000080080000002L});
    public static final BitSet FOLLOW_rule__AddtionExp__Group_1_1__0__Impl_in_rule__AddtionExp__Group_1_1__05116 = new BitSet(new long[]{0x000001C001000030L});
    public static final BitSet FOLLOW_rule__AddtionExp__Group_1_1__1_in_rule__AddtionExp__Group_1_1__05119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AddtionExp__Group_1_1__0__Impl5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddtionExp__Group_1_1__1__Impl_in_rule__AddtionExp__Group_1_1__15178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddtionExp__ExpressionsAssignment_1_1_1_in_rule__AddtionExp__Group_1_1__1__Impl5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0__0__Impl_in_rule__MultiplicationExp__Group_0__05239 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0__1_in_rule__MultiplicationExp__Group_0__05242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__ExpressionsAssignment_0_0_in_rule__MultiplicationExp__Group_0__0__Impl5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0__1__Impl_in_rule__MultiplicationExp__Group_0__15299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Alternatives_0_1_in_rule__MultiplicationExp__Group_0__1__Impl5326 = new BitSet(new long[]{0x0000100100000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0_1_1__0__Impl_in_rule__MultiplicationExp__Group_0_1_1__05361 = new BitSet(new long[]{0x000001C000000030L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0_1_1__1_in_rule__MultiplicationExp__Group_0_1_1__05364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MultiplicationExp__Group_0_1_1__0__Impl5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0_1_1__1__Impl_in_rule__MultiplicationExp__Group_0_1_1__15423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__ExpressionsAssignment_0_1_1_1_in_rule__MultiplicationExp__Group_0_1_1__1__Impl5450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_1__0__Impl_in_rule__MultiplicationExp__Group_1__05484 = new BitSet(new long[]{0x000001C001000030L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_1__1_in_rule__MultiplicationExp__Group_1__05487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MultiplicationExp__Group_1__0__Impl5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_1__1__Impl_in_rule__MultiplicationExp__Group_1__15546 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_1__2_in_rule__MultiplicationExp__Group_1__15549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddtionExp_in_rule__MultiplicationExp__Group_1__1__Impl5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_1__2__Impl_in_rule__MultiplicationExp__Group_1__25605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MultiplicationExp__Group_1__2__Impl5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__0__Impl_in_rule__ValueAssignment__Group__05670 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__1_in_rule__ValueAssignment__Group__05673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__NameAssignment_0_in_rule__ValueAssignment__Group__0__Impl5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__1__Impl_in_rule__ValueAssignment__Group__15730 = new BitSet(new long[]{0x000001C001000030L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__2_in_rule__ValueAssignment__Group__15733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ValueAssignment__Group__1__Impl5761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__2__Impl_in_rule__ValueAssignment__Group__25792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__AdditionAssignment_2_in_rule__ValueAssignment__Group__2__Impl5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__0_in_rule__Model__UnorderedGroup5856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0_in_rule__Model__UnorderedGroup__Impl5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__BoardAssignment_1_in_rule__Model__UnorderedGroup__Impl6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TokensAssignment_2_in_rule__Model__UnorderedGroup__Impl6128 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Model__TokensAssignment_2_in_rule__Model__UnorderedGroup__Impl6172 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Model__RulesAssignment_3_in_rule__Model__UnorderedGroup__Impl6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__06329 = new BitSet(new long[]{0x0000001800A00802L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__1_in_rule__Model__UnorderedGroup__06332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__16357 = new BitSet(new long[]{0x0000001800A00802L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__2_in_rule__Model__UnorderedGroup__16360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__26385 = new BitSet(new long[]{0x0000001800A00802L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__3_in_rule__Model__UnorderedGroup__26388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__36413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__UnorderedGroup__0_in_rule__Board__UnorderedGroup6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__Group_0__0_in_rule__Board__UnorderedGroup__Impl6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Board__UnorderedGroup__Impl6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__UnorderedGroup__Impl_in_rule__Board__UnorderedGroup__06688 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_rule__Board__UnorderedGroup__1_in_rule__Board__UnorderedGroup__06691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__UnorderedGroup__Impl_in_rule__Board__UnorderedGroup__16716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_0_16748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlayer_in_rule__Model__PlayerAssignment_0_26779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoard_in_rule__Model__BoardAssignment_16810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_rule__Model__TokensAssignment_26841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRules_in_rule__Model__RulesAssignment_36872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Player__NameAssignment_06908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Player__PlayercountAssignment_16947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Board__NameAssignment_0_06983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Board__FieldsAssignment_0_27022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Rules__NameAssignment_07058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnRules_in_rule__Rules__TurnrulesAssignment_27097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TurnRules__NameAssignment_07133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__TurnRules__ActionsAssignment_27172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Token__NameAssignment_17203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_07234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__XAssignment_27265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__YAssignment_47296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__ZAssignment_67327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NeighboursAssignment_97362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Action__NameAssignment_0_07402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__TokenAssignment_0_17445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Action__NameAssignment_17485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Action__NameAssignment_2_07529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__ObjectOfSelectAlternatives_2_1_0_in_rule__Action__ObjectOfSelectAssignment_2_17568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_rule__Action__FilterAssignment_2_37601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_rule__Action__AssignmentAssignment_37632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_rule__OrExp__ExpressionsAssignment_07663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__OrExp__OperatorsAssignment_1_07699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_rule__OrExp__ExpressionsAssignment_1_17738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_rule__AndExp__ExpressionsAssignment_07769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__AndExp__OperatorsAssignment_1_07805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_rule__AndExp__ExpressionsAssignment_1_17844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_rule__BooleanExp__LeftAssignment_0_07875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__OperatorAlternatives_0_1_0_in_rule__BooleanExp__OperatorAssignment_0_17906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_rule__BooleanExp__RightAssignment_0_27939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_rule__BooleanExp__NestedExpAssignment_1_17970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeName__NameAssignment_08001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeName__ParentAssignment_1_08032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_rule__AttributeName__ChildAssignment_1_28063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_rule__AttributeOrInt__AttributeAssignment_08094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AttributeOrInt__ValueAssignment_18125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExp_in_rule__AddtionExp__ExpressionsAssignment_08156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__AddtionExp__OperatorsAssignment_1_08192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExp_in_rule__AddtionExp__ExpressionsAssignment_1_1_18231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_rule__MultiplicationExp__ExpressionsAssignment_0_08262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MultiplicationExp__OperatorsAssignment_0_1_08298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_rule__MultiplicationExp__ExpressionsAssignment_0_1_1_18337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_rule__ValueAssignment__NameAssignment_08368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddtionExp_in_rule__ValueAssignment__AdditionAssignment_28399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TokensAssignment_2_in_synpred1_InternalBGL6169 = new BitSet(new long[]{0x0000000000000002L});

}
