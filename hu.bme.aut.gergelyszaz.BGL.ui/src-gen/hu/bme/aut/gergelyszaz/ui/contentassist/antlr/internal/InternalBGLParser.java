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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TOKEN'", "'FIELD'", "'!=='", "'==='", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'GAME'", "'{'", "'}'", "'('", "','", "')'", "'WHERE'", "'.'", "'IF'", "'LABEL'", "'='", "'PLAYERS'", "'BOARD'", "'RULES'", "'TURN'", "'SPAWN'", "'MOVE'", "'DESTROY'", "'SELECT'", "'OR'", "'AND'", "'NOT'", "'GOTO'"
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:125:1: ruleBoard : ( ( rule__Board__Group__0 ) ) ;
    public final void ruleBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:129:2: ( ( ( rule__Board__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:130:1: ( ( rule__Board__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:130:1: ( ( rule__Board__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:131:1: ( rule__Board__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:132:1: ( rule__Board__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:132:2: rule__Board__Group__0
            {
            pushFollow(FOLLOW_rule__Board__Group__0_in_ruleBoard214);
            rule__Board__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getGroup()); 
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


    // $ANTLR start "entryRuleGotoCondition"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:424:1: entryRuleGotoCondition : ruleGotoCondition EOF ;
    public final void entryRuleGotoCondition() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:425:1: ( ruleGotoCondition EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:426:1: ruleGotoCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGotoConditionRule()); 
            }
            pushFollow(FOLLOW_ruleGotoCondition_in_entryRuleGotoCondition841);
            ruleGotoCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGotoConditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGotoCondition848); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGotoCondition"


    // $ANTLR start "ruleGotoCondition"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:433:1: ruleGotoCondition : ( ( rule__GotoCondition__Group__0 ) ) ;
    public final void ruleGotoCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:437:2: ( ( ( rule__GotoCondition__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:438:1: ( ( rule__GotoCondition__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:438:1: ( ( rule__GotoCondition__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:439:1: ( rule__GotoCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGotoConditionAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:440:1: ( rule__GotoCondition__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:440:2: rule__GotoCondition__Group__0
            {
            pushFollow(FOLLOW_rule__GotoCondition__Group__0_in_ruleGotoCondition874);
            rule__GotoCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGotoConditionAccess().getGroup()); 
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
    // $ANTLR end "ruleGotoCondition"


    // $ANTLR start "entryRuleLabel"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:452:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:453:1: ( ruleLabel EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:454:1: ruleLabel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel901);
            ruleLabel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel908); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:461:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:465:2: ( ( ( rule__Label__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:466:1: ( ( rule__Label__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:466:1: ( ( rule__Label__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:467:1: ( rule__Label__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:468:1: ( rule__Label__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:468:2: rule__Label__Group__0
            {
            pushFollow(FOLLOW_rule__Label__Group__0_in_ruleLabel934);
            rule__Label__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelAccess().getGroup()); 
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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleAdditionExp"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:480:1: entryRuleAdditionExp : ruleAdditionExp EOF ;
    public final void entryRuleAdditionExp() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:481:1: ( ruleAdditionExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:482:1: ruleAdditionExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionExp_in_entryRuleAdditionExp961);
            ruleAdditionExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionExp968); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAdditionExp"


    // $ANTLR start "ruleAdditionExp"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:489:1: ruleAdditionExp : ( ( rule__AdditionExp__Group__0 ) ) ;
    public final void ruleAdditionExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:493:2: ( ( ( rule__AdditionExp__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:494:1: ( ( rule__AdditionExp__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:494:1: ( ( rule__AdditionExp__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:495:1: ( rule__AdditionExp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:496:1: ( rule__AdditionExp__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:496:2: rule__AdditionExp__Group__0
            {
            pushFollow(FOLLOW_rule__AdditionExp__Group__0_in_ruleAdditionExp994);
            rule__AdditionExp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpAccess().getGroup()); 
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
    // $ANTLR end "ruleAdditionExp"


    // $ANTLR start "entryRuleMultiplicationExp"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:508:1: entryRuleMultiplicationExp : ruleMultiplicationExp EOF ;
    public final void entryRuleMultiplicationExp() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:509:1: ( ruleMultiplicationExp EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:510:1: ruleMultiplicationExp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExp_in_entryRuleMultiplicationExp1021);
            ruleMultiplicationExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationExp1028); if (state.failed) return ;

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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:517:1: ruleMultiplicationExp : ( ( rule__MultiplicationExp__Alternatives ) ) ;
    public final void ruleMultiplicationExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:521:2: ( ( ( rule__MultiplicationExp__Alternatives ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:522:1: ( ( rule__MultiplicationExp__Alternatives ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:522:1: ( ( rule__MultiplicationExp__Alternatives ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:523:1: ( rule__MultiplicationExp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getAlternatives()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:524:1: ( rule__MultiplicationExp__Alternatives )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:524:2: rule__MultiplicationExp__Alternatives
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Alternatives_in_ruleMultiplicationExp1054);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:536:1: entryRuleValueAssignment : ruleValueAssignment EOF ;
    public final void entryRuleValueAssignment() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:537:1: ( ruleValueAssignment EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:538:1: ruleValueAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment1081);
            ruleValueAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueAssignment1088); if (state.failed) return ;

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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:545:1: ruleValueAssignment : ( ( rule__ValueAssignment__Group__0 ) ) ;
    public final void ruleValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:549:2: ( ( ( rule__ValueAssignment__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:550:1: ( ( rule__ValueAssignment__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:550:1: ( ( rule__ValueAssignment__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:551:1: ( rule__ValueAssignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAssignmentAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:552:1: ( rule__ValueAssignment__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:552:2: rule__ValueAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__0_in_ruleValueAssignment1114);
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


    // $ANTLR start "entryRuleSimpleAssignment"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:564:1: entryRuleSimpleAssignment : ruleSimpleAssignment EOF ;
    public final void entryRuleSimpleAssignment() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:565:1: ( ruleSimpleAssignment EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:566:1: ruleSimpleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleAssignment_in_entryRuleSimpleAssignment1141);
            ruleSimpleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAssignment1148); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSimpleAssignment"


    // $ANTLR start "ruleSimpleAssignment"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:573:1: ruleSimpleAssignment : ( ( rule__SimpleAssignment__Group__0 ) ) ;
    public final void ruleSimpleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:577:2: ( ( ( rule__SimpleAssignment__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:578:1: ( ( rule__SimpleAssignment__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:578:1: ( ( rule__SimpleAssignment__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:579:1: ( rule__SimpleAssignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAssignmentAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:580:1: ( rule__SimpleAssignment__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:580:2: rule__SimpleAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleAssignment__Group__0_in_ruleSimpleAssignment1174);
            rule__SimpleAssignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAssignmentAccess().getGroup()); 
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
    // $ANTLR end "ruleSimpleAssignment"


    // $ANTLR start "rule__Action__Alternatives"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:592:1: rule__Action__Alternatives : ( ( ( rule__Action__Group_0__0 ) ) | ( ( rule__Action__NameAssignment_1 ) ) | ( ( rule__Action__NameAssignment_2 ) ) | ( ( rule__Action__Group_3__0 ) ) | ( ( rule__Action__AssignmentAssignment_4 ) ) | ( ( rule__Action__GotoConditionAssignment_5 ) ) | ( ( rule__Action__LabelAssignment_6 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:596:1: ( ( ( rule__Action__Group_0__0 ) ) | ( ( rule__Action__NameAssignment_1 ) ) | ( ( rule__Action__NameAssignment_2 ) ) | ( ( rule__Action__Group_3__0 ) ) | ( ( rule__Action__AssignmentAssignment_4 ) ) | ( ( rule__Action__GotoConditionAssignment_5 ) ) | ( ( rule__Action__LabelAssignment_6 ) ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt1=1;
                }
                break;
            case 41:
                {
                alt1=2;
                }
                break;
            case 42:
                {
                alt1=3;
                }
                break;
            case 43:
                {
                alt1=4;
                }
                break;
            case RULE_ID:
                {
                alt1=5;
                }
                break;
            case 33:
                {
                alt1=6;
                }
                break;
            case 34:
                {
                alt1=7;
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:597:1: ( ( rule__Action__Group_0__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:597:1: ( ( rule__Action__Group_0__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:598:1: ( rule__Action__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getGroup_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:599:1: ( rule__Action__Group_0__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:599:2: rule__Action__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_0__0_in_rule__Action__Alternatives1210);
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:603:6: ( ( rule__Action__NameAssignment_1 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:603:6: ( ( rule__Action__NameAssignment_1 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:604:1: ( rule__Action__NameAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getNameAssignment_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:605:1: ( rule__Action__NameAssignment_1 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:605:2: rule__Action__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Alternatives1228);
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:609:6: ( ( rule__Action__NameAssignment_2 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:609:6: ( ( rule__Action__NameAssignment_2 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:610:1: ( rule__Action__NameAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getNameAssignment_2()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:611:1: ( rule__Action__NameAssignment_2 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:611:2: rule__Action__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Alternatives1246);
                    rule__Action__NameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getNameAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:615:6: ( ( rule__Action__Group_3__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:615:6: ( ( rule__Action__Group_3__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:616:1: ( rule__Action__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getGroup_3()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:617:1: ( rule__Action__Group_3__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:617:2: rule__Action__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_3__0_in_rule__Action__Alternatives1264);
                    rule__Action__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:621:6: ( ( rule__Action__AssignmentAssignment_4 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:621:6: ( ( rule__Action__AssignmentAssignment_4 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:622:1: ( rule__Action__AssignmentAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getAssignmentAssignment_4()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:623:1: ( rule__Action__AssignmentAssignment_4 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:623:2: rule__Action__AssignmentAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Action__AssignmentAssignment_4_in_rule__Action__Alternatives1282);
                    rule__Action__AssignmentAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getAssignmentAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:627:6: ( ( rule__Action__GotoConditionAssignment_5 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:627:6: ( ( rule__Action__GotoConditionAssignment_5 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:628:1: ( rule__Action__GotoConditionAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getGotoConditionAssignment_5()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:629:1: ( rule__Action__GotoConditionAssignment_5 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:629:2: rule__Action__GotoConditionAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Action__GotoConditionAssignment_5_in_rule__Action__Alternatives1300);
                    rule__Action__GotoConditionAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getGotoConditionAssignment_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:633:6: ( ( rule__Action__LabelAssignment_6 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:633:6: ( ( rule__Action__LabelAssignment_6 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:634:1: ( rule__Action__LabelAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getLabelAssignment_6()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:635:1: ( rule__Action__LabelAssignment_6 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:635:2: rule__Action__LabelAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Action__LabelAssignment_6_in_rule__Action__Alternatives1318);
                    rule__Action__LabelAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getLabelAssignment_6()); 
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


    // $ANTLR start "rule__Action__ObjectOfSelectAlternatives_3_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:644:1: rule__Action__ObjectOfSelectAlternatives_3_1_0 : ( ( 'TOKEN' ) | ( 'FIELD' ) );
    public final void rule__Action__ObjectOfSelectAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:648:1: ( ( 'TOKEN' ) | ( 'FIELD' ) )
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:649:1: ( 'TOKEN' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:649:1: ( 'TOKEN' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:650:1: 'TOKEN'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getObjectOfSelectTOKENKeyword_3_1_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Action__ObjectOfSelectAlternatives_3_1_01352); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getObjectOfSelectTOKENKeyword_3_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:657:6: ( 'FIELD' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:657:6: ( 'FIELD' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:658:1: 'FIELD'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getObjectOfSelectFIELDKeyword_3_1_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Action__ObjectOfSelectAlternatives_3_1_01372); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getObjectOfSelectFIELDKeyword_3_1_0_1()); 
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
    // $ANTLR end "rule__Action__ObjectOfSelectAlternatives_3_1_0"


    // $ANTLR start "rule__BooleanExp__Alternatives"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:670:1: rule__BooleanExp__Alternatives : ( ( ( rule__BooleanExp__Group_0__0 ) ) | ( ( rule__BooleanExp__Group_1__0 ) ) );
    public final void rule__BooleanExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:674:1: ( ( ( rule__BooleanExp__Group_0__0 ) ) | ( ( rule__BooleanExp__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||LA3_0==46) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:675:1: ( ( rule__BooleanExp__Group_0__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:675:1: ( ( rule__BooleanExp__Group_0__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:676:1: ( rule__BooleanExp__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getGroup_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:677:1: ( rule__BooleanExp__Group_0__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:677:2: rule__BooleanExp__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__BooleanExp__Group_0__0_in_rule__BooleanExp__Alternatives1406);
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:681:6: ( ( rule__BooleanExp__Group_1__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:681:6: ( ( rule__BooleanExp__Group_1__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:682:1: ( rule__BooleanExp__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getGroup_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:683:1: ( rule__BooleanExp__Group_1__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:683:2: rule__BooleanExp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BooleanExp__Group_1__0_in_rule__BooleanExp__Alternatives1424);
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


    // $ANTLR start "rule__BooleanExp__NameAlternatives_0_1_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:692:1: rule__BooleanExp__NameAlternatives_0_1_1_0 : ( ( '!==' ) | ( '===' ) | ( '==' ) | ( '!=' ) | ( '>' ) | ( '>=' ) | ( '<' ) | ( '<=' ) );
    public final void rule__BooleanExp__NameAlternatives_0_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:696:1: ( ( '!==' ) | ( '===' ) | ( '==' ) | ( '!=' ) | ( '>' ) | ( '>=' ) | ( '<' ) | ( '<=' ) )
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:697:1: ( '!==' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:697:1: ( '!==' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:698:1: '!=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getNameExclamationMarkEqualsSignEqualsSignKeyword_0_1_1_0_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__BooleanExp__NameAlternatives_0_1_1_01458); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getNameExclamationMarkEqualsSignEqualsSignKeyword_0_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:705:6: ( '===' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:705:6: ( '===' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:706:1: '==='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getNameEqualsSignEqualsSignEqualsSignKeyword_0_1_1_0_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__BooleanExp__NameAlternatives_0_1_1_01478); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getNameEqualsSignEqualsSignEqualsSignKeyword_0_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:713:6: ( '==' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:713:6: ( '==' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:714:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getNameEqualsSignEqualsSignKeyword_0_1_1_0_2()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__BooleanExp__NameAlternatives_0_1_1_01498); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getNameEqualsSignEqualsSignKeyword_0_1_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:721:6: ( '!=' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:721:6: ( '!=' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:722:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getNameExclamationMarkEqualsSignKeyword_0_1_1_0_3()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__BooleanExp__NameAlternatives_0_1_1_01518); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getNameExclamationMarkEqualsSignKeyword_0_1_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:729:6: ( '>' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:729:6: ( '>' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:730:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getNameGreaterThanSignKeyword_0_1_1_0_4()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__BooleanExp__NameAlternatives_0_1_1_01538); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getNameGreaterThanSignKeyword_0_1_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:737:6: ( '>=' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:737:6: ( '>=' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:738:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getNameGreaterThanSignEqualsSignKeyword_0_1_1_0_5()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__BooleanExp__NameAlternatives_0_1_1_01558); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getNameGreaterThanSignEqualsSignKeyword_0_1_1_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:745:6: ( '<' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:745:6: ( '<' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:746:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getNameLessThanSignKeyword_0_1_1_0_6()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__BooleanExp__NameAlternatives_0_1_1_01578); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getNameLessThanSignKeyword_0_1_1_0_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:753:6: ( '<=' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:753:6: ( '<=' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:754:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpAccess().getNameLessThanSignEqualsSignKeyword_0_1_1_0_7()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__BooleanExp__NameAlternatives_0_1_1_01598); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpAccess().getNameLessThanSignEqualsSignKeyword_0_1_1_0_7()); 
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
    // $ANTLR end "rule__BooleanExp__NameAlternatives_0_1_1_0"


    // $ANTLR start "rule__AttributeName__Alternatives"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:766:1: rule__AttributeName__Alternatives : ( ( ( rule__AttributeName__NameAssignment_0 ) ) | ( ( rule__AttributeName__Group_1__0 ) ) );
    public final void rule__AttributeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:770:1: ( ( ( rule__AttributeName__NameAssignment_0 ) ) | ( ( rule__AttributeName__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==32) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==RULE_ID||(LA5_1>=13 && LA5_1<=24)||LA5_1==27||LA5_1==30||(LA5_1>=33 && LA5_1<=35)||(LA5_1>=40 && LA5_1<=45)||LA5_1==47) ) {
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:771:1: ( ( rule__AttributeName__NameAssignment_0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:771:1: ( ( rule__AttributeName__NameAssignment_0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:772:1: ( rule__AttributeName__NameAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeNameAccess().getNameAssignment_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:773:1: ( rule__AttributeName__NameAssignment_0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:773:2: rule__AttributeName__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__NameAssignment_0_in_rule__AttributeName__Alternatives1632);
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:777:6: ( ( rule__AttributeName__Group_1__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:777:6: ( ( rule__AttributeName__Group_1__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:778:1: ( rule__AttributeName__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeNameAccess().getGroup_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:779:1: ( rule__AttributeName__Group_1__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:779:2: rule__AttributeName__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeName__Group_1__0_in_rule__AttributeName__Alternatives1650);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:788:1: rule__AttributeOrInt__Alternatives : ( ( ( rule__AttributeOrInt__AttributeAssignment_0 ) ) | ( ( rule__AttributeOrInt__ValueAssignment_1 ) ) );
    public final void rule__AttributeOrInt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:792:1: ( ( ( rule__AttributeOrInt__AttributeAssignment_0 ) ) | ( ( rule__AttributeOrInt__ValueAssignment_1 ) ) )
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:793:1: ( ( rule__AttributeOrInt__AttributeAssignment_0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:793:1: ( ( rule__AttributeOrInt__AttributeAssignment_0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:794:1: ( rule__AttributeOrInt__AttributeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeOrIntAccess().getAttributeAssignment_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:795:1: ( rule__AttributeOrInt__AttributeAssignment_0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:795:2: rule__AttributeOrInt__AttributeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AttributeOrInt__AttributeAssignment_0_in_rule__AttributeOrInt__Alternatives1683);
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:799:6: ( ( rule__AttributeOrInt__ValueAssignment_1 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:799:6: ( ( rule__AttributeOrInt__ValueAssignment_1 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:800:1: ( rule__AttributeOrInt__ValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeOrIntAccess().getValueAssignment_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:801:1: ( rule__AttributeOrInt__ValueAssignment_1 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:801:2: rule__AttributeOrInt__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AttributeOrInt__ValueAssignment_1_in_rule__AttributeOrInt__Alternatives1701);
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


    // $ANTLR start "rule__AdditionExp__OperatorsAlternatives_1_0_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:810:1: rule__AdditionExp__OperatorsAlternatives_1_0_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AdditionExp__OperatorsAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:814:1: ( ( '+' ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:815:1: ( '+' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:815:1: ( '+' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:816:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionExpAccess().getOperatorsPlusSignKeyword_1_0_0_0()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__AdditionExp__OperatorsAlternatives_1_0_01735); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionExpAccess().getOperatorsPlusSignKeyword_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:823:6: ( '-' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:823:6: ( '-' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:824:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionExpAccess().getOperatorsHyphenMinusKeyword_1_0_0_1()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__AdditionExp__OperatorsAlternatives_1_0_01755); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionExpAccess().getOperatorsHyphenMinusKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__AdditionExp__OperatorsAlternatives_1_0_0"


    // $ANTLR start "rule__MultiplicationExp__Alternatives"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:836:1: rule__MultiplicationExp__Alternatives : ( ( ( rule__MultiplicationExp__Group_0__0 ) ) | ( ( rule__MultiplicationExp__Group_1__0 ) ) );
    public final void rule__MultiplicationExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:840:1: ( ( ( rule__MultiplicationExp__Group_0__0 ) ) | ( ( rule__MultiplicationExp__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:841:1: ( ( rule__MultiplicationExp__Group_0__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:841:1: ( ( rule__MultiplicationExp__Group_0__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:842:1: ( rule__MultiplicationExp__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationExpAccess().getGroup_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:843:1: ( rule__MultiplicationExp__Group_0__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:843:2: rule__MultiplicationExp__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicationExp__Group_0__0_in_rule__MultiplicationExp__Alternatives1789);
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:847:6: ( ( rule__MultiplicationExp__Group_1__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:847:6: ( ( rule__MultiplicationExp__Group_1__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:848:1: ( rule__MultiplicationExp__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationExpAccess().getGroup_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:849:1: ( rule__MultiplicationExp__Group_1__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:849:2: rule__MultiplicationExp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicationExp__Group_1__0_in_rule__MultiplicationExp__Alternatives1807);
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


    // $ANTLR start "rule__MultiplicationExp__OperatorsAlternatives_0_1_0_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:858:1: rule__MultiplicationExp__OperatorsAlternatives_0_1_0_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MultiplicationExp__OperatorsAlternatives_0_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:862:1: ( ( '*' ) | ( '/' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:863:1: ( '*' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:863:1: ( '*' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:864:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationExpAccess().getOperatorsAsteriskKeyword_0_1_0_0_0()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__MultiplicationExp__OperatorsAlternatives_0_1_0_01841); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationExpAccess().getOperatorsAsteriskKeyword_0_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:871:6: ( '/' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:871:6: ( '/' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:872:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationExpAccess().getOperatorsSolidusKeyword_0_1_0_0_1()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__MultiplicationExp__OperatorsAlternatives_0_1_0_01861); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationExpAccess().getOperatorsSolidusKeyword_0_1_0_0_1()); 
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
    // $ANTLR end "rule__MultiplicationExp__OperatorsAlternatives_0_1_0_0"


    // $ANTLR start "rule__Model__Group_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:886:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:890:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:891:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__01893);
            rule__Model__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__01896);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:898:1: rule__Model__Group_0__0__Impl : ( 'GAME' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:902:1: ( ( 'GAME' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:903:1: ( 'GAME' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:903:1: ( 'GAME' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:904:1: 'GAME'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGAMEKeyword_0_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Model__Group_0__0__Impl1924); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:917:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl rule__Model__Group_0__2 ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:921:1: ( rule__Model__Group_0__1__Impl rule__Model__Group_0__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:922:2: rule__Model__Group_0__1__Impl rule__Model__Group_0__2
            {
            pushFollow(FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__11955);
            rule__Model__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_0__2_in_rule__Model__Group_0__11958);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:929:1: rule__Model__Group_0__1__Impl : ( ( rule__Model__NameAssignment_0_1 ) ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:933:1: ( ( ( rule__Model__NameAssignment_0_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:934:1: ( ( rule__Model__NameAssignment_0_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:934:1: ( ( rule__Model__NameAssignment_0_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:935:1: ( rule__Model__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_0_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:936:1: ( rule__Model__NameAssignment_0_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:936:2: rule__Model__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl1985);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:946:1: rule__Model__Group_0__2 : rule__Model__Group_0__2__Impl ;
    public final void rule__Model__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:950:1: ( rule__Model__Group_0__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:951:2: rule__Model__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_0__2__Impl_in_rule__Model__Group_0__22015);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:957:1: rule__Model__Group_0__2__Impl : ( ( rule__Model__PlayerAssignment_0_2 ) ) ;
    public final void rule__Model__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:961:1: ( ( ( rule__Model__PlayerAssignment_0_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:962:1: ( ( rule__Model__PlayerAssignment_0_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:962:1: ( ( rule__Model__PlayerAssignment_0_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:963:1: ( rule__Model__PlayerAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPlayerAssignment_0_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:964:1: ( rule__Model__PlayerAssignment_0_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:964:2: rule__Model__PlayerAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Model__PlayerAssignment_0_2_in_rule__Model__Group_0__2__Impl2042);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:980:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:984:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:985:2: rule__Player__Group__0__Impl rule__Player__Group__1
            {
            pushFollow(FOLLOW_rule__Player__Group__0__Impl_in_rule__Player__Group__02078);
            rule__Player__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Player__Group__1_in_rule__Player__Group__02081);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:992:1: rule__Player__Group__0__Impl : ( ( rule__Player__NameAssignment_0 ) ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:996:1: ( ( ( rule__Player__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:997:1: ( ( rule__Player__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:997:1: ( ( rule__Player__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:998:1: ( rule__Player__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:999:1: ( rule__Player__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:999:2: rule__Player__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Player__NameAssignment_0_in_rule__Player__Group__0__Impl2108);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1009:1: rule__Player__Group__1 : rule__Player__Group__1__Impl rule__Player__Group__2 ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1013:1: ( rule__Player__Group__1__Impl rule__Player__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1014:2: rule__Player__Group__1__Impl rule__Player__Group__2
            {
            pushFollow(FOLLOW_rule__Player__Group__1__Impl_in_rule__Player__Group__12138);
            rule__Player__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Player__Group__2_in_rule__Player__Group__12141);
            rule__Player__Group__2();

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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1021:1: rule__Player__Group__1__Impl : ( ( rule__Player__PlayercountAssignment_1 ) ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1025:1: ( ( ( rule__Player__PlayercountAssignment_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1026:1: ( ( rule__Player__PlayercountAssignment_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1026:1: ( ( rule__Player__PlayercountAssignment_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1027:1: ( rule__Player__PlayercountAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getPlayercountAssignment_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1028:1: ( rule__Player__PlayercountAssignment_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1028:2: rule__Player__PlayercountAssignment_1
            {
            pushFollow(FOLLOW_rule__Player__PlayercountAssignment_1_in_rule__Player__Group__1__Impl2168);
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


    // $ANTLR start "rule__Player__Group__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1038:1: rule__Player__Group__2 : rule__Player__Group__2__Impl rule__Player__Group__3 ;
    public final void rule__Player__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1042:1: ( rule__Player__Group__2__Impl rule__Player__Group__3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1043:2: rule__Player__Group__2__Impl rule__Player__Group__3
            {
            pushFollow(FOLLOW_rule__Player__Group__2__Impl_in_rule__Player__Group__22198);
            rule__Player__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Player__Group__3_in_rule__Player__Group__22201);
            rule__Player__Group__3();

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
    // $ANTLR end "rule__Player__Group__2"


    // $ANTLR start "rule__Player__Group__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1050:1: rule__Player__Group__2__Impl : ( '{' ) ;
    public final void rule__Player__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1054:1: ( ( '{' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1055:1: ( '{' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1055:1: ( '{' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1056:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__Player__Group__2__Impl2229); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Player__Group__2__Impl"


    // $ANTLR start "rule__Player__Group__3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1069:1: rule__Player__Group__3 : rule__Player__Group__3__Impl rule__Player__Group__4 ;
    public final void rule__Player__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1073:1: ( rule__Player__Group__3__Impl rule__Player__Group__4 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1074:2: rule__Player__Group__3__Impl rule__Player__Group__4
            {
            pushFollow(FOLLOW_rule__Player__Group__3__Impl_in_rule__Player__Group__32260);
            rule__Player__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Player__Group__4_in_rule__Player__Group__32263);
            rule__Player__Group__4();

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
    // $ANTLR end "rule__Player__Group__3"


    // $ANTLR start "rule__Player__Group__3__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1081:1: rule__Player__Group__3__Impl : ( ( rule__Player__VariablesAssignment_3 )* ) ;
    public final void rule__Player__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1085:1: ( ( ( rule__Player__VariablesAssignment_3 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1086:1: ( ( rule__Player__VariablesAssignment_3 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1086:1: ( ( rule__Player__VariablesAssignment_3 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1087:1: ( rule__Player__VariablesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getVariablesAssignment_3()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1088:1: ( rule__Player__VariablesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1088:2: rule__Player__VariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Player__VariablesAssignment_3_in_rule__Player__Group__3__Impl2290);
            	    rule__Player__VariablesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getVariablesAssignment_3()); 
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
    // $ANTLR end "rule__Player__Group__3__Impl"


    // $ANTLR start "rule__Player__Group__4"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1098:1: rule__Player__Group__4 : rule__Player__Group__4__Impl ;
    public final void rule__Player__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1102:1: ( rule__Player__Group__4__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1103:2: rule__Player__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Player__Group__4__Impl_in_rule__Player__Group__42321);
            rule__Player__Group__4__Impl();

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
    // $ANTLR end "rule__Player__Group__4"


    // $ANTLR start "rule__Player__Group__4__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1109:1: rule__Player__Group__4__Impl : ( '}' ) ;
    public final void rule__Player__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1113:1: ( ( '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1114:1: ( '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1114:1: ( '}' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1115:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,27,FOLLOW_27_in_rule__Player__Group__4__Impl2349); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Player__Group__4__Impl"


    // $ANTLR start "rule__Board__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1138:1: rule__Board__Group__0 : rule__Board__Group__0__Impl rule__Board__Group__1 ;
    public final void rule__Board__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1142:1: ( rule__Board__Group__0__Impl rule__Board__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1143:2: rule__Board__Group__0__Impl rule__Board__Group__1
            {
            pushFollow(FOLLOW_rule__Board__Group__0__Impl_in_rule__Board__Group__02390);
            rule__Board__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Board__Group__1_in_rule__Board__Group__02393);
            rule__Board__Group__1();

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
    // $ANTLR end "rule__Board__Group__0"


    // $ANTLR start "rule__Board__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1150:1: rule__Board__Group__0__Impl : ( ( rule__Board__NameAssignment_0 ) ) ;
    public final void rule__Board__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1154:1: ( ( ( rule__Board__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1155:1: ( ( rule__Board__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1155:1: ( ( rule__Board__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1156:1: ( rule__Board__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1157:1: ( rule__Board__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1157:2: rule__Board__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Board__NameAssignment_0_in_rule__Board__Group__0__Impl2420);
            rule__Board__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Board__Group__0__Impl"


    // $ANTLR start "rule__Board__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1167:1: rule__Board__Group__1 : rule__Board__Group__1__Impl rule__Board__Group__2 ;
    public final void rule__Board__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1171:1: ( rule__Board__Group__1__Impl rule__Board__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1172:2: rule__Board__Group__1__Impl rule__Board__Group__2
            {
            pushFollow(FOLLOW_rule__Board__Group__1__Impl_in_rule__Board__Group__12450);
            rule__Board__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Board__Group__2_in_rule__Board__Group__12453);
            rule__Board__Group__2();

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
    // $ANTLR end "rule__Board__Group__1"


    // $ANTLR start "rule__Board__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1179:1: rule__Board__Group__1__Impl : ( '{' ) ;
    public final void rule__Board__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1183:1: ( ( '{' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1184:1: ( '{' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1184:1: ( '{' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1185:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Board__Group__1__Impl2481); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__Board__Group__1__Impl"


    // $ANTLR start "rule__Board__Group__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1198:1: rule__Board__Group__2 : rule__Board__Group__2__Impl rule__Board__Group__3 ;
    public final void rule__Board__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1202:1: ( rule__Board__Group__2__Impl rule__Board__Group__3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1203:2: rule__Board__Group__2__Impl rule__Board__Group__3
            {
            pushFollow(FOLLOW_rule__Board__Group__2__Impl_in_rule__Board__Group__22512);
            rule__Board__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Board__Group__3_in_rule__Board__Group__22515);
            rule__Board__Group__3();

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
    // $ANTLR end "rule__Board__Group__2"


    // $ANTLR start "rule__Board__Group__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1210:1: rule__Board__Group__2__Impl : ( ( rule__Board__VariablesAssignment_2 )* ) ;
    public final void rule__Board__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1214:1: ( ( ( rule__Board__VariablesAssignment_2 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1215:1: ( ( rule__Board__VariablesAssignment_2 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1215:1: ( ( rule__Board__VariablesAssignment_2 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1216:1: ( rule__Board__VariablesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getVariablesAssignment_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1217:1: ( rule__Board__VariablesAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==35) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1217:2: rule__Board__VariablesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Board__VariablesAssignment_2_in_rule__Board__Group__2__Impl2542);
            	    rule__Board__VariablesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getVariablesAssignment_2()); 
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
    // $ANTLR end "rule__Board__Group__2__Impl"


    // $ANTLR start "rule__Board__Group__3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1227:1: rule__Board__Group__3 : rule__Board__Group__3__Impl rule__Board__Group__4 ;
    public final void rule__Board__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1231:1: ( rule__Board__Group__3__Impl rule__Board__Group__4 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1232:2: rule__Board__Group__3__Impl rule__Board__Group__4
            {
            pushFollow(FOLLOW_rule__Board__Group__3__Impl_in_rule__Board__Group__32573);
            rule__Board__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Board__Group__4_in_rule__Board__Group__32576);
            rule__Board__Group__4();

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
    // $ANTLR end "rule__Board__Group__3"


    // $ANTLR start "rule__Board__Group__3__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1239:1: rule__Board__Group__3__Impl : ( ( rule__Board__FieldsAssignment_3 )* ) ;
    public final void rule__Board__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1243:1: ( ( ( rule__Board__FieldsAssignment_3 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1244:1: ( ( rule__Board__FieldsAssignment_3 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1244:1: ( ( rule__Board__FieldsAssignment_3 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1245:1: ( rule__Board__FieldsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getFieldsAssignment_3()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1246:1: ( rule__Board__FieldsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1246:2: rule__Board__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Board__FieldsAssignment_3_in_rule__Board__Group__3__Impl2603);
            	    rule__Board__FieldsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getFieldsAssignment_3()); 
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
    // $ANTLR end "rule__Board__Group__3__Impl"


    // $ANTLR start "rule__Board__Group__4"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1256:1: rule__Board__Group__4 : rule__Board__Group__4__Impl ;
    public final void rule__Board__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1260:1: ( rule__Board__Group__4__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1261:2: rule__Board__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Board__Group__4__Impl_in_rule__Board__Group__42634);
            rule__Board__Group__4__Impl();

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
    // $ANTLR end "rule__Board__Group__4"


    // $ANTLR start "rule__Board__Group__4__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1267:1: rule__Board__Group__4__Impl : ( '}' ) ;
    public final void rule__Board__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1271:1: ( ( '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1272:1: ( '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1272:1: ( '}' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1273:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,27,FOLLOW_27_in_rule__Board__Group__4__Impl2662); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Board__Group__4__Impl"


    // $ANTLR start "rule__Rules__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1296:1: rule__Rules__Group__0 : rule__Rules__Group__0__Impl rule__Rules__Group__1 ;
    public final void rule__Rules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1300:1: ( rule__Rules__Group__0__Impl rule__Rules__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1301:2: rule__Rules__Group__0__Impl rule__Rules__Group__1
            {
            pushFollow(FOLLOW_rule__Rules__Group__0__Impl_in_rule__Rules__Group__02703);
            rule__Rules__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rules__Group__1_in_rule__Rules__Group__02706);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1308:1: rule__Rules__Group__0__Impl : ( ( rule__Rules__NameAssignment_0 ) ) ;
    public final void rule__Rules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1312:1: ( ( ( rule__Rules__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1313:1: ( ( rule__Rules__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1313:1: ( ( rule__Rules__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1314:1: ( rule__Rules__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1315:1: ( rule__Rules__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1315:2: rule__Rules__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Rules__NameAssignment_0_in_rule__Rules__Group__0__Impl2733);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1325:1: rule__Rules__Group__1 : rule__Rules__Group__1__Impl rule__Rules__Group__2 ;
    public final void rule__Rules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1329:1: ( rule__Rules__Group__1__Impl rule__Rules__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1330:2: rule__Rules__Group__1__Impl rule__Rules__Group__2
            {
            pushFollow(FOLLOW_rule__Rules__Group__1__Impl_in_rule__Rules__Group__12763);
            rule__Rules__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rules__Group__2_in_rule__Rules__Group__12766);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1337:1: rule__Rules__Group__1__Impl : ( '{' ) ;
    public final void rule__Rules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1341:1: ( ( '{' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1342:1: ( '{' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1342:1: ( '{' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1343:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Rules__Group__1__Impl2794); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1356:1: rule__Rules__Group__2 : rule__Rules__Group__2__Impl rule__Rules__Group__3 ;
    public final void rule__Rules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1360:1: ( rule__Rules__Group__2__Impl rule__Rules__Group__3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1361:2: rule__Rules__Group__2__Impl rule__Rules__Group__3
            {
            pushFollow(FOLLOW_rule__Rules__Group__2__Impl_in_rule__Rules__Group__22825);
            rule__Rules__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rules__Group__3_in_rule__Rules__Group__22828);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1368:1: rule__Rules__Group__2__Impl : ( ( rule__Rules__TurnrulesAssignment_2 ) ) ;
    public final void rule__Rules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1372:1: ( ( ( rule__Rules__TurnrulesAssignment_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1373:1: ( ( rule__Rules__TurnrulesAssignment_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1373:1: ( ( rule__Rules__TurnrulesAssignment_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1374:1: ( rule__Rules__TurnrulesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesAccess().getTurnrulesAssignment_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1375:1: ( rule__Rules__TurnrulesAssignment_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1375:2: rule__Rules__TurnrulesAssignment_2
            {
            pushFollow(FOLLOW_rule__Rules__TurnrulesAssignment_2_in_rule__Rules__Group__2__Impl2855);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1385:1: rule__Rules__Group__3 : rule__Rules__Group__3__Impl ;
    public final void rule__Rules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1389:1: ( rule__Rules__Group__3__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1390:2: rule__Rules__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rules__Group__3__Impl_in_rule__Rules__Group__32885);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1396:1: rule__Rules__Group__3__Impl : ( '}' ) ;
    public final void rule__Rules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1400:1: ( ( '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1401:1: ( '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1401:1: ( '}' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1402:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__Rules__Group__3__Impl2913); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1423:1: rule__TurnRules__Group__0 : rule__TurnRules__Group__0__Impl rule__TurnRules__Group__1 ;
    public final void rule__TurnRules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1427:1: ( rule__TurnRules__Group__0__Impl rule__TurnRules__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1428:2: rule__TurnRules__Group__0__Impl rule__TurnRules__Group__1
            {
            pushFollow(FOLLOW_rule__TurnRules__Group__0__Impl_in_rule__TurnRules__Group__02952);
            rule__TurnRules__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TurnRules__Group__1_in_rule__TurnRules__Group__02955);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1435:1: rule__TurnRules__Group__0__Impl : ( ( rule__TurnRules__NameAssignment_0 ) ) ;
    public final void rule__TurnRules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1439:1: ( ( ( rule__TurnRules__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1440:1: ( ( rule__TurnRules__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1440:1: ( ( rule__TurnRules__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1441:1: ( rule__TurnRules__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1442:1: ( rule__TurnRules__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1442:2: rule__TurnRules__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TurnRules__NameAssignment_0_in_rule__TurnRules__Group__0__Impl2982);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1452:1: rule__TurnRules__Group__1 : rule__TurnRules__Group__1__Impl rule__TurnRules__Group__2 ;
    public final void rule__TurnRules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1456:1: ( rule__TurnRules__Group__1__Impl rule__TurnRules__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1457:2: rule__TurnRules__Group__1__Impl rule__TurnRules__Group__2
            {
            pushFollow(FOLLOW_rule__TurnRules__Group__1__Impl_in_rule__TurnRules__Group__13012);
            rule__TurnRules__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TurnRules__Group__2_in_rule__TurnRules__Group__13015);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1464:1: rule__TurnRules__Group__1__Impl : ( '{' ) ;
    public final void rule__TurnRules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1468:1: ( ( '{' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1469:1: ( '{' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1469:1: ( '{' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1470:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__TurnRules__Group__1__Impl3043); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1483:1: rule__TurnRules__Group__2 : rule__TurnRules__Group__2__Impl rule__TurnRules__Group__3 ;
    public final void rule__TurnRules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1487:1: ( rule__TurnRules__Group__2__Impl rule__TurnRules__Group__3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1488:2: rule__TurnRules__Group__2__Impl rule__TurnRules__Group__3
            {
            pushFollow(FOLLOW_rule__TurnRules__Group__2__Impl_in_rule__TurnRules__Group__23074);
            rule__TurnRules__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TurnRules__Group__3_in_rule__TurnRules__Group__23077);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1495:1: rule__TurnRules__Group__2__Impl : ( ( rule__TurnRules__ActionsAssignment_2 )* ) ;
    public final void rule__TurnRules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1499:1: ( ( ( rule__TurnRules__ActionsAssignment_2 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1500:1: ( ( rule__TurnRules__ActionsAssignment_2 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1500:1: ( ( rule__TurnRules__ActionsAssignment_2 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1501:1: ( rule__TurnRules__ActionsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesAccess().getActionsAssignment_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1502:1: ( rule__TurnRules__ActionsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=33 && LA13_0<=34)||(LA13_0>=40 && LA13_0<=43)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1502:2: rule__TurnRules__ActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__TurnRules__ActionsAssignment_2_in_rule__TurnRules__Group__2__Impl3104);
            	    rule__TurnRules__ActionsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1512:1: rule__TurnRules__Group__3 : rule__TurnRules__Group__3__Impl ;
    public final void rule__TurnRules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1516:1: ( rule__TurnRules__Group__3__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1517:2: rule__TurnRules__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TurnRules__Group__3__Impl_in_rule__TurnRules__Group__33135);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1523:1: rule__TurnRules__Group__3__Impl : ( '}' ) ;
    public final void rule__TurnRules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1527:1: ( ( '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1528:1: ( '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1528:1: ( '}' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1529:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__TurnRules__Group__3__Impl3163); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1550:1: rule__Token__Group__0 : rule__Token__Group__0__Impl rule__Token__Group__1 ;
    public final void rule__Token__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1554:1: ( rule__Token__Group__0__Impl rule__Token__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1555:2: rule__Token__Group__0__Impl rule__Token__Group__1
            {
            pushFollow(FOLLOW_rule__Token__Group__0__Impl_in_rule__Token__Group__03202);
            rule__Token__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Token__Group__1_in_rule__Token__Group__03205);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1562:1: rule__Token__Group__0__Impl : ( 'TOKEN' ) ;
    public final void rule__Token__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1566:1: ( ( 'TOKEN' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1567:1: ( 'TOKEN' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1567:1: ( 'TOKEN' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1568:1: 'TOKEN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenAccess().getTOKENKeyword_0()); 
            }
            match(input,11,FOLLOW_11_in_rule__Token__Group__0__Impl3233); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1581:1: rule__Token__Group__1 : rule__Token__Group__1__Impl rule__Token__Group__2 ;
    public final void rule__Token__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1585:1: ( rule__Token__Group__1__Impl rule__Token__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1586:2: rule__Token__Group__1__Impl rule__Token__Group__2
            {
            pushFollow(FOLLOW_rule__Token__Group__1__Impl_in_rule__Token__Group__13264);
            rule__Token__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Token__Group__2_in_rule__Token__Group__13267);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1593:1: rule__Token__Group__1__Impl : ( ( rule__Token__NameAssignment_1 ) ) ;
    public final void rule__Token__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1597:1: ( ( ( rule__Token__NameAssignment_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1598:1: ( ( rule__Token__NameAssignment_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1598:1: ( ( rule__Token__NameAssignment_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1599:1: ( rule__Token__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenAccess().getNameAssignment_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1600:1: ( rule__Token__NameAssignment_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1600:2: rule__Token__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Token__NameAssignment_1_in_rule__Token__Group__1__Impl3294);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1610:1: rule__Token__Group__2 : rule__Token__Group__2__Impl rule__Token__Group__3 ;
    public final void rule__Token__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1614:1: ( rule__Token__Group__2__Impl rule__Token__Group__3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1615:2: rule__Token__Group__2__Impl rule__Token__Group__3
            {
            pushFollow(FOLLOW_rule__Token__Group__2__Impl_in_rule__Token__Group__23324);
            rule__Token__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Token__Group__3_in_rule__Token__Group__23327);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1622:1: rule__Token__Group__2__Impl : ( '{' ) ;
    public final void rule__Token__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1626:1: ( ( '{' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1627:1: ( '{' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1627:1: ( '{' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1628:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__Token__Group__2__Impl3355); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1641:1: rule__Token__Group__3 : rule__Token__Group__3__Impl rule__Token__Group__4 ;
    public final void rule__Token__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1645:1: ( rule__Token__Group__3__Impl rule__Token__Group__4 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1646:2: rule__Token__Group__3__Impl rule__Token__Group__4
            {
            pushFollow(FOLLOW_rule__Token__Group__3__Impl_in_rule__Token__Group__33386);
            rule__Token__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Token__Group__4_in_rule__Token__Group__33389);
            rule__Token__Group__4();

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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1653:1: rule__Token__Group__3__Impl : ( ( rule__Token__VariablesAssignment_3 )* ) ;
    public final void rule__Token__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1657:1: ( ( ( rule__Token__VariablesAssignment_3 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1658:1: ( ( rule__Token__VariablesAssignment_3 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1658:1: ( ( rule__Token__VariablesAssignment_3 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1659:1: ( rule__Token__VariablesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenAccess().getVariablesAssignment_3()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1660:1: ( rule__Token__VariablesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1660:2: rule__Token__VariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Token__VariablesAssignment_3_in_rule__Token__Group__3__Impl3416);
            	    rule__Token__VariablesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenAccess().getVariablesAssignment_3()); 
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


    // $ANTLR start "rule__Token__Group__4"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1670:1: rule__Token__Group__4 : rule__Token__Group__4__Impl ;
    public final void rule__Token__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1674:1: ( rule__Token__Group__4__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1675:2: rule__Token__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Token__Group__4__Impl_in_rule__Token__Group__43447);
            rule__Token__Group__4__Impl();

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
    // $ANTLR end "rule__Token__Group__4"


    // $ANTLR start "rule__Token__Group__4__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1681:1: rule__Token__Group__4__Impl : ( '}' ) ;
    public final void rule__Token__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1685:1: ( ( '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1686:1: ( '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1686:1: ( '}' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1687:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,27,FOLLOW_27_in_rule__Token__Group__4__Impl3475); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Token__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1710:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1714:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1715:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03516);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03519);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1722:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1726:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1727:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1727:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1728:1: ( rule__Field__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1729:1: ( rule__Field__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1729:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl3546);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1739:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1743:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1744:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13576);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13579);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1751:1: rule__Field__Group__1__Impl : ( '(' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1755:1: ( ( '(' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1756:1: ( '(' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1756:1: ( '(' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1757:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Field__Group__1__Impl3607); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1770:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1774:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1775:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23638);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23641);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1782:1: rule__Field__Group__2__Impl : ( ( rule__Field__XAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1786:1: ( ( ( rule__Field__XAssignment_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1787:1: ( ( rule__Field__XAssignment_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1787:1: ( ( rule__Field__XAssignment_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1788:1: ( rule__Field__XAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getXAssignment_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1789:1: ( rule__Field__XAssignment_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1789:2: rule__Field__XAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__XAssignment_2_in_rule__Field__Group__2__Impl3668);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1799:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1803:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1804:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33698);
            rule__Field__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33701);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1811:1: rule__Field__Group__3__Impl : ( ',' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1815:1: ( ( ',' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1816:1: ( ',' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1816:1: ( ',' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1817:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommaKeyword_3()); 
            }
            match(input,29,FOLLOW_29_in_rule__Field__Group__3__Impl3729); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1830:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1834:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1835:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43760);
            rule__Field__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__43763);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1842:1: rule__Field__Group__4__Impl : ( ( rule__Field__YAssignment_4 ) ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1846:1: ( ( ( rule__Field__YAssignment_4 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1847:1: ( ( rule__Field__YAssignment_4 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1847:1: ( ( rule__Field__YAssignment_4 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1848:1: ( rule__Field__YAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getYAssignment_4()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1849:1: ( rule__Field__YAssignment_4 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1849:2: rule__Field__YAssignment_4
            {
            pushFollow(FOLLOW_rule__Field__YAssignment_4_in_rule__Field__Group__4__Impl3790);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1859:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1863:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1864:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__53820);
            rule__Field__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__6_in_rule__Field__Group__53823);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1871:1: rule__Field__Group__5__Impl : ( ',' ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1875:1: ( ( ',' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1876:1: ( ',' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1876:1: ( ',' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1877:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommaKeyword_5()); 
            }
            match(input,29,FOLLOW_29_in_rule__Field__Group__5__Impl3851); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1890:1: rule__Field__Group__6 : rule__Field__Group__6__Impl rule__Field__Group__7 ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1894:1: ( rule__Field__Group__6__Impl rule__Field__Group__7 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1895:2: rule__Field__Group__6__Impl rule__Field__Group__7
            {
            pushFollow(FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__63882);
            rule__Field__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__7_in_rule__Field__Group__63885);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1902:1: rule__Field__Group__6__Impl : ( ( rule__Field__ZAssignment_6 ) ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1906:1: ( ( ( rule__Field__ZAssignment_6 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1907:1: ( ( rule__Field__ZAssignment_6 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1907:1: ( ( rule__Field__ZAssignment_6 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1908:1: ( rule__Field__ZAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getZAssignment_6()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1909:1: ( rule__Field__ZAssignment_6 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1909:2: rule__Field__ZAssignment_6
            {
            pushFollow(FOLLOW_rule__Field__ZAssignment_6_in_rule__Field__Group__6__Impl3912);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1919:1: rule__Field__Group__7 : rule__Field__Group__7__Impl rule__Field__Group__8 ;
    public final void rule__Field__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1923:1: ( rule__Field__Group__7__Impl rule__Field__Group__8 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1924:2: rule__Field__Group__7__Impl rule__Field__Group__8
            {
            pushFollow(FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__73942);
            rule__Field__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__8_in_rule__Field__Group__73945);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1931:1: rule__Field__Group__7__Impl : ( ')' ) ;
    public final void rule__Field__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1935:1: ( ( ')' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1936:1: ( ')' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1936:1: ( ')' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1937:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,30,FOLLOW_30_in_rule__Field__Group__7__Impl3973); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1950:1: rule__Field__Group__8 : rule__Field__Group__8__Impl rule__Field__Group__9 ;
    public final void rule__Field__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1954:1: ( rule__Field__Group__8__Impl rule__Field__Group__9 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1955:2: rule__Field__Group__8__Impl rule__Field__Group__9
            {
            pushFollow(FOLLOW_rule__Field__Group__8__Impl_in_rule__Field__Group__84004);
            rule__Field__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__9_in_rule__Field__Group__84007);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1962:1: rule__Field__Group__8__Impl : ( '{' ) ;
    public final void rule__Field__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1966:1: ( ( '{' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1967:1: ( '{' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1967:1: ( '{' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1968:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_8()); 
            }
            match(input,26,FOLLOW_26_in_rule__Field__Group__8__Impl4035); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_8()); 
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1981:1: rule__Field__Group__9 : rule__Field__Group__9__Impl rule__Field__Group__10 ;
    public final void rule__Field__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1985:1: ( rule__Field__Group__9__Impl rule__Field__Group__10 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1986:2: rule__Field__Group__9__Impl rule__Field__Group__10
            {
            pushFollow(FOLLOW_rule__Field__Group__9__Impl_in_rule__Field__Group__94066);
            rule__Field__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__10_in_rule__Field__Group__94069);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1993:1: rule__Field__Group__9__Impl : ( ( rule__Field__NeighboursAssignment_9 )* ) ;
    public final void rule__Field__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1997:1: ( ( ( rule__Field__NeighboursAssignment_9 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1998:1: ( ( rule__Field__NeighboursAssignment_9 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1998:1: ( ( rule__Field__NeighboursAssignment_9 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1999:1: ( rule__Field__NeighboursAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNeighboursAssignment_9()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2000:1: ( rule__Field__NeighboursAssignment_9 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==RULE_ID||LA15_1==27) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2000:2: rule__Field__NeighboursAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Field__NeighboursAssignment_9_in_rule__Field__Group__9__Impl4096);
            	    rule__Field__NeighboursAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2010:1: rule__Field__Group__10 : rule__Field__Group__10__Impl rule__Field__Group__11 ;
    public final void rule__Field__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2014:1: ( rule__Field__Group__10__Impl rule__Field__Group__11 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2015:2: rule__Field__Group__10__Impl rule__Field__Group__11
            {
            pushFollow(FOLLOW_rule__Field__Group__10__Impl_in_rule__Field__Group__104127);
            rule__Field__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__11_in_rule__Field__Group__104130);
            rule__Field__Group__11();

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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2022:1: rule__Field__Group__10__Impl : ( ( rule__Field__VariablesAssignment_10 )* ) ;
    public final void rule__Field__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2026:1: ( ( ( rule__Field__VariablesAssignment_10 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2027:1: ( ( rule__Field__VariablesAssignment_10 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2027:1: ( ( rule__Field__VariablesAssignment_10 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2028:1: ( rule__Field__VariablesAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getVariablesAssignment_10()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2029:1: ( rule__Field__VariablesAssignment_10 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2029:2: rule__Field__VariablesAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__Field__VariablesAssignment_10_in_rule__Field__Group__10__Impl4157);
            	    rule__Field__VariablesAssignment_10();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getVariablesAssignment_10()); 
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


    // $ANTLR start "rule__Field__Group__11"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2039:1: rule__Field__Group__11 : rule__Field__Group__11__Impl ;
    public final void rule__Field__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2043:1: ( rule__Field__Group__11__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2044:2: rule__Field__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__11__Impl_in_rule__Field__Group__114188);
            rule__Field__Group__11__Impl();

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
    // $ANTLR end "rule__Field__Group__11"


    // $ANTLR start "rule__Field__Group__11__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2050:1: rule__Field__Group__11__Impl : ( '}' ) ;
    public final void rule__Field__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2054:1: ( ( '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2055:1: ( '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2055:1: ( '}' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2056:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,27,FOLLOW_27_in_rule__Field__Group__11__Impl4216); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_11()); 
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
    // $ANTLR end "rule__Field__Group__11__Impl"


    // $ANTLR start "rule__Action__Group_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2093:1: rule__Action__Group_0__0 : rule__Action__Group_0__0__Impl rule__Action__Group_0__1 ;
    public final void rule__Action__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2097:1: ( rule__Action__Group_0__0__Impl rule__Action__Group_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2098:2: rule__Action__Group_0__0__Impl rule__Action__Group_0__1
            {
            pushFollow(FOLLOW_rule__Action__Group_0__0__Impl_in_rule__Action__Group_0__04271);
            rule__Action__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_0__1_in_rule__Action__Group_0__04274);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2105:1: rule__Action__Group_0__0__Impl : ( ( rule__Action__NameAssignment_0_0 ) ) ;
    public final void rule__Action__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2109:1: ( ( ( rule__Action__NameAssignment_0_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2110:1: ( ( rule__Action__NameAssignment_0_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2110:1: ( ( rule__Action__NameAssignment_0_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2111:1: ( rule__Action__NameAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameAssignment_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2112:1: ( rule__Action__NameAssignment_0_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2112:2: rule__Action__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_0_0_in_rule__Action__Group_0__0__Impl4301);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2122:1: rule__Action__Group_0__1 : rule__Action__Group_0__1__Impl ;
    public final void rule__Action__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2126:1: ( rule__Action__Group_0__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2127:2: rule__Action__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_0__1__Impl_in_rule__Action__Group_0__14331);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2133:1: rule__Action__Group_0__1__Impl : ( ( rule__Action__TokenAssignment_0_1 ) ) ;
    public final void rule__Action__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2137:1: ( ( ( rule__Action__TokenAssignment_0_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2138:1: ( ( rule__Action__TokenAssignment_0_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2138:1: ( ( rule__Action__TokenAssignment_0_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2139:1: ( rule__Action__TokenAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTokenAssignment_0_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2140:1: ( rule__Action__TokenAssignment_0_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2140:2: rule__Action__TokenAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Action__TokenAssignment_0_1_in_rule__Action__Group_0__1__Impl4358);
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


    // $ANTLR start "rule__Action__Group_3__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2154:1: rule__Action__Group_3__0 : rule__Action__Group_3__0__Impl rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2158:1: ( rule__Action__Group_3__0__Impl rule__Action__Group_3__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2159:2: rule__Action__Group_3__0__Impl rule__Action__Group_3__1
            {
            pushFollow(FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__04392);
            rule__Action__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__04395);
            rule__Action__Group_3__1();

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
    // $ANTLR end "rule__Action__Group_3__0"


    // $ANTLR start "rule__Action__Group_3__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2166:1: rule__Action__Group_3__0__Impl : ( ( rule__Action__NameAssignment_3_0 ) ) ;
    public final void rule__Action__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2170:1: ( ( ( rule__Action__NameAssignment_3_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2171:1: ( ( rule__Action__NameAssignment_3_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2171:1: ( ( rule__Action__NameAssignment_3_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2172:1: ( rule__Action__NameAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameAssignment_3_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2173:1: ( rule__Action__NameAssignment_3_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2173:2: rule__Action__NameAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_3_0_in_rule__Action__Group_3__0__Impl4422);
            rule__Action__NameAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getNameAssignment_3_0()); 
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
    // $ANTLR end "rule__Action__Group_3__0__Impl"


    // $ANTLR start "rule__Action__Group_3__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2183:1: rule__Action__Group_3__1 : rule__Action__Group_3__1__Impl rule__Action__Group_3__2 ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2187:1: ( rule__Action__Group_3__1__Impl rule__Action__Group_3__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2188:2: rule__Action__Group_3__1__Impl rule__Action__Group_3__2
            {
            pushFollow(FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__14452);
            rule__Action__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_3__2_in_rule__Action__Group_3__14455);
            rule__Action__Group_3__2();

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
    // $ANTLR end "rule__Action__Group_3__1"


    // $ANTLR start "rule__Action__Group_3__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2195:1: rule__Action__Group_3__1__Impl : ( ( rule__Action__ObjectOfSelectAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2199:1: ( ( ( rule__Action__ObjectOfSelectAssignment_3_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2200:1: ( ( rule__Action__ObjectOfSelectAssignment_3_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2200:1: ( ( rule__Action__ObjectOfSelectAssignment_3_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2201:1: ( rule__Action__ObjectOfSelectAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getObjectOfSelectAssignment_3_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2202:1: ( rule__Action__ObjectOfSelectAssignment_3_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2202:2: rule__Action__ObjectOfSelectAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Action__ObjectOfSelectAssignment_3_1_in_rule__Action__Group_3__1__Impl4482);
            rule__Action__ObjectOfSelectAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getObjectOfSelectAssignment_3_1()); 
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
    // $ANTLR end "rule__Action__Group_3__1__Impl"


    // $ANTLR start "rule__Action__Group_3__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2212:1: rule__Action__Group_3__2 : rule__Action__Group_3__2__Impl rule__Action__Group_3__3 ;
    public final void rule__Action__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2216:1: ( rule__Action__Group_3__2__Impl rule__Action__Group_3__3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2217:2: rule__Action__Group_3__2__Impl rule__Action__Group_3__3
            {
            pushFollow(FOLLOW_rule__Action__Group_3__2__Impl_in_rule__Action__Group_3__24512);
            rule__Action__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_3__3_in_rule__Action__Group_3__24515);
            rule__Action__Group_3__3();

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
    // $ANTLR end "rule__Action__Group_3__2"


    // $ANTLR start "rule__Action__Group_3__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2224:1: rule__Action__Group_3__2__Impl : ( 'WHERE' ) ;
    public final void rule__Action__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2228:1: ( ( 'WHERE' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2229:1: ( 'WHERE' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2229:1: ( 'WHERE' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2230:1: 'WHERE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getWHEREKeyword_3_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__Action__Group_3__2__Impl4543); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getWHEREKeyword_3_2()); 
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
    // $ANTLR end "rule__Action__Group_3__2__Impl"


    // $ANTLR start "rule__Action__Group_3__3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2243:1: rule__Action__Group_3__3 : rule__Action__Group_3__3__Impl ;
    public final void rule__Action__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2247:1: ( rule__Action__Group_3__3__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2248:2: rule__Action__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_3__3__Impl_in_rule__Action__Group_3__34574);
            rule__Action__Group_3__3__Impl();

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
    // $ANTLR end "rule__Action__Group_3__3"


    // $ANTLR start "rule__Action__Group_3__3__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2254:1: rule__Action__Group_3__3__Impl : ( ( rule__Action__FilterAssignment_3_3 ) ) ;
    public final void rule__Action__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2258:1: ( ( ( rule__Action__FilterAssignment_3_3 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2259:1: ( ( rule__Action__FilterAssignment_3_3 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2259:1: ( ( rule__Action__FilterAssignment_3_3 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2260:1: ( rule__Action__FilterAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getFilterAssignment_3_3()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2261:1: ( rule__Action__FilterAssignment_3_3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2261:2: rule__Action__FilterAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Action__FilterAssignment_3_3_in_rule__Action__Group_3__3__Impl4601);
            rule__Action__FilterAssignment_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getFilterAssignment_3_3()); 
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
    // $ANTLR end "rule__Action__Group_3__3__Impl"


    // $ANTLR start "rule__OrExp__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2279:1: rule__OrExp__Group__0 : rule__OrExp__Group__0__Impl rule__OrExp__Group__1 ;
    public final void rule__OrExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2283:1: ( rule__OrExp__Group__0__Impl rule__OrExp__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2284:2: rule__OrExp__Group__0__Impl rule__OrExp__Group__1
            {
            pushFollow(FOLLOW_rule__OrExp__Group__0__Impl_in_rule__OrExp__Group__04639);
            rule__OrExp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExp__Group__1_in_rule__OrExp__Group__04642);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2291:1: rule__OrExp__Group__0__Impl : ( ( rule__OrExp__ExpressionsAssignment_0 ) ) ;
    public final void rule__OrExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2295:1: ( ( ( rule__OrExp__ExpressionsAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2296:1: ( ( rule__OrExp__ExpressionsAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2296:1: ( ( rule__OrExp__ExpressionsAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2297:1: ( rule__OrExp__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getExpressionsAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2298:1: ( rule__OrExp__ExpressionsAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2298:2: rule__OrExp__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_rule__OrExp__ExpressionsAssignment_0_in_rule__OrExp__Group__0__Impl4669);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2308:1: rule__OrExp__Group__1 : rule__OrExp__Group__1__Impl ;
    public final void rule__OrExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2312:1: ( rule__OrExp__Group__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2313:2: rule__OrExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExp__Group__1__Impl_in_rule__OrExp__Group__14699);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2319:1: rule__OrExp__Group__1__Impl : ( ( rule__OrExp__Group_1__0 )* ) ;
    public final void rule__OrExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2323:1: ( ( ( rule__OrExp__Group_1__0 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2324:1: ( ( rule__OrExp__Group_1__0 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2324:1: ( ( rule__OrExp__Group_1__0 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2325:1: ( rule__OrExp__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getGroup_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2326:1: ( rule__OrExp__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==44) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2326:2: rule__OrExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExp__Group_1__0_in_rule__OrExp__Group__1__Impl4726);
            	    rule__OrExp__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2340:1: rule__OrExp__Group_1__0 : rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 ;
    public final void rule__OrExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2344:1: ( rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2345:2: rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__0__Impl_in_rule__OrExp__Group_1__04761);
            rule__OrExp__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__OrExp__Group_1__1_in_rule__OrExp__Group_1__04764);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2352:1: rule__OrExp__Group_1__0__Impl : ( ( rule__OrExp__OperatorsAssignment_1_0 ) ) ;
    public final void rule__OrExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2356:1: ( ( ( rule__OrExp__OperatorsAssignment_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2357:1: ( ( rule__OrExp__OperatorsAssignment_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2357:1: ( ( rule__OrExp__OperatorsAssignment_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2358:1: ( rule__OrExp__OperatorsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getOperatorsAssignment_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2359:1: ( rule__OrExp__OperatorsAssignment_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2359:2: rule__OrExp__OperatorsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__OrExp__OperatorsAssignment_1_0_in_rule__OrExp__Group_1__0__Impl4791);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2369:1: rule__OrExp__Group_1__1 : rule__OrExp__Group_1__1__Impl ;
    public final void rule__OrExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2373:1: ( rule__OrExp__Group_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2374:2: rule__OrExp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__1__Impl_in_rule__OrExp__Group_1__14821);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2380:1: rule__OrExp__Group_1__1__Impl : ( ( rule__OrExp__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__OrExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2384:1: ( ( ( rule__OrExp__ExpressionsAssignment_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2385:1: ( ( rule__OrExp__ExpressionsAssignment_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2385:1: ( ( rule__OrExp__ExpressionsAssignment_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2386:1: ( rule__OrExp__ExpressionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getExpressionsAssignment_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2387:1: ( rule__OrExp__ExpressionsAssignment_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2387:2: rule__OrExp__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExp__ExpressionsAssignment_1_1_in_rule__OrExp__Group_1__1__Impl4848);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2401:1: rule__AndExp__Group__0 : rule__AndExp__Group__0__Impl rule__AndExp__Group__1 ;
    public final void rule__AndExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2405:1: ( rule__AndExp__Group__0__Impl rule__AndExp__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2406:2: rule__AndExp__Group__0__Impl rule__AndExp__Group__1
            {
            pushFollow(FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__04882);
            rule__AndExp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__04885);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2413:1: rule__AndExp__Group__0__Impl : ( ( rule__AndExp__ExpressionsAssignment_0 ) ) ;
    public final void rule__AndExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2417:1: ( ( ( rule__AndExp__ExpressionsAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2418:1: ( ( rule__AndExp__ExpressionsAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2418:1: ( ( rule__AndExp__ExpressionsAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2419:1: ( rule__AndExp__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getExpressionsAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2420:1: ( rule__AndExp__ExpressionsAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2420:2: rule__AndExp__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_rule__AndExp__ExpressionsAssignment_0_in_rule__AndExp__Group__0__Impl4912);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2430:1: rule__AndExp__Group__1 : rule__AndExp__Group__1__Impl ;
    public final void rule__AndExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2434:1: ( rule__AndExp__Group__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2435:2: rule__AndExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__14942);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2441:1: rule__AndExp__Group__1__Impl : ( ( rule__AndExp__Group_1__0 )* ) ;
    public final void rule__AndExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2445:1: ( ( ( rule__AndExp__Group_1__0 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2446:1: ( ( rule__AndExp__Group_1__0 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2446:1: ( ( rule__AndExp__Group_1__0 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2447:1: ( rule__AndExp__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getGroup_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2448:1: ( rule__AndExp__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==45) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2448:2: rule__AndExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExp__Group_1__0_in_rule__AndExp__Group__1__Impl4969);
            	    rule__AndExp__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2462:1: rule__AndExp__Group_1__0 : rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 ;
    public final void rule__AndExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2466:1: ( rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2467:2: rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__0__Impl_in_rule__AndExp__Group_1__05004);
            rule__AndExp__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AndExp__Group_1__1_in_rule__AndExp__Group_1__05007);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2474:1: rule__AndExp__Group_1__0__Impl : ( ( rule__AndExp__OperatorsAssignment_1_0 ) ) ;
    public final void rule__AndExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2478:1: ( ( ( rule__AndExp__OperatorsAssignment_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2479:1: ( ( rule__AndExp__OperatorsAssignment_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2479:1: ( ( rule__AndExp__OperatorsAssignment_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2480:1: ( rule__AndExp__OperatorsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getOperatorsAssignment_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2481:1: ( rule__AndExp__OperatorsAssignment_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2481:2: rule__AndExp__OperatorsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AndExp__OperatorsAssignment_1_0_in_rule__AndExp__Group_1__0__Impl5034);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2491:1: rule__AndExp__Group_1__1 : rule__AndExp__Group_1__1__Impl ;
    public final void rule__AndExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2495:1: ( rule__AndExp__Group_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2496:2: rule__AndExp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__1__Impl_in_rule__AndExp__Group_1__15064);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2502:1: rule__AndExp__Group_1__1__Impl : ( ( rule__AndExp__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__AndExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2506:1: ( ( ( rule__AndExp__ExpressionsAssignment_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2507:1: ( ( rule__AndExp__ExpressionsAssignment_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2507:1: ( ( rule__AndExp__ExpressionsAssignment_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2508:1: ( rule__AndExp__ExpressionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getExpressionsAssignment_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2509:1: ( rule__AndExp__ExpressionsAssignment_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2509:2: rule__AndExp__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExp__ExpressionsAssignment_1_1_in_rule__AndExp__Group_1__1__Impl5091);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2523:1: rule__BooleanExp__Group_0__0 : rule__BooleanExp__Group_0__0__Impl rule__BooleanExp__Group_0__1 ;
    public final void rule__BooleanExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2527:1: ( rule__BooleanExp__Group_0__0__Impl rule__BooleanExp__Group_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2528:2: rule__BooleanExp__Group_0__0__Impl rule__BooleanExp__Group_0__1
            {
            pushFollow(FOLLOW_rule__BooleanExp__Group_0__0__Impl_in_rule__BooleanExp__Group_0__05125);
            rule__BooleanExp__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BooleanExp__Group_0__1_in_rule__BooleanExp__Group_0__05128);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2535:1: rule__BooleanExp__Group_0__0__Impl : ( ( rule__BooleanExp__NotAssignment_0_0 )? ) ;
    public final void rule__BooleanExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2539:1: ( ( ( rule__BooleanExp__NotAssignment_0_0 )? ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2540:1: ( ( rule__BooleanExp__NotAssignment_0_0 )? )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2540:1: ( ( rule__BooleanExp__NotAssignment_0_0 )? )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2541:1: ( rule__BooleanExp__NotAssignment_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getNotAssignment_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2542:1: ( rule__BooleanExp__NotAssignment_0_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2542:2: rule__BooleanExp__NotAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__BooleanExp__NotAssignment_0_0_in_rule__BooleanExp__Group_0__0__Impl5155);
                    rule__BooleanExp__NotAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getNotAssignment_0_0()); 
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2552:1: rule__BooleanExp__Group_0__1 : rule__BooleanExp__Group_0__1__Impl ;
    public final void rule__BooleanExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2556:1: ( rule__BooleanExp__Group_0__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2557:2: rule__BooleanExp__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BooleanExp__Group_0__1__Impl_in_rule__BooleanExp__Group_0__15186);
            rule__BooleanExp__Group_0__1__Impl();

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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2563:1: rule__BooleanExp__Group_0__1__Impl : ( ( rule__BooleanExp__Group_0_1__0 ) ) ;
    public final void rule__BooleanExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2567:1: ( ( ( rule__BooleanExp__Group_0_1__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2568:1: ( ( rule__BooleanExp__Group_0_1__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2568:1: ( ( rule__BooleanExp__Group_0_1__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2569:1: ( rule__BooleanExp__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getGroup_0_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2570:1: ( rule__BooleanExp__Group_0_1__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2570:2: rule__BooleanExp__Group_0_1__0
            {
            pushFollow(FOLLOW_rule__BooleanExp__Group_0_1__0_in_rule__BooleanExp__Group_0__1__Impl5213);
            rule__BooleanExp__Group_0_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getGroup_0_1()); 
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


    // $ANTLR start "rule__BooleanExp__Group_0_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2584:1: rule__BooleanExp__Group_0_1__0 : rule__BooleanExp__Group_0_1__0__Impl rule__BooleanExp__Group_0_1__1 ;
    public final void rule__BooleanExp__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2588:1: ( rule__BooleanExp__Group_0_1__0__Impl rule__BooleanExp__Group_0_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2589:2: rule__BooleanExp__Group_0_1__0__Impl rule__BooleanExp__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__BooleanExp__Group_0_1__0__Impl_in_rule__BooleanExp__Group_0_1__05247);
            rule__BooleanExp__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BooleanExp__Group_0_1__1_in_rule__BooleanExp__Group_0_1__05250);
            rule__BooleanExp__Group_0_1__1();

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
    // $ANTLR end "rule__BooleanExp__Group_0_1__0"


    // $ANTLR start "rule__BooleanExp__Group_0_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2596:1: rule__BooleanExp__Group_0_1__0__Impl : ( ( rule__BooleanExp__LeftAssignment_0_1_0 ) ) ;
    public final void rule__BooleanExp__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2600:1: ( ( ( rule__BooleanExp__LeftAssignment_0_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2601:1: ( ( rule__BooleanExp__LeftAssignment_0_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2601:1: ( ( rule__BooleanExp__LeftAssignment_0_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2602:1: ( rule__BooleanExp__LeftAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getLeftAssignment_0_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2603:1: ( rule__BooleanExp__LeftAssignment_0_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2603:2: rule__BooleanExp__LeftAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__BooleanExp__LeftAssignment_0_1_0_in_rule__BooleanExp__Group_0_1__0__Impl5277);
            rule__BooleanExp__LeftAssignment_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getLeftAssignment_0_1_0()); 
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
    // $ANTLR end "rule__BooleanExp__Group_0_1__0__Impl"


    // $ANTLR start "rule__BooleanExp__Group_0_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2613:1: rule__BooleanExp__Group_0_1__1 : rule__BooleanExp__Group_0_1__1__Impl rule__BooleanExp__Group_0_1__2 ;
    public final void rule__BooleanExp__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2617:1: ( rule__BooleanExp__Group_0_1__1__Impl rule__BooleanExp__Group_0_1__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2618:2: rule__BooleanExp__Group_0_1__1__Impl rule__BooleanExp__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__BooleanExp__Group_0_1__1__Impl_in_rule__BooleanExp__Group_0_1__15307);
            rule__BooleanExp__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BooleanExp__Group_0_1__2_in_rule__BooleanExp__Group_0_1__15310);
            rule__BooleanExp__Group_0_1__2();

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
    // $ANTLR end "rule__BooleanExp__Group_0_1__1"


    // $ANTLR start "rule__BooleanExp__Group_0_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2625:1: rule__BooleanExp__Group_0_1__1__Impl : ( ( rule__BooleanExp__NameAssignment_0_1_1 ) ) ;
    public final void rule__BooleanExp__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2629:1: ( ( ( rule__BooleanExp__NameAssignment_0_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2630:1: ( ( rule__BooleanExp__NameAssignment_0_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2630:1: ( ( rule__BooleanExp__NameAssignment_0_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2631:1: ( rule__BooleanExp__NameAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getNameAssignment_0_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2632:1: ( rule__BooleanExp__NameAssignment_0_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2632:2: rule__BooleanExp__NameAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__BooleanExp__NameAssignment_0_1_1_in_rule__BooleanExp__Group_0_1__1__Impl5337);
            rule__BooleanExp__NameAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getNameAssignment_0_1_1()); 
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
    // $ANTLR end "rule__BooleanExp__Group_0_1__1__Impl"


    // $ANTLR start "rule__BooleanExp__Group_0_1__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2642:1: rule__BooleanExp__Group_0_1__2 : rule__BooleanExp__Group_0_1__2__Impl ;
    public final void rule__BooleanExp__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2646:1: ( rule__BooleanExp__Group_0_1__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2647:2: rule__BooleanExp__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BooleanExp__Group_0_1__2__Impl_in_rule__BooleanExp__Group_0_1__25367);
            rule__BooleanExp__Group_0_1__2__Impl();

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
    // $ANTLR end "rule__BooleanExp__Group_0_1__2"


    // $ANTLR start "rule__BooleanExp__Group_0_1__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2653:1: rule__BooleanExp__Group_0_1__2__Impl : ( ( rule__BooleanExp__RightAssignment_0_1_2 ) ) ;
    public final void rule__BooleanExp__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2657:1: ( ( ( rule__BooleanExp__RightAssignment_0_1_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2658:1: ( ( rule__BooleanExp__RightAssignment_0_1_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2658:1: ( ( rule__BooleanExp__RightAssignment_0_1_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2659:1: ( rule__BooleanExp__RightAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getRightAssignment_0_1_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2660:1: ( rule__BooleanExp__RightAssignment_0_1_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2660:2: rule__BooleanExp__RightAssignment_0_1_2
            {
            pushFollow(FOLLOW_rule__BooleanExp__RightAssignment_0_1_2_in_rule__BooleanExp__Group_0_1__2__Impl5394);
            rule__BooleanExp__RightAssignment_0_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getRightAssignment_0_1_2()); 
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
    // $ANTLR end "rule__BooleanExp__Group_0_1__2__Impl"


    // $ANTLR start "rule__BooleanExp__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2676:1: rule__BooleanExp__Group_1__0 : rule__BooleanExp__Group_1__0__Impl rule__BooleanExp__Group_1__1 ;
    public final void rule__BooleanExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2680:1: ( rule__BooleanExp__Group_1__0__Impl rule__BooleanExp__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2681:2: rule__BooleanExp__Group_1__0__Impl rule__BooleanExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__BooleanExp__Group_1__0__Impl_in_rule__BooleanExp__Group_1__05430);
            rule__BooleanExp__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BooleanExp__Group_1__1_in_rule__BooleanExp__Group_1__05433);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2688:1: rule__BooleanExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__BooleanExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2692:1: ( ( '(' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2693:1: ( '(' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2693:1: ( '(' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2694:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__BooleanExp__Group_1__0__Impl5461); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2707:1: rule__BooleanExp__Group_1__1 : rule__BooleanExp__Group_1__1__Impl rule__BooleanExp__Group_1__2 ;
    public final void rule__BooleanExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2711:1: ( rule__BooleanExp__Group_1__1__Impl rule__BooleanExp__Group_1__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2712:2: rule__BooleanExp__Group_1__1__Impl rule__BooleanExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__BooleanExp__Group_1__1__Impl_in_rule__BooleanExp__Group_1__15492);
            rule__BooleanExp__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BooleanExp__Group_1__2_in_rule__BooleanExp__Group_1__15495);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2719:1: rule__BooleanExp__Group_1__1__Impl : ( ( rule__BooleanExp__NestedExpAssignment_1_1 ) ) ;
    public final void rule__BooleanExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2723:1: ( ( ( rule__BooleanExp__NestedExpAssignment_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2724:1: ( ( rule__BooleanExp__NestedExpAssignment_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2724:1: ( ( rule__BooleanExp__NestedExpAssignment_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2725:1: ( rule__BooleanExp__NestedExpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getNestedExpAssignment_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2726:1: ( rule__BooleanExp__NestedExpAssignment_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2726:2: rule__BooleanExp__NestedExpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BooleanExp__NestedExpAssignment_1_1_in_rule__BooleanExp__Group_1__1__Impl5522);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2736:1: rule__BooleanExp__Group_1__2 : rule__BooleanExp__Group_1__2__Impl ;
    public final void rule__BooleanExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2740:1: ( rule__BooleanExp__Group_1__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2741:2: rule__BooleanExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BooleanExp__Group_1__2__Impl_in_rule__BooleanExp__Group_1__25552);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2747:1: rule__BooleanExp__Group_1__2__Impl : ( ')' ) ;
    public final void rule__BooleanExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2751:1: ( ( ')' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2752:1: ( ')' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2752:1: ( ')' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2753:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__BooleanExp__Group_1__2__Impl5580); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2772:1: rule__AttributeName__Group_1__0 : rule__AttributeName__Group_1__0__Impl rule__AttributeName__Group_1__1 ;
    public final void rule__AttributeName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2776:1: ( rule__AttributeName__Group_1__0__Impl rule__AttributeName__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2777:2: rule__AttributeName__Group_1__0__Impl rule__AttributeName__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_1__0__Impl_in_rule__AttributeName__Group_1__05617);
            rule__AttributeName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributeName__Group_1__1_in_rule__AttributeName__Group_1__05620);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2784:1: rule__AttributeName__Group_1__0__Impl : ( ( rule__AttributeName__ParentAssignment_1_0 ) ) ;
    public final void rule__AttributeName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2788:1: ( ( ( rule__AttributeName__ParentAssignment_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2789:1: ( ( rule__AttributeName__ParentAssignment_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2789:1: ( ( rule__AttributeName__ParentAssignment_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2790:1: ( rule__AttributeName__ParentAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeNameAccess().getParentAssignment_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2791:1: ( rule__AttributeName__ParentAssignment_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2791:2: rule__AttributeName__ParentAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AttributeName__ParentAssignment_1_0_in_rule__AttributeName__Group_1__0__Impl5647);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2801:1: rule__AttributeName__Group_1__1 : rule__AttributeName__Group_1__1__Impl rule__AttributeName__Group_1__2 ;
    public final void rule__AttributeName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2805:1: ( rule__AttributeName__Group_1__1__Impl rule__AttributeName__Group_1__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2806:2: rule__AttributeName__Group_1__1__Impl rule__AttributeName__Group_1__2
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_1__1__Impl_in_rule__AttributeName__Group_1__15677);
            rule__AttributeName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributeName__Group_1__2_in_rule__AttributeName__Group_1__15680);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2813:1: rule__AttributeName__Group_1__1__Impl : ( '.' ) ;
    public final void rule__AttributeName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2817:1: ( ( '.' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2818:1: ( '.' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2818:1: ( '.' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2819:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeNameAccess().getFullStopKeyword_1_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__AttributeName__Group_1__1__Impl5708); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2832:1: rule__AttributeName__Group_1__2 : rule__AttributeName__Group_1__2__Impl ;
    public final void rule__AttributeName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2836:1: ( rule__AttributeName__Group_1__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2837:2: rule__AttributeName__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeName__Group_1__2__Impl_in_rule__AttributeName__Group_1__25739);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2843:1: rule__AttributeName__Group_1__2__Impl : ( ( rule__AttributeName__ChildAssignment_1_2 ) ) ;
    public final void rule__AttributeName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2847:1: ( ( ( rule__AttributeName__ChildAssignment_1_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2848:1: ( ( rule__AttributeName__ChildAssignment_1_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2848:1: ( ( rule__AttributeName__ChildAssignment_1_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2849:1: ( rule__AttributeName__ChildAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeNameAccess().getChildAssignment_1_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2850:1: ( rule__AttributeName__ChildAssignment_1_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2850:2: rule__AttributeName__ChildAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AttributeName__ChildAssignment_1_2_in_rule__AttributeName__Group_1__2__Impl5766);
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


    // $ANTLR start "rule__GotoCondition__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2866:1: rule__GotoCondition__Group__0 : rule__GotoCondition__Group__0__Impl rule__GotoCondition__Group__1 ;
    public final void rule__GotoCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2870:1: ( rule__GotoCondition__Group__0__Impl rule__GotoCondition__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2871:2: rule__GotoCondition__Group__0__Impl rule__GotoCondition__Group__1
            {
            pushFollow(FOLLOW_rule__GotoCondition__Group__0__Impl_in_rule__GotoCondition__Group__05802);
            rule__GotoCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GotoCondition__Group__1_in_rule__GotoCondition__Group__05805);
            rule__GotoCondition__Group__1();

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
    // $ANTLR end "rule__GotoCondition__Group__0"


    // $ANTLR start "rule__GotoCondition__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2878:1: rule__GotoCondition__Group__0__Impl : ( 'IF' ) ;
    public final void rule__GotoCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2882:1: ( ( 'IF' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2883:1: ( 'IF' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2883:1: ( 'IF' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2884:1: 'IF'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGotoConditionAccess().getIFKeyword_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__GotoCondition__Group__0__Impl5833); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGotoConditionAccess().getIFKeyword_0()); 
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
    // $ANTLR end "rule__GotoCondition__Group__0__Impl"


    // $ANTLR start "rule__GotoCondition__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2897:1: rule__GotoCondition__Group__1 : rule__GotoCondition__Group__1__Impl rule__GotoCondition__Group__2 ;
    public final void rule__GotoCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2901:1: ( rule__GotoCondition__Group__1__Impl rule__GotoCondition__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2902:2: rule__GotoCondition__Group__1__Impl rule__GotoCondition__Group__2
            {
            pushFollow(FOLLOW_rule__GotoCondition__Group__1__Impl_in_rule__GotoCondition__Group__15864);
            rule__GotoCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GotoCondition__Group__2_in_rule__GotoCondition__Group__15867);
            rule__GotoCondition__Group__2();

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
    // $ANTLR end "rule__GotoCondition__Group__1"


    // $ANTLR start "rule__GotoCondition__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2909:1: rule__GotoCondition__Group__1__Impl : ( ( rule__GotoCondition__ConditionAssignment_1 ) ) ;
    public final void rule__GotoCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2913:1: ( ( ( rule__GotoCondition__ConditionAssignment_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2914:1: ( ( rule__GotoCondition__ConditionAssignment_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2914:1: ( ( rule__GotoCondition__ConditionAssignment_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2915:1: ( rule__GotoCondition__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGotoConditionAccess().getConditionAssignment_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2916:1: ( rule__GotoCondition__ConditionAssignment_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2916:2: rule__GotoCondition__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__GotoCondition__ConditionAssignment_1_in_rule__GotoCondition__Group__1__Impl5894);
            rule__GotoCondition__ConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGotoConditionAccess().getConditionAssignment_1()); 
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
    // $ANTLR end "rule__GotoCondition__Group__1__Impl"


    // $ANTLR start "rule__GotoCondition__Group__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2926:1: rule__GotoCondition__Group__2 : rule__GotoCondition__Group__2__Impl rule__GotoCondition__Group__3 ;
    public final void rule__GotoCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2930:1: ( rule__GotoCondition__Group__2__Impl rule__GotoCondition__Group__3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2931:2: rule__GotoCondition__Group__2__Impl rule__GotoCondition__Group__3
            {
            pushFollow(FOLLOW_rule__GotoCondition__Group__2__Impl_in_rule__GotoCondition__Group__25924);
            rule__GotoCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GotoCondition__Group__3_in_rule__GotoCondition__Group__25927);
            rule__GotoCondition__Group__3();

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
    // $ANTLR end "rule__GotoCondition__Group__2"


    // $ANTLR start "rule__GotoCondition__Group__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2938:1: rule__GotoCondition__Group__2__Impl : ( ( rule__GotoCondition__NameAssignment_2 ) ) ;
    public final void rule__GotoCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2942:1: ( ( ( rule__GotoCondition__NameAssignment_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2943:1: ( ( rule__GotoCondition__NameAssignment_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2943:1: ( ( rule__GotoCondition__NameAssignment_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2944:1: ( rule__GotoCondition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGotoConditionAccess().getNameAssignment_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2945:1: ( rule__GotoCondition__NameAssignment_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2945:2: rule__GotoCondition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__GotoCondition__NameAssignment_2_in_rule__GotoCondition__Group__2__Impl5954);
            rule__GotoCondition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGotoConditionAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__GotoCondition__Group__2__Impl"


    // $ANTLR start "rule__GotoCondition__Group__3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2955:1: rule__GotoCondition__Group__3 : rule__GotoCondition__Group__3__Impl ;
    public final void rule__GotoCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2959:1: ( rule__GotoCondition__Group__3__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2960:2: rule__GotoCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GotoCondition__Group__3__Impl_in_rule__GotoCondition__Group__35984);
            rule__GotoCondition__Group__3__Impl();

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
    // $ANTLR end "rule__GotoCondition__Group__3"


    // $ANTLR start "rule__GotoCondition__Group__3__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2966:1: rule__GotoCondition__Group__3__Impl : ( ( rule__GotoCondition__GotoAssignment_3 ) ) ;
    public final void rule__GotoCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2970:1: ( ( ( rule__GotoCondition__GotoAssignment_3 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2971:1: ( ( rule__GotoCondition__GotoAssignment_3 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2971:1: ( ( rule__GotoCondition__GotoAssignment_3 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2972:1: ( rule__GotoCondition__GotoAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGotoConditionAccess().getGotoAssignment_3()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2973:1: ( rule__GotoCondition__GotoAssignment_3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2973:2: rule__GotoCondition__GotoAssignment_3
            {
            pushFollow(FOLLOW_rule__GotoCondition__GotoAssignment_3_in_rule__GotoCondition__Group__3__Impl6011);
            rule__GotoCondition__GotoAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGotoConditionAccess().getGotoAssignment_3()); 
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
    // $ANTLR end "rule__GotoCondition__Group__3__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2991:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2995:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2996:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__06049);
            rule__Label__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Label__Group__1_in_rule__Label__Group__06052);
            rule__Label__Group__1();

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
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3003:1: rule__Label__Group__0__Impl : ( 'LABEL' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3007:1: ( ( 'LABEL' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3008:1: ( 'LABEL' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3008:1: ( 'LABEL' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3009:1: 'LABEL'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelAccess().getLABELKeyword_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Label__Group__0__Impl6080); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelAccess().getLABELKeyword_0()); 
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
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3022:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3026:1: ( rule__Label__Group__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3027:2: rule__Label__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__16111);
            rule__Label__Group__1__Impl();

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
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3033:1: rule__Label__Group__1__Impl : ( ( rule__Label__NameAssignment_1 ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3037:1: ( ( ( rule__Label__NameAssignment_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3038:1: ( ( rule__Label__NameAssignment_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3038:1: ( ( rule__Label__NameAssignment_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3039:1: ( rule__Label__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelAccess().getNameAssignment_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3040:1: ( rule__Label__NameAssignment_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3040:2: rule__Label__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Label__NameAssignment_1_in_rule__Label__Group__1__Impl6138);
            rule__Label__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__AdditionExp__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3054:1: rule__AdditionExp__Group__0 : rule__AdditionExp__Group__0__Impl rule__AdditionExp__Group__1 ;
    public final void rule__AdditionExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3058:1: ( rule__AdditionExp__Group__0__Impl rule__AdditionExp__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3059:2: rule__AdditionExp__Group__0__Impl rule__AdditionExp__Group__1
            {
            pushFollow(FOLLOW_rule__AdditionExp__Group__0__Impl_in_rule__AdditionExp__Group__06172);
            rule__AdditionExp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditionExp__Group__1_in_rule__AdditionExp__Group__06175);
            rule__AdditionExp__Group__1();

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
    // $ANTLR end "rule__AdditionExp__Group__0"


    // $ANTLR start "rule__AdditionExp__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3066:1: rule__AdditionExp__Group__0__Impl : ( ( rule__AdditionExp__ExpressionsAssignment_0 ) ) ;
    public final void rule__AdditionExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3070:1: ( ( ( rule__AdditionExp__ExpressionsAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3071:1: ( ( rule__AdditionExp__ExpressionsAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3071:1: ( ( rule__AdditionExp__ExpressionsAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3072:1: ( rule__AdditionExp__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpAccess().getExpressionsAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3073:1: ( rule__AdditionExp__ExpressionsAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3073:2: rule__AdditionExp__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_rule__AdditionExp__ExpressionsAssignment_0_in_rule__AdditionExp__Group__0__Impl6202);
            rule__AdditionExp__ExpressionsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpAccess().getExpressionsAssignment_0()); 
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
    // $ANTLR end "rule__AdditionExp__Group__0__Impl"


    // $ANTLR start "rule__AdditionExp__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3083:1: rule__AdditionExp__Group__1 : rule__AdditionExp__Group__1__Impl ;
    public final void rule__AdditionExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3087:1: ( rule__AdditionExp__Group__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3088:2: rule__AdditionExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExp__Group__1__Impl_in_rule__AdditionExp__Group__16232);
            rule__AdditionExp__Group__1__Impl();

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
    // $ANTLR end "rule__AdditionExp__Group__1"


    // $ANTLR start "rule__AdditionExp__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3094:1: rule__AdditionExp__Group__1__Impl : ( ( rule__AdditionExp__Group_1__0 )* ) ;
    public final void rule__AdditionExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3098:1: ( ( ( rule__AdditionExp__Group_1__0 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3099:1: ( ( rule__AdditionExp__Group_1__0 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3099:1: ( ( rule__AdditionExp__Group_1__0 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3100:1: ( rule__AdditionExp__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpAccess().getGroup_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3101:1: ( rule__AdditionExp__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=21 && LA20_0<=22)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3101:2: rule__AdditionExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AdditionExp__Group_1__0_in_rule__AdditionExp__Group__1__Impl6259);
            	    rule__AdditionExp__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpAccess().getGroup_1()); 
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
    // $ANTLR end "rule__AdditionExp__Group__1__Impl"


    // $ANTLR start "rule__AdditionExp__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3115:1: rule__AdditionExp__Group_1__0 : rule__AdditionExp__Group_1__0__Impl rule__AdditionExp__Group_1__1 ;
    public final void rule__AdditionExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3119:1: ( rule__AdditionExp__Group_1__0__Impl rule__AdditionExp__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3120:2: rule__AdditionExp__Group_1__0__Impl rule__AdditionExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AdditionExp__Group_1__0__Impl_in_rule__AdditionExp__Group_1__06294);
            rule__AdditionExp__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AdditionExp__Group_1__1_in_rule__AdditionExp__Group_1__06297);
            rule__AdditionExp__Group_1__1();

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
    // $ANTLR end "rule__AdditionExp__Group_1__0"


    // $ANTLR start "rule__AdditionExp__Group_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3127:1: rule__AdditionExp__Group_1__0__Impl : ( ( rule__AdditionExp__OperatorsAssignment_1_0 ) ) ;
    public final void rule__AdditionExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3131:1: ( ( ( rule__AdditionExp__OperatorsAssignment_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3132:1: ( ( rule__AdditionExp__OperatorsAssignment_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3132:1: ( ( rule__AdditionExp__OperatorsAssignment_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3133:1: ( rule__AdditionExp__OperatorsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpAccess().getOperatorsAssignment_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3134:1: ( rule__AdditionExp__OperatorsAssignment_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3134:2: rule__AdditionExp__OperatorsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AdditionExp__OperatorsAssignment_1_0_in_rule__AdditionExp__Group_1__0__Impl6324);
            rule__AdditionExp__OperatorsAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpAccess().getOperatorsAssignment_1_0()); 
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
    // $ANTLR end "rule__AdditionExp__Group_1__0__Impl"


    // $ANTLR start "rule__AdditionExp__Group_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3144:1: rule__AdditionExp__Group_1__1 : rule__AdditionExp__Group_1__1__Impl ;
    public final void rule__AdditionExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3148:1: ( rule__AdditionExp__Group_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3149:2: rule__AdditionExp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExp__Group_1__1__Impl_in_rule__AdditionExp__Group_1__16354);
            rule__AdditionExp__Group_1__1__Impl();

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
    // $ANTLR end "rule__AdditionExp__Group_1__1"


    // $ANTLR start "rule__AdditionExp__Group_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3155:1: rule__AdditionExp__Group_1__1__Impl : ( ( rule__AdditionExp__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__AdditionExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3159:1: ( ( ( rule__AdditionExp__ExpressionsAssignment_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3160:1: ( ( rule__AdditionExp__ExpressionsAssignment_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3160:1: ( ( rule__AdditionExp__ExpressionsAssignment_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3161:1: ( rule__AdditionExp__ExpressionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpAccess().getExpressionsAssignment_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3162:1: ( rule__AdditionExp__ExpressionsAssignment_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3162:2: rule__AdditionExp__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AdditionExp__ExpressionsAssignment_1_1_in_rule__AdditionExp__Group_1__1__Impl6381);
            rule__AdditionExp__ExpressionsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpAccess().getExpressionsAssignment_1_1()); 
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
    // $ANTLR end "rule__AdditionExp__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExp__Group_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3176:1: rule__MultiplicationExp__Group_0__0 : rule__MultiplicationExp__Group_0__0__Impl rule__MultiplicationExp__Group_0__1 ;
    public final void rule__MultiplicationExp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3180:1: ( rule__MultiplicationExp__Group_0__0__Impl rule__MultiplicationExp__Group_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3181:2: rule__MultiplicationExp__Group_0__0__Impl rule__MultiplicationExp__Group_0__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_0__0__Impl_in_rule__MultiplicationExp__Group_0__06415);
            rule__MultiplicationExp__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_0__1_in_rule__MultiplicationExp__Group_0__06418);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3188:1: rule__MultiplicationExp__Group_0__0__Impl : ( ( rule__MultiplicationExp__ExpressionsAssignment_0_0 ) ) ;
    public final void rule__MultiplicationExp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3192:1: ( ( ( rule__MultiplicationExp__ExpressionsAssignment_0_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3193:1: ( ( rule__MultiplicationExp__ExpressionsAssignment_0_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3193:1: ( ( rule__MultiplicationExp__ExpressionsAssignment_0_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3194:1: ( rule__MultiplicationExp__ExpressionsAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getExpressionsAssignment_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3195:1: ( rule__MultiplicationExp__ExpressionsAssignment_0_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3195:2: rule__MultiplicationExp__ExpressionsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__ExpressionsAssignment_0_0_in_rule__MultiplicationExp__Group_0__0__Impl6445);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3205:1: rule__MultiplicationExp__Group_0__1 : rule__MultiplicationExp__Group_0__1__Impl ;
    public final void rule__MultiplicationExp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3209:1: ( rule__MultiplicationExp__Group_0__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3210:2: rule__MultiplicationExp__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_0__1__Impl_in_rule__MultiplicationExp__Group_0__16475);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3216:1: rule__MultiplicationExp__Group_0__1__Impl : ( ( rule__MultiplicationExp__Group_0_1__0 )* ) ;
    public final void rule__MultiplicationExp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3220:1: ( ( ( rule__MultiplicationExp__Group_0_1__0 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3221:1: ( ( rule__MultiplicationExp__Group_0_1__0 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3221:1: ( ( rule__MultiplicationExp__Group_0_1__0 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3222:1: ( rule__MultiplicationExp__Group_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getGroup_0_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3223:1: ( rule__MultiplicationExp__Group_0_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=23 && LA21_0<=24)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3223:2: rule__MultiplicationExp__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultiplicationExp__Group_0_1__0_in_rule__MultiplicationExp__Group_0__1__Impl6502);
            	    rule__MultiplicationExp__Group_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getGroup_0_1()); 
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


    // $ANTLR start "rule__MultiplicationExp__Group_0_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3237:1: rule__MultiplicationExp__Group_0_1__0 : rule__MultiplicationExp__Group_0_1__0__Impl rule__MultiplicationExp__Group_0_1__1 ;
    public final void rule__MultiplicationExp__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3241:1: ( rule__MultiplicationExp__Group_0_1__0__Impl rule__MultiplicationExp__Group_0_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3242:2: rule__MultiplicationExp__Group_0_1__0__Impl rule__MultiplicationExp__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_0_1__0__Impl_in_rule__MultiplicationExp__Group_0_1__06537);
            rule__MultiplicationExp__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_0_1__1_in_rule__MultiplicationExp__Group_0_1__06540);
            rule__MultiplicationExp__Group_0_1__1();

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
    // $ANTLR end "rule__MultiplicationExp__Group_0_1__0"


    // $ANTLR start "rule__MultiplicationExp__Group_0_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3249:1: rule__MultiplicationExp__Group_0_1__0__Impl : ( ( rule__MultiplicationExp__OperatorsAssignment_0_1_0 ) ) ;
    public final void rule__MultiplicationExp__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3253:1: ( ( ( rule__MultiplicationExp__OperatorsAssignment_0_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3254:1: ( ( rule__MultiplicationExp__OperatorsAssignment_0_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3254:1: ( ( rule__MultiplicationExp__OperatorsAssignment_0_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3255:1: ( rule__MultiplicationExp__OperatorsAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getOperatorsAssignment_0_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3256:1: ( rule__MultiplicationExp__OperatorsAssignment_0_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3256:2: rule__MultiplicationExp__OperatorsAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__OperatorsAssignment_0_1_0_in_rule__MultiplicationExp__Group_0_1__0__Impl6567);
            rule__MultiplicationExp__OperatorsAssignment_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getOperatorsAssignment_0_1_0()); 
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
    // $ANTLR end "rule__MultiplicationExp__Group_0_1__0__Impl"


    // $ANTLR start "rule__MultiplicationExp__Group_0_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3266:1: rule__MultiplicationExp__Group_0_1__1 : rule__MultiplicationExp__Group_0_1__1__Impl ;
    public final void rule__MultiplicationExp__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3270:1: ( rule__MultiplicationExp__Group_0_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3271:2: rule__MultiplicationExp__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_0_1__1__Impl_in_rule__MultiplicationExp__Group_0_1__16597);
            rule__MultiplicationExp__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__MultiplicationExp__Group_0_1__1"


    // $ANTLR start "rule__MultiplicationExp__Group_0_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3277:1: rule__MultiplicationExp__Group_0_1__1__Impl : ( ( rule__MultiplicationExp__ExpressionsAssignment_0_1_1 ) ) ;
    public final void rule__MultiplicationExp__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3281:1: ( ( ( rule__MultiplicationExp__ExpressionsAssignment_0_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3282:1: ( ( rule__MultiplicationExp__ExpressionsAssignment_0_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3282:1: ( ( rule__MultiplicationExp__ExpressionsAssignment_0_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3283:1: ( rule__MultiplicationExp__ExpressionsAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getExpressionsAssignment_0_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3284:1: ( rule__MultiplicationExp__ExpressionsAssignment_0_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3284:2: rule__MultiplicationExp__ExpressionsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__ExpressionsAssignment_0_1_1_in_rule__MultiplicationExp__Group_0_1__1__Impl6624);
            rule__MultiplicationExp__ExpressionsAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getExpressionsAssignment_0_1_1()); 
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
    // $ANTLR end "rule__MultiplicationExp__Group_0_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExp__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3298:1: rule__MultiplicationExp__Group_1__0 : rule__MultiplicationExp__Group_1__0__Impl rule__MultiplicationExp__Group_1__1 ;
    public final void rule__MultiplicationExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3302:1: ( rule__MultiplicationExp__Group_1__0__Impl rule__MultiplicationExp__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3303:2: rule__MultiplicationExp__Group_1__0__Impl rule__MultiplicationExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_1__0__Impl_in_rule__MultiplicationExp__Group_1__06658);
            rule__MultiplicationExp__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_1__1_in_rule__MultiplicationExp__Group_1__06661);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3310:1: rule__MultiplicationExp__Group_1__0__Impl : ( '(' ) ;
    public final void rule__MultiplicationExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3314:1: ( ( '(' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3315:1: ( '(' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3315:1: ( '(' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3316:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__MultiplicationExp__Group_1__0__Impl6689); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3329:1: rule__MultiplicationExp__Group_1__1 : rule__MultiplicationExp__Group_1__1__Impl rule__MultiplicationExp__Group_1__2 ;
    public final void rule__MultiplicationExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3333:1: ( rule__MultiplicationExp__Group_1__1__Impl rule__MultiplicationExp__Group_1__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3334:2: rule__MultiplicationExp__Group_1__1__Impl rule__MultiplicationExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_1__1__Impl_in_rule__MultiplicationExp__Group_1__16720);
            rule__MultiplicationExp__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_1__2_in_rule__MultiplicationExp__Group_1__16723);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3341:1: rule__MultiplicationExp__Group_1__1__Impl : ( ( rule__MultiplicationExp__NestedExpAssignment_1_1 ) ) ;
    public final void rule__MultiplicationExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3345:1: ( ( ( rule__MultiplicationExp__NestedExpAssignment_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3346:1: ( ( rule__MultiplicationExp__NestedExpAssignment_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3346:1: ( ( rule__MultiplicationExp__NestedExpAssignment_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3347:1: ( rule__MultiplicationExp__NestedExpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getNestedExpAssignment_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3348:1: ( rule__MultiplicationExp__NestedExpAssignment_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3348:2: rule__MultiplicationExp__NestedExpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__NestedExpAssignment_1_1_in_rule__MultiplicationExp__Group_1__1__Impl6750);
            rule__MultiplicationExp__NestedExpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getNestedExpAssignment_1_1()); 
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3358:1: rule__MultiplicationExp__Group_1__2 : rule__MultiplicationExp__Group_1__2__Impl ;
    public final void rule__MultiplicationExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3362:1: ( rule__MultiplicationExp__Group_1__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3363:2: rule__MultiplicationExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__Group_1__2__Impl_in_rule__MultiplicationExp__Group_1__26780);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3369:1: rule__MultiplicationExp__Group_1__2__Impl : ( ')' ) ;
    public final void rule__MultiplicationExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3373:1: ( ( ')' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3374:1: ( ')' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3374:1: ( ')' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3375:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__MultiplicationExp__Group_1__2__Impl6808); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3394:1: rule__ValueAssignment__Group__0 : rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1 ;
    public final void rule__ValueAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3398:1: ( rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3399:2: rule__ValueAssignment__Group__0__Impl rule__ValueAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__0__Impl_in_rule__ValueAssignment__Group__06845);
            rule__ValueAssignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ValueAssignment__Group__1_in_rule__ValueAssignment__Group__06848);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3406:1: rule__ValueAssignment__Group__0__Impl : ( ( rule__ValueAssignment__NameAssignment_0 ) ) ;
    public final void rule__ValueAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3410:1: ( ( ( rule__ValueAssignment__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3411:1: ( ( rule__ValueAssignment__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3411:1: ( ( rule__ValueAssignment__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3412:1: ( rule__ValueAssignment__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAssignmentAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3413:1: ( rule__ValueAssignment__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3413:2: rule__ValueAssignment__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ValueAssignment__NameAssignment_0_in_rule__ValueAssignment__Group__0__Impl6875);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3423:1: rule__ValueAssignment__Group__1 : rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2 ;
    public final void rule__ValueAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3427:1: ( rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3428:2: rule__ValueAssignment__Group__1__Impl rule__ValueAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__1__Impl_in_rule__ValueAssignment__Group__16905);
            rule__ValueAssignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ValueAssignment__Group__2_in_rule__ValueAssignment__Group__16908);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3435:1: rule__ValueAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__ValueAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3439:1: ( ( '=' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3440:1: ( '=' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3440:1: ( '=' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3441:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__ValueAssignment__Group__1__Impl6936); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3454:1: rule__ValueAssignment__Group__2 : rule__ValueAssignment__Group__2__Impl ;
    public final void rule__ValueAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3458:1: ( rule__ValueAssignment__Group__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3459:2: rule__ValueAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ValueAssignment__Group__2__Impl_in_rule__ValueAssignment__Group__26967);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3465:1: rule__ValueAssignment__Group__2__Impl : ( ( rule__ValueAssignment__AdditionAssignment_2 ) ) ;
    public final void rule__ValueAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3469:1: ( ( ( rule__ValueAssignment__AdditionAssignment_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3470:1: ( ( rule__ValueAssignment__AdditionAssignment_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3470:1: ( ( rule__ValueAssignment__AdditionAssignment_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3471:1: ( rule__ValueAssignment__AdditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAssignmentAccess().getAdditionAssignment_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3472:1: ( rule__ValueAssignment__AdditionAssignment_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3472:2: rule__ValueAssignment__AdditionAssignment_2
            {
            pushFollow(FOLLOW_rule__ValueAssignment__AdditionAssignment_2_in_rule__ValueAssignment__Group__2__Impl6994);
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


    // $ANTLR start "rule__SimpleAssignment__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3488:1: rule__SimpleAssignment__Group__0 : rule__SimpleAssignment__Group__0__Impl rule__SimpleAssignment__Group__1 ;
    public final void rule__SimpleAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3492:1: ( rule__SimpleAssignment__Group__0__Impl rule__SimpleAssignment__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3493:2: rule__SimpleAssignment__Group__0__Impl rule__SimpleAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleAssignment__Group__0__Impl_in_rule__SimpleAssignment__Group__07030);
            rule__SimpleAssignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SimpleAssignment__Group__1_in_rule__SimpleAssignment__Group__07033);
            rule__SimpleAssignment__Group__1();

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
    // $ANTLR end "rule__SimpleAssignment__Group__0"


    // $ANTLR start "rule__SimpleAssignment__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3500:1: rule__SimpleAssignment__Group__0__Impl : ( ( rule__SimpleAssignment__NameAssignment_0 ) ) ;
    public final void rule__SimpleAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3504:1: ( ( ( rule__SimpleAssignment__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3505:1: ( ( rule__SimpleAssignment__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3505:1: ( ( rule__SimpleAssignment__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3506:1: ( rule__SimpleAssignment__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAssignmentAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3507:1: ( rule__SimpleAssignment__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3507:2: rule__SimpleAssignment__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleAssignment__NameAssignment_0_in_rule__SimpleAssignment__Group__0__Impl7060);
            rule__SimpleAssignment__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAssignmentAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__SimpleAssignment__Group__0__Impl"


    // $ANTLR start "rule__SimpleAssignment__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3517:1: rule__SimpleAssignment__Group__1 : rule__SimpleAssignment__Group__1__Impl rule__SimpleAssignment__Group__2 ;
    public final void rule__SimpleAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3521:1: ( rule__SimpleAssignment__Group__1__Impl rule__SimpleAssignment__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3522:2: rule__SimpleAssignment__Group__1__Impl rule__SimpleAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleAssignment__Group__1__Impl_in_rule__SimpleAssignment__Group__17090);
            rule__SimpleAssignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SimpleAssignment__Group__2_in_rule__SimpleAssignment__Group__17093);
            rule__SimpleAssignment__Group__2();

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
    // $ANTLR end "rule__SimpleAssignment__Group__1"


    // $ANTLR start "rule__SimpleAssignment__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3529:1: rule__SimpleAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__SimpleAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3533:1: ( ( '=' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3534:1: ( '=' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3534:1: ( '=' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3535:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__SimpleAssignment__Group__1__Impl7121); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAssignmentAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__SimpleAssignment__Group__1__Impl"


    // $ANTLR start "rule__SimpleAssignment__Group__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3548:1: rule__SimpleAssignment__Group__2 : rule__SimpleAssignment__Group__2__Impl ;
    public final void rule__SimpleAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3552:1: ( rule__SimpleAssignment__Group__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3553:2: rule__SimpleAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleAssignment__Group__2__Impl_in_rule__SimpleAssignment__Group__27152);
            rule__SimpleAssignment__Group__2__Impl();

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
    // $ANTLR end "rule__SimpleAssignment__Group__2"


    // $ANTLR start "rule__SimpleAssignment__Group__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3559:1: rule__SimpleAssignment__Group__2__Impl : ( ( rule__SimpleAssignment__AttributeAssignment_2 ) ) ;
    public final void rule__SimpleAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3563:1: ( ( ( rule__SimpleAssignment__AttributeAssignment_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3564:1: ( ( rule__SimpleAssignment__AttributeAssignment_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3564:1: ( ( rule__SimpleAssignment__AttributeAssignment_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3565:1: ( rule__SimpleAssignment__AttributeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAssignmentAccess().getAttributeAssignment_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3566:1: ( rule__SimpleAssignment__AttributeAssignment_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3566:2: rule__SimpleAssignment__AttributeAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleAssignment__AttributeAssignment_2_in_rule__SimpleAssignment__Group__2__Impl7179);
            rule__SimpleAssignment__AttributeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAssignmentAccess().getAttributeAssignment_2()); 
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
    // $ANTLR end "rule__SimpleAssignment__Group__2__Impl"


    // $ANTLR start "rule__Model__UnorderedGroup"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3583:1: rule__Model__UnorderedGroup : rule__Model__UnorderedGroup__0 {...}?;
    public final void rule__Model__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3588:1: ( rule__Model__UnorderedGroup__0 {...}?)
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3589:2: rule__Model__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__0_in_rule__Model__UnorderedGroup7216);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3600:1: rule__Model__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) ) ) | ({...}? => ( ( ( rule__Model__RulesAssignment_3 ) ) ) ) ) ;
    public final void rule__Model__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3605:1: ( ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) ) ) | ({...}? => ( ( ( rule__Model__RulesAssignment_3 ) ) ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3606:3: ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) ) ) | ({...}? => ( ( ( rule__Model__RulesAssignment_3 ) ) ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3606:3: ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) ) ) | ({...}? => ( ( ( rule__Model__RulesAssignment_3 ) ) ) ) )
            int alt23=4;
            int LA23_0 = input.LA(1);

            if ( LA23_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt23=2;
            }
            else if ( LA23_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                alt23=3;
            }
            else if ( LA23_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {
                alt23=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3608:4: ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3608:4: ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3609:5: {...}? => ( ( ( rule__Model__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3609:100: ( ( ( rule__Model__Group_0__0 ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3610:6: ( ( rule__Model__Group_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3616:6: ( ( rule__Model__Group_0__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3618:7: ( rule__Model__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getGroup_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3619:7: ( rule__Model__Group_0__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3619:8: rule__Model__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_0__0_in_rule__Model__UnorderedGroup__Impl7305);
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3625:4: ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3625:4: ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3626:5: {...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3626:100: ( ( ( rule__Model__BoardAssignment_1 ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3627:6: ( ( rule__Model__BoardAssignment_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3633:6: ( ( rule__Model__BoardAssignment_1 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3635:7: ( rule__Model__BoardAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getBoardAssignment_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3636:7: ( rule__Model__BoardAssignment_1 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3636:8: rule__Model__BoardAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__BoardAssignment_1_in_rule__Model__UnorderedGroup__Impl7396);
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3642:4: ({...}? => ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3642:4: ({...}? => ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3643:5: {...}? => ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2)");
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3643:100: ( ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3644:6: ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 2);
                    selected = true;
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3650:6: ( ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3651:6: ( ( rule__Model__TokensAssignment_2 ) ) ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3651:6: ( ( rule__Model__TokensAssignment_2 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3652:7: ( rule__Model__TokensAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getTokensAssignment_2()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3653:7: ( rule__Model__TokensAssignment_2 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3653:8: rule__Model__TokensAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__TokensAssignment_2_in_rule__Model__UnorderedGroup__Impl7488);
                    rule__Model__TokensAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getTokensAssignment_2()); 
                    }

                    }

                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3656:6: ( ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )* )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3657:7: ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getTokensAssignment_2()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3658:7: ( ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2 )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==11) ) {
                            int LA22_3 = input.LA(2);

                            if ( (synpred1_InternalBGL()) ) {
                                alt22=1;
                            }


                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3658:8: ( rule__Model__TokensAssignment_2 )=> rule__Model__TokensAssignment_2
                    	    {
                    	    pushFollow(FOLLOW_rule__Model__TokensAssignment_2_in_rule__Model__UnorderedGroup__Impl7532);
                    	    rule__Model__TokensAssignment_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3664:4: ({...}? => ( ( ( rule__Model__RulesAssignment_3 ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3664:4: ({...}? => ( ( ( rule__Model__RulesAssignment_3 ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3665:5: {...}? => ( ( ( rule__Model__RulesAssignment_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3)");
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3665:100: ( ( ( rule__Model__RulesAssignment_3 ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3666:6: ( ( rule__Model__RulesAssignment_3 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 3);
                    selected = true;
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3672:6: ( ( rule__Model__RulesAssignment_3 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3674:7: ( rule__Model__RulesAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getRulesAssignment_3()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3675:7: ( rule__Model__RulesAssignment_3 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3675:8: rule__Model__RulesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Model__RulesAssignment_3_in_rule__Model__UnorderedGroup__Impl7630);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3690:1: rule__Model__UnorderedGroup__0 : rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )? ;
    public final void rule__Model__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3694:1: ( rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )? )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3695:2: rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__07689);
            rule__Model__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3696:2: ( rule__Model__UnorderedGroup__1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                alt24=1;
            }
            else if ( LA24_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3696:2: rule__Model__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__Model__UnorderedGroup__1_in_rule__Model__UnorderedGroup__07692);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3703:1: rule__Model__UnorderedGroup__1 : rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__2 )? ;
    public final void rule__Model__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3707:1: ( rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__2 )? )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3708:2: rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__17717);
            rule__Model__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3709:2: ( rule__Model__UnorderedGroup__2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt25=1;
            }
            else if ( LA25_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                alt25=1;
            }
            else if ( LA25_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3709:2: rule__Model__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_rule__Model__UnorderedGroup__2_in_rule__Model__UnorderedGroup__17720);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3716:1: rule__Model__UnorderedGroup__2 : rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__3 )? ;
    public final void rule__Model__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3720:1: ( rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__3 )? )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3721:2: rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__27745);
            rule__Model__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3722:2: ( rule__Model__UnorderedGroup__3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt26=1;
            }
            else if ( LA26_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                alt26=1;
            }
            else if ( LA26_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3722:2: rule__Model__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_rule__Model__UnorderedGroup__3_in_rule__Model__UnorderedGroup__27748);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3729:1: rule__Model__UnorderedGroup__3 : rule__Model__UnorderedGroup__Impl ;
    public final void rule__Model__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3733:1: ( rule__Model__UnorderedGroup__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3734:2: rule__Model__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__37773);
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


    // $ANTLR start "rule__Model__NameAssignment_0_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3749:1: rule__Model__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3753:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3754:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3754:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3755:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_0_17809); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3764:1: rule__Model__PlayerAssignment_0_2 : ( rulePlayer ) ;
    public final void rule__Model__PlayerAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3768:1: ( ( rulePlayer ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3769:1: ( rulePlayer )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3769:1: ( rulePlayer )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3770:1: rulePlayer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPlayerPlayerParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePlayer_in_rule__Model__PlayerAssignment_0_27840);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3779:1: rule__Model__BoardAssignment_1 : ( ruleBoard ) ;
    public final void rule__Model__BoardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3783:1: ( ( ruleBoard ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3784:1: ( ruleBoard )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3784:1: ( ruleBoard )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3785:1: ruleBoard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getBoardBoardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleBoard_in_rule__Model__BoardAssignment_17871);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3794:1: rule__Model__TokensAssignment_2 : ( ruleToken ) ;
    public final void rule__Model__TokensAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3798:1: ( ( ruleToken ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3799:1: ( ruleToken )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3799:1: ( ruleToken )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3800:1: ruleToken
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getTokensTokenParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleToken_in_rule__Model__TokensAssignment_27902);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3809:1: rule__Model__RulesAssignment_3 : ( ruleRules ) ;
    public final void rule__Model__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3813:1: ( ( ruleRules ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3814:1: ( ruleRules )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3814:1: ( ruleRules )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3815:1: ruleRules
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRulesRulesParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleRules_in_rule__Model__RulesAssignment_37933);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3824:1: rule__Player__NameAssignment_0 : ( ( 'PLAYERS' ) ) ;
    public final void rule__Player__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3828:1: ( ( ( 'PLAYERS' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3829:1: ( ( 'PLAYERS' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3829:1: ( ( 'PLAYERS' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3830:1: ( 'PLAYERS' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getNamePLAYERSKeyword_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3831:1: ( 'PLAYERS' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3832:1: 'PLAYERS'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getNamePLAYERSKeyword_0_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Player__NameAssignment_07969); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3847:1: rule__Player__PlayercountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Player__PlayercountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3851:1: ( ( RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3852:1: ( RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3852:1: ( RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3853:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getPlayercountINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Player__PlayercountAssignment_18008); if (state.failed) return ;
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


    // $ANTLR start "rule__Player__VariablesAssignment_3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3862:1: rule__Player__VariablesAssignment_3 : ( ruleSimpleAssignment ) ;
    public final void rule__Player__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3866:1: ( ( ruleSimpleAssignment ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3867:1: ( ruleSimpleAssignment )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3867:1: ( ruleSimpleAssignment )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3868:1: ruleSimpleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getVariablesSimpleAssignmentParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleAssignment_in_rule__Player__VariablesAssignment_38039);
            ruleSimpleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getVariablesSimpleAssignmentParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Player__VariablesAssignment_3"


    // $ANTLR start "rule__Board__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3877:1: rule__Board__NameAssignment_0 : ( ( 'BOARD' ) ) ;
    public final void rule__Board__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3881:1: ( ( ( 'BOARD' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3882:1: ( ( 'BOARD' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3882:1: ( ( 'BOARD' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3883:1: ( 'BOARD' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getNameBOARDKeyword_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3884:1: ( 'BOARD' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3885:1: 'BOARD'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getNameBOARDKeyword_0_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Board__NameAssignment_08075); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getNameBOARDKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getNameBOARDKeyword_0_0()); 
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
    // $ANTLR end "rule__Board__NameAssignment_0"


    // $ANTLR start "rule__Board__VariablesAssignment_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3900:1: rule__Board__VariablesAssignment_2 : ( ruleSimpleAssignment ) ;
    public final void rule__Board__VariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3904:1: ( ( ruleSimpleAssignment ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3905:1: ( ruleSimpleAssignment )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3905:1: ( ruleSimpleAssignment )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3906:1: ruleSimpleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getVariablesSimpleAssignmentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleAssignment_in_rule__Board__VariablesAssignment_28114);
            ruleSimpleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getVariablesSimpleAssignmentParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Board__VariablesAssignment_2"


    // $ANTLR start "rule__Board__FieldsAssignment_3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3915:1: rule__Board__FieldsAssignment_3 : ( ruleField ) ;
    public final void rule__Board__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3919:1: ( ( ruleField ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3920:1: ( ruleField )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3920:1: ( ruleField )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3921:1: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getFieldsFieldParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleField_in_rule__Board__FieldsAssignment_38145);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getFieldsFieldParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Board__FieldsAssignment_3"


    // $ANTLR start "rule__Rules__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3930:1: rule__Rules__NameAssignment_0 : ( ( 'RULES' ) ) ;
    public final void rule__Rules__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3934:1: ( ( ( 'RULES' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3935:1: ( ( 'RULES' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3935:1: ( ( 'RULES' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3936:1: ( 'RULES' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesAccess().getNameRULESKeyword_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3937:1: ( 'RULES' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3938:1: 'RULES'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesAccess().getNameRULESKeyword_0_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Rules__NameAssignment_08181); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3953:1: rule__Rules__TurnrulesAssignment_2 : ( ruleTurnRules ) ;
    public final void rule__Rules__TurnrulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3957:1: ( ( ruleTurnRules ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3958:1: ( ruleTurnRules )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3958:1: ( ruleTurnRules )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3959:1: ruleTurnRules
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulesAccess().getTurnrulesTurnRulesParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTurnRules_in_rule__Rules__TurnrulesAssignment_28220);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3968:1: rule__TurnRules__NameAssignment_0 : ( ( 'TURN' ) ) ;
    public final void rule__TurnRules__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3972:1: ( ( ( 'TURN' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3973:1: ( ( 'TURN' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3973:1: ( ( 'TURN' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3974:1: ( 'TURN' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesAccess().getNameTURNKeyword_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3975:1: ( 'TURN' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3976:1: 'TURN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesAccess().getNameTURNKeyword_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__TurnRules__NameAssignment_08256); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3991:1: rule__TurnRules__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__TurnRules__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3995:1: ( ( ruleAction ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3996:1: ( ruleAction )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3996:1: ( ruleAction )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3997:1: ruleAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTurnRulesAccess().getActionsActionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAction_in_rule__TurnRules__ActionsAssignment_28295);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4006:1: rule__Token__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Token__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4010:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4011:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4011:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4012:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Token__NameAssignment_18326); if (state.failed) return ;
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


    // $ANTLR start "rule__Token__VariablesAssignment_3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4021:1: rule__Token__VariablesAssignment_3 : ( ruleSimpleAssignment ) ;
    public final void rule__Token__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4025:1: ( ( ruleSimpleAssignment ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4026:1: ( ruleSimpleAssignment )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4026:1: ( ruleSimpleAssignment )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4027:1: ruleSimpleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenAccess().getVariablesSimpleAssignmentParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleAssignment_in_rule__Token__VariablesAssignment_38357);
            ruleSimpleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenAccess().getVariablesSimpleAssignmentParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Token__VariablesAssignment_3"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4036:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4040:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4041:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4041:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4042:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_08388); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4051:1: rule__Field__XAssignment_2 : ( RULE_INT ) ;
    public final void rule__Field__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4055:1: ( ( RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4056:1: ( RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4056:1: ( RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4057:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getXINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__XAssignment_28419); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4066:1: rule__Field__YAssignment_4 : ( RULE_INT ) ;
    public final void rule__Field__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4070:1: ( ( RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4071:1: ( RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4071:1: ( RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4072:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getYINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__YAssignment_48450); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4081:1: rule__Field__ZAssignment_6 : ( RULE_INT ) ;
    public final void rule__Field__ZAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4085:1: ( ( RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4086:1: ( RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4086:1: ( RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4087:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getZINTTerminalRuleCall_6_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__ZAssignment_68481); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4096:1: rule__Field__NeighboursAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Field__NeighboursAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4100:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4101:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4101:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4102:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNeighboursFieldCrossReference_9_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4103:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4104:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNeighboursFieldIDTerminalRuleCall_9_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NeighboursAssignment_98516); if (state.failed) return ;
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


    // $ANTLR start "rule__Field__VariablesAssignment_10"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4115:1: rule__Field__VariablesAssignment_10 : ( ruleSimpleAssignment ) ;
    public final void rule__Field__VariablesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4119:1: ( ( ruleSimpleAssignment ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4120:1: ( ruleSimpleAssignment )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4120:1: ( ruleSimpleAssignment )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4121:1: ruleSimpleAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getVariablesSimpleAssignmentParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleAssignment_in_rule__Field__VariablesAssignment_108551);
            ruleSimpleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getVariablesSimpleAssignmentParserRuleCall_10_0()); 
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
    // $ANTLR end "rule__Field__VariablesAssignment_10"


    // $ANTLR start "rule__Action__NameAssignment_0_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4130:1: rule__Action__NameAssignment_0_0 : ( ( 'SPAWN' ) ) ;
    public final void rule__Action__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4134:1: ( ( ( 'SPAWN' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4135:1: ( ( 'SPAWN' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4135:1: ( ( 'SPAWN' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4136:1: ( 'SPAWN' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameSPAWNKeyword_0_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4137:1: ( 'SPAWN' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4138:1: 'SPAWN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameSPAWNKeyword_0_0_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Action__NameAssignment_0_08587); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4153:1: rule__Action__TokenAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Action__TokenAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4157:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4158:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4158:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4159:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTokenTokenCrossReference_0_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4160:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4161:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getTokenTokenIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__TokenAssignment_0_18630); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4172:1: rule__Action__NameAssignment_1 : ( ( 'MOVE' ) ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4176:1: ( ( ( 'MOVE' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4177:1: ( ( 'MOVE' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4177:1: ( ( 'MOVE' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4178:1: ( 'MOVE' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameMOVEKeyword_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4179:1: ( 'MOVE' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4180:1: 'MOVE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameMOVEKeyword_1_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Action__NameAssignment_18670); if (state.failed) return ;
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


    // $ANTLR start "rule__Action__NameAssignment_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4195:1: rule__Action__NameAssignment_2 : ( ( 'DESTROY' ) ) ;
    public final void rule__Action__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4199:1: ( ( ( 'DESTROY' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4200:1: ( ( 'DESTROY' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4200:1: ( ( 'DESTROY' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4201:1: ( 'DESTROY' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameDESTROYKeyword_2_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4202:1: ( 'DESTROY' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4203:1: 'DESTROY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameDESTROYKeyword_2_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Action__NameAssignment_28714); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getNameDESTROYKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getNameDESTROYKeyword_2_0()); 
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
    // $ANTLR end "rule__Action__NameAssignment_2"


    // $ANTLR start "rule__Action__NameAssignment_3_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4218:1: rule__Action__NameAssignment_3_0 : ( ( 'SELECT' ) ) ;
    public final void rule__Action__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4222:1: ( ( ( 'SELECT' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4223:1: ( ( 'SELECT' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4223:1: ( ( 'SELECT' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4224:1: ( 'SELECT' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameSELECTKeyword_3_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4225:1: ( 'SELECT' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4226:1: 'SELECT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getNameSELECTKeyword_3_0_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__Action__NameAssignment_3_08758); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getNameSELECTKeyword_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getNameSELECTKeyword_3_0_0()); 
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
    // $ANTLR end "rule__Action__NameAssignment_3_0"


    // $ANTLR start "rule__Action__ObjectOfSelectAssignment_3_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4241:1: rule__Action__ObjectOfSelectAssignment_3_1 : ( ( rule__Action__ObjectOfSelectAlternatives_3_1_0 ) ) ;
    public final void rule__Action__ObjectOfSelectAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4245:1: ( ( ( rule__Action__ObjectOfSelectAlternatives_3_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4246:1: ( ( rule__Action__ObjectOfSelectAlternatives_3_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4246:1: ( ( rule__Action__ObjectOfSelectAlternatives_3_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4247:1: ( rule__Action__ObjectOfSelectAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getObjectOfSelectAlternatives_3_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4248:1: ( rule__Action__ObjectOfSelectAlternatives_3_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4248:2: rule__Action__ObjectOfSelectAlternatives_3_1_0
            {
            pushFollow(FOLLOW_rule__Action__ObjectOfSelectAlternatives_3_1_0_in_rule__Action__ObjectOfSelectAssignment_3_18797);
            rule__Action__ObjectOfSelectAlternatives_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getObjectOfSelectAlternatives_3_1_0()); 
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
    // $ANTLR end "rule__Action__ObjectOfSelectAssignment_3_1"


    // $ANTLR start "rule__Action__FilterAssignment_3_3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4257:1: rule__Action__FilterAssignment_3_3 : ( ruleOrExp ) ;
    public final void rule__Action__FilterAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4261:1: ( ( ruleOrExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4262:1: ( ruleOrExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4262:1: ( ruleOrExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4263:1: ruleOrExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getFilterOrExpParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_ruleOrExp_in_rule__Action__FilterAssignment_3_38830);
            ruleOrExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getFilterOrExpParserRuleCall_3_3_0()); 
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
    // $ANTLR end "rule__Action__FilterAssignment_3_3"


    // $ANTLR start "rule__Action__AssignmentAssignment_4"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4272:1: rule__Action__AssignmentAssignment_4 : ( ruleValueAssignment ) ;
    public final void rule__Action__AssignmentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4276:1: ( ( ruleValueAssignment ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4277:1: ( ruleValueAssignment )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4277:1: ( ruleValueAssignment )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4278:1: ruleValueAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getAssignmentValueAssignmentParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleValueAssignment_in_rule__Action__AssignmentAssignment_48861);
            ruleValueAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getAssignmentValueAssignmentParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Action__AssignmentAssignment_4"


    // $ANTLR start "rule__Action__GotoConditionAssignment_5"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4287:1: rule__Action__GotoConditionAssignment_5 : ( ruleGotoCondition ) ;
    public final void rule__Action__GotoConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4291:1: ( ( ruleGotoCondition ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4292:1: ( ruleGotoCondition )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4292:1: ( ruleGotoCondition )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4293:1: ruleGotoCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGotoConditionGotoConditionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleGotoCondition_in_rule__Action__GotoConditionAssignment_58892);
            ruleGotoCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getGotoConditionGotoConditionParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Action__GotoConditionAssignment_5"


    // $ANTLR start "rule__Action__LabelAssignment_6"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4302:1: rule__Action__LabelAssignment_6 : ( ruleLabel ) ;
    public final void rule__Action__LabelAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4306:1: ( ( ruleLabel ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4307:1: ( ruleLabel )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4307:1: ( ruleLabel )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4308:1: ruleLabel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getLabelLabelParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleLabel_in_rule__Action__LabelAssignment_68923);
            ruleLabel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getLabelLabelParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Action__LabelAssignment_6"


    // $ANTLR start "rule__OrExp__ExpressionsAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4317:1: rule__OrExp__ExpressionsAssignment_0 : ( ruleAndExp ) ;
    public final void rule__OrExp__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4321:1: ( ( ruleAndExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4322:1: ( ruleAndExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4322:1: ( ruleAndExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4323:1: ruleAndExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getExpressionsAndExpParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAndExp_in_rule__OrExp__ExpressionsAssignment_08954);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4332:1: rule__OrExp__OperatorsAssignment_1_0 : ( ( 'OR' ) ) ;
    public final void rule__OrExp__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4336:1: ( ( ( 'OR' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4337:1: ( ( 'OR' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4337:1: ( ( 'OR' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4338:1: ( 'OR' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getOperatorsORKeyword_1_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4339:1: ( 'OR' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4340:1: 'OR'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getOperatorsORKeyword_1_0_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__OrExp__OperatorsAssignment_1_08990); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4355:1: rule__OrExp__ExpressionsAssignment_1_1 : ( ruleAndExp ) ;
    public final void rule__OrExp__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4359:1: ( ( ruleAndExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4360:1: ( ruleAndExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4360:1: ( ruleAndExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4361:1: ruleAndExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpAccess().getExpressionsAndExpParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAndExp_in_rule__OrExp__ExpressionsAssignment_1_19029);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4370:1: rule__AndExp__ExpressionsAssignment_0 : ( ruleBooleanExp ) ;
    public final void rule__AndExp__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4374:1: ( ( ruleBooleanExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4375:1: ( ruleBooleanExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4375:1: ( ruleBooleanExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4376:1: ruleBooleanExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getExpressionsBooleanExpParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExp_in_rule__AndExp__ExpressionsAssignment_09060);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4385:1: rule__AndExp__OperatorsAssignment_1_0 : ( ( 'AND' ) ) ;
    public final void rule__AndExp__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4389:1: ( ( ( 'AND' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4390:1: ( ( 'AND' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4390:1: ( ( 'AND' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4391:1: ( 'AND' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getOperatorsANDKeyword_1_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4392:1: ( 'AND' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4393:1: 'AND'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getOperatorsANDKeyword_1_0_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__AndExp__OperatorsAssignment_1_09096); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4408:1: rule__AndExp__ExpressionsAssignment_1_1 : ( ruleBooleanExp ) ;
    public final void rule__AndExp__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4412:1: ( ( ruleBooleanExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4413:1: ( ruleBooleanExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4413:1: ( ruleBooleanExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4414:1: ruleBooleanExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpAccess().getExpressionsBooleanExpParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBooleanExp_in_rule__AndExp__ExpressionsAssignment_1_19135);
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


    // $ANTLR start "rule__BooleanExp__NotAssignment_0_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4423:1: rule__BooleanExp__NotAssignment_0_0 : ( ( 'NOT' ) ) ;
    public final void rule__BooleanExp__NotAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4427:1: ( ( ( 'NOT' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4428:1: ( ( 'NOT' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4428:1: ( ( 'NOT' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4429:1: ( 'NOT' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getNotNOTKeyword_0_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4430:1: ( 'NOT' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4431:1: 'NOT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getNotNOTKeyword_0_0_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__BooleanExp__NotAssignment_0_09171); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getNotNOTKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getNotNOTKeyword_0_0_0()); 
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
    // $ANTLR end "rule__BooleanExp__NotAssignment_0_0"


    // $ANTLR start "rule__BooleanExp__LeftAssignment_0_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4446:1: rule__BooleanExp__LeftAssignment_0_1_0 : ( ruleAttributeOrInt ) ;
    public final void rule__BooleanExp__LeftAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4450:1: ( ( ruleAttributeOrInt ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4451:1: ( ruleAttributeOrInt )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4451:1: ( ruleAttributeOrInt )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4452:1: ruleAttributeOrInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getLeftAttributeOrIntParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeOrInt_in_rule__BooleanExp__LeftAssignment_0_1_09210);
            ruleAttributeOrInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getLeftAttributeOrIntParserRuleCall_0_1_0_0()); 
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
    // $ANTLR end "rule__BooleanExp__LeftAssignment_0_1_0"


    // $ANTLR start "rule__BooleanExp__NameAssignment_0_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4461:1: rule__BooleanExp__NameAssignment_0_1_1 : ( ( rule__BooleanExp__NameAlternatives_0_1_1_0 ) ) ;
    public final void rule__BooleanExp__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4465:1: ( ( ( rule__BooleanExp__NameAlternatives_0_1_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4466:1: ( ( rule__BooleanExp__NameAlternatives_0_1_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4466:1: ( ( rule__BooleanExp__NameAlternatives_0_1_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4467:1: ( rule__BooleanExp__NameAlternatives_0_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getNameAlternatives_0_1_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4468:1: ( rule__BooleanExp__NameAlternatives_0_1_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4468:2: rule__BooleanExp__NameAlternatives_0_1_1_0
            {
            pushFollow(FOLLOW_rule__BooleanExp__NameAlternatives_0_1_1_0_in_rule__BooleanExp__NameAssignment_0_1_19241);
            rule__BooleanExp__NameAlternatives_0_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getNameAlternatives_0_1_1_0()); 
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
    // $ANTLR end "rule__BooleanExp__NameAssignment_0_1_1"


    // $ANTLR start "rule__BooleanExp__RightAssignment_0_1_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4477:1: rule__BooleanExp__RightAssignment_0_1_2 : ( ruleAttributeOrInt ) ;
    public final void rule__BooleanExp__RightAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4481:1: ( ( ruleAttributeOrInt ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4482:1: ( ruleAttributeOrInt )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4482:1: ( ruleAttributeOrInt )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4483:1: ruleAttributeOrInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getRightAttributeOrIntParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeOrInt_in_rule__BooleanExp__RightAssignment_0_1_29274);
            ruleAttributeOrInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpAccess().getRightAttributeOrIntParserRuleCall_0_1_2_0()); 
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
    // $ANTLR end "rule__BooleanExp__RightAssignment_0_1_2"


    // $ANTLR start "rule__BooleanExp__NestedExpAssignment_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4492:1: rule__BooleanExp__NestedExpAssignment_1_1 : ( ruleOrExp ) ;
    public final void rule__BooleanExp__NestedExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4496:1: ( ( ruleOrExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4497:1: ( ruleOrExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4497:1: ( ruleOrExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4498:1: ruleOrExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpAccess().getNestedExpOrExpParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOrExp_in_rule__BooleanExp__NestedExpAssignment_1_19305);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4507:1: rule__AttributeName__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AttributeName__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4511:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4512:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4512:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4513:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeNameAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeName__NameAssignment_09336); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4522:1: rule__AttributeName__ParentAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__AttributeName__ParentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4526:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4527:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4527:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4528:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeNameAccess().getParentIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeName__ParentAssignment_1_09367); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4537:1: rule__AttributeName__ChildAssignment_1_2 : ( ruleAttributeName ) ;
    public final void rule__AttributeName__ChildAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4541:1: ( ( ruleAttributeName ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4542:1: ( ruleAttributeName )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4542:1: ( ruleAttributeName )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4543:1: ruleAttributeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeNameAccess().getChildAttributeNameParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeName_in_rule__AttributeName__ChildAssignment_1_29398);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4552:1: rule__AttributeOrInt__AttributeAssignment_0 : ( ruleAttributeName ) ;
    public final void rule__AttributeOrInt__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4556:1: ( ( ruleAttributeName ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4557:1: ( ruleAttributeName )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4557:1: ( ruleAttributeName )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4558:1: ruleAttributeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeOrIntAccess().getAttributeAttributeNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeName_in_rule__AttributeOrInt__AttributeAssignment_09429);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4567:1: rule__AttributeOrInt__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__AttributeOrInt__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4571:1: ( ( RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4572:1: ( RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4572:1: ( RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4573:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeOrIntAccess().getValueINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AttributeOrInt__ValueAssignment_19460); if (state.failed) return ;
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


    // $ANTLR start "rule__GotoCondition__ConditionAssignment_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4582:1: rule__GotoCondition__ConditionAssignment_1 : ( ruleOrExp ) ;
    public final void rule__GotoCondition__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4586:1: ( ( ruleOrExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4587:1: ( ruleOrExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4587:1: ( ruleOrExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4588:1: ruleOrExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGotoConditionAccess().getConditionOrExpParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleOrExp_in_rule__GotoCondition__ConditionAssignment_19491);
            ruleOrExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGotoConditionAccess().getConditionOrExpParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__GotoCondition__ConditionAssignment_1"


    // $ANTLR start "rule__GotoCondition__NameAssignment_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4597:1: rule__GotoCondition__NameAssignment_2 : ( ( 'GOTO' ) ) ;
    public final void rule__GotoCondition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4601:1: ( ( ( 'GOTO' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4602:1: ( ( 'GOTO' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4602:1: ( ( 'GOTO' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4603:1: ( 'GOTO' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGotoConditionAccess().getNameGOTOKeyword_2_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4604:1: ( 'GOTO' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4605:1: 'GOTO'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGotoConditionAccess().getNameGOTOKeyword_2_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__GotoCondition__NameAssignment_29527); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGotoConditionAccess().getNameGOTOKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGotoConditionAccess().getNameGOTOKeyword_2_0()); 
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
    // $ANTLR end "rule__GotoCondition__NameAssignment_2"


    // $ANTLR start "rule__GotoCondition__GotoAssignment_3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4620:1: rule__GotoCondition__GotoAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__GotoCondition__GotoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4624:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4625:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4625:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4626:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGotoConditionAccess().getGotoLabelCrossReference_3_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4627:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4628:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGotoConditionAccess().getGotoLabelIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GotoCondition__GotoAssignment_39570); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGotoConditionAccess().getGotoLabelIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGotoConditionAccess().getGotoLabelCrossReference_3_0()); 
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
    // $ANTLR end "rule__GotoCondition__GotoAssignment_3"


    // $ANTLR start "rule__Label__NameAssignment_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4639:1: rule__Label__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Label__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4643:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4644:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4644:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4645:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Label__NameAssignment_19605); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Label__NameAssignment_1"


    // $ANTLR start "rule__AdditionExp__ExpressionsAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4654:1: rule__AdditionExp__ExpressionsAssignment_0 : ( ruleMultiplicationExp ) ;
    public final void rule__AdditionExp__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4658:1: ( ( ruleMultiplicationExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4659:1: ( ruleMultiplicationExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4659:1: ( ruleMultiplicationExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4660:1: ruleMultiplicationExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpAccess().getExpressionsMultiplicationExpParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExp_in_rule__AdditionExp__ExpressionsAssignment_09636);
            ruleMultiplicationExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpAccess().getExpressionsMultiplicationExpParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__AdditionExp__ExpressionsAssignment_0"


    // $ANTLR start "rule__AdditionExp__OperatorsAssignment_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4669:1: rule__AdditionExp__OperatorsAssignment_1_0 : ( ( rule__AdditionExp__OperatorsAlternatives_1_0_0 ) ) ;
    public final void rule__AdditionExp__OperatorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4673:1: ( ( ( rule__AdditionExp__OperatorsAlternatives_1_0_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4674:1: ( ( rule__AdditionExp__OperatorsAlternatives_1_0_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4674:1: ( ( rule__AdditionExp__OperatorsAlternatives_1_0_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4675:1: ( rule__AdditionExp__OperatorsAlternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpAccess().getOperatorsAlternatives_1_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4676:1: ( rule__AdditionExp__OperatorsAlternatives_1_0_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4676:2: rule__AdditionExp__OperatorsAlternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__AdditionExp__OperatorsAlternatives_1_0_0_in_rule__AdditionExp__OperatorsAssignment_1_09667);
            rule__AdditionExp__OperatorsAlternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpAccess().getOperatorsAlternatives_1_0_0()); 
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
    // $ANTLR end "rule__AdditionExp__OperatorsAssignment_1_0"


    // $ANTLR start "rule__AdditionExp__ExpressionsAssignment_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4685:1: rule__AdditionExp__ExpressionsAssignment_1_1 : ( ruleMultiplicationExp ) ;
    public final void rule__AdditionExp__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4689:1: ( ( ruleMultiplicationExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4690:1: ( ruleMultiplicationExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4690:1: ( ruleMultiplicationExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4691:1: ruleMultiplicationExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionExpAccess().getExpressionsMultiplicationExpParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExp_in_rule__AdditionExp__ExpressionsAssignment_1_19700);
            ruleMultiplicationExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionExpAccess().getExpressionsMultiplicationExpParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__AdditionExp__ExpressionsAssignment_1_1"


    // $ANTLR start "rule__MultiplicationExp__ExpressionsAssignment_0_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4700:1: rule__MultiplicationExp__ExpressionsAssignment_0_0 : ( ruleAttributeOrInt ) ;
    public final void rule__MultiplicationExp__ExpressionsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4704:1: ( ( ruleAttributeOrInt ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4705:1: ( ruleAttributeOrInt )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4705:1: ( ruleAttributeOrInt )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4706:1: ruleAttributeOrInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getExpressionsAttributeOrIntParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeOrInt_in_rule__MultiplicationExp__ExpressionsAssignment_0_09731);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4715:1: rule__MultiplicationExp__OperatorsAssignment_0_1_0 : ( ( rule__MultiplicationExp__OperatorsAlternatives_0_1_0_0 ) ) ;
    public final void rule__MultiplicationExp__OperatorsAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4719:1: ( ( ( rule__MultiplicationExp__OperatorsAlternatives_0_1_0_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4720:1: ( ( rule__MultiplicationExp__OperatorsAlternatives_0_1_0_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4720:1: ( ( rule__MultiplicationExp__OperatorsAlternatives_0_1_0_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4721:1: ( rule__MultiplicationExp__OperatorsAlternatives_0_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getOperatorsAlternatives_0_1_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4722:1: ( rule__MultiplicationExp__OperatorsAlternatives_0_1_0_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4722:2: rule__MultiplicationExp__OperatorsAlternatives_0_1_0_0
            {
            pushFollow(FOLLOW_rule__MultiplicationExp__OperatorsAlternatives_0_1_0_0_in_rule__MultiplicationExp__OperatorsAssignment_0_1_09762);
            rule__MultiplicationExp__OperatorsAlternatives_0_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getOperatorsAlternatives_0_1_0_0()); 
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


    // $ANTLR start "rule__MultiplicationExp__ExpressionsAssignment_0_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4731:1: rule__MultiplicationExp__ExpressionsAssignment_0_1_1 : ( ruleAttributeOrInt ) ;
    public final void rule__MultiplicationExp__ExpressionsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4735:1: ( ( ruleAttributeOrInt ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4736:1: ( ruleAttributeOrInt )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4736:1: ( ruleAttributeOrInt )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4737:1: ruleAttributeOrInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getExpressionsAttributeOrIntParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeOrInt_in_rule__MultiplicationExp__ExpressionsAssignment_0_1_19795);
            ruleAttributeOrInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getExpressionsAttributeOrIntParserRuleCall_0_1_1_0()); 
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
    // $ANTLR end "rule__MultiplicationExp__ExpressionsAssignment_0_1_1"


    // $ANTLR start "rule__MultiplicationExp__NestedExpAssignment_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4746:1: rule__MultiplicationExp__NestedExpAssignment_1_1 : ( ruleAdditionExp ) ;
    public final void rule__MultiplicationExp__NestedExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4750:1: ( ( ruleAdditionExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4751:1: ( ruleAdditionExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4751:1: ( ruleAdditionExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4752:1: ruleAdditionExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationExpAccess().getNestedExpAdditionExpParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAdditionExp_in_rule__MultiplicationExp__NestedExpAssignment_1_19826);
            ruleAdditionExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationExpAccess().getNestedExpAdditionExpParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__MultiplicationExp__NestedExpAssignment_1_1"


    // $ANTLR start "rule__ValueAssignment__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4761:1: rule__ValueAssignment__NameAssignment_0 : ( ruleAttributeName ) ;
    public final void rule__ValueAssignment__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4765:1: ( ( ruleAttributeName ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4766:1: ( ruleAttributeName )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4766:1: ( ruleAttributeName )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4767:1: ruleAttributeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAssignmentAccess().getNameAttributeNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeName_in_rule__ValueAssignment__NameAssignment_09857);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4776:1: rule__ValueAssignment__AdditionAssignment_2 : ( ruleAdditionExp ) ;
    public final void rule__ValueAssignment__AdditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4780:1: ( ( ruleAdditionExp ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4781:1: ( ruleAdditionExp )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4781:1: ( ruleAdditionExp )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4782:1: ruleAdditionExp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAssignmentAccess().getAdditionAdditionExpParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAdditionExp_in_rule__ValueAssignment__AdditionAssignment_29888);
            ruleAdditionExp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAssignmentAccess().getAdditionAdditionExpParserRuleCall_2_0()); 
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


    // $ANTLR start "rule__SimpleAssignment__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4791:1: rule__SimpleAssignment__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleAssignment__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4795:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4796:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4796:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4797:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAssignmentAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleAssignment__NameAssignment_09919); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAssignmentAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__SimpleAssignment__NameAssignment_0"


    // $ANTLR start "rule__SimpleAssignment__AttributeAssignment_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4806:1: rule__SimpleAssignment__AttributeAssignment_2 : ( ruleAttributeOrInt ) ;
    public final void rule__SimpleAssignment__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4810:1: ( ( ruleAttributeOrInt ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4811:1: ( ruleAttributeOrInt )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4811:1: ( ruleAttributeOrInt )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4812:1: ruleAttributeOrInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleAssignmentAccess().getAttributeAttributeOrIntParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeOrInt_in_rule__SimpleAssignment__AttributeAssignment_29950);
            ruleAttributeOrInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleAssignmentAccess().getAttributeAttributeOrIntParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__SimpleAssignment__AttributeAssignment_2"

    // $ANTLR start synpred1_InternalBGL
    public final void synpred1_InternalBGL_fragment() throws RecognitionException {   
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3658:8: ( rule__Model__TokensAssignment_2 )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3658:9: rule__Model__TokensAssignment_2
        {
        pushFollow(FOLLOW_rule__Model__TokensAssignment_2_in_synpred1_InternalBGL7529);
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
    public static final BitSet FOLLOW_rule__Board__Group__0_in_ruleBoard214 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleGotoCondition_in_entryRuleGotoCondition841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGotoCondition848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GotoCondition__Group__0_in_ruleGotoCondition874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0_in_ruleLabel934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExp_in_entryRuleAdditionExp961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExp968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExp__Group__0_in_ruleAdditionExp994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExp_in_entryRuleMultiplicationExp1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExp1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Alternatives_in_ruleMultiplicationExp1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueAssignment1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__0_in_ruleValueAssignment1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAssignment_in_entryRuleSimpleAssignment1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAssignment1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAssignment__Group__0_in_ruleSimpleAssignment1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_0__0_in_rule__Action__Alternatives1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Alternatives1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_2_in_rule__Action__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0_in_rule__Action__Alternatives1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__AssignmentAssignment_4_in_rule__Action__Alternatives1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__GotoConditionAssignment_5_in_rule__Action__Alternatives1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__LabelAssignment_6_in_rule__Action__Alternatives1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Action__ObjectOfSelectAlternatives_3_1_01352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Action__ObjectOfSelectAlternatives_3_1_01372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0__0_in_rule__BooleanExp__Alternatives1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_1__0_in_rule__BooleanExp__Alternatives1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BooleanExp__NameAlternatives_0_1_1_01458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BooleanExp__NameAlternatives_0_1_1_01478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BooleanExp__NameAlternatives_0_1_1_01498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BooleanExp__NameAlternatives_0_1_1_01518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BooleanExp__NameAlternatives_0_1_1_01538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BooleanExp__NameAlternatives_0_1_1_01558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BooleanExp__NameAlternatives_0_1_1_01578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BooleanExp__NameAlternatives_0_1_1_01598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__NameAssignment_0_in_rule__AttributeName__Alternatives1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__0_in_rule__AttributeName__Alternatives1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeOrInt__AttributeAssignment_0_in_rule__AttributeOrInt__Alternatives1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeOrInt__ValueAssignment_1_in_rule__AttributeOrInt__Alternatives1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AdditionExp__OperatorsAlternatives_1_0_01735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AdditionExp__OperatorsAlternatives_1_0_01755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0__0_in_rule__MultiplicationExp__Alternatives1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_1__0_in_rule__MultiplicationExp__Alternatives1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MultiplicationExp__OperatorsAlternatives_0_1_0_01841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MultiplicationExp__OperatorsAlternatives_0_1_0_01861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__01893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__01896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group_0__0__Impl1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__11955 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Model__Group_0__2_in_rule__Model__Group_0__11958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__2__Impl_in_rule__Model__Group_0__22015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PlayerAssignment_0_2_in_rule__Model__Group_0__2__Impl2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__Group__0__Impl_in_rule__Player__Group__02078 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Player__Group__1_in_rule__Player__Group__02081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__NameAssignment_0_in_rule__Player__Group__0__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__Group__1__Impl_in_rule__Player__Group__12138 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Player__Group__2_in_rule__Player__Group__12141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__PlayercountAssignment_1_in_rule__Player__Group__1__Impl2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__Group__2__Impl_in_rule__Player__Group__22198 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Player__Group__3_in_rule__Player__Group__22201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Player__Group__2__Impl2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__Group__3__Impl_in_rule__Player__Group__32260 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Player__Group__4_in_rule__Player__Group__32263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__VariablesAssignment_3_in_rule__Player__Group__3__Impl2290 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Player__Group__4__Impl_in_rule__Player__Group__42321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Player__Group__4__Impl2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__Group__0__Impl_in_rule__Board__Group__02390 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Board__Group__1_in_rule__Board__Group__02393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__NameAssignment_0_in_rule__Board__Group__0__Impl2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__Group__1__Impl_in_rule__Board__Group__12450 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Board__Group__2_in_rule__Board__Group__12453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Board__Group__1__Impl2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__Group__2__Impl_in_rule__Board__Group__22512 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Board__Group__3_in_rule__Board__Group__22515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__VariablesAssignment_2_in_rule__Board__Group__2__Impl2542 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Board__Group__3__Impl_in_rule__Board__Group__32573 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Board__Group__4_in_rule__Board__Group__32576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__FieldsAssignment_3_in_rule__Board__Group__3__Impl2603 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Board__Group__4__Impl_in_rule__Board__Group__42634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Board__Group__4__Impl2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__0__Impl_in_rule__Rules__Group__02703 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Rules__Group__1_in_rule__Rules__Group__02706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__NameAssignment_0_in_rule__Rules__Group__0__Impl2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__1__Impl_in_rule__Rules__Group__12763 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Rules__Group__2_in_rule__Rules__Group__12766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Rules__Group__1__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__2__Impl_in_rule__Rules__Group__22825 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Rules__Group__3_in_rule__Rules__Group__22828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__TurnrulesAssignment_2_in_rule__Rules__Group__2__Impl2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__3__Impl_in_rule__Rules__Group__32885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Rules__Group__3__Impl2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnRules__Group__0__Impl_in_rule__TurnRules__Group__02952 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TurnRules__Group__1_in_rule__TurnRules__Group__02955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnRules__NameAssignment_0_in_rule__TurnRules__Group__0__Impl2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnRules__Group__1__Impl_in_rule__TurnRules__Group__13012 = new BitSet(new long[]{0x00000F0608000010L});
    public static final BitSet FOLLOW_rule__TurnRules__Group__2_in_rule__TurnRules__Group__13015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TurnRules__Group__1__Impl3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnRules__Group__2__Impl_in_rule__TurnRules__Group__23074 = new BitSet(new long[]{0x00000F0608000010L});
    public static final BitSet FOLLOW_rule__TurnRules__Group__3_in_rule__TurnRules__Group__23077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnRules__ActionsAssignment_2_in_rule__TurnRules__Group__2__Impl3104 = new BitSet(new long[]{0x00000F0600000012L});
    public static final BitSet FOLLOW_rule__TurnRules__Group__3__Impl_in_rule__TurnRules__Group__33135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TurnRules__Group__3__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group__0__Impl_in_rule__Token__Group__03202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Token__Group__1_in_rule__Token__Group__03205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Token__Group__0__Impl3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group__1__Impl_in_rule__Token__Group__13264 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Token__Group__2_in_rule__Token__Group__13267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__NameAssignment_1_in_rule__Token__Group__1__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group__2__Impl_in_rule__Token__Group__23324 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Token__Group__3_in_rule__Token__Group__23327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Token__Group__2__Impl3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group__3__Impl_in_rule__Token__Group__33386 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Token__Group__4_in_rule__Token__Group__33389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__VariablesAssignment_3_in_rule__Token__Group__3__Impl3416 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Token__Group__4__Impl_in_rule__Token__Group__43447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Token__Group__4__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03516 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13576 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Field__Group__1__Impl3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23638 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__XAssignment_2_in_rule__Field__Group__2__Impl3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33698 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Field__Group__3__Impl3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43760 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__43763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__YAssignment_4_in_rule__Field__Group__4__Impl3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__53820 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__6_in_rule__Field__Group__53823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Field__Group__5__Impl3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__63882 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Field__Group__7_in_rule__Field__Group__63885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ZAssignment_6_in_rule__Field__Group__6__Impl3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__73942 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Field__Group__8_in_rule__Field__Group__73945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Field__Group__7__Impl3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__8__Impl_in_rule__Field__Group__84004 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Field__Group__9_in_rule__Field__Group__84007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Field__Group__8__Impl4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__9__Impl_in_rule__Field__Group__94066 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Field__Group__10_in_rule__Field__Group__94069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NeighboursAssignment_9_in_rule__Field__Group__9__Impl4096 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Field__Group__10__Impl_in_rule__Field__Group__104127 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Field__Group__11_in_rule__Field__Group__104130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__VariablesAssignment_10_in_rule__Field__Group__10__Impl4157 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Field__Group__11__Impl_in_rule__Field__Group__114188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Field__Group__11__Impl4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_0__0__Impl_in_rule__Action__Group_0__04271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group_0__1_in_rule__Action__Group_0__04274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_0_0_in_rule__Action__Group_0__0__Impl4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_0__1__Impl_in_rule__Action__Group_0__14331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TokenAssignment_0_1_in_rule__Action__Group_0__1__Impl4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__04392 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__04395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_3_0_in_rule__Action__Group_3__0__Impl4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__14452 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Action__Group_3__2_in_rule__Action__Group_3__14455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__ObjectOfSelectAssignment_3_1_in_rule__Action__Group_3__1__Impl4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__2__Impl_in_rule__Action__Group_3__24512 = new BitSet(new long[]{0x0000400010000030L});
    public static final BitSet FOLLOW_rule__Action__Group_3__3_in_rule__Action__Group_3__24515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Action__Group_3__2__Impl4543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__3__Impl_in_rule__Action__Group_3__34574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__FilterAssignment_3_3_in_rule__Action__Group_3__3__Impl4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__0__Impl_in_rule__OrExp__Group__04639 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__OrExp__Group__1_in_rule__OrExp__Group__04642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__ExpressionsAssignment_0_in_rule__OrExp__Group__0__Impl4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__1__Impl_in_rule__OrExp__Group__14699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__0_in_rule__OrExp__Group__1__Impl4726 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__0__Impl_in_rule__OrExp__Group_1__04761 = new BitSet(new long[]{0x0000400010000030L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__1_in_rule__OrExp__Group_1__04764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__OperatorsAssignment_1_0_in_rule__OrExp__Group_1__0__Impl4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__1__Impl_in_rule__OrExp__Group_1__14821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__ExpressionsAssignment_1_1_in_rule__OrExp__Group_1__1__Impl4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__04882 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__04885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__ExpressionsAssignment_0_in_rule__AndExp__Group__0__Impl4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__14942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__0_in_rule__AndExp__Group__1__Impl4969 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__0__Impl_in_rule__AndExp__Group_1__05004 = new BitSet(new long[]{0x0000400010000030L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__1_in_rule__AndExp__Group_1__05007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__OperatorsAssignment_1_0_in_rule__AndExp__Group_1__0__Impl5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__1__Impl_in_rule__AndExp__Group_1__15064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__ExpressionsAssignment_1_1_in_rule__AndExp__Group_1__1__Impl5091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0__0__Impl_in_rule__BooleanExp__Group_0__05125 = new BitSet(new long[]{0x0000400000000030L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0__1_in_rule__BooleanExp__Group_0__05128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__NotAssignment_0_0_in_rule__BooleanExp__Group_0__0__Impl5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0__1__Impl_in_rule__BooleanExp__Group_0__15186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0_1__0_in_rule__BooleanExp__Group_0__1__Impl5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0_1__0__Impl_in_rule__BooleanExp__Group_0_1__05247 = new BitSet(new long[]{0x00000000001FE000L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0_1__1_in_rule__BooleanExp__Group_0_1__05250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__LeftAssignment_0_1_0_in_rule__BooleanExp__Group_0_1__0__Impl5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0_1__1__Impl_in_rule__BooleanExp__Group_0_1__15307 = new BitSet(new long[]{0x0000400000000030L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0_1__2_in_rule__BooleanExp__Group_0_1__15310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__NameAssignment_0_1_1_in_rule__BooleanExp__Group_0_1__1__Impl5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_0_1__2__Impl_in_rule__BooleanExp__Group_0_1__25367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__RightAssignment_0_1_2_in_rule__BooleanExp__Group_0_1__2__Impl5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_1__0__Impl_in_rule__BooleanExp__Group_1__05430 = new BitSet(new long[]{0x0000400010000030L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_1__1_in_rule__BooleanExp__Group_1__05433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BooleanExp__Group_1__0__Impl5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_1__1__Impl_in_rule__BooleanExp__Group_1__15492 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_1__2_in_rule__BooleanExp__Group_1__15495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__NestedExpAssignment_1_1_in_rule__BooleanExp__Group_1__1__Impl5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__Group_1__2__Impl_in_rule__BooleanExp__Group_1__25552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BooleanExp__Group_1__2__Impl5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__0__Impl_in_rule__AttributeName__Group_1__05617 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__1_in_rule__AttributeName__Group_1__05620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__ParentAssignment_1_0_in_rule__AttributeName__Group_1__0__Impl5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__1__Impl_in_rule__AttributeName__Group_1__15677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__2_in_rule__AttributeName__Group_1__15680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AttributeName__Group_1__1__Impl5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__Group_1__2__Impl_in_rule__AttributeName__Group_1__25739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeName__ChildAssignment_1_2_in_rule__AttributeName__Group_1__2__Impl5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GotoCondition__Group__0__Impl_in_rule__GotoCondition__Group__05802 = new BitSet(new long[]{0x0000400010000030L});
    public static final BitSet FOLLOW_rule__GotoCondition__Group__1_in_rule__GotoCondition__Group__05805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__GotoCondition__Group__0__Impl5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GotoCondition__Group__1__Impl_in_rule__GotoCondition__Group__15864 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__GotoCondition__Group__2_in_rule__GotoCondition__Group__15867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GotoCondition__ConditionAssignment_1_in_rule__GotoCondition__Group__1__Impl5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GotoCondition__Group__2__Impl_in_rule__GotoCondition__Group__25924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GotoCondition__Group__3_in_rule__GotoCondition__Group__25927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GotoCondition__NameAssignment_2_in_rule__GotoCondition__Group__2__Impl5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GotoCondition__Group__3__Impl_in_rule__GotoCondition__Group__35984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GotoCondition__GotoAssignment_3_in_rule__GotoCondition__Group__3__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__06049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Label__Group__1_in_rule__Label__Group__06052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Label__Group__0__Impl6080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__16111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__NameAssignment_1_in_rule__Label__Group__1__Impl6138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExp__Group__0__Impl_in_rule__AdditionExp__Group__06172 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__AdditionExp__Group__1_in_rule__AdditionExp__Group__06175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExp__ExpressionsAssignment_0_in_rule__AdditionExp__Group__0__Impl6202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExp__Group__1__Impl_in_rule__AdditionExp__Group__16232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExp__Group_1__0_in_rule__AdditionExp__Group__1__Impl6259 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_rule__AdditionExp__Group_1__0__Impl_in_rule__AdditionExp__Group_1__06294 = new BitSet(new long[]{0x0000400010000030L});
    public static final BitSet FOLLOW_rule__AdditionExp__Group_1__1_in_rule__AdditionExp__Group_1__06297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExp__OperatorsAssignment_1_0_in_rule__AdditionExp__Group_1__0__Impl6324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExp__Group_1__1__Impl_in_rule__AdditionExp__Group_1__16354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExp__ExpressionsAssignment_1_1_in_rule__AdditionExp__Group_1__1__Impl6381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0__0__Impl_in_rule__MultiplicationExp__Group_0__06415 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0__1_in_rule__MultiplicationExp__Group_0__06418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__ExpressionsAssignment_0_0_in_rule__MultiplicationExp__Group_0__0__Impl6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0__1__Impl_in_rule__MultiplicationExp__Group_0__16475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0_1__0_in_rule__MultiplicationExp__Group_0__1__Impl6502 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0_1__0__Impl_in_rule__MultiplicationExp__Group_0_1__06537 = new BitSet(new long[]{0x0000400000000030L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0_1__1_in_rule__MultiplicationExp__Group_0_1__06540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__OperatorsAssignment_0_1_0_in_rule__MultiplicationExp__Group_0_1__0__Impl6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_0_1__1__Impl_in_rule__MultiplicationExp__Group_0_1__16597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__ExpressionsAssignment_0_1_1_in_rule__MultiplicationExp__Group_0_1__1__Impl6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_1__0__Impl_in_rule__MultiplicationExp__Group_1__06658 = new BitSet(new long[]{0x0000400010000030L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_1__1_in_rule__MultiplicationExp__Group_1__06661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MultiplicationExp__Group_1__0__Impl6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_1__1__Impl_in_rule__MultiplicationExp__Group_1__16720 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_1__2_in_rule__MultiplicationExp__Group_1__16723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__NestedExpAssignment_1_1_in_rule__MultiplicationExp__Group_1__1__Impl6750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__Group_1__2__Impl_in_rule__MultiplicationExp__Group_1__26780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MultiplicationExp__Group_1__2__Impl6808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__0__Impl_in_rule__ValueAssignment__Group__06845 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__1_in_rule__ValueAssignment__Group__06848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__NameAssignment_0_in_rule__ValueAssignment__Group__0__Impl6875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__1__Impl_in_rule__ValueAssignment__Group__16905 = new BitSet(new long[]{0x0000400010000030L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__2_in_rule__ValueAssignment__Group__16908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ValueAssignment__Group__1__Impl6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__Group__2__Impl_in_rule__ValueAssignment__Group__26967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueAssignment__AdditionAssignment_2_in_rule__ValueAssignment__Group__2__Impl6994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAssignment__Group__0__Impl_in_rule__SimpleAssignment__Group__07030 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SimpleAssignment__Group__1_in_rule__SimpleAssignment__Group__07033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAssignment__NameAssignment_0_in_rule__SimpleAssignment__Group__0__Impl7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAssignment__Group__1__Impl_in_rule__SimpleAssignment__Group__17090 = new BitSet(new long[]{0x0000400000000030L});
    public static final BitSet FOLLOW_rule__SimpleAssignment__Group__2_in_rule__SimpleAssignment__Group__17093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SimpleAssignment__Group__1__Impl7121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAssignment__Group__2__Impl_in_rule__SimpleAssignment__Group__27152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAssignment__AttributeAssignment_2_in_rule__SimpleAssignment__Group__2__Impl7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__0_in_rule__Model__UnorderedGroup7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0_in_rule__Model__UnorderedGroup__Impl7305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__BoardAssignment_1_in_rule__Model__UnorderedGroup__Impl7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TokensAssignment_2_in_rule__Model__UnorderedGroup__Impl7488 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Model__TokensAssignment_2_in_rule__Model__UnorderedGroup__Impl7532 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Model__RulesAssignment_3_in_rule__Model__UnorderedGroup__Impl7630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__07689 = new BitSet(new long[]{0x0000006002000802L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__1_in_rule__Model__UnorderedGroup__07692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__17717 = new BitSet(new long[]{0x0000006002000802L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__2_in_rule__Model__UnorderedGroup__17720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__27745 = new BitSet(new long[]{0x0000006002000802L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__3_in_rule__Model__UnorderedGroup__27748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__37773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_0_17809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlayer_in_rule__Model__PlayerAssignment_0_27840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoard_in_rule__Model__BoardAssignment_17871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_rule__Model__TokensAssignment_27902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRules_in_rule__Model__RulesAssignment_37933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Player__NameAssignment_07969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Player__PlayercountAssignment_18008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAssignment_in_rule__Player__VariablesAssignment_38039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Board__NameAssignment_08075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAssignment_in_rule__Board__VariablesAssignment_28114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Board__FieldsAssignment_38145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Rules__NameAssignment_08181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnRules_in_rule__Rules__TurnrulesAssignment_28220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TurnRules__NameAssignment_08256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__TurnRules__ActionsAssignment_28295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Token__NameAssignment_18326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAssignment_in_rule__Token__VariablesAssignment_38357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_08388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__XAssignment_28419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__YAssignment_48450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__ZAssignment_68481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NeighboursAssignment_98516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAssignment_in_rule__Field__VariablesAssignment_108551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Action__NameAssignment_0_08587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__TokenAssignment_0_18630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Action__NameAssignment_18670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Action__NameAssignment_28714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Action__NameAssignment_3_08758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__ObjectOfSelectAlternatives_3_1_0_in_rule__Action__ObjectOfSelectAssignment_3_18797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_rule__Action__FilterAssignment_3_38830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_rule__Action__AssignmentAssignment_48861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGotoCondition_in_rule__Action__GotoConditionAssignment_58892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Action__LabelAssignment_68923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_rule__OrExp__ExpressionsAssignment_08954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__OrExp__OperatorsAssignment_1_08990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_rule__OrExp__ExpressionsAssignment_1_19029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_rule__AndExp__ExpressionsAssignment_09060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__AndExp__OperatorsAssignment_1_09096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_rule__AndExp__ExpressionsAssignment_1_19135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__BooleanExp__NotAssignment_0_09171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_rule__BooleanExp__LeftAssignment_0_1_09210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExp__NameAlternatives_0_1_1_0_in_rule__BooleanExp__NameAssignment_0_1_19241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_rule__BooleanExp__RightAssignment_0_1_29274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_rule__BooleanExp__NestedExpAssignment_1_19305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeName__NameAssignment_09336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeName__ParentAssignment_1_09367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_rule__AttributeName__ChildAssignment_1_29398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_rule__AttributeOrInt__AttributeAssignment_09429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AttributeOrInt__ValueAssignment_19460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_rule__GotoCondition__ConditionAssignment_19491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__GotoCondition__NameAssignment_29527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GotoCondition__GotoAssignment_39570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Label__NameAssignment_19605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExp_in_rule__AdditionExp__ExpressionsAssignment_09636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExp__OperatorsAlternatives_1_0_0_in_rule__AdditionExp__OperatorsAssignment_1_09667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExp_in_rule__AdditionExp__ExpressionsAssignment_1_19700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_rule__MultiplicationExp__ExpressionsAssignment_0_09731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExp__OperatorsAlternatives_0_1_0_0_in_rule__MultiplicationExp__OperatorsAssignment_0_1_09762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_rule__MultiplicationExp__ExpressionsAssignment_0_1_19795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExp_in_rule__MultiplicationExp__NestedExpAssignment_1_19826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_rule__ValueAssignment__NameAssignment_09857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExp_in_rule__ValueAssignment__AdditionAssignment_29888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleAssignment__NameAssignment_09919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOrInt_in_rule__SimpleAssignment__AttributeAssignment_29950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TokensAssignment_2_in_synpred1_InternalBGL7529 = new BitSet(new long[]{0x0000000000000002L});

}
