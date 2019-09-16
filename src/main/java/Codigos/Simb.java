package Codigos;

public class Simb {
    private Integer id;
    private String nome;
    private int linha;
    private int coluna;

    public Simb(int id, String nome,  int linha, int coluna) {
        this.id = id;
        this.nome = nome;
        this.linha = linha;
        this.coluna = coluna;
    }
    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getLinha() {
        return linha;
    }
    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        return nome +  ", " + linha + ", " + coluna;
    }
}
