package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;
import java.util.ArrayList;
import java.util.List;

//classe
public class LojinhaApp {
    //Método
    public static void main(String[] args) {
        Produto meuProduto = new Produto("LG",Tamanho.MEDIO);

        meuProduto.setNome("Playstation 5");
        meuProduto.setValor(30);

        // criando uma lista
        List<ItemIncluso> itensInclusos = new ArrayList<>();

            ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle",2);
                itensInclusos.add(primeiroItemIncluso); //0

            ItemIncluso segundoItemIncluso = new ItemIncluso("jogo", 3);
                itensInclusos.add(segundoItemIncluso); //1

            ItemIncluso terceiroItemIncluso = new ItemIncluso("cabo de energia", 2);
                itensInclusos.add(terceiroItemIncluso); //2

        meuProduto.setItensInclusos(itensInclusos);

        /*
        System.out.println(meuProduto.getItensInclusos().get(0).getNome());
        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());
        System.out.println(meuProduto.getItensInclusos().get(1).getNome());
        System.out.println(meuProduto.getItensInclusos().get(1).getQuantidade());
        System.out.println(meuProduto.getItensInclusos().get(2).getNome());
        System.out.println(meuProduto.getItensInclusos().get(2).getQuantidade());
        */

        //Com o for, é possível navegar na lista e não precisa colocar 1 SOUT pra cada item
        for(ItemIncluso itemAtual : meuProduto.getItensInclusos()){
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony",Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        //polimorfismo
        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony", Tamanho.MEDIO);
        meuProdutoInternacional.setValor(-100);

    }
}