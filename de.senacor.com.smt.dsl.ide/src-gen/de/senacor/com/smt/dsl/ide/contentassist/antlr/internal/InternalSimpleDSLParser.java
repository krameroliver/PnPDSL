package de.senacor.com.smt.dsl.ide.contentassist.antlr.internal;

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
import de.senacor.com.smt.dsl.services.SimpleDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_KEY", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'STRING'", "'NUMBER'", "'DATE'", "'package'", "'.'", "'Entity'", "'{'", "'}'", "'fields'", "','", "'relationships'", "'Field'", "'Type'", "'Length'", "'Precision'", "'Scale'", "'Key'", "'Relationship'", "'to'"
    };
    public static final int RULE_KEY=7;
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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

    	public void setGrammarAccess(SimpleDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDocument"
    // InternalSimpleDSL.g:53:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // InternalSimpleDSL.g:54:1: ( ruleDocument EOF )
            // InternalSimpleDSL.g:55:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getDocumentRule()); 
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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalSimpleDSL.g:62:1: ruleDocument : ( ( rule__Document__Group__0 ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:66:2: ( ( ( rule__Document__Group__0 ) ) )
            // InternalSimpleDSL.g:67:2: ( ( rule__Document__Group__0 ) )
            {
            // InternalSimpleDSL.g:67:2: ( ( rule__Document__Group__0 ) )
            // InternalSimpleDSL.g:68:3: ( rule__Document__Group__0 )
            {
             before(grammarAccess.getDocumentAccess().getGroup()); 
            // InternalSimpleDSL.g:69:3: ( rule__Document__Group__0 )
            // InternalSimpleDSL.g:69:4: rule__Document__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Document__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleEString"
    // InternalSimpleDSL.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSimpleDSL.g:79:1: ( ruleEString EOF )
            // InternalSimpleDSL.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSimpleDSL.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSimpleDSL.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSimpleDSL.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalSimpleDSL.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSimpleDSL.g:94:3: ( rule__EString__Alternatives )
            // InternalSimpleDSL.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSimpleDSL.g:103:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSimpleDSL.g:104:1: ( ruleQualifiedName EOF )
            // InternalSimpleDSL.g:105:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSimpleDSL.g:112:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:116:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSimpleDSL.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSimpleDSL.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSimpleDSL.g:118:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalSimpleDSL.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalSimpleDSL.g:119:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEntity"
    // InternalSimpleDSL.g:128:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalSimpleDSL.g:129:1: ( ruleEntity EOF )
            // InternalSimpleDSL.g:130:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalSimpleDSL.g:137:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:141:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalSimpleDSL.g:142:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalSimpleDSL.g:142:2: ( ( rule__Entity__Group__0 ) )
            // InternalSimpleDSL.g:143:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalSimpleDSL.g:144:3: ( rule__Entity__Group__0 )
            // InternalSimpleDSL.g:144:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleField"
    // InternalSimpleDSL.g:153:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalSimpleDSL.g:154:1: ( ruleField EOF )
            // InternalSimpleDSL.g:155:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalSimpleDSL.g:162:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:166:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalSimpleDSL.g:167:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalSimpleDSL.g:167:2: ( ( rule__Field__Group__0 ) )
            // InternalSimpleDSL.g:168:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalSimpleDSL.g:169:3: ( rule__Field__Group__0 )
            // InternalSimpleDSL.g:169:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleRelationship"
    // InternalSimpleDSL.g:178:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // InternalSimpleDSL.g:179:1: ( ruleRelationship EOF )
            // InternalSimpleDSL.g:180:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipRule()); 
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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalSimpleDSL.g:187:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:191:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // InternalSimpleDSL.g:192:2: ( ( rule__Relationship__Group__0 ) )
            {
            // InternalSimpleDSL.g:192:2: ( ( rule__Relationship__Group__0 ) )
            // InternalSimpleDSL.g:193:3: ( rule__Relationship__Group__0 )
            {
             before(grammarAccess.getRelationshipAccess().getGroup()); 
            // InternalSimpleDSL.g:194:3: ( rule__Relationship__Group__0 )
            // InternalSimpleDSL.g:194:4: rule__Relationship__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "ruleDataType"
    // InternalSimpleDSL.g:203:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:207:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSimpleDSL.g:208:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSimpleDSL.g:208:2: ( ( rule__DataType__Alternatives ) )
            // InternalSimpleDSL.g:209:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSimpleDSL.g:210:3: ( rule__DataType__Alternatives )
            // InternalSimpleDSL.g:210:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSimpleDSL.g:218:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:222:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSimpleDSL.g:223:2: ( RULE_STRING )
                    {
                    // InternalSimpleDSL.g:223:2: ( RULE_STRING )
                    // InternalSimpleDSL.g:224:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleDSL.g:229:2: ( RULE_ID )
                    {
                    // InternalSimpleDSL.g:229:2: ( RULE_ID )
                    // InternalSimpleDSL.g:230:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalSimpleDSL.g:239:1: rule__DataType__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'NUMBER' ) ) | ( ( 'DATE' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:243:1: ( ( ( 'STRING' ) ) | ( ( 'NUMBER' ) ) | ( ( 'DATE' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSimpleDSL.g:244:2: ( ( 'STRING' ) )
                    {
                    // InternalSimpleDSL.g:244:2: ( ( 'STRING' ) )
                    // InternalSimpleDSL.g:245:3: ( 'STRING' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalSimpleDSL.g:246:3: ( 'STRING' )
                    // InternalSimpleDSL.g:246:4: 'STRING'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleDSL.g:250:2: ( ( 'NUMBER' ) )
                    {
                    // InternalSimpleDSL.g:250:2: ( ( 'NUMBER' ) )
                    // InternalSimpleDSL.g:251:3: ( 'NUMBER' )
                    {
                     before(grammarAccess.getDataTypeAccess().getNUMBEREnumLiteralDeclaration_1()); 
                    // InternalSimpleDSL.g:252:3: ( 'NUMBER' )
                    // InternalSimpleDSL.g:252:4: 'NUMBER'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getNUMBEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleDSL.g:256:2: ( ( 'DATE' ) )
                    {
                    // InternalSimpleDSL.g:256:2: ( ( 'DATE' ) )
                    // InternalSimpleDSL.g:257:3: ( 'DATE' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_2()); 
                    // InternalSimpleDSL.g:258:3: ( 'DATE' )
                    // InternalSimpleDSL.g:258:4: 'DATE'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__Document__Group__0"
    // InternalSimpleDSL.g:266:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:270:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // InternalSimpleDSL.g:271:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__1();

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
    // $ANTLR end "rule__Document__Group__0"


    // $ANTLR start "rule__Document__Group__0__Impl"
    // InternalSimpleDSL.g:278:1: rule__Document__Group__0__Impl : ( () ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:282:1: ( ( () ) )
            // InternalSimpleDSL.g:283:1: ( () )
            {
            // InternalSimpleDSL.g:283:1: ( () )
            // InternalSimpleDSL.g:284:2: ()
            {
             before(grammarAccess.getDocumentAccess().getDocumentAction_0()); 
            // InternalSimpleDSL.g:285:2: ()
            // InternalSimpleDSL.g:285:3: 
            {
            }

             after(grammarAccess.getDocumentAccess().getDocumentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__0__Impl"


    // $ANTLR start "rule__Document__Group__1"
    // InternalSimpleDSL.g:293:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:297:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // InternalSimpleDSL.g:298:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Document__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__2();

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
    // $ANTLR end "rule__Document__Group__1"


    // $ANTLR start "rule__Document__Group__1__Impl"
    // InternalSimpleDSL.g:305:1: rule__Document__Group__1__Impl : ( 'package' ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:309:1: ( ( 'package' ) )
            // InternalSimpleDSL.g:310:1: ( 'package' )
            {
            // InternalSimpleDSL.g:310:1: ( 'package' )
            // InternalSimpleDSL.g:311:2: 'package'
            {
             before(grammarAccess.getDocumentAccess().getPackageKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__1__Impl"


    // $ANTLR start "rule__Document__Group__2"
    // InternalSimpleDSL.g:320:1: rule__Document__Group__2 : rule__Document__Group__2__Impl rule__Document__Group__3 ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:324:1: ( rule__Document__Group__2__Impl rule__Document__Group__3 )
            // InternalSimpleDSL.g:325:2: rule__Document__Group__2__Impl rule__Document__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Document__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Document__Group__3();

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
    // $ANTLR end "rule__Document__Group__2"


    // $ANTLR start "rule__Document__Group__2__Impl"
    // InternalSimpleDSL.g:332:1: rule__Document__Group__2__Impl : ( ( rule__Document__NameAssignment_2 ) ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:336:1: ( ( ( rule__Document__NameAssignment_2 ) ) )
            // InternalSimpleDSL.g:337:1: ( ( rule__Document__NameAssignment_2 ) )
            {
            // InternalSimpleDSL.g:337:1: ( ( rule__Document__NameAssignment_2 ) )
            // InternalSimpleDSL.g:338:2: ( rule__Document__NameAssignment_2 )
            {
             before(grammarAccess.getDocumentAccess().getNameAssignment_2()); 
            // InternalSimpleDSL.g:339:2: ( rule__Document__NameAssignment_2 )
            // InternalSimpleDSL.g:339:3: rule__Document__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Document__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__2__Impl"


    // $ANTLR start "rule__Document__Group__3"
    // InternalSimpleDSL.g:347:1: rule__Document__Group__3 : rule__Document__Group__3__Impl ;
    public final void rule__Document__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:351:1: ( rule__Document__Group__3__Impl )
            // InternalSimpleDSL.g:352:2: rule__Document__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Document__Group__3__Impl();

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
    // $ANTLR end "rule__Document__Group__3"


    // $ANTLR start "rule__Document__Group__3__Impl"
    // InternalSimpleDSL.g:358:1: rule__Document__Group__3__Impl : ( ( rule__Document__EntitesAssignment_3 )* ) ;
    public final void rule__Document__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:362:1: ( ( ( rule__Document__EntitesAssignment_3 )* ) )
            // InternalSimpleDSL.g:363:1: ( ( rule__Document__EntitesAssignment_3 )* )
            {
            // InternalSimpleDSL.g:363:1: ( ( rule__Document__EntitesAssignment_3 )* )
            // InternalSimpleDSL.g:364:2: ( rule__Document__EntitesAssignment_3 )*
            {
             before(grammarAccess.getDocumentAccess().getEntitesAssignment_3()); 
            // InternalSimpleDSL.g:365:2: ( rule__Document__EntitesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimpleDSL.g:365:3: rule__Document__EntitesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Document__EntitesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getEntitesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalSimpleDSL.g:374:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:378:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSimpleDSL.g:379:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalSimpleDSL.g:386:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__Group_0__0 )* ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:390:1: ( ( ( rule__QualifiedName__Group_0__0 )* ) )
            // InternalSimpleDSL.g:391:1: ( ( rule__QualifiedName__Group_0__0 )* )
            {
            // InternalSimpleDSL.g:391:1: ( ( rule__QualifiedName__Group_0__0 )* )
            // InternalSimpleDSL.g:392:2: ( rule__QualifiedName__Group_0__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_0()); 
            // InternalSimpleDSL.g:393:2: ( rule__QualifiedName__Group_0__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==16) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimpleDSL.g:393:3: rule__QualifiedName__Group_0__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__QualifiedName__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalSimpleDSL.g:401:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:405:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSimpleDSL.g:406:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalSimpleDSL.g:412:1: rule__QualifiedName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:416:1: ( ( RULE_ID ) )
            // InternalSimpleDSL.g:417:1: ( RULE_ID )
            {
            // InternalSimpleDSL.g:417:1: ( RULE_ID )
            // InternalSimpleDSL.g:418:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_0__0"
    // InternalSimpleDSL.g:428:1: rule__QualifiedName__Group_0__0 : rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 ;
    public final void rule__QualifiedName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:432:1: ( rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 )
            // InternalSimpleDSL.g:433:2: rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_0__1();

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
    // $ANTLR end "rule__QualifiedName__Group_0__0"


    // $ANTLR start "rule__QualifiedName__Group_0__0__Impl"
    // InternalSimpleDSL.g:440:1: rule__QualifiedName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:444:1: ( ( RULE_ID ) )
            // InternalSimpleDSL.g:445:1: ( RULE_ID )
            {
            // InternalSimpleDSL.g:445:1: ( RULE_ID )
            // InternalSimpleDSL.g:446:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_0__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_0__1"
    // InternalSimpleDSL.g:455:1: rule__QualifiedName__Group_0__1 : rule__QualifiedName__Group_0__1__Impl ;
    public final void rule__QualifiedName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:459:1: ( rule__QualifiedName__Group_0__1__Impl )
            // InternalSimpleDSL.g:460:2: rule__QualifiedName__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_0__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_0__1"


    // $ANTLR start "rule__QualifiedName__Group_0__1__Impl"
    // InternalSimpleDSL.g:466:1: rule__QualifiedName__Group_0__1__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:470:1: ( ( '.' ) )
            // InternalSimpleDSL.g:471:1: ( '.' )
            {
            // InternalSimpleDSL.g:471:1: ( '.' )
            // InternalSimpleDSL.g:472:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_0__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalSimpleDSL.g:482:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:486:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalSimpleDSL.g:487:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalSimpleDSL.g:494:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:498:1: ( ( () ) )
            // InternalSimpleDSL.g:499:1: ( () )
            {
            // InternalSimpleDSL.g:499:1: ( () )
            // InternalSimpleDSL.g:500:2: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // InternalSimpleDSL.g:501:2: ()
            // InternalSimpleDSL.g:501:3: 
            {
            }

             after(grammarAccess.getEntityAccess().getEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalSimpleDSL.g:509:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:513:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalSimpleDSL.g:514:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalSimpleDSL.g:521:1: rule__Entity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:525:1: ( ( 'Entity' ) )
            // InternalSimpleDSL.g:526:1: ( 'Entity' )
            {
            // InternalSimpleDSL.g:526:1: ( 'Entity' )
            // InternalSimpleDSL.g:527:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalSimpleDSL.g:536:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:540:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalSimpleDSL.g:541:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalSimpleDSL.g:548:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:552:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalSimpleDSL.g:553:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalSimpleDSL.g:553:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalSimpleDSL.g:554:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalSimpleDSL.g:555:2: ( rule__Entity__NameAssignment_2 )
            // InternalSimpleDSL.g:555:3: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalSimpleDSL.g:563:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:567:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalSimpleDSL.g:568:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalSimpleDSL.g:575:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:579:1: ( ( '{' ) )
            // InternalSimpleDSL.g:580:1: ( '{' )
            {
            // InternalSimpleDSL.g:580:1: ( '{' )
            // InternalSimpleDSL.g:581:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalSimpleDSL.g:590:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:594:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalSimpleDSL.g:595:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalSimpleDSL.g:602:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:606:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // InternalSimpleDSL.g:607:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // InternalSimpleDSL.g:607:1: ( ( rule__Entity__Group_4__0 )? )
            // InternalSimpleDSL.g:608:2: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // InternalSimpleDSL.g:609:2: ( rule__Entity__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimpleDSL.g:609:3: rule__Entity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalSimpleDSL.g:617:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:621:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalSimpleDSL.g:622:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalSimpleDSL.g:629:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__Group_5__0 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:633:1: ( ( ( rule__Entity__Group_5__0 )? ) )
            // InternalSimpleDSL.g:634:1: ( ( rule__Entity__Group_5__0 )? )
            {
            // InternalSimpleDSL.g:634:1: ( ( rule__Entity__Group_5__0 )? )
            // InternalSimpleDSL.g:635:2: ( rule__Entity__Group_5__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_5()); 
            // InternalSimpleDSL.g:636:2: ( rule__Entity__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimpleDSL.g:636:3: rule__Entity__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalSimpleDSL.g:644:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:648:1: ( rule__Entity__Group__6__Impl )
            // InternalSimpleDSL.g:649:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__6__Impl();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalSimpleDSL.g:655:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:659:1: ( ( '}' ) )
            // InternalSimpleDSL.g:660:1: ( '}' )
            {
            // InternalSimpleDSL.g:660:1: ( '}' )
            // InternalSimpleDSL.g:661:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group_4__0"
    // InternalSimpleDSL.g:671:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:675:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // InternalSimpleDSL.g:676:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__1();

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
    // $ANTLR end "rule__Entity__Group_4__0"


    // $ANTLR start "rule__Entity__Group_4__0__Impl"
    // InternalSimpleDSL.g:683:1: rule__Entity__Group_4__0__Impl : ( 'fields' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:687:1: ( ( 'fields' ) )
            // InternalSimpleDSL.g:688:1: ( 'fields' )
            {
            // InternalSimpleDSL.g:688:1: ( 'fields' )
            // InternalSimpleDSL.g:689:2: 'fields'
            {
             before(grammarAccess.getEntityAccess().getFieldsKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getFieldsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__0__Impl"


    // $ANTLR start "rule__Entity__Group_4__1"
    // InternalSimpleDSL.g:698:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:702:1: ( rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 )
            // InternalSimpleDSL.g:703:2: rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__2();

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
    // $ANTLR end "rule__Entity__Group_4__1"


    // $ANTLR start "rule__Entity__Group_4__1__Impl"
    // InternalSimpleDSL.g:710:1: rule__Entity__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:714:1: ( ( '{' ) )
            // InternalSimpleDSL.g:715:1: ( '{' )
            {
            // InternalSimpleDSL.g:715:1: ( '{' )
            // InternalSimpleDSL.g:716:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__1__Impl"


    // $ANTLR start "rule__Entity__Group_4__2"
    // InternalSimpleDSL.g:725:1: rule__Entity__Group_4__2 : rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 ;
    public final void rule__Entity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:729:1: ( rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 )
            // InternalSimpleDSL.g:730:2: rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__3();

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
    // $ANTLR end "rule__Entity__Group_4__2"


    // $ANTLR start "rule__Entity__Group_4__2__Impl"
    // InternalSimpleDSL.g:737:1: rule__Entity__Group_4__2__Impl : ( ( rule__Entity__FieldsAssignment_4_2 ) ) ;
    public final void rule__Entity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:741:1: ( ( ( rule__Entity__FieldsAssignment_4_2 ) ) )
            // InternalSimpleDSL.g:742:1: ( ( rule__Entity__FieldsAssignment_4_2 ) )
            {
            // InternalSimpleDSL.g:742:1: ( ( rule__Entity__FieldsAssignment_4_2 ) )
            // InternalSimpleDSL.g:743:2: ( rule__Entity__FieldsAssignment_4_2 )
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4_2()); 
            // InternalSimpleDSL.g:744:2: ( rule__Entity__FieldsAssignment_4_2 )
            // InternalSimpleDSL.g:744:3: rule__Entity__FieldsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__FieldsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFieldsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__2__Impl"


    // $ANTLR start "rule__Entity__Group_4__3"
    // InternalSimpleDSL.g:752:1: rule__Entity__Group_4__3 : rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 ;
    public final void rule__Entity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:756:1: ( rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 )
            // InternalSimpleDSL.g:757:2: rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__4();

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
    // $ANTLR end "rule__Entity__Group_4__3"


    // $ANTLR start "rule__Entity__Group_4__3__Impl"
    // InternalSimpleDSL.g:764:1: rule__Entity__Group_4__3__Impl : ( ( rule__Entity__Group_4_3__0 )* ) ;
    public final void rule__Entity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:768:1: ( ( ( rule__Entity__Group_4_3__0 )* ) )
            // InternalSimpleDSL.g:769:1: ( ( rule__Entity__Group_4_3__0 )* )
            {
            // InternalSimpleDSL.g:769:1: ( ( rule__Entity__Group_4_3__0 )* )
            // InternalSimpleDSL.g:770:2: ( rule__Entity__Group_4_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_4_3()); 
            // InternalSimpleDSL.g:771:2: ( rule__Entity__Group_4_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimpleDSL.g:771:3: rule__Entity__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Entity__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__3__Impl"


    // $ANTLR start "rule__Entity__Group_4__4"
    // InternalSimpleDSL.g:779:1: rule__Entity__Group_4__4 : rule__Entity__Group_4__4__Impl ;
    public final void rule__Entity__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:783:1: ( rule__Entity__Group_4__4__Impl )
            // InternalSimpleDSL.g:784:2: rule__Entity__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__4__Impl();

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
    // $ANTLR end "rule__Entity__Group_4__4"


    // $ANTLR start "rule__Entity__Group_4__4__Impl"
    // InternalSimpleDSL.g:790:1: rule__Entity__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:794:1: ( ( '}' ) )
            // InternalSimpleDSL.g:795:1: ( '}' )
            {
            // InternalSimpleDSL.g:795:1: ( '}' )
            // InternalSimpleDSL.g:796:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__4__Impl"


    // $ANTLR start "rule__Entity__Group_4_3__0"
    // InternalSimpleDSL.g:806:1: rule__Entity__Group_4_3__0 : rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1 ;
    public final void rule__Entity__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:810:1: ( rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1 )
            // InternalSimpleDSL.g:811:2: rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4_3__1();

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
    // $ANTLR end "rule__Entity__Group_4_3__0"


    // $ANTLR start "rule__Entity__Group_4_3__0__Impl"
    // InternalSimpleDSL.g:818:1: rule__Entity__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:822:1: ( ( ',' ) )
            // InternalSimpleDSL.g:823:1: ( ',' )
            {
            // InternalSimpleDSL.g:823:1: ( ',' )
            // InternalSimpleDSL.g:824:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_4_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_4_3__1"
    // InternalSimpleDSL.g:833:1: rule__Entity__Group_4_3__1 : rule__Entity__Group_4_3__1__Impl ;
    public final void rule__Entity__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:837:1: ( rule__Entity__Group_4_3__1__Impl )
            // InternalSimpleDSL.g:838:2: rule__Entity__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_4_3__1"


    // $ANTLR start "rule__Entity__Group_4_3__1__Impl"
    // InternalSimpleDSL.g:844:1: rule__Entity__Group_4_3__1__Impl : ( ( rule__Entity__FieldsAssignment_4_3_1 ) ) ;
    public final void rule__Entity__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:848:1: ( ( ( rule__Entity__FieldsAssignment_4_3_1 ) ) )
            // InternalSimpleDSL.g:849:1: ( ( rule__Entity__FieldsAssignment_4_3_1 ) )
            {
            // InternalSimpleDSL.g:849:1: ( ( rule__Entity__FieldsAssignment_4_3_1 ) )
            // InternalSimpleDSL.g:850:2: ( rule__Entity__FieldsAssignment_4_3_1 )
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4_3_1()); 
            // InternalSimpleDSL.g:851:2: ( rule__Entity__FieldsAssignment_4_3_1 )
            // InternalSimpleDSL.g:851:3: rule__Entity__FieldsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__FieldsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFieldsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_5__0"
    // InternalSimpleDSL.g:860:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:864:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // InternalSimpleDSL.g:865:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__1();

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
    // $ANTLR end "rule__Entity__Group_5__0"


    // $ANTLR start "rule__Entity__Group_5__0__Impl"
    // InternalSimpleDSL.g:872:1: rule__Entity__Group_5__0__Impl : ( 'relationships' ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:876:1: ( ( 'relationships' ) )
            // InternalSimpleDSL.g:877:1: ( 'relationships' )
            {
            // InternalSimpleDSL.g:877:1: ( 'relationships' )
            // InternalSimpleDSL.g:878:2: 'relationships'
            {
             before(grammarAccess.getEntityAccess().getRelationshipsKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRelationshipsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_5__0__Impl"


    // $ANTLR start "rule__Entity__Group_5__1"
    // InternalSimpleDSL.g:887:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl rule__Entity__Group_5__2 ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:891:1: ( rule__Entity__Group_5__1__Impl rule__Entity__Group_5__2 )
            // InternalSimpleDSL.g:892:2: rule__Entity__Group_5__1__Impl rule__Entity__Group_5__2
            {
            pushFollow(FOLLOW_15);
            rule__Entity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__2();

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
    // $ANTLR end "rule__Entity__Group_5__1"


    // $ANTLR start "rule__Entity__Group_5__1__Impl"
    // InternalSimpleDSL.g:899:1: rule__Entity__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:903:1: ( ( '{' ) )
            // InternalSimpleDSL.g:904:1: ( '{' )
            {
            // InternalSimpleDSL.g:904:1: ( '{' )
            // InternalSimpleDSL.g:905:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_5__1__Impl"


    // $ANTLR start "rule__Entity__Group_5__2"
    // InternalSimpleDSL.g:914:1: rule__Entity__Group_5__2 : rule__Entity__Group_5__2__Impl rule__Entity__Group_5__3 ;
    public final void rule__Entity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:918:1: ( rule__Entity__Group_5__2__Impl rule__Entity__Group_5__3 )
            // InternalSimpleDSL.g:919:2: rule__Entity__Group_5__2__Impl rule__Entity__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__3();

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
    // $ANTLR end "rule__Entity__Group_5__2"


    // $ANTLR start "rule__Entity__Group_5__2__Impl"
    // InternalSimpleDSL.g:926:1: rule__Entity__Group_5__2__Impl : ( ( rule__Entity__RelationshipsAssignment_5_2 ) ) ;
    public final void rule__Entity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:930:1: ( ( ( rule__Entity__RelationshipsAssignment_5_2 ) ) )
            // InternalSimpleDSL.g:931:1: ( ( rule__Entity__RelationshipsAssignment_5_2 ) )
            {
            // InternalSimpleDSL.g:931:1: ( ( rule__Entity__RelationshipsAssignment_5_2 ) )
            // InternalSimpleDSL.g:932:2: ( rule__Entity__RelationshipsAssignment_5_2 )
            {
             before(grammarAccess.getEntityAccess().getRelationshipsAssignment_5_2()); 
            // InternalSimpleDSL.g:933:2: ( rule__Entity__RelationshipsAssignment_5_2 )
            // InternalSimpleDSL.g:933:3: rule__Entity__RelationshipsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__RelationshipsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getRelationshipsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_5__2__Impl"


    // $ANTLR start "rule__Entity__Group_5__3"
    // InternalSimpleDSL.g:941:1: rule__Entity__Group_5__3 : rule__Entity__Group_5__3__Impl rule__Entity__Group_5__4 ;
    public final void rule__Entity__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:945:1: ( rule__Entity__Group_5__3__Impl rule__Entity__Group_5__4 )
            // InternalSimpleDSL.g:946:2: rule__Entity__Group_5__3__Impl rule__Entity__Group_5__4
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__4();

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
    // $ANTLR end "rule__Entity__Group_5__3"


    // $ANTLR start "rule__Entity__Group_5__3__Impl"
    // InternalSimpleDSL.g:953:1: rule__Entity__Group_5__3__Impl : ( ( rule__Entity__Group_5_3__0 )* ) ;
    public final void rule__Entity__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:957:1: ( ( ( rule__Entity__Group_5_3__0 )* ) )
            // InternalSimpleDSL.g:958:1: ( ( rule__Entity__Group_5_3__0 )* )
            {
            // InternalSimpleDSL.g:958:1: ( ( rule__Entity__Group_5_3__0 )* )
            // InternalSimpleDSL.g:959:2: ( rule__Entity__Group_5_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_5_3()); 
            // InternalSimpleDSL.g:960:2: ( rule__Entity__Group_5_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpleDSL.g:960:3: rule__Entity__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Entity__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_5__3__Impl"


    // $ANTLR start "rule__Entity__Group_5__4"
    // InternalSimpleDSL.g:968:1: rule__Entity__Group_5__4 : rule__Entity__Group_5__4__Impl ;
    public final void rule__Entity__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:972:1: ( rule__Entity__Group_5__4__Impl )
            // InternalSimpleDSL.g:973:2: rule__Entity__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__4__Impl();

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
    // $ANTLR end "rule__Entity__Group_5__4"


    // $ANTLR start "rule__Entity__Group_5__4__Impl"
    // InternalSimpleDSL.g:979:1: rule__Entity__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:983:1: ( ( '}' ) )
            // InternalSimpleDSL.g:984:1: ( '}' )
            {
            // InternalSimpleDSL.g:984:1: ( '}' )
            // InternalSimpleDSL.g:985:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_5__4__Impl"


    // $ANTLR start "rule__Entity__Group_5_3__0"
    // InternalSimpleDSL.g:995:1: rule__Entity__Group_5_3__0 : rule__Entity__Group_5_3__0__Impl rule__Entity__Group_5_3__1 ;
    public final void rule__Entity__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:999:1: ( rule__Entity__Group_5_3__0__Impl rule__Entity__Group_5_3__1 )
            // InternalSimpleDSL.g:1000:2: rule__Entity__Group_5_3__0__Impl rule__Entity__Group_5_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Entity__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5_3__1();

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
    // $ANTLR end "rule__Entity__Group_5_3__0"


    // $ANTLR start "rule__Entity__Group_5_3__0__Impl"
    // InternalSimpleDSL.g:1007:1: rule__Entity__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1011:1: ( ( ',' ) )
            // InternalSimpleDSL.g:1012:1: ( ',' )
            {
            // InternalSimpleDSL.g:1012:1: ( ',' )
            // InternalSimpleDSL.g:1013:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_5_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_5_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_5_3__1"
    // InternalSimpleDSL.g:1022:1: rule__Entity__Group_5_3__1 : rule__Entity__Group_5_3__1__Impl ;
    public final void rule__Entity__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1026:1: ( rule__Entity__Group_5_3__1__Impl )
            // InternalSimpleDSL.g:1027:2: rule__Entity__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_5_3__1"


    // $ANTLR start "rule__Entity__Group_5_3__1__Impl"
    // InternalSimpleDSL.g:1033:1: rule__Entity__Group_5_3__1__Impl : ( ( rule__Entity__RelationshipsAssignment_5_3_1 ) ) ;
    public final void rule__Entity__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1037:1: ( ( ( rule__Entity__RelationshipsAssignment_5_3_1 ) ) )
            // InternalSimpleDSL.g:1038:1: ( ( rule__Entity__RelationshipsAssignment_5_3_1 ) )
            {
            // InternalSimpleDSL.g:1038:1: ( ( rule__Entity__RelationshipsAssignment_5_3_1 ) )
            // InternalSimpleDSL.g:1039:2: ( rule__Entity__RelationshipsAssignment_5_3_1 )
            {
             before(grammarAccess.getEntityAccess().getRelationshipsAssignment_5_3_1()); 
            // InternalSimpleDSL.g:1040:2: ( rule__Entity__RelationshipsAssignment_5_3_1 )
            // InternalSimpleDSL.g:1040:3: rule__Entity__RelationshipsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__RelationshipsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getRelationshipsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_5_3__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalSimpleDSL.g:1049:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1053:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalSimpleDSL.g:1054:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalSimpleDSL.g:1061:1: rule__Field__Group__0__Impl : ( () ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1065:1: ( ( () ) )
            // InternalSimpleDSL.g:1066:1: ( () )
            {
            // InternalSimpleDSL.g:1066:1: ( () )
            // InternalSimpleDSL.g:1067:2: ()
            {
             before(grammarAccess.getFieldAccess().getFieldAction_0()); 
            // InternalSimpleDSL.g:1068:2: ()
            // InternalSimpleDSL.g:1068:3: 
            {
            }

             after(grammarAccess.getFieldAccess().getFieldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalSimpleDSL.g:1076:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1080:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalSimpleDSL.g:1081:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalSimpleDSL.g:1088:1: rule__Field__Group__1__Impl : ( 'Field' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1092:1: ( ( 'Field' ) )
            // InternalSimpleDSL.g:1093:1: ( 'Field' )
            {
            // InternalSimpleDSL.g:1093:1: ( 'Field' )
            // InternalSimpleDSL.g:1094:2: 'Field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getFieldKeyword_1()); 

            }


            }

        }
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
    // InternalSimpleDSL.g:1103:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1107:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalSimpleDSL.g:1108:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__3();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalSimpleDSL.g:1115:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1119:1: ( ( ( rule__Field__NameAssignment_2 ) ) )
            // InternalSimpleDSL.g:1120:1: ( ( rule__Field__NameAssignment_2 ) )
            {
            // InternalSimpleDSL.g:1120:1: ( ( rule__Field__NameAssignment_2 ) )
            // InternalSimpleDSL.g:1121:2: ( rule__Field__NameAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            // InternalSimpleDSL.g:1122:2: ( rule__Field__NameAssignment_2 )
            // InternalSimpleDSL.g:1122:3: rule__Field__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalSimpleDSL.g:1130:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1134:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalSimpleDSL.g:1135:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__4();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalSimpleDSL.g:1142:1: rule__Field__Group__3__Impl : ( '{' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1146:1: ( ( '{' ) )
            // InternalSimpleDSL.g:1147:1: ( '{' )
            {
            // InternalSimpleDSL.g:1147:1: ( '{' )
            // InternalSimpleDSL.g:1148:2: '{'
            {
             before(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalSimpleDSL.g:1157:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1161:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // InternalSimpleDSL.g:1162:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__5();

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
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // InternalSimpleDSL.g:1169:1: rule__Field__Group__4__Impl : ( ( rule__Field__Group_4__0 )? ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1173:1: ( ( ( rule__Field__Group_4__0 )? ) )
            // InternalSimpleDSL.g:1174:1: ( ( rule__Field__Group_4__0 )? )
            {
            // InternalSimpleDSL.g:1174:1: ( ( rule__Field__Group_4__0 )? )
            // InternalSimpleDSL.g:1175:2: ( rule__Field__Group_4__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_4()); 
            // InternalSimpleDSL.g:1176:2: ( rule__Field__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimpleDSL.g:1176:3: rule__Field__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalSimpleDSL.g:1184:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1188:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // InternalSimpleDSL.g:1189:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Field__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__6();

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
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // InternalSimpleDSL.g:1196:1: rule__Field__Group__5__Impl : ( ( rule__Field__Group_5__0 )? ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1200:1: ( ( ( rule__Field__Group_5__0 )? ) )
            // InternalSimpleDSL.g:1201:1: ( ( rule__Field__Group_5__0 )? )
            {
            // InternalSimpleDSL.g:1201:1: ( ( rule__Field__Group_5__0 )? )
            // InternalSimpleDSL.g:1202:2: ( rule__Field__Group_5__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_5()); 
            // InternalSimpleDSL.g:1203:2: ( rule__Field__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSimpleDSL.g:1203:3: rule__Field__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalSimpleDSL.g:1211:1: rule__Field__Group__6 : rule__Field__Group__6__Impl rule__Field__Group__7 ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1215:1: ( rule__Field__Group__6__Impl rule__Field__Group__7 )
            // InternalSimpleDSL.g:1216:2: rule__Field__Group__6__Impl rule__Field__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Field__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__7();

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
    // $ANTLR end "rule__Field__Group__6"


    // $ANTLR start "rule__Field__Group__6__Impl"
    // InternalSimpleDSL.g:1223:1: rule__Field__Group__6__Impl : ( ( rule__Field__Group_6__0 )? ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1227:1: ( ( ( rule__Field__Group_6__0 )? ) )
            // InternalSimpleDSL.g:1228:1: ( ( rule__Field__Group_6__0 )? )
            {
            // InternalSimpleDSL.g:1228:1: ( ( rule__Field__Group_6__0 )? )
            // InternalSimpleDSL.g:1229:2: ( rule__Field__Group_6__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_6()); 
            // InternalSimpleDSL.g:1230:2: ( rule__Field__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSimpleDSL.g:1230:3: rule__Field__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalSimpleDSL.g:1238:1: rule__Field__Group__7 : rule__Field__Group__7__Impl rule__Field__Group__8 ;
    public final void rule__Field__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1242:1: ( rule__Field__Group__7__Impl rule__Field__Group__8 )
            // InternalSimpleDSL.g:1243:2: rule__Field__Group__7__Impl rule__Field__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Field__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__8();

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
    // $ANTLR end "rule__Field__Group__7"


    // $ANTLR start "rule__Field__Group__7__Impl"
    // InternalSimpleDSL.g:1250:1: rule__Field__Group__7__Impl : ( ( rule__Field__Group_7__0 )? ) ;
    public final void rule__Field__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1254:1: ( ( ( rule__Field__Group_7__0 )? ) )
            // InternalSimpleDSL.g:1255:1: ( ( rule__Field__Group_7__0 )? )
            {
            // InternalSimpleDSL.g:1255:1: ( ( rule__Field__Group_7__0 )? )
            // InternalSimpleDSL.g:1256:2: ( rule__Field__Group_7__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_7()); 
            // InternalSimpleDSL.g:1257:2: ( rule__Field__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimpleDSL.g:1257:3: rule__Field__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalSimpleDSL.g:1265:1: rule__Field__Group__8 : rule__Field__Group__8__Impl rule__Field__Group__9 ;
    public final void rule__Field__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1269:1: ( rule__Field__Group__8__Impl rule__Field__Group__9 )
            // InternalSimpleDSL.g:1270:2: rule__Field__Group__8__Impl rule__Field__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Field__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__9();

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
    // $ANTLR end "rule__Field__Group__8"


    // $ANTLR start "rule__Field__Group__8__Impl"
    // InternalSimpleDSL.g:1277:1: rule__Field__Group__8__Impl : ( ( rule__Field__Group_8__0 )? ) ;
    public final void rule__Field__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1281:1: ( ( ( rule__Field__Group_8__0 )? ) )
            // InternalSimpleDSL.g:1282:1: ( ( rule__Field__Group_8__0 )? )
            {
            // InternalSimpleDSL.g:1282:1: ( ( rule__Field__Group_8__0 )? )
            // InternalSimpleDSL.g:1283:2: ( rule__Field__Group_8__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_8()); 
            // InternalSimpleDSL.g:1284:2: ( rule__Field__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSimpleDSL.g:1284:3: rule__Field__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_8()); 

            }


            }

        }
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
    // InternalSimpleDSL.g:1292:1: rule__Field__Group__9 : rule__Field__Group__9__Impl ;
    public final void rule__Field__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1296:1: ( rule__Field__Group__9__Impl )
            // InternalSimpleDSL.g:1297:2: rule__Field__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__9__Impl();

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
    // $ANTLR end "rule__Field__Group__9"


    // $ANTLR start "rule__Field__Group__9__Impl"
    // InternalSimpleDSL.g:1303:1: rule__Field__Group__9__Impl : ( '}' ) ;
    public final void rule__Field__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1307:1: ( ( '}' ) )
            // InternalSimpleDSL.g:1308:1: ( '}' )
            {
            // InternalSimpleDSL.g:1308:1: ( '}' )
            // InternalSimpleDSL.g:1309:2: '}'
            {
             before(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Field__Group_4__0"
    // InternalSimpleDSL.g:1319:1: rule__Field__Group_4__0 : rule__Field__Group_4__0__Impl rule__Field__Group_4__1 ;
    public final void rule__Field__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1323:1: ( rule__Field__Group_4__0__Impl rule__Field__Group_4__1 )
            // InternalSimpleDSL.g:1324:2: rule__Field__Group_4__0__Impl rule__Field__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Field__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_4__1();

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
    // $ANTLR end "rule__Field__Group_4__0"


    // $ANTLR start "rule__Field__Group_4__0__Impl"
    // InternalSimpleDSL.g:1331:1: rule__Field__Group_4__0__Impl : ( 'Type' ) ;
    public final void rule__Field__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1335:1: ( ( 'Type' ) )
            // InternalSimpleDSL.g:1336:1: ( 'Type' )
            {
            // InternalSimpleDSL.g:1336:1: ( 'Type' )
            // InternalSimpleDSL.g:1337:2: 'Type'
            {
             before(grammarAccess.getFieldAccess().getTypeKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_4__0__Impl"


    // $ANTLR start "rule__Field__Group_4__1"
    // InternalSimpleDSL.g:1346:1: rule__Field__Group_4__1 : rule__Field__Group_4__1__Impl ;
    public final void rule__Field__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1350:1: ( rule__Field__Group_4__1__Impl )
            // InternalSimpleDSL.g:1351:2: rule__Field__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_4__1__Impl();

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
    // $ANTLR end "rule__Field__Group_4__1"


    // $ANTLR start "rule__Field__Group_4__1__Impl"
    // InternalSimpleDSL.g:1357:1: rule__Field__Group_4__1__Impl : ( ( rule__Field__TypeAssignment_4_1 ) ) ;
    public final void rule__Field__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1361:1: ( ( ( rule__Field__TypeAssignment_4_1 ) ) )
            // InternalSimpleDSL.g:1362:1: ( ( rule__Field__TypeAssignment_4_1 ) )
            {
            // InternalSimpleDSL.g:1362:1: ( ( rule__Field__TypeAssignment_4_1 ) )
            // InternalSimpleDSL.g:1363:2: ( rule__Field__TypeAssignment_4_1 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_4_1()); 
            // InternalSimpleDSL.g:1364:2: ( rule__Field__TypeAssignment_4_1 )
            // InternalSimpleDSL.g:1364:3: rule__Field__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_4__1__Impl"


    // $ANTLR start "rule__Field__Group_5__0"
    // InternalSimpleDSL.g:1373:1: rule__Field__Group_5__0 : rule__Field__Group_5__0__Impl rule__Field__Group_5__1 ;
    public final void rule__Field__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1377:1: ( rule__Field__Group_5__0__Impl rule__Field__Group_5__1 )
            // InternalSimpleDSL.g:1378:2: rule__Field__Group_5__0__Impl rule__Field__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__Field__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_5__1();

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
    // $ANTLR end "rule__Field__Group_5__0"


    // $ANTLR start "rule__Field__Group_5__0__Impl"
    // InternalSimpleDSL.g:1385:1: rule__Field__Group_5__0__Impl : ( 'Length' ) ;
    public final void rule__Field__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1389:1: ( ( 'Length' ) )
            // InternalSimpleDSL.g:1390:1: ( 'Length' )
            {
            // InternalSimpleDSL.g:1390:1: ( 'Length' )
            // InternalSimpleDSL.g:1391:2: 'Length'
            {
             before(grammarAccess.getFieldAccess().getLengthKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getLengthKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_5__0__Impl"


    // $ANTLR start "rule__Field__Group_5__1"
    // InternalSimpleDSL.g:1400:1: rule__Field__Group_5__1 : rule__Field__Group_5__1__Impl ;
    public final void rule__Field__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1404:1: ( rule__Field__Group_5__1__Impl )
            // InternalSimpleDSL.g:1405:2: rule__Field__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_5__1__Impl();

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
    // $ANTLR end "rule__Field__Group_5__1"


    // $ANTLR start "rule__Field__Group_5__1__Impl"
    // InternalSimpleDSL.g:1411:1: rule__Field__Group_5__1__Impl : ( ( rule__Field__LengthAssignment_5_1 ) ) ;
    public final void rule__Field__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1415:1: ( ( ( rule__Field__LengthAssignment_5_1 ) ) )
            // InternalSimpleDSL.g:1416:1: ( ( rule__Field__LengthAssignment_5_1 ) )
            {
            // InternalSimpleDSL.g:1416:1: ( ( rule__Field__LengthAssignment_5_1 ) )
            // InternalSimpleDSL.g:1417:2: ( rule__Field__LengthAssignment_5_1 )
            {
             before(grammarAccess.getFieldAccess().getLengthAssignment_5_1()); 
            // InternalSimpleDSL.g:1418:2: ( rule__Field__LengthAssignment_5_1 )
            // InternalSimpleDSL.g:1418:3: rule__Field__LengthAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__LengthAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getLengthAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_5__1__Impl"


    // $ANTLR start "rule__Field__Group_6__0"
    // InternalSimpleDSL.g:1427:1: rule__Field__Group_6__0 : rule__Field__Group_6__0__Impl rule__Field__Group_6__1 ;
    public final void rule__Field__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1431:1: ( rule__Field__Group_6__0__Impl rule__Field__Group_6__1 )
            // InternalSimpleDSL.g:1432:2: rule__Field__Group_6__0__Impl rule__Field__Group_6__1
            {
            pushFollow(FOLLOW_18);
            rule__Field__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_6__1();

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
    // $ANTLR end "rule__Field__Group_6__0"


    // $ANTLR start "rule__Field__Group_6__0__Impl"
    // InternalSimpleDSL.g:1439:1: rule__Field__Group_6__0__Impl : ( 'Precision' ) ;
    public final void rule__Field__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1443:1: ( ( 'Precision' ) )
            // InternalSimpleDSL.g:1444:1: ( 'Precision' )
            {
            // InternalSimpleDSL.g:1444:1: ( 'Precision' )
            // InternalSimpleDSL.g:1445:2: 'Precision'
            {
             before(grammarAccess.getFieldAccess().getPrecisionKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getPrecisionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_6__0__Impl"


    // $ANTLR start "rule__Field__Group_6__1"
    // InternalSimpleDSL.g:1454:1: rule__Field__Group_6__1 : rule__Field__Group_6__1__Impl ;
    public final void rule__Field__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1458:1: ( rule__Field__Group_6__1__Impl )
            // InternalSimpleDSL.g:1459:2: rule__Field__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_6__1__Impl();

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
    // $ANTLR end "rule__Field__Group_6__1"


    // $ANTLR start "rule__Field__Group_6__1__Impl"
    // InternalSimpleDSL.g:1465:1: rule__Field__Group_6__1__Impl : ( ( rule__Field__PreciscionAssignment_6_1 ) ) ;
    public final void rule__Field__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1469:1: ( ( ( rule__Field__PreciscionAssignment_6_1 ) ) )
            // InternalSimpleDSL.g:1470:1: ( ( rule__Field__PreciscionAssignment_6_1 ) )
            {
            // InternalSimpleDSL.g:1470:1: ( ( rule__Field__PreciscionAssignment_6_1 ) )
            // InternalSimpleDSL.g:1471:2: ( rule__Field__PreciscionAssignment_6_1 )
            {
             before(grammarAccess.getFieldAccess().getPreciscionAssignment_6_1()); 
            // InternalSimpleDSL.g:1472:2: ( rule__Field__PreciscionAssignment_6_1 )
            // InternalSimpleDSL.g:1472:3: rule__Field__PreciscionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__PreciscionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getPreciscionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_6__1__Impl"


    // $ANTLR start "rule__Field__Group_7__0"
    // InternalSimpleDSL.g:1481:1: rule__Field__Group_7__0 : rule__Field__Group_7__0__Impl rule__Field__Group_7__1 ;
    public final void rule__Field__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1485:1: ( rule__Field__Group_7__0__Impl rule__Field__Group_7__1 )
            // InternalSimpleDSL.g:1486:2: rule__Field__Group_7__0__Impl rule__Field__Group_7__1
            {
            pushFollow(FOLLOW_18);
            rule__Field__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_7__1();

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
    // $ANTLR end "rule__Field__Group_7__0"


    // $ANTLR start "rule__Field__Group_7__0__Impl"
    // InternalSimpleDSL.g:1493:1: rule__Field__Group_7__0__Impl : ( 'Scale' ) ;
    public final void rule__Field__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1497:1: ( ( 'Scale' ) )
            // InternalSimpleDSL.g:1498:1: ( 'Scale' )
            {
            // InternalSimpleDSL.g:1498:1: ( 'Scale' )
            // InternalSimpleDSL.g:1499:2: 'Scale'
            {
             before(grammarAccess.getFieldAccess().getScaleKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getScaleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_7__0__Impl"


    // $ANTLR start "rule__Field__Group_7__1"
    // InternalSimpleDSL.g:1508:1: rule__Field__Group_7__1 : rule__Field__Group_7__1__Impl ;
    public final void rule__Field__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1512:1: ( rule__Field__Group_7__1__Impl )
            // InternalSimpleDSL.g:1513:2: rule__Field__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_7__1__Impl();

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
    // $ANTLR end "rule__Field__Group_7__1"


    // $ANTLR start "rule__Field__Group_7__1__Impl"
    // InternalSimpleDSL.g:1519:1: rule__Field__Group_7__1__Impl : ( ( rule__Field__ScaleAssignment_7_1 ) ) ;
    public final void rule__Field__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1523:1: ( ( ( rule__Field__ScaleAssignment_7_1 ) ) )
            // InternalSimpleDSL.g:1524:1: ( ( rule__Field__ScaleAssignment_7_1 ) )
            {
            // InternalSimpleDSL.g:1524:1: ( ( rule__Field__ScaleAssignment_7_1 ) )
            // InternalSimpleDSL.g:1525:2: ( rule__Field__ScaleAssignment_7_1 )
            {
             before(grammarAccess.getFieldAccess().getScaleAssignment_7_1()); 
            // InternalSimpleDSL.g:1526:2: ( rule__Field__ScaleAssignment_7_1 )
            // InternalSimpleDSL.g:1526:3: rule__Field__ScaleAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__ScaleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getScaleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_7__1__Impl"


    // $ANTLR start "rule__Field__Group_8__0"
    // InternalSimpleDSL.g:1535:1: rule__Field__Group_8__0 : rule__Field__Group_8__0__Impl rule__Field__Group_8__1 ;
    public final void rule__Field__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1539:1: ( rule__Field__Group_8__0__Impl rule__Field__Group_8__1 )
            // InternalSimpleDSL.g:1540:2: rule__Field__Group_8__0__Impl rule__Field__Group_8__1
            {
            pushFollow(FOLLOW_19);
            rule__Field__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_8__1();

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
    // $ANTLR end "rule__Field__Group_8__0"


    // $ANTLR start "rule__Field__Group_8__0__Impl"
    // InternalSimpleDSL.g:1547:1: rule__Field__Group_8__0__Impl : ( 'Key' ) ;
    public final void rule__Field__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1551:1: ( ( 'Key' ) )
            // InternalSimpleDSL.g:1552:1: ( 'Key' )
            {
            // InternalSimpleDSL.g:1552:1: ( 'Key' )
            // InternalSimpleDSL.g:1553:2: 'Key'
            {
             before(grammarAccess.getFieldAccess().getKeyKeyword_8_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getKeyKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_8__0__Impl"


    // $ANTLR start "rule__Field__Group_8__1"
    // InternalSimpleDSL.g:1562:1: rule__Field__Group_8__1 : rule__Field__Group_8__1__Impl ;
    public final void rule__Field__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1566:1: ( rule__Field__Group_8__1__Impl )
            // InternalSimpleDSL.g:1567:2: rule__Field__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_8__1__Impl();

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
    // $ANTLR end "rule__Field__Group_8__1"


    // $ANTLR start "rule__Field__Group_8__1__Impl"
    // InternalSimpleDSL.g:1573:1: rule__Field__Group_8__1__Impl : ( ( rule__Field__KeyAssignment_8_1 ) ) ;
    public final void rule__Field__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1577:1: ( ( ( rule__Field__KeyAssignment_8_1 ) ) )
            // InternalSimpleDSL.g:1578:1: ( ( rule__Field__KeyAssignment_8_1 ) )
            {
            // InternalSimpleDSL.g:1578:1: ( ( rule__Field__KeyAssignment_8_1 ) )
            // InternalSimpleDSL.g:1579:2: ( rule__Field__KeyAssignment_8_1 )
            {
             before(grammarAccess.getFieldAccess().getKeyAssignment_8_1()); 
            // InternalSimpleDSL.g:1580:2: ( rule__Field__KeyAssignment_8_1 )
            // InternalSimpleDSL.g:1580:3: rule__Field__KeyAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__KeyAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getKeyAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_8__1__Impl"


    // $ANTLR start "rule__Relationship__Group__0"
    // InternalSimpleDSL.g:1589:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1593:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // InternalSimpleDSL.g:1594:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Relationship__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__1();

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
    // $ANTLR end "rule__Relationship__Group__0"


    // $ANTLR start "rule__Relationship__Group__0__Impl"
    // InternalSimpleDSL.g:1601:1: rule__Relationship__Group__0__Impl : ( () ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1605:1: ( ( () ) )
            // InternalSimpleDSL.g:1606:1: ( () )
            {
            // InternalSimpleDSL.g:1606:1: ( () )
            // InternalSimpleDSL.g:1607:2: ()
            {
             before(grammarAccess.getRelationshipAccess().getRelationshipAction_0()); 
            // InternalSimpleDSL.g:1608:2: ()
            // InternalSimpleDSL.g:1608:3: 
            {
            }

             after(grammarAccess.getRelationshipAccess().getRelationshipAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0__Impl"


    // $ANTLR start "rule__Relationship__Group__1"
    // InternalSimpleDSL.g:1616:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1620:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // InternalSimpleDSL.g:1621:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Relationship__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__2();

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
    // $ANTLR end "rule__Relationship__Group__1"


    // $ANTLR start "rule__Relationship__Group__1__Impl"
    // InternalSimpleDSL.g:1628:1: rule__Relationship__Group__1__Impl : ( 'Relationship' ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1632:1: ( ( 'Relationship' ) )
            // InternalSimpleDSL.g:1633:1: ( 'Relationship' )
            {
            // InternalSimpleDSL.g:1633:1: ( 'Relationship' )
            // InternalSimpleDSL.g:1634:2: 'Relationship'
            {
             before(grammarAccess.getRelationshipAccess().getRelationshipKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRelationshipKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1__Impl"


    // $ANTLR start "rule__Relationship__Group__2"
    // InternalSimpleDSL.g:1643:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1647:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // InternalSimpleDSL.g:1648:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Relationship__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__3();

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
    // $ANTLR end "rule__Relationship__Group__2"


    // $ANTLR start "rule__Relationship__Group__2__Impl"
    // InternalSimpleDSL.g:1655:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__NameAssignment_2 ) ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1659:1: ( ( ( rule__Relationship__NameAssignment_2 ) ) )
            // InternalSimpleDSL.g:1660:1: ( ( rule__Relationship__NameAssignment_2 ) )
            {
            // InternalSimpleDSL.g:1660:1: ( ( rule__Relationship__NameAssignment_2 ) )
            // InternalSimpleDSL.g:1661:2: ( rule__Relationship__NameAssignment_2 )
            {
             before(grammarAccess.getRelationshipAccess().getNameAssignment_2()); 
            // InternalSimpleDSL.g:1662:2: ( rule__Relationship__NameAssignment_2 )
            // InternalSimpleDSL.g:1662:3: rule__Relationship__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2__Impl"


    // $ANTLR start "rule__Relationship__Group__3"
    // InternalSimpleDSL.g:1670:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1674:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // InternalSimpleDSL.g:1675:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Relationship__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__4();

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
    // $ANTLR end "rule__Relationship__Group__3"


    // $ANTLR start "rule__Relationship__Group__3__Impl"
    // InternalSimpleDSL.g:1682:1: rule__Relationship__Group__3__Impl : ( '{' ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1686:1: ( ( '{' ) )
            // InternalSimpleDSL.g:1687:1: ( '{' )
            {
            // InternalSimpleDSL.g:1687:1: ( '{' )
            // InternalSimpleDSL.g:1688:2: '{'
            {
             before(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3__Impl"


    // $ANTLR start "rule__Relationship__Group__4"
    // InternalSimpleDSL.g:1697:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1701:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // InternalSimpleDSL.g:1702:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Relationship__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__5();

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
    // $ANTLR end "rule__Relationship__Group__4"


    // $ANTLR start "rule__Relationship__Group__4__Impl"
    // InternalSimpleDSL.g:1709:1: rule__Relationship__Group__4__Impl : ( 'to' ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1713:1: ( ( 'to' ) )
            // InternalSimpleDSL.g:1714:1: ( 'to' )
            {
            // InternalSimpleDSL.g:1714:1: ( 'to' )
            // InternalSimpleDSL.g:1715:2: 'to'
            {
             before(grammarAccess.getRelationshipAccess().getToKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__4__Impl"


    // $ANTLR start "rule__Relationship__Group__5"
    // InternalSimpleDSL.g:1724:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl rule__Relationship__Group__6 ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1728:1: ( rule__Relationship__Group__5__Impl rule__Relationship__Group__6 )
            // InternalSimpleDSL.g:1729:2: rule__Relationship__Group__5__Impl rule__Relationship__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Relationship__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relationship__Group__6();

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
    // $ANTLR end "rule__Relationship__Group__5"


    // $ANTLR start "rule__Relationship__Group__5__Impl"
    // InternalSimpleDSL.g:1736:1: rule__Relationship__Group__5__Impl : ( ( rule__Relationship__ToEntityAssignment_5 ) ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1740:1: ( ( ( rule__Relationship__ToEntityAssignment_5 ) ) )
            // InternalSimpleDSL.g:1741:1: ( ( rule__Relationship__ToEntityAssignment_5 ) )
            {
            // InternalSimpleDSL.g:1741:1: ( ( rule__Relationship__ToEntityAssignment_5 ) )
            // InternalSimpleDSL.g:1742:2: ( rule__Relationship__ToEntityAssignment_5 )
            {
             before(grammarAccess.getRelationshipAccess().getToEntityAssignment_5()); 
            // InternalSimpleDSL.g:1743:2: ( rule__Relationship__ToEntityAssignment_5 )
            // InternalSimpleDSL.g:1743:3: rule__Relationship__ToEntityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__ToEntityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getToEntityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__5__Impl"


    // $ANTLR start "rule__Relationship__Group__6"
    // InternalSimpleDSL.g:1751:1: rule__Relationship__Group__6 : rule__Relationship__Group__6__Impl ;
    public final void rule__Relationship__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1755:1: ( rule__Relationship__Group__6__Impl )
            // InternalSimpleDSL.g:1756:2: rule__Relationship__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Group__6__Impl();

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
    // $ANTLR end "rule__Relationship__Group__6"


    // $ANTLR start "rule__Relationship__Group__6__Impl"
    // InternalSimpleDSL.g:1762:1: rule__Relationship__Group__6__Impl : ( '}' ) ;
    public final void rule__Relationship__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1766:1: ( ( '}' ) )
            // InternalSimpleDSL.g:1767:1: ( '}' )
            {
            // InternalSimpleDSL.g:1767:1: ( '}' )
            // InternalSimpleDSL.g:1768:2: '}'
            {
             before(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__6__Impl"


    // $ANTLR start "rule__Document__NameAssignment_2"
    // InternalSimpleDSL.g:1778:1: rule__Document__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Document__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1782:1: ( ( RULE_ID ) )
            // InternalSimpleDSL.g:1783:2: ( RULE_ID )
            {
            // InternalSimpleDSL.g:1783:2: ( RULE_ID )
            // InternalSimpleDSL.g:1784:3: RULE_ID
            {
             before(grammarAccess.getDocumentAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDocumentAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__NameAssignment_2"


    // $ANTLR start "rule__Document__EntitesAssignment_3"
    // InternalSimpleDSL.g:1793:1: rule__Document__EntitesAssignment_3 : ( ruleEntity ) ;
    public final void rule__Document__EntitesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1797:1: ( ( ruleEntity ) )
            // InternalSimpleDSL.g:1798:2: ( ruleEntity )
            {
            // InternalSimpleDSL.g:1798:2: ( ruleEntity )
            // InternalSimpleDSL.g:1799:3: ruleEntity
            {
             before(grammarAccess.getDocumentAccess().getEntitesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getEntitesEntityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__EntitesAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // InternalSimpleDSL.g:1808:1: rule__Entity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1812:1: ( ( ruleEString ) )
            // InternalSimpleDSL.g:1813:2: ( ruleEString )
            {
            // InternalSimpleDSL.g:1813:2: ( ruleEString )
            // InternalSimpleDSL.g:1814:3: ruleEString
            {
             before(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__FieldsAssignment_4_2"
    // InternalSimpleDSL.g:1823:1: rule__Entity__FieldsAssignment_4_2 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1827:1: ( ( ruleField ) )
            // InternalSimpleDSL.g:1828:2: ( ruleField )
            {
            // InternalSimpleDSL.g:1828:2: ( ruleField )
            // InternalSimpleDSL.g:1829:3: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FieldsAssignment_4_2"


    // $ANTLR start "rule__Entity__FieldsAssignment_4_3_1"
    // InternalSimpleDSL.g:1838:1: rule__Entity__FieldsAssignment_4_3_1 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1842:1: ( ( ruleField ) )
            // InternalSimpleDSL.g:1843:2: ( ruleField )
            {
            // InternalSimpleDSL.g:1843:2: ( ruleField )
            // InternalSimpleDSL.g:1844:3: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FieldsAssignment_4_3_1"


    // $ANTLR start "rule__Entity__RelationshipsAssignment_5_2"
    // InternalSimpleDSL.g:1853:1: rule__Entity__RelationshipsAssignment_5_2 : ( ruleRelationship ) ;
    public final void rule__Entity__RelationshipsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1857:1: ( ( ruleRelationship ) )
            // InternalSimpleDSL.g:1858:2: ( ruleRelationship )
            {
            // InternalSimpleDSL.g:1858:2: ( ruleRelationship )
            // InternalSimpleDSL.g:1859:3: ruleRelationship
            {
             before(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__RelationshipsAssignment_5_2"


    // $ANTLR start "rule__Entity__RelationshipsAssignment_5_3_1"
    // InternalSimpleDSL.g:1868:1: rule__Entity__RelationshipsAssignment_5_3_1 : ( ruleRelationship ) ;
    public final void rule__Entity__RelationshipsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1872:1: ( ( ruleRelationship ) )
            // InternalSimpleDSL.g:1873:2: ( ruleRelationship )
            {
            // InternalSimpleDSL.g:1873:2: ( ruleRelationship )
            // InternalSimpleDSL.g:1874:3: ruleRelationship
            {
             before(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__RelationshipsAssignment_5_3_1"


    // $ANTLR start "rule__Field__NameAssignment_2"
    // InternalSimpleDSL.g:1883:1: rule__Field__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Field__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1887:1: ( ( ruleEString ) )
            // InternalSimpleDSL.g:1888:2: ( ruleEString )
            {
            // InternalSimpleDSL.g:1888:2: ( ruleEString )
            // InternalSimpleDSL.g:1889:3: ruleEString
            {
             before(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_2"


    // $ANTLR start "rule__Field__TypeAssignment_4_1"
    // InternalSimpleDSL.g:1898:1: rule__Field__TypeAssignment_4_1 : ( ruleDataType ) ;
    public final void rule__Field__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1902:1: ( ( ruleDataType ) )
            // InternalSimpleDSL.g:1903:2: ( ruleDataType )
            {
            // InternalSimpleDSL.g:1903:2: ( ruleDataType )
            // InternalSimpleDSL.g:1904:3: ruleDataType
            {
             before(grammarAccess.getFieldAccess().getTypeDataTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeDataTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_4_1"


    // $ANTLR start "rule__Field__LengthAssignment_5_1"
    // InternalSimpleDSL.g:1913:1: rule__Field__LengthAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__Field__LengthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1917:1: ( ( RULE_INT ) )
            // InternalSimpleDSL.g:1918:2: ( RULE_INT )
            {
            // InternalSimpleDSL.g:1918:2: ( RULE_INT )
            // InternalSimpleDSL.g:1919:3: RULE_INT
            {
             before(grammarAccess.getFieldAccess().getLengthINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getLengthINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__LengthAssignment_5_1"


    // $ANTLR start "rule__Field__PreciscionAssignment_6_1"
    // InternalSimpleDSL.g:1928:1: rule__Field__PreciscionAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Field__PreciscionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1932:1: ( ( RULE_INT ) )
            // InternalSimpleDSL.g:1933:2: ( RULE_INT )
            {
            // InternalSimpleDSL.g:1933:2: ( RULE_INT )
            // InternalSimpleDSL.g:1934:3: RULE_INT
            {
             before(grammarAccess.getFieldAccess().getPreciscionINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getPreciscionINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__PreciscionAssignment_6_1"


    // $ANTLR start "rule__Field__ScaleAssignment_7_1"
    // InternalSimpleDSL.g:1943:1: rule__Field__ScaleAssignment_7_1 : ( RULE_INT ) ;
    public final void rule__Field__ScaleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1947:1: ( ( RULE_INT ) )
            // InternalSimpleDSL.g:1948:2: ( RULE_INT )
            {
            // InternalSimpleDSL.g:1948:2: ( RULE_INT )
            // InternalSimpleDSL.g:1949:3: RULE_INT
            {
             before(grammarAccess.getFieldAccess().getScaleINTTerminalRuleCall_7_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getScaleINTTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__ScaleAssignment_7_1"


    // $ANTLR start "rule__Field__KeyAssignment_8_1"
    // InternalSimpleDSL.g:1958:1: rule__Field__KeyAssignment_8_1 : ( RULE_KEY ) ;
    public final void rule__Field__KeyAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1962:1: ( ( RULE_KEY ) )
            // InternalSimpleDSL.g:1963:2: ( RULE_KEY )
            {
            // InternalSimpleDSL.g:1963:2: ( RULE_KEY )
            // InternalSimpleDSL.g:1964:3: RULE_KEY
            {
             before(grammarAccess.getFieldAccess().getKeyKeyTerminalRuleCall_8_1_0()); 
            match(input,RULE_KEY,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getKeyKeyTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__KeyAssignment_8_1"


    // $ANTLR start "rule__Relationship__NameAssignment_2"
    // InternalSimpleDSL.g:1973:1: rule__Relationship__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Relationship__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1977:1: ( ( ruleEString ) )
            // InternalSimpleDSL.g:1978:2: ( ruleEString )
            {
            // InternalSimpleDSL.g:1978:2: ( ruleEString )
            // InternalSimpleDSL.g:1979:3: ruleEString
            {
             before(grammarAccess.getRelationshipAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__NameAssignment_2"


    // $ANTLR start "rule__Relationship__ToEntityAssignment_5"
    // InternalSimpleDSL.g:1988:1: rule__Relationship__ToEntityAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relationship__ToEntityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1992:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSimpleDSL.g:1993:2: ( ( ruleQualifiedName ) )
            {
            // InternalSimpleDSL.g:1993:2: ( ( ruleQualifiedName ) )
            // InternalSimpleDSL.g:1994:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRelationshipAccess().getToEntityEntityCrossReference_5_0()); 
            // InternalSimpleDSL.g:1995:3: ( ruleQualifiedName )
            // InternalSimpleDSL.g:1996:4: ruleQualifiedName
            {
             before(grammarAccess.getRelationshipAccess().getToEntityEntityQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getToEntityEntityQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRelationshipAccess().getToEntityEntityCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__ToEntityAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000580000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001F080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L});

}