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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'*'", "'/'", "'true'", "'false'", "'Game'", "'{'", "'}'", "';'", "'('", "','", "')'", "':'", "'='", "'+'", "'-'", "'!'", "'Players'", "'Board'", "'Tokens'", "'<'", "'=='"
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:62:1: ( ruleModel EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:70:1: ruleModel : ( ( rule__Model__UnorderedGroup ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:74:2: ( ( ( rule__Model__UnorderedGroup ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:75:1: ( ( rule__Model__UnorderedGroup ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:75:1: ( ( rule__Model__UnorderedGroup ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:76:1: ( rule__Model__UnorderedGroup )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getUnorderedGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:77:1: ( rule__Model__UnorderedGroup )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:77:2: rule__Model__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup_in_ruleModel100);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:89:1: entryRulePlayer : rulePlayer EOF ;
    public final void entryRulePlayer() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:90:1: ( rulePlayer EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:91:1: rulePlayer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerRule()); 
            }
            pushFollow(FOLLOW_rulePlayer_in_entryRulePlayer127);
            rulePlayer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlayer134); if (state.failed) return ;

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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:98:1: rulePlayer : ( ( rule__Player__Group__0 ) ) ;
    public final void rulePlayer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:102:2: ( ( ( rule__Player__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:103:1: ( ( rule__Player__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:103:1: ( ( rule__Player__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:104:1: ( rule__Player__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:105:1: ( rule__Player__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:105:2: rule__Player__Group__0
            {
            pushFollow(FOLLOW_rule__Player__Group__0_in_rulePlayer160);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:117:1: entryRuleBoard : ruleBoard EOF ;
    public final void entryRuleBoard() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:118:1: ( ruleBoard EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:119:1: ruleBoard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardRule()); 
            }
            pushFollow(FOLLOW_ruleBoard_in_entryRuleBoard187);
            ruleBoard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoard194); if (state.failed) return ;

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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:126:1: ruleBoard : ( ( rule__Board__UnorderedGroup ) ) ;
    public final void ruleBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:130:2: ( ( ( rule__Board__UnorderedGroup ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:131:1: ( ( rule__Board__UnorderedGroup ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:131:1: ( ( rule__Board__UnorderedGroup ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:132:1: ( rule__Board__UnorderedGroup )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getUnorderedGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:133:1: ( rule__Board__UnorderedGroup )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:133:2: rule__Board__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__Board__UnorderedGroup_in_ruleBoard220);
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


    // $ANTLR start "entryRuleTokens"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:145:1: entryRuleTokens : ruleTokens EOF ;
    public final void entryRuleTokens() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:146:1: ( ruleTokens EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:147:1: ruleTokens EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokensRule()); 
            }
            pushFollow(FOLLOW_ruleTokens_in_entryRuleTokens247);
            ruleTokens();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokensRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTokens254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTokens"


    // $ANTLR start "ruleTokens"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:154:1: ruleTokens : ( ( rule__Tokens__Group__0 ) ) ;
    public final void ruleTokens() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:158:2: ( ( ( rule__Tokens__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:159:1: ( ( rule__Tokens__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:159:1: ( ( rule__Tokens__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:160:1: ( rule__Tokens__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokensAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:161:1: ( rule__Tokens__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:161:2: rule__Tokens__Group__0
            {
            pushFollow(FOLLOW_rule__Tokens__Group__0_in_ruleTokens280);
            rule__Tokens__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokensAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTokens"


    // $ANTLR start "entryRuleTokenType"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:173:1: entryRuleTokenType : ruleTokenType EOF ;
    public final void entryRuleTokenType() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:174:1: ( ruleTokenType EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:175:1: ruleTokenType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTokenType_in_entryRuleTokenType307);
            ruleTokenType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTokenType314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTokenType"


    // $ANTLR start "ruleTokenType"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:182:1: ruleTokenType : ( ( rule__TokenType__Group__0 ) ) ;
    public final void ruleTokenType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:186:2: ( ( ( rule__TokenType__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:187:1: ( ( rule__TokenType__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:187:1: ( ( rule__TokenType__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:188:1: ( rule__TokenType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenTypeAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:189:1: ( rule__TokenType__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:189:2: rule__TokenType__Group__0
            {
            pushFollow(FOLLOW_rule__TokenType__Group__0_in_ruleTokenType340);
            rule__TokenType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTokenType"


    // $ANTLR start "entryRuleAttribute"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:201:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:202:1: ( ruleAttribute EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:203:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute367);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:210:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:214:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:215:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:215:1: ( ( rule__Attribute__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:216:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:217:1: ( rule__Attribute__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:217:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute400);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleField"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:229:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:230:1: ( ruleField EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:231:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField427);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField434); if (state.failed) return ;

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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:238:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:242:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:243:1: ( ( rule__Field__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:243:1: ( ( rule__Field__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:244:1: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:245:1: ( rule__Field__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:245:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField460);
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


    // $ANTLR start "entryRuleVariable"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:259:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:260:1: ( ruleVariable EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:261:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable489);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable496); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:268:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:272:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:273:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:273:1: ( ( rule__Variable__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:274:1: ( rule__Variable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:275:1: ( rule__Variable__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:275:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable522);
            rule__Variable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:287:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:288:1: ( ruleExpression EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:289:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression549);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression556); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:296:1: ruleExpression : ( ruleBooleanExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:300:2: ( ( ruleBooleanExpression ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:301:1: ( ruleBooleanExpression )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:301:1: ( ruleBooleanExpression )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:302:1: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleExpression582);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBooleanExpression"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:315:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:316:1: ( ruleBooleanExpression EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:317:1: ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression608);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression615); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:324:1: ruleBooleanExpression : ( ( rule__BooleanExpression__Group__0 ) ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:328:2: ( ( ( rule__BooleanExpression__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:329:1: ( ( rule__BooleanExpression__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:329:1: ( ( rule__BooleanExpression__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:330:1: ( rule__BooleanExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:331:1: ( rule__BooleanExpression__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:331:2: rule__BooleanExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Group__0_in_ruleBooleanExpression641);
            rule__BooleanExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleComparison"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:343:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:344:1: ( ruleComparison EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:345:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison668);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison675); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:352:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:356:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:357:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:357:1: ( ( rule__Comparison__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:358:1: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:359:1: ( rule__Comparison__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:359:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison701);
            rule__Comparison__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleEquals"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:371:1: entryRuleEquals : ruleEquals EOF ;
    public final void entryRuleEquals() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:372:1: ( ruleEquals EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:373:1: ruleEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsRule()); 
            }
            pushFollow(FOLLOW_ruleEquals_in_entryRuleEquals728);
            ruleEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquals735); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEquals"


    // $ANTLR start "ruleEquals"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:380:1: ruleEquals : ( ( rule__Equals__Group__0 ) ) ;
    public final void ruleEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:384:2: ( ( ( rule__Equals__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:385:1: ( ( rule__Equals__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:385:1: ( ( rule__Equals__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:386:1: ( rule__Equals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:387:1: ( rule__Equals__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:387:2: rule__Equals__Group__0
            {
            pushFollow(FOLLOW_rule__Equals__Group__0_in_ruleEquals761);
            rule__Equals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquals"


    // $ANTLR start "entryRuleAddition"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:399:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:400:1: ( ruleAddition EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:401:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition788);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition795); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:408:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:412:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:413:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:413:1: ( ( rule__Addition__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:414:1: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:415:1: ( rule__Addition__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:415:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition821);
            rule__Addition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:427:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:428:1: ( ruleMultiplication EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:429:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication848);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication855); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:436:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:440:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:441:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:441:1: ( ( rule__Multiplication__Group__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:442:1: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:443:1: ( rule__Multiplication__Group__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:443:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication881);
            rule__Multiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrefixed"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:455:1: entryRulePrefixed : rulePrefixed EOF ;
    public final void entryRulePrefixed() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:456:1: ( rulePrefixed EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:457:1: rulePrefixed EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedRule()); 
            }
            pushFollow(FOLLOW_rulePrefixed_in_entryRulePrefixed908);
            rulePrefixed();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefixed915); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrefixed"


    // $ANTLR start "rulePrefixed"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:464:1: rulePrefixed : ( ( rule__Prefixed__Alternatives ) ) ;
    public final void rulePrefixed() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:468:2: ( ( ( rule__Prefixed__Alternatives ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:469:1: ( ( rule__Prefixed__Alternatives ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:469:1: ( ( rule__Prefixed__Alternatives ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:470:1: ( rule__Prefixed__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getAlternatives()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:471:1: ( rule__Prefixed__Alternatives )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:471:2: rule__Prefixed__Alternatives
            {
            pushFollow(FOLLOW_rule__Prefixed__Alternatives_in_rulePrefixed941);
            rule__Prefixed__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefixed"


    // $ANTLR start "entryRuleAtomic"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:483:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:484:1: ( ruleAtomic EOF )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:485:1: ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic968);
            ruleAtomic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic975); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:492:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:496:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:497:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:497:1: ( ( rule__Atomic__Alternatives ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:498:1: ( rule__Atomic__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAlternatives()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:499:1: ( rule__Atomic__Alternatives )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:499:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1001);
            rule__Atomic__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "rule__BooleanExpression__OpAlternatives_1_0_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:514:1: rule__BooleanExpression__OpAlternatives_1_0_1_0 : ( ( '||' ) | ( '&&' ) );
    public final void rule__BooleanExpression__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:518:1: ( ( '||' ) | ( '&&' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:519:1: ( '||' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:519:1: ( '||' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:520:1: '||'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_0_1_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__BooleanExpression__OpAlternatives_1_0_1_01041); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:527:6: ( '&&' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:527:6: ( '&&' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:528:1: '&&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionAccess().getOpAmpersandAmpersandKeyword_1_0_1_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__BooleanExpression__OpAlternatives_1_0_1_01061); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionAccess().getOpAmpersandAmpersandKeyword_1_0_1_0_1()); 
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
    // $ANTLR end "rule__BooleanExpression__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:540:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:544:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:545:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:545:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:546:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:547:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:547:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01095);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:551:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:551:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:552:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:553:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:553:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01113);
                    rule__Addition__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
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
    // $ANTLR end "rule__Addition__Alternatives_1_0"


    // $ANTLR start "rule__Multiplication__OpAlternatives_1_0_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:562:1: rule__Multiplication__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:566:1: ( ( '*' ) | ( '/' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:567:1: ( '*' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:567:1: ( '*' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:568:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Multiplication__OpAlternatives_1_0_1_01147); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:575:6: ( '/' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:575:6: ( '/' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:576:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Multiplication__OpAlternatives_1_0_1_01167); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_0_1_0_1()); 
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
    // $ANTLR end "rule__Multiplication__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__Prefixed__Alternatives"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:588:1: rule__Prefixed__Alternatives : ( ( ( rule__Prefixed__Group_0__0 ) ) | ( ( rule__Prefixed__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Prefixed__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:592:1: ( ( ( rule__Prefixed__Group_0__0 ) ) | ( ( rule__Prefixed__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 27:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 15:
            case 16:
            case 21:
                {
                alt4=3;
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:593:1: ( ( rule__Prefixed__Group_0__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:593:1: ( ( rule__Prefixed__Group_0__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:594:1: ( rule__Prefixed__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixedAccess().getGroup_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:595:1: ( rule__Prefixed__Group_0__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:595:2: rule__Prefixed__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Prefixed__Group_0__0_in_rule__Prefixed__Alternatives1201);
                    rule__Prefixed__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixedAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:599:6: ( ( rule__Prefixed__Group_1__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:599:6: ( ( rule__Prefixed__Group_1__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:600:1: ( rule__Prefixed__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixedAccess().getGroup_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:601:1: ( rule__Prefixed__Group_1__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:601:2: rule__Prefixed__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Prefixed__Group_1__0_in_rule__Prefixed__Alternatives1219);
                    rule__Prefixed__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixedAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:605:6: ( ruleAtomic )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:605:6: ( ruleAtomic )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:606:1: ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixedAccess().getAtomicParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleAtomic_in_rule__Prefixed__Alternatives1237);
                    ruleAtomic();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixedAccess().getAtomicParserRuleCall_2()); 
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
    // $ANTLR end "rule__Prefixed__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:616:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:620:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case 15:
            case 16:
                {
                alt5=4;
                }
                break;
            case RULE_ID:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:621:1: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:621:1: ( ( rule__Atomic__Group_0__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:622:1: ( rule__Atomic__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:623:1: ( rule__Atomic__Group_0__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:623:2: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives1269);
                    rule__Atomic__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:627:6: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:627:6: ( ( rule__Atomic__Group_1__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:628:1: ( rule__Atomic__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:629:1: ( rule__Atomic__Group_1__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:629:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives1287);
                    rule__Atomic__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:633:6: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:633:6: ( ( rule__Atomic__Group_2__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:634:1: ( rule__Atomic__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:635:1: ( rule__Atomic__Group_2__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:635:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives1305);
                    rule__Atomic__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:639:6: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:639:6: ( ( rule__Atomic__Group_3__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:640:1: ( rule__Atomic__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:641:1: ( rule__Atomic__Group_3__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:641:2: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives1323);
                    rule__Atomic__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:645:6: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:645:6: ( ( rule__Atomic__Group_4__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:646:1: ( rule__Atomic__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:647:1: ( rule__Atomic__Group_4__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:647:2: rule__Atomic__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_4__0_in_rule__Atomic__Alternatives1341);
                    rule__Atomic__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_3_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:656:1: rule__Atomic__ValueAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:660:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:661:1: ( 'true' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:661:1: ( 'true' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:662:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Atomic__ValueAlternatives_3_1_01375); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:669:6: ( 'false' )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:669:6: ( 'false' )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:670:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getValueFalseKeyword_3_1_0_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Atomic__ValueAlternatives_3_1_01395); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getValueFalseKeyword_3_1_0_1()); 
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
    // $ANTLR end "rule__Atomic__ValueAlternatives_3_1_0"


    // $ANTLR start "rule__Model__Group_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:685:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:689:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:690:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__01428);
            rule__Model__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__01431);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:697:1: rule__Model__Group_0__0__Impl : ( 'Game' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:701:1: ( ( 'Game' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:702:1: ( 'Game' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:702:1: ( 'Game' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:703:1: 'Game'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGameKeyword_0_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Model__Group_0__0__Impl1459); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGameKeyword_0_0()); 
            }

            }


            }

        }
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:716:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl rule__Model__Group_0__2 ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:720:1: ( rule__Model__Group_0__1__Impl rule__Model__Group_0__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:721:2: rule__Model__Group_0__1__Impl rule__Model__Group_0__2
            {
            pushFollow(FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__11490);
            rule__Model__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_0__2_in_rule__Model__Group_0__11493);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:728:1: rule__Model__Group_0__1__Impl : ( ( rule__Model__NameAssignment_0_1 ) ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:732:1: ( ( ( rule__Model__NameAssignment_0_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:733:1: ( ( rule__Model__NameAssignment_0_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:733:1: ( ( rule__Model__NameAssignment_0_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:734:1: ( rule__Model__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_0_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:735:1: ( rule__Model__NameAssignment_0_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:735:2: rule__Model__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl1520);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:745:1: rule__Model__Group_0__2 : rule__Model__Group_0__2__Impl ;
    public final void rule__Model__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:749:1: ( rule__Model__Group_0__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:750:2: rule__Model__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_0__2__Impl_in_rule__Model__Group_0__21550);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:756:1: rule__Model__Group_0__2__Impl : ( ( rule__Model__PlayerAssignment_0_2 ) ) ;
    public final void rule__Model__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:760:1: ( ( ( rule__Model__PlayerAssignment_0_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:761:1: ( ( rule__Model__PlayerAssignment_0_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:761:1: ( ( rule__Model__PlayerAssignment_0_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:762:1: ( rule__Model__PlayerAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPlayerAssignment_0_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:763:1: ( rule__Model__PlayerAssignment_0_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:763:2: rule__Model__PlayerAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Model__PlayerAssignment_0_2_in_rule__Model__Group_0__2__Impl1577);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:779:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:783:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:784:2: rule__Player__Group__0__Impl rule__Player__Group__1
            {
            pushFollow(FOLLOW_rule__Player__Group__0__Impl_in_rule__Player__Group__01613);
            rule__Player__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Player__Group__1_in_rule__Player__Group__01616);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:791:1: rule__Player__Group__0__Impl : ( ( rule__Player__NameAssignment_0 ) ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:795:1: ( ( ( rule__Player__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:796:1: ( ( rule__Player__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:796:1: ( ( rule__Player__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:797:1: ( rule__Player__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:798:1: ( rule__Player__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:798:2: rule__Player__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Player__NameAssignment_0_in_rule__Player__Group__0__Impl1643);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:808:1: rule__Player__Group__1 : rule__Player__Group__1__Impl rule__Player__Group__2 ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:812:1: ( rule__Player__Group__1__Impl rule__Player__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:813:2: rule__Player__Group__1__Impl rule__Player__Group__2
            {
            pushFollow(FOLLOW_rule__Player__Group__1__Impl_in_rule__Player__Group__11673);
            rule__Player__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Player__Group__2_in_rule__Player__Group__11676);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:820:1: rule__Player__Group__1__Impl : ( ( rule__Player__PlayercountAssignment_1 ) ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:824:1: ( ( ( rule__Player__PlayercountAssignment_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:825:1: ( ( rule__Player__PlayercountAssignment_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:825:1: ( ( rule__Player__PlayercountAssignment_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:826:1: ( rule__Player__PlayercountAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getPlayercountAssignment_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:827:1: ( rule__Player__PlayercountAssignment_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:827:2: rule__Player__PlayercountAssignment_1
            {
            pushFollow(FOLLOW_rule__Player__PlayercountAssignment_1_in_rule__Player__Group__1__Impl1703);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:837:1: rule__Player__Group__2 : rule__Player__Group__2__Impl ;
    public final void rule__Player__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:841:1: ( rule__Player__Group__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:842:2: rule__Player__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Player__Group__2__Impl_in_rule__Player__Group__21733);
            rule__Player__Group__2__Impl();

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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:848:1: rule__Player__Group__2__Impl : ( ( rule__Player__Group_2__0 )? ) ;
    public final void rule__Player__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:852:1: ( ( ( rule__Player__Group_2__0 )? ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:853:1: ( ( rule__Player__Group_2__0 )? )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:853:1: ( ( rule__Player__Group_2__0 )? )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:854:1: ( rule__Player__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getGroup_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:855:1: ( rule__Player__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:855:2: rule__Player__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Player__Group_2__0_in_rule__Player__Group__2__Impl1760);
                    rule__Player__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getGroup_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Player__Group_2__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:871:1: rule__Player__Group_2__0 : rule__Player__Group_2__0__Impl rule__Player__Group_2__1 ;
    public final void rule__Player__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:875:1: ( rule__Player__Group_2__0__Impl rule__Player__Group_2__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:876:2: rule__Player__Group_2__0__Impl rule__Player__Group_2__1
            {
            pushFollow(FOLLOW_rule__Player__Group_2__0__Impl_in_rule__Player__Group_2__01797);
            rule__Player__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Player__Group_2__1_in_rule__Player__Group_2__01800);
            rule__Player__Group_2__1();

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
    // $ANTLR end "rule__Player__Group_2__0"


    // $ANTLR start "rule__Player__Group_2__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:883:1: rule__Player__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Player__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:887:1: ( ( '{' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:888:1: ( '{' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:888:1: ( '{' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:889:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_2_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Player__Group_2__0__Impl1828); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group_2__0__Impl"


    // $ANTLR start "rule__Player__Group_2__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:902:1: rule__Player__Group_2__1 : rule__Player__Group_2__1__Impl rule__Player__Group_2__2 ;
    public final void rule__Player__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:906:1: ( rule__Player__Group_2__1__Impl rule__Player__Group_2__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:907:2: rule__Player__Group_2__1__Impl rule__Player__Group_2__2
            {
            pushFollow(FOLLOW_rule__Player__Group_2__1__Impl_in_rule__Player__Group_2__11859);
            rule__Player__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Player__Group_2__2_in_rule__Player__Group_2__11862);
            rule__Player__Group_2__2();

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
    // $ANTLR end "rule__Player__Group_2__1"


    // $ANTLR start "rule__Player__Group_2__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:914:1: rule__Player__Group_2__1__Impl : ( ( rule__Player__AttributesAssignment_2_1 )* ) ;
    public final void rule__Player__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:918:1: ( ( ( rule__Player__AttributesAssignment_2_1 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:919:1: ( ( rule__Player__AttributesAssignment_2_1 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:919:1: ( ( rule__Player__AttributesAssignment_2_1 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:920:1: ( rule__Player__AttributesAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getAttributesAssignment_2_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:921:1: ( rule__Player__AttributesAssignment_2_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:921:2: rule__Player__AttributesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Player__AttributesAssignment_2_1_in_rule__Player__Group_2__1__Impl1889);
            	    rule__Player__AttributesAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getAttributesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group_2__1__Impl"


    // $ANTLR start "rule__Player__Group_2__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:931:1: rule__Player__Group_2__2 : rule__Player__Group_2__2__Impl ;
    public final void rule__Player__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:935:1: ( rule__Player__Group_2__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:936:2: rule__Player__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Player__Group_2__2__Impl_in_rule__Player__Group_2__21920);
            rule__Player__Group_2__2__Impl();

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
    // $ANTLR end "rule__Player__Group_2__2"


    // $ANTLR start "rule__Player__Group_2__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:942:1: rule__Player__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Player__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:946:1: ( ( '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:947:1: ( '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:947:1: ( '}' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:948:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_2_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__Player__Group_2__2__Impl1948); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group_2__2__Impl"


    // $ANTLR start "rule__Board__Group_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:967:1: rule__Board__Group_0__0 : rule__Board__Group_0__0__Impl rule__Board__Group_0__1 ;
    public final void rule__Board__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:971:1: ( rule__Board__Group_0__0__Impl rule__Board__Group_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:972:2: rule__Board__Group_0__0__Impl rule__Board__Group_0__1
            {
            pushFollow(FOLLOW_rule__Board__Group_0__0__Impl_in_rule__Board__Group_0__01985);
            rule__Board__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Board__Group_0__1_in_rule__Board__Group_0__01988);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:979:1: rule__Board__Group_0__0__Impl : ( ( rule__Board__NameAssignment_0_0 ) ) ;
    public final void rule__Board__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:983:1: ( ( ( rule__Board__NameAssignment_0_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:984:1: ( ( rule__Board__NameAssignment_0_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:984:1: ( ( rule__Board__NameAssignment_0_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:985:1: ( rule__Board__NameAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getNameAssignment_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:986:1: ( rule__Board__NameAssignment_0_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:986:2: rule__Board__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Board__NameAssignment_0_0_in_rule__Board__Group_0__0__Impl2015);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:996:1: rule__Board__Group_0__1 : rule__Board__Group_0__1__Impl rule__Board__Group_0__2 ;
    public final void rule__Board__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1000:1: ( rule__Board__Group_0__1__Impl rule__Board__Group_0__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1001:2: rule__Board__Group_0__1__Impl rule__Board__Group_0__2
            {
            pushFollow(FOLLOW_rule__Board__Group_0__1__Impl_in_rule__Board__Group_0__12045);
            rule__Board__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Board__Group_0__2_in_rule__Board__Group_0__12048);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1008:1: rule__Board__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Board__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1012:1: ( ( '{' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1013:1: ( '{' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1013:1: ( '{' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1014:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_0_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__Board__Group_0__1__Impl2076); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1027:1: rule__Board__Group_0__2 : rule__Board__Group_0__2__Impl ;
    public final void rule__Board__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1031:1: ( rule__Board__Group_0__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1032:2: rule__Board__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Board__Group_0__2__Impl_in_rule__Board__Group_0__22107);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1038:1: rule__Board__Group_0__2__Impl : ( ( rule__Board__FieldsAssignment_0_2 )* ) ;
    public final void rule__Board__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1042:1: ( ( ( rule__Board__FieldsAssignment_0_2 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1043:1: ( ( rule__Board__FieldsAssignment_0_2 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1043:1: ( ( rule__Board__FieldsAssignment_0_2 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1044:1: ( rule__Board__FieldsAssignment_0_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getFieldsAssignment_0_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1045:1: ( rule__Board__FieldsAssignment_0_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==21) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1045:2: rule__Board__FieldsAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_rule__Board__FieldsAssignment_0_2_in_rule__Board__Group_0__2__Impl2134);
            	    rule__Board__FieldsAssignment_0_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "rule__Board__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1061:1: rule__Board__Group_1__0 : rule__Board__Group_1__0__Impl rule__Board__Group_1__1 ;
    public final void rule__Board__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1065:1: ( rule__Board__Group_1__0__Impl rule__Board__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1066:2: rule__Board__Group_1__0__Impl rule__Board__Group_1__1
            {
            pushFollow(FOLLOW_rule__Board__Group_1__0__Impl_in_rule__Board__Group_1__02171);
            rule__Board__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Board__Group_1__1_in_rule__Board__Group_1__02174);
            rule__Board__Group_1__1();

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
    // $ANTLR end "rule__Board__Group_1__0"


    // $ANTLR start "rule__Board__Group_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1073:1: rule__Board__Group_1__0__Impl : ( ( rule__Board__AttributesAssignment_1_0 )* ) ;
    public final void rule__Board__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1077:1: ( ( ( rule__Board__AttributesAssignment_1_0 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1078:1: ( ( rule__Board__AttributesAssignment_1_0 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1078:1: ( ( rule__Board__AttributesAssignment_1_0 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1079:1: ( rule__Board__AttributesAssignment_1_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getAttributesAssignment_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1080:1: ( rule__Board__AttributesAssignment_1_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1080:2: rule__Board__AttributesAssignment_1_0
            	    {
            	    pushFollow(FOLLOW_rule__Board__AttributesAssignment_1_0_in_rule__Board__Group_1__0__Impl2201);
            	    rule__Board__AttributesAssignment_1_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getAttributesAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_1__0__Impl"


    // $ANTLR start "rule__Board__Group_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1090:1: rule__Board__Group_1__1 : rule__Board__Group_1__1__Impl ;
    public final void rule__Board__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1094:1: ( rule__Board__Group_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1095:2: rule__Board__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Board__Group_1__1__Impl_in_rule__Board__Group_1__12232);
            rule__Board__Group_1__1__Impl();

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
    // $ANTLR end "rule__Board__Group_1__1"


    // $ANTLR start "rule__Board__Group_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1101:1: rule__Board__Group_1__1__Impl : ( '}' ) ;
    public final void rule__Board__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1105:1: ( ( '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1106:1: ( '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1106:1: ( '}' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1107:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_1_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__Board__Group_1__1__Impl2260); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group_1__1__Impl"


    // $ANTLR start "rule__Tokens__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1124:1: rule__Tokens__Group__0 : rule__Tokens__Group__0__Impl rule__Tokens__Group__1 ;
    public final void rule__Tokens__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1128:1: ( rule__Tokens__Group__0__Impl rule__Tokens__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1129:2: rule__Tokens__Group__0__Impl rule__Tokens__Group__1
            {
            pushFollow(FOLLOW_rule__Tokens__Group__0__Impl_in_rule__Tokens__Group__02295);
            rule__Tokens__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tokens__Group__1_in_rule__Tokens__Group__02298);
            rule__Tokens__Group__1();

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
    // $ANTLR end "rule__Tokens__Group__0"


    // $ANTLR start "rule__Tokens__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1136:1: rule__Tokens__Group__0__Impl : ( ( rule__Tokens__NameAssignment_0 ) ) ;
    public final void rule__Tokens__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1140:1: ( ( ( rule__Tokens__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1141:1: ( ( rule__Tokens__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1141:1: ( ( rule__Tokens__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1142:1: ( rule__Tokens__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokensAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1143:1: ( rule__Tokens__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1143:2: rule__Tokens__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Tokens__NameAssignment_0_in_rule__Tokens__Group__0__Impl2325);
            rule__Tokens__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokensAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tokens__Group__0__Impl"


    // $ANTLR start "rule__Tokens__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1153:1: rule__Tokens__Group__1 : rule__Tokens__Group__1__Impl rule__Tokens__Group__2 ;
    public final void rule__Tokens__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1157:1: ( rule__Tokens__Group__1__Impl rule__Tokens__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1158:2: rule__Tokens__Group__1__Impl rule__Tokens__Group__2
            {
            pushFollow(FOLLOW_rule__Tokens__Group__1__Impl_in_rule__Tokens__Group__12355);
            rule__Tokens__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tokens__Group__2_in_rule__Tokens__Group__12358);
            rule__Tokens__Group__2();

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
    // $ANTLR end "rule__Tokens__Group__1"


    // $ANTLR start "rule__Tokens__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1165:1: rule__Tokens__Group__1__Impl : ( '{' ) ;
    public final void rule__Tokens__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1169:1: ( ( '{' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1170:1: ( '{' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1170:1: ( '{' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1171:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokensAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__Tokens__Group__1__Impl2386); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokensAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tokens__Group__1__Impl"


    // $ANTLR start "rule__Tokens__Group__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1184:1: rule__Tokens__Group__2 : rule__Tokens__Group__2__Impl rule__Tokens__Group__3 ;
    public final void rule__Tokens__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1188:1: ( rule__Tokens__Group__2__Impl rule__Tokens__Group__3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1189:2: rule__Tokens__Group__2__Impl rule__Tokens__Group__3
            {
            pushFollow(FOLLOW_rule__Tokens__Group__2__Impl_in_rule__Tokens__Group__22417);
            rule__Tokens__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Tokens__Group__3_in_rule__Tokens__Group__22420);
            rule__Tokens__Group__3();

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
    // $ANTLR end "rule__Tokens__Group__2"


    // $ANTLR start "rule__Tokens__Group__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1196:1: rule__Tokens__Group__2__Impl : ( ( rule__Tokens__TokentypesAssignment_2 )* ) ;
    public final void rule__Tokens__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1200:1: ( ( ( rule__Tokens__TokentypesAssignment_2 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1201:1: ( ( rule__Tokens__TokentypesAssignment_2 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1201:1: ( ( rule__Tokens__TokentypesAssignment_2 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1202:1: ( rule__Tokens__TokentypesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokensAccess().getTokentypesAssignment_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1203:1: ( rule__Tokens__TokentypesAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1203:2: rule__Tokens__TokentypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Tokens__TokentypesAssignment_2_in_rule__Tokens__Group__2__Impl2447);
            	    rule__Tokens__TokentypesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokensAccess().getTokentypesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tokens__Group__2__Impl"


    // $ANTLR start "rule__Tokens__Group__3"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1213:1: rule__Tokens__Group__3 : rule__Tokens__Group__3__Impl ;
    public final void rule__Tokens__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1217:1: ( rule__Tokens__Group__3__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1218:2: rule__Tokens__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Tokens__Group__3__Impl_in_rule__Tokens__Group__32478);
            rule__Tokens__Group__3__Impl();

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
    // $ANTLR end "rule__Tokens__Group__3"


    // $ANTLR start "rule__Tokens__Group__3__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1224:1: rule__Tokens__Group__3__Impl : ( '}' ) ;
    public final void rule__Tokens__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1228:1: ( ( '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1229:1: ( '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1229:1: ( '}' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1230:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokensAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,19,FOLLOW_19_in_rule__Tokens__Group__3__Impl2506); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokensAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tokens__Group__3__Impl"


    // $ANTLR start "rule__TokenType__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1251:1: rule__TokenType__Group__0 : rule__TokenType__Group__0__Impl rule__TokenType__Group__1 ;
    public final void rule__TokenType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1255:1: ( rule__TokenType__Group__0__Impl rule__TokenType__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1256:2: rule__TokenType__Group__0__Impl rule__TokenType__Group__1
            {
            pushFollow(FOLLOW_rule__TokenType__Group__0__Impl_in_rule__TokenType__Group__02545);
            rule__TokenType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TokenType__Group__1_in_rule__TokenType__Group__02548);
            rule__TokenType__Group__1();

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
    // $ANTLR end "rule__TokenType__Group__0"


    // $ANTLR start "rule__TokenType__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1263:1: rule__TokenType__Group__0__Impl : ( ( rule__TokenType__NameAssignment_0 ) ) ;
    public final void rule__TokenType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1267:1: ( ( ( rule__TokenType__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1268:1: ( ( rule__TokenType__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1268:1: ( ( rule__TokenType__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1269:1: ( rule__TokenType__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenTypeAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1270:1: ( rule__TokenType__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1270:2: rule__TokenType__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TokenType__NameAssignment_0_in_rule__TokenType__Group__0__Impl2575);
            rule__TokenType__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenTypeAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TokenType__Group__0__Impl"


    // $ANTLR start "rule__TokenType__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1280:1: rule__TokenType__Group__1 : rule__TokenType__Group__1__Impl rule__TokenType__Group__2 ;
    public final void rule__TokenType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1284:1: ( rule__TokenType__Group__1__Impl rule__TokenType__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1285:2: rule__TokenType__Group__1__Impl rule__TokenType__Group__2
            {
            pushFollow(FOLLOW_rule__TokenType__Group__1__Impl_in_rule__TokenType__Group__12605);
            rule__TokenType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TokenType__Group__2_in_rule__TokenType__Group__12608);
            rule__TokenType__Group__2();

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
    // $ANTLR end "rule__TokenType__Group__1"


    // $ANTLR start "rule__TokenType__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1292:1: rule__TokenType__Group__1__Impl : ( ( rule__TokenType__VariablesAssignment_1 )* ) ;
    public final void rule__TokenType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1296:1: ( ( ( rule__TokenType__VariablesAssignment_1 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1297:1: ( ( rule__TokenType__VariablesAssignment_1 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1297:1: ( ( rule__TokenType__VariablesAssignment_1 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1298:1: ( rule__TokenType__VariablesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenTypeAccess().getVariablesAssignment_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1299:1: ( rule__TokenType__VariablesAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==25) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1299:2: rule__TokenType__VariablesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__TokenType__VariablesAssignment_1_in_rule__TokenType__Group__1__Impl2635);
            	    rule__TokenType__VariablesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenTypeAccess().getVariablesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TokenType__Group__1__Impl"


    // $ANTLR start "rule__TokenType__Group__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1309:1: rule__TokenType__Group__2 : rule__TokenType__Group__2__Impl ;
    public final void rule__TokenType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1313:1: ( rule__TokenType__Group__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1314:2: rule__TokenType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TokenType__Group__2__Impl_in_rule__TokenType__Group__22666);
            rule__TokenType__Group__2__Impl();

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
    // $ANTLR end "rule__TokenType__Group__2"


    // $ANTLR start "rule__TokenType__Group__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1320:1: rule__TokenType__Group__2__Impl : ( ( rule__TokenType__Group_2__0 )? ) ;
    public final void rule__TokenType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1324:1: ( ( ( rule__TokenType__Group_2__0 )? ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1325:1: ( ( rule__TokenType__Group_2__0 )? )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1325:1: ( ( rule__TokenType__Group_2__0 )? )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1326:1: ( rule__TokenType__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenTypeAccess().getGroup_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1327:1: ( rule__TokenType__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1327:2: rule__TokenType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TokenType__Group_2__0_in_rule__TokenType__Group__2__Impl2693);
                    rule__TokenType__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenTypeAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TokenType__Group__2__Impl"


    // $ANTLR start "rule__TokenType__Group_2__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1343:1: rule__TokenType__Group_2__0 : rule__TokenType__Group_2__0__Impl rule__TokenType__Group_2__1 ;
    public final void rule__TokenType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1347:1: ( rule__TokenType__Group_2__0__Impl rule__TokenType__Group_2__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1348:2: rule__TokenType__Group_2__0__Impl rule__TokenType__Group_2__1
            {
            pushFollow(FOLLOW_rule__TokenType__Group_2__0__Impl_in_rule__TokenType__Group_2__02730);
            rule__TokenType__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TokenType__Group_2__1_in_rule__TokenType__Group_2__02733);
            rule__TokenType__Group_2__1();

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
    // $ANTLR end "rule__TokenType__Group_2__0"


    // $ANTLR start "rule__TokenType__Group_2__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1355:1: rule__TokenType__Group_2__0__Impl : ( '{' ) ;
    public final void rule__TokenType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1359:1: ( ( '{' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1360:1: ( '{' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1360:1: ( '{' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1361:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenTypeAccess().getLeftCurlyBracketKeyword_2_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__TokenType__Group_2__0__Impl2761); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenTypeAccess().getLeftCurlyBracketKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TokenType__Group_2__0__Impl"


    // $ANTLR start "rule__TokenType__Group_2__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1374:1: rule__TokenType__Group_2__1 : rule__TokenType__Group_2__1__Impl rule__TokenType__Group_2__2 ;
    public final void rule__TokenType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1378:1: ( rule__TokenType__Group_2__1__Impl rule__TokenType__Group_2__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1379:2: rule__TokenType__Group_2__1__Impl rule__TokenType__Group_2__2
            {
            pushFollow(FOLLOW_rule__TokenType__Group_2__1__Impl_in_rule__TokenType__Group_2__12792);
            rule__TokenType__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TokenType__Group_2__2_in_rule__TokenType__Group_2__12795);
            rule__TokenType__Group_2__2();

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
    // $ANTLR end "rule__TokenType__Group_2__1"


    // $ANTLR start "rule__TokenType__Group_2__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1386:1: rule__TokenType__Group_2__1__Impl : ( ( rule__TokenType__AttributesAssignment_2_1 )* ) ;
    public final void rule__TokenType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1390:1: ( ( ( rule__TokenType__AttributesAssignment_2_1 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1391:1: ( ( rule__TokenType__AttributesAssignment_2_1 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1391:1: ( ( rule__TokenType__AttributesAssignment_2_1 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1392:1: ( rule__TokenType__AttributesAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenTypeAccess().getAttributesAssignment_2_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1393:1: ( rule__TokenType__AttributesAssignment_2_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1393:2: rule__TokenType__AttributesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__TokenType__AttributesAssignment_2_1_in_rule__TokenType__Group_2__1__Impl2822);
            	    rule__TokenType__AttributesAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenTypeAccess().getAttributesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TokenType__Group_2__1__Impl"


    // $ANTLR start "rule__TokenType__Group_2__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1403:1: rule__TokenType__Group_2__2 : rule__TokenType__Group_2__2__Impl ;
    public final void rule__TokenType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1407:1: ( rule__TokenType__Group_2__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1408:2: rule__TokenType__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TokenType__Group_2__2__Impl_in_rule__TokenType__Group_2__22853);
            rule__TokenType__Group_2__2__Impl();

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
    // $ANTLR end "rule__TokenType__Group_2__2"


    // $ANTLR start "rule__TokenType__Group_2__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1414:1: rule__TokenType__Group_2__2__Impl : ( '}' ) ;
    public final void rule__TokenType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1418:1: ( ( '}' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1419:1: ( '}' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1419:1: ( '}' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1420:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenTypeAccess().getRightCurlyBracketKeyword_2_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__TokenType__Group_2__2__Impl2881); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenTypeAccess().getRightCurlyBracketKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TokenType__Group_2__2__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1439:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1443:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1444:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02918);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02921);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1451:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1455:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1456:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1456:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1457:1: ( rule__Attribute__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1458:1: ( rule__Attribute__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1458:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl2948);
            rule__Attribute__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1468:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1472:1: ( rule__Attribute__Group__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1473:2: rule__Attribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12978);
            rule__Attribute__Group__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1479:1: rule__Attribute__Group__1__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1483:1: ( ( ';' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1484:1: ( ';' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1484:1: ( ';' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1485:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getSemicolonKeyword_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Attribute__Group__1__Impl3006); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getSemicolonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1502:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1506:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1507:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03041);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03044);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1514:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1518:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1519:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1519:1: ( ( rule__Field__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1520:1: ( rule__Field__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1521:1: ( rule__Field__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1521:2: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl3071);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1531:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1535:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1536:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13101);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13104);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1543:1: rule__Field__Group__1__Impl : ( '(' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1547:1: ( ( '(' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1548:1: ( '(' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1548:1: ( '(' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1549:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Field__Group__1__Impl3132); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1562:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1566:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1567:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23163);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23166);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1574:1: rule__Field__Group__2__Impl : ( ( rule__Field__XAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1578:1: ( ( ( rule__Field__XAssignment_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1579:1: ( ( rule__Field__XAssignment_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1579:1: ( ( rule__Field__XAssignment_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1580:1: ( rule__Field__XAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getXAssignment_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1581:1: ( rule__Field__XAssignment_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1581:2: rule__Field__XAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__XAssignment_2_in_rule__Field__Group__2__Impl3193);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1591:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1595:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1596:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33223);
            rule__Field__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33226);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1603:1: rule__Field__Group__3__Impl : ( ',' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1607:1: ( ( ',' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1608:1: ( ',' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1608:1: ( ',' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1609:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommaKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__Field__Group__3__Impl3254); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1622:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1626:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1627:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43285);
            rule__Field__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__43288);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1634:1: rule__Field__Group__4__Impl : ( ( rule__Field__YAssignment_4 ) ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1638:1: ( ( ( rule__Field__YAssignment_4 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1639:1: ( ( rule__Field__YAssignment_4 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1639:1: ( ( rule__Field__YAssignment_4 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1640:1: ( rule__Field__YAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getYAssignment_4()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1641:1: ( rule__Field__YAssignment_4 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1641:2: rule__Field__YAssignment_4
            {
            pushFollow(FOLLOW_rule__Field__YAssignment_4_in_rule__Field__Group__4__Impl3315);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1651:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1655:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1656:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__53345);
            rule__Field__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__6_in_rule__Field__Group__53348);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1663:1: rule__Field__Group__5__Impl : ( ',' ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1667:1: ( ( ',' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1668:1: ( ',' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1668:1: ( ',' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1669:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommaKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__Field__Group__5__Impl3376); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1682:1: rule__Field__Group__6 : rule__Field__Group__6__Impl rule__Field__Group__7 ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1686:1: ( rule__Field__Group__6__Impl rule__Field__Group__7 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1687:2: rule__Field__Group__6__Impl rule__Field__Group__7
            {
            pushFollow(FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__63407);
            rule__Field__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__7_in_rule__Field__Group__63410);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1694:1: rule__Field__Group__6__Impl : ( ( rule__Field__ZAssignment_6 ) ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1698:1: ( ( ( rule__Field__ZAssignment_6 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1699:1: ( ( rule__Field__ZAssignment_6 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1699:1: ( ( rule__Field__ZAssignment_6 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1700:1: ( rule__Field__ZAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getZAssignment_6()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1701:1: ( rule__Field__ZAssignment_6 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1701:2: rule__Field__ZAssignment_6
            {
            pushFollow(FOLLOW_rule__Field__ZAssignment_6_in_rule__Field__Group__6__Impl3437);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1711:1: rule__Field__Group__7 : rule__Field__Group__7__Impl rule__Field__Group__8 ;
    public final void rule__Field__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1715:1: ( rule__Field__Group__7__Impl rule__Field__Group__8 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1716:2: rule__Field__Group__7__Impl rule__Field__Group__8
            {
            pushFollow(FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__73467);
            rule__Field__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__8_in_rule__Field__Group__73470);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1723:1: rule__Field__Group__7__Impl : ( ')' ) ;
    public final void rule__Field__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1727:1: ( ( ')' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1728:1: ( ')' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1728:1: ( ')' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1729:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,23,FOLLOW_23_in_rule__Field__Group__7__Impl3498); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1742:1: rule__Field__Group__8 : rule__Field__Group__8__Impl rule__Field__Group__9 ;
    public final void rule__Field__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1746:1: ( rule__Field__Group__8__Impl rule__Field__Group__9 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1747:2: rule__Field__Group__8__Impl rule__Field__Group__9
            {
            pushFollow(FOLLOW_rule__Field__Group__8__Impl_in_rule__Field__Group__83529);
            rule__Field__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__9_in_rule__Field__Group__83532);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1754:1: rule__Field__Group__8__Impl : ( ':' ) ;
    public final void rule__Field__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1758:1: ( ( ':' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1759:1: ( ':' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1759:1: ( ':' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1760:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getColonKeyword_8()); 
            }
            match(input,24,FOLLOW_24_in_rule__Field__Group__8__Impl3560); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1773:1: rule__Field__Group__9 : rule__Field__Group__9__Impl rule__Field__Group__10 ;
    public final void rule__Field__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1777:1: ( rule__Field__Group__9__Impl rule__Field__Group__10 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1778:2: rule__Field__Group__9__Impl rule__Field__Group__10
            {
            pushFollow(FOLLOW_rule__Field__Group__9__Impl_in_rule__Field__Group__93591);
            rule__Field__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__10_in_rule__Field__Group__93594);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1785:1: rule__Field__Group__9__Impl : ( ( rule__Field__NeighboursAssignment_9 )* ) ;
    public final void rule__Field__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1789:1: ( ( ( rule__Field__NeighboursAssignment_9 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1790:1: ( ( rule__Field__NeighboursAssignment_9 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1790:1: ( ( rule__Field__NeighboursAssignment_9 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1791:1: ( rule__Field__NeighboursAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNeighboursAssignment_9()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1792:1: ( rule__Field__NeighboursAssignment_9 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1792:2: rule__Field__NeighboursAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Field__NeighboursAssignment_9_in_rule__Field__Group__9__Impl3621);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1802:1: rule__Field__Group__10 : rule__Field__Group__10__Impl ;
    public final void rule__Field__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1806:1: ( rule__Field__Group__10__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1807:2: rule__Field__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__10__Impl_in_rule__Field__Group__103652);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1813:1: rule__Field__Group__10__Impl : ( ';' ) ;
    public final void rule__Field__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1817:1: ( ( ';' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1818:1: ( ';' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1818:1: ( ';' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1819:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getSemicolonKeyword_10()); 
            }
            match(input,20,FOLLOW_20_in_rule__Field__Group__10__Impl3680); if (state.failed) return ;
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


    // $ANTLR start "rule__Variable__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1857:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1861:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1862:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__03736);
            rule__Variable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__03739);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1869:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1873:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1874:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1874:1: ( ( rule__Variable__NameAssignment_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1875:1: ( rule__Variable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1876:1: ( rule__Variable__NameAssignment_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1876:2: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Group__0__Impl3766);
            rule__Variable__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1886:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1890:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1891:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__13796);
            rule__Variable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__13799);
            rule__Variable__Group__2();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1898:1: rule__Variable__Group__1__Impl : ( '=' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1902:1: ( ( '=' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1903:1: ( '=' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1903:1: ( '=' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1904:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__Variable__Group__1__Impl3827); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1917:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1921:1: ( rule__Variable__Group__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1922:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__23858);
            rule__Variable__Group__2__Impl();

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
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1928:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__ExpressionAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1932:1: ( ( ( rule__Variable__ExpressionAssignment_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1933:1: ( ( rule__Variable__ExpressionAssignment_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1933:1: ( ( rule__Variable__ExpressionAssignment_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1934:1: ( rule__Variable__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getExpressionAssignment_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1935:1: ( rule__Variable__ExpressionAssignment_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1935:2: rule__Variable__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Variable__ExpressionAssignment_2_in_rule__Variable__Group__2__Impl3885);
            rule__Variable__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getExpressionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1951:1: rule__BooleanExpression__Group__0 : rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1 ;
    public final void rule__BooleanExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1955:1: ( rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1956:2: rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Group__0__Impl_in_rule__BooleanExpression__Group__03921);
            rule__BooleanExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BooleanExpression__Group__1_in_rule__BooleanExpression__Group__03924);
            rule__BooleanExpression__Group__1();

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
    // $ANTLR end "rule__BooleanExpression__Group__0"


    // $ANTLR start "rule__BooleanExpression__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1963:1: rule__BooleanExpression__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__BooleanExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1967:1: ( ( ruleComparison ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1968:1: ( ruleComparison )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1968:1: ( ruleComparison )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1969:1: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getComparisonParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_rule__BooleanExpression__Group__0__Impl3951);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getComparisonParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1980:1: rule__BooleanExpression__Group__1 : rule__BooleanExpression__Group__1__Impl ;
    public final void rule__BooleanExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1984:1: ( rule__BooleanExpression__Group__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1985:2: rule__BooleanExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Group__1__Impl_in_rule__BooleanExpression__Group__13980);
            rule__BooleanExpression__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanExpression__Group__1"


    // $ANTLR start "rule__BooleanExpression__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1991:1: rule__BooleanExpression__Group__1__Impl : ( ( rule__BooleanExpression__Group_1__0 )* ) ;
    public final void rule__BooleanExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1995:1: ( ( ( rule__BooleanExpression__Group_1__0 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1996:1: ( ( rule__BooleanExpression__Group_1__0 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1996:1: ( ( rule__BooleanExpression__Group_1__0 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1997:1: ( rule__BooleanExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getGroup_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1998:1: ( rule__BooleanExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=11 && LA16_0<=12)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:1998:2: rule__BooleanExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BooleanExpression__Group_1__0_in_rule__BooleanExpression__Group__1__Impl4007);
            	    rule__BooleanExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpression__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2012:1: rule__BooleanExpression__Group_1__0 : rule__BooleanExpression__Group_1__0__Impl rule__BooleanExpression__Group_1__1 ;
    public final void rule__BooleanExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2016:1: ( rule__BooleanExpression__Group_1__0__Impl rule__BooleanExpression__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2017:2: rule__BooleanExpression__Group_1__0__Impl rule__BooleanExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Group_1__0__Impl_in_rule__BooleanExpression__Group_1__04042);
            rule__BooleanExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BooleanExpression__Group_1__1_in_rule__BooleanExpression__Group_1__04045);
            rule__BooleanExpression__Group_1__1();

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
    // $ANTLR end "rule__BooleanExpression__Group_1__0"


    // $ANTLR start "rule__BooleanExpression__Group_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2024:1: rule__BooleanExpression__Group_1__0__Impl : ( ( rule__BooleanExpression__Group_1_0__0 ) ) ;
    public final void rule__BooleanExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2028:1: ( ( ( rule__BooleanExpression__Group_1_0__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2029:1: ( ( rule__BooleanExpression__Group_1_0__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2029:1: ( ( rule__BooleanExpression__Group_1_0__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2030:1: ( rule__BooleanExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getGroup_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2031:1: ( rule__BooleanExpression__Group_1_0__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2031:2: rule__BooleanExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Group_1_0__0_in_rule__BooleanExpression__Group_1__0__Impl4072);
            rule__BooleanExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanExpression__Group_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2041:1: rule__BooleanExpression__Group_1__1 : rule__BooleanExpression__Group_1__1__Impl ;
    public final void rule__BooleanExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2045:1: ( rule__BooleanExpression__Group_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2046:2: rule__BooleanExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Group_1__1__Impl_in_rule__BooleanExpression__Group_1__14102);
            rule__BooleanExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__BooleanExpression__Group_1__1"


    // $ANTLR start "rule__BooleanExpression__Group_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2052:1: rule__BooleanExpression__Group_1__1__Impl : ( ( rule__BooleanExpression__RightAssignment_1_1 ) ) ;
    public final void rule__BooleanExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2056:1: ( ( ( rule__BooleanExpression__RightAssignment_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2057:1: ( ( rule__BooleanExpression__RightAssignment_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2057:1: ( ( rule__BooleanExpression__RightAssignment_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2058:1: ( rule__BooleanExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2059:1: ( rule__BooleanExpression__RightAssignment_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2059:2: rule__BooleanExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BooleanExpression__RightAssignment_1_1_in_rule__BooleanExpression__Group_1__1__Impl4129);
            rule__BooleanExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanExpression__Group_1_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2073:1: rule__BooleanExpression__Group_1_0__0 : rule__BooleanExpression__Group_1_0__0__Impl rule__BooleanExpression__Group_1_0__1 ;
    public final void rule__BooleanExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2077:1: ( rule__BooleanExpression__Group_1_0__0__Impl rule__BooleanExpression__Group_1_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2078:2: rule__BooleanExpression__Group_1_0__0__Impl rule__BooleanExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Group_1_0__0__Impl_in_rule__BooleanExpression__Group_1_0__04163);
            rule__BooleanExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BooleanExpression__Group_1_0__1_in_rule__BooleanExpression__Group_1_0__04166);
            rule__BooleanExpression__Group_1_0__1();

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
    // $ANTLR end "rule__BooleanExpression__Group_1_0__0"


    // $ANTLR start "rule__BooleanExpression__Group_1_0__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2085:1: rule__BooleanExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__BooleanExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2089:1: ( ( () ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2090:1: ( () )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2090:1: ( () )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2091:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2092:1: ()
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2094:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__BooleanExpression__Group_1_0__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2104:1: rule__BooleanExpression__Group_1_0__1 : rule__BooleanExpression__Group_1_0__1__Impl ;
    public final void rule__BooleanExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2108:1: ( rule__BooleanExpression__Group_1_0__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2109:2: rule__BooleanExpression__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Group_1_0__1__Impl_in_rule__BooleanExpression__Group_1_0__14224);
            rule__BooleanExpression__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__BooleanExpression__Group_1_0__1"


    // $ANTLR start "rule__BooleanExpression__Group_1_0__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2115:1: rule__BooleanExpression__Group_1_0__1__Impl : ( ( rule__BooleanExpression__OpAssignment_1_0_1 ) ) ;
    public final void rule__BooleanExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2119:1: ( ( ( rule__BooleanExpression__OpAssignment_1_0_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2120:1: ( ( rule__BooleanExpression__OpAssignment_1_0_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2120:1: ( ( rule__BooleanExpression__OpAssignment_1_0_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2121:1: ( rule__BooleanExpression__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOpAssignment_1_0_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2122:1: ( rule__BooleanExpression__OpAssignment_1_0_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2122:2: rule__BooleanExpression__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__BooleanExpression__OpAssignment_1_0_1_in_rule__BooleanExpression__Group_1_0__1__Impl4251);
            rule__BooleanExpression__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2136:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2140:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2141:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04285);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04288);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2148:1: rule__Comparison__Group__0__Impl : ( ruleEquals ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2152:1: ( ( ruleEquals ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2153:1: ( ruleEquals )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2153:1: ( ruleEquals )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2154:1: ruleEquals
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getEqualsParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleEquals_in_rule__Comparison__Group__0__Impl4315);
            ruleEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getEqualsParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2165:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2169:1: ( rule__Comparison__Group__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2170:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14344);
            rule__Comparison__Group__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2176:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2180:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2181:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2181:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2182:1: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2183:1: ( rule__Comparison__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2183:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl4371);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2197:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2201:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2202:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__04406);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__04409);
            rule__Comparison__Group_1__1();

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
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2209:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Group_1_0__0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2213:1: ( ( ( rule__Comparison__Group_1_0__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2214:1: ( ( rule__Comparison__Group_1_0__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2214:1: ( ( rule__Comparison__Group_1_0__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2215:1: ( rule__Comparison__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2216:1: ( rule__Comparison__Group_1_0__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2216:2: rule__Comparison__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0__0_in_rule__Comparison__Group_1__0__Impl4436);
            rule__Comparison__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2226:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2230:1: ( rule__Comparison__Group_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2231:2: rule__Comparison__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__14466);
            rule__Comparison__Group_1__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2237:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2241:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2242:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2242:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2243:1: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2244:1: ( rule__Comparison__RightAssignment_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2244:2: rule__Comparison__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_1_in_rule__Comparison__Group_1__1__Impl4493);
            rule__Comparison__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2258:1: rule__Comparison__Group_1_0__0 : rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1 ;
    public final void rule__Comparison__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2262:1: ( rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2263:2: rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0__0__Impl_in_rule__Comparison__Group_1_0__04527);
            rule__Comparison__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_1_0__1_in_rule__Comparison__Group_1_0__04530);
            rule__Comparison__Group_1_0__1();

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
    // $ANTLR end "rule__Comparison__Group_1_0__0"


    // $ANTLR start "rule__Comparison__Group_1_0__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2270:1: rule__Comparison__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2274:1: ( ( () ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2275:1: ( () )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2275:1: ( () )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2276:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2277:1: ()
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2279:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2289:1: rule__Comparison__Group_1_0__1 : rule__Comparison__Group_1_0__1__Impl ;
    public final void rule__Comparison__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2293:1: ( rule__Comparison__Group_1_0__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2294:2: rule__Comparison__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1_0__1__Impl_in_rule__Comparison__Group_1_0__14588);
            rule__Comparison__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1_0__1"


    // $ANTLR start "rule__Comparison__Group_1_0__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2300:1: rule__Comparison__Group_1_0__1__Impl : ( ( rule__Comparison__OpAssignment_1_0_1 ) ) ;
    public final void rule__Comparison__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2304:1: ( ( ( rule__Comparison__OpAssignment_1_0_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2305:1: ( ( rule__Comparison__OpAssignment_1_0_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2305:1: ( ( rule__Comparison__OpAssignment_1_0_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2306:1: ( rule__Comparison__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAssignment_1_0_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2307:1: ( rule__Comparison__OpAssignment_1_0_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2307:2: rule__Comparison__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Comparison__OpAssignment_1_0_1_in_rule__Comparison__Group_1_0__1__Impl4615);
            rule__Comparison__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__1__Impl"


    // $ANTLR start "rule__Equals__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2321:1: rule__Equals__Group__0 : rule__Equals__Group__0__Impl rule__Equals__Group__1 ;
    public final void rule__Equals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2325:1: ( rule__Equals__Group__0__Impl rule__Equals__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2326:2: rule__Equals__Group__0__Impl rule__Equals__Group__1
            {
            pushFollow(FOLLOW_rule__Equals__Group__0__Impl_in_rule__Equals__Group__04649);
            rule__Equals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equals__Group__1_in_rule__Equals__Group__04652);
            rule__Equals__Group__1();

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
    // $ANTLR end "rule__Equals__Group__0"


    // $ANTLR start "rule__Equals__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2333:1: rule__Equals__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Equals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2337:1: ( ( ruleAddition ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2338:1: ( ruleAddition )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2338:1: ( ruleAddition )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2339:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsAccess().getAdditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__Equals__Group__0__Impl4679);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsAccess().getAdditionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group__0__Impl"


    // $ANTLR start "rule__Equals__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2350:1: rule__Equals__Group__1 : rule__Equals__Group__1__Impl ;
    public final void rule__Equals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2354:1: ( rule__Equals__Group__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2355:2: rule__Equals__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Equals__Group__1__Impl_in_rule__Equals__Group__14708);
            rule__Equals__Group__1__Impl();

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
    // $ANTLR end "rule__Equals__Group__1"


    // $ANTLR start "rule__Equals__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2361:1: rule__Equals__Group__1__Impl : ( ( rule__Equals__Group_1__0 )* ) ;
    public final void rule__Equals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2365:1: ( ( ( rule__Equals__Group_1__0 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2366:1: ( ( rule__Equals__Group_1__0 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2366:1: ( ( rule__Equals__Group_1__0 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2367:1: ( rule__Equals__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsAccess().getGroup_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2368:1: ( rule__Equals__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2368:2: rule__Equals__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equals__Group_1__0_in_rule__Equals__Group__1__Impl4735);
            	    rule__Equals__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group__1__Impl"


    // $ANTLR start "rule__Equals__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2382:1: rule__Equals__Group_1__0 : rule__Equals__Group_1__0__Impl rule__Equals__Group_1__1 ;
    public final void rule__Equals__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2386:1: ( rule__Equals__Group_1__0__Impl rule__Equals__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2387:2: rule__Equals__Group_1__0__Impl rule__Equals__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equals__Group_1__0__Impl_in_rule__Equals__Group_1__04770);
            rule__Equals__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equals__Group_1__1_in_rule__Equals__Group_1__04773);
            rule__Equals__Group_1__1();

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
    // $ANTLR end "rule__Equals__Group_1__0"


    // $ANTLR start "rule__Equals__Group_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2394:1: rule__Equals__Group_1__0__Impl : ( ( rule__Equals__Group_1_0__0 ) ) ;
    public final void rule__Equals__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2398:1: ( ( ( rule__Equals__Group_1_0__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2399:1: ( ( rule__Equals__Group_1_0__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2399:1: ( ( rule__Equals__Group_1_0__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2400:1: ( rule__Equals__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsAccess().getGroup_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2401:1: ( rule__Equals__Group_1_0__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2401:2: rule__Equals__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Equals__Group_1_0__0_in_rule__Equals__Group_1__0__Impl4800);
            rule__Equals__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group_1__0__Impl"


    // $ANTLR start "rule__Equals__Group_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2411:1: rule__Equals__Group_1__1 : rule__Equals__Group_1__1__Impl ;
    public final void rule__Equals__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2415:1: ( rule__Equals__Group_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2416:2: rule__Equals__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Equals__Group_1__1__Impl_in_rule__Equals__Group_1__14830);
            rule__Equals__Group_1__1__Impl();

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
    // $ANTLR end "rule__Equals__Group_1__1"


    // $ANTLR start "rule__Equals__Group_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2422:1: rule__Equals__Group_1__1__Impl : ( ( rule__Equals__RightAssignment_1_1 ) ) ;
    public final void rule__Equals__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2426:1: ( ( ( rule__Equals__RightAssignment_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2427:1: ( ( rule__Equals__RightAssignment_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2427:1: ( ( rule__Equals__RightAssignment_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2428:1: ( rule__Equals__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsAccess().getRightAssignment_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2429:1: ( rule__Equals__RightAssignment_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2429:2: rule__Equals__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Equals__RightAssignment_1_1_in_rule__Equals__Group_1__1__Impl4857);
            rule__Equals__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group_1__1__Impl"


    // $ANTLR start "rule__Equals__Group_1_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2443:1: rule__Equals__Group_1_0__0 : rule__Equals__Group_1_0__0__Impl rule__Equals__Group_1_0__1 ;
    public final void rule__Equals__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2447:1: ( rule__Equals__Group_1_0__0__Impl rule__Equals__Group_1_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2448:2: rule__Equals__Group_1_0__0__Impl rule__Equals__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Equals__Group_1_0__0__Impl_in_rule__Equals__Group_1_0__04891);
            rule__Equals__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equals__Group_1_0__1_in_rule__Equals__Group_1_0__04894);
            rule__Equals__Group_1_0__1();

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
    // $ANTLR end "rule__Equals__Group_1_0__0"


    // $ANTLR start "rule__Equals__Group_1_0__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2455:1: rule__Equals__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Equals__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2459:1: ( ( () ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2460:1: ( () )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2460:1: ( () )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2461:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2462:1: ()
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2464:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsAccess().getEqualsLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group_1_0__0__Impl"


    // $ANTLR start "rule__Equals__Group_1_0__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2474:1: rule__Equals__Group_1_0__1 : rule__Equals__Group_1_0__1__Impl ;
    public final void rule__Equals__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2478:1: ( rule__Equals__Group_1_0__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2479:2: rule__Equals__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Equals__Group_1_0__1__Impl_in_rule__Equals__Group_1_0__14952);
            rule__Equals__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Equals__Group_1_0__1"


    // $ANTLR start "rule__Equals__Group_1_0__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2485:1: rule__Equals__Group_1_0__1__Impl : ( ( rule__Equals__OpAssignment_1_0_1 ) ) ;
    public final void rule__Equals__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2489:1: ( ( ( rule__Equals__OpAssignment_1_0_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2490:1: ( ( rule__Equals__OpAssignment_1_0_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2490:1: ( ( rule__Equals__OpAssignment_1_0_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2491:1: ( rule__Equals__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsAccess().getOpAssignment_1_0_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2492:1: ( rule__Equals__OpAssignment_1_0_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2492:2: rule__Equals__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Equals__OpAssignment_1_0_1_in_rule__Equals__Group_1_0__1__Impl4979);
            rule__Equals__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group_1_0__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2506:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2510:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2511:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__05013);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__05016);
            rule__Addition__Group__1();

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2518:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2522:1: ( ( ruleMultiplication ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2523:1: ( ruleMultiplication )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2523:1: ( ruleMultiplication )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2524:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl5043);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2535:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2539:1: ( rule__Addition__Group__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2540:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__15072);
            rule__Addition__Group__1__Impl();

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2546:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2550:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2551:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2551:1: ( ( rule__Addition__Group_1__0 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2552:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2553:1: ( rule__Addition__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=26 && LA19_0<=27)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2553:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl5099);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2567:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2571:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2572:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__05134);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__05137);
            rule__Addition__Group_1__1();

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
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2579:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2583:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2584:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2584:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2585:1: ( rule__Addition__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2586:1: ( rule__Addition__Alternatives_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2586:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl5164);
            rule__Addition__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2596:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2600:1: ( rule__Addition__Group_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2601:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__15194);
            rule__Addition__Group_1__1__Impl();

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
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2607:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2611:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2612:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2612:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2613:1: ( rule__Addition__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2614:1: ( rule__Addition__RightAssignment_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2614:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl5221);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2628:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2632:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2633:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__05255);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__05258);
            rule__Addition__Group_1_0_0__1();

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
    // $ANTLR end "rule__Addition__Group_1_0_0__0"


    // $ANTLR start "rule__Addition__Group_1_0_0__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2640:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2644:1: ( ( () ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2645:1: ( () )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2645:1: ( () )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2646:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2647:1: ()
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2649:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2659:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2663:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2664:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__15316);
            rule__Addition__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Addition__Group_1_0_0__1"


    // $ANTLR start "rule__Addition__Group_1_0_0__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2670:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2674:1: ( ( '+' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2675:1: ( '+' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2675:1: ( '+' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2676:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Addition__Group_1_0_0__1__Impl5344); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2693:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2697:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2698:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__05379);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__05382);
            rule__Addition__Group_1_0_1__1();

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
    // $ANTLR end "rule__Addition__Group_1_0_1__0"


    // $ANTLR start "rule__Addition__Group_1_0_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2705:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2709:1: ( ( () ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2710:1: ( () )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2710:1: ( () )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2711:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2712:1: ()
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2714:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2724:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2728:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2729:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__15440);
            rule__Addition__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Addition__Group_1_0_1__1"


    // $ANTLR start "rule__Addition__Group_1_0_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2735:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2739:1: ( ( '-' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2740:1: ( '-' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2740:1: ( '-' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2741:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Addition__Group_1_0_1__1__Impl5468); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2758:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2762:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2763:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__05503);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__05506);
            rule__Multiplication__Group__1();

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
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2770:1: rule__Multiplication__Group__0__Impl : ( rulePrefixed ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2774:1: ( ( rulePrefixed ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2775:1: ( rulePrefixed )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2775:1: ( rulePrefixed )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2776:1: rulePrefixed
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getPrefixedParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrefixed_in_rule__Multiplication__Group__0__Impl5533);
            rulePrefixed();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getPrefixedParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2787:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2791:1: ( rule__Multiplication__Group__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2792:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__15562);
            rule__Multiplication__Group__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2798:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2802:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2803:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2803:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2804:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2805:1: ( rule__Multiplication__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=13 && LA20_0<=14)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2805:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl5589);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2819:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2823:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2824:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__05624);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__05627);
            rule__Multiplication__Group_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2831:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Group_1_0__0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2835:1: ( ( ( rule__Multiplication__Group_1_0__0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2836:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2836:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2837:1: ( rule__Multiplication__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2838:1: ( rule__Multiplication__Group_1_0__0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2838:2: rule__Multiplication__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__0_in_rule__Multiplication__Group_1__0__Impl5654);
            rule__Multiplication__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2848:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2852:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2853:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__15684);
            rule__Multiplication__Group_1__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2859:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2863:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2864:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2864:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2865:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2866:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2866:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl5711);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2880:1: rule__Multiplication__Group_1_0__0 : rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 ;
    public final void rule__Multiplication__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2884:1: ( rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2885:2: rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__0__Impl_in_rule__Multiplication__Group_1_0__05745);
            rule__Multiplication__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__1_in_rule__Multiplication__Group_1_0__05748);
            rule__Multiplication__Group_1_0__1();

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
    // $ANTLR end "rule__Multiplication__Group_1_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2892:1: rule__Multiplication__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2896:1: ( ( () ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2897:1: ( () )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2897:1: ( () )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2898:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2899:1: ()
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2901:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2911:1: rule__Multiplication__Group_1_0__1 : rule__Multiplication__Group_1_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2915:1: ( rule__Multiplication__Group_1_0__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2916:2: rule__Multiplication__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__1__Impl_in_rule__Multiplication__Group_1_0__15806);
            rule__Multiplication__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2922:1: rule__Multiplication__Group_1_0__1__Impl : ( ( rule__Multiplication__OpAssignment_1_0_1 ) ) ;
    public final void rule__Multiplication__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2926:1: ( ( ( rule__Multiplication__OpAssignment_1_0_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2927:1: ( ( rule__Multiplication__OpAssignment_1_0_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2927:1: ( ( rule__Multiplication__OpAssignment_1_0_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2928:1: ( rule__Multiplication__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAssignment_1_0_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2929:1: ( rule__Multiplication__OpAssignment_1_0_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2929:2: rule__Multiplication__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Multiplication__OpAssignment_1_0_1_in_rule__Multiplication__Group_1_0__1__Impl5833);
            rule__Multiplication__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__1__Impl"


    // $ANTLR start "rule__Prefixed__Group_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2943:1: rule__Prefixed__Group_0__0 : rule__Prefixed__Group_0__0__Impl rule__Prefixed__Group_0__1 ;
    public final void rule__Prefixed__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2947:1: ( rule__Prefixed__Group_0__0__Impl rule__Prefixed__Group_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2948:2: rule__Prefixed__Group_0__0__Impl rule__Prefixed__Group_0__1
            {
            pushFollow(FOLLOW_rule__Prefixed__Group_0__0__Impl_in_rule__Prefixed__Group_0__05867);
            rule__Prefixed__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Prefixed__Group_0__1_in_rule__Prefixed__Group_0__05870);
            rule__Prefixed__Group_0__1();

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
    // $ANTLR end "rule__Prefixed__Group_0__0"


    // $ANTLR start "rule__Prefixed__Group_0__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2955:1: rule__Prefixed__Group_0__0__Impl : ( () ) ;
    public final void rule__Prefixed__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2959:1: ( ( () ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2960:1: ( () )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2960:1: ( () )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2961:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getBooleanNegationAction_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2962:1: ()
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2964:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getBooleanNegationAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_0__0__Impl"


    // $ANTLR start "rule__Prefixed__Group_0__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2974:1: rule__Prefixed__Group_0__1 : rule__Prefixed__Group_0__1__Impl rule__Prefixed__Group_0__2 ;
    public final void rule__Prefixed__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2978:1: ( rule__Prefixed__Group_0__1__Impl rule__Prefixed__Group_0__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2979:2: rule__Prefixed__Group_0__1__Impl rule__Prefixed__Group_0__2
            {
            pushFollow(FOLLOW_rule__Prefixed__Group_0__1__Impl_in_rule__Prefixed__Group_0__15928);
            rule__Prefixed__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Prefixed__Group_0__2_in_rule__Prefixed__Group_0__15931);
            rule__Prefixed__Group_0__2();

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
    // $ANTLR end "rule__Prefixed__Group_0__1"


    // $ANTLR start "rule__Prefixed__Group_0__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2986:1: rule__Prefixed__Group_0__1__Impl : ( ( '!' ) ) ;
    public final void rule__Prefixed__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2990:1: ( ( ( '!' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2991:1: ( ( '!' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2991:1: ( ( '!' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2992:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getExclamationMarkKeyword_0_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2993:1: ( '!' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:2994:2: '!'
            {
            match(input,28,FOLLOW_28_in_rule__Prefixed__Group_0__1__Impl5960); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getExclamationMarkKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_0__1__Impl"


    // $ANTLR start "rule__Prefixed__Group_0__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3005:1: rule__Prefixed__Group_0__2 : rule__Prefixed__Group_0__2__Impl ;
    public final void rule__Prefixed__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3009:1: ( rule__Prefixed__Group_0__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3010:2: rule__Prefixed__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Prefixed__Group_0__2__Impl_in_rule__Prefixed__Group_0__25992);
            rule__Prefixed__Group_0__2__Impl();

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
    // $ANTLR end "rule__Prefixed__Group_0__2"


    // $ANTLR start "rule__Prefixed__Group_0__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3016:1: rule__Prefixed__Group_0__2__Impl : ( ( rule__Prefixed__ExpressionAssignment_0_2 ) ) ;
    public final void rule__Prefixed__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3020:1: ( ( ( rule__Prefixed__ExpressionAssignment_0_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3021:1: ( ( rule__Prefixed__ExpressionAssignment_0_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3021:1: ( ( rule__Prefixed__ExpressionAssignment_0_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3022:1: ( rule__Prefixed__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getExpressionAssignment_0_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3023:1: ( rule__Prefixed__ExpressionAssignment_0_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3023:2: rule__Prefixed__ExpressionAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Prefixed__ExpressionAssignment_0_2_in_rule__Prefixed__Group_0__2__Impl6019);
            rule__Prefixed__ExpressionAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getExpressionAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_0__2__Impl"


    // $ANTLR start "rule__Prefixed__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3039:1: rule__Prefixed__Group_1__0 : rule__Prefixed__Group_1__0__Impl rule__Prefixed__Group_1__1 ;
    public final void rule__Prefixed__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3043:1: ( rule__Prefixed__Group_1__0__Impl rule__Prefixed__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3044:2: rule__Prefixed__Group_1__0__Impl rule__Prefixed__Group_1__1
            {
            pushFollow(FOLLOW_rule__Prefixed__Group_1__0__Impl_in_rule__Prefixed__Group_1__06055);
            rule__Prefixed__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Prefixed__Group_1__1_in_rule__Prefixed__Group_1__06058);
            rule__Prefixed__Group_1__1();

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
    // $ANTLR end "rule__Prefixed__Group_1__0"


    // $ANTLR start "rule__Prefixed__Group_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3051:1: rule__Prefixed__Group_1__0__Impl : ( () ) ;
    public final void rule__Prefixed__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3055:1: ( ( () ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3056:1: ( () )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3056:1: ( () )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3057:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getArithmeticSignedAction_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3058:1: ()
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3060:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getArithmeticSignedAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_1__0__Impl"


    // $ANTLR start "rule__Prefixed__Group_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3070:1: rule__Prefixed__Group_1__1 : rule__Prefixed__Group_1__1__Impl rule__Prefixed__Group_1__2 ;
    public final void rule__Prefixed__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3074:1: ( rule__Prefixed__Group_1__1__Impl rule__Prefixed__Group_1__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3075:2: rule__Prefixed__Group_1__1__Impl rule__Prefixed__Group_1__2
            {
            pushFollow(FOLLOW_rule__Prefixed__Group_1__1__Impl_in_rule__Prefixed__Group_1__16116);
            rule__Prefixed__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Prefixed__Group_1__2_in_rule__Prefixed__Group_1__16119);
            rule__Prefixed__Group_1__2();

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
    // $ANTLR end "rule__Prefixed__Group_1__1"


    // $ANTLR start "rule__Prefixed__Group_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3082:1: rule__Prefixed__Group_1__1__Impl : ( ( '-' ) ) ;
    public final void rule__Prefixed__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3086:1: ( ( ( '-' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3087:1: ( ( '-' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3087:1: ( ( '-' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3088:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getHyphenMinusKeyword_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3089:1: ( '-' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3090:2: '-'
            {
            match(input,27,FOLLOW_27_in_rule__Prefixed__Group_1__1__Impl6148); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getHyphenMinusKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_1__1__Impl"


    // $ANTLR start "rule__Prefixed__Group_1__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3101:1: rule__Prefixed__Group_1__2 : rule__Prefixed__Group_1__2__Impl ;
    public final void rule__Prefixed__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3105:1: ( rule__Prefixed__Group_1__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3106:2: rule__Prefixed__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Prefixed__Group_1__2__Impl_in_rule__Prefixed__Group_1__26180);
            rule__Prefixed__Group_1__2__Impl();

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
    // $ANTLR end "rule__Prefixed__Group_1__2"


    // $ANTLR start "rule__Prefixed__Group_1__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3112:1: rule__Prefixed__Group_1__2__Impl : ( ( rule__Prefixed__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Prefixed__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3116:1: ( ( ( rule__Prefixed__ExpressionAssignment_1_2 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3117:1: ( ( rule__Prefixed__ExpressionAssignment_1_2 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3117:1: ( ( rule__Prefixed__ExpressionAssignment_1_2 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3118:1: ( rule__Prefixed__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getExpressionAssignment_1_2()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3119:1: ( rule__Prefixed__ExpressionAssignment_1_2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3119:2: rule__Prefixed__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Prefixed__ExpressionAssignment_1_2_in_rule__Prefixed__Group_1__2__Impl6207);
            rule__Prefixed__ExpressionAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getExpressionAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_1__2__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3135:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3139:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3140:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__06243);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__06246);
            rule__Atomic__Group_0__1();

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
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3147:1: rule__Atomic__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3151:1: ( ( '(' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3152:1: ( '(' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3152:1: ( '(' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3153:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Atomic__Group_0__0__Impl6274); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3166:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3170:1: ( rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3171:2: rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__16305);
            rule__Atomic__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atomic__Group_0__2_in_rule__Atomic__Group_0__16308);
            rule__Atomic__Group_0__2();

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
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3178:1: rule__Atomic__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3182:1: ( ( ruleExpression ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3183:1: ( ruleExpression )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3183:1: ( ruleExpression )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3184:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Atomic__Group_0__1__Impl6335);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_0__2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3195:1: rule__Atomic__Group_0__2 : rule__Atomic__Group_0__2__Impl ;
    public final void rule__Atomic__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3199:1: ( rule__Atomic__Group_0__2__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3200:2: rule__Atomic__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__2__Impl_in_rule__Atomic__Group_0__26364);
            rule__Atomic__Group_0__2__Impl();

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
    // $ANTLR end "rule__Atomic__Group_0__2"


    // $ANTLR start "rule__Atomic__Group_0__2__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3206:1: rule__Atomic__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3210:1: ( ( ')' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3211:1: ( ')' )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3211:1: ( ')' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3212:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__Atomic__Group_0__2__Impl6392); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__2__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3231:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3235:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3236:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__06429);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__06432);
            rule__Atomic__Group_1__1();

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
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3243:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3247:1: ( ( () ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3248:1: ( () )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3248:1: ( () )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3249:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3250:1: ()
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3252:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3262:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3266:1: ( rule__Atomic__Group_1__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3267:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__16490);
            rule__Atomic__Group_1__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3273:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3277:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3278:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3278:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3279:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3280:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3280:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl6517);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3294:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3298:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3299:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__06551);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__06554);
            rule__Atomic__Group_2__1();

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
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3306:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3310:1: ( ( () ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3311:1: ( () )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3311:1: ( () )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3312:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getStringLiteralAction_2_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3313:1: ()
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3315:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getStringLiteralAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3325:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3329:1: ( rule__Atomic__Group_2__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3330:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__16612);
            rule__Atomic__Group_2__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3336:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3340:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3341:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3341:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3342:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3343:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3343:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl6639);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3357:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3361:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3362:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__06673);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__06676);
            rule__Atomic__Group_3__1();

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
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3369:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3373:1: ( ( () ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3374:1: ( () )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3374:1: ( () )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3375:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getBooleanLiteralAction_3_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3376:1: ()
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3378:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getBooleanLiteralAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3388:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3392:1: ( rule__Atomic__Group_3__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3393:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__16734);
            rule__Atomic__Group_3__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3399:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3403:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3404:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3404:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3405:1: ( rule__Atomic__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3406:1: ( rule__Atomic__ValueAssignment_3_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3406:2: rule__Atomic__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_3_1_in_rule__Atomic__Group_3__1__Impl6761);
            rule__Atomic__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__Atomic__Group_4__0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3420:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3424:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3425:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__06795);
            rule__Atomic__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__06798);
            rule__Atomic__Group_4__1();

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
    // $ANTLR end "rule__Atomic__Group_4__0"


    // $ANTLR start "rule__Atomic__Group_4__0__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3432:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3436:1: ( ( () ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3437:1: ( () )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3437:1: ( () )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3438:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getVariableReferenceAction_4_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3439:1: ()
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3441:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getVariableReferenceAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__0__Impl"


    // $ANTLR start "rule__Atomic__Group_4__1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3451:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3455:1: ( rule__Atomic__Group_4__1__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3456:2: rule__Atomic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__16856);
            rule__Atomic__Group_4__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_4__1"


    // $ANTLR start "rule__Atomic__Group_4__1__Impl"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3462:1: rule__Atomic__Group_4__1__Impl : ( ( rule__Atomic__RefAssignment_4_1 ) ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3466:1: ( ( ( rule__Atomic__RefAssignment_4_1 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3467:1: ( ( rule__Atomic__RefAssignment_4_1 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3467:1: ( ( rule__Atomic__RefAssignment_4_1 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3468:1: ( rule__Atomic__RefAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRefAssignment_4_1()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3469:1: ( rule__Atomic__RefAssignment_4_1 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3469:2: rule__Atomic__RefAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Atomic__RefAssignment_4_1_in_rule__Atomic__Group_4__1__Impl6883);
            rule__Atomic__RefAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getRefAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__1__Impl"


    // $ANTLR start "rule__Model__UnorderedGroup"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3487:1: rule__Model__UnorderedGroup : rule__Model__UnorderedGroup__0 {...}?;
    public final void rule__Model__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3492:1: ( rule__Model__UnorderedGroup__0 {...}?)
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3493:2: rule__Model__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__0_in_rule__Model__UnorderedGroup6921);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3504:1: rule__Model__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Model__TokensAssignment_2 ) ) ) ) ) ;
    public final void rule__Model__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3509:1: ( ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Model__TokensAssignment_2 ) ) ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3510:3: ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Model__TokensAssignment_2 ) ) ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3510:3: ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Model__TokensAssignment_2 ) ) ) ) )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( LA21_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt21=2;
            }
            else if ( LA21_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt21=2;
            }
            else if ( LA21_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt21=2;
            }
            else if ( LA21_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                alt21=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3512:4: ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3512:4: ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3513:5: {...}? => ( ( ( rule__Model__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3513:100: ( ( ( rule__Model__Group_0__0 ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3514:6: ( ( rule__Model__Group_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3520:6: ( ( rule__Model__Group_0__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3522:7: ( rule__Model__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getGroup_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3523:7: ( rule__Model__Group_0__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3523:8: rule__Model__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_0__0_in_rule__Model__UnorderedGroup__Impl7010);
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3529:4: ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3529:4: ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3530:5: {...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3530:100: ( ( ( rule__Model__BoardAssignment_1 ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3531:6: ( ( rule__Model__BoardAssignment_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3537:6: ( ( rule__Model__BoardAssignment_1 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3539:7: ( rule__Model__BoardAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getBoardAssignment_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3540:7: ( rule__Model__BoardAssignment_1 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3540:8: rule__Model__BoardAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__BoardAssignment_1_in_rule__Model__UnorderedGroup__Impl7101);
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3546:4: ({...}? => ( ( ( rule__Model__TokensAssignment_2 ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3546:4: ({...}? => ( ( ( rule__Model__TokensAssignment_2 ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3547:5: {...}? => ( ( ( rule__Model__TokensAssignment_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2)");
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3547:100: ( ( ( rule__Model__TokensAssignment_2 ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3548:6: ( ( rule__Model__TokensAssignment_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 2);
                    selected = true;
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3554:6: ( ( rule__Model__TokensAssignment_2 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3556:7: ( rule__Model__TokensAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getTokensAssignment_2()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3557:7: ( rule__Model__TokensAssignment_2 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3557:8: rule__Model__TokensAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__TokensAssignment_2_in_rule__Model__UnorderedGroup__Impl7192);
                    rule__Model__TokensAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getTokensAssignment_2()); 
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3572:1: rule__Model__UnorderedGroup__0 : rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )? ;
    public final void rule__Model__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3576:1: ( rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )? )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3577:2: rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__07251);
            rule__Model__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3578:2: ( rule__Model__UnorderedGroup__1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:0:0: rule__Model__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__Model__UnorderedGroup__1_in_rule__Model__UnorderedGroup__07254);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3585:1: rule__Model__UnorderedGroup__1 : rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__2 )? ;
    public final void rule__Model__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3589:1: ( rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__2 )? )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3590:2: rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__17279);
            rule__Model__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3591:2: ( rule__Model__UnorderedGroup__2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:0:0: rule__Model__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_rule__Model__UnorderedGroup__2_in_rule__Model__UnorderedGroup__17282);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3598:1: rule__Model__UnorderedGroup__2 : rule__Model__UnorderedGroup__Impl ;
    public final void rule__Model__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3602:1: ( rule__Model__UnorderedGroup__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3603:2: rule__Model__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__27307);
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
    // $ANTLR end "rule__Model__UnorderedGroup__2"


    // $ANTLR start "rule__Board__UnorderedGroup"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3616:1: rule__Board__UnorderedGroup : rule__Board__UnorderedGroup__0 {...}?;
    public final void rule__Board__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getBoardAccess().getUnorderedGroup());
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3621:1: ( rule__Board__UnorderedGroup__0 {...}?)
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3622:2: rule__Board__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__Board__UnorderedGroup__0_in_rule__Board__UnorderedGroup7337);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3633:1: rule__Board__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Board__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Board__Group_1__0 ) ) ) ) ) ;
    public final void rule__Board__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3638:1: ( ( ({...}? => ( ( ( rule__Board__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Board__Group_1__0 ) ) ) ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3639:3: ( ({...}? => ( ( ( rule__Board__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Board__Group_1__0 ) ) ) ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3639:3: ( ({...}? => ( ( ( rule__Board__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Board__Group_1__0 ) ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID||LA24_0==19) && getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3641:4: ({...}? => ( ( ( rule__Board__Group_0__0 ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3641:4: ({...}? => ( ( ( rule__Board__Group_0__0 ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3642:5: {...}? => ( ( ( rule__Board__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Board__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0)");
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3642:100: ( ( ( rule__Board__Group_0__0 ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3643:6: ( ( rule__Board__Group_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBoardAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3649:6: ( ( rule__Board__Group_0__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3651:7: ( rule__Board__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoardAccess().getGroup_0()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3652:7: ( rule__Board__Group_0__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3652:8: rule__Board__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Board__Group_0__0_in_rule__Board__UnorderedGroup__Impl7426);
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
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3658:4: ({...}? => ( ( ( rule__Board__Group_1__0 ) ) ) )
                    {
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3658:4: ({...}? => ( ( ( rule__Board__Group_1__0 ) ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3659:5: {...}? => ( ( ( rule__Board__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Board__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1)");
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3659:100: ( ( ( rule__Board__Group_1__0 ) ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3660:6: ( ( rule__Board__Group_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBoardAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3666:6: ( ( rule__Board__Group_1__0 ) )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3668:7: ( rule__Board__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoardAccess().getGroup_1()); 
                    }
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3669:7: ( rule__Board__Group_1__0 )
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3669:8: rule__Board__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Board__Group_1__0_in_rule__Board__UnorderedGroup__Impl7517);
                    rule__Board__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoardAccess().getGroup_1()); 
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3684:1: rule__Board__UnorderedGroup__0 : rule__Board__UnorderedGroup__Impl ( rule__Board__UnorderedGroup__1 )? ;
    public final void rule__Board__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3688:1: ( rule__Board__UnorderedGroup__Impl ( rule__Board__UnorderedGroup__1 )? )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3689:2: rule__Board__UnorderedGroup__Impl ( rule__Board__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__Board__UnorderedGroup__Impl_in_rule__Board__UnorderedGroup__07576);
            rule__Board__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3690:2: ( rule__Board__UnorderedGroup__1 )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:0:0: rule__Board__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__Board__UnorderedGroup__1_in_rule__Board__UnorderedGroup__07579);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3697:1: rule__Board__UnorderedGroup__1 : rule__Board__UnorderedGroup__Impl ;
    public final void rule__Board__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3701:1: ( rule__Board__UnorderedGroup__Impl )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3702:2: rule__Board__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__Board__UnorderedGroup__Impl_in_rule__Board__UnorderedGroup__17604);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3713:1: rule__Model__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3717:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3718:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3718:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3719:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_0_17636); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3728:1: rule__Model__PlayerAssignment_0_2 : ( rulePlayer ) ;
    public final void rule__Model__PlayerAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3732:1: ( ( rulePlayer ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3733:1: ( rulePlayer )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3733:1: ( rulePlayer )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3734:1: rulePlayer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPlayerPlayerParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePlayer_in_rule__Model__PlayerAssignment_0_27667);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3743:1: rule__Model__BoardAssignment_1 : ( ruleBoard ) ;
    public final void rule__Model__BoardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3747:1: ( ( ruleBoard ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3748:1: ( ruleBoard )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3748:1: ( ruleBoard )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3749:1: ruleBoard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getBoardBoardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleBoard_in_rule__Model__BoardAssignment_17698);
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3758:1: rule__Model__TokensAssignment_2 : ( ruleTokens ) ;
    public final void rule__Model__TokensAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3762:1: ( ( ruleTokens ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3763:1: ( ruleTokens )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3763:1: ( ruleTokens )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3764:1: ruleTokens
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getTokensTokensParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTokens_in_rule__Model__TokensAssignment_27729);
            ruleTokens();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getTokensTokensParserRuleCall_2_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Player__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3773:1: rule__Player__NameAssignment_0 : ( ( 'Players' ) ) ;
    public final void rule__Player__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3777:1: ( ( ( 'Players' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3778:1: ( ( 'Players' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3778:1: ( ( 'Players' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3779:1: ( 'Players' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getNamePlayersKeyword_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3780:1: ( 'Players' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3781:1: 'Players'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getNamePlayersKeyword_0_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Player__NameAssignment_07765); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getNamePlayersKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getNamePlayersKeyword_0_0()); 
            }

            }


            }

        }
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3796:1: rule__Player__PlayercountAssignment_1 : ( RULE_INT ) ;
    public final void rule__Player__PlayercountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3800:1: ( ( RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3801:1: ( RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3801:1: ( RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3802:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getPlayercountINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Player__PlayercountAssignment_17804); if (state.failed) return ;
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


    // $ANTLR start "rule__Player__AttributesAssignment_2_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3811:1: rule__Player__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Player__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3815:1: ( ( ruleAttribute ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3816:1: ( ruleAttribute )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3816:1: ( ruleAttribute )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3817:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlayerAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__Player__AttributesAssignment_2_17835);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlayerAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__AttributesAssignment_2_1"


    // $ANTLR start "rule__Board__NameAssignment_0_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3826:1: rule__Board__NameAssignment_0_0 : ( ( 'Board' ) ) ;
    public final void rule__Board__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3830:1: ( ( ( 'Board' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3831:1: ( ( 'Board' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3831:1: ( ( 'Board' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3832:1: ( 'Board' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getNameBoardKeyword_0_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3833:1: ( 'Board' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3834:1: 'Board'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getNameBoardKeyword_0_0_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Board__NameAssignment_0_07871); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getNameBoardKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getNameBoardKeyword_0_0_0()); 
            }

            }


            }

        }
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3849:1: rule__Board__FieldsAssignment_0_2 : ( ruleField ) ;
    public final void rule__Board__FieldsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3853:1: ( ( ruleField ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3854:1: ( ruleField )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3854:1: ( ruleField )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3855:1: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getFieldsFieldParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleField_in_rule__Board__FieldsAssignment_0_27910);
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


    // $ANTLR start "rule__Board__AttributesAssignment_1_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3864:1: rule__Board__AttributesAssignment_1_0 : ( ruleAttribute ) ;
    public final void rule__Board__AttributesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3868:1: ( ( ruleAttribute ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3869:1: ( ruleAttribute )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3869:1: ( ruleAttribute )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3870:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoardAccess().getAttributesAttributeParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__Board__AttributesAssignment_1_07941);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoardAccess().getAttributesAttributeParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__AttributesAssignment_1_0"


    // $ANTLR start "rule__Tokens__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3879:1: rule__Tokens__NameAssignment_0 : ( ( 'Tokens' ) ) ;
    public final void rule__Tokens__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3883:1: ( ( ( 'Tokens' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3884:1: ( ( 'Tokens' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3884:1: ( ( 'Tokens' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3885:1: ( 'Tokens' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokensAccess().getNameTokensKeyword_0_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3886:1: ( 'Tokens' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3887:1: 'Tokens'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokensAccess().getNameTokensKeyword_0_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Tokens__NameAssignment_07977); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokensAccess().getNameTokensKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokensAccess().getNameTokensKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tokens__NameAssignment_0"


    // $ANTLR start "rule__Tokens__TokentypesAssignment_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3902:1: rule__Tokens__TokentypesAssignment_2 : ( ruleTokenType ) ;
    public final void rule__Tokens__TokentypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3906:1: ( ( ruleTokenType ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3907:1: ( ruleTokenType )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3907:1: ( ruleTokenType )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3908:1: ruleTokenType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokensAccess().getTokentypesTokenTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTokenType_in_rule__Tokens__TokentypesAssignment_28016);
            ruleTokenType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokensAccess().getTokentypesTokenTypeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tokens__TokentypesAssignment_2"


    // $ANTLR start "rule__TokenType__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3917:1: rule__TokenType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TokenType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3921:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3922:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3922:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3923:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TokenType__NameAssignment_08047); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TokenType__NameAssignment_0"


    // $ANTLR start "rule__TokenType__VariablesAssignment_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3932:1: rule__TokenType__VariablesAssignment_1 : ( ruleVariable ) ;
    public final void rule__TokenType__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3936:1: ( ( ruleVariable ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3937:1: ( ruleVariable )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3937:1: ( ruleVariable )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3938:1: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenTypeAccess().getVariablesVariableParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_rule__TokenType__VariablesAssignment_18078);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenTypeAccess().getVariablesVariableParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TokenType__VariablesAssignment_1"


    // $ANTLR start "rule__TokenType__AttributesAssignment_2_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3947:1: rule__TokenType__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__TokenType__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3951:1: ( ( ruleAttribute ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3952:1: ( ruleAttribute )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3952:1: ( ruleAttribute )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3953:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTokenTypeAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__TokenType__AttributesAssignment_2_18109);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTokenTypeAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TokenType__AttributesAssignment_2_1"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3962:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3966:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3967:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3967:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3968:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_08140); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3977:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3981:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3982:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3982:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3983:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_08171); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3992:1: rule__Field__XAssignment_2 : ( RULE_INT ) ;
    public final void rule__Field__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3996:1: ( ( RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3997:1: ( RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3997:1: ( RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3998:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getXINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__XAssignment_28202); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4007:1: rule__Field__YAssignment_4 : ( RULE_INT ) ;
    public final void rule__Field__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4011:1: ( ( RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4012:1: ( RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4012:1: ( RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4013:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getYINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__YAssignment_48233); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4022:1: rule__Field__ZAssignment_6 : ( RULE_INT ) ;
    public final void rule__Field__ZAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4026:1: ( ( RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4027:1: ( RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4027:1: ( RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4028:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getZINTTerminalRuleCall_6_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Field__ZAssignment_68264); if (state.failed) return ;
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
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4037:1: rule__Field__NeighboursAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Field__NeighboursAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4041:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4042:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4042:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4043:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNeighboursFieldCrossReference_9_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4044:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4045:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNeighboursFieldIDTerminalRuleCall_9_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NeighboursAssignment_98299); if (state.failed) return ;
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


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4063:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4067:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4068:1: ( RULE_ID )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4068:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4069:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_08341); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_0"


    // $ANTLR start "rule__Variable__ExpressionAssignment_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4078:1: rule__Variable__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Variable__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4082:1: ( ( ruleExpression ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4083:1: ( ruleExpression )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4083:1: ( ruleExpression )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4084:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Variable__ExpressionAssignment_28372);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ExpressionAssignment_2"


    // $ANTLR start "rule__BooleanExpression__OpAssignment_1_0_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4093:1: rule__BooleanExpression__OpAssignment_1_0_1 : ( ( rule__BooleanExpression__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__BooleanExpression__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4097:1: ( ( ( rule__BooleanExpression__OpAlternatives_1_0_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4098:1: ( ( rule__BooleanExpression__OpAlternatives_1_0_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4098:1: ( ( rule__BooleanExpression__OpAlternatives_1_0_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4099:1: ( rule__BooleanExpression__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4100:1: ( rule__BooleanExpression__OpAlternatives_1_0_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4100:2: rule__BooleanExpression__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__BooleanExpression__OpAlternatives_1_0_1_0_in_rule__BooleanExpression__OpAssignment_1_0_18403);
            rule__BooleanExpression__OpAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getOpAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__OpAssignment_1_0_1"


    // $ANTLR start "rule__BooleanExpression__RightAssignment_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4109:1: rule__BooleanExpression__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__BooleanExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4113:1: ( ( ruleComparison ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4114:1: ( ruleComparison )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4114:1: ( ruleComparison )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4115:1: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getRightComparisonParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_rule__BooleanExpression__RightAssignment_1_18436);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getRightComparisonParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__RightAssignment_1_1"


    // $ANTLR start "rule__Comparison__OpAssignment_1_0_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4124:1: rule__Comparison__OpAssignment_1_0_1 : ( ( '<' ) ) ;
    public final void rule__Comparison__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4128:1: ( ( ( '<' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4129:1: ( ( '<' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4129:1: ( ( '<' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4130:1: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_0_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4131:1: ( '<' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4132:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_0_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Comparison__OpAssignment_1_0_18472); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OpAssignment_1_0_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4147:1: rule__Comparison__RightAssignment_1_1 : ( ruleEquals ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4151:1: ( ( ruleEquals ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4152:1: ( ruleEquals )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4152:1: ( ruleEquals )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4153:1: ruleEquals
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightEqualsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEquals_in_rule__Comparison__RightAssignment_1_18511);
            ruleEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightEqualsParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_1"


    // $ANTLR start "rule__Equals__OpAssignment_1_0_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4162:1: rule__Equals__OpAssignment_1_0_1 : ( ( '==' ) ) ;
    public final void rule__Equals__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4166:1: ( ( ( '==' ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4167:1: ( ( '==' ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4167:1: ( ( '==' ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4168:1: ( '==' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4169:1: ( '==' )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4170:1: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Equals__OpAssignment_1_0_18547); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__OpAssignment_1_0_1"


    // $ANTLR start "rule__Equals__RightAssignment_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4185:1: rule__Equals__RightAssignment_1_1 : ( ruleAddition ) ;
    public final void rule__Equals__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4189:1: ( ( ruleAddition ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4190:1: ( ruleAddition )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4190:1: ( ruleAddition )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4191:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualsAccess().getRightAdditionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__Equals__RightAssignment_1_18586);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualsAccess().getRightAdditionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__RightAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4200:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4204:1: ( ( ruleMultiplication ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4205:1: ( ruleMultiplication )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4205:1: ( ruleMultiplication )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4206:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_18617);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__OpAssignment_1_0_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4215:1: rule__Multiplication__OpAssignment_1_0_1 : ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Multiplication__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4219:1: ( ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4220:1: ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4220:1: ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4221:1: ( rule__Multiplication__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4222:1: ( rule__Multiplication__OpAlternatives_1_0_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4222:2: rule__Multiplication__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__OpAlternatives_1_0_1_0_in_rule__Multiplication__OpAssignment_1_0_18648);
            rule__Multiplication__OpAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getOpAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OpAssignment_1_0_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4231:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrefixed ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4235:1: ( ( rulePrefixed ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4236:1: ( rulePrefixed )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4236:1: ( rulePrefixed )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4237:1: rulePrefixed
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightPrefixedParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePrefixed_in_rule__Multiplication__RightAssignment_1_18681);
            rulePrefixed();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightPrefixedParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__Prefixed__ExpressionAssignment_0_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4246:1: rule__Prefixed__ExpressionAssignment_0_2 : ( ruleAtomic ) ;
    public final void rule__Prefixed__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4250:1: ( ( ruleAtomic ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4251:1: ( ruleAtomic )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4251:1: ( ruleAtomic )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4252:1: ruleAtomic
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtomic_in_rule__Prefixed__ExpressionAssignment_0_28712);
            ruleAtomic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__ExpressionAssignment_0_2"


    // $ANTLR start "rule__Prefixed__ExpressionAssignment_1_2"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4261:1: rule__Prefixed__ExpressionAssignment_1_2 : ( ruleAtomic ) ;
    public final void rule__Prefixed__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4265:1: ( ( ruleAtomic ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4266:1: ( ruleAtomic )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4266:1: ( ruleAtomic )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4267:1: ruleAtomic
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtomic_in_rule__Prefixed__ExpressionAssignment_1_28743);
            ruleAtomic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4276:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4280:1: ( ( RULE_INT ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4281:1: ( RULE_INT )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4281:1: ( RULE_INT )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4282:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_18774); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4291:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4295:1: ( ( RULE_STRING ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4296:1: ( RULE_STRING )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4296:1: ( RULE_STRING )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4297:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_2_18805); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_3_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4306:1: rule__Atomic__ValueAssignment_3_1 : ( ( rule__Atomic__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4310:1: ( ( ( rule__Atomic__ValueAlternatives_3_1_0 ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4311:1: ( ( rule__Atomic__ValueAlternatives_3_1_0 ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4311:1: ( ( rule__Atomic__ValueAlternatives_3_1_0 ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4312:1: ( rule__Atomic__ValueAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAlternatives_3_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4313:1: ( rule__Atomic__ValueAlternatives_3_1_0 )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4313:2: rule__Atomic__ValueAlternatives_3_1_0
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAlternatives_3_1_0_in_rule__Atomic__ValueAssignment_3_18836);
            rule__Atomic__ValueAlternatives_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAlternatives_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_3_1"


    // $ANTLR start "rule__Atomic__RefAssignment_4_1"
    // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4322:1: rule__Atomic__RefAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__RefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4326:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4327:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4327:1: ( ( RULE_ID ) )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4328:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRefVariableCrossReference_4_1_0()); 
            }
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4329:1: ( RULE_ID )
            // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:4330:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRefVariableIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__RefAssignment_4_18873); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getRefVariableIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getRefVariableCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__RefAssignment_4_1"

    // $ANTLR start synpred25_InternalBGL
    public final void synpred25_InternalBGL_fragment() throws RecognitionException {   
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3512:4: ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3512:4: ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) )
        {
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3512:4: ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3513:5: {...}? => ( ( ( rule__Model__Group_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred25_InternalBGL", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
        }
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3513:100: ( ( ( rule__Model__Group_0__0 ) ) )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3514:6: ( ( rule__Model__Group_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3520:6: ( ( rule__Model__Group_0__0 ) )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3522:7: ( rule__Model__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getModelAccess().getGroup_0()); 
        }
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3523:7: ( rule__Model__Group_0__0 )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3523:8: rule__Model__Group_0__0
        {
        pushFollow(FOLLOW_rule__Model__Group_0__0_in_synpred25_InternalBGL7010);
        rule__Model__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalBGL

    // $ANTLR start synpred26_InternalBGL
    public final void synpred26_InternalBGL_fragment() throws RecognitionException {   
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3529:4: ( ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) ) )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3529:4: ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) )
        {
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3529:4: ({...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) ) )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3530:5: {...}? => ( ( ( rule__Model__BoardAssignment_1 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred26_InternalBGL", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
        }
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3530:100: ( ( ( rule__Model__BoardAssignment_1 ) ) )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3531:6: ( ( rule__Model__BoardAssignment_1 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3537:6: ( ( rule__Model__BoardAssignment_1 ) )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3539:7: ( rule__Model__BoardAssignment_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getModelAccess().getBoardAssignment_1()); 
        }
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3540:7: ( rule__Model__BoardAssignment_1 )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3540:8: rule__Model__BoardAssignment_1
        {
        pushFollow(FOLLOW_rule__Model__BoardAssignment_1_in_synpred26_InternalBGL7101);
        rule__Model__BoardAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred26_InternalBGL

    // $ANTLR start synpred27_InternalBGL
    public final void synpred27_InternalBGL_fragment() throws RecognitionException {   
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3578:2: ( rule__Model__UnorderedGroup__1 )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3578:2: rule__Model__UnorderedGroup__1
        {
        pushFollow(FOLLOW_rule__Model__UnorderedGroup__1_in_synpred27_InternalBGL7254);
        rule__Model__UnorderedGroup__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalBGL

    // $ANTLR start synpred28_InternalBGL
    public final void synpred28_InternalBGL_fragment() throws RecognitionException {   
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3591:2: ( rule__Model__UnorderedGroup__2 )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3591:2: rule__Model__UnorderedGroup__2
        {
        pushFollow(FOLLOW_rule__Model__UnorderedGroup__2_in_synpred28_InternalBGL7282);
        rule__Model__UnorderedGroup__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalBGL

    // $ANTLR start synpred29_InternalBGL
    public final void synpred29_InternalBGL_fragment() throws RecognitionException {   
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3641:4: ( ({...}? => ( ( ( rule__Board__Group_0__0 ) ) ) ) )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3641:4: ({...}? => ( ( ( rule__Board__Group_0__0 ) ) ) )
        {
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3641:4: ({...}? => ( ( ( rule__Board__Group_0__0 ) ) ) )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3642:5: {...}? => ( ( ( rule__Board__Group_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred29_InternalBGL", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0)");
        }
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3642:100: ( ( ( rule__Board__Group_0__0 ) ) )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3643:6: ( ( rule__Board__Group_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getBoardAccess().getUnorderedGroup(), 0);
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3649:6: ( ( rule__Board__Group_0__0 ) )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3651:7: ( rule__Board__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBoardAccess().getGroup_0()); 
        }
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3652:7: ( rule__Board__Group_0__0 )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3652:8: rule__Board__Group_0__0
        {
        pushFollow(FOLLOW_rule__Board__Group_0__0_in_synpred29_InternalBGL7426);
        rule__Board__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred29_InternalBGL

    // $ANTLR start synpred30_InternalBGL
    public final void synpred30_InternalBGL_fragment() throws RecognitionException {   
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3690:2: ( rule__Board__UnorderedGroup__1 )
        // ../hu.bme.aut.gergelyszaz.BGL.ui/src-gen/hu/bme/aut/gergelyszaz/ui/contentassist/antlr/internal/InternalBGL.g:3690:2: rule__Board__UnorderedGroup__1
        {
        pushFollow(FOLLOW_rule__Board__UnorderedGroup__1_in_synpred30_InternalBGL7579);
        rule__Board__UnorderedGroup__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalBGL

    // Delegated rules

    public final boolean synpred26_InternalBGL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalBGL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalBGL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalBGL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalBGL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalBGL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalBGL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalBGL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalBGL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalBGL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalBGL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalBGL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\10\uffff";
    static final String DFA25_eofS =
        "\1\4\7\uffff";
    static final String DFA25_minS =
        "\1\4\1\22\1\24\1\0\1\uffff\1\0\1\4\1\uffff";
    static final String DFA25_maxS =
        "\1\37\1\22\1\24\1\0\1\uffff\1\0\1\23\1\uffff";
    static final String DFA25_acceptS =
        "\4\uffff\1\2\2\uffff\1\1";
    static final String DFA25_specialS =
        "\3\uffff\1\0\1\uffff\1\1\2\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\14\uffff\1\4\1\uffff\1\3\12\uffff\1\1\1\4",
            "\1\5",
            "\1\6",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\2\16\uffff\1\3",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "3690:2: ( rule__Board__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_3 = input.LA(1);

                         
                        int index25_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( synpred30_InternalBGL() && getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 1) ) {s = 7;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getBoardAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index25_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_5 = input.LA(1);

                         
                        int index25_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( synpred30_InternalBGL() && getUnorderedGroupHelper().canSelect(grammarAccess.getBoardAccess().getUnorderedGroup(), 0) ) {s = 7;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getBoardAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index25_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlayer_in_entryRulePlayer127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlayer134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__Group__0_in_rulePlayer160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoard_in_entryRuleBoard187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoard194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__UnorderedGroup_in_ruleBoard220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTokens_in_entryRuleTokens247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTokens254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tokens__Group__0_in_ruleTokens280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTokenType_in_entryRuleTokenType307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTokenType314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TokenType__Group__0_in_ruleTokenType340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleExpression582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group__0_in_ruleBooleanExpression641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquals_in_entryRuleEquals728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquals735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equals__Group__0_in_ruleEquals761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixed_in_entryRulePrefixed908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefixed915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefixed__Alternatives_in_rulePrefixed941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BooleanExpression__OpAlternatives_1_0_1_01041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BooleanExpression__OpAlternatives_1_0_1_01061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Multiplication__OpAlternatives_1_0_1_01147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Multiplication__OpAlternatives_1_0_1_01167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefixed__Group_0__0_in_rule__Prefixed__Alternatives1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefixed__Group_1__0_in_rule__Prefixed__Alternatives1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Prefixed__Alternatives1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__0_in_rule__Atomic__Alternatives1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Atomic__ValueAlternatives_3_1_01375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Atomic__ValueAlternatives_3_1_01395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__01428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__01431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Model__Group_0__0__Impl1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__11490 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Model__Group_0__2_in_rule__Model__Group_0__11493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__2__Impl_in_rule__Model__Group_0__21550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PlayerAssignment_0_2_in_rule__Model__Group_0__2__Impl1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__Group__0__Impl_in_rule__Player__Group__01613 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Player__Group__1_in_rule__Player__Group__01616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__NameAssignment_0_in_rule__Player__Group__0__Impl1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__Group__1__Impl_in_rule__Player__Group__11673 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Player__Group__2_in_rule__Player__Group__11676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__PlayercountAssignment_1_in_rule__Player__Group__1__Impl1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__Group__2__Impl_in_rule__Player__Group__21733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__Group_2__0_in_rule__Player__Group__2__Impl1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__Group_2__0__Impl_in_rule__Player__Group_2__01797 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Player__Group_2__1_in_rule__Player__Group_2__01800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Player__Group_2__0__Impl1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__Group_2__1__Impl_in_rule__Player__Group_2__11859 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Player__Group_2__2_in_rule__Player__Group_2__11862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Player__AttributesAssignment_2_1_in_rule__Player__Group_2__1__Impl1889 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Player__Group_2__2__Impl_in_rule__Player__Group_2__21920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Player__Group_2__2__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__Group_0__0__Impl_in_rule__Board__Group_0__01985 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Board__Group_0__1_in_rule__Board__Group_0__01988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__NameAssignment_0_0_in_rule__Board__Group_0__0__Impl2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__Group_0__1__Impl_in_rule__Board__Group_0__12045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Board__Group_0__2_in_rule__Board__Group_0__12048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Board__Group_0__1__Impl2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__Group_0__2__Impl_in_rule__Board__Group_0__22107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__FieldsAssignment_0_2_in_rule__Board__Group_0__2__Impl2134 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Board__Group_1__0__Impl_in_rule__Board__Group_1__02171 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Board__Group_1__1_in_rule__Board__Group_1__02174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__AttributesAssignment_1_0_in_rule__Board__Group_1__0__Impl2201 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Board__Group_1__1__Impl_in_rule__Board__Group_1__12232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Board__Group_1__1__Impl2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tokens__Group__0__Impl_in_rule__Tokens__Group__02295 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Tokens__Group__1_in_rule__Tokens__Group__02298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tokens__NameAssignment_0_in_rule__Tokens__Group__0__Impl2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tokens__Group__1__Impl_in_rule__Tokens__Group__12355 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Tokens__Group__2_in_rule__Tokens__Group__12358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Tokens__Group__1__Impl2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tokens__Group__2__Impl_in_rule__Tokens__Group__22417 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Tokens__Group__3_in_rule__Tokens__Group__22420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tokens__TokentypesAssignment_2_in_rule__Tokens__Group__2__Impl2447 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Tokens__Group__3__Impl_in_rule__Tokens__Group__32478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Tokens__Group__3__Impl2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TokenType__Group__0__Impl_in_rule__TokenType__Group__02545 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__TokenType__Group__1_in_rule__TokenType__Group__02548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TokenType__NameAssignment_0_in_rule__TokenType__Group__0__Impl2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TokenType__Group__1__Impl_in_rule__TokenType__Group__12605 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__TokenType__Group__2_in_rule__TokenType__Group__12608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TokenType__VariablesAssignment_1_in_rule__TokenType__Group__1__Impl2635 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__TokenType__Group__2__Impl_in_rule__TokenType__Group__22666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TokenType__Group_2__0_in_rule__TokenType__Group__2__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TokenType__Group_2__0__Impl_in_rule__TokenType__Group_2__02730 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__TokenType__Group_2__1_in_rule__TokenType__Group_2__02733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TokenType__Group_2__0__Impl2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TokenType__Group_2__1__Impl_in_rule__TokenType__Group_2__12792 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__TokenType__Group_2__2_in_rule__TokenType__Group_2__12795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TokenType__AttributesAssignment_2_1_in_rule__TokenType__Group_2__1__Impl2822 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__TokenType__Group_2__2__Impl_in_rule__TokenType__Group_2__22853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TokenType__Group_2__2__Impl2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02918 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Attribute__Group__1__Impl3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03041 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_0_in_rule__Field__Group__0__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Field__Group__1__Impl3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23163 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__XAssignment_2_in_rule__Field__Group__2__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33223 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__3__Impl3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43285 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__43288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__YAssignment_4_in_rule__Field__Group__4__Impl3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__53345 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__6_in_rule__Field__Group__53348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__5__Impl3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__63407 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__7_in_rule__Field__Group__63410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__ZAssignment_6_in_rule__Field__Group__6__Impl3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__7__Impl_in_rule__Field__Group__73467 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Field__Group__8_in_rule__Field__Group__73470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__7__Impl3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__8__Impl_in_rule__Field__Group__83529 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Field__Group__9_in_rule__Field__Group__83532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Field__Group__8__Impl3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__9__Impl_in_rule__Field__Group__93591 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Field__Group__10_in_rule__Field__Group__93594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NeighboursAssignment_9_in_rule__Field__Group__9__Impl3621 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Field__Group__10__Impl_in_rule__Field__Group__103652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Field__Group__10__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__03736 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__03739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Group__0__Impl3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__13796 = new BitSet(new long[]{0x0000000018218070L});
    public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__13799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Variable__Group__1__Impl3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__23858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__ExpressionAssignment_2_in_rule__Variable__Group__2__Impl3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group__0__Impl_in_rule__BooleanExpression__Group__03921 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group__1_in_rule__BooleanExpression__Group__03924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__BooleanExpression__Group__0__Impl3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group__1__Impl_in_rule__BooleanExpression__Group__13980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group_1__0_in_rule__BooleanExpression__Group__1__Impl4007 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group_1__0__Impl_in_rule__BooleanExpression__Group_1__04042 = new BitSet(new long[]{0x0000000018218070L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group_1__1_in_rule__BooleanExpression__Group_1__04045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group_1_0__0_in_rule__BooleanExpression__Group_1__0__Impl4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group_1__1__Impl_in_rule__BooleanExpression__Group_1__14102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__RightAssignment_1_1_in_rule__BooleanExpression__Group_1__1__Impl4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group_1_0__0__Impl_in_rule__BooleanExpression__Group_1_0__04163 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group_1_0__1_in_rule__BooleanExpression__Group_1_0__04166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group_1_0__1__Impl_in_rule__BooleanExpression__Group_1_0__14224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__OpAssignment_1_0_1_in_rule__BooleanExpression__Group_1_0__1__Impl4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04285 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquals_in_rule__Comparison__Group__0__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl4371 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__04406 = new BitSet(new long[]{0x0000000018218070L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__04409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0__0_in_rule__Comparison__Group_1__0__Impl4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__14466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_1_in_rule__Comparison__Group_1__1__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0__0__Impl_in_rule__Comparison__Group_1_0__04527 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0__1_in_rule__Comparison__Group_1_0__04530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1_0__1__Impl_in_rule__Comparison__Group_1_0__14588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAssignment_1_0_1_in_rule__Comparison__Group_1_0__1__Impl4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equals__Group__0__Impl_in_rule__Equals__Group__04649 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Equals__Group__1_in_rule__Equals__Group__04652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Equals__Group__0__Impl4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equals__Group__1__Impl_in_rule__Equals__Group__14708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equals__Group_1__0_in_rule__Equals__Group__1__Impl4735 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Equals__Group_1__0__Impl_in_rule__Equals__Group_1__04770 = new BitSet(new long[]{0x0000000018218070L});
    public static final BitSet FOLLOW_rule__Equals__Group_1__1_in_rule__Equals__Group_1__04773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equals__Group_1_0__0_in_rule__Equals__Group_1__0__Impl4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equals__Group_1__1__Impl_in_rule__Equals__Group_1__14830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equals__RightAssignment_1_1_in_rule__Equals__Group_1__1__Impl4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equals__Group_1_0__0__Impl_in_rule__Equals__Group_1_0__04891 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Equals__Group_1_0__1_in_rule__Equals__Group_1_0__04894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equals__Group_1_0__1__Impl_in_rule__Equals__Group_1_0__14952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equals__OpAssignment_1_0_1_in_rule__Equals__Group_1_0__1__Impl4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__05013 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__05016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__15072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl5099 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__05134 = new BitSet(new long[]{0x0000000018218070L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__05137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__15194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__05255 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__05258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__15316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Addition__Group_1_0_0__1__Impl5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__05379 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__05382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__15440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Addition__Group_1_0_1__1__Impl5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__05503 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__05506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixed_in_rule__Multiplication__Group__0__Impl5533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__15562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl5589 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__05624 = new BitSet(new long[]{0x0000000018218070L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__05627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__0_in_rule__Multiplication__Group_1__0__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__15684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__0__Impl_in_rule__Multiplication__Group_1_0__05745 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__1_in_rule__Multiplication__Group_1_0__05748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__1__Impl_in_rule__Multiplication__Group_1_0__15806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__OpAssignment_1_0_1_in_rule__Multiplication__Group_1_0__1__Impl5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefixed__Group_0__0__Impl_in_rule__Prefixed__Group_0__05867 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Prefixed__Group_0__1_in_rule__Prefixed__Group_0__05870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefixed__Group_0__1__Impl_in_rule__Prefixed__Group_0__15928 = new BitSet(new long[]{0x0000000018218070L});
    public static final BitSet FOLLOW_rule__Prefixed__Group_0__2_in_rule__Prefixed__Group_0__15931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Prefixed__Group_0__1__Impl5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefixed__Group_0__2__Impl_in_rule__Prefixed__Group_0__25992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefixed__ExpressionAssignment_0_2_in_rule__Prefixed__Group_0__2__Impl6019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefixed__Group_1__0__Impl_in_rule__Prefixed__Group_1__06055 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Prefixed__Group_1__1_in_rule__Prefixed__Group_1__06058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefixed__Group_1__1__Impl_in_rule__Prefixed__Group_1__16116 = new BitSet(new long[]{0x0000000018218070L});
    public static final BitSet FOLLOW_rule__Prefixed__Group_1__2_in_rule__Prefixed__Group_1__16119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Prefixed__Group_1__1__Impl6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefixed__Group_1__2__Impl_in_rule__Prefixed__Group_1__26180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prefixed__ExpressionAssignment_1_2_in_rule__Prefixed__Group_1__2__Impl6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__06243 = new BitSet(new long[]{0x0000000018218070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__06246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Atomic__Group_0__0__Impl6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__16305 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__2_in_rule__Atomic__Group_0__16308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Atomic__Group_0__1__Impl6335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__2__Impl_in_rule__Atomic__Group_0__26364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Atomic__Group_0__2__Impl6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__06429 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__06432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__16490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__06551 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__06554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__16612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl6639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__06673 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__06676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__16734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_3_1_in_rule__Atomic__Group_3__1__Impl6761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__0__Impl_in_rule__Atomic__Group_4__06795 = new BitSet(new long[]{0x0000000018218070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1_in_rule__Atomic__Group_4__06798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_4__1__Impl_in_rule__Atomic__Group_4__16856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__RefAssignment_4_1_in_rule__Atomic__Group_4__1__Impl6883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__0_in_rule__Model__UnorderedGroup6921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0_in_rule__Model__UnorderedGroup__Impl7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__BoardAssignment_1_in_rule__Model__UnorderedGroup__Impl7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TokensAssignment_2_in_rule__Model__UnorderedGroup__Impl7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__07251 = new BitSet(new long[]{0x00000000C0020012L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__1_in_rule__Model__UnorderedGroup__07254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__17279 = new BitSet(new long[]{0x00000000C0020012L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__2_in_rule__Model__UnorderedGroup__17282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__27307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__UnorderedGroup__0_in_rule__Board__UnorderedGroup7337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__Group_0__0_in_rule__Board__UnorderedGroup__Impl7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__Group_1__0_in_rule__Board__UnorderedGroup__Impl7517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__UnorderedGroup__Impl_in_rule__Board__UnorderedGroup__07576 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_rule__Board__UnorderedGroup__1_in_rule__Board__UnorderedGroup__07579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__UnorderedGroup__Impl_in_rule__Board__UnorderedGroup__17604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_0_17636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlayer_in_rule__Model__PlayerAssignment_0_27667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoard_in_rule__Model__BoardAssignment_17698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTokens_in_rule__Model__TokensAssignment_27729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Player__NameAssignment_07765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Player__PlayercountAssignment_17804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Player__AttributesAssignment_2_17835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Board__NameAssignment_0_07871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Board__FieldsAssignment_0_27910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Board__AttributesAssignment_1_07941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Tokens__NameAssignment_07977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTokenType_in_rule__Tokens__TokentypesAssignment_28016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TokenType__NameAssignment_08047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__TokenType__VariablesAssignment_18078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__TokenType__AttributesAssignment_2_18109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_08140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_08171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__XAssignment_28202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__YAssignment_48233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Field__ZAssignment_68264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NeighboursAssignment_98299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_08341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Variable__ExpressionAssignment_28372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__OpAlternatives_1_0_1_0_in_rule__BooleanExpression__OpAssignment_1_0_18403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__BooleanExpression__RightAssignment_1_18436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Comparison__OpAssignment_1_0_18472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquals_in_rule__Comparison__RightAssignment_1_18511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Equals__OpAssignment_1_0_18547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Equals__RightAssignment_1_18586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_18617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__OpAlternatives_1_0_1_0_in_rule__Multiplication__OpAssignment_1_0_18648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixed_in_rule__Multiplication__RightAssignment_1_18681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Prefixed__ExpressionAssignment_0_28712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Prefixed__ExpressionAssignment_1_28743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_18774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_2_18805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAlternatives_3_1_0_in_rule__Atomic__ValueAssignment_3_18836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__RefAssignment_4_18873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0_in_synpred25_InternalBGL7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__BoardAssignment_1_in_synpred26_InternalBGL7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__1_in_synpred27_InternalBGL7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__2_in_synpred28_InternalBGL7282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__Group_0__0_in_synpred29_InternalBGL7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Board__UnorderedGroup__1_in_synpred30_InternalBGL7579 = new BitSet(new long[]{0x0000000000000002L});

}
