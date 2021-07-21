/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2021cp01;

/**
 *
 * @author eduar
 */
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Caixa {

    public ArrayList<Produto> caixaList = new ArrayList<Produto>();

    public void addCaixa(ArrayList<Produto> produtoList, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            Collections.shuffle(produtoList);
            Produto produto = produtoList.get(0);
            caixaList.add(produto);
        }
    }

    public void removeCaixa(ArrayList<Produto> produtoList, int quantidade) {
        for (Produto produto : produtoList) {
            caixaList.remove(produto);
        }
    }

    public void imprimir() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        double valorTotal = 0;
        System.out.println("**** Itens na caixa ****");
        for (Produto produto : caixaList) {
            valorTotal += produto.valor;
            System.out.println(produto.nome + " - R$ " + fmt.format(produto.valor));
        }
        System.out.println("\nValor total da caixa: " + fmt.format(valorTotal));
    }
}
