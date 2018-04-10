package dk.sdu.stefh14.math.ide.contentassist.antlr.internal;

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
import dk.sdu.stefh14.math.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDSL.g"; }


    	private DSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMathExp"
    // InternalDSL.g:53:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalDSL.g:54:1: ( ruleMathExp EOF )
            // InternalDSL.g:55:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalDSL.g:62:1: ruleMathExp : ( ( rule__MathExp__Group__0 ) ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:66:2: ( ( ( rule__MathExp__Group__0 ) ) )
            // InternalDSL.g:67:2: ( ( rule__MathExp__Group__0 ) )
            {
            // InternalDSL.g:67:2: ( ( rule__MathExp__Group__0 ) )
            // InternalDSL.g:68:3: ( rule__MathExp__Group__0 )
            {
             before(grammarAccess.getMathExpAccess().getGroup()); 
            // InternalDSL.g:69:3: ( rule__MathExp__Group__0 )
            // InternalDSL.g:69:4: rule__MathExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalDSL.g:78:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalDSL.g:79:1: ( ruleExp EOF )
            // InternalDSL.g:80:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalDSL.g:87:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:91:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalDSL.g:92:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalDSL.g:92:2: ( ( rule__Exp__Group__0 ) )
            // InternalDSL.g:93:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalDSL.g:94:3: ( rule__Exp__Group__0 )
            // InternalDSL.g:94:4: rule__Exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleExpOp"
    // InternalDSL.g:103:1: entryRuleExpOp : ruleExpOp EOF ;
    public final void entryRuleExpOp() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleExpOp EOF )
            // InternalDSL.g:105:1: ruleExpOp EOF
            {
             before(grammarAccess.getExpOpRule()); 
            pushFollow(FOLLOW_1);
            ruleExpOp();

            state._fsp--;

             after(grammarAccess.getExpOpRule()); 
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
    // $ANTLR end "entryRuleExpOp"


    // $ANTLR start "ruleExpOp"
    // InternalDSL.g:112:1: ruleExpOp : ( ( rule__ExpOp__Alternatives ) ) ;
    public final void ruleExpOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__ExpOp__Alternatives ) ) )
            // InternalDSL.g:117:2: ( ( rule__ExpOp__Alternatives ) )
            {
            // InternalDSL.g:117:2: ( ( rule__ExpOp__Alternatives ) )
            // InternalDSL.g:118:3: ( rule__ExpOp__Alternatives )
            {
             before(grammarAccess.getExpOpAccess().getAlternatives()); 
            // InternalDSL.g:119:3: ( rule__ExpOp__Alternatives )
            // InternalDSL.g:119:4: rule__ExpOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpOp"


    // $ANTLR start "entryRulePrimary"
    // InternalDSL.g:128:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( rulePrimary EOF )
            // InternalDSL.g:130:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalDSL.g:137:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalDSL.g:142:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalDSL.g:142:2: ( ( rule__Primary__Alternatives ) )
            // InternalDSL.g:143:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalDSL.g:144:3: ( rule__Primary__Alternatives )
            // InternalDSL.g:144:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalDSL.g:153:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleParenthesis EOF )
            // InternalDSL.g:155:1: ruleParenthesis EOF
            {
             before(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesis();

            state._fsp--;

             after(grammarAccess.getParenthesisRule()); 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalDSL.g:162:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalDSL.g:167:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalDSL.g:167:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalDSL.g:168:3: ( rule__Parenthesis__Group__0 )
            {
             before(grammarAccess.getParenthesisAccess().getGroup()); 
            // InternalDSL.g:169:3: ( rule__Parenthesis__Group__0 )
            // InternalDSL.g:169:4: rule__Parenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalDSL.g:178:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleNumber EOF )
            // InternalDSL.g:180:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalDSL.g:187:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // InternalDSL.g:192:2: ( ( rule__Number__ValueAssignment ) )
            {
            // InternalDSL.g:192:2: ( ( rule__Number__ValueAssignment ) )
            // InternalDSL.g:193:3: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // InternalDSL.g:194:3: ( rule__Number__ValueAssignment )
            // InternalDSL.g:194:4: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__ExpOp__Alternatives"
    // InternalDSL.g:202:1: rule__ExpOp__Alternatives : ( ( ( rule__ExpOp__Group_0__0 ) ) | ( ( rule__ExpOp__Group_1__0 ) ) | ( ( rule__ExpOp__Group_2__0 ) ) | ( ( rule__ExpOp__Group_3__0 ) ) );
    public final void rule__ExpOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:206:1: ( ( ( rule__ExpOp__Group_0__0 ) ) | ( ( rule__ExpOp__Group_1__0 ) ) | ( ( rule__ExpOp__Group_2__0 ) ) | ( ( rule__ExpOp__Group_3__0 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 16:
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
                    // InternalDSL.g:207:2: ( ( rule__ExpOp__Group_0__0 ) )
                    {
                    // InternalDSL.g:207:2: ( ( rule__ExpOp__Group_0__0 ) )
                    // InternalDSL.g:208:3: ( rule__ExpOp__Group_0__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_0()); 
                    // InternalDSL.g:209:3: ( rule__ExpOp__Group_0__0 )
                    // InternalDSL.g:209:4: rule__ExpOp__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:213:2: ( ( rule__ExpOp__Group_1__0 ) )
                    {
                    // InternalDSL.g:213:2: ( ( rule__ExpOp__Group_1__0 ) )
                    // InternalDSL.g:214:3: ( rule__ExpOp__Group_1__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_1()); 
                    // InternalDSL.g:215:3: ( rule__ExpOp__Group_1__0 )
                    // InternalDSL.g:215:4: rule__ExpOp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:219:2: ( ( rule__ExpOp__Group_2__0 ) )
                    {
                    // InternalDSL.g:219:2: ( ( rule__ExpOp__Group_2__0 ) )
                    // InternalDSL.g:220:3: ( rule__ExpOp__Group_2__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_2()); 
                    // InternalDSL.g:221:3: ( rule__ExpOp__Group_2__0 )
                    // InternalDSL.g:221:4: rule__ExpOp__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDSL.g:225:2: ( ( rule__ExpOp__Group_3__0 ) )
                    {
                    // InternalDSL.g:225:2: ( ( rule__ExpOp__Group_3__0 ) )
                    // InternalDSL.g:226:3: ( rule__ExpOp__Group_3__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_3()); 
                    // InternalDSL.g:227:3: ( rule__ExpOp__Group_3__0 )
                    // InternalDSL.g:227:4: rule__ExpOp__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ExpOp__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalDSL.g:235:1: rule__Primary__Alternatives : ( ( ruleNumber ) | ( ruleParenthesis ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:239:1: ( ( ruleNumber ) | ( ruleParenthesis ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:240:2: ( ruleNumber )
                    {
                    // InternalDSL.g:240:2: ( ruleNumber )
                    // InternalDSL.g:241:3: ruleNumber
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:246:2: ( ruleParenthesis )
                    {
                    // InternalDSL.g:246:2: ( ruleParenthesis )
                    // InternalDSL.g:247:3: ruleParenthesis
                    {
                     before(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParenthesis();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__MathExp__Group__0"
    // InternalDSL.g:256:1: rule__MathExp__Group__0 : rule__MathExp__Group__0__Impl rule__MathExp__Group__1 ;
    public final void rule__MathExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:260:1: ( rule__MathExp__Group__0__Impl rule__MathExp__Group__1 )
            // InternalDSL.g:261:2: rule__MathExp__Group__0__Impl rule__MathExp__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MathExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__1();

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
    // $ANTLR end "rule__MathExp__Group__0"


    // $ANTLR start "rule__MathExp__Group__0__Impl"
    // InternalDSL.g:268:1: rule__MathExp__Group__0__Impl : ( 'result' ) ;
    public final void rule__MathExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:272:1: ( ( 'result' ) )
            // InternalDSL.g:273:1: ( 'result' )
            {
            // InternalDSL.g:273:1: ( 'result' )
            // InternalDSL.g:274:2: 'result'
            {
             before(grammarAccess.getMathExpAccess().getResultKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getResultKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__0__Impl"


    // $ANTLR start "rule__MathExp__Group__1"
    // InternalDSL.g:283:1: rule__MathExp__Group__1 : rule__MathExp__Group__1__Impl rule__MathExp__Group__2 ;
    public final void rule__MathExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:287:1: ( rule__MathExp__Group__1__Impl rule__MathExp__Group__2 )
            // InternalDSL.g:288:2: rule__MathExp__Group__1__Impl rule__MathExp__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MathExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2();

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
    // $ANTLR end "rule__MathExp__Group__1"


    // $ANTLR start "rule__MathExp__Group__1__Impl"
    // InternalDSL.g:295:1: rule__MathExp__Group__1__Impl : ( 'is' ) ;
    public final void rule__MathExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:299:1: ( ( 'is' ) )
            // InternalDSL.g:300:1: ( 'is' )
            {
            // InternalDSL.g:300:1: ( 'is' )
            // InternalDSL.g:301:2: 'is'
            {
             before(grammarAccess.getMathExpAccess().getIsKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getIsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__1__Impl"


    // $ANTLR start "rule__MathExp__Group__2"
    // InternalDSL.g:310:1: rule__MathExp__Group__2 : rule__MathExp__Group__2__Impl ;
    public final void rule__MathExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:314:1: ( rule__MathExp__Group__2__Impl )
            // InternalDSL.g:315:2: rule__MathExp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2__Impl();

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
    // $ANTLR end "rule__MathExp__Group__2"


    // $ANTLR start "rule__MathExp__Group__2__Impl"
    // InternalDSL.g:321:1: rule__MathExp__Group__2__Impl : ( ( rule__MathExp__ExpAssignment_2 ) ) ;
    public final void rule__MathExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:325:1: ( ( ( rule__MathExp__ExpAssignment_2 ) ) )
            // InternalDSL.g:326:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            {
            // InternalDSL.g:326:1: ( ( rule__MathExp__ExpAssignment_2 ) )
            // InternalDSL.g:327:2: ( rule__MathExp__ExpAssignment_2 )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment_2()); 
            // InternalDSL.g:328:2: ( rule__MathExp__ExpAssignment_2 )
            // InternalDSL.g:328:3: rule__MathExp__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__2__Impl"


    // $ANTLR start "rule__Exp__Group__0"
    // InternalDSL.g:337:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalDSL.g:342:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Exp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group__1();

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
    // $ANTLR end "rule__Exp__Group__0"


    // $ANTLR start "rule__Exp__Group__0__Impl"
    // InternalDSL.g:349:1: rule__Exp__Group__0__Impl : ( ( rule__Exp__LeftAssignment_0 ) ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:353:1: ( ( ( rule__Exp__LeftAssignment_0 ) ) )
            // InternalDSL.g:354:1: ( ( rule__Exp__LeftAssignment_0 ) )
            {
            // InternalDSL.g:354:1: ( ( rule__Exp__LeftAssignment_0 ) )
            // InternalDSL.g:355:2: ( rule__Exp__LeftAssignment_0 )
            {
             before(grammarAccess.getExpAccess().getLeftAssignment_0()); 
            // InternalDSL.g:356:2: ( rule__Exp__LeftAssignment_0 )
            // InternalDSL.g:356:3: rule__Exp__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0__Impl"


    // $ANTLR start "rule__Exp__Group__1"
    // InternalDSL.g:364:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:368:1: ( rule__Exp__Group__1__Impl )
            // InternalDSL.g:369:2: rule__Exp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__1__Impl();

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
    // $ANTLR end "rule__Exp__Group__1"


    // $ANTLR start "rule__Exp__Group__1__Impl"
    // InternalDSL.g:375:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )? ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:379:1: ( ( ( rule__Exp__Group_1__0 )? ) )
            // InternalDSL.g:380:1: ( ( rule__Exp__Group_1__0 )? )
            {
            // InternalDSL.g:380:1: ( ( rule__Exp__Group_1__0 )? )
            // InternalDSL.g:381:2: ( rule__Exp__Group_1__0 )?
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalDSL.g:382:2: ( rule__Exp__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=13 && LA3_0<=16)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:382:3: rule__Exp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__1__Impl"


    // $ANTLR start "rule__Exp__Group_1__0"
    // InternalDSL.g:391:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:395:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalDSL.g:396:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Exp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1();

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
    // $ANTLR end "rule__Exp__Group_1__0"


    // $ANTLR start "rule__Exp__Group_1__0__Impl"
    // InternalDSL.g:403:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__OperatorAssignment_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:407:1: ( ( ( rule__Exp__OperatorAssignment_1_0 ) ) )
            // InternalDSL.g:408:1: ( ( rule__Exp__OperatorAssignment_1_0 ) )
            {
            // InternalDSL.g:408:1: ( ( rule__Exp__OperatorAssignment_1_0 ) )
            // InternalDSL.g:409:2: ( rule__Exp__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getExpAccess().getOperatorAssignment_1_0()); 
            // InternalDSL.g:410:2: ( rule__Exp__OperatorAssignment_1_0 )
            // InternalDSL.g:410:3: rule__Exp__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__OperatorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getOperatorAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1__1"
    // InternalDSL.g:418:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:422:1: ( rule__Exp__Group_1__1__Impl )
            // InternalDSL.g:423:2: rule__Exp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_1__1"


    // $ANTLR start "rule__Exp__Group_1__1__Impl"
    // InternalDSL.g:429:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:433:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalDSL.g:434:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalDSL.g:434:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalDSL.g:435:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalDSL.g:436:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalDSL.g:436:3: rule__Exp__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_0__0"
    // InternalDSL.g:445:1: rule__ExpOp__Group_0__0 : rule__ExpOp__Group_0__0__Impl rule__ExpOp__Group_0__1 ;
    public final void rule__ExpOp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:449:1: ( rule__ExpOp__Group_0__0__Impl rule__ExpOp__Group_0__1 )
            // InternalDSL.g:450:2: rule__ExpOp__Group_0__0__Impl rule__ExpOp__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpOp__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_0__1();

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
    // $ANTLR end "rule__ExpOp__Group_0__0"


    // $ANTLR start "rule__ExpOp__Group_0__0__Impl"
    // InternalDSL.g:457:1: rule__ExpOp__Group_0__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:461:1: ( ( () ) )
            // InternalDSL.g:462:1: ( () )
            {
            // InternalDSL.g:462:1: ( () )
            // InternalDSL.g:463:2: ()
            {
             before(grammarAccess.getExpOpAccess().getPlusAction_0_0()); 
            // InternalDSL.g:464:2: ()
            // InternalDSL.g:464:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getPlusAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_0__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_0__1"
    // InternalDSL.g:472:1: rule__ExpOp__Group_0__1 : rule__ExpOp__Group_0__1__Impl ;
    public final void rule__ExpOp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:476:1: ( rule__ExpOp__Group_0__1__Impl )
            // InternalDSL.g:477:2: rule__ExpOp__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_0__1__Impl();

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
    // $ANTLR end "rule__ExpOp__Group_0__1"


    // $ANTLR start "rule__ExpOp__Group_0__1__Impl"
    // InternalDSL.g:483:1: rule__ExpOp__Group_0__1__Impl : ( '+' ) ;
    public final void rule__ExpOp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:487:1: ( ( '+' ) )
            // InternalDSL.g:488:1: ( '+' )
            {
            // InternalDSL.g:488:1: ( '+' )
            // InternalDSL.g:489:2: '+'
            {
             before(grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_0__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_1__0"
    // InternalDSL.g:499:1: rule__ExpOp__Group_1__0 : rule__ExpOp__Group_1__0__Impl rule__ExpOp__Group_1__1 ;
    public final void rule__ExpOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:503:1: ( rule__ExpOp__Group_1__0__Impl rule__ExpOp__Group_1__1 )
            // InternalDSL.g:504:2: rule__ExpOp__Group_1__0__Impl rule__ExpOp__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ExpOp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_1__1();

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
    // $ANTLR end "rule__ExpOp__Group_1__0"


    // $ANTLR start "rule__ExpOp__Group_1__0__Impl"
    // InternalDSL.g:511:1: rule__ExpOp__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:515:1: ( ( () ) )
            // InternalDSL.g:516:1: ( () )
            {
            // InternalDSL.g:516:1: ( () )
            // InternalDSL.g:517:2: ()
            {
             before(grammarAccess.getExpOpAccess().getMinusAction_1_0()); 
            // InternalDSL.g:518:2: ()
            // InternalDSL.g:518:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getMinusAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_1__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_1__1"
    // InternalDSL.g:526:1: rule__ExpOp__Group_1__1 : rule__ExpOp__Group_1__1__Impl ;
    public final void rule__ExpOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:530:1: ( rule__ExpOp__Group_1__1__Impl )
            // InternalDSL.g:531:2: rule__ExpOp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_1__1__Impl();

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
    // $ANTLR end "rule__ExpOp__Group_1__1"


    // $ANTLR start "rule__ExpOp__Group_1__1__Impl"
    // InternalDSL.g:537:1: rule__ExpOp__Group_1__1__Impl : ( '-' ) ;
    public final void rule__ExpOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:541:1: ( ( '-' ) )
            // InternalDSL.g:542:1: ( '-' )
            {
            // InternalDSL.g:542:1: ( '-' )
            // InternalDSL.g:543:2: '-'
            {
             before(grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_1__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_2__0"
    // InternalDSL.g:553:1: rule__ExpOp__Group_2__0 : rule__ExpOp__Group_2__0__Impl rule__ExpOp__Group_2__1 ;
    public final void rule__ExpOp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:557:1: ( rule__ExpOp__Group_2__0__Impl rule__ExpOp__Group_2__1 )
            // InternalDSL.g:558:2: rule__ExpOp__Group_2__0__Impl rule__ExpOp__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__ExpOp__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_2__1();

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
    // $ANTLR end "rule__ExpOp__Group_2__0"


    // $ANTLR start "rule__ExpOp__Group_2__0__Impl"
    // InternalDSL.g:565:1: rule__ExpOp__Group_2__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:569:1: ( ( () ) )
            // InternalDSL.g:570:1: ( () )
            {
            // InternalDSL.g:570:1: ( () )
            // InternalDSL.g:571:2: ()
            {
             before(grammarAccess.getExpOpAccess().getMultAction_2_0()); 
            // InternalDSL.g:572:2: ()
            // InternalDSL.g:572:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getMultAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_2__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_2__1"
    // InternalDSL.g:580:1: rule__ExpOp__Group_2__1 : rule__ExpOp__Group_2__1__Impl ;
    public final void rule__ExpOp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:584:1: ( rule__ExpOp__Group_2__1__Impl )
            // InternalDSL.g:585:2: rule__ExpOp__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_2__1__Impl();

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
    // $ANTLR end "rule__ExpOp__Group_2__1"


    // $ANTLR start "rule__ExpOp__Group_2__1__Impl"
    // InternalDSL.g:591:1: rule__ExpOp__Group_2__1__Impl : ( '*' ) ;
    public final void rule__ExpOp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:595:1: ( ( '*' ) )
            // InternalDSL.g:596:1: ( '*' )
            {
            // InternalDSL.g:596:1: ( '*' )
            // InternalDSL.g:597:2: '*'
            {
             before(grammarAccess.getExpOpAccess().getAsteriskKeyword_2_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getAsteriskKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_2__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_3__0"
    // InternalDSL.g:607:1: rule__ExpOp__Group_3__0 : rule__ExpOp__Group_3__0__Impl rule__ExpOp__Group_3__1 ;
    public final void rule__ExpOp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:611:1: ( rule__ExpOp__Group_3__0__Impl rule__ExpOp__Group_3__1 )
            // InternalDSL.g:612:2: rule__ExpOp__Group_3__0__Impl rule__ExpOp__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ExpOp__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_3__1();

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
    // $ANTLR end "rule__ExpOp__Group_3__0"


    // $ANTLR start "rule__ExpOp__Group_3__0__Impl"
    // InternalDSL.g:619:1: rule__ExpOp__Group_3__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:623:1: ( ( () ) )
            // InternalDSL.g:624:1: ( () )
            {
            // InternalDSL.g:624:1: ( () )
            // InternalDSL.g:625:2: ()
            {
             before(grammarAccess.getExpOpAccess().getDivAction_3_0()); 
            // InternalDSL.g:626:2: ()
            // InternalDSL.g:626:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getDivAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_3__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_3__1"
    // InternalDSL.g:634:1: rule__ExpOp__Group_3__1 : rule__ExpOp__Group_3__1__Impl ;
    public final void rule__ExpOp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:638:1: ( rule__ExpOp__Group_3__1__Impl )
            // InternalDSL.g:639:2: rule__ExpOp__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_3__1__Impl();

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
    // $ANTLR end "rule__ExpOp__Group_3__1"


    // $ANTLR start "rule__ExpOp__Group_3__1__Impl"
    // InternalDSL.g:645:1: rule__ExpOp__Group_3__1__Impl : ( '/' ) ;
    public final void rule__ExpOp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:649:1: ( ( '/' ) )
            // InternalDSL.g:650:1: ( '/' )
            {
            // InternalDSL.g:650:1: ( '/' )
            // InternalDSL.g:651:2: '/'
            {
             before(grammarAccess.getExpOpAccess().getSolidusKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getSolidusKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_3__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__0"
    // InternalDSL.g:661:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:665:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalDSL.g:666:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__1();

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
    // $ANTLR end "rule__Parenthesis__Group__0"


    // $ANTLR start "rule__Parenthesis__Group__0__Impl"
    // InternalDSL.g:673:1: rule__Parenthesis__Group__0__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:677:1: ( ( '(' ) )
            // InternalDSL.g:678:1: ( '(' )
            {
            // InternalDSL.g:678:1: ( '(' )
            // InternalDSL.g:679:2: '('
            {
             before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0__Impl"


    // $ANTLR start "rule__Parenthesis__Group__1"
    // InternalDSL.g:688:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:692:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalDSL.g:693:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Parenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2();

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
    // $ANTLR end "rule__Parenthesis__Group__1"


    // $ANTLR start "rule__Parenthesis__Group__1__Impl"
    // InternalDSL.g:700:1: rule__Parenthesis__Group__1__Impl : ( ( rule__Parenthesis__ExpAssignment_1 ) ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:704:1: ( ( ( rule__Parenthesis__ExpAssignment_1 ) ) )
            // InternalDSL.g:705:1: ( ( rule__Parenthesis__ExpAssignment_1 ) )
            {
            // InternalDSL.g:705:1: ( ( rule__Parenthesis__ExpAssignment_1 ) )
            // InternalDSL.g:706:2: ( rule__Parenthesis__ExpAssignment_1 )
            {
             before(grammarAccess.getParenthesisAccess().getExpAssignment_1()); 
            // InternalDSL.g:707:2: ( rule__Parenthesis__ExpAssignment_1 )
            // InternalDSL.g:707:3: rule__Parenthesis__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__2"
    // InternalDSL.g:715:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:719:1: ( rule__Parenthesis__Group__2__Impl )
            // InternalDSL.g:720:2: rule__Parenthesis__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2__Impl();

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
    // $ANTLR end "rule__Parenthesis__Group__2"


    // $ANTLR start "rule__Parenthesis__Group__2__Impl"
    // InternalDSL.g:726:1: rule__Parenthesis__Group__2__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:730:1: ( ( ')' ) )
            // InternalDSL.g:731:1: ( ')' )
            {
            // InternalDSL.g:731:1: ( ')' )
            // InternalDSL.g:732:2: ')'
            {
             before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2__Impl"


    // $ANTLR start "rule__MathExp__ExpAssignment_2"
    // InternalDSL.g:742:1: rule__MathExp__ExpAssignment_2 : ( ruleExp ) ;
    public final void rule__MathExp__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:746:1: ( ( ruleExp ) )
            // InternalDSL.g:747:2: ( ruleExp )
            {
            // InternalDSL.g:747:2: ( ruleExp )
            // InternalDSL.g:748:3: ruleExp
            {
             before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__ExpAssignment_2"


    // $ANTLR start "rule__Exp__LeftAssignment_0"
    // InternalDSL.g:757:1: rule__Exp__LeftAssignment_0 : ( rulePrimary ) ;
    public final void rule__Exp__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:761:1: ( ( rulePrimary ) )
            // InternalDSL.g:762:2: ( rulePrimary )
            {
            // InternalDSL.g:762:2: ( rulePrimary )
            // InternalDSL.g:763:3: rulePrimary
            {
             before(grammarAccess.getExpAccess().getLeftPrimaryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getExpAccess().getLeftPrimaryParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__LeftAssignment_0"


    // $ANTLR start "rule__Exp__OperatorAssignment_1_0"
    // InternalDSL.g:772:1: rule__Exp__OperatorAssignment_1_0 : ( ruleExpOp ) ;
    public final void rule__Exp__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:776:1: ( ( ruleExpOp ) )
            // InternalDSL.g:777:2: ( ruleExpOp )
            {
            // InternalDSL.g:777:2: ( ruleExpOp )
            // InternalDSL.g:778:3: ruleExpOp
            {
             before(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpOp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__OperatorAssignment_1_0"


    // $ANTLR start "rule__Exp__RightAssignment_1_1"
    // InternalDSL.g:787:1: rule__Exp__RightAssignment_1_1 : ( ruleExp ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:791:1: ( ( ruleExp ) )
            // InternalDSL.g:792:2: ( ruleExp )
            {
            // InternalDSL.g:792:2: ( ruleExp )
            // InternalDSL.g:793:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__RightAssignment_1_1"


    // $ANTLR start "rule__Parenthesis__ExpAssignment_1"
    // InternalDSL.g:802:1: rule__Parenthesis__ExpAssignment_1 : ( ruleExp ) ;
    public final void rule__Parenthesis__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:806:1: ( ( ruleExp ) )
            // InternalDSL.g:807:2: ( ruleExp )
            {
            // InternalDSL.g:807:2: ( ruleExp )
            // InternalDSL.g:808:3: ruleExp
            {
             before(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__ExpAssignment_1"


    // $ANTLR start "rule__Number__ValueAssignment"
    // InternalDSL.g:817:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:821:1: ( ( RULE_INT ) )
            // InternalDSL.g:822:2: ( RULE_INT )
            {
            // InternalDSL.g:822:2: ( RULE_INT )
            // InternalDSL.g:823:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});

}