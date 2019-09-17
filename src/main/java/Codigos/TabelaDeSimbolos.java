package Codigos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class TabelaDeSimbolos {
    private static HashMap<Integer, Simb> tabelaDeSimbolo;
    private static int cont;

    private  TabelaDeSimbolos() {}

    private static HashMap getTabela(){
        if(tabelaDeSimbolo == null) {
            tabelaDeSimbolo = new HashMap<Integer, Simb>();
            cont = 0;
        }
        return tabelaDeSimbolo;
    }

    public static int inserindo(String nome, int linha, int coluna) {
        getTabela().put(cont, new Simb(cont, nome, linha, coluna));
        cont++;
        return (cont-1);
    }

    public static Simb getSimbolo(int id){
        return (Simb) getTabela().get(id);
    }

    public static Simb getSimbolo(Simb simb){
        HashMap tabela = getTabela();
        Set<Integer> chaves = tabela.keySet();
        Simb retorno = null;
        for (Integer i : chaves) {
            if (((Simb)tabela.get(i)) == simb) {
                retorno = (Simb) tabela.get(i);
            }
        }
        return retorno;
    }

    public static Simb getSimbolo(String nome){
        HashMap tabela = getTabela();
        Set<Integer> chaves = tabela.keySet();
        Simb retorno = null;
        for (Integer i : chaves) {
            if (((Simb)tabela.get(i)).getNome() == nome) {
                retorno = (Simb) tabela.get(i);
            }
        }
        return retorno;
    }


    public static String string() {
        String s = new String();
        Set<Integer> keys = getTabela().keySet();
        for (Integer key : keys) {
            s += "[" + getTabela().get(key).toString() + "]\n";
        }
        return s;
    }


}

