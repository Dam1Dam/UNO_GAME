package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Points'", "'Cry Uno'", "'Same number'", "'Same Color'", "'2 players game'", "'Uno Mao'", "'Exchange Card'", "'Suite'", "'Hands Down'", "'Three Hands Uno'", "'Card Bomb'", "'ShownDown'", "'Roulette'", "'All Cards'", "'All except special cards'", "':'", "'Base:'", "'-'", "'Variants:'", "'Hands:'", "'/'", "'Special Cards:'", "'WildCard:'", "'Stacking:'", "'Uno game'"
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
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleUNO_DamienCantin"
    // InternalMyDsl.g:53:1: entryRuleUNO_DamienCantin : ruleUNO_DamienCantin EOF ;
    public final void entryRuleUNO_DamienCantin() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleUNO_DamienCantin EOF )
            // InternalMyDsl.g:55:1: ruleUNO_DamienCantin EOF
            {
             before(grammarAccess.getUNO_DamienCantinRule()); 
            pushFollow(FOLLOW_1);
            ruleUNO_DamienCantin();

            state._fsp--;

             after(grammarAccess.getUNO_DamienCantinRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUNO_DamienCantin"


    // $ANTLR start "ruleUNO_DamienCantin"
    // InternalMyDsl.g:62:1: ruleUNO_DamienCantin : ( ( rule__UNO_DamienCantin__Group__0 ) ) ;
    public final void ruleUNO_DamienCantin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__UNO_DamienCantin__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__UNO_DamienCantin__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__UNO_DamienCantin__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__UNO_DamienCantin__Group__0 )
            {
             before(grammarAccess.getUNO_DamienCantinAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__UNO_DamienCantin__Group__0 )
            // InternalMyDsl.g:69:4: rule__UNO_DamienCantin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UNO_DamienCantin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUNO_DamienCantinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUNO_DamienCantin"


    // $ANTLR start "entryRuleBaseVariants"
    // InternalMyDsl.g:78:1: entryRuleBaseVariants : ruleBaseVariants EOF ;
    public final void entryRuleBaseVariants() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleBaseVariants EOF )
            // InternalMyDsl.g:80:1: ruleBaseVariants EOF
            {
             before(grammarAccess.getBaseVariantsRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseVariants();

            state._fsp--;

             after(grammarAccess.getBaseVariantsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBaseVariants"


    // $ANTLR start "ruleBaseVariants"
    // InternalMyDsl.g:87:1: ruleBaseVariants : ( ( rule__BaseVariants__Group__0 ) ) ;
    public final void ruleBaseVariants() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__BaseVariants__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__BaseVariants__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__BaseVariants__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__BaseVariants__Group__0 )
            {
             before(grammarAccess.getBaseVariantsAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__BaseVariants__Group__0 )
            // InternalMyDsl.g:94:4: rule__BaseVariants__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BaseVariants__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseVariantsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseVariants"


    // $ANTLR start "entryRuleBaseVariant"
    // InternalMyDsl.g:103:1: entryRuleBaseVariant : ruleBaseVariant EOF ;
    public final void entryRuleBaseVariant() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleBaseVariant EOF )
            // InternalMyDsl.g:105:1: ruleBaseVariant EOF
            {
             before(grammarAccess.getBaseVariantRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseVariant();

            state._fsp--;

             after(grammarAccess.getBaseVariantRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBaseVariant"


    // $ANTLR start "ruleBaseVariant"
    // InternalMyDsl.g:112:1: ruleBaseVariant : ( ( rule__BaseVariant__Alternatives ) ) ;
    public final void ruleBaseVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__BaseVariant__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__BaseVariant__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__BaseVariant__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__BaseVariant__Alternatives )
            {
             before(grammarAccess.getBaseVariantAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__BaseVariant__Alternatives )
            // InternalMyDsl.g:119:4: rule__BaseVariant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BaseVariant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBaseVariantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseVariant"


    // $ANTLR start "entryRuleVariants"
    // InternalMyDsl.g:128:1: entryRuleVariants : ruleVariants EOF ;
    public final void entryRuleVariants() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleVariants EOF )
            // InternalMyDsl.g:130:1: ruleVariants EOF
            {
             before(grammarAccess.getVariantsRule()); 
            pushFollow(FOLLOW_1);
            ruleVariants();

            state._fsp--;

             after(grammarAccess.getVariantsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariants"


    // $ANTLR start "ruleVariants"
    // InternalMyDsl.g:137:1: ruleVariants : ( ( rule__Variants__Group__0 ) ) ;
    public final void ruleVariants() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Variants__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Variants__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Variants__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Variants__Group__0 )
            {
             before(grammarAccess.getVariantsAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Variants__Group__0 )
            // InternalMyDsl.g:144:4: rule__Variants__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variants__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariantsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariants"


    // $ANTLR start "entryRuleVariant"
    // InternalMyDsl.g:153:1: entryRuleVariant : ruleVariant EOF ;
    public final void entryRuleVariant() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleVariant EOF )
            // InternalMyDsl.g:155:1: ruleVariant EOF
            {
             before(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_1);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getVariantRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariant"


    // $ANTLR start "ruleVariant"
    // InternalMyDsl.g:162:1: ruleVariant : ( ( rule__Variant__Alternatives ) ) ;
    public final void ruleVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Variant__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Variant__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Variant__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Variant__Alternatives )
            {
             before(grammarAccess.getVariantAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Variant__Alternatives )
            // InternalMyDsl.g:169:4: rule__Variant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Variant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleHands"
    // InternalMyDsl.g:178:1: entryRuleHands : ruleHands EOF ;
    public final void entryRuleHands() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleHands EOF )
            // InternalMyDsl.g:180:1: ruleHands EOF
            {
             before(grammarAccess.getHandsRule()); 
            pushFollow(FOLLOW_1);
            ruleHands();

            state._fsp--;

             after(grammarAccess.getHandsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHands"


    // $ANTLR start "ruleHands"
    // InternalMyDsl.g:187:1: ruleHands : ( ( rule__Hands__Group__0 ) ) ;
    public final void ruleHands() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Hands__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Hands__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Hands__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Hands__Group__0 )
            {
             before(grammarAccess.getHandsAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Hands__Group__0 )
            // InternalMyDsl.g:194:4: rule__Hands__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hands__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHandsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHands"


    // $ANTLR start "entryRuleHand"
    // InternalMyDsl.g:203:1: entryRuleHand : ruleHand EOF ;
    public final void entryRuleHand() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleHand EOF )
            // InternalMyDsl.g:205:1: ruleHand EOF
            {
             before(grammarAccess.getHandRule()); 
            pushFollow(FOLLOW_1);
            ruleHand();

            state._fsp--;

             after(grammarAccess.getHandRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHand"


    // $ANTLR start "ruleHand"
    // InternalMyDsl.g:212:1: ruleHand : ( ( rule__Hand__Alternatives ) ) ;
    public final void ruleHand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Hand__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Hand__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Hand__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__Hand__Alternatives )
            {
             before(grammarAccess.getHandAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__Hand__Alternatives )
            // InternalMyDsl.g:219:4: rule__Hand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Hand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHand"


    // $ANTLR start "entryRuleSpecialCards"
    // InternalMyDsl.g:228:1: entryRuleSpecialCards : ruleSpecialCards EOF ;
    public final void entryRuleSpecialCards() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleSpecialCards EOF )
            // InternalMyDsl.g:230:1: ruleSpecialCards EOF
            {
             before(grammarAccess.getSpecialCardsRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecialCards();

            state._fsp--;

             after(grammarAccess.getSpecialCardsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpecialCards"


    // $ANTLR start "ruleSpecialCards"
    // InternalMyDsl.g:237:1: ruleSpecialCards : ( ( rule__SpecialCards__Group__0 ) ) ;
    public final void ruleSpecialCards() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__SpecialCards__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__SpecialCards__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__SpecialCards__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__SpecialCards__Group__0 )
            {
             before(grammarAccess.getSpecialCardsAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__SpecialCards__Group__0 )
            // InternalMyDsl.g:244:4: rule__SpecialCards__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpecialCards__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecialCardsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecialCards"


    // $ANTLR start "entryRuleSpecialCard"
    // InternalMyDsl.g:253:1: entryRuleSpecialCard : ruleSpecialCard EOF ;
    public final void entryRuleSpecialCard() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleSpecialCard EOF )
            // InternalMyDsl.g:255:1: ruleSpecialCard EOF
            {
             before(grammarAccess.getSpecialCardRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecialCard();

            state._fsp--;

             after(grammarAccess.getSpecialCardRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpecialCard"


    // $ANTLR start "ruleSpecialCard"
    // InternalMyDsl.g:262:1: ruleSpecialCard : ( ( rule__SpecialCard__Alternatives ) ) ;
    public final void ruleSpecialCard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__SpecialCard__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__SpecialCard__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__SpecialCard__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__SpecialCard__Alternatives )
            {
             before(grammarAccess.getSpecialCardAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__SpecialCard__Alternatives )
            // InternalMyDsl.g:269:4: rule__SpecialCard__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SpecialCard__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSpecialCardAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecialCard"


    // $ANTLR start "entryRuleWildCard"
    // InternalMyDsl.g:278:1: entryRuleWildCard : ruleWildCard EOF ;
    public final void entryRuleWildCard() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleWildCard EOF )
            // InternalMyDsl.g:280:1: ruleWildCard EOF
            {
             before(grammarAccess.getWildCardRule()); 
            pushFollow(FOLLOW_1);
            ruleWildCard();

            state._fsp--;

             after(grammarAccess.getWildCardRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWildCard"


    // $ANTLR start "ruleWildCard"
    // InternalMyDsl.g:287:1: ruleWildCard : ( ( rule__WildCard__Group__0 ) ) ;
    public final void ruleWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__WildCard__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__WildCard__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__WildCard__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__WildCard__Group__0 )
            {
             before(grammarAccess.getWildCardAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__WildCard__Group__0 )
            // InternalMyDsl.g:294:4: rule__WildCard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WildCard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWildCardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWildCard"


    // $ANTLR start "entryRuleStacking"
    // InternalMyDsl.g:303:1: entryRuleStacking : ruleStacking EOF ;
    public final void entryRuleStacking() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleStacking EOF )
            // InternalMyDsl.g:305:1: ruleStacking EOF
            {
             before(grammarAccess.getStackingRule()); 
            pushFollow(FOLLOW_1);
            ruleStacking();

            state._fsp--;

             after(grammarAccess.getStackingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStacking"


    // $ANTLR start "ruleStacking"
    // InternalMyDsl.g:312:1: ruleStacking : ( ( rule__Stacking__Group__0 ) ) ;
    public final void ruleStacking() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Stacking__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Stacking__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Stacking__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Stacking__Group__0 )
            {
             before(grammarAccess.getStackingAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Stacking__Group__0 )
            // InternalMyDsl.g:319:4: rule__Stacking__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stacking__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStackingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStacking"


    // $ANTLR start "rule__BaseVariant__Alternatives"
    // InternalMyDsl.g:327:1: rule__BaseVariant__Alternatives : ( ( 'Points' ) | ( 'Cry Uno' ) | ( 'Same number' ) | ( 'Same Color' ) );
    public final void rule__BaseVariant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( ( 'Points' ) | ( 'Cry Uno' ) | ( 'Same number' ) | ( 'Same Color' ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:332:2: ( 'Points' )
                    {
                    // InternalMyDsl.g:332:2: ( 'Points' )
                    // InternalMyDsl.g:333:3: 'Points'
                    {
                     before(grammarAccess.getBaseVariantAccess().getPointsKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBaseVariantAccess().getPointsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:338:2: ( 'Cry Uno' )
                    {
                    // InternalMyDsl.g:338:2: ( 'Cry Uno' )
                    // InternalMyDsl.g:339:3: 'Cry Uno'
                    {
                     before(grammarAccess.getBaseVariantAccess().getCryUnoKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBaseVariantAccess().getCryUnoKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:344:2: ( 'Same number' )
                    {
                    // InternalMyDsl.g:344:2: ( 'Same number' )
                    // InternalMyDsl.g:345:3: 'Same number'
                    {
                     before(grammarAccess.getBaseVariantAccess().getSameNumberKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBaseVariantAccess().getSameNumberKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:350:2: ( 'Same Color' )
                    {
                    // InternalMyDsl.g:350:2: ( 'Same Color' )
                    // InternalMyDsl.g:351:3: 'Same Color'
                    {
                     before(grammarAccess.getBaseVariantAccess().getSameColorKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBaseVariantAccess().getSameColorKeyword_3()); 

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
    // $ANTLR end "rule__BaseVariant__Alternatives"


    // $ANTLR start "rule__Variant__Alternatives"
    // InternalMyDsl.g:360:1: rule__Variant__Alternatives : ( ( ruleHands ) | ( ruleSpecialCards ) | ( ruleStacking ) | ( '2 players game' ) | ( 'Uno Mao' ) | ( 'Exchange Card' ) | ( 'Suite' ) );
    public final void rule__Variant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:364:1: ( ( ruleHands ) | ( ruleSpecialCards ) | ( ruleStacking ) | ( '2 players game' ) | ( 'Uno Mao' ) | ( 'Exchange Card' ) | ( 'Suite' ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            case 18:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:365:2: ( ruleHands )
                    {
                    // InternalMyDsl.g:365:2: ( ruleHands )
                    // InternalMyDsl.g:366:3: ruleHands
                    {
                     before(grammarAccess.getVariantAccess().getHandsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHands();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getHandsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:371:2: ( ruleSpecialCards )
                    {
                    // InternalMyDsl.g:371:2: ( ruleSpecialCards )
                    // InternalMyDsl.g:372:3: ruleSpecialCards
                    {
                     before(grammarAccess.getVariantAccess().getSpecialCardsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSpecialCards();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getSpecialCardsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:377:2: ( ruleStacking )
                    {
                    // InternalMyDsl.g:377:2: ( ruleStacking )
                    // InternalMyDsl.g:378:3: ruleStacking
                    {
                     before(grammarAccess.getVariantAccess().getStackingParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStacking();

                    state._fsp--;

                     after(grammarAccess.getVariantAccess().getStackingParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:383:2: ( '2 players game' )
                    {
                    // InternalMyDsl.g:383:2: ( '2 players game' )
                    // InternalMyDsl.g:384:3: '2 players game'
                    {
                     before(grammarAccess.getVariantAccess().getPlayersGameKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getVariantAccess().getPlayersGameKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:389:2: ( 'Uno Mao' )
                    {
                    // InternalMyDsl.g:389:2: ( 'Uno Mao' )
                    // InternalMyDsl.g:390:3: 'Uno Mao'
                    {
                     before(grammarAccess.getVariantAccess().getUnoMaoKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getVariantAccess().getUnoMaoKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:395:2: ( 'Exchange Card' )
                    {
                    // InternalMyDsl.g:395:2: ( 'Exchange Card' )
                    // InternalMyDsl.g:396:3: 'Exchange Card'
                    {
                     before(grammarAccess.getVariantAccess().getExchangeCardKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVariantAccess().getExchangeCardKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:401:2: ( 'Suite' )
                    {
                    // InternalMyDsl.g:401:2: ( 'Suite' )
                    // InternalMyDsl.g:402:3: 'Suite'
                    {
                     before(grammarAccess.getVariantAccess().getSuiteKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getVariantAccess().getSuiteKeyword_6()); 

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
    // $ANTLR end "rule__Variant__Alternatives"


    // $ANTLR start "rule__Hand__Alternatives"
    // InternalMyDsl.g:411:1: rule__Hand__Alternatives : ( ( 'Hands Down' ) | ( 'Three Hands Uno' ) );
    public final void rule__Hand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:415:1: ( ( 'Hands Down' ) | ( 'Three Hands Uno' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:416:2: ( 'Hands Down' )
                    {
                    // InternalMyDsl.g:416:2: ( 'Hands Down' )
                    // InternalMyDsl.g:417:3: 'Hands Down'
                    {
                     before(grammarAccess.getHandAccess().getHandsDownKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getHandAccess().getHandsDownKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:422:2: ( 'Three Hands Uno' )
                    {
                    // InternalMyDsl.g:422:2: ( 'Three Hands Uno' )
                    // InternalMyDsl.g:423:3: 'Three Hands Uno'
                    {
                     before(grammarAccess.getHandAccess().getThreeHandsUnoKeyword_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getHandAccess().getThreeHandsUnoKeyword_1()); 

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
    // $ANTLR end "rule__Hand__Alternatives"


    // $ANTLR start "rule__SpecialCard__Alternatives"
    // InternalMyDsl.g:432:1: rule__SpecialCard__Alternatives : ( ( ruleWildCard ) | ( 'Card Bomb' ) );
    public final void rule__SpecialCard__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:436:1: ( ( ruleWildCard ) | ( 'Card Bomb' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:437:2: ( ruleWildCard )
                    {
                    // InternalMyDsl.g:437:2: ( ruleWildCard )
                    // InternalMyDsl.g:438:3: ruleWildCard
                    {
                     before(grammarAccess.getSpecialCardAccess().getWildCardParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWildCard();

                    state._fsp--;

                     after(grammarAccess.getSpecialCardAccess().getWildCardParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:443:2: ( 'Card Bomb' )
                    {
                    // InternalMyDsl.g:443:2: ( 'Card Bomb' )
                    // InternalMyDsl.g:444:3: 'Card Bomb'
                    {
                     before(grammarAccess.getSpecialCardAccess().getCardBombKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSpecialCardAccess().getCardBombKeyword_1()); 

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
    // $ANTLR end "rule__SpecialCard__Alternatives"


    // $ANTLR start "rule__WildCard__Alternatives_1"
    // InternalMyDsl.g:453:1: rule__WildCard__Alternatives_1 : ( ( 'ShownDown' ) | ( 'Roulette' ) );
    public final void rule__WildCard__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:457:1: ( ( 'ShownDown' ) | ( 'Roulette' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:458:2: ( 'ShownDown' )
                    {
                    // InternalMyDsl.g:458:2: ( 'ShownDown' )
                    // InternalMyDsl.g:459:3: 'ShownDown'
                    {
                     before(grammarAccess.getWildCardAccess().getShownDownKeyword_1_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getWildCardAccess().getShownDownKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:464:2: ( 'Roulette' )
                    {
                    // InternalMyDsl.g:464:2: ( 'Roulette' )
                    // InternalMyDsl.g:465:3: 'Roulette'
                    {
                     before(grammarAccess.getWildCardAccess().getRouletteKeyword_1_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getWildCardAccess().getRouletteKeyword_1_1()); 

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
    // $ANTLR end "rule__WildCard__Alternatives_1"


    // $ANTLR start "rule__Stacking__Alternatives_1"
    // InternalMyDsl.g:474:1: rule__Stacking__Alternatives_1 : ( ( 'All Cards' ) | ( 'All except special cards' ) );
    public final void rule__Stacking__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:478:1: ( ( 'All Cards' ) | ( 'All except special cards' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:479:2: ( 'All Cards' )
                    {
                    // InternalMyDsl.g:479:2: ( 'All Cards' )
                    // InternalMyDsl.g:480:3: 'All Cards'
                    {
                     before(grammarAccess.getStackingAccess().getAllCardsKeyword_1_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getStackingAccess().getAllCardsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:485:2: ( 'All except special cards' )
                    {
                    // InternalMyDsl.g:485:2: ( 'All except special cards' )
                    // InternalMyDsl.g:486:3: 'All except special cards'
                    {
                     before(grammarAccess.getStackingAccess().getAllExceptSpecialCardsKeyword_1_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getStackingAccess().getAllExceptSpecialCardsKeyword_1_1()); 

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
    // $ANTLR end "rule__Stacking__Alternatives_1"


    // $ANTLR start "rule__UNO_DamienCantin__Group__0"
    // InternalMyDsl.g:495:1: rule__UNO_DamienCantin__Group__0 : rule__UNO_DamienCantin__Group__0__Impl rule__UNO_DamienCantin__Group__1 ;
    public final void rule__UNO_DamienCantin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:499:1: ( rule__UNO_DamienCantin__Group__0__Impl rule__UNO_DamienCantin__Group__1 )
            // InternalMyDsl.g:500:2: rule__UNO_DamienCantin__Group__0__Impl rule__UNO_DamienCantin__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UNO_DamienCantin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UNO_DamienCantin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__Group__0"


    // $ANTLR start "rule__UNO_DamienCantin__Group__0__Impl"
    // InternalMyDsl.g:507:1: rule__UNO_DamienCantin__Group__0__Impl : ( ( ( rule__UNO_DamienCantin__UnoAssignment_0 ) ) ( ( rule__UNO_DamienCantin__UnoAssignment_0 )* ) ) ;
    public final void rule__UNO_DamienCantin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:511:1: ( ( ( ( rule__UNO_DamienCantin__UnoAssignment_0 ) ) ( ( rule__UNO_DamienCantin__UnoAssignment_0 )* ) ) )
            // InternalMyDsl.g:512:1: ( ( ( rule__UNO_DamienCantin__UnoAssignment_0 ) ) ( ( rule__UNO_DamienCantin__UnoAssignment_0 )* ) )
            {
            // InternalMyDsl.g:512:1: ( ( ( rule__UNO_DamienCantin__UnoAssignment_0 ) ) ( ( rule__UNO_DamienCantin__UnoAssignment_0 )* ) )
            // InternalMyDsl.g:513:2: ( ( rule__UNO_DamienCantin__UnoAssignment_0 ) ) ( ( rule__UNO_DamienCantin__UnoAssignment_0 )* )
            {
            // InternalMyDsl.g:513:2: ( ( rule__UNO_DamienCantin__UnoAssignment_0 ) )
            // InternalMyDsl.g:514:3: ( rule__UNO_DamienCantin__UnoAssignment_0 )
            {
             before(grammarAccess.getUNO_DamienCantinAccess().getUnoAssignment_0()); 
            // InternalMyDsl.g:515:3: ( rule__UNO_DamienCantin__UnoAssignment_0 )
            // InternalMyDsl.g:515:4: rule__UNO_DamienCantin__UnoAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__UNO_DamienCantin__UnoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUNO_DamienCantinAccess().getUnoAssignment_0()); 

            }

            // InternalMyDsl.g:518:2: ( ( rule__UNO_DamienCantin__UnoAssignment_0 )* )
            // InternalMyDsl.g:519:3: ( rule__UNO_DamienCantin__UnoAssignment_0 )*
            {
             before(grammarAccess.getUNO_DamienCantinAccess().getUnoAssignment_0()); 
            // InternalMyDsl.g:520:3: ( rule__UNO_DamienCantin__UnoAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:520:4: rule__UNO_DamienCantin__UnoAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__UNO_DamienCantin__UnoAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getUNO_DamienCantinAccess().getUnoAssignment_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__Group__0__Impl"


    // $ANTLR start "rule__UNO_DamienCantin__Group__1"
    // InternalMyDsl.g:529:1: rule__UNO_DamienCantin__Group__1 : rule__UNO_DamienCantin__Group__1__Impl rule__UNO_DamienCantin__Group__2 ;
    public final void rule__UNO_DamienCantin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:533:1: ( rule__UNO_DamienCantin__Group__1__Impl rule__UNO_DamienCantin__Group__2 )
            // InternalMyDsl.g:534:2: rule__UNO_DamienCantin__Group__1__Impl rule__UNO_DamienCantin__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__UNO_DamienCantin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UNO_DamienCantin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__Group__1"


    // $ANTLR start "rule__UNO_DamienCantin__Group__1__Impl"
    // InternalMyDsl.g:541:1: rule__UNO_DamienCantin__Group__1__Impl : ( ( ( rule__UNO_DamienCantin__VarAssignment_1 ) ) ( ( rule__UNO_DamienCantin__VarAssignment_1 )* ) ) ;
    public final void rule__UNO_DamienCantin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:545:1: ( ( ( ( rule__UNO_DamienCantin__VarAssignment_1 ) ) ( ( rule__UNO_DamienCantin__VarAssignment_1 )* ) ) )
            // InternalMyDsl.g:546:1: ( ( ( rule__UNO_DamienCantin__VarAssignment_1 ) ) ( ( rule__UNO_DamienCantin__VarAssignment_1 )* ) )
            {
            // InternalMyDsl.g:546:1: ( ( ( rule__UNO_DamienCantin__VarAssignment_1 ) ) ( ( rule__UNO_DamienCantin__VarAssignment_1 )* ) )
            // InternalMyDsl.g:547:2: ( ( rule__UNO_DamienCantin__VarAssignment_1 ) ) ( ( rule__UNO_DamienCantin__VarAssignment_1 )* )
            {
            // InternalMyDsl.g:547:2: ( ( rule__UNO_DamienCantin__VarAssignment_1 ) )
            // InternalMyDsl.g:548:3: ( rule__UNO_DamienCantin__VarAssignment_1 )
            {
             before(grammarAccess.getUNO_DamienCantinAccess().getVarAssignment_1()); 
            // InternalMyDsl.g:549:3: ( rule__UNO_DamienCantin__VarAssignment_1 )
            // InternalMyDsl.g:549:4: rule__UNO_DamienCantin__VarAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__UNO_DamienCantin__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUNO_DamienCantinAccess().getVarAssignment_1()); 

            }

            // InternalMyDsl.g:552:2: ( ( rule__UNO_DamienCantin__VarAssignment_1 )* )
            // InternalMyDsl.g:553:3: ( rule__UNO_DamienCantin__VarAssignment_1 )*
            {
             before(grammarAccess.getUNO_DamienCantinAccess().getVarAssignment_1()); 
            // InternalMyDsl.g:554:3: ( rule__UNO_DamienCantin__VarAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:554:4: rule__UNO_DamienCantin__VarAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__UNO_DamienCantin__VarAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getUNO_DamienCantinAccess().getVarAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__Group__1__Impl"


    // $ANTLR start "rule__UNO_DamienCantin__Group__2"
    // InternalMyDsl.g:563:1: rule__UNO_DamienCantin__Group__2 : rule__UNO_DamienCantin__Group__2__Impl rule__UNO_DamienCantin__Group__3 ;
    public final void rule__UNO_DamienCantin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( rule__UNO_DamienCantin__Group__2__Impl rule__UNO_DamienCantin__Group__3 )
            // InternalMyDsl.g:568:2: rule__UNO_DamienCantin__Group__2__Impl rule__UNO_DamienCantin__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__UNO_DamienCantin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UNO_DamienCantin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__Group__2"


    // $ANTLR start "rule__UNO_DamienCantin__Group__2__Impl"
    // InternalMyDsl.g:575:1: rule__UNO_DamienCantin__Group__2__Impl : ( ':' ) ;
    public final void rule__UNO_DamienCantin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:579:1: ( ( ':' ) )
            // InternalMyDsl.g:580:1: ( ':' )
            {
            // InternalMyDsl.g:580:1: ( ':' )
            // InternalMyDsl.g:581:2: ':'
            {
             before(grammarAccess.getUNO_DamienCantinAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getUNO_DamienCantinAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__Group__2__Impl"


    // $ANTLR start "rule__UNO_DamienCantin__Group__3"
    // InternalMyDsl.g:590:1: rule__UNO_DamienCantin__Group__3 : rule__UNO_DamienCantin__Group__3__Impl ;
    public final void rule__UNO_DamienCantin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:594:1: ( rule__UNO_DamienCantin__Group__3__Impl )
            // InternalMyDsl.g:595:2: rule__UNO_DamienCantin__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UNO_DamienCantin__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__Group__3"


    // $ANTLR start "rule__UNO_DamienCantin__Group__3__Impl"
    // InternalMyDsl.g:601:1: rule__UNO_DamienCantin__Group__3__Impl : ( ( rule__UNO_DamienCantin__Group_3__0 )? ) ;
    public final void rule__UNO_DamienCantin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( ( ( rule__UNO_DamienCantin__Group_3__0 )? ) )
            // InternalMyDsl.g:606:1: ( ( rule__UNO_DamienCantin__Group_3__0 )? )
            {
            // InternalMyDsl.g:606:1: ( ( rule__UNO_DamienCantin__Group_3__0 )? )
            // InternalMyDsl.g:607:2: ( rule__UNO_DamienCantin__Group_3__0 )?
            {
             before(grammarAccess.getUNO_DamienCantinAccess().getGroup_3()); 
            // InternalMyDsl.g:608:2: ( rule__UNO_DamienCantin__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:608:3: rule__UNO_DamienCantin__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UNO_DamienCantin__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUNO_DamienCantinAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__Group__3__Impl"


    // $ANTLR start "rule__UNO_DamienCantin__Group_3__0"
    // InternalMyDsl.g:617:1: rule__UNO_DamienCantin__Group_3__0 : rule__UNO_DamienCantin__Group_3__0__Impl rule__UNO_DamienCantin__Group_3__1 ;
    public final void rule__UNO_DamienCantin__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( rule__UNO_DamienCantin__Group_3__0__Impl rule__UNO_DamienCantin__Group_3__1 )
            // InternalMyDsl.g:622:2: rule__UNO_DamienCantin__Group_3__0__Impl rule__UNO_DamienCantin__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__UNO_DamienCantin__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UNO_DamienCantin__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__Group_3__0"


    // $ANTLR start "rule__UNO_DamienCantin__Group_3__0__Impl"
    // InternalMyDsl.g:629:1: rule__UNO_DamienCantin__Group_3__0__Impl : ( ( rule__UNO_DamienCantin__BaseAssignment_3_0 ) ) ;
    public final void rule__UNO_DamienCantin__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:633:1: ( ( ( rule__UNO_DamienCantin__BaseAssignment_3_0 ) ) )
            // InternalMyDsl.g:634:1: ( ( rule__UNO_DamienCantin__BaseAssignment_3_0 ) )
            {
            // InternalMyDsl.g:634:1: ( ( rule__UNO_DamienCantin__BaseAssignment_3_0 ) )
            // InternalMyDsl.g:635:2: ( rule__UNO_DamienCantin__BaseAssignment_3_0 )
            {
             before(grammarAccess.getUNO_DamienCantinAccess().getBaseAssignment_3_0()); 
            // InternalMyDsl.g:636:2: ( rule__UNO_DamienCantin__BaseAssignment_3_0 )
            // InternalMyDsl.g:636:3: rule__UNO_DamienCantin__BaseAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__UNO_DamienCantin__BaseAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getUNO_DamienCantinAccess().getBaseAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__Group_3__0__Impl"


    // $ANTLR start "rule__UNO_DamienCantin__Group_3__1"
    // InternalMyDsl.g:644:1: rule__UNO_DamienCantin__Group_3__1 : rule__UNO_DamienCantin__Group_3__1__Impl ;
    public final void rule__UNO_DamienCantin__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:1: ( rule__UNO_DamienCantin__Group_3__1__Impl )
            // InternalMyDsl.g:649:2: rule__UNO_DamienCantin__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UNO_DamienCantin__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__Group_3__1"


    // $ANTLR start "rule__UNO_DamienCantin__Group_3__1__Impl"
    // InternalMyDsl.g:655:1: rule__UNO_DamienCantin__Group_3__1__Impl : ( ( rule__UNO_DamienCantin__VariantsAssignment_3_1 ) ) ;
    public final void rule__UNO_DamienCantin__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( ( ( rule__UNO_DamienCantin__VariantsAssignment_3_1 ) ) )
            // InternalMyDsl.g:660:1: ( ( rule__UNO_DamienCantin__VariantsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:660:1: ( ( rule__UNO_DamienCantin__VariantsAssignment_3_1 ) )
            // InternalMyDsl.g:661:2: ( rule__UNO_DamienCantin__VariantsAssignment_3_1 )
            {
             before(grammarAccess.getUNO_DamienCantinAccess().getVariantsAssignment_3_1()); 
            // InternalMyDsl.g:662:2: ( rule__UNO_DamienCantin__VariantsAssignment_3_1 )
            // InternalMyDsl.g:662:3: rule__UNO_DamienCantin__VariantsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__UNO_DamienCantin__VariantsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUNO_DamienCantinAccess().getVariantsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__Group_3__1__Impl"


    // $ANTLR start "rule__BaseVariants__Group__0"
    // InternalMyDsl.g:671:1: rule__BaseVariants__Group__0 : rule__BaseVariants__Group__0__Impl rule__BaseVariants__Group__1 ;
    public final void rule__BaseVariants__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:675:1: ( rule__BaseVariants__Group__0__Impl rule__BaseVariants__Group__1 )
            // InternalMyDsl.g:676:2: rule__BaseVariants__Group__0__Impl rule__BaseVariants__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BaseVariants__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseVariants__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVariants__Group__0"


    // $ANTLR start "rule__BaseVariants__Group__0__Impl"
    // InternalMyDsl.g:683:1: rule__BaseVariants__Group__0__Impl : ( 'Base:' ) ;
    public final void rule__BaseVariants__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:687:1: ( ( 'Base:' ) )
            // InternalMyDsl.g:688:1: ( 'Base:' )
            {
            // InternalMyDsl.g:688:1: ( 'Base:' )
            // InternalMyDsl.g:689:2: 'Base:'
            {
             before(grammarAccess.getBaseVariantsAccess().getBaseKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBaseVariantsAccess().getBaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVariants__Group__0__Impl"


    // $ANTLR start "rule__BaseVariants__Group__1"
    // InternalMyDsl.g:698:1: rule__BaseVariants__Group__1 : rule__BaseVariants__Group__1__Impl rule__BaseVariants__Group__2 ;
    public final void rule__BaseVariants__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( rule__BaseVariants__Group__1__Impl rule__BaseVariants__Group__2 )
            // InternalMyDsl.g:703:2: rule__BaseVariants__Group__1__Impl rule__BaseVariants__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__BaseVariants__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseVariants__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVariants__Group__1"


    // $ANTLR start "rule__BaseVariants__Group__1__Impl"
    // InternalMyDsl.g:710:1: rule__BaseVariants__Group__1__Impl : ( ruleBaseVariant ) ;
    public final void rule__BaseVariants__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:714:1: ( ( ruleBaseVariant ) )
            // InternalMyDsl.g:715:1: ( ruleBaseVariant )
            {
            // InternalMyDsl.g:715:1: ( ruleBaseVariant )
            // InternalMyDsl.g:716:2: ruleBaseVariant
            {
             before(grammarAccess.getBaseVariantsAccess().getBaseVariantParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleBaseVariant();

            state._fsp--;

             after(grammarAccess.getBaseVariantsAccess().getBaseVariantParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVariants__Group__1__Impl"


    // $ANTLR start "rule__BaseVariants__Group__2"
    // InternalMyDsl.g:725:1: rule__BaseVariants__Group__2 : rule__BaseVariants__Group__2__Impl ;
    public final void rule__BaseVariants__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:729:1: ( rule__BaseVariants__Group__2__Impl )
            // InternalMyDsl.g:730:2: rule__BaseVariants__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseVariants__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVariants__Group__2"


    // $ANTLR start "rule__BaseVariants__Group__2__Impl"
    // InternalMyDsl.g:736:1: rule__BaseVariants__Group__2__Impl : ( ( rule__BaseVariants__Group_2__0 )* ) ;
    public final void rule__BaseVariants__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( ( ( rule__BaseVariants__Group_2__0 )* ) )
            // InternalMyDsl.g:741:1: ( ( rule__BaseVariants__Group_2__0 )* )
            {
            // InternalMyDsl.g:741:1: ( ( rule__BaseVariants__Group_2__0 )* )
            // InternalMyDsl.g:742:2: ( rule__BaseVariants__Group_2__0 )*
            {
             before(grammarAccess.getBaseVariantsAccess().getGroup_2()); 
            // InternalMyDsl.g:743:2: ( rule__BaseVariants__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:743:3: rule__BaseVariants__Group_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__BaseVariants__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBaseVariantsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVariants__Group__2__Impl"


    // $ANTLR start "rule__BaseVariants__Group_2__0"
    // InternalMyDsl.g:752:1: rule__BaseVariants__Group_2__0 : rule__BaseVariants__Group_2__0__Impl rule__BaseVariants__Group_2__1 ;
    public final void rule__BaseVariants__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( rule__BaseVariants__Group_2__0__Impl rule__BaseVariants__Group_2__1 )
            // InternalMyDsl.g:757:2: rule__BaseVariants__Group_2__0__Impl rule__BaseVariants__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__BaseVariants__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseVariants__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVariants__Group_2__0"


    // $ANTLR start "rule__BaseVariants__Group_2__0__Impl"
    // InternalMyDsl.g:764:1: rule__BaseVariants__Group_2__0__Impl : ( '-' ) ;
    public final void rule__BaseVariants__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:768:1: ( ( '-' ) )
            // InternalMyDsl.g:769:1: ( '-' )
            {
            // InternalMyDsl.g:769:1: ( '-' )
            // InternalMyDsl.g:770:2: '-'
            {
             before(grammarAccess.getBaseVariantsAccess().getHyphenMinusKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBaseVariantsAccess().getHyphenMinusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVariants__Group_2__0__Impl"


    // $ANTLR start "rule__BaseVariants__Group_2__1"
    // InternalMyDsl.g:779:1: rule__BaseVariants__Group_2__1 : rule__BaseVariants__Group_2__1__Impl ;
    public final void rule__BaseVariants__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:783:1: ( rule__BaseVariants__Group_2__1__Impl )
            // InternalMyDsl.g:784:2: rule__BaseVariants__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseVariants__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVariants__Group_2__1"


    // $ANTLR start "rule__BaseVariants__Group_2__1__Impl"
    // InternalMyDsl.g:790:1: rule__BaseVariants__Group_2__1__Impl : ( ruleBaseVariant ) ;
    public final void rule__BaseVariants__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:794:1: ( ( ruleBaseVariant ) )
            // InternalMyDsl.g:795:1: ( ruleBaseVariant )
            {
            // InternalMyDsl.g:795:1: ( ruleBaseVariant )
            // InternalMyDsl.g:796:2: ruleBaseVariant
            {
             before(grammarAccess.getBaseVariantsAccess().getBaseVariantParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleBaseVariant();

            state._fsp--;

             after(grammarAccess.getBaseVariantsAccess().getBaseVariantParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseVariants__Group_2__1__Impl"


    // $ANTLR start "rule__Variants__Group__0"
    // InternalMyDsl.g:806:1: rule__Variants__Group__0 : rule__Variants__Group__0__Impl rule__Variants__Group__1 ;
    public final void rule__Variants__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( rule__Variants__Group__0__Impl rule__Variants__Group__1 )
            // InternalMyDsl.g:811:2: rule__Variants__Group__0__Impl rule__Variants__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Variants__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variants__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variants__Group__0"


    // $ANTLR start "rule__Variants__Group__0__Impl"
    // InternalMyDsl.g:818:1: rule__Variants__Group__0__Impl : ( 'Variants:' ) ;
    public final void rule__Variants__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:822:1: ( ( 'Variants:' ) )
            // InternalMyDsl.g:823:1: ( 'Variants:' )
            {
            // InternalMyDsl.g:823:1: ( 'Variants:' )
            // InternalMyDsl.g:824:2: 'Variants:'
            {
             before(grammarAccess.getVariantsAccess().getVariantsKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVariantsAccess().getVariantsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variants__Group__0__Impl"


    // $ANTLR start "rule__Variants__Group__1"
    // InternalMyDsl.g:833:1: rule__Variants__Group__1 : rule__Variants__Group__1__Impl rule__Variants__Group__2 ;
    public final void rule__Variants__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( rule__Variants__Group__1__Impl rule__Variants__Group__2 )
            // InternalMyDsl.g:838:2: rule__Variants__Group__1__Impl rule__Variants__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Variants__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variants__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variants__Group__1"


    // $ANTLR start "rule__Variants__Group__1__Impl"
    // InternalMyDsl.g:845:1: rule__Variants__Group__1__Impl : ( ruleVariant ) ;
    public final void rule__Variants__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:849:1: ( ( ruleVariant ) )
            // InternalMyDsl.g:850:1: ( ruleVariant )
            {
            // InternalMyDsl.g:850:1: ( ruleVariant )
            // InternalMyDsl.g:851:2: ruleVariant
            {
             before(grammarAccess.getVariantsAccess().getVariantParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getVariantsAccess().getVariantParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variants__Group__1__Impl"


    // $ANTLR start "rule__Variants__Group__2"
    // InternalMyDsl.g:860:1: rule__Variants__Group__2 : rule__Variants__Group__2__Impl ;
    public final void rule__Variants__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( rule__Variants__Group__2__Impl )
            // InternalMyDsl.g:865:2: rule__Variants__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variants__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variants__Group__2"


    // $ANTLR start "rule__Variants__Group__2__Impl"
    // InternalMyDsl.g:871:1: rule__Variants__Group__2__Impl : ( ( rule__Variants__Group_2__0 )* ) ;
    public final void rule__Variants__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( ( ( rule__Variants__Group_2__0 )* ) )
            // InternalMyDsl.g:876:1: ( ( rule__Variants__Group_2__0 )* )
            {
            // InternalMyDsl.g:876:1: ( ( rule__Variants__Group_2__0 )* )
            // InternalMyDsl.g:877:2: ( rule__Variants__Group_2__0 )*
            {
             before(grammarAccess.getVariantsAccess().getGroup_2()); 
            // InternalMyDsl.g:878:2: ( rule__Variants__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:878:3: rule__Variants__Group_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Variants__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getVariantsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variants__Group__2__Impl"


    // $ANTLR start "rule__Variants__Group_2__0"
    // InternalMyDsl.g:887:1: rule__Variants__Group_2__0 : rule__Variants__Group_2__0__Impl rule__Variants__Group_2__1 ;
    public final void rule__Variants__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( rule__Variants__Group_2__0__Impl rule__Variants__Group_2__1 )
            // InternalMyDsl.g:892:2: rule__Variants__Group_2__0__Impl rule__Variants__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Variants__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variants__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variants__Group_2__0"


    // $ANTLR start "rule__Variants__Group_2__0__Impl"
    // InternalMyDsl.g:899:1: rule__Variants__Group_2__0__Impl : ( '-' ) ;
    public final void rule__Variants__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:903:1: ( ( '-' ) )
            // InternalMyDsl.g:904:1: ( '-' )
            {
            // InternalMyDsl.g:904:1: ( '-' )
            // InternalMyDsl.g:905:2: '-'
            {
             before(grammarAccess.getVariantsAccess().getHyphenMinusKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVariantsAccess().getHyphenMinusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variants__Group_2__0__Impl"


    // $ANTLR start "rule__Variants__Group_2__1"
    // InternalMyDsl.g:914:1: rule__Variants__Group_2__1 : rule__Variants__Group_2__1__Impl ;
    public final void rule__Variants__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( rule__Variants__Group_2__1__Impl )
            // InternalMyDsl.g:919:2: rule__Variants__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variants__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variants__Group_2__1"


    // $ANTLR start "rule__Variants__Group_2__1__Impl"
    // InternalMyDsl.g:925:1: rule__Variants__Group_2__1__Impl : ( ruleVariant ) ;
    public final void rule__Variants__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:929:1: ( ( ruleVariant ) )
            // InternalMyDsl.g:930:1: ( ruleVariant )
            {
            // InternalMyDsl.g:930:1: ( ruleVariant )
            // InternalMyDsl.g:931:2: ruleVariant
            {
             before(grammarAccess.getVariantsAccess().getVariantParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleVariant();

            state._fsp--;

             after(grammarAccess.getVariantsAccess().getVariantParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variants__Group_2__1__Impl"


    // $ANTLR start "rule__Hands__Group__0"
    // InternalMyDsl.g:941:1: rule__Hands__Group__0 : rule__Hands__Group__0__Impl rule__Hands__Group__1 ;
    public final void rule__Hands__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:945:1: ( rule__Hands__Group__0__Impl rule__Hands__Group__1 )
            // InternalMyDsl.g:946:2: rule__Hands__Group__0__Impl rule__Hands__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Hands__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hands__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hands__Group__0"


    // $ANTLR start "rule__Hands__Group__0__Impl"
    // InternalMyDsl.g:953:1: rule__Hands__Group__0__Impl : ( 'Hands:' ) ;
    public final void rule__Hands__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:957:1: ( ( 'Hands:' ) )
            // InternalMyDsl.g:958:1: ( 'Hands:' )
            {
            // InternalMyDsl.g:958:1: ( 'Hands:' )
            // InternalMyDsl.g:959:2: 'Hands:'
            {
             before(grammarAccess.getHandsAccess().getHandsKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHandsAccess().getHandsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hands__Group__0__Impl"


    // $ANTLR start "rule__Hands__Group__1"
    // InternalMyDsl.g:968:1: rule__Hands__Group__1 : rule__Hands__Group__1__Impl rule__Hands__Group__2 ;
    public final void rule__Hands__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( rule__Hands__Group__1__Impl rule__Hands__Group__2 )
            // InternalMyDsl.g:973:2: rule__Hands__Group__1__Impl rule__Hands__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Hands__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hands__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hands__Group__1"


    // $ANTLR start "rule__Hands__Group__1__Impl"
    // InternalMyDsl.g:980:1: rule__Hands__Group__1__Impl : ( ruleHand ) ;
    public final void rule__Hands__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:984:1: ( ( ruleHand ) )
            // InternalMyDsl.g:985:1: ( ruleHand )
            {
            // InternalMyDsl.g:985:1: ( ruleHand )
            // InternalMyDsl.g:986:2: ruleHand
            {
             before(grammarAccess.getHandsAccess().getHandParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleHand();

            state._fsp--;

             after(grammarAccess.getHandsAccess().getHandParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hands__Group__1__Impl"


    // $ANTLR start "rule__Hands__Group__2"
    // InternalMyDsl.g:995:1: rule__Hands__Group__2 : rule__Hands__Group__2__Impl ;
    public final void rule__Hands__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( rule__Hands__Group__2__Impl )
            // InternalMyDsl.g:1000:2: rule__Hands__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hands__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hands__Group__2"


    // $ANTLR start "rule__Hands__Group__2__Impl"
    // InternalMyDsl.g:1006:1: rule__Hands__Group__2__Impl : ( ( rule__Hands__Group_2__0 )* ) ;
    public final void rule__Hands__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1010:1: ( ( ( rule__Hands__Group_2__0 )* ) )
            // InternalMyDsl.g:1011:1: ( ( rule__Hands__Group_2__0 )* )
            {
            // InternalMyDsl.g:1011:1: ( ( rule__Hands__Group_2__0 )* )
            // InternalMyDsl.g:1012:2: ( rule__Hands__Group_2__0 )*
            {
             before(grammarAccess.getHandsAccess().getGroup_2()); 
            // InternalMyDsl.g:1013:2: ( rule__Hands__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1013:3: rule__Hands__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Hands__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getHandsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hands__Group__2__Impl"


    // $ANTLR start "rule__Hands__Group_2__0"
    // InternalMyDsl.g:1022:1: rule__Hands__Group_2__0 : rule__Hands__Group_2__0__Impl rule__Hands__Group_2__1 ;
    public final void rule__Hands__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( rule__Hands__Group_2__0__Impl rule__Hands__Group_2__1 )
            // InternalMyDsl.g:1027:2: rule__Hands__Group_2__0__Impl rule__Hands__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Hands__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hands__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hands__Group_2__0"


    // $ANTLR start "rule__Hands__Group_2__0__Impl"
    // InternalMyDsl.g:1034:1: rule__Hands__Group_2__0__Impl : ( '/' ) ;
    public final void rule__Hands__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1038:1: ( ( '/' ) )
            // InternalMyDsl.g:1039:1: ( '/' )
            {
            // InternalMyDsl.g:1039:1: ( '/' )
            // InternalMyDsl.g:1040:2: '/'
            {
             before(grammarAccess.getHandsAccess().getSolidusKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getHandsAccess().getSolidusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hands__Group_2__0__Impl"


    // $ANTLR start "rule__Hands__Group_2__1"
    // InternalMyDsl.g:1049:1: rule__Hands__Group_2__1 : rule__Hands__Group_2__1__Impl ;
    public final void rule__Hands__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1053:1: ( rule__Hands__Group_2__1__Impl )
            // InternalMyDsl.g:1054:2: rule__Hands__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hands__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hands__Group_2__1"


    // $ANTLR start "rule__Hands__Group_2__1__Impl"
    // InternalMyDsl.g:1060:1: rule__Hands__Group_2__1__Impl : ( ruleHand ) ;
    public final void rule__Hands__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1064:1: ( ( ruleHand ) )
            // InternalMyDsl.g:1065:1: ( ruleHand )
            {
            // InternalMyDsl.g:1065:1: ( ruleHand )
            // InternalMyDsl.g:1066:2: ruleHand
            {
             before(grammarAccess.getHandsAccess().getHandParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleHand();

            state._fsp--;

             after(grammarAccess.getHandsAccess().getHandParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hands__Group_2__1__Impl"


    // $ANTLR start "rule__SpecialCards__Group__0"
    // InternalMyDsl.g:1076:1: rule__SpecialCards__Group__0 : rule__SpecialCards__Group__0__Impl rule__SpecialCards__Group__1 ;
    public final void rule__SpecialCards__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( rule__SpecialCards__Group__0__Impl rule__SpecialCards__Group__1 )
            // InternalMyDsl.g:1081:2: rule__SpecialCards__Group__0__Impl rule__SpecialCards__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SpecialCards__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecialCards__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialCards__Group__0"


    // $ANTLR start "rule__SpecialCards__Group__0__Impl"
    // InternalMyDsl.g:1088:1: rule__SpecialCards__Group__0__Impl : ( 'Special Cards:' ) ;
    public final void rule__SpecialCards__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1092:1: ( ( 'Special Cards:' ) )
            // InternalMyDsl.g:1093:1: ( 'Special Cards:' )
            {
            // InternalMyDsl.g:1093:1: ( 'Special Cards:' )
            // InternalMyDsl.g:1094:2: 'Special Cards:'
            {
             before(grammarAccess.getSpecialCardsAccess().getSpecialCardsKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSpecialCardsAccess().getSpecialCardsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialCards__Group__0__Impl"


    // $ANTLR start "rule__SpecialCards__Group__1"
    // InternalMyDsl.g:1103:1: rule__SpecialCards__Group__1 : rule__SpecialCards__Group__1__Impl rule__SpecialCards__Group__2 ;
    public final void rule__SpecialCards__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1107:1: ( rule__SpecialCards__Group__1__Impl rule__SpecialCards__Group__2 )
            // InternalMyDsl.g:1108:2: rule__SpecialCards__Group__1__Impl rule__SpecialCards__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SpecialCards__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecialCards__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialCards__Group__1"


    // $ANTLR start "rule__SpecialCards__Group__1__Impl"
    // InternalMyDsl.g:1115:1: rule__SpecialCards__Group__1__Impl : ( ruleSpecialCard ) ;
    public final void rule__SpecialCards__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1119:1: ( ( ruleSpecialCard ) )
            // InternalMyDsl.g:1120:1: ( ruleSpecialCard )
            {
            // InternalMyDsl.g:1120:1: ( ruleSpecialCard )
            // InternalMyDsl.g:1121:2: ruleSpecialCard
            {
             before(grammarAccess.getSpecialCardsAccess().getSpecialCardParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleSpecialCard();

            state._fsp--;

             after(grammarAccess.getSpecialCardsAccess().getSpecialCardParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialCards__Group__1__Impl"


    // $ANTLR start "rule__SpecialCards__Group__2"
    // InternalMyDsl.g:1130:1: rule__SpecialCards__Group__2 : rule__SpecialCards__Group__2__Impl ;
    public final void rule__SpecialCards__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1134:1: ( rule__SpecialCards__Group__2__Impl )
            // InternalMyDsl.g:1135:2: rule__SpecialCards__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecialCards__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialCards__Group__2"


    // $ANTLR start "rule__SpecialCards__Group__2__Impl"
    // InternalMyDsl.g:1141:1: rule__SpecialCards__Group__2__Impl : ( ( rule__SpecialCards__Group_2__0 )* ) ;
    public final void rule__SpecialCards__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( ( ( rule__SpecialCards__Group_2__0 )* ) )
            // InternalMyDsl.g:1146:1: ( ( rule__SpecialCards__Group_2__0 )* )
            {
            // InternalMyDsl.g:1146:1: ( ( rule__SpecialCards__Group_2__0 )* )
            // InternalMyDsl.g:1147:2: ( rule__SpecialCards__Group_2__0 )*
            {
             before(grammarAccess.getSpecialCardsAccess().getGroup_2()); 
            // InternalMyDsl.g:1148:2: ( rule__SpecialCards__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1148:3: rule__SpecialCards__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SpecialCards__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSpecialCardsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialCards__Group__2__Impl"


    // $ANTLR start "rule__SpecialCards__Group_2__0"
    // InternalMyDsl.g:1157:1: rule__SpecialCards__Group_2__0 : rule__SpecialCards__Group_2__0__Impl rule__SpecialCards__Group_2__1 ;
    public final void rule__SpecialCards__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1161:1: ( rule__SpecialCards__Group_2__0__Impl rule__SpecialCards__Group_2__1 )
            // InternalMyDsl.g:1162:2: rule__SpecialCards__Group_2__0__Impl rule__SpecialCards__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__SpecialCards__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecialCards__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialCards__Group_2__0"


    // $ANTLR start "rule__SpecialCards__Group_2__0__Impl"
    // InternalMyDsl.g:1169:1: rule__SpecialCards__Group_2__0__Impl : ( '/' ) ;
    public final void rule__SpecialCards__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1173:1: ( ( '/' ) )
            // InternalMyDsl.g:1174:1: ( '/' )
            {
            // InternalMyDsl.g:1174:1: ( '/' )
            // InternalMyDsl.g:1175:2: '/'
            {
             before(grammarAccess.getSpecialCardsAccess().getSolidusKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSpecialCardsAccess().getSolidusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialCards__Group_2__0__Impl"


    // $ANTLR start "rule__SpecialCards__Group_2__1"
    // InternalMyDsl.g:1184:1: rule__SpecialCards__Group_2__1 : rule__SpecialCards__Group_2__1__Impl ;
    public final void rule__SpecialCards__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1188:1: ( rule__SpecialCards__Group_2__1__Impl )
            // InternalMyDsl.g:1189:2: rule__SpecialCards__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecialCards__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialCards__Group_2__1"


    // $ANTLR start "rule__SpecialCards__Group_2__1__Impl"
    // InternalMyDsl.g:1195:1: rule__SpecialCards__Group_2__1__Impl : ( ruleSpecialCard ) ;
    public final void rule__SpecialCards__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1199:1: ( ( ruleSpecialCard ) )
            // InternalMyDsl.g:1200:1: ( ruleSpecialCard )
            {
            // InternalMyDsl.g:1200:1: ( ruleSpecialCard )
            // InternalMyDsl.g:1201:2: ruleSpecialCard
            {
             before(grammarAccess.getSpecialCardsAccess().getSpecialCardParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleSpecialCard();

            state._fsp--;

             after(grammarAccess.getSpecialCardsAccess().getSpecialCardParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecialCards__Group_2__1__Impl"


    // $ANTLR start "rule__WildCard__Group__0"
    // InternalMyDsl.g:1211:1: rule__WildCard__Group__0 : rule__WildCard__Group__0__Impl rule__WildCard__Group__1 ;
    public final void rule__WildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1215:1: ( rule__WildCard__Group__0__Impl rule__WildCard__Group__1 )
            // InternalMyDsl.g:1216:2: rule__WildCard__Group__0__Impl rule__WildCard__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__WildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WildCard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WildCard__Group__0"


    // $ANTLR start "rule__WildCard__Group__0__Impl"
    // InternalMyDsl.g:1223:1: rule__WildCard__Group__0__Impl : ( 'WildCard:' ) ;
    public final void rule__WildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1227:1: ( ( 'WildCard:' ) )
            // InternalMyDsl.g:1228:1: ( 'WildCard:' )
            {
            // InternalMyDsl.g:1228:1: ( 'WildCard:' )
            // InternalMyDsl.g:1229:2: 'WildCard:'
            {
             before(grammarAccess.getWildCardAccess().getWildCardKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getWildCardAccess().getWildCardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WildCard__Group__0__Impl"


    // $ANTLR start "rule__WildCard__Group__1"
    // InternalMyDsl.g:1238:1: rule__WildCard__Group__1 : rule__WildCard__Group__1__Impl ;
    public final void rule__WildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( rule__WildCard__Group__1__Impl )
            // InternalMyDsl.g:1243:2: rule__WildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WildCard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WildCard__Group__1"


    // $ANTLR start "rule__WildCard__Group__1__Impl"
    // InternalMyDsl.g:1249:1: rule__WildCard__Group__1__Impl : ( ( rule__WildCard__Alternatives_1 ) ) ;
    public final void rule__WildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1253:1: ( ( ( rule__WildCard__Alternatives_1 ) ) )
            // InternalMyDsl.g:1254:1: ( ( rule__WildCard__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1254:1: ( ( rule__WildCard__Alternatives_1 ) )
            // InternalMyDsl.g:1255:2: ( rule__WildCard__Alternatives_1 )
            {
             before(grammarAccess.getWildCardAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1256:2: ( rule__WildCard__Alternatives_1 )
            // InternalMyDsl.g:1256:3: rule__WildCard__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__WildCard__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getWildCardAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WildCard__Group__1__Impl"


    // $ANTLR start "rule__Stacking__Group__0"
    // InternalMyDsl.g:1265:1: rule__Stacking__Group__0 : rule__Stacking__Group__0__Impl rule__Stacking__Group__1 ;
    public final void rule__Stacking__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1269:1: ( rule__Stacking__Group__0__Impl rule__Stacking__Group__1 )
            // InternalMyDsl.g:1270:2: rule__Stacking__Group__0__Impl rule__Stacking__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Stacking__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stacking__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stacking__Group__0"


    // $ANTLR start "rule__Stacking__Group__0__Impl"
    // InternalMyDsl.g:1277:1: rule__Stacking__Group__0__Impl : ( 'Stacking:' ) ;
    public final void rule__Stacking__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1281:1: ( ( 'Stacking:' ) )
            // InternalMyDsl.g:1282:1: ( 'Stacking:' )
            {
            // InternalMyDsl.g:1282:1: ( 'Stacking:' )
            // InternalMyDsl.g:1283:2: 'Stacking:'
            {
             before(grammarAccess.getStackingAccess().getStackingKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStackingAccess().getStackingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stacking__Group__0__Impl"


    // $ANTLR start "rule__Stacking__Group__1"
    // InternalMyDsl.g:1292:1: rule__Stacking__Group__1 : rule__Stacking__Group__1__Impl ;
    public final void rule__Stacking__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1296:1: ( rule__Stacking__Group__1__Impl )
            // InternalMyDsl.g:1297:2: rule__Stacking__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stacking__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stacking__Group__1"


    // $ANTLR start "rule__Stacking__Group__1__Impl"
    // InternalMyDsl.g:1303:1: rule__Stacking__Group__1__Impl : ( ( rule__Stacking__Alternatives_1 ) ) ;
    public final void rule__Stacking__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1307:1: ( ( ( rule__Stacking__Alternatives_1 ) ) )
            // InternalMyDsl.g:1308:1: ( ( rule__Stacking__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1308:1: ( ( rule__Stacking__Alternatives_1 ) )
            // InternalMyDsl.g:1309:2: ( rule__Stacking__Alternatives_1 )
            {
             before(grammarAccess.getStackingAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1310:2: ( rule__Stacking__Alternatives_1 )
            // InternalMyDsl.g:1310:3: rule__Stacking__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Stacking__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getStackingAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stacking__Group__1__Impl"


    // $ANTLR start "rule__UNO_DamienCantin__UnoAssignment_0"
    // InternalMyDsl.g:1319:1: rule__UNO_DamienCantin__UnoAssignment_0 : ( ( 'Uno game' ) ) ;
    public final void rule__UNO_DamienCantin__UnoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1323:1: ( ( ( 'Uno game' ) ) )
            // InternalMyDsl.g:1324:2: ( ( 'Uno game' ) )
            {
            // InternalMyDsl.g:1324:2: ( ( 'Uno game' ) )
            // InternalMyDsl.g:1325:3: ( 'Uno game' )
            {
             before(grammarAccess.getUNO_DamienCantinAccess().getUnoUnoGameKeyword_0_0()); 
            // InternalMyDsl.g:1326:3: ( 'Uno game' )
            // InternalMyDsl.g:1327:4: 'Uno game'
            {
             before(grammarAccess.getUNO_DamienCantinAccess().getUnoUnoGameKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getUNO_DamienCantinAccess().getUnoUnoGameKeyword_0_0()); 

            }

             after(grammarAccess.getUNO_DamienCantinAccess().getUnoUnoGameKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__UnoAssignment_0"


    // $ANTLR start "rule__UNO_DamienCantin__VarAssignment_1"
    // InternalMyDsl.g:1338:1: rule__UNO_DamienCantin__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__UNO_DamienCantin__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1342:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1343:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1343:2: ( RULE_ID )
            // InternalMyDsl.g:1344:3: RULE_ID
            {
             before(grammarAccess.getUNO_DamienCantinAccess().getVarIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUNO_DamienCantinAccess().getVarIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__VarAssignment_1"


    // $ANTLR start "rule__UNO_DamienCantin__BaseAssignment_3_0"
    // InternalMyDsl.g:1353:1: rule__UNO_DamienCantin__BaseAssignment_3_0 : ( ruleBaseVariants ) ;
    public final void rule__UNO_DamienCantin__BaseAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1357:1: ( ( ruleBaseVariants ) )
            // InternalMyDsl.g:1358:2: ( ruleBaseVariants )
            {
            // InternalMyDsl.g:1358:2: ( ruleBaseVariants )
            // InternalMyDsl.g:1359:3: ruleBaseVariants
            {
             before(grammarAccess.getUNO_DamienCantinAccess().getBaseBaseVariantsParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseVariants();

            state._fsp--;

             after(grammarAccess.getUNO_DamienCantinAccess().getBaseBaseVariantsParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__BaseAssignment_3_0"


    // $ANTLR start "rule__UNO_DamienCantin__VariantsAssignment_3_1"
    // InternalMyDsl.g:1368:1: rule__UNO_DamienCantin__VariantsAssignment_3_1 : ( ruleVariants ) ;
    public final void rule__UNO_DamienCantin__VariantsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1372:1: ( ( ruleVariants ) )
            // InternalMyDsl.g:1373:2: ( ruleVariants )
            {
            // InternalMyDsl.g:1373:2: ( ruleVariants )
            // InternalMyDsl.g:1374:3: ruleVariants
            {
             before(grammarAccess.getUNO_DamienCantinAccess().getVariantsVariantsParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariants();

            state._fsp--;

             after(grammarAccess.getUNO_DamienCantinAccess().getVariantsVariantsParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UNO_DamienCantin__VariantsAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000540078000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000000L});

}