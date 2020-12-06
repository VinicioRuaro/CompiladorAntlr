package compiladores;

import org.antlr.v4.codegen.model.Recognizer;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ThrowingErrorListener extends BaseErrorListener{
    
    public static final  ThrowingErrorListener INSTANCE = new ThrowingErrorListener();
        
    @Override
    public void syntaxError(org.antlr.v4.runtime.Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) 
         throws ParseCancellationException{ 
        throw new ParseCancellationException("Na linha "+line+ " na posição "+charPositionInLine+" foi recebido '"+offendingSymbol+"'\nPorem é esperado "+ msg);          
    }
    
    
    
    
}
