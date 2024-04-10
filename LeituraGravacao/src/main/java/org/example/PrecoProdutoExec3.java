package org.example;

import java.util.Scanner;

public class PrecoProdutoExec3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double precoCusto, precoVenda , mediaCusto=0, mediaVenda=0;
        int i;

        for ( i = 0; i <= 3; i++){
            System.out.println("Digita o nome do produto: ");
            nome = new Scanner(System.in).next();
            System.out.println("Digita o preço de custo do produto ");
            precoCusto = sc.nextDouble();
            System.out.println("Digita o preço de venda do produto");
            precoVenda = sc.nextDouble();
            mediaCusto = mediaCusto + precoCusto;
            mediaVenda = mediaVenda + precoVenda;

            if (precoCusto > precoVenda){
                System.out.println("Prejuizos");
            }
            else if (precoCusto < precoVenda) {
                System.out.println("Lucro ");
            }
            else {
                System.out.println("Não teve lucro e nem prejuizos");
            }
            System.out.println(nome+" preço de custo = "+precoCusto+", preço de venda = "+precoVenda);

        }
    System.out.println("A media de custo e de: "+mediaCusto/i);
    System.out.println("A media de venda e de: "+mediaVenda/i);
    }
}
