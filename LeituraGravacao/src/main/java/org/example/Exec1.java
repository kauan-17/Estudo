package org.example;

import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        if ((numero >=100) && (numero <=200)){
            System.out.println("numero esta  no intervalo: " + numero);
        }
        else {
            System.out.println("numero não esta no intervalo: " + numero);
        }
   }
}
