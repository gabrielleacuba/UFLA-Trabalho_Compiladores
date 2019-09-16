package Codigos;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import java.io.IOException;
import java.util.List;


public class Leitor {

    public static void main(String[] args){
        try {
            String caminhoDoArquivo = "C:\\Users\\luizc\\Documents\\GitHub\\Compiladores\\Input.javamm";
            ANTLRInputStream ais = new ANTLRFileStream(caminhoDoArquivo) ;
            Trabalho javamm = new Trabalho(ais);
            List<? extends Token> tokens = javamm.getAllTokens();

            for (Token t : tokens) {
                if (t.getType() == Trabalho.ID) {
                    TabelaDeSimbolos.inserindo(t.getText(), t.getLine(), t.getCharPositionInLine());
                }
            }

            System.out.println(TabelaDeSimbolos.string());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

