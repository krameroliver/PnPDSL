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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_KEY", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'STRING'", "'NUMBER'", "'DATE'", "'package'", "'.'", "'Entity'", "'{'", "'}'", "'fields'", "','", "'relationships'", "'includes'", "'Field'", "'Type'", "'Length'", "'Precision'", "'Scale'", "'Key'", "'Relationship'", "'to'", "'INCLUDE'"
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
    public static final int T__31=31;
    public static final int T__32=32;
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


    // $ANTLR start "entryRuleIncludes"
    // InternalSimpleDSL.g:203:1: entryRuleIncludes : ruleIncludes EOF ;
    public final void entryRuleIncludes() throws RecognitionException {
        try {
            // InternalSimpleDSL.g:204:1: ( ruleIncludes EOF )
            // InternalSimpleDSL.g:205:1: ruleIncludes EOF
            {
             before(grammarAccess.getIncludesRule()); 
            pushFollow(FOLLOW_1);
            ruleIncludes();

            state._fsp--;

             after(grammarAccess.getIncludesRule()); 
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
    // $ANTLR end "entryRuleIncludes"


    // $ANTLR start "ruleIncludes"
    // InternalSimpleDSL.g:212:1: ruleIncludes : ( ( rule__Includes__Group__0 ) ) ;
    public final void ruleIncludes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:216:2: ( ( ( rule__Includes__Group__0 ) ) )
            // InternalSimpleDSL.g:217:2: ( ( rule__Includes__Group__0 ) )
            {
            // InternalSimpleDSL.g:217:2: ( ( rule__Includes__Group__0 ) )
            // InternalSimpleDSL.g:218:3: ( rule__Includes__Group__0 )
            {
             before(grammarAccess.getIncludesAccess().getGroup()); 
            // InternalSimpleDSL.g:219:3: ( rule__Includes__Group__0 )
            // InternalSimpleDSL.g:219:4: rule__Includes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Includes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIncludes"


    // $ANTLR start "ruleDataType"
    // InternalSimpleDSL.g:228:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:232:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSimpleDSL.g:233:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSimpleDSL.g:233:2: ( ( rule__DataType__Alternatives ) )
            // InternalSimpleDSL.g:234:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSimpleDSL.g:235:3: ( rule__DataType__Alternatives )
            // InternalSimpleDSL.g:235:4: rule__DataType__Alternatives
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
    // InternalSimpleDSL.g:243:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:247:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSimpleDSL.g:248:2: ( RULE_STRING )
                    {
                    // InternalSimpleDSL.g:248:2: ( RULE_STRING )
                    // InternalSimpleDSL.g:249:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleDSL.g:254:2: ( RULE_ID )
                    {
                    // InternalSimpleDSL.g:254:2: ( RULE_ID )
                    // InternalSimpleDSL.g:255:3: RULE_ID
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
    // InternalSimpleDSL.g:264:1: rule__DataType__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'NUMBER' ) ) | ( ( 'DATE' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:268:1: ( ( ( 'STRING' ) ) | ( ( 'NUMBER' ) ) | ( ( 'DATE' ) ) )
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
                    // InternalSimpleDSL.g:269:2: ( ( 'STRING' ) )
                    {
                    // InternalSimpleDSL.g:269:2: ( ( 'STRING' ) )
                    // InternalSimpleDSL.g:270:3: ( 'STRING' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalSimpleDSL.g:271:3: ( 'STRING' )
                    // InternalSimpleDSL.g:271:4: 'STRING'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleDSL.g:275:2: ( ( 'NUMBER' ) )
                    {
                    // InternalSimpleDSL.g:275:2: ( ( 'NUMBER' ) )
                    // InternalSimpleDSL.g:276:3: ( 'NUMBER' )
                    {
                     before(grammarAccess.getDataTypeAccess().getNUMBEREnumLiteralDeclaration_1()); 
                    // InternalSimpleDSL.g:277:3: ( 'NUMBER' )
                    // InternalSimpleDSL.g:277:4: 'NUMBER'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getNUMBEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleDSL.g:281:2: ( ( 'DATE' ) )
                    {
                    // InternalSimpleDSL.g:281:2: ( ( 'DATE' ) )
                    // InternalSimpleDSL.g:282:3: ( 'DATE' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_2()); 
                    // InternalSimpleDSL.g:283:3: ( 'DATE' )
                    // InternalSimpleDSL.g:283:4: 'DATE'
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
    // InternalSimpleDSL.g:291:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:295:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // InternalSimpleDSL.g:296:2: rule__Document__Group__0__Impl rule__Document__Group__1
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
    // InternalSimpleDSL.g:303:1: rule__Document__Group__0__Impl : ( () ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:307:1: ( ( () ) )
            // InternalSimpleDSL.g:308:1: ( () )
            {
            // InternalSimpleDSL.g:308:1: ( () )
            // InternalSimpleDSL.g:309:2: ()
            {
             before(grammarAccess.getDocumentAccess().getDocumentAction_0()); 
            // InternalSimpleDSL.g:310:2: ()
            // InternalSimpleDSL.g:310:3: 
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
    // InternalSimpleDSL.g:318:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:322:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // InternalSimpleDSL.g:323:2: rule__Document__Group__1__Impl rule__Document__Group__2
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
    // InternalSimpleDSL.g:330:1: rule__Document__Group__1__Impl : ( 'package' ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:334:1: ( ( 'package' ) )
            // InternalSimpleDSL.g:335:1: ( 'package' )
            {
            // InternalSimpleDSL.g:335:1: ( 'package' )
            // InternalSimpleDSL.g:336:2: 'package'
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
    // InternalSimpleDSL.g:345:1: rule__Document__Group__2 : rule__Document__Group__2__Impl rule__Document__Group__3 ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:349:1: ( rule__Document__Group__2__Impl rule__Document__Group__3 )
            // InternalSimpleDSL.g:350:2: rule__Document__Group__2__Impl rule__Document__Group__3
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
    // InternalSimpleDSL.g:357:1: rule__Document__Group__2__Impl : ( ( rule__Document__NameAssignment_2 ) ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:361:1: ( ( ( rule__Document__NameAssignment_2 ) ) )
            // InternalSimpleDSL.g:362:1: ( ( rule__Document__NameAssignment_2 ) )
            {
            // InternalSimpleDSL.g:362:1: ( ( rule__Document__NameAssignment_2 ) )
            // InternalSimpleDSL.g:363:2: ( rule__Document__NameAssignment_2 )
            {
             before(grammarAccess.getDocumentAccess().getNameAssignment_2()); 
            // InternalSimpleDSL.g:364:2: ( rule__Document__NameAssignment_2 )
            // InternalSimpleDSL.g:364:3: rule__Document__NameAssignment_2
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
    // InternalSimpleDSL.g:372:1: rule__Document__Group__3 : rule__Document__Group__3__Impl ;
    public final void rule__Document__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:376:1: ( rule__Document__Group__3__Impl )
            // InternalSimpleDSL.g:377:2: rule__Document__Group__3__Impl
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
    // InternalSimpleDSL.g:383:1: rule__Document__Group__3__Impl : ( ( rule__Document__EntitesAssignment_3 )* ) ;
    public final void rule__Document__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:387:1: ( ( ( rule__Document__EntitesAssignment_3 )* ) )
            // InternalSimpleDSL.g:388:1: ( ( rule__Document__EntitesAssignment_3 )* )
            {
            // InternalSimpleDSL.g:388:1: ( ( rule__Document__EntitesAssignment_3 )* )
            // InternalSimpleDSL.g:389:2: ( rule__Document__EntitesAssignment_3 )*
            {
             before(grammarAccess.getDocumentAccess().getEntitesAssignment_3()); 
            // InternalSimpleDSL.g:390:2: ( rule__Document__EntitesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimpleDSL.g:390:3: rule__Document__EntitesAssignment_3
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
    // InternalSimpleDSL.g:399:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:403:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSimpleDSL.g:404:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalSimpleDSL.g:411:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__Group_0__0 )* ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:415:1: ( ( ( rule__QualifiedName__Group_0__0 )* ) )
            // InternalSimpleDSL.g:416:1: ( ( rule__QualifiedName__Group_0__0 )* )
            {
            // InternalSimpleDSL.g:416:1: ( ( rule__QualifiedName__Group_0__0 )* )
            // InternalSimpleDSL.g:417:2: ( rule__QualifiedName__Group_0__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_0()); 
            // InternalSimpleDSL.g:418:2: ( rule__QualifiedName__Group_0__0 )*
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
            	    // InternalSimpleDSL.g:418:3: rule__QualifiedName__Group_0__0
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
    // InternalSimpleDSL.g:426:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:430:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSimpleDSL.g:431:2: rule__QualifiedName__Group__1__Impl
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
    // InternalSimpleDSL.g:437:1: rule__QualifiedName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:441:1: ( ( RULE_ID ) )
            // InternalSimpleDSL.g:442:1: ( RULE_ID )
            {
            // InternalSimpleDSL.g:442:1: ( RULE_ID )
            // InternalSimpleDSL.g:443:2: RULE_ID
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
    // InternalSimpleDSL.g:453:1: rule__QualifiedName__Group_0__0 : rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 ;
    public final void rule__QualifiedName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:457:1: ( rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1 )
            // InternalSimpleDSL.g:458:2: rule__QualifiedName__Group_0__0__Impl rule__QualifiedName__Group_0__1
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
    // InternalSimpleDSL.g:465:1: rule__QualifiedName__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:469:1: ( ( RULE_ID ) )
            // InternalSimpleDSL.g:470:1: ( RULE_ID )
            {
            // InternalSimpleDSL.g:470:1: ( RULE_ID )
            // InternalSimpleDSL.g:471:2: RULE_ID
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
    // InternalSimpleDSL.g:480:1: rule__QualifiedName__Group_0__1 : rule__QualifiedName__Group_0__1__Impl ;
    public final void rule__QualifiedName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:484:1: ( rule__QualifiedName__Group_0__1__Impl )
            // InternalSimpleDSL.g:485:2: rule__QualifiedName__Group_0__1__Impl
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
    // InternalSimpleDSL.g:491:1: rule__QualifiedName__Group_0__1__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:495:1: ( ( '.' ) )
            // InternalSimpleDSL.g:496:1: ( '.' )
            {
            // InternalSimpleDSL.g:496:1: ( '.' )
            // InternalSimpleDSL.g:497:2: '.'
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
    // InternalSimpleDSL.g:507:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:511:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalSimpleDSL.g:512:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalSimpleDSL.g:519:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:523:1: ( ( () ) )
            // InternalSimpleDSL.g:524:1: ( () )
            {
            // InternalSimpleDSL.g:524:1: ( () )
            // InternalSimpleDSL.g:525:2: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // InternalSimpleDSL.g:526:2: ()
            // InternalSimpleDSL.g:526:3: 
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
    // InternalSimpleDSL.g:534:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:538:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalSimpleDSL.g:539:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalSimpleDSL.g:546:1: rule__Entity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:550:1: ( ( 'Entity' ) )
            // InternalSimpleDSL.g:551:1: ( 'Entity' )
            {
            // InternalSimpleDSL.g:551:1: ( 'Entity' )
            // InternalSimpleDSL.g:552:2: 'Entity'
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
    // InternalSimpleDSL.g:561:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:565:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalSimpleDSL.g:566:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalSimpleDSL.g:573:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:577:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalSimpleDSL.g:578:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalSimpleDSL.g:578:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalSimpleDSL.g:579:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalSimpleDSL.g:580:2: ( rule__Entity__NameAssignment_2 )
            // InternalSimpleDSL.g:580:3: rule__Entity__NameAssignment_2
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
    // InternalSimpleDSL.g:588:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:592:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalSimpleDSL.g:593:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalSimpleDSL.g:600:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:604:1: ( ( '{' ) )
            // InternalSimpleDSL.g:605:1: ( '{' )
            {
            // InternalSimpleDSL.g:605:1: ( '{' )
            // InternalSimpleDSL.g:606:2: '{'
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
    // InternalSimpleDSL.g:615:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:619:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalSimpleDSL.g:620:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
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
    // InternalSimpleDSL.g:627:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:631:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // InternalSimpleDSL.g:632:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // InternalSimpleDSL.g:632:1: ( ( rule__Entity__Group_4__0 )? )
            // InternalSimpleDSL.g:633:2: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // InternalSimpleDSL.g:634:2: ( rule__Entity__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimpleDSL.g:634:3: rule__Entity__Group_4__0
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
    // InternalSimpleDSL.g:642:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:646:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalSimpleDSL.g:647:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
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
    // InternalSimpleDSL.g:654:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__Group_5__0 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:658:1: ( ( ( rule__Entity__Group_5__0 )? ) )
            // InternalSimpleDSL.g:659:1: ( ( rule__Entity__Group_5__0 )? )
            {
            // InternalSimpleDSL.g:659:1: ( ( rule__Entity__Group_5__0 )? )
            // InternalSimpleDSL.g:660:2: ( rule__Entity__Group_5__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_5()); 
            // InternalSimpleDSL.g:661:2: ( rule__Entity__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimpleDSL.g:661:3: rule__Entity__Group_5__0
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
    // InternalSimpleDSL.g:669:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:673:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // InternalSimpleDSL.g:674:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__7();

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
    // InternalSimpleDSL.g:681:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__Group_6__0 )? ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:685:1: ( ( ( rule__Entity__Group_6__0 )? ) )
            // InternalSimpleDSL.g:686:1: ( ( rule__Entity__Group_6__0 )? )
            {
            // InternalSimpleDSL.g:686:1: ( ( rule__Entity__Group_6__0 )? )
            // InternalSimpleDSL.g:687:2: ( rule__Entity__Group_6__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_6()); 
            // InternalSimpleDSL.g:688:2: ( rule__Entity__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSimpleDSL.g:688:3: rule__Entity__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Entity__Group__7"
    // InternalSimpleDSL.g:696:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:700:1: ( rule__Entity__Group__7__Impl )
            // InternalSimpleDSL.g:701:2: rule__Entity__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__7__Impl();

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
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // InternalSimpleDSL.g:707:1: rule__Entity__Group__7__Impl : ( '}' ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:711:1: ( ( '}' ) )
            // InternalSimpleDSL.g:712:1: ( '}' )
            {
            // InternalSimpleDSL.g:712:1: ( '}' )
            // InternalSimpleDSL.g:713:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group_4__0"
    // InternalSimpleDSL.g:723:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:727:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // InternalSimpleDSL.g:728:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
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
    // InternalSimpleDSL.g:735:1: rule__Entity__Group_4__0__Impl : ( 'fields' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:739:1: ( ( 'fields' ) )
            // InternalSimpleDSL.g:740:1: ( 'fields' )
            {
            // InternalSimpleDSL.g:740:1: ( 'fields' )
            // InternalSimpleDSL.g:741:2: 'fields'
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
    // InternalSimpleDSL.g:750:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:754:1: ( rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 )
            // InternalSimpleDSL.g:755:2: rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2
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
    // InternalSimpleDSL.g:762:1: rule__Entity__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:766:1: ( ( '{' ) )
            // InternalSimpleDSL.g:767:1: ( '{' )
            {
            // InternalSimpleDSL.g:767:1: ( '{' )
            // InternalSimpleDSL.g:768:2: '{'
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
    // InternalSimpleDSL.g:777:1: rule__Entity__Group_4__2 : rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 ;
    public final void rule__Entity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:781:1: ( rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 )
            // InternalSimpleDSL.g:782:2: rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3
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
    // InternalSimpleDSL.g:789:1: rule__Entity__Group_4__2__Impl : ( ( rule__Entity__FieldsAssignment_4_2 ) ) ;
    public final void rule__Entity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:793:1: ( ( ( rule__Entity__FieldsAssignment_4_2 ) ) )
            // InternalSimpleDSL.g:794:1: ( ( rule__Entity__FieldsAssignment_4_2 ) )
            {
            // InternalSimpleDSL.g:794:1: ( ( rule__Entity__FieldsAssignment_4_2 ) )
            // InternalSimpleDSL.g:795:2: ( rule__Entity__FieldsAssignment_4_2 )
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4_2()); 
            // InternalSimpleDSL.g:796:2: ( rule__Entity__FieldsAssignment_4_2 )
            // InternalSimpleDSL.g:796:3: rule__Entity__FieldsAssignment_4_2
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
    // InternalSimpleDSL.g:804:1: rule__Entity__Group_4__3 : rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 ;
    public final void rule__Entity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:808:1: ( rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 )
            // InternalSimpleDSL.g:809:2: rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4
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
    // InternalSimpleDSL.g:816:1: rule__Entity__Group_4__3__Impl : ( ( rule__Entity__Group_4_3__0 )* ) ;
    public final void rule__Entity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:820:1: ( ( ( rule__Entity__Group_4_3__0 )* ) )
            // InternalSimpleDSL.g:821:1: ( ( rule__Entity__Group_4_3__0 )* )
            {
            // InternalSimpleDSL.g:821:1: ( ( rule__Entity__Group_4_3__0 )* )
            // InternalSimpleDSL.g:822:2: ( rule__Entity__Group_4_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_4_3()); 
            // InternalSimpleDSL.g:823:2: ( rule__Entity__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpleDSL.g:823:3: rule__Entity__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Entity__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalSimpleDSL.g:831:1: rule__Entity__Group_4__4 : rule__Entity__Group_4__4__Impl ;
    public final void rule__Entity__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:835:1: ( rule__Entity__Group_4__4__Impl )
            // InternalSimpleDSL.g:836:2: rule__Entity__Group_4__4__Impl
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
    // InternalSimpleDSL.g:842:1: rule__Entity__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:846:1: ( ( '}' ) )
            // InternalSimpleDSL.g:847:1: ( '}' )
            {
            // InternalSimpleDSL.g:847:1: ( '}' )
            // InternalSimpleDSL.g:848:2: '}'
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
    // InternalSimpleDSL.g:858:1: rule__Entity__Group_4_3__0 : rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1 ;
    public final void rule__Entity__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:862:1: ( rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1 )
            // InternalSimpleDSL.g:863:2: rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1
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
    // InternalSimpleDSL.g:870:1: rule__Entity__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:874:1: ( ( ',' ) )
            // InternalSimpleDSL.g:875:1: ( ',' )
            {
            // InternalSimpleDSL.g:875:1: ( ',' )
            // InternalSimpleDSL.g:876:2: ','
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
    // InternalSimpleDSL.g:885:1: rule__Entity__Group_4_3__1 : rule__Entity__Group_4_3__1__Impl ;
    public final void rule__Entity__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:889:1: ( rule__Entity__Group_4_3__1__Impl )
            // InternalSimpleDSL.g:890:2: rule__Entity__Group_4_3__1__Impl
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
    // InternalSimpleDSL.g:896:1: rule__Entity__Group_4_3__1__Impl : ( ( rule__Entity__FieldsAssignment_4_3_1 ) ) ;
    public final void rule__Entity__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:900:1: ( ( ( rule__Entity__FieldsAssignment_4_3_1 ) ) )
            // InternalSimpleDSL.g:901:1: ( ( rule__Entity__FieldsAssignment_4_3_1 ) )
            {
            // InternalSimpleDSL.g:901:1: ( ( rule__Entity__FieldsAssignment_4_3_1 ) )
            // InternalSimpleDSL.g:902:2: ( rule__Entity__FieldsAssignment_4_3_1 )
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4_3_1()); 
            // InternalSimpleDSL.g:903:2: ( rule__Entity__FieldsAssignment_4_3_1 )
            // InternalSimpleDSL.g:903:3: rule__Entity__FieldsAssignment_4_3_1
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
    // InternalSimpleDSL.g:912:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:916:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // InternalSimpleDSL.g:917:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
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
    // InternalSimpleDSL.g:924:1: rule__Entity__Group_5__0__Impl : ( 'relationships' ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:928:1: ( ( 'relationships' ) )
            // InternalSimpleDSL.g:929:1: ( 'relationships' )
            {
            // InternalSimpleDSL.g:929:1: ( 'relationships' )
            // InternalSimpleDSL.g:930:2: 'relationships'
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
    // InternalSimpleDSL.g:939:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl rule__Entity__Group_5__2 ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:943:1: ( rule__Entity__Group_5__1__Impl rule__Entity__Group_5__2 )
            // InternalSimpleDSL.g:944:2: rule__Entity__Group_5__1__Impl rule__Entity__Group_5__2
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
    // InternalSimpleDSL.g:951:1: rule__Entity__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:955:1: ( ( '{' ) )
            // InternalSimpleDSL.g:956:1: ( '{' )
            {
            // InternalSimpleDSL.g:956:1: ( '{' )
            // InternalSimpleDSL.g:957:2: '{'
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
    // InternalSimpleDSL.g:966:1: rule__Entity__Group_5__2 : rule__Entity__Group_5__2__Impl rule__Entity__Group_5__3 ;
    public final void rule__Entity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:970:1: ( rule__Entity__Group_5__2__Impl rule__Entity__Group_5__3 )
            // InternalSimpleDSL.g:971:2: rule__Entity__Group_5__2__Impl rule__Entity__Group_5__3
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
    // InternalSimpleDSL.g:978:1: rule__Entity__Group_5__2__Impl : ( ( rule__Entity__RelationshipsAssignment_5_2 ) ) ;
    public final void rule__Entity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:982:1: ( ( ( rule__Entity__RelationshipsAssignment_5_2 ) ) )
            // InternalSimpleDSL.g:983:1: ( ( rule__Entity__RelationshipsAssignment_5_2 ) )
            {
            // InternalSimpleDSL.g:983:1: ( ( rule__Entity__RelationshipsAssignment_5_2 ) )
            // InternalSimpleDSL.g:984:2: ( rule__Entity__RelationshipsAssignment_5_2 )
            {
             before(grammarAccess.getEntityAccess().getRelationshipsAssignment_5_2()); 
            // InternalSimpleDSL.g:985:2: ( rule__Entity__RelationshipsAssignment_5_2 )
            // InternalSimpleDSL.g:985:3: rule__Entity__RelationshipsAssignment_5_2
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
    // InternalSimpleDSL.g:993:1: rule__Entity__Group_5__3 : rule__Entity__Group_5__3__Impl rule__Entity__Group_5__4 ;
    public final void rule__Entity__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:997:1: ( rule__Entity__Group_5__3__Impl rule__Entity__Group_5__4 )
            // InternalSimpleDSL.g:998:2: rule__Entity__Group_5__3__Impl rule__Entity__Group_5__4
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
    // InternalSimpleDSL.g:1005:1: rule__Entity__Group_5__3__Impl : ( ( rule__Entity__Group_5_3__0 )* ) ;
    public final void rule__Entity__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1009:1: ( ( ( rule__Entity__Group_5_3__0 )* ) )
            // InternalSimpleDSL.g:1010:1: ( ( rule__Entity__Group_5_3__0 )* )
            {
            // InternalSimpleDSL.g:1010:1: ( ( rule__Entity__Group_5_3__0 )* )
            // InternalSimpleDSL.g:1011:2: ( rule__Entity__Group_5_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_5_3()); 
            // InternalSimpleDSL.g:1012:2: ( rule__Entity__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSimpleDSL.g:1012:3: rule__Entity__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Entity__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSimpleDSL.g:1020:1: rule__Entity__Group_5__4 : rule__Entity__Group_5__4__Impl ;
    public final void rule__Entity__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1024:1: ( rule__Entity__Group_5__4__Impl )
            // InternalSimpleDSL.g:1025:2: rule__Entity__Group_5__4__Impl
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
    // InternalSimpleDSL.g:1031:1: rule__Entity__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1035:1: ( ( '}' ) )
            // InternalSimpleDSL.g:1036:1: ( '}' )
            {
            // InternalSimpleDSL.g:1036:1: ( '}' )
            // InternalSimpleDSL.g:1037:2: '}'
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
    // InternalSimpleDSL.g:1047:1: rule__Entity__Group_5_3__0 : rule__Entity__Group_5_3__0__Impl rule__Entity__Group_5_3__1 ;
    public final void rule__Entity__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1051:1: ( rule__Entity__Group_5_3__0__Impl rule__Entity__Group_5_3__1 )
            // InternalSimpleDSL.g:1052:2: rule__Entity__Group_5_3__0__Impl rule__Entity__Group_5_3__1
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
    // InternalSimpleDSL.g:1059:1: rule__Entity__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1063:1: ( ( ',' ) )
            // InternalSimpleDSL.g:1064:1: ( ',' )
            {
            // InternalSimpleDSL.g:1064:1: ( ',' )
            // InternalSimpleDSL.g:1065:2: ','
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
    // InternalSimpleDSL.g:1074:1: rule__Entity__Group_5_3__1 : rule__Entity__Group_5_3__1__Impl ;
    public final void rule__Entity__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1078:1: ( rule__Entity__Group_5_3__1__Impl )
            // InternalSimpleDSL.g:1079:2: rule__Entity__Group_5_3__1__Impl
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
    // InternalSimpleDSL.g:1085:1: rule__Entity__Group_5_3__1__Impl : ( ( rule__Entity__RelationshipsAssignment_5_3_1 ) ) ;
    public final void rule__Entity__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1089:1: ( ( ( rule__Entity__RelationshipsAssignment_5_3_1 ) ) )
            // InternalSimpleDSL.g:1090:1: ( ( rule__Entity__RelationshipsAssignment_5_3_1 ) )
            {
            // InternalSimpleDSL.g:1090:1: ( ( rule__Entity__RelationshipsAssignment_5_3_1 ) )
            // InternalSimpleDSL.g:1091:2: ( rule__Entity__RelationshipsAssignment_5_3_1 )
            {
             before(grammarAccess.getEntityAccess().getRelationshipsAssignment_5_3_1()); 
            // InternalSimpleDSL.g:1092:2: ( rule__Entity__RelationshipsAssignment_5_3_1 )
            // InternalSimpleDSL.g:1092:3: rule__Entity__RelationshipsAssignment_5_3_1
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


    // $ANTLR start "rule__Entity__Group_6__0"
    // InternalSimpleDSL.g:1101:1: rule__Entity__Group_6__0 : rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 ;
    public final void rule__Entity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1105:1: ( rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 )
            // InternalSimpleDSL.g:1106:2: rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__1();

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
    // $ANTLR end "rule__Entity__Group_6__0"


    // $ANTLR start "rule__Entity__Group_6__0__Impl"
    // InternalSimpleDSL.g:1113:1: rule__Entity__Group_6__0__Impl : ( 'includes' ) ;
    public final void rule__Entity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1117:1: ( ( 'includes' ) )
            // InternalSimpleDSL.g:1118:1: ( 'includes' )
            {
            // InternalSimpleDSL.g:1118:1: ( 'includes' )
            // InternalSimpleDSL.g:1119:2: 'includes'
            {
             before(grammarAccess.getEntityAccess().getIncludesKeyword_6_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getIncludesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__0__Impl"


    // $ANTLR start "rule__Entity__Group_6__1"
    // InternalSimpleDSL.g:1128:1: rule__Entity__Group_6__1 : rule__Entity__Group_6__1__Impl rule__Entity__Group_6__2 ;
    public final void rule__Entity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1132:1: ( rule__Entity__Group_6__1__Impl rule__Entity__Group_6__2 )
            // InternalSimpleDSL.g:1133:2: rule__Entity__Group_6__1__Impl rule__Entity__Group_6__2
            {
            pushFollow(FOLLOW_16);
            rule__Entity__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__2();

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
    // $ANTLR end "rule__Entity__Group_6__1"


    // $ANTLR start "rule__Entity__Group_6__1__Impl"
    // InternalSimpleDSL.g:1140:1: rule__Entity__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1144:1: ( ( '{' ) )
            // InternalSimpleDSL.g:1145:1: ( '{' )
            {
            // InternalSimpleDSL.g:1145:1: ( '{' )
            // InternalSimpleDSL.g:1146:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__1__Impl"


    // $ANTLR start "rule__Entity__Group_6__2"
    // InternalSimpleDSL.g:1155:1: rule__Entity__Group_6__2 : rule__Entity__Group_6__2__Impl rule__Entity__Group_6__3 ;
    public final void rule__Entity__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1159:1: ( rule__Entity__Group_6__2__Impl rule__Entity__Group_6__3 )
            // InternalSimpleDSL.g:1160:2: rule__Entity__Group_6__2__Impl rule__Entity__Group_6__3
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__3();

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
    // $ANTLR end "rule__Entity__Group_6__2"


    // $ANTLR start "rule__Entity__Group_6__2__Impl"
    // InternalSimpleDSL.g:1167:1: rule__Entity__Group_6__2__Impl : ( ( rule__Entity__IncludesAssignment_6_2 ) ) ;
    public final void rule__Entity__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1171:1: ( ( ( rule__Entity__IncludesAssignment_6_2 ) ) )
            // InternalSimpleDSL.g:1172:1: ( ( rule__Entity__IncludesAssignment_6_2 ) )
            {
            // InternalSimpleDSL.g:1172:1: ( ( rule__Entity__IncludesAssignment_6_2 ) )
            // InternalSimpleDSL.g:1173:2: ( rule__Entity__IncludesAssignment_6_2 )
            {
             before(grammarAccess.getEntityAccess().getIncludesAssignment_6_2()); 
            // InternalSimpleDSL.g:1174:2: ( rule__Entity__IncludesAssignment_6_2 )
            // InternalSimpleDSL.g:1174:3: rule__Entity__IncludesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__IncludesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getIncludesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__2__Impl"


    // $ANTLR start "rule__Entity__Group_6__3"
    // InternalSimpleDSL.g:1182:1: rule__Entity__Group_6__3 : rule__Entity__Group_6__3__Impl rule__Entity__Group_6__4 ;
    public final void rule__Entity__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1186:1: ( rule__Entity__Group_6__3__Impl rule__Entity__Group_6__4 )
            // InternalSimpleDSL.g:1187:2: rule__Entity__Group_6__3__Impl rule__Entity__Group_6__4
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__4();

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
    // $ANTLR end "rule__Entity__Group_6__3"


    // $ANTLR start "rule__Entity__Group_6__3__Impl"
    // InternalSimpleDSL.g:1194:1: rule__Entity__Group_6__3__Impl : ( ( rule__Entity__Group_6_3__0 )* ) ;
    public final void rule__Entity__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1198:1: ( ( ( rule__Entity__Group_6_3__0 )* ) )
            // InternalSimpleDSL.g:1199:1: ( ( rule__Entity__Group_6_3__0 )* )
            {
            // InternalSimpleDSL.g:1199:1: ( ( rule__Entity__Group_6_3__0 )* )
            // InternalSimpleDSL.g:1200:2: ( rule__Entity__Group_6_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_6_3()); 
            // InternalSimpleDSL.g:1201:2: ( rule__Entity__Group_6_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimpleDSL.g:1201:3: rule__Entity__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Entity__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__3__Impl"


    // $ANTLR start "rule__Entity__Group_6__4"
    // InternalSimpleDSL.g:1209:1: rule__Entity__Group_6__4 : rule__Entity__Group_6__4__Impl ;
    public final void rule__Entity__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1213:1: ( rule__Entity__Group_6__4__Impl )
            // InternalSimpleDSL.g:1214:2: rule__Entity__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__4__Impl();

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
    // $ANTLR end "rule__Entity__Group_6__4"


    // $ANTLR start "rule__Entity__Group_6__4__Impl"
    // InternalSimpleDSL.g:1220:1: rule__Entity__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1224:1: ( ( '}' ) )
            // InternalSimpleDSL.g:1225:1: ( '}' )
            {
            // InternalSimpleDSL.g:1225:1: ( '}' )
            // InternalSimpleDSL.g:1226:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__4__Impl"


    // $ANTLR start "rule__Entity__Group_6_3__0"
    // InternalSimpleDSL.g:1236:1: rule__Entity__Group_6_3__0 : rule__Entity__Group_6_3__0__Impl rule__Entity__Group_6_3__1 ;
    public final void rule__Entity__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1240:1: ( rule__Entity__Group_6_3__0__Impl rule__Entity__Group_6_3__1 )
            // InternalSimpleDSL.g:1241:2: rule__Entity__Group_6_3__0__Impl rule__Entity__Group_6_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Entity__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_6_3__1();

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
    // $ANTLR end "rule__Entity__Group_6_3__0"


    // $ANTLR start "rule__Entity__Group_6_3__0__Impl"
    // InternalSimpleDSL.g:1248:1: rule__Entity__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1252:1: ( ( ',' ) )
            // InternalSimpleDSL.g:1253:1: ( ',' )
            {
            // InternalSimpleDSL.g:1253:1: ( ',' )
            // InternalSimpleDSL.g:1254:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_6_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_6_3__1"
    // InternalSimpleDSL.g:1263:1: rule__Entity__Group_6_3__1 : rule__Entity__Group_6_3__1__Impl ;
    public final void rule__Entity__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1267:1: ( rule__Entity__Group_6_3__1__Impl )
            // InternalSimpleDSL.g:1268:2: rule__Entity__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_6_3__1"


    // $ANTLR start "rule__Entity__Group_6_3__1__Impl"
    // InternalSimpleDSL.g:1274:1: rule__Entity__Group_6_3__1__Impl : ( ( rule__Entity__IncludesAssignment_6_3_1 ) ) ;
    public final void rule__Entity__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1278:1: ( ( ( rule__Entity__IncludesAssignment_6_3_1 ) ) )
            // InternalSimpleDSL.g:1279:1: ( ( rule__Entity__IncludesAssignment_6_3_1 ) )
            {
            // InternalSimpleDSL.g:1279:1: ( ( rule__Entity__IncludesAssignment_6_3_1 ) )
            // InternalSimpleDSL.g:1280:2: ( rule__Entity__IncludesAssignment_6_3_1 )
            {
             before(grammarAccess.getEntityAccess().getIncludesAssignment_6_3_1()); 
            // InternalSimpleDSL.g:1281:2: ( rule__Entity__IncludesAssignment_6_3_1 )
            // InternalSimpleDSL.g:1281:3: rule__Entity__IncludesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__IncludesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getIncludesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6_3__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalSimpleDSL.g:1290:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1294:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalSimpleDSL.g:1295:2: rule__Field__Group__0__Impl rule__Field__Group__1
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
    // InternalSimpleDSL.g:1302:1: rule__Field__Group__0__Impl : ( () ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1306:1: ( ( () ) )
            // InternalSimpleDSL.g:1307:1: ( () )
            {
            // InternalSimpleDSL.g:1307:1: ( () )
            // InternalSimpleDSL.g:1308:2: ()
            {
             before(grammarAccess.getFieldAccess().getFieldAction_0()); 
            // InternalSimpleDSL.g:1309:2: ()
            // InternalSimpleDSL.g:1309:3: 
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
    // InternalSimpleDSL.g:1317:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1321:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalSimpleDSL.g:1322:2: rule__Field__Group__1__Impl rule__Field__Group__2
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
    // InternalSimpleDSL.g:1329:1: rule__Field__Group__1__Impl : ( 'Field' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1333:1: ( ( 'Field' ) )
            // InternalSimpleDSL.g:1334:1: ( 'Field' )
            {
            // InternalSimpleDSL.g:1334:1: ( 'Field' )
            // InternalSimpleDSL.g:1335:2: 'Field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSimpleDSL.g:1344:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1348:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalSimpleDSL.g:1349:2: rule__Field__Group__2__Impl rule__Field__Group__3
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
    // InternalSimpleDSL.g:1356:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1360:1: ( ( ( rule__Field__NameAssignment_2 ) ) )
            // InternalSimpleDSL.g:1361:1: ( ( rule__Field__NameAssignment_2 ) )
            {
            // InternalSimpleDSL.g:1361:1: ( ( rule__Field__NameAssignment_2 ) )
            // InternalSimpleDSL.g:1362:2: ( rule__Field__NameAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            // InternalSimpleDSL.g:1363:2: ( rule__Field__NameAssignment_2 )
            // InternalSimpleDSL.g:1363:3: rule__Field__NameAssignment_2
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
    // InternalSimpleDSL.g:1371:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1375:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalSimpleDSL.g:1376:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalSimpleDSL.g:1383:1: rule__Field__Group__3__Impl : ( '{' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1387:1: ( ( '{' ) )
            // InternalSimpleDSL.g:1388:1: ( '{' )
            {
            // InternalSimpleDSL.g:1388:1: ( '{' )
            // InternalSimpleDSL.g:1389:2: '{'
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
    // InternalSimpleDSL.g:1398:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1402:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // InternalSimpleDSL.g:1403:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalSimpleDSL.g:1410:1: rule__Field__Group__4__Impl : ( ( rule__Field__Group_4__0 )? ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1414:1: ( ( ( rule__Field__Group_4__0 )? ) )
            // InternalSimpleDSL.g:1415:1: ( ( rule__Field__Group_4__0 )? )
            {
            // InternalSimpleDSL.g:1415:1: ( ( rule__Field__Group_4__0 )? )
            // InternalSimpleDSL.g:1416:2: ( rule__Field__Group_4__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_4()); 
            // InternalSimpleDSL.g:1417:2: ( rule__Field__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSimpleDSL.g:1417:3: rule__Field__Group_4__0
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
    // InternalSimpleDSL.g:1425:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1429:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // InternalSimpleDSL.g:1430:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalSimpleDSL.g:1437:1: rule__Field__Group__5__Impl : ( ( rule__Field__Group_5__0 )? ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1441:1: ( ( ( rule__Field__Group_5__0 )? ) )
            // InternalSimpleDSL.g:1442:1: ( ( rule__Field__Group_5__0 )? )
            {
            // InternalSimpleDSL.g:1442:1: ( ( rule__Field__Group_5__0 )? )
            // InternalSimpleDSL.g:1443:2: ( rule__Field__Group_5__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_5()); 
            // InternalSimpleDSL.g:1444:2: ( rule__Field__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimpleDSL.g:1444:3: rule__Field__Group_5__0
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
    // InternalSimpleDSL.g:1452:1: rule__Field__Group__6 : rule__Field__Group__6__Impl rule__Field__Group__7 ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1456:1: ( rule__Field__Group__6__Impl rule__Field__Group__7 )
            // InternalSimpleDSL.g:1457:2: rule__Field__Group__6__Impl rule__Field__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalSimpleDSL.g:1464:1: rule__Field__Group__6__Impl : ( ( rule__Field__Group_6__0 )? ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1468:1: ( ( ( rule__Field__Group_6__0 )? ) )
            // InternalSimpleDSL.g:1469:1: ( ( rule__Field__Group_6__0 )? )
            {
            // InternalSimpleDSL.g:1469:1: ( ( rule__Field__Group_6__0 )? )
            // InternalSimpleDSL.g:1470:2: ( rule__Field__Group_6__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_6()); 
            // InternalSimpleDSL.g:1471:2: ( rule__Field__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSimpleDSL.g:1471:3: rule__Field__Group_6__0
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
    // InternalSimpleDSL.g:1479:1: rule__Field__Group__7 : rule__Field__Group__7__Impl rule__Field__Group__8 ;
    public final void rule__Field__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1483:1: ( rule__Field__Group__7__Impl rule__Field__Group__8 )
            // InternalSimpleDSL.g:1484:2: rule__Field__Group__7__Impl rule__Field__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalSimpleDSL.g:1491:1: rule__Field__Group__7__Impl : ( ( rule__Field__Group_7__0 )? ) ;
    public final void rule__Field__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1495:1: ( ( ( rule__Field__Group_7__0 )? ) )
            // InternalSimpleDSL.g:1496:1: ( ( rule__Field__Group_7__0 )? )
            {
            // InternalSimpleDSL.g:1496:1: ( ( rule__Field__Group_7__0 )? )
            // InternalSimpleDSL.g:1497:2: ( rule__Field__Group_7__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_7()); 
            // InternalSimpleDSL.g:1498:2: ( rule__Field__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSimpleDSL.g:1498:3: rule__Field__Group_7__0
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
    // InternalSimpleDSL.g:1506:1: rule__Field__Group__8 : rule__Field__Group__8__Impl rule__Field__Group__9 ;
    public final void rule__Field__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1510:1: ( rule__Field__Group__8__Impl rule__Field__Group__9 )
            // InternalSimpleDSL.g:1511:2: rule__Field__Group__8__Impl rule__Field__Group__9
            {
            pushFollow(FOLLOW_17);
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
    // InternalSimpleDSL.g:1518:1: rule__Field__Group__8__Impl : ( ( rule__Field__Group_8__0 )? ) ;
    public final void rule__Field__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1522:1: ( ( ( rule__Field__Group_8__0 )? ) )
            // InternalSimpleDSL.g:1523:1: ( ( rule__Field__Group_8__0 )? )
            {
            // InternalSimpleDSL.g:1523:1: ( ( rule__Field__Group_8__0 )? )
            // InternalSimpleDSL.g:1524:2: ( rule__Field__Group_8__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_8()); 
            // InternalSimpleDSL.g:1525:2: ( rule__Field__Group_8__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSimpleDSL.g:1525:3: rule__Field__Group_8__0
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
    // InternalSimpleDSL.g:1533:1: rule__Field__Group__9 : rule__Field__Group__9__Impl ;
    public final void rule__Field__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1537:1: ( rule__Field__Group__9__Impl )
            // InternalSimpleDSL.g:1538:2: rule__Field__Group__9__Impl
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
    // InternalSimpleDSL.g:1544:1: rule__Field__Group__9__Impl : ( '}' ) ;
    public final void rule__Field__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1548:1: ( ( '}' ) )
            // InternalSimpleDSL.g:1549:1: ( '}' )
            {
            // InternalSimpleDSL.g:1549:1: ( '}' )
            // InternalSimpleDSL.g:1550:2: '}'
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
    // InternalSimpleDSL.g:1560:1: rule__Field__Group_4__0 : rule__Field__Group_4__0__Impl rule__Field__Group_4__1 ;
    public final void rule__Field__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1564:1: ( rule__Field__Group_4__0__Impl rule__Field__Group_4__1 )
            // InternalSimpleDSL.g:1565:2: rule__Field__Group_4__0__Impl rule__Field__Group_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSimpleDSL.g:1572:1: rule__Field__Group_4__0__Impl : ( 'Type' ) ;
    public final void rule__Field__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1576:1: ( ( 'Type' ) )
            // InternalSimpleDSL.g:1577:1: ( 'Type' )
            {
            // InternalSimpleDSL.g:1577:1: ( 'Type' )
            // InternalSimpleDSL.g:1578:2: 'Type'
            {
             before(grammarAccess.getFieldAccess().getTypeKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSimpleDSL.g:1587:1: rule__Field__Group_4__1 : rule__Field__Group_4__1__Impl ;
    public final void rule__Field__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1591:1: ( rule__Field__Group_4__1__Impl )
            // InternalSimpleDSL.g:1592:2: rule__Field__Group_4__1__Impl
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
    // InternalSimpleDSL.g:1598:1: rule__Field__Group_4__1__Impl : ( ( rule__Field__TypeAssignment_4_1 ) ) ;
    public final void rule__Field__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1602:1: ( ( ( rule__Field__TypeAssignment_4_1 ) ) )
            // InternalSimpleDSL.g:1603:1: ( ( rule__Field__TypeAssignment_4_1 ) )
            {
            // InternalSimpleDSL.g:1603:1: ( ( rule__Field__TypeAssignment_4_1 ) )
            // InternalSimpleDSL.g:1604:2: ( rule__Field__TypeAssignment_4_1 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_4_1()); 
            // InternalSimpleDSL.g:1605:2: ( rule__Field__TypeAssignment_4_1 )
            // InternalSimpleDSL.g:1605:3: rule__Field__TypeAssignment_4_1
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
    // InternalSimpleDSL.g:1614:1: rule__Field__Group_5__0 : rule__Field__Group_5__0__Impl rule__Field__Group_5__1 ;
    public final void rule__Field__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1618:1: ( rule__Field__Group_5__0__Impl rule__Field__Group_5__1 )
            // InternalSimpleDSL.g:1619:2: rule__Field__Group_5__0__Impl rule__Field__Group_5__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSimpleDSL.g:1626:1: rule__Field__Group_5__0__Impl : ( 'Length' ) ;
    public final void rule__Field__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1630:1: ( ( 'Length' ) )
            // InternalSimpleDSL.g:1631:1: ( 'Length' )
            {
            // InternalSimpleDSL.g:1631:1: ( 'Length' )
            // InternalSimpleDSL.g:1632:2: 'Length'
            {
             before(grammarAccess.getFieldAccess().getLengthKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSimpleDSL.g:1641:1: rule__Field__Group_5__1 : rule__Field__Group_5__1__Impl ;
    public final void rule__Field__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1645:1: ( rule__Field__Group_5__1__Impl )
            // InternalSimpleDSL.g:1646:2: rule__Field__Group_5__1__Impl
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
    // InternalSimpleDSL.g:1652:1: rule__Field__Group_5__1__Impl : ( ( rule__Field__LengthAssignment_5_1 ) ) ;
    public final void rule__Field__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1656:1: ( ( ( rule__Field__LengthAssignment_5_1 ) ) )
            // InternalSimpleDSL.g:1657:1: ( ( rule__Field__LengthAssignment_5_1 ) )
            {
            // InternalSimpleDSL.g:1657:1: ( ( rule__Field__LengthAssignment_5_1 ) )
            // InternalSimpleDSL.g:1658:2: ( rule__Field__LengthAssignment_5_1 )
            {
             before(grammarAccess.getFieldAccess().getLengthAssignment_5_1()); 
            // InternalSimpleDSL.g:1659:2: ( rule__Field__LengthAssignment_5_1 )
            // InternalSimpleDSL.g:1659:3: rule__Field__LengthAssignment_5_1
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
    // InternalSimpleDSL.g:1668:1: rule__Field__Group_6__0 : rule__Field__Group_6__0__Impl rule__Field__Group_6__1 ;
    public final void rule__Field__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1672:1: ( rule__Field__Group_6__0__Impl rule__Field__Group_6__1 )
            // InternalSimpleDSL.g:1673:2: rule__Field__Group_6__0__Impl rule__Field__Group_6__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSimpleDSL.g:1680:1: rule__Field__Group_6__0__Impl : ( 'Precision' ) ;
    public final void rule__Field__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1684:1: ( ( 'Precision' ) )
            // InternalSimpleDSL.g:1685:1: ( 'Precision' )
            {
            // InternalSimpleDSL.g:1685:1: ( 'Precision' )
            // InternalSimpleDSL.g:1686:2: 'Precision'
            {
             before(grammarAccess.getFieldAccess().getPrecisionKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSimpleDSL.g:1695:1: rule__Field__Group_6__1 : rule__Field__Group_6__1__Impl ;
    public final void rule__Field__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1699:1: ( rule__Field__Group_6__1__Impl )
            // InternalSimpleDSL.g:1700:2: rule__Field__Group_6__1__Impl
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
    // InternalSimpleDSL.g:1706:1: rule__Field__Group_6__1__Impl : ( ( rule__Field__PreciscionAssignment_6_1 ) ) ;
    public final void rule__Field__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1710:1: ( ( ( rule__Field__PreciscionAssignment_6_1 ) ) )
            // InternalSimpleDSL.g:1711:1: ( ( rule__Field__PreciscionAssignment_6_1 ) )
            {
            // InternalSimpleDSL.g:1711:1: ( ( rule__Field__PreciscionAssignment_6_1 ) )
            // InternalSimpleDSL.g:1712:2: ( rule__Field__PreciscionAssignment_6_1 )
            {
             before(grammarAccess.getFieldAccess().getPreciscionAssignment_6_1()); 
            // InternalSimpleDSL.g:1713:2: ( rule__Field__PreciscionAssignment_6_1 )
            // InternalSimpleDSL.g:1713:3: rule__Field__PreciscionAssignment_6_1
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
    // InternalSimpleDSL.g:1722:1: rule__Field__Group_7__0 : rule__Field__Group_7__0__Impl rule__Field__Group_7__1 ;
    public final void rule__Field__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1726:1: ( rule__Field__Group_7__0__Impl rule__Field__Group_7__1 )
            // InternalSimpleDSL.g:1727:2: rule__Field__Group_7__0__Impl rule__Field__Group_7__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSimpleDSL.g:1734:1: rule__Field__Group_7__0__Impl : ( 'Scale' ) ;
    public final void rule__Field__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1738:1: ( ( 'Scale' ) )
            // InternalSimpleDSL.g:1739:1: ( 'Scale' )
            {
            // InternalSimpleDSL.g:1739:1: ( 'Scale' )
            // InternalSimpleDSL.g:1740:2: 'Scale'
            {
             before(grammarAccess.getFieldAccess().getScaleKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSimpleDSL.g:1749:1: rule__Field__Group_7__1 : rule__Field__Group_7__1__Impl ;
    public final void rule__Field__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1753:1: ( rule__Field__Group_7__1__Impl )
            // InternalSimpleDSL.g:1754:2: rule__Field__Group_7__1__Impl
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
    // InternalSimpleDSL.g:1760:1: rule__Field__Group_7__1__Impl : ( ( rule__Field__ScaleAssignment_7_1 ) ) ;
    public final void rule__Field__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1764:1: ( ( ( rule__Field__ScaleAssignment_7_1 ) ) )
            // InternalSimpleDSL.g:1765:1: ( ( rule__Field__ScaleAssignment_7_1 ) )
            {
            // InternalSimpleDSL.g:1765:1: ( ( rule__Field__ScaleAssignment_7_1 ) )
            // InternalSimpleDSL.g:1766:2: ( rule__Field__ScaleAssignment_7_1 )
            {
             before(grammarAccess.getFieldAccess().getScaleAssignment_7_1()); 
            // InternalSimpleDSL.g:1767:2: ( rule__Field__ScaleAssignment_7_1 )
            // InternalSimpleDSL.g:1767:3: rule__Field__ScaleAssignment_7_1
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
    // InternalSimpleDSL.g:1776:1: rule__Field__Group_8__0 : rule__Field__Group_8__0__Impl rule__Field__Group_8__1 ;
    public final void rule__Field__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1780:1: ( rule__Field__Group_8__0__Impl rule__Field__Group_8__1 )
            // InternalSimpleDSL.g:1781:2: rule__Field__Group_8__0__Impl rule__Field__Group_8__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSimpleDSL.g:1788:1: rule__Field__Group_8__0__Impl : ( 'Key' ) ;
    public final void rule__Field__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1792:1: ( ( 'Key' ) )
            // InternalSimpleDSL.g:1793:1: ( 'Key' )
            {
            // InternalSimpleDSL.g:1793:1: ( 'Key' )
            // InternalSimpleDSL.g:1794:2: 'Key'
            {
             before(grammarAccess.getFieldAccess().getKeyKeyword_8_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSimpleDSL.g:1803:1: rule__Field__Group_8__1 : rule__Field__Group_8__1__Impl ;
    public final void rule__Field__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1807:1: ( rule__Field__Group_8__1__Impl )
            // InternalSimpleDSL.g:1808:2: rule__Field__Group_8__1__Impl
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
    // InternalSimpleDSL.g:1814:1: rule__Field__Group_8__1__Impl : ( ( rule__Field__KeyAssignment_8_1 ) ) ;
    public final void rule__Field__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1818:1: ( ( ( rule__Field__KeyAssignment_8_1 ) ) )
            // InternalSimpleDSL.g:1819:1: ( ( rule__Field__KeyAssignment_8_1 ) )
            {
            // InternalSimpleDSL.g:1819:1: ( ( rule__Field__KeyAssignment_8_1 ) )
            // InternalSimpleDSL.g:1820:2: ( rule__Field__KeyAssignment_8_1 )
            {
             before(grammarAccess.getFieldAccess().getKeyAssignment_8_1()); 
            // InternalSimpleDSL.g:1821:2: ( rule__Field__KeyAssignment_8_1 )
            // InternalSimpleDSL.g:1821:3: rule__Field__KeyAssignment_8_1
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
    // InternalSimpleDSL.g:1830:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1834:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // InternalSimpleDSL.g:1835:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
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
    // InternalSimpleDSL.g:1842:1: rule__Relationship__Group__0__Impl : ( () ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1846:1: ( ( () ) )
            // InternalSimpleDSL.g:1847:1: ( () )
            {
            // InternalSimpleDSL.g:1847:1: ( () )
            // InternalSimpleDSL.g:1848:2: ()
            {
             before(grammarAccess.getRelationshipAccess().getRelationshipAction_0()); 
            // InternalSimpleDSL.g:1849:2: ()
            // InternalSimpleDSL.g:1849:3: 
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
    // InternalSimpleDSL.g:1857:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1861:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // InternalSimpleDSL.g:1862:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
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
    // InternalSimpleDSL.g:1869:1: rule__Relationship__Group__1__Impl : ( 'Relationship' ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1873:1: ( ( 'Relationship' ) )
            // InternalSimpleDSL.g:1874:1: ( 'Relationship' )
            {
            // InternalSimpleDSL.g:1874:1: ( 'Relationship' )
            // InternalSimpleDSL.g:1875:2: 'Relationship'
            {
             before(grammarAccess.getRelationshipAccess().getRelationshipKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSimpleDSL.g:1884:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1888:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // InternalSimpleDSL.g:1889:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
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
    // InternalSimpleDSL.g:1896:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__NameAssignment_2 ) ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1900:1: ( ( ( rule__Relationship__NameAssignment_2 ) ) )
            // InternalSimpleDSL.g:1901:1: ( ( rule__Relationship__NameAssignment_2 ) )
            {
            // InternalSimpleDSL.g:1901:1: ( ( rule__Relationship__NameAssignment_2 ) )
            // InternalSimpleDSL.g:1902:2: ( rule__Relationship__NameAssignment_2 )
            {
             before(grammarAccess.getRelationshipAccess().getNameAssignment_2()); 
            // InternalSimpleDSL.g:1903:2: ( rule__Relationship__NameAssignment_2 )
            // InternalSimpleDSL.g:1903:3: rule__Relationship__NameAssignment_2
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
    // InternalSimpleDSL.g:1911:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1915:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // InternalSimpleDSL.g:1916:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalSimpleDSL.g:1923:1: rule__Relationship__Group__3__Impl : ( '{' ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1927:1: ( ( '{' ) )
            // InternalSimpleDSL.g:1928:1: ( '{' )
            {
            // InternalSimpleDSL.g:1928:1: ( '{' )
            // InternalSimpleDSL.g:1929:2: '{'
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
    // InternalSimpleDSL.g:1938:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1942:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // InternalSimpleDSL.g:1943:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
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
    // InternalSimpleDSL.g:1950:1: rule__Relationship__Group__4__Impl : ( 'to' ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1954:1: ( ( 'to' ) )
            // InternalSimpleDSL.g:1955:1: ( 'to' )
            {
            // InternalSimpleDSL.g:1955:1: ( 'to' )
            // InternalSimpleDSL.g:1956:2: 'to'
            {
             before(grammarAccess.getRelationshipAccess().getToKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSimpleDSL.g:1965:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl rule__Relationship__Group__6 ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1969:1: ( rule__Relationship__Group__5__Impl rule__Relationship__Group__6 )
            // InternalSimpleDSL.g:1970:2: rule__Relationship__Group__5__Impl rule__Relationship__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalSimpleDSL.g:1977:1: rule__Relationship__Group__5__Impl : ( ( rule__Relationship__ToEntityAssignment_5 ) ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1981:1: ( ( ( rule__Relationship__ToEntityAssignment_5 ) ) )
            // InternalSimpleDSL.g:1982:1: ( ( rule__Relationship__ToEntityAssignment_5 ) )
            {
            // InternalSimpleDSL.g:1982:1: ( ( rule__Relationship__ToEntityAssignment_5 ) )
            // InternalSimpleDSL.g:1983:2: ( rule__Relationship__ToEntityAssignment_5 )
            {
             before(grammarAccess.getRelationshipAccess().getToEntityAssignment_5()); 
            // InternalSimpleDSL.g:1984:2: ( rule__Relationship__ToEntityAssignment_5 )
            // InternalSimpleDSL.g:1984:3: rule__Relationship__ToEntityAssignment_5
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
    // InternalSimpleDSL.g:1992:1: rule__Relationship__Group__6 : rule__Relationship__Group__6__Impl ;
    public final void rule__Relationship__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:1996:1: ( rule__Relationship__Group__6__Impl )
            // InternalSimpleDSL.g:1997:2: rule__Relationship__Group__6__Impl
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
    // InternalSimpleDSL.g:2003:1: rule__Relationship__Group__6__Impl : ( '}' ) ;
    public final void rule__Relationship__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2007:1: ( ( '}' ) )
            // InternalSimpleDSL.g:2008:1: ( '}' )
            {
            // InternalSimpleDSL.g:2008:1: ( '}' )
            // InternalSimpleDSL.g:2009:2: '}'
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


    // $ANTLR start "rule__Includes__Group__0"
    // InternalSimpleDSL.g:2019:1: rule__Includes__Group__0 : rule__Includes__Group__0__Impl rule__Includes__Group__1 ;
    public final void rule__Includes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2023:1: ( rule__Includes__Group__0__Impl rule__Includes__Group__1 )
            // InternalSimpleDSL.g:2024:2: rule__Includes__Group__0__Impl rule__Includes__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Includes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group__1();

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
    // $ANTLR end "rule__Includes__Group__0"


    // $ANTLR start "rule__Includes__Group__0__Impl"
    // InternalSimpleDSL.g:2031:1: rule__Includes__Group__0__Impl : ( () ) ;
    public final void rule__Includes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2035:1: ( ( () ) )
            // InternalSimpleDSL.g:2036:1: ( () )
            {
            // InternalSimpleDSL.g:2036:1: ( () )
            // InternalSimpleDSL.g:2037:2: ()
            {
             before(grammarAccess.getIncludesAccess().getIncludesAction_0()); 
            // InternalSimpleDSL.g:2038:2: ()
            // InternalSimpleDSL.g:2038:3: 
            {
            }

             after(grammarAccess.getIncludesAccess().getIncludesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__0__Impl"


    // $ANTLR start "rule__Includes__Group__1"
    // InternalSimpleDSL.g:2046:1: rule__Includes__Group__1 : rule__Includes__Group__1__Impl rule__Includes__Group__2 ;
    public final void rule__Includes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2050:1: ( rule__Includes__Group__1__Impl rule__Includes__Group__2 )
            // InternalSimpleDSL.g:2051:2: rule__Includes__Group__1__Impl rule__Includes__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Includes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group__2();

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
    // $ANTLR end "rule__Includes__Group__1"


    // $ANTLR start "rule__Includes__Group__1__Impl"
    // InternalSimpleDSL.g:2058:1: rule__Includes__Group__1__Impl : ( 'INCLUDE' ) ;
    public final void rule__Includes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2062:1: ( ( 'INCLUDE' ) )
            // InternalSimpleDSL.g:2063:1: ( 'INCLUDE' )
            {
            // InternalSimpleDSL.g:2063:1: ( 'INCLUDE' )
            // InternalSimpleDSL.g:2064:2: 'INCLUDE'
            {
             before(grammarAccess.getIncludesAccess().getINCLUDEKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getINCLUDEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__1__Impl"


    // $ANTLR start "rule__Includes__Group__2"
    // InternalSimpleDSL.g:2073:1: rule__Includes__Group__2 : rule__Includes__Group__2__Impl rule__Includes__Group__3 ;
    public final void rule__Includes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2077:1: ( rule__Includes__Group__2__Impl rule__Includes__Group__3 )
            // InternalSimpleDSL.g:2078:2: rule__Includes__Group__2__Impl rule__Includes__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Includes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group__3();

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
    // $ANTLR end "rule__Includes__Group__2"


    // $ANTLR start "rule__Includes__Group__2__Impl"
    // InternalSimpleDSL.g:2085:1: rule__Includes__Group__2__Impl : ( ( rule__Includes__NameAssignment_2 ) ) ;
    public final void rule__Includes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2089:1: ( ( ( rule__Includes__NameAssignment_2 ) ) )
            // InternalSimpleDSL.g:2090:1: ( ( rule__Includes__NameAssignment_2 ) )
            {
            // InternalSimpleDSL.g:2090:1: ( ( rule__Includes__NameAssignment_2 ) )
            // InternalSimpleDSL.g:2091:2: ( rule__Includes__NameAssignment_2 )
            {
             before(grammarAccess.getIncludesAccess().getNameAssignment_2()); 
            // InternalSimpleDSL.g:2092:2: ( rule__Includes__NameAssignment_2 )
            // InternalSimpleDSL.g:2092:3: rule__Includes__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Includes__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__2__Impl"


    // $ANTLR start "rule__Includes__Group__3"
    // InternalSimpleDSL.g:2100:1: rule__Includes__Group__3 : rule__Includes__Group__3__Impl rule__Includes__Group__4 ;
    public final void rule__Includes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2104:1: ( rule__Includes__Group__3__Impl rule__Includes__Group__4 )
            // InternalSimpleDSL.g:2105:2: rule__Includes__Group__3__Impl rule__Includes__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Includes__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group__4();

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
    // $ANTLR end "rule__Includes__Group__3"


    // $ANTLR start "rule__Includes__Group__3__Impl"
    // InternalSimpleDSL.g:2112:1: rule__Includes__Group__3__Impl : ( '{' ) ;
    public final void rule__Includes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2116:1: ( ( '{' ) )
            // InternalSimpleDSL.g:2117:1: ( '{' )
            {
            // InternalSimpleDSL.g:2117:1: ( '{' )
            // InternalSimpleDSL.g:2118:2: '{'
            {
             before(grammarAccess.getIncludesAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__3__Impl"


    // $ANTLR start "rule__Includes__Group__4"
    // InternalSimpleDSL.g:2127:1: rule__Includes__Group__4 : rule__Includes__Group__4__Impl rule__Includes__Group__5 ;
    public final void rule__Includes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2131:1: ( rule__Includes__Group__4__Impl rule__Includes__Group__5 )
            // InternalSimpleDSL.g:2132:2: rule__Includes__Group__4__Impl rule__Includes__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Includes__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group__5();

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
    // $ANTLR end "rule__Includes__Group__4"


    // $ANTLR start "rule__Includes__Group__4__Impl"
    // InternalSimpleDSL.g:2139:1: rule__Includes__Group__4__Impl : ( ( rule__Includes__Group_4__0 )? ) ;
    public final void rule__Includes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2143:1: ( ( ( rule__Includes__Group_4__0 )? ) )
            // InternalSimpleDSL.g:2144:1: ( ( rule__Includes__Group_4__0 )? )
            {
            // InternalSimpleDSL.g:2144:1: ( ( rule__Includes__Group_4__0 )? )
            // InternalSimpleDSL.g:2145:2: ( rule__Includes__Group_4__0 )?
            {
             before(grammarAccess.getIncludesAccess().getGroup_4()); 
            // InternalSimpleDSL.g:2146:2: ( rule__Includes__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSimpleDSL.g:2146:3: rule__Includes__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Includes__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIncludesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__4__Impl"


    // $ANTLR start "rule__Includes__Group__5"
    // InternalSimpleDSL.g:2154:1: rule__Includes__Group__5 : rule__Includes__Group__5__Impl ;
    public final void rule__Includes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2158:1: ( rule__Includes__Group__5__Impl )
            // InternalSimpleDSL.g:2159:2: rule__Includes__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Includes__Group__5__Impl();

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
    // $ANTLR end "rule__Includes__Group__5"


    // $ANTLR start "rule__Includes__Group__5__Impl"
    // InternalSimpleDSL.g:2165:1: rule__Includes__Group__5__Impl : ( '}' ) ;
    public final void rule__Includes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2169:1: ( ( '}' ) )
            // InternalSimpleDSL.g:2170:1: ( '}' )
            {
            // InternalSimpleDSL.g:2170:1: ( '}' )
            // InternalSimpleDSL.g:2171:2: '}'
            {
             before(grammarAccess.getIncludesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__5__Impl"


    // $ANTLR start "rule__Includes__Group_4__0"
    // InternalSimpleDSL.g:2181:1: rule__Includes__Group_4__0 : rule__Includes__Group_4__0__Impl rule__Includes__Group_4__1 ;
    public final void rule__Includes__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2185:1: ( rule__Includes__Group_4__0__Impl rule__Includes__Group_4__1 )
            // InternalSimpleDSL.g:2186:2: rule__Includes__Group_4__0__Impl rule__Includes__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Includes__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group_4__1();

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
    // $ANTLR end "rule__Includes__Group_4__0"


    // $ANTLR start "rule__Includes__Group_4__0__Impl"
    // InternalSimpleDSL.g:2193:1: rule__Includes__Group_4__0__Impl : ( 'fields' ) ;
    public final void rule__Includes__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2197:1: ( ( 'fields' ) )
            // InternalSimpleDSL.g:2198:1: ( 'fields' )
            {
            // InternalSimpleDSL.g:2198:1: ( 'fields' )
            // InternalSimpleDSL.g:2199:2: 'fields'
            {
             before(grammarAccess.getIncludesAccess().getFieldsKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getFieldsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group_4__0__Impl"


    // $ANTLR start "rule__Includes__Group_4__1"
    // InternalSimpleDSL.g:2208:1: rule__Includes__Group_4__1 : rule__Includes__Group_4__1__Impl rule__Includes__Group_4__2 ;
    public final void rule__Includes__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2212:1: ( rule__Includes__Group_4__1__Impl rule__Includes__Group_4__2 )
            // InternalSimpleDSL.g:2213:2: rule__Includes__Group_4__1__Impl rule__Includes__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Includes__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group_4__2();

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
    // $ANTLR end "rule__Includes__Group_4__1"


    // $ANTLR start "rule__Includes__Group_4__1__Impl"
    // InternalSimpleDSL.g:2220:1: rule__Includes__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Includes__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2224:1: ( ( '{' ) )
            // InternalSimpleDSL.g:2225:1: ( '{' )
            {
            // InternalSimpleDSL.g:2225:1: ( '{' )
            // InternalSimpleDSL.g:2226:2: '{'
            {
             before(grammarAccess.getIncludesAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group_4__1__Impl"


    // $ANTLR start "rule__Includes__Group_4__2"
    // InternalSimpleDSL.g:2235:1: rule__Includes__Group_4__2 : rule__Includes__Group_4__2__Impl rule__Includes__Group_4__3 ;
    public final void rule__Includes__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2239:1: ( rule__Includes__Group_4__2__Impl rule__Includes__Group_4__3 )
            // InternalSimpleDSL.g:2240:2: rule__Includes__Group_4__2__Impl rule__Includes__Group_4__3
            {
            pushFollow(FOLLOW_13);
            rule__Includes__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group_4__3();

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
    // $ANTLR end "rule__Includes__Group_4__2"


    // $ANTLR start "rule__Includes__Group_4__2__Impl"
    // InternalSimpleDSL.g:2247:1: rule__Includes__Group_4__2__Impl : ( ( rule__Includes__FieldsAssignment_4_2 ) ) ;
    public final void rule__Includes__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2251:1: ( ( ( rule__Includes__FieldsAssignment_4_2 ) ) )
            // InternalSimpleDSL.g:2252:1: ( ( rule__Includes__FieldsAssignment_4_2 ) )
            {
            // InternalSimpleDSL.g:2252:1: ( ( rule__Includes__FieldsAssignment_4_2 ) )
            // InternalSimpleDSL.g:2253:2: ( rule__Includes__FieldsAssignment_4_2 )
            {
             before(grammarAccess.getIncludesAccess().getFieldsAssignment_4_2()); 
            // InternalSimpleDSL.g:2254:2: ( rule__Includes__FieldsAssignment_4_2 )
            // InternalSimpleDSL.g:2254:3: rule__Includes__FieldsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Includes__FieldsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getFieldsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group_4__2__Impl"


    // $ANTLR start "rule__Includes__Group_4__3"
    // InternalSimpleDSL.g:2262:1: rule__Includes__Group_4__3 : rule__Includes__Group_4__3__Impl rule__Includes__Group_4__4 ;
    public final void rule__Includes__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2266:1: ( rule__Includes__Group_4__3__Impl rule__Includes__Group_4__4 )
            // InternalSimpleDSL.g:2267:2: rule__Includes__Group_4__3__Impl rule__Includes__Group_4__4
            {
            pushFollow(FOLLOW_13);
            rule__Includes__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group_4__4();

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
    // $ANTLR end "rule__Includes__Group_4__3"


    // $ANTLR start "rule__Includes__Group_4__3__Impl"
    // InternalSimpleDSL.g:2274:1: rule__Includes__Group_4__3__Impl : ( ( rule__Includes__Group_4_3__0 )* ) ;
    public final void rule__Includes__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2278:1: ( ( ( rule__Includes__Group_4_3__0 )* ) )
            // InternalSimpleDSL.g:2279:1: ( ( rule__Includes__Group_4_3__0 )* )
            {
            // InternalSimpleDSL.g:2279:1: ( ( rule__Includes__Group_4_3__0 )* )
            // InternalSimpleDSL.g:2280:2: ( rule__Includes__Group_4_3__0 )*
            {
             before(grammarAccess.getIncludesAccess().getGroup_4_3()); 
            // InternalSimpleDSL.g:2281:2: ( rule__Includes__Group_4_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSimpleDSL.g:2281:3: rule__Includes__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Includes__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getIncludesAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group_4__3__Impl"


    // $ANTLR start "rule__Includes__Group_4__4"
    // InternalSimpleDSL.g:2289:1: rule__Includes__Group_4__4 : rule__Includes__Group_4__4__Impl ;
    public final void rule__Includes__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2293:1: ( rule__Includes__Group_4__4__Impl )
            // InternalSimpleDSL.g:2294:2: rule__Includes__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Includes__Group_4__4__Impl();

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
    // $ANTLR end "rule__Includes__Group_4__4"


    // $ANTLR start "rule__Includes__Group_4__4__Impl"
    // InternalSimpleDSL.g:2300:1: rule__Includes__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Includes__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2304:1: ( ( '}' ) )
            // InternalSimpleDSL.g:2305:1: ( '}' )
            {
            // InternalSimpleDSL.g:2305:1: ( '}' )
            // InternalSimpleDSL.g:2306:2: '}'
            {
             before(grammarAccess.getIncludesAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group_4__4__Impl"


    // $ANTLR start "rule__Includes__Group_4_3__0"
    // InternalSimpleDSL.g:2316:1: rule__Includes__Group_4_3__0 : rule__Includes__Group_4_3__0__Impl rule__Includes__Group_4_3__1 ;
    public final void rule__Includes__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2320:1: ( rule__Includes__Group_4_3__0__Impl rule__Includes__Group_4_3__1 )
            // InternalSimpleDSL.g:2321:2: rule__Includes__Group_4_3__0__Impl rule__Includes__Group_4_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Includes__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group_4_3__1();

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
    // $ANTLR end "rule__Includes__Group_4_3__0"


    // $ANTLR start "rule__Includes__Group_4_3__0__Impl"
    // InternalSimpleDSL.g:2328:1: rule__Includes__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Includes__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2332:1: ( ( ',' ) )
            // InternalSimpleDSL.g:2333:1: ( ',' )
            {
            // InternalSimpleDSL.g:2333:1: ( ',' )
            // InternalSimpleDSL.g:2334:2: ','
            {
             before(grammarAccess.getIncludesAccess().getCommaKeyword_4_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group_4_3__0__Impl"


    // $ANTLR start "rule__Includes__Group_4_3__1"
    // InternalSimpleDSL.g:2343:1: rule__Includes__Group_4_3__1 : rule__Includes__Group_4_3__1__Impl ;
    public final void rule__Includes__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2347:1: ( rule__Includes__Group_4_3__1__Impl )
            // InternalSimpleDSL.g:2348:2: rule__Includes__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Includes__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Includes__Group_4_3__1"


    // $ANTLR start "rule__Includes__Group_4_3__1__Impl"
    // InternalSimpleDSL.g:2354:1: rule__Includes__Group_4_3__1__Impl : ( ( rule__Includes__FieldsAssignment_4_3_1 ) ) ;
    public final void rule__Includes__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2358:1: ( ( ( rule__Includes__FieldsAssignment_4_3_1 ) ) )
            // InternalSimpleDSL.g:2359:1: ( ( rule__Includes__FieldsAssignment_4_3_1 ) )
            {
            // InternalSimpleDSL.g:2359:1: ( ( rule__Includes__FieldsAssignment_4_3_1 ) )
            // InternalSimpleDSL.g:2360:2: ( rule__Includes__FieldsAssignment_4_3_1 )
            {
             before(grammarAccess.getIncludesAccess().getFieldsAssignment_4_3_1()); 
            // InternalSimpleDSL.g:2361:2: ( rule__Includes__FieldsAssignment_4_3_1 )
            // InternalSimpleDSL.g:2361:3: rule__Includes__FieldsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Includes__FieldsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getFieldsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group_4_3__1__Impl"


    // $ANTLR start "rule__Document__NameAssignment_2"
    // InternalSimpleDSL.g:2370:1: rule__Document__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Document__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2374:1: ( ( RULE_ID ) )
            // InternalSimpleDSL.g:2375:2: ( RULE_ID )
            {
            // InternalSimpleDSL.g:2375:2: ( RULE_ID )
            // InternalSimpleDSL.g:2376:3: RULE_ID
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
    // InternalSimpleDSL.g:2385:1: rule__Document__EntitesAssignment_3 : ( ruleEntity ) ;
    public final void rule__Document__EntitesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2389:1: ( ( ruleEntity ) )
            // InternalSimpleDSL.g:2390:2: ( ruleEntity )
            {
            // InternalSimpleDSL.g:2390:2: ( ruleEntity )
            // InternalSimpleDSL.g:2391:3: ruleEntity
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
    // InternalSimpleDSL.g:2400:1: rule__Entity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2404:1: ( ( ruleEString ) )
            // InternalSimpleDSL.g:2405:2: ( ruleEString )
            {
            // InternalSimpleDSL.g:2405:2: ( ruleEString )
            // InternalSimpleDSL.g:2406:3: ruleEString
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
    // InternalSimpleDSL.g:2415:1: rule__Entity__FieldsAssignment_4_2 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2419:1: ( ( ruleField ) )
            // InternalSimpleDSL.g:2420:2: ( ruleField )
            {
            // InternalSimpleDSL.g:2420:2: ( ruleField )
            // InternalSimpleDSL.g:2421:3: ruleField
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
    // InternalSimpleDSL.g:2430:1: rule__Entity__FieldsAssignment_4_3_1 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2434:1: ( ( ruleField ) )
            // InternalSimpleDSL.g:2435:2: ( ruleField )
            {
            // InternalSimpleDSL.g:2435:2: ( ruleField )
            // InternalSimpleDSL.g:2436:3: ruleField
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
    // InternalSimpleDSL.g:2445:1: rule__Entity__RelationshipsAssignment_5_2 : ( ruleRelationship ) ;
    public final void rule__Entity__RelationshipsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2449:1: ( ( ruleRelationship ) )
            // InternalSimpleDSL.g:2450:2: ( ruleRelationship )
            {
            // InternalSimpleDSL.g:2450:2: ( ruleRelationship )
            // InternalSimpleDSL.g:2451:3: ruleRelationship
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
    // InternalSimpleDSL.g:2460:1: rule__Entity__RelationshipsAssignment_5_3_1 : ( ruleRelationship ) ;
    public final void rule__Entity__RelationshipsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2464:1: ( ( ruleRelationship ) )
            // InternalSimpleDSL.g:2465:2: ( ruleRelationship )
            {
            // InternalSimpleDSL.g:2465:2: ( ruleRelationship )
            // InternalSimpleDSL.g:2466:3: ruleRelationship
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


    // $ANTLR start "rule__Entity__IncludesAssignment_6_2"
    // InternalSimpleDSL.g:2475:1: rule__Entity__IncludesAssignment_6_2 : ( ruleIncludes ) ;
    public final void rule__Entity__IncludesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2479:1: ( ( ruleIncludes ) )
            // InternalSimpleDSL.g:2480:2: ( ruleIncludes )
            {
            // InternalSimpleDSL.g:2480:2: ( ruleIncludes )
            // InternalSimpleDSL.g:2481:3: ruleIncludes
            {
             before(grammarAccess.getEntityAccess().getIncludesIncludesParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIncludes();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getIncludesIncludesParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__IncludesAssignment_6_2"


    // $ANTLR start "rule__Entity__IncludesAssignment_6_3_1"
    // InternalSimpleDSL.g:2490:1: rule__Entity__IncludesAssignment_6_3_1 : ( ruleIncludes ) ;
    public final void rule__Entity__IncludesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2494:1: ( ( ruleIncludes ) )
            // InternalSimpleDSL.g:2495:2: ( ruleIncludes )
            {
            // InternalSimpleDSL.g:2495:2: ( ruleIncludes )
            // InternalSimpleDSL.g:2496:3: ruleIncludes
            {
             before(grammarAccess.getEntityAccess().getIncludesIncludesParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIncludes();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getIncludesIncludesParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__IncludesAssignment_6_3_1"


    // $ANTLR start "rule__Field__NameAssignment_2"
    // InternalSimpleDSL.g:2505:1: rule__Field__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Field__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2509:1: ( ( ruleEString ) )
            // InternalSimpleDSL.g:2510:2: ( ruleEString )
            {
            // InternalSimpleDSL.g:2510:2: ( ruleEString )
            // InternalSimpleDSL.g:2511:3: ruleEString
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
    // InternalSimpleDSL.g:2520:1: rule__Field__TypeAssignment_4_1 : ( ruleDataType ) ;
    public final void rule__Field__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2524:1: ( ( ruleDataType ) )
            // InternalSimpleDSL.g:2525:2: ( ruleDataType )
            {
            // InternalSimpleDSL.g:2525:2: ( ruleDataType )
            // InternalSimpleDSL.g:2526:3: ruleDataType
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
    // InternalSimpleDSL.g:2535:1: rule__Field__LengthAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__Field__LengthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2539:1: ( ( RULE_INT ) )
            // InternalSimpleDSL.g:2540:2: ( RULE_INT )
            {
            // InternalSimpleDSL.g:2540:2: ( RULE_INT )
            // InternalSimpleDSL.g:2541:3: RULE_INT
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
    // InternalSimpleDSL.g:2550:1: rule__Field__PreciscionAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Field__PreciscionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2554:1: ( ( RULE_INT ) )
            // InternalSimpleDSL.g:2555:2: ( RULE_INT )
            {
            // InternalSimpleDSL.g:2555:2: ( RULE_INT )
            // InternalSimpleDSL.g:2556:3: RULE_INT
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
    // InternalSimpleDSL.g:2565:1: rule__Field__ScaleAssignment_7_1 : ( RULE_INT ) ;
    public final void rule__Field__ScaleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2569:1: ( ( RULE_INT ) )
            // InternalSimpleDSL.g:2570:2: ( RULE_INT )
            {
            // InternalSimpleDSL.g:2570:2: ( RULE_INT )
            // InternalSimpleDSL.g:2571:3: RULE_INT
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
    // InternalSimpleDSL.g:2580:1: rule__Field__KeyAssignment_8_1 : ( RULE_KEY ) ;
    public final void rule__Field__KeyAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2584:1: ( ( RULE_KEY ) )
            // InternalSimpleDSL.g:2585:2: ( RULE_KEY )
            {
            // InternalSimpleDSL.g:2585:2: ( RULE_KEY )
            // InternalSimpleDSL.g:2586:3: RULE_KEY
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
    // InternalSimpleDSL.g:2595:1: rule__Relationship__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Relationship__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2599:1: ( ( ruleEString ) )
            // InternalSimpleDSL.g:2600:2: ( ruleEString )
            {
            // InternalSimpleDSL.g:2600:2: ( ruleEString )
            // InternalSimpleDSL.g:2601:3: ruleEString
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
    // InternalSimpleDSL.g:2610:1: rule__Relationship__ToEntityAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relationship__ToEntityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2614:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSimpleDSL.g:2615:2: ( ( ruleQualifiedName ) )
            {
            // InternalSimpleDSL.g:2615:2: ( ( ruleQualifiedName ) )
            // InternalSimpleDSL.g:2616:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRelationshipAccess().getToEntityEntityCrossReference_5_0()); 
            // InternalSimpleDSL.g:2617:3: ( ruleQualifiedName )
            // InternalSimpleDSL.g:2618:4: ruleQualifiedName
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


    // $ANTLR start "rule__Includes__NameAssignment_2"
    // InternalSimpleDSL.g:2629:1: rule__Includes__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Includes__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2633:1: ( ( ruleEString ) )
            // InternalSimpleDSL.g:2634:2: ( ruleEString )
            {
            // InternalSimpleDSL.g:2634:2: ( ruleEString )
            // InternalSimpleDSL.g:2635:3: ruleEString
            {
             before(grammarAccess.getIncludesAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIncludesAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__NameAssignment_2"


    // $ANTLR start "rule__Includes__FieldsAssignment_4_2"
    // InternalSimpleDSL.g:2644:1: rule__Includes__FieldsAssignment_4_2 : ( ruleField ) ;
    public final void rule__Includes__FieldsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2648:1: ( ( ruleField ) )
            // InternalSimpleDSL.g:2649:2: ( ruleField )
            {
            // InternalSimpleDSL.g:2649:2: ( ruleField )
            // InternalSimpleDSL.g:2650:3: ruleField
            {
             before(grammarAccess.getIncludesAccess().getFieldsFieldParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getIncludesAccess().getFieldsFieldParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__FieldsAssignment_4_2"


    // $ANTLR start "rule__Includes__FieldsAssignment_4_3_1"
    // InternalSimpleDSL.g:2659:1: rule__Includes__FieldsAssignment_4_3_1 : ( ruleField ) ;
    public final void rule__Includes__FieldsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleDSL.g:2663:1: ( ( ruleField ) )
            // InternalSimpleDSL.g:2664:2: ( ruleField )
            {
            // InternalSimpleDSL.g:2664:2: ( ruleField )
            // InternalSimpleDSL.g:2665:3: ruleField
            {
             before(grammarAccess.getIncludesAccess().getFieldsFieldParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getIncludesAccess().getFieldsFieldParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__FieldsAssignment_4_3_1"

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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000D80000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000003E080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000180000L});

}