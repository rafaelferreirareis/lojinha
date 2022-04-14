package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

// classe com herança de produto
public class ProdutoNacional extends Produto implements Favorito {

    //atributo
    private double impostoNacional;

    // construtor
    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    // Métodos GET and SET
    public double getImpostoNacional() {
        return impostoNacional;
    }
    public void setImpostoNacional(double novoImpostoNacional) {
        this.impostoNacional = novoImpostoNacional;
    }

    // Método criado devido o implements
    public String getDadosFavoritos(){
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor(); //concatenação
    }

}
