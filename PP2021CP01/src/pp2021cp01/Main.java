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
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        Produto quadrinho = new Produto("Quadrinho", 15.00);
        Produto chaveiro = new Produto("Chaveiro", 5.00);
        Produto busto = new Produto("Busto", 10.00);
        Produto adesivo = new Produto("Adesivo", 1.00);
        Produto poster = new Produto("Poster", 25.00);
        Produto camiseta = new Produto("Camiseta", 25.00);
        Produto caneta = new Produto("Caneta", 3.00);
        Produto miniatura = new Produto("Miniatura", 20.00);

        Bronze bronze = new Bronze(3);
        Prata prata = new Prata(5);
        Ouro ouro = new Ouro(7);
        Platina platina = new Platina(10);

        ArrayList<Produto> produtoList = new ArrayList<Produto>();
        produtoList.add(caneta);
        produtoList.add(adesivo);
        produtoList.add(poster);
        //produtoList.add(miniatura);

        Caixa caixa1 = new Caixa();
        caixa1.addCaixa(produtoList, bronze.quantidadeItensPossiveis);
        caixa1.imprimir();
    }

}
