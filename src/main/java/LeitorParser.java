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


            String caminhoDoArquivo = "/home/aluno/Área de Trabalho/TrabalhoCompiladores1/InputE.javamm";
            ANTLRInputStream ais = new ANTLRFileStream(caminhoDoArquivo) ;
            TrabalhoParserLexer javamm = new TrabalhoParserLexer(ais);

            CommonTokenStream cts = new CommonTokenStream(javamm);

            TrabalhoParserParser parser = new TrabalhoParserParser(cts);

            parser.compilationUnit();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

