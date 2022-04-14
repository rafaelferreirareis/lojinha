package br.com.lojinha.pojo;

public class ItemIncluso {

    //atributos
    private String nome;
    private int quantidade;

    public ItemIncluso (String nomeInicial, int quantidadeInicial){
        this.nome = nomeInicial;
        this.quantidade = quantidadeInicial;
    }

    // Métodos GET and SET
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
