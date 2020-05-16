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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_KEY", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'Entity'", "'{'", "'fields'", "','", "'}'", "'relationships'", "'Field'", "'Type'", "'Length'", "'Precision'", "'Scale'", "'Key'", "'Relationship'", "'to'", "'STRING'", "'NUMBER'", "'DATE'"
    };
    public static final int RULE_KEY=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSimpleDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimpleDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimpleDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimpleDSL.g"; }



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




    // $ANTLR start "entryRuleDocument"
    // InternalSimpleDSL.g:65:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalSimpleDSL.g:65:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalSimpleDSL.g:66:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalSimpleDSL.g:72:1: ruleDocument returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) ( (lv_entites_3_0= ruleEntity ) )* ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_entites_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleDSL.g:78:2: ( ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) ( (lv_entites_3_0= ruleEntity ) )* ) )
            // InternalSimpleDSL.g:79:2: ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) ( (lv_entites_3_0= ruleEntity ) )* )
            {
            // InternalSimpleDSL.g:79:2: ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) ( (lv_entites_3_0= ruleEntity ) )* )
            // InternalSimpleDSL.g:80:3: () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) ( (lv_entites_3_0= ruleEntity ) )*
            {
            // InternalSimpleDSL.g:80:3: ()
            // InternalSimpleDSL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocumentAccess().getDocumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentAccess().getPackageKeyword_1());
            		
            // InternalSimpleDSL.g:91:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSimpleDSL.g:92:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSimpleDSL.g:92:4: (lv_name_2_0= RULE_ID )
            // InternalSimpleDSL.g:93:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDocumentAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSimpleDSL.g:109:3: ( (lv_entites_3_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpleDSL.g:110:4: (lv_entites_3_0= ruleEntity )
            	    {
            	    // InternalSimpleDSL.g:110:4: (lv_entites_3_0= ruleEntity )
            	    // InternalSimpleDSL.g:111:5: lv_entites_3_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getDocumentAccess().getEntitesEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_entites_3_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entites",
            	    						lv_entites_3_0,
            	    						"de.senacor.com.smt.dsl.SimpleDSL.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleEString"
    // InternalSimpleDSL.g:132:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSimpleDSL.g:132:47: (iv_ruleEString= ruleEString EOF )
            // InternalSimpleDSL.g:133:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSimpleDSL.g:139:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSimpleDSL.g:145:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSimpleDSL.g:146:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSimpleDSL.g:146:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSimpleDSL.g:147:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleDSL.g:155:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSimpleDSL.g:166:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSimpleDSL.g:166:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSimpleDSL.g:167:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSimpleDSL.g:173:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSimpleDSL.g:179:2: ( ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) )
            // InternalSimpleDSL.g:180:2: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            {
            // InternalSimpleDSL.g:180:2: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            // InternalSimpleDSL.g:181:3: (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID
            {
            // InternalSimpleDSL.g:181:3: (this_ID_0= RULE_ID kw= '.' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==13) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimpleDSL.g:182:4: this_ID_0= RULE_ID kw= '.'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    				current.merge(this_ID_0);
            	    			

            	    				newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0());
            	    			
            	    kw=(Token)match(input,13,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            			current.merge(this_ID_2);
            		

            			newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEntity"
    // InternalSimpleDSL.g:206:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalSimpleDSL.g:206:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalSimpleDSL.g:207:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalSimpleDSL.g:213:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationships' otherlv_11= '{' ( (lv_relationships_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_fields_6_0 = null;

        EObject lv_fields_8_0 = null;

        EObject lv_relationships_12_0 = null;

        EObject lv_relationships_14_0 = null;



        	enterRule();

        try {
            // InternalSimpleDSL.g:219:2: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationships' otherlv_11= '{' ( (lv_relationships_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalSimpleDSL.g:220:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationships' otherlv_11= '{' ( (lv_relationships_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalSimpleDSL.g:220:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationships' otherlv_11= '{' ( (lv_relationships_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalSimpleDSL.g:221:3: () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationships' otherlv_11= '{' ( (lv_relationships_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalSimpleDSL.g:221:3: ()
            // InternalSimpleDSL.g:222:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalSimpleDSL.g:232:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSimpleDSL.g:233:4: (lv_name_2_0= ruleEString )
            {
            // InternalSimpleDSL.g:233:4: (lv_name_2_0= ruleEString )
            // InternalSimpleDSL.g:234:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.senacor.com.smt.dsl.SimpleDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSimpleDSL.g:255:3: (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimpleDSL.g:256:4: otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getFieldsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSimpleDSL.g:264:4: ( (lv_fields_6_0= ruleField ) )
                    // InternalSimpleDSL.g:265:5: (lv_fields_6_0= ruleField )
                    {
                    // InternalSimpleDSL.g:265:5: (lv_fields_6_0= ruleField )
                    // InternalSimpleDSL.g:266:6: lv_fields_6_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_fields_6_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"fields",
                    							lv_fields_6_0,
                    							"de.senacor.com.smt.dsl.SimpleDSL.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimpleDSL.g:283:4: (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSimpleDSL.g:284:5: otherlv_7= ',' ( (lv_fields_8_0= ruleField ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSimpleDSL.g:288:5: ( (lv_fields_8_0= ruleField ) )
                    	    // InternalSimpleDSL.g:289:6: (lv_fields_8_0= ruleField )
                    	    {
                    	    // InternalSimpleDSL.g:289:6: (lv_fields_8_0= ruleField )
                    	    // InternalSimpleDSL.g:290:7: lv_fields_8_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_fields_8_0=ruleField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_8_0,
                    	    								"de.senacor.com.smt.dsl.SimpleDSL.Field");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSimpleDSL.g:313:3: (otherlv_10= 'relationships' otherlv_11= '{' ( (lv_relationships_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )* otherlv_15= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSimpleDSL.g:314:4: otherlv_10= 'relationships' otherlv_11= '{' ( (lv_relationships_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getRelationshipsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSimpleDSL.g:322:4: ( (lv_relationships_12_0= ruleRelationship ) )
                    // InternalSimpleDSL.g:323:5: (lv_relationships_12_0= ruleRelationship )
                    {
                    // InternalSimpleDSL.g:323:5: (lv_relationships_12_0= ruleRelationship )
                    // InternalSimpleDSL.g:324:6: lv_relationships_12_0= ruleRelationship
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_relationships_12_0=ruleRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"relationships",
                    							lv_relationships_12_0,
                    							"de.senacor.com.smt.dsl.SimpleDSL.Relationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimpleDSL.g:341:4: (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSimpleDSL.g:342:5: otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FOLLOW_12); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEntityAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSimpleDSL.g:346:5: ( (lv_relationships_14_0= ruleRelationship ) )
                    	    // InternalSimpleDSL.g:347:6: (lv_relationships_14_0= ruleRelationship )
                    	    {
                    	    // InternalSimpleDSL.g:347:6: (lv_relationships_14_0= ruleRelationship )
                    	    // InternalSimpleDSL.g:348:7: lv_relationships_14_0= ruleRelationship
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_relationships_14_0=ruleRelationship();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relationships",
                    	    								lv_relationships_14_0,
                    	    								"de.senacor.com.smt.dsl.SimpleDSL.Relationship");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleField"
    // InternalSimpleDSL.g:379:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalSimpleDSL.g:379:46: (iv_ruleField= ruleField EOF )
            // InternalSimpleDSL.g:380:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalSimpleDSL.g:386:1: ruleField returns [EObject current=null] : ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Type' ( (lv_type_5_0= ruleDataType ) ) )? (otherlv_6= 'Length' ( (lv_length_7_0= RULE_INT ) ) )? (otherlv_8= 'Precision' ( (lv_preciscion_9_0= RULE_INT ) ) )? (otherlv_10= 'Scale' ( (lv_scale_11_0= RULE_INT ) ) )? (otherlv_12= 'Key' ( (lv_Key_13_0= RULE_KEY ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_length_7_0=null;
        Token otherlv_8=null;
        Token lv_preciscion_9_0=null;
        Token otherlv_10=null;
        Token lv_scale_11_0=null;
        Token otherlv_12=null;
        Token lv_Key_13_0=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalSimpleDSL.g:392:2: ( ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Type' ( (lv_type_5_0= ruleDataType ) ) )? (otherlv_6= 'Length' ( (lv_length_7_0= RULE_INT ) ) )? (otherlv_8= 'Precision' ( (lv_preciscion_9_0= RULE_INT ) ) )? (otherlv_10= 'Scale' ( (lv_scale_11_0= RULE_INT ) ) )? (otherlv_12= 'Key' ( (lv_Key_13_0= RULE_KEY ) ) )? otherlv_14= '}' ) )
            // InternalSimpleDSL.g:393:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Type' ( (lv_type_5_0= ruleDataType ) ) )? (otherlv_6= 'Length' ( (lv_length_7_0= RULE_INT ) ) )? (otherlv_8= 'Precision' ( (lv_preciscion_9_0= RULE_INT ) ) )? (otherlv_10= 'Scale' ( (lv_scale_11_0= RULE_INT ) ) )? (otherlv_12= 'Key' ( (lv_Key_13_0= RULE_KEY ) ) )? otherlv_14= '}' )
            {
            // InternalSimpleDSL.g:393:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Type' ( (lv_type_5_0= ruleDataType ) ) )? (otherlv_6= 'Length' ( (lv_length_7_0= RULE_INT ) ) )? (otherlv_8= 'Precision' ( (lv_preciscion_9_0= RULE_INT ) ) )? (otherlv_10= 'Scale' ( (lv_scale_11_0= RULE_INT ) ) )? (otherlv_12= 'Key' ( (lv_Key_13_0= RULE_KEY ) ) )? otherlv_14= '}' )
            // InternalSimpleDSL.g:394:3: () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Type' ( (lv_type_5_0= ruleDataType ) ) )? (otherlv_6= 'Length' ( (lv_length_7_0= RULE_INT ) ) )? (otherlv_8= 'Precision' ( (lv_preciscion_9_0= RULE_INT ) ) )? (otherlv_10= 'Scale' ( (lv_scale_11_0= RULE_INT ) ) )? (otherlv_12= 'Key' ( (lv_Key_13_0= RULE_KEY ) ) )? otherlv_14= '}'
            {
            // InternalSimpleDSL.g:394:3: ()
            // InternalSimpleDSL.g:395:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getFieldKeyword_1());
            		
            // InternalSimpleDSL.g:405:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSimpleDSL.g:406:4: (lv_name_2_0= ruleEString )
            {
            // InternalSimpleDSL.g:406:4: (lv_name_2_0= ruleEString )
            // InternalSimpleDSL.g:407:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.senacor.com.smt.dsl.SimpleDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSimpleDSL.g:428:3: (otherlv_4= 'Type' ( (lv_type_5_0= ruleDataType ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSimpleDSL.g:429:4: otherlv_4= 'Type' ( (lv_type_5_0= ruleDataType ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getTypeKeyword_4_0());
                    			
                    // InternalSimpleDSL.g:433:4: ( (lv_type_5_0= ruleDataType ) )
                    // InternalSimpleDSL.g:434:5: (lv_type_5_0= ruleDataType )
                    {
                    // InternalSimpleDSL.g:434:5: (lv_type_5_0= ruleDataType )
                    // InternalSimpleDSL.g:435:6: lv_type_5_0= ruleDataType
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getTypeDataTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_type_5_0=ruleDataType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"de.senacor.com.smt.dsl.SimpleDSL.DataType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSimpleDSL.g:453:3: (otherlv_6= 'Length' ( (lv_length_7_0= RULE_INT ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimpleDSL.g:454:4: otherlv_6= 'Length' ( (lv_length_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getLengthKeyword_5_0());
                    			
                    // InternalSimpleDSL.g:458:4: ( (lv_length_7_0= RULE_INT ) )
                    // InternalSimpleDSL.g:459:5: (lv_length_7_0= RULE_INT )
                    {
                    // InternalSimpleDSL.g:459:5: (lv_length_7_0= RULE_INT )
                    // InternalSimpleDSL.g:460:6: lv_length_7_0= RULE_INT
                    {
                    lv_length_7_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_length_7_0, grammarAccess.getFieldAccess().getLengthINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"length",
                    							lv_length_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSimpleDSL.g:477:3: (otherlv_8= 'Precision' ( (lv_preciscion_9_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSimpleDSL.g:478:4: otherlv_8= 'Precision' ( (lv_preciscion_9_0= RULE_INT ) )
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getPrecisionKeyword_6_0());
                    			
                    // InternalSimpleDSL.g:482:4: ( (lv_preciscion_9_0= RULE_INT ) )
                    // InternalSimpleDSL.g:483:5: (lv_preciscion_9_0= RULE_INT )
                    {
                    // InternalSimpleDSL.g:483:5: (lv_preciscion_9_0= RULE_INT )
                    // InternalSimpleDSL.g:484:6: lv_preciscion_9_0= RULE_INT
                    {
                    lv_preciscion_9_0=(Token)match(input,RULE_INT,FOLLOW_19); 

                    						newLeafNode(lv_preciscion_9_0, grammarAccess.getFieldAccess().getPreciscionINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"preciscion",
                    							lv_preciscion_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSimpleDSL.g:501:3: (otherlv_10= 'Scale' ( (lv_scale_11_0= RULE_INT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSimpleDSL.g:502:4: otherlv_10= 'Scale' ( (lv_scale_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getFieldAccess().getScaleKeyword_7_0());
                    			
                    // InternalSimpleDSL.g:506:4: ( (lv_scale_11_0= RULE_INT ) )
                    // InternalSimpleDSL.g:507:5: (lv_scale_11_0= RULE_INT )
                    {
                    // InternalSimpleDSL.g:507:5: (lv_scale_11_0= RULE_INT )
                    // InternalSimpleDSL.g:508:6: lv_scale_11_0= RULE_INT
                    {
                    lv_scale_11_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    						newLeafNode(lv_scale_11_0, grammarAccess.getFieldAccess().getScaleINTTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"scale",
                    							lv_scale_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSimpleDSL.g:525:3: (otherlv_12= 'Key' ( (lv_Key_13_0= RULE_KEY ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimpleDSL.g:526:4: otherlv_12= 'Key' ( (lv_Key_13_0= RULE_KEY ) )
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getFieldAccess().getKeyKeyword_8_0());
                    			
                    // InternalSimpleDSL.g:530:4: ( (lv_Key_13_0= RULE_KEY ) )
                    // InternalSimpleDSL.g:531:5: (lv_Key_13_0= RULE_KEY )
                    {
                    // InternalSimpleDSL.g:531:5: (lv_Key_13_0= RULE_KEY )
                    // InternalSimpleDSL.g:532:6: lv_Key_13_0= RULE_KEY
                    {
                    lv_Key_13_0=(Token)match(input,RULE_KEY,FOLLOW_13); 

                    						newLeafNode(lv_Key_13_0, grammarAccess.getFieldAccess().getKeyKeyTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Key",
                    							lv_Key_13_0,
                    							"de.senacor.com.smt.dsl.SimpleDSL.key");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleRelationship"
    // InternalSimpleDSL.g:557:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalSimpleDSL.g:557:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalSimpleDSL.g:558:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalSimpleDSL.g:564:1: ruleRelationship returns [EObject current=null] : ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'to' ( ( ruleQualifiedName ) ) otherlv_6= '}' ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSimpleDSL.g:570:2: ( ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'to' ( ( ruleQualifiedName ) ) otherlv_6= '}' ) )
            // InternalSimpleDSL.g:571:2: ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'to' ( ( ruleQualifiedName ) ) otherlv_6= '}' )
            {
            // InternalSimpleDSL.g:571:2: ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'to' ( ( ruleQualifiedName ) ) otherlv_6= '}' )
            // InternalSimpleDSL.g:572:3: () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'to' ( ( ruleQualifiedName ) ) otherlv_6= '}'
            {
            // InternalSimpleDSL.g:572:3: ()
            // InternalSimpleDSL.g:573:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationshipAccess().getRelationshipAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationshipAccess().getRelationshipKeyword_1());
            		
            // InternalSimpleDSL.g:583:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSimpleDSL.g:584:4: (lv_name_2_0= ruleEString )
            {
            // InternalSimpleDSL.g:584:4: (lv_name_2_0= ruleEString )
            // InternalSimpleDSL.g:585:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelationshipAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationshipRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.senacor.com.smt.dsl.SimpleDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationshipAccess().getToKeyword_4());
            		
            // InternalSimpleDSL.g:610:3: ( ( ruleQualifiedName ) )
            // InternalSimpleDSL.g:611:4: ( ruleQualifiedName )
            {
            // InternalSimpleDSL.g:611:4: ( ruleQualifiedName )
            // InternalSimpleDSL.g:612:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelationshipAccess().getToEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_13);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "ruleDataType"
    // InternalSimpleDSL.g:634:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSimpleDSL.g:640:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) ) )
            // InternalSimpleDSL.g:641:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) )
            {
            // InternalSimpleDSL.g:641:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt13=1;
                }
                break;
            case 29:
                {
                alt13=2;
                }
                break;
            case 30:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSimpleDSL.g:642:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalSimpleDSL.g:642:3: (enumLiteral_0= 'STRING' )
                    // InternalSimpleDSL.g:643:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleDSL.g:650:3: (enumLiteral_1= 'NUMBER' )
                    {
                    // InternalSimpleDSL.g:650:3: (enumLiteral_1= 'NUMBER' )
                    // InternalSimpleDSL.g:651:4: enumLiteral_1= 'NUMBER'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getNUMBEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleDSL.g:658:3: (enumLiteral_2= 'DATE' )
                    {
                    // InternalSimpleDSL.g:658:3: (enumLiteral_2= 'DATE' )
                    // InternalSimpleDSL.g:659:4: enumLiteral_2= 'DATE'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003E40000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003C40000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003840000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});

}