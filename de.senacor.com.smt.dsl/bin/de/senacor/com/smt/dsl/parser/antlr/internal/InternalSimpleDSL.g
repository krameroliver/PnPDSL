/*
 * generated by Xtext 2.20.0
 */
grammar InternalSimpleDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.senacor.com.smt.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.senacor.com.smt.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.senacor.com.smt.dsl.services.SimpleDSLGrammarAccess;

}

@parser::members {

 	private SimpleDSLGrammarAccess grammarAccess;

    public InternalSimpleDSLParser(TokenStream input, SimpleDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Document";
   	}

   	@Override
   	protected SimpleDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDocument
entryRuleDocument returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDocumentRule()); }
	iv_ruleDocument=ruleDocument
	{ $current=$iv_ruleDocument.current; }
	EOF;

// Rule Document
ruleDocument returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDocumentAccess().getDocumentAction_0(),
					$current);
			}
		)
		otherlv_1='package'
		{
			newLeafNode(otherlv_1, grammarAccess.getDocumentAccess().getPackageKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getDocumentAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDocumentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDocumentAccess().getEntitesEntityParserRuleCall_3_0());
				}
				lv_entites_3_0=ruleEntity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDocumentRule());
					}
					add(
						$current,
						"entites",
						lv_entites_3_0,
						"de.senacor.com.smt.dsl.SimpleDSL.Entity");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_ID_0=RULE_ID
			{
				$current.merge(this_ID_0);
			}
			{
				newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0());
			}
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1());
			}
		)*
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEntityAccess().getEntityAction_0(),
					$current);
			}
		)
		otherlv_1='Entity'
		{
			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.senacor.com.smt.dsl.SimpleDSL.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='fields'
			{
				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getFieldsKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_0());
					}
					lv_fields_6_0=ruleField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEntityRule());
						}
						add(
							$current,
							"fields",
							lv_fields_6_0,
							"de.senacor.com.smt.dsl.SimpleDSL.Field");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_3_1_0());
						}
						lv_fields_8_0=ruleField
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEntityRule());
							}
							add(
								$current,
								"fields",
								lv_fields_8_0,
								"de.senacor.com.smt.dsl.SimpleDSL.Field");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		(
			otherlv_10='relationships'
			{
				newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getRelationshipsKeyword_5_0());
			}
			otherlv_11='{'
			{
				newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_5_2_0());
					}
					lv_relationships_12_0=ruleRelationship
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEntityRule());
						}
						add(
							$current,
							"relationships",
							lv_relationships_12_0,
							"de.senacor.com.smt.dsl.SimpleDSL.Relationship");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_13=','
				{
					newLeafNode(otherlv_13, grammarAccess.getEntityAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_5_3_1_0());
						}
						lv_relationships_14_0=ruleRelationship
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEntityRule());
							}
							add(
								$current,
								"relationships",
								lv_relationships_14_0,
								"de.senacor.com.smt.dsl.SimpleDSL.Relationship");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_15='}'
			{
				newLeafNode(otherlv_15, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleField
entryRuleField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldRule()); }
	iv_ruleField=ruleField
	{ $current=$iv_ruleField.current; }
	EOF;

// Rule Field
ruleField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFieldAccess().getFieldAction_0(),
					$current);
			}
		)
		otherlv_1='Field'
		{
			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getFieldKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.senacor.com.smt.dsl.SimpleDSL.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='Type'
			{
				newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getTypeKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFieldAccess().getTypeDataTypeEnumRuleCall_4_1_0());
					}
					lv_type_5_0=ruleDataType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFieldRule());
						}
						set(
							$current,
							"type",
							lv_type_5_0,
							"de.senacor.com.smt.dsl.SimpleDSL.DataType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='Length'
			{
				newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getLengthKeyword_5_0());
			}
			(
				(
					lv_length_7_0=RULE_INT
					{
						newLeafNode(lv_length_7_0, grammarAccess.getFieldAccess().getLengthINTTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFieldRule());
						}
						setWithLastConsumed(
							$current,
							"length",
							lv_length_7_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
		(
			otherlv_8='Precision'
			{
				newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getPrecisionKeyword_6_0());
			}
			(
				(
					lv_preciscion_9_0=RULE_INT
					{
						newLeafNode(lv_preciscion_9_0, grammarAccess.getFieldAccess().getPreciscionINTTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFieldRule());
						}
						setWithLastConsumed(
							$current,
							"preciscion",
							lv_preciscion_9_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
		(
			otherlv_10='Scale'
			{
				newLeafNode(otherlv_10, grammarAccess.getFieldAccess().getScaleKeyword_7_0());
			}
			(
				(
					lv_scale_11_0=RULE_INT
					{
						newLeafNode(lv_scale_11_0, grammarAccess.getFieldAccess().getScaleINTTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFieldRule());
						}
						setWithLastConsumed(
							$current,
							"scale",
							lv_scale_11_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
		(
			otherlv_12='Key'
			{
				newLeafNode(otherlv_12, grammarAccess.getFieldAccess().getKeyKeyword_8_0());
			}
			(
				(
					lv_Key_13_0=RULE_KEY
					{
						newLeafNode(lv_Key_13_0, grammarAccess.getFieldAccess().getKeyKeyTerminalRuleCall_8_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFieldRule());
						}
						setWithLastConsumed(
							$current,
							"Key",
							lv_Key_13_0,
							"de.senacor.com.smt.dsl.SimpleDSL.key");
					}
				)
			)
		)?
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleRelationship
entryRuleRelationship returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationshipRule()); }
	iv_ruleRelationship=ruleRelationship
	{ $current=$iv_ruleRelationship.current; }
	EOF;

// Rule Relationship
ruleRelationship returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRelationshipAccess().getRelationshipAction_0(),
					$current);
			}
		)
		otherlv_1='Relationship'
		{
			newLeafNode(otherlv_1, grammarAccess.getRelationshipAccess().getRelationshipKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRelationshipAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRelationshipRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.senacor.com.smt.dsl.SimpleDSL.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='to'
		{
			newLeafNode(otherlv_4, grammarAccess.getRelationshipAccess().getToKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRelationshipRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getRelationshipAccess().getToEntityEntityCrossReference_5_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Rule DataType
ruleDataType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='STRING'
			{
				$current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='NUMBER'
			{
				$current = grammarAccess.getDataTypeAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getNUMBEREnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='DATE'
			{
				$current = grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_KEY : ('T'|'F');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
