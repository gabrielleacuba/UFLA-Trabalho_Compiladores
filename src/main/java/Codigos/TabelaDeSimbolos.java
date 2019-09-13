package Codigos;

import java.util.ArrayList;
import java.util.HashMap;

public class TabelaDeSimbolos {
    private static HashMap<Integer, Simb> tabelaDeSimbolo;
    private static int cont;
    private  TabelaDeSimbolos(){
    }

    public static HashMap getHash(){
        if(tabelaDeSimbolo == null) {
            tabelaDeSimbolo = new HashMap<Integer, Simb>();
            cont = 0;
        }
        return tabelaDeSimbolo;
    }

    public static int inserindo(String nome, int linha, int coluna){
        tabelaDeSimbolo.put(cont,new Simb(cont,nome,linha,coluna));
        cont++;
        return (cont-1);
    }

    //public static Simb getSimbolo(int id){

    //}


}

