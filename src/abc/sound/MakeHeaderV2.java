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
        //System.err.println("entering " + arg0.getText() + ", map is " + map);

    }

    @Override
    public void exitEveryRule(ParserRuleContext arg0) {
        //System.err.println("exiting " + arg0.getText() + ", map is " + map);

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
        if (!(map.containsKey("meter"))) {
            map.put("meter", "4/4");
            if (!(map.containsKey("length"))) {
                map.put("length", "1/8");
            }
        }
        //
        if (!(map.containsKey("length"))) {
            String noteLength;
            double SIXTEEN_TO_EIGHTH = 0.75;
            String[] fractionValues = map.get("meter").split("/");
            double meterValue = Double.parseDouble(fractionValues[0]) / Double.parseDouble(fractionValues[1]);
            if (meterValue < SIXTEEN_TO_EIGHTH) {
                noteLength = "1/16";
            } else {
                noteLength = "1/8";
            }
            map.put("length", noteLength);
        }
        //
        if (!(map.containsKey("tempo"))) {
            String tempo = "";
            tempo+=map.get("length") + "=100";
            map.put("tempo", tempo);
        }
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
        lengthString.append(ctx.getText());
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
//        StringBuilder meterValueString = new StringBuilder();
        String meterTotalString = ctx.getText();
        meterTotalString = meterTotalString.substring(2);
        
        if (meterTotalString.equals("C")){
            map.put("meter", "4/4");
        }
        else if (meterTotalString.equals("C|")){
            map.put("meter", "2/2");
        }
        else{
            map.put("meter", meterTotalString);   
        }
    }

    @Override
    public void enterTempo(TempoContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTempo(TempoContext ctx) {
        StringBuilder tempoString = new StringBuilder();
        tempoString.append(ctx.getText());
        map.put("tempo", tempoString.substring(2));

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
