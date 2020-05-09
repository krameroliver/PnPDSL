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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'Entity'", "'{'", "'fields'", "','", "'}'", "'relationships'", "'Field'", "'Type'", "'Length'", "'Precision'", "'Scale'", "'Relationship'", "'to'", "'STRING'", "'NUMBER'", "'DATE'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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
    // InternalSimpleDSL.g:72:1: ruleDocument returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= ruleEString ) ) ( (lv_entites_3_0= ruleEntity ) )* ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_entites_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleDSL.g:78:2: ( ( () otherlv_1= 'package' ( (lv_name_2_0= ruleEString ) ) ( (lv_entites_3_0= ruleEntity ) )* ) )
            // InternalSimpleDSL.g:79:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleEString ) ) ( (lv_entites_3_0= ruleEntity ) )* )
            {
            // InternalSimpleDSL.g:79:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleEString ) ) ( (lv_entites_3_0= ruleEntity ) )* )
            // InternalSimpleDSL.g:80:3: () otherlv_1= 'package' ( (lv_name_2_0= ruleEString ) ) ( (lv_entites_3_0= ruleEntity ) )*
            {
            // InternalSimpleDSL.g:80:3: ()
            // InternalSimpleDSL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocumentAccess().getDocumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentAccess().getPackageKeyword_1());
            		
            // InternalSimpleDSL.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSimpleDSL.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalSimpleDSL.g:92:4: (lv_name_2_0= ruleEString )
            // InternalSimpleDSL.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDocumentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocumentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.senacor.com.smt.dsl.SimpleDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimpleDSL.g:110:3: ( (lv_entites_3_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpleDSL.g:111:4: (lv_entites_3_0= ruleEntity )
            	    {
            	    // InternalSimpleDSL.g:111:4: (lv_entites_3_0= ruleEntity )
            	    // InternalSimpleDSL.g:112:5: lv_entites_3_0= ruleEntity
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
    // InternalSimpleDSL.g:133:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSimpleDSL.g:133:47: (iv_ruleEString= ruleEString EOF )
            // InternalSimpleDSL.g:134:2: iv_ruleEString= ruleEString EOF
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
    // InternalSimpleDSL.g:140:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSimpleDSL.g:146:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSimpleDSL.g:147:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSimpleDSL.g:147:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalSimpleDSL.g:148:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleDSL.g:156:3: this_ID_1= RULE_ID
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
    // InternalSimpleDSL.g:167:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSimpleDSL.g:167:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSimpleDSL.g:168:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSimpleDSL.g:174:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSimpleDSL.g:180:2: ( ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) )
            // InternalSimpleDSL.g:181:2: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            {
            // InternalSimpleDSL.g:181:2: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            // InternalSimpleDSL.g:182:3: (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID
            {
            // InternalSimpleDSL.g:182:3: (this_ID_0= RULE_ID kw= '.' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==12) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimpleDSL.g:183:4: this_ID_0= RULE_ID kw= '.'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    				current.merge(this_ID_0);
            	    			

            	    				newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0());
            	    			
            	    kw=(Token)match(input,12,FOLLOW_6); 

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
    // InternalSimpleDSL.g:207:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalSimpleDSL.g:207:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalSimpleDSL.g:208:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalSimpleDSL.g:214:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationships' otherlv_11= '{' ( (lv_relationships_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalSimpleDSL.g:220:2: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationships' otherlv_11= '{' ( (lv_relationships_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalSimpleDSL.g:221:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationships' otherlv_11= '{' ( (lv_relationships_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalSimpleDSL.g:221:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationships' otherlv_11= '{' ( (lv_relationships_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalSimpleDSL.g:222:3: () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationships' otherlv_11= '{' ( (lv_relationships_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalSimpleDSL.g:222:3: ()
            // InternalSimpleDSL.g:223:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalSimpleDSL.g:233:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSimpleDSL.g:234:4: (lv_name_2_0= ruleEString )
            {
            // InternalSimpleDSL.g:234:4: (lv_name_2_0= ruleEString )
            // InternalSimpleDSL.g:235:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSimpleDSL.g:256:3: (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimpleDSL.g:257:4: otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getFieldsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSimpleDSL.g:265:4: ( (lv_fields_6_0= ruleField ) )
                    // InternalSimpleDSL.g:266:5: (lv_fields_6_0= ruleField )
                    {
                    // InternalSimpleDSL.g:266:5: (lv_fields_6_0= ruleField )
                    // InternalSimpleDSL.g:267:6: lv_fields_6_0= ruleField
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

                    // InternalSimpleDSL.g:284:4: (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSimpleDSL.g:285:5: otherlv_7= ',' ( (lv_fields_8_0= ruleField ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSimpleDSL.g:289:5: ( (lv_fields_8_0= ruleField ) )
                    	    // InternalSimpleDSL.g:290:6: (lv_fields_8_0= ruleField )
                    	    {
                    	    // InternalSimpleDSL.g:290:6: (lv_fields_8_0= ruleField )
                    	    // InternalSimpleDSL.g:291:7: lv_fields_8_0= ruleField
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

                    otherlv_9=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSimpleDSL.g:314:3: (otherlv_10= 'relationships' otherlv_11= '{' ( (lv_relationships_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )* otherlv_15= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSimpleDSL.g:315:4: otherlv_10= 'relationships' otherlv_11= '{' ( (lv_relationships_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getRelationshipsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSimpleDSL.g:323:4: ( (lv_relationships_12_0= ruleRelationship ) )
                    // InternalSimpleDSL.g:324:5: (lv_relationships_12_0= ruleRelationship )
                    {
                    // InternalSimpleDSL.g:324:5: (lv_relationships_12_0= ruleRelationship )
                    // InternalSimpleDSL.g:325:6: lv_relationships_12_0= ruleRelationship
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

                    // InternalSimpleDSL.g:342:4: (otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSimpleDSL.g:343:5: otherlv_13= ',' ( (lv_relationships_14_0= ruleRelationship ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_12); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEntityAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSimpleDSL.g:347:5: ( (lv_relationships_14_0= ruleRelationship ) )
                    	    // InternalSimpleDSL.g:348:6: (lv_relationships_14_0= ruleRelationship )
                    	    {
                    	    // InternalSimpleDSL.g:348:6: (lv_relationships_14_0= ruleRelationship )
                    	    // InternalSimpleDSL.g:349:7: lv_relationships_14_0= ruleRelationship
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

                    otherlv_15=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

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
    // InternalSimpleDSL.g:380:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalSimpleDSL.g:380:46: (iv_ruleField= ruleField EOF )
            // InternalSimpleDSL.g:381:2: iv_ruleField= ruleField EOF
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
    // InternalSimpleDSL.g:387:1: ruleField returns [EObject current=null] : ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Type' ( (lv_type_5_0= ruleDataType ) ) )? (otherlv_6= 'Length' ( (lv_length_7_0= RULE_INT ) ) )? (otherlv_8= 'Precision' ( (lv_preciscion_9_0= RULE_INT ) ) )? (otherlv_10= 'Scale' ( (lv_scale_11_0= RULE_INT ) ) )? otherlv_12= '}' ) ;
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
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalSimpleDSL.g:393:2: ( ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Type' ( (lv_type_5_0= ruleDataType ) ) )? (otherlv_6= 'Length' ( (lv_length_7_0= RULE_INT ) ) )? (otherlv_8= 'Precision' ( (lv_preciscion_9_0= RULE_INT ) ) )? (otherlv_10= 'Scale' ( (lv_scale_11_0= RULE_INT ) ) )? otherlv_12= '}' ) )
            // InternalSimpleDSL.g:394:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Type' ( (lv_type_5_0= ruleDataType ) ) )? (otherlv_6= 'Length' ( (lv_length_7_0= RULE_INT ) ) )? (otherlv_8= 'Precision' ( (lv_preciscion_9_0= RULE_INT ) ) )? (otherlv_10= 'Scale' ( (lv_scale_11_0= RULE_INT ) ) )? otherlv_12= '}' )
            {
            // InternalSimpleDSL.g:394:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Type' ( (lv_type_5_0= ruleDataType ) ) )? (otherlv_6= 'Length' ( (lv_length_7_0= RULE_INT ) ) )? (otherlv_8= 'Precision' ( (lv_preciscion_9_0= RULE_INT ) ) )? (otherlv_10= 'Scale' ( (lv_scale_11_0= RULE_INT ) ) )? otherlv_12= '}' )
            // InternalSimpleDSL.g:395:3: () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Type' ( (lv_type_5_0= ruleDataType ) ) )? (otherlv_6= 'Length' ( (lv_length_7_0= RULE_INT ) ) )? (otherlv_8= 'Precision' ( (lv_preciscion_9_0= RULE_INT ) ) )? (otherlv_10= 'Scale' ( (lv_scale_11_0= RULE_INT ) ) )? otherlv_12= '}'
            {
            // InternalSimpleDSL.g:395:3: ()
            // InternalSimpleDSL.g:396:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getFieldKeyword_1());
            		
            // InternalSimpleDSL.g:406:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSimpleDSL.g:407:4: (lv_name_2_0= ruleEString )
            {
            // InternalSimpleDSL.g:407:4: (lv_name_2_0= ruleEString )
            // InternalSimpleDSL.g:408:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSimpleDSL.g:429:3: (otherlv_4= 'Type' ( (lv_type_5_0= ruleDataType ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSimpleDSL.g:430:4: otherlv_4= 'Type' ( (lv_type_5_0= ruleDataType ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getTypeKeyword_4_0());
                    			
                    // InternalSimpleDSL.g:434:4: ( (lv_type_5_0= ruleDataType ) )
                    // InternalSimpleDSL.g:435:5: (lv_type_5_0= ruleDataType )
                    {
                    // InternalSimpleDSL.g:435:5: (lv_type_5_0= ruleDataType )
                    // InternalSimpleDSL.g:436:6: lv_type_5_0= ruleDataType
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

            // InternalSimpleDSL.g:454:3: (otherlv_6= 'Length' ( (lv_length_7_0= RULE_INT ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimpleDSL.g:455:4: otherlv_6= 'Length' ( (lv_length_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getLengthKeyword_5_0());
                    			
                    // InternalSimpleDSL.g:459:4: ( (lv_length_7_0= RULE_INT ) )
                    // InternalSimpleDSL.g:460:5: (lv_length_7_0= RULE_INT )
                    {
                    // InternalSimpleDSL.g:460:5: (lv_length_7_0= RULE_INT )
                    // InternalSimpleDSL.g:461:6: lv_length_7_0= RULE_INT
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

            // InternalSimpleDSL.g:478:3: (otherlv_8= 'Precision' ( (lv_preciscion_9_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSimpleDSL.g:479:4: otherlv_8= 'Precision' ( (lv_preciscion_9_0= RULE_INT ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getPrecisionKeyword_6_0());
                    			
                    // InternalSimpleDSL.g:483:4: ( (lv_preciscion_9_0= RULE_INT ) )
                    // InternalSimpleDSL.g:484:5: (lv_preciscion_9_0= RULE_INT )
                    {
                    // InternalSimpleDSL.g:484:5: (lv_preciscion_9_0= RULE_INT )
                    // InternalSimpleDSL.g:485:6: lv_preciscion_9_0= RULE_INT
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

            // InternalSimpleDSL.g:502:3: (otherlv_10= 'Scale' ( (lv_scale_11_0= RULE_INT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSimpleDSL.g:503:4: otherlv_10= 'Scale' ( (lv_scale_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getFieldAccess().getScaleKeyword_7_0());
                    			
                    // InternalSimpleDSL.g:507:4: ( (lv_scale_11_0= RULE_INT ) )
                    // InternalSimpleDSL.g:508:5: (lv_scale_11_0= RULE_INT )
                    {
                    // InternalSimpleDSL.g:508:5: (lv_scale_11_0= RULE_INT )
                    // InternalSimpleDSL.g:509:6: lv_scale_11_0= RULE_INT
                    {
                    lv_scale_11_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalSimpleDSL.g:534:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalSimpleDSL.g:534:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalSimpleDSL.g:535:2: iv_ruleRelationship= ruleRelationship EOF
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
    // InternalSimpleDSL.g:541:1: ruleRelationship returns [EObject current=null] : ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'to' ( ( ruleQualifiedName ) ) otherlv_6= '}' ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSimpleDSL.g:547:2: ( ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'to' ( ( ruleQualifiedName ) ) otherlv_6= '}' ) )
            // InternalSimpleDSL.g:548:2: ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'to' ( ( ruleQualifiedName ) ) otherlv_6= '}' )
            {
            // InternalSimpleDSL.g:548:2: ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'to' ( ( ruleQualifiedName ) ) otherlv_6= '}' )
            // InternalSimpleDSL.g:549:3: () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'to' ( ( ruleQualifiedName ) ) otherlv_6= '}'
            {
            // InternalSimpleDSL.g:549:3: ()
            // InternalSimpleDSL.g:550:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationshipAccess().getRelationshipAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationshipAccess().getRelationshipKeyword_1());
            		
            // InternalSimpleDSL.g:560:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSimpleDSL.g:561:4: (lv_name_2_0= ruleEString )
            {
            // InternalSimpleDSL.g:561:4: (lv_name_2_0= ruleEString )
            // InternalSimpleDSL.g:562:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationshipAccess().getToKeyword_4());
            		
            // InternalSimpleDSL.g:587:3: ( ( ruleQualifiedName ) )
            // InternalSimpleDSL.g:588:4: ( ruleQualifiedName )
            {
            // InternalSimpleDSL.g:588:4: ( ruleQualifiedName )
            // InternalSimpleDSL.g:589:5: ruleQualifiedName
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

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalSimpleDSL.g:611:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSimpleDSL.g:617:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) ) )
            // InternalSimpleDSL.g:618:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) )
            {
            // InternalSimpleDSL.g:618:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMBER' ) | (enumLiteral_2= 'DATE' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
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
                    // InternalSimpleDSL.g:619:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalSimpleDSL.g:619:3: (enumLiteral_0= 'STRING' )
                    // InternalSimpleDSL.g:620:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleDSL.g:627:3: (enumLiteral_1= 'NUMBER' )
                    {
                    // InternalSimpleDSL.g:627:3: (enumLiteral_1= 'NUMBER' )
                    // InternalSimpleDSL.g:628:4: enumLiteral_1= 'NUMBER'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getNUMBEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleDSL.g:635:3: (enumLiteral_2= 'DATE' )
                    {
                    // InternalSimpleDSL.g:635:3: (enumLiteral_2= 'DATE' )
                    // InternalSimpleDSL.g:636:4: enumLiteral_2= 'DATE'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000F20000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000E20000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C20000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});

}