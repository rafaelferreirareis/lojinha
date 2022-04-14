package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import java.util.List;

// classe
public class Produto {

    // atributos
    private String nome;
    private String marca;
    protected double valor;
    private Tamanho tamanho;
    private List<ItemIncluso> itensInclusos;

    //contrutor
    public Produto(String marcaInicial, Tamanho tamanhoInicial){
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }

    // Métodos GET and SET
    public double getValor() {
        return valor;
    }
    public void setValor(double novoValor) {
        if (novoValor > 0) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }
    public Tamanho getTamanho() {
        return tamanho;
    }
    public void setTamanho(Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }
    public List<ItemIncluso> getItensInclusos() {
        return itensInclusos;
    }
    public void setItensInclusos(List<ItemIncluso> novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }
}
