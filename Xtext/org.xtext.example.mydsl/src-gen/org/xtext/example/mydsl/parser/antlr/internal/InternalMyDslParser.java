package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Uno game'", "':'", "'Base:'", "'-'", "'Points'", "'Cry Uno'", "'Same number'", "'Same Color'", "'Variants:'", "'2 players game'", "'Uno Mao'", "'Exchange Card'", "'Suite'", "'Hands:'", "'/'", "'Hands Down'", "'Three Hands Uno'", "'Special Cards:'", "'Card Bomb'", "'WildCard:'", "'ShownDown'", "'Roulette'", "'Stacking:'", "'All Cards'", "'All except special cards'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UNO_DamienCantin";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUNO_DamienCantin"
    // InternalMyDsl.g:64:1: entryRuleUNO_DamienCantin returns [EObject current=null] : iv_ruleUNO_DamienCantin= ruleUNO_DamienCantin EOF ;
    public final EObject entryRuleUNO_DamienCantin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNO_DamienCantin = null;


        try {
            // InternalMyDsl.g:64:57: (iv_ruleUNO_DamienCantin= ruleUNO_DamienCantin EOF )
            // InternalMyDsl.g:65:2: iv_ruleUNO_DamienCantin= ruleUNO_DamienCantin EOF
            {
             newCompositeNode(grammarAccess.getUNO_DamienCantinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUNO_DamienCantin=ruleUNO_DamienCantin();

            state._fsp--;

             current =iv_ruleUNO_DamienCantin; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUNO_DamienCantin"


    // $ANTLR start "ruleUNO_DamienCantin"
    // InternalMyDsl.g:71:1: ruleUNO_DamienCantin returns [EObject current=null] : ( ( (lv_uno_0_0= 'Uno game' ) )+ ( (lv_var_1_0= RULE_ID ) )+ otherlv_2= ':' ( ( (lv_base_3_0= ruleBaseVariants ) ) ( (lv_variants_4_0= ruleVariants ) ) )? ) ;
    public final EObject ruleUNO_DamienCantin() throws RecognitionException {
        EObject current = null;

        Token lv_uno_0_0=null;
        Token lv_var_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_base_3_0 = null;

        AntlrDatatypeRuleToken lv_variants_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_uno_0_0= 'Uno game' ) )+ ( (lv_var_1_0= RULE_ID ) )+ otherlv_2= ':' ( ( (lv_base_3_0= ruleBaseVariants ) ) ( (lv_variants_4_0= ruleVariants ) ) )? ) )
            // InternalMyDsl.g:78:2: ( ( (lv_uno_0_0= 'Uno game' ) )+ ( (lv_var_1_0= RULE_ID ) )+ otherlv_2= ':' ( ( (lv_base_3_0= ruleBaseVariants ) ) ( (lv_variants_4_0= ruleVariants ) ) )? )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_uno_0_0= 'Uno game' ) )+ ( (lv_var_1_0= RULE_ID ) )+ otherlv_2= ':' ( ( (lv_base_3_0= ruleBaseVariants ) ) ( (lv_variants_4_0= ruleVariants ) ) )? )
            // InternalMyDsl.g:79:3: ( (lv_uno_0_0= 'Uno game' ) )+ ( (lv_var_1_0= RULE_ID ) )+ otherlv_2= ':' ( ( (lv_base_3_0= ruleBaseVariants ) ) ( (lv_variants_4_0= ruleVariants ) ) )?
            {
            // InternalMyDsl.g:79:3: ( (lv_uno_0_0= 'Uno game' ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:4: (lv_uno_0_0= 'Uno game' )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_uno_0_0= 'Uno game' )
            	    // InternalMyDsl.g:81:5: lv_uno_0_0= 'Uno game'
            	    {
            	    lv_uno_0_0=(Token)match(input,11,FOLLOW_3); 

            	    					newLeafNode(lv_uno_0_0, grammarAccess.getUNO_DamienCantinAccess().getUnoUnoGameKeyword_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUNO_DamienCantinRule());
            	    					}
            	    					setWithLastConsumed(current, "uno", lv_uno_0_0, "Uno game");
            	    				

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

            // InternalMyDsl.g:93:3: ( (lv_var_1_0= RULE_ID ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:94:4: (lv_var_1_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:94:4: (lv_var_1_0= RULE_ID )
            	    // InternalMyDsl.g:95:5: lv_var_1_0= RULE_ID
            	    {
            	    lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    					newLeafNode(lv_var_1_0, grammarAccess.getUNO_DamienCantinAccess().getVarIDTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUNO_DamienCantinRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"var",
            	    						lv_var_1_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

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

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getUNO_DamienCantinAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:115:3: ( ( (lv_base_3_0= ruleBaseVariants ) ) ( (lv_variants_4_0= ruleVariants ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:116:4: ( (lv_base_3_0= ruleBaseVariants ) ) ( (lv_variants_4_0= ruleVariants ) )
                    {
                    // InternalMyDsl.g:116:4: ( (lv_base_3_0= ruleBaseVariants ) )
                    // InternalMyDsl.g:117:5: (lv_base_3_0= ruleBaseVariants )
                    {
                    // InternalMyDsl.g:117:5: (lv_base_3_0= ruleBaseVariants )
                    // InternalMyDsl.g:118:6: lv_base_3_0= ruleBaseVariants
                    {

                    						newCompositeNode(grammarAccess.getUNO_DamienCantinAccess().getBaseBaseVariantsParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_base_3_0=ruleBaseVariants();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUNO_DamienCantinRule());
                    						}
                    						set(
                    							current,
                    							"base",
                    							lv_base_3_0,
                    							"org.xtext.example.mydsl.MyDsl.BaseVariants");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:135:4: ( (lv_variants_4_0= ruleVariants ) )
                    // InternalMyDsl.g:136:5: (lv_variants_4_0= ruleVariants )
                    {
                    // InternalMyDsl.g:136:5: (lv_variants_4_0= ruleVariants )
                    // InternalMyDsl.g:137:6: lv_variants_4_0= ruleVariants
                    {

                    						newCompositeNode(grammarAccess.getUNO_DamienCantinAccess().getVariantsVariantsParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_variants_4_0=ruleVariants();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUNO_DamienCantinRule());
                    						}
                    						set(
                    							current,
                    							"variants",
                    							lv_variants_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Variants");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleUNO_DamienCantin"


    // $ANTLR start "entryRuleBaseVariants"
    // InternalMyDsl.g:159:1: entryRuleBaseVariants returns [String current=null] : iv_ruleBaseVariants= ruleBaseVariants EOF ;
    public final String entryRuleBaseVariants() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseVariants = null;


        try {
            // InternalMyDsl.g:159:52: (iv_ruleBaseVariants= ruleBaseVariants EOF )
            // InternalMyDsl.g:160:2: iv_ruleBaseVariants= ruleBaseVariants EOF
            {
             newCompositeNode(grammarAccess.getBaseVariantsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseVariants=ruleBaseVariants();

            state._fsp--;

             current =iv_ruleBaseVariants.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBaseVariants"


    // $ANTLR start "ruleBaseVariants"
    // InternalMyDsl.g:166:1: ruleBaseVariants returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Base:' this_BaseVariant_1= ruleBaseVariant (kw= '-' this_BaseVariant_3= ruleBaseVariant )* ) ;
    public final AntlrDatatypeRuleToken ruleBaseVariants() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BaseVariant_1 = null;

        AntlrDatatypeRuleToken this_BaseVariant_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:172:2: ( (kw= 'Base:' this_BaseVariant_1= ruleBaseVariant (kw= '-' this_BaseVariant_3= ruleBaseVariant )* ) )
            // InternalMyDsl.g:173:2: (kw= 'Base:' this_BaseVariant_1= ruleBaseVariant (kw= '-' this_BaseVariant_3= ruleBaseVariant )* )
            {
            // InternalMyDsl.g:173:2: (kw= 'Base:' this_BaseVariant_1= ruleBaseVariant (kw= '-' this_BaseVariant_3= ruleBaseVariant )* )
            // InternalMyDsl.g:174:3: kw= 'Base:' this_BaseVariant_1= ruleBaseVariant (kw= '-' this_BaseVariant_3= ruleBaseVariant )*
            {
            kw=(Token)match(input,13,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getBaseVariantsAccess().getBaseKeyword_0());
            		

            			newCompositeNode(grammarAccess.getBaseVariantsAccess().getBaseVariantParserRuleCall_1());
            		
            pushFollow(FOLLOW_8);
            this_BaseVariant_1=ruleBaseVariant();

            state._fsp--;


            			current.merge(this_BaseVariant_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:189:3: (kw= '-' this_BaseVariant_3= ruleBaseVariant )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:190:4: kw= '-' this_BaseVariant_3= ruleBaseVariant
            	    {
            	    kw=(Token)match(input,14,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBaseVariantsAccess().getHyphenMinusKeyword_2_0());
            	    			

            	    				newCompositeNode(grammarAccess.getBaseVariantsAccess().getBaseVariantParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_8);
            	    this_BaseVariant_3=ruleBaseVariant();

            	    state._fsp--;


            	    				current.merge(this_BaseVariant_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleBaseVariants"


    // $ANTLR start "entryRuleBaseVariant"
    // InternalMyDsl.g:210:1: entryRuleBaseVariant returns [String current=null] : iv_ruleBaseVariant= ruleBaseVariant EOF ;
    public final String entryRuleBaseVariant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseVariant = null;


        try {
            // InternalMyDsl.g:210:51: (iv_ruleBaseVariant= ruleBaseVariant EOF )
            // InternalMyDsl.g:211:2: iv_ruleBaseVariant= ruleBaseVariant EOF
            {
             newCompositeNode(grammarAccess.getBaseVariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseVariant=ruleBaseVariant();

            state._fsp--;

             current =iv_ruleBaseVariant.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBaseVariant"


    // $ANTLR start "ruleBaseVariant"
    // InternalMyDsl.g:217:1: ruleBaseVariant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Points' | kw= 'Cry Uno' | kw= 'Same number' | kw= 'Same Color' ) ;
    public final AntlrDatatypeRuleToken ruleBaseVariant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:223:2: ( (kw= 'Points' | kw= 'Cry Uno' | kw= 'Same number' | kw= 'Same Color' ) )
            // InternalMyDsl.g:224:2: (kw= 'Points' | kw= 'Cry Uno' | kw= 'Same number' | kw= 'Same Color' )
            {
            // InternalMyDsl.g:224:2: (kw= 'Points' | kw= 'Cry Uno' | kw= 'Same number' | kw= 'Same Color' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:225:3: kw= 'Points'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBaseVariantAccess().getPointsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:231:3: kw= 'Cry Uno'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBaseVariantAccess().getCryUnoKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:237:3: kw= 'Same number'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBaseVariantAccess().getSameNumberKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:243:3: kw= 'Same Color'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBaseVariantAccess().getSameColorKeyword_3());
                    		

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
    // $ANTLR end "ruleBaseVariant"


    // $ANTLR start "entryRuleVariants"
    // InternalMyDsl.g:252:1: entryRuleVariants returns [String current=null] : iv_ruleVariants= ruleVariants EOF ;
    public final String entryRuleVariants() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariants = null;


        try {
            // InternalMyDsl.g:252:48: (iv_ruleVariants= ruleVariants EOF )
            // InternalMyDsl.g:253:2: iv_ruleVariants= ruleVariants EOF
            {
             newCompositeNode(grammarAccess.getVariantsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariants=ruleVariants();

            state._fsp--;

             current =iv_ruleVariants.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariants"


    // $ANTLR start "ruleVariants"
    // InternalMyDsl.g:259:1: ruleVariants returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Variants:' this_Variant_1= ruleVariant (kw= '-' this_Variant_3= ruleVariant )* ) ;
    public final AntlrDatatypeRuleToken ruleVariants() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Variant_1 = null;

        AntlrDatatypeRuleToken this_Variant_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:265:2: ( (kw= 'Variants:' this_Variant_1= ruleVariant (kw= '-' this_Variant_3= ruleVariant )* ) )
            // InternalMyDsl.g:266:2: (kw= 'Variants:' this_Variant_1= ruleVariant (kw= '-' this_Variant_3= ruleVariant )* )
            {
            // InternalMyDsl.g:266:2: (kw= 'Variants:' this_Variant_1= ruleVariant (kw= '-' this_Variant_3= ruleVariant )* )
            // InternalMyDsl.g:267:3: kw= 'Variants:' this_Variant_1= ruleVariant (kw= '-' this_Variant_3= ruleVariant )*
            {
            kw=(Token)match(input,19,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getVariantsAccess().getVariantsKeyword_0());
            		

            			newCompositeNode(grammarAccess.getVariantsAccess().getVariantParserRuleCall_1());
            		
            pushFollow(FOLLOW_8);
            this_Variant_1=ruleVariant();

            state._fsp--;


            			current.merge(this_Variant_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:282:3: (kw= '-' this_Variant_3= ruleVariant )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:283:4: kw= '-' this_Variant_3= ruleVariant
            	    {
            	    kw=(Token)match(input,14,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getVariantsAccess().getHyphenMinusKeyword_2_0());
            	    			

            	    				newCompositeNode(grammarAccess.getVariantsAccess().getVariantParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_8);
            	    this_Variant_3=ruleVariant();

            	    state._fsp--;


            	    				current.merge(this_Variant_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleVariants"


    // $ANTLR start "entryRuleVariant"
    // InternalMyDsl.g:303:1: entryRuleVariant returns [String current=null] : iv_ruleVariant= ruleVariant EOF ;
    public final String entryRuleVariant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariant = null;


        try {
            // InternalMyDsl.g:303:47: (iv_ruleVariant= ruleVariant EOF )
            // InternalMyDsl.g:304:2: iv_ruleVariant= ruleVariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariant=ruleVariant();

            state._fsp--;

             current =iv_ruleVariant.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariant"


    // $ANTLR start "ruleVariant"
    // InternalMyDsl.g:310:1: ruleVariant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Hands_0= ruleHands | this_SpecialCards_1= ruleSpecialCards | this_Stacking_2= ruleStacking | kw= '2 players game' | kw= 'Uno Mao' | kw= 'Exchange Card' | kw= 'Suite' ) ;
    public final AntlrDatatypeRuleToken ruleVariant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Hands_0 = null;

        AntlrDatatypeRuleToken this_SpecialCards_1 = null;

        AntlrDatatypeRuleToken this_Stacking_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:316:2: ( (this_Hands_0= ruleHands | this_SpecialCards_1= ruleSpecialCards | this_Stacking_2= ruleStacking | kw= '2 players game' | kw= 'Uno Mao' | kw= 'Exchange Card' | kw= 'Suite' ) )
            // InternalMyDsl.g:317:2: (this_Hands_0= ruleHands | this_SpecialCards_1= ruleSpecialCards | this_Stacking_2= ruleStacking | kw= '2 players game' | kw= 'Uno Mao' | kw= 'Exchange Card' | kw= 'Suite' )
            {
            // InternalMyDsl.g:317:2: (this_Hands_0= ruleHands | this_SpecialCards_1= ruleSpecialCards | this_Stacking_2= ruleStacking | kw= '2 players game' | kw= 'Uno Mao' | kw= 'Exchange Card' | kw= 'Suite' )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            case 23:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:318:3: this_Hands_0= ruleHands
                    {

                    			newCompositeNode(grammarAccess.getVariantAccess().getHandsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Hands_0=ruleHands();

                    state._fsp--;


                    			current.merge(this_Hands_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:329:3: this_SpecialCards_1= ruleSpecialCards
                    {

                    			newCompositeNode(grammarAccess.getVariantAccess().getSpecialCardsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpecialCards_1=ruleSpecialCards();

                    state._fsp--;


                    			current.merge(this_SpecialCards_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:340:3: this_Stacking_2= ruleStacking
                    {

                    			newCompositeNode(grammarAccess.getVariantAccess().getStackingParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Stacking_2=ruleStacking();

                    state._fsp--;


                    			current.merge(this_Stacking_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:351:3: kw= '2 players game'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariantAccess().getPlayersGameKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:357:3: kw= 'Uno Mao'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariantAccess().getUnoMaoKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:363:3: kw= 'Exchange Card'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariantAccess().getExchangeCardKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:369:3: kw= 'Suite'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariantAccess().getSuiteKeyword_6());
                    		

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
    // $ANTLR end "ruleVariant"


    // $ANTLR start "entryRuleHands"
    // InternalMyDsl.g:378:1: entryRuleHands returns [String current=null] : iv_ruleHands= ruleHands EOF ;
    public final String entryRuleHands() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHands = null;


        try {
            // InternalMyDsl.g:378:45: (iv_ruleHands= ruleHands EOF )
            // InternalMyDsl.g:379:2: iv_ruleHands= ruleHands EOF
            {
             newCompositeNode(grammarAccess.getHandsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHands=ruleHands();

            state._fsp--;

             current =iv_ruleHands.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHands"


    // $ANTLR start "ruleHands"
    // InternalMyDsl.g:385:1: ruleHands returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Hands:' this_Hand_1= ruleHand (kw= '/' this_Hand_3= ruleHand )* ) ;
    public final AntlrDatatypeRuleToken ruleHands() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Hand_1 = null;

        AntlrDatatypeRuleToken this_Hand_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:391:2: ( (kw= 'Hands:' this_Hand_1= ruleHand (kw= '/' this_Hand_3= ruleHand )* ) )
            // InternalMyDsl.g:392:2: (kw= 'Hands:' this_Hand_1= ruleHand (kw= '/' this_Hand_3= ruleHand )* )
            {
            // InternalMyDsl.g:392:2: (kw= 'Hands:' this_Hand_1= ruleHand (kw= '/' this_Hand_3= ruleHand )* )
            // InternalMyDsl.g:393:3: kw= 'Hands:' this_Hand_1= ruleHand (kw= '/' this_Hand_3= ruleHand )*
            {
            kw=(Token)match(input,24,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getHandsAccess().getHandsKeyword_0());
            		

            			newCompositeNode(grammarAccess.getHandsAccess().getHandParserRuleCall_1());
            		
            pushFollow(FOLLOW_11);
            this_Hand_1=ruleHand();

            state._fsp--;


            			current.merge(this_Hand_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:408:3: (kw= '/' this_Hand_3= ruleHand )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:409:4: kw= '/' this_Hand_3= ruleHand
            	    {
            	    kw=(Token)match(input,25,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getHandsAccess().getSolidusKeyword_2_0());
            	    			

            	    				newCompositeNode(grammarAccess.getHandsAccess().getHandParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_11);
            	    this_Hand_3=ruleHand();

            	    state._fsp--;


            	    				current.merge(this_Hand_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleHands"


    // $ANTLR start "entryRuleHand"
    // InternalMyDsl.g:429:1: entryRuleHand returns [String current=null] : iv_ruleHand= ruleHand EOF ;
    public final String entryRuleHand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHand = null;


        try {
            // InternalMyDsl.g:429:44: (iv_ruleHand= ruleHand EOF )
            // InternalMyDsl.g:430:2: iv_ruleHand= ruleHand EOF
            {
             newCompositeNode(grammarAccess.getHandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHand=ruleHand();

            state._fsp--;

             current =iv_ruleHand.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHand"


    // $ANTLR start "ruleHand"
    // InternalMyDsl.g:436:1: ruleHand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Hands Down' | kw= 'Three Hands Uno' ) ;
    public final AntlrDatatypeRuleToken ruleHand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:442:2: ( (kw= 'Hands Down' | kw= 'Three Hands Uno' ) )
            // InternalMyDsl.g:443:2: (kw= 'Hands Down' | kw= 'Three Hands Uno' )
            {
            // InternalMyDsl.g:443:2: (kw= 'Hands Down' | kw= 'Three Hands Uno' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:444:3: kw= 'Hands Down'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getHandAccess().getHandsDownKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:450:3: kw= 'Three Hands Uno'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getHandAccess().getThreeHandsUnoKeyword_1());
                    		

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
    // $ANTLR end "ruleHand"


    // $ANTLR start "entryRuleSpecialCards"
    // InternalMyDsl.g:459:1: entryRuleSpecialCards returns [String current=null] : iv_ruleSpecialCards= ruleSpecialCards EOF ;
    public final String entryRuleSpecialCards() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecialCards = null;


        try {
            // InternalMyDsl.g:459:52: (iv_ruleSpecialCards= ruleSpecialCards EOF )
            // InternalMyDsl.g:460:2: iv_ruleSpecialCards= ruleSpecialCards EOF
            {
             newCompositeNode(grammarAccess.getSpecialCardsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecialCards=ruleSpecialCards();

            state._fsp--;

             current =iv_ruleSpecialCards.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpecialCards"


    // $ANTLR start "ruleSpecialCards"
    // InternalMyDsl.g:466:1: ruleSpecialCards returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Special Cards:' this_SpecialCard_1= ruleSpecialCard (kw= '/' this_SpecialCard_3= ruleSpecialCard )* ) ;
    public final AntlrDatatypeRuleToken ruleSpecialCards() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SpecialCard_1 = null;

        AntlrDatatypeRuleToken this_SpecialCard_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:472:2: ( (kw= 'Special Cards:' this_SpecialCard_1= ruleSpecialCard (kw= '/' this_SpecialCard_3= ruleSpecialCard )* ) )
            // InternalMyDsl.g:473:2: (kw= 'Special Cards:' this_SpecialCard_1= ruleSpecialCard (kw= '/' this_SpecialCard_3= ruleSpecialCard )* )
            {
            // InternalMyDsl.g:473:2: (kw= 'Special Cards:' this_SpecialCard_1= ruleSpecialCard (kw= '/' this_SpecialCard_3= ruleSpecialCard )* )
            // InternalMyDsl.g:474:3: kw= 'Special Cards:' this_SpecialCard_1= ruleSpecialCard (kw= '/' this_SpecialCard_3= ruleSpecialCard )*
            {
            kw=(Token)match(input,28,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSpecialCardsAccess().getSpecialCardsKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSpecialCardsAccess().getSpecialCardParserRuleCall_1());
            		
            pushFollow(FOLLOW_11);
            this_SpecialCard_1=ruleSpecialCard();

            state._fsp--;


            			current.merge(this_SpecialCard_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:489:3: (kw= '/' this_SpecialCard_3= ruleSpecialCard )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:490:4: kw= '/' this_SpecialCard_3= ruleSpecialCard
            	    {
            	    kw=(Token)match(input,25,FOLLOW_12); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getSpecialCardsAccess().getSolidusKeyword_2_0());
            	    			

            	    				newCompositeNode(grammarAccess.getSpecialCardsAccess().getSpecialCardParserRuleCall_2_1());
            	    			
            	    pushFollow(FOLLOW_11);
            	    this_SpecialCard_3=ruleSpecialCard();

            	    state._fsp--;


            	    				current.merge(this_SpecialCard_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

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
    // $ANTLR end "ruleSpecialCards"


    // $ANTLR start "entryRuleSpecialCard"
    // InternalMyDsl.g:510:1: entryRuleSpecialCard returns [String current=null] : iv_ruleSpecialCard= ruleSpecialCard EOF ;
    public final String entryRuleSpecialCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpecialCard = null;


        try {
            // InternalMyDsl.g:510:51: (iv_ruleSpecialCard= ruleSpecialCard EOF )
            // InternalMyDsl.g:511:2: iv_ruleSpecialCard= ruleSpecialCard EOF
            {
             newCompositeNode(grammarAccess.getSpecialCardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecialCard=ruleSpecialCard();

            state._fsp--;

             current =iv_ruleSpecialCard.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpecialCard"


    // $ANTLR start "ruleSpecialCard"
    // InternalMyDsl.g:517:1: ruleSpecialCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WildCard_0= ruleWildCard | kw= 'Card Bomb' ) ;
    public final AntlrDatatypeRuleToken ruleSpecialCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_WildCard_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:523:2: ( (this_WildCard_0= ruleWildCard | kw= 'Card Bomb' ) )
            // InternalMyDsl.g:524:2: (this_WildCard_0= ruleWildCard | kw= 'Card Bomb' )
            {
            // InternalMyDsl.g:524:2: (this_WildCard_0= ruleWildCard | kw= 'Card Bomb' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:525:3: this_WildCard_0= ruleWildCard
                    {

                    			newCompositeNode(grammarAccess.getSpecialCardAccess().getWildCardParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WildCard_0=ruleWildCard();

                    state._fsp--;


                    			current.merge(this_WildCard_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:536:3: kw= 'Card Bomb'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSpecialCardAccess().getCardBombKeyword_1());
                    		

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
    // $ANTLR end "ruleSpecialCard"


    // $ANTLR start "entryRuleWildCard"
    // InternalMyDsl.g:545:1: entryRuleWildCard returns [String current=null] : iv_ruleWildCard= ruleWildCard EOF ;
    public final String entryRuleWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWildCard = null;


        try {
            // InternalMyDsl.g:545:48: (iv_ruleWildCard= ruleWildCard EOF )
            // InternalMyDsl.g:546:2: iv_ruleWildCard= ruleWildCard EOF
            {
             newCompositeNode(grammarAccess.getWildCardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWildCard=ruleWildCard();

            state._fsp--;

             current =iv_ruleWildCard.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWildCard"


    // $ANTLR start "ruleWildCard"
    // InternalMyDsl.g:552:1: ruleWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'WildCard:' (kw= 'ShownDown' | kw= 'Roulette' ) ) ;
    public final AntlrDatatypeRuleToken ruleWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:558:2: ( (kw= 'WildCard:' (kw= 'ShownDown' | kw= 'Roulette' ) ) )
            // InternalMyDsl.g:559:2: (kw= 'WildCard:' (kw= 'ShownDown' | kw= 'Roulette' ) )
            {
            // InternalMyDsl.g:559:2: (kw= 'WildCard:' (kw= 'ShownDown' | kw= 'Roulette' ) )
            // InternalMyDsl.g:560:3: kw= 'WildCard:' (kw= 'ShownDown' | kw= 'Roulette' )
            {
            kw=(Token)match(input,30,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getWildCardAccess().getWildCardKeyword_0());
            		
            // InternalMyDsl.g:565:3: (kw= 'ShownDown' | kw= 'Roulette' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            else if ( (LA12_0==32) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:566:4: kw= 'ShownDown'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getWildCardAccess().getShownDownKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:572:4: kw= 'Roulette'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getWildCardAccess().getRouletteKeyword_1_1());
                    			

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
    // $ANTLR end "ruleWildCard"


    // $ANTLR start "entryRuleStacking"
    // InternalMyDsl.g:582:1: entryRuleStacking returns [String current=null] : iv_ruleStacking= ruleStacking EOF ;
    public final String entryRuleStacking() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStacking = null;


        try {
            // InternalMyDsl.g:582:48: (iv_ruleStacking= ruleStacking EOF )
            // InternalMyDsl.g:583:2: iv_ruleStacking= ruleStacking EOF
            {
             newCompositeNode(grammarAccess.getStackingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStacking=ruleStacking();

            state._fsp--;

             current =iv_ruleStacking.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStacking"


    // $ANTLR start "ruleStacking"
    // InternalMyDsl.g:589:1: ruleStacking returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Stacking:' (kw= 'All Cards' | kw= 'All except special cards' ) ) ;
    public final AntlrDatatypeRuleToken ruleStacking() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:595:2: ( (kw= 'Stacking:' (kw= 'All Cards' | kw= 'All except special cards' ) ) )
            // InternalMyDsl.g:596:2: (kw= 'Stacking:' (kw= 'All Cards' | kw= 'All except special cards' ) )
            {
            // InternalMyDsl.g:596:2: (kw= 'Stacking:' (kw= 'All Cards' | kw= 'All except special cards' ) )
            // InternalMyDsl.g:597:3: kw= 'Stacking:' (kw= 'All Cards' | kw= 'All except special cards' )
            {
            kw=(Token)match(input,33,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getStackingAccess().getStackingKeyword_0());
            		
            // InternalMyDsl.g:602:3: (kw= 'All Cards' | kw= 'All except special cards' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            else if ( (LA13_0==35) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:603:4: kw= 'All Cards'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getStackingAccess().getAllCardsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:609:4: kw= 'All except special cards'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getStackingAccess().getAllExceptSpecialCardsKeyword_1_1());
                    			

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
    // $ANTLR end "ruleStacking"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000211F00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000C00000000L});

}