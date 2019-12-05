import Codigos.TabelaDeSimbolos;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;


import java.io.IOException;
import java.util.List;



public class LeitorParser {

    public static void main(String[] args){
        try {

            String caminhoDoArquivo = "C:\\Users\\luizc\\Documents\\GitHub\\Compiladores\\InputE.javamm";
            ANTLRInputStream ais = new ANTLRFileStream(caminhoDoArquivo) ;
            TrabalhoParserLexer javamm = new TrabalhoParserLexer(ais);

            CommonTokenStream cts = new CommonTokenStream(javamm);

            TrabalhoParserParser parser = new TrabalhoParserParser(cts);

            TrabalhoParserParser.CompilationUnitContext c = parser.compilationUnit();


            ANTLRInputStream ais2 = new ANTLRFileStream(caminhoDoArquivo) ;
            TrabalhoParserLexer javamm2 = new TrabalhoParserLexer(ais2);
            List<? extends Token> tokens = javamm.getAllTokens();

            for (Token t : tokens) {
                if (t.getType() == TrabalhoParserLexer.ID) {
                    TabelaDeSimbolos.inserindo(t.getText(), t.getLine(), t.getCharPositionInLine());
                }
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

