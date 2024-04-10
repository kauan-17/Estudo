package org.example;

import java.util.Scanner;

public class MediaDaTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, nota5, media, mediaQ;
        System.out.println("Digite nota do primeira bimestre : ");
        nota1 = sc.nextDouble();
        System.out.println("Digite nota do segunda bimestre : ");
        nota2 = sc.nextDouble();
        System.out.println("Digite nota do terceira bimestre : ");
        nota3 = sc.nextDouble();
        System.out.println("Digite nota do quarta bimestre : ");
        nota4 = sc.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media > 6) {
            System.out.println("\tAluno aprovado");
        }
        else if( (media >= 3) && (media < 6  ) ){

            System.out.println("\n\tAluno de Quinta prova");
            System.out.println("Nota da quinta prova: ");
            nota5 = sc.nextDouble();
            mediaQ = (media + nota5) / 2;
            if (mediaQ >= 6) {
                System.out.println("\tAluno aprovado");
            }
            else {
                System.out.println("\tAluno reprovado");
            }

        }
        else {
            System.out.println("\tAluno reprovado");
        }
    }
}
