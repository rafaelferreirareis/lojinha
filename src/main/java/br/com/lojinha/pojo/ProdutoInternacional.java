package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

// classe com herança de produto
public class ProdutoInternacional extends Produto implements Favorito {

    //atributo
    private double taxaImportacao;

    //construtor
    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    //Método copiado da classe produto para o polimorfismo
    public void setValor(double novoValor) {
        if (novoValor > -100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100");
        }
    }

    // Métodos GET and SET
    public double getTaxaImportacao() {
        return taxaImportacao;
    }
    public void setTaxaImportacao(double novaTaxaImportacao) {
        this.taxaImportacao = novaTaxaImportacao;
    }

    //Método criado devido o uso do implements
    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor(); //concatenação;
    }
}
