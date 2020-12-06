 package compiladores;
 

import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import teste.parser.TrabalhoLexer;
import teste.parser.TrabalhoParser;






public class Main {
    public static void main(String[] args) throws IOException{
        
        Scanner ler = new Scanner(System.in);
        String entrada = new String();
        System.out.println("Digite a entrada");
        entrada  = ler.next();  
        
                CharStream input = new org.antlr.v4.runtime.ANTLRInputStream(entrada);
                TrabalhoLexer lexer = new TrabalhoLexer(input);
                TokenStream tokens = new CommonTokenStream(lexer);
                TrabalhoParser parser = new TrabalhoParser(tokens);
                
                
                parser.addErrorListener(new ThrowingErrorListener());
        try {
                parser.prog();
                
                
                
                String leitura = new String();
                System.out.println("Deseja ver a Arvore de derivação digite 1");
                leitura  = ler.next();
        
                if(leitura.equals("1")){
                    ParseTree prog = parser.prog();
                    showParseTreeFrame(prog, parser);
        }
            
            
        } catch (ParseCancellationException e) {
            System.out.println("Deu algo Errado ai amigo:\n\n"
                                +e.getMessage());
        }
        
       
    }
    private static void showParseTreeFrame(ParseTree tree, TrabalhoParser parser) throws HeadlessException {
        JFrame frame = new JFrame("SRC: " + tree.getText());
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewr.setScale(1);
        panel.add(viewr);
        frame.add(panel);
        frame.setSize(1000, 600);
        frame.setState(JFrame.MAXIMIZED_HORIZ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    
}


