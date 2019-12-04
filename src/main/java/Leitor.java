import Codigos.TabelaDeSimbolos;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;


import java.io.IOException;
import java.util.List;



public class Leitor {

    public static void main(String[] args){
        try {


            String caminhoDoArquivo = "/home/aluno/Área de Trabalho/TrabalhoCompiladores1/InputC.javamm";
            ANTLRInputStream ais = new ANTLRFileStream(caminhoDoArquivo) ;
            TrabalhoParserLexer javamm = new TrabalhoParserLexer(ais);

            CommonTokenStream cts = new CommonTokenStream(javamm);

            TrabalhoParserParser parser = new TrabalhoParserParser(cts);

            parser.compilationUnit();



                    /*
            List<? extends Token> tokens = javamm.getAllTokens();

            for (Token t : tokens) {

                System.out.print(t.getText());
                System.out.print("\t");
                System.out.print(t.getType());
                System.out.println();

                if (t.getType() == Trabalho.ID) {
                    TabelaDeSimbolos.inserindo(t.getText(), t.getLine(), t.getCharPositionInLine());
                }
            }


             System.out.println(TabelaDeSimbolos.string());



            */
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

