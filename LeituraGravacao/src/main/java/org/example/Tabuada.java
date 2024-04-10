package org.example;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, numero, mut;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        System.out.println("--------------------------Tabuada----------------------------------------- \n");
        for (i = 1; i <= 10; i++) {
            mut = numero * i;
            System.out.print("\t\t " + i +" *  "+ numero +  " = " + mut  );
            System.out.println("\n");
        }
        System.out.println("----------------------------------------------------------------------------");
    }
}
