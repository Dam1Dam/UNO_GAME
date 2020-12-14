/*
 * generated by Xtext 2.23.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleUNO_DamienCantin
entryRuleUNO_DamienCantin returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUNO_DamienCantinRule()); }
	iv_ruleUNO_DamienCantin=ruleUNO_DamienCantin
	{ $current=$iv_ruleUNO_DamienCantin.current; }
	EOF;

// Rule UNO_DamienCantin
ruleUNO_DamienCantin returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_uno_0_0='Uno game'
				{
					newLeafNode(lv_uno_0_0, grammarAccess.getUNO_DamienCantinAccess().getUnoUnoGameKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUNO_DamienCantinRule());
					}
					setWithLastConsumed($current, "uno", lv_uno_0_0, "Uno game");
				}
			)
		)+
		(
			(
				lv_var_1_0=RULE_ID
				{
					newLeafNode(lv_var_1_0, grammarAccess.getUNO_DamienCantinAccess().getVarIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUNO_DamienCantinRule());
					}
					setWithLastConsumed(
						$current,
						"var",
						lv_var_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)+
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getUNO_DamienCantinAccess().getColonKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getUNO_DamienCantinAccess().getBaseBaseVariantsParserRuleCall_3_0_0());
					}
					lv_base_3_0=ruleBaseVariants
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUNO_DamienCantinRule());
						}
						set(
							$current,
							"base",
							lv_base_3_0,
							"org.xtext.example.mydsl.MyDsl.BaseVariants");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getUNO_DamienCantinAccess().getVariantsVariantsParserRuleCall_3_1_0());
					}
					lv_variants_4_0=ruleVariants
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUNO_DamienCantinRule());
						}
						set(
							$current,
							"variants",
							lv_variants_4_0,
							"org.xtext.example.mydsl.MyDsl.Variants");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleBaseVariants
entryRuleBaseVariants returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBaseVariantsRule()); }
	iv_ruleBaseVariants=ruleBaseVariants
	{ $current=$iv_ruleBaseVariants.current.getText(); }
	EOF;

// Rule BaseVariants
ruleBaseVariants returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Base:'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseVariantsAccess().getBaseKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getBaseVariantsAccess().getBaseVariantParserRuleCall_1());
		}
		this_BaseVariant_1=ruleBaseVariant
		{
			$current.merge(this_BaseVariant_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getBaseVariantsAccess().getHyphenMinusKeyword_2_0());
			}
			{
				newCompositeNode(grammarAccess.getBaseVariantsAccess().getBaseVariantParserRuleCall_2_1());
			}
			this_BaseVariant_3=ruleBaseVariant
			{
				$current.merge(this_BaseVariant_3);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
	)
;

// Entry rule entryRuleBaseVariant
entryRuleBaseVariant returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBaseVariantRule()); }
	iv_ruleBaseVariant=ruleBaseVariant
	{ $current=$iv_ruleBaseVariant.current.getText(); }
	EOF;

// Rule BaseVariant
ruleBaseVariant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Points'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseVariantAccess().getPointsKeyword_0());
		}
		    |
		kw='Cry Uno'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseVariantAccess().getCryUnoKeyword_1());
		}
		    |
		kw='Same number'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseVariantAccess().getSameNumberKeyword_2());
		}
		    |
		kw='Same Color'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBaseVariantAccess().getSameColorKeyword_3());
		}
	)
;

// Entry rule entryRuleVariants
entryRuleVariants returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVariantsRule()); }
	iv_ruleVariants=ruleVariants
	{ $current=$iv_ruleVariants.current.getText(); }
	EOF;

// Rule Variants
ruleVariants returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Variants:'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVariantsAccess().getVariantsKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getVariantsAccess().getVariantParserRuleCall_1());
		}
		this_Variant_1=ruleVariant
		{
			$current.merge(this_Variant_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getVariantsAccess().getHyphenMinusKeyword_2_0());
			}
			{
				newCompositeNode(grammarAccess.getVariantsAccess().getVariantParserRuleCall_2_1());
			}
			this_Variant_3=ruleVariant
			{
				$current.merge(this_Variant_3);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
	)
;

// Entry rule entryRuleVariant
entryRuleVariant returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVariantRule()); }
	iv_ruleVariant=ruleVariant
	{ $current=$iv_ruleVariant.current.getText(); }
	EOF;

// Rule Variant
ruleVariant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getVariantAccess().getHandsParserRuleCall_0());
		}
		this_Hands_0=ruleHands
		{
			$current.merge(this_Hands_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVariantAccess().getSpecialCardsParserRuleCall_1());
		}
		this_SpecialCards_1=ruleSpecialCards
		{
			$current.merge(this_SpecialCards_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVariantAccess().getStackingParserRuleCall_2());
		}
		this_Stacking_2=ruleStacking
		{
			$current.merge(this_Stacking_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		kw='2 players game'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVariantAccess().getPlayersGameKeyword_3());
		}
		    |
		kw='Uno Mao'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVariantAccess().getUnoMaoKeyword_4());
		}
		    |
		kw='Exchange Card'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVariantAccess().getExchangeCardKeyword_5());
		}
		    |
		kw='Suite'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVariantAccess().getSuiteKeyword_6());
		}
	)
;

// Entry rule entryRuleHands
entryRuleHands returns [String current=null]:
	{ newCompositeNode(grammarAccess.getHandsRule()); }
	iv_ruleHands=ruleHands
	{ $current=$iv_ruleHands.current.getText(); }
	EOF;

// Rule Hands
ruleHands returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Hands:'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getHandsAccess().getHandsKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getHandsAccess().getHandParserRuleCall_1());
		}
		this_Hand_1=ruleHand
		{
			$current.merge(this_Hand_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='/'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getHandsAccess().getSolidusKeyword_2_0());
			}
			{
				newCompositeNode(grammarAccess.getHandsAccess().getHandParserRuleCall_2_1());
			}
			this_Hand_3=ruleHand
			{
				$current.merge(this_Hand_3);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
	)
;

// Entry rule entryRuleHand
entryRuleHand returns [String current=null]:
	{ newCompositeNode(grammarAccess.getHandRule()); }
	iv_ruleHand=ruleHand
	{ $current=$iv_ruleHand.current.getText(); }
	EOF;

// Rule Hand
ruleHand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Hands Down'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getHandAccess().getHandsDownKeyword_0());
		}
		    |
		kw='Three Hands Uno'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getHandAccess().getThreeHandsUnoKeyword_1());
		}
	)
;

// Entry rule entryRuleSpecialCards
entryRuleSpecialCards returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSpecialCardsRule()); }
	iv_ruleSpecialCards=ruleSpecialCards
	{ $current=$iv_ruleSpecialCards.current.getText(); }
	EOF;

// Rule SpecialCards
ruleSpecialCards returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Special Cards:'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSpecialCardsAccess().getSpecialCardsKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getSpecialCardsAccess().getSpecialCardParserRuleCall_1());
		}
		this_SpecialCard_1=ruleSpecialCard
		{
			$current.merge(this_SpecialCard_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='/'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getSpecialCardsAccess().getSolidusKeyword_2_0());
			}
			{
				newCompositeNode(grammarAccess.getSpecialCardsAccess().getSpecialCardParserRuleCall_2_1());
			}
			this_SpecialCard_3=ruleSpecialCard
			{
				$current.merge(this_SpecialCard_3);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
	)
;

// Entry rule entryRuleSpecialCard
entryRuleSpecialCard returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSpecialCardRule()); }
	iv_ruleSpecialCard=ruleSpecialCard
	{ $current=$iv_ruleSpecialCard.current.getText(); }
	EOF;

// Rule SpecialCard
ruleSpecialCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSpecialCardAccess().getWildCardParserRuleCall_0());
		}
		this_WildCard_0=ruleWildCard
		{
			$current.merge(this_WildCard_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		kw='Card Bomb'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSpecialCardAccess().getCardBombKeyword_1());
		}
	)
;

// Entry rule entryRuleWildCard
entryRuleWildCard returns [String current=null]:
	{ newCompositeNode(grammarAccess.getWildCardRule()); }
	iv_ruleWildCard=ruleWildCard
	{ $current=$iv_ruleWildCard.current.getText(); }
	EOF;

// Rule WildCard
ruleWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='WildCard:'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getWildCardAccess().getWildCardKeyword_0());
		}
		(
			kw='ShownDown'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getWildCardAccess().getShownDownKeyword_1_0());
			}
			    |
			kw='Roulette'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getWildCardAccess().getRouletteKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleStacking
entryRuleStacking returns [String current=null]:
	{ newCompositeNode(grammarAccess.getStackingRule()); }
	iv_ruleStacking=ruleStacking
	{ $current=$iv_ruleStacking.current.getText(); }
	EOF;

// Rule Stacking
ruleStacking returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Stacking:'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getStackingAccess().getStackingKeyword_0());
		}
		(
			kw='All Cards'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getStackingAccess().getAllCardsKeyword_1_0());
			}
			    |
			kw='All except special cards'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getStackingAccess().getAllExceptSpecialCardsKeyword_1_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;