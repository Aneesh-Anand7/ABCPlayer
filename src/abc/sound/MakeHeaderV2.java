package abc.sound;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.ABCgrammarListener;
import abc.parser.ABCgrammarParser.CommentContext;
import abc.parser.ABCgrammarParser.ComposerContext;
import abc.parser.ABCgrammarParser.EndoflineContext;
import abc.parser.ABCgrammarParser.IndexContext;
import abc.parser.ABCgrammarParser.KeyContext;
import abc.parser.ABCgrammarParser.LengthContext;
import abc.parser.ABCgrammarParser.LineContext;
import abc.parser.ABCgrammarParser.MeterContext;
import abc.parser.ABCgrammarParser.RootContext;
import abc.parser.ABCgrammarParser.TempoContext;
import abc.parser.ABCgrammarParser.TitleContext;
import abc.parser.ABCgrammarParser.VoiceContext;

public class MakeHeaderV2 implements ABCgrammarListener {

    private Map<String, String> map = new HashMap<>();
    
    /**
     * Get the values parsed from the header
     * @return
     */
    public Map<String, String> getHeader() {
        return map;
    }

    @Override
    public void enterEveryRule(ParserRuleContext arg0) {
        System.err.println("entering " + arg0.getText() + ", map is " + map);

    }

    @Override
    public void exitEveryRule(ParserRuleContext arg0) {
        System.err.println("entering " + arg0.getText() + ", map is " + map);

    }

    @Override
    public void visitErrorNode(ErrorNode arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitTerminal(TerminalNode arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterRoot(RootContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitRoot(RootContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterIndex(IndexContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitIndex(IndexContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterTitle(TitleContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTitle(TitleContext ctx) {
    }

    @Override
    public void enterLine(LineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitLine(LineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterLength(LengthContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitLength(LengthContext ctx) {
        StringBuilder lengthString = new StringBuilder();
        lengthString.append(ctx.NUMBER());
        map.put("length", lengthString.substring(2));     

    }

    @Override
    public void enterComposer(ComposerContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitComposer(ComposerContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterMeter(MeterContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitMeter(MeterContext ctx) {
        if(ctx.getText().equals("C") || ctx.getText() == null){
            map.put("meter", "4/4");
        }
        else if(ctx.getText().equals("C|")){
            map.put("meter", "2/2");
        }
        else{
            StringBuilder meterValueString = new StringBuilder();
            String meterTotalString = ctx.getText();
            for (int i = 2; i < meterTotalString.length(); i++){
                char c = meterTotalString.charAt(i); 
                meterValueString.append(c);
            }
            map.put("meter", meterValueString.toString());    
        }
    }

    @Override
    public void enterTempo(TempoContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTempo(TempoContext ctx) {
        if(ctx.getText() == null){
            map.put("tempo", "100");
        }
        else{
            StringBuilder tempoString = new StringBuilder();
            tempoString.append(ctx.getText());
            map.put("tempo", tempoString.substring(2));
        }
    }

    @Override
    public void enterVoice(VoiceContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitVoice(VoiceContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEndofline(EndoflineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEndofline(EndoflineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterComment(CommentContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitComment(CommentContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterKey(KeyContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitKey(KeyContext ctx) {
        StringBuilder keyString = new StringBuilder();
        keyString.append(ctx.KEY());
        map.put("key", keyString.substring(2));     
    }
}
