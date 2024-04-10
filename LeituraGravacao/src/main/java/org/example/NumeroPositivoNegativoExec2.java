package org.example;

import java.util.Scanner;

public class NumeroPositivoNegativoExec2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar = 's';

        while (continuar == 's' || continuar == 's') {
            int numero ;
            System.out.println("Digita numero");
            numero = sc.nextInt();
            if(numero == 0){
                System.out.println("O numero e zero");
            }
            else if(numero > 0){
                System.out.println("numero maior que 0");
            }
            else {
                System.out.println("numero menor que 0");
            }
            System.out.println("Deseja continuar outro numero? (S/N)");
            continuar = sc.next().charAt(0);
        }

    }
}
