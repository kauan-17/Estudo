package org.example;

import java.util.Scanner;

public class SomaDeDoisNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero1 , numero2;
        double soma;
        System.out.println("Digite o primero  numero: ");
        numero1 = leitor.nextInt();
        System.out.println("Digite o segundo  numero: ");
        numero2 = leitor.nextInt();
        soma = numero1 + numero2;
        System.out.println(" a soma dos numero foi de : " + soma);

    }
}