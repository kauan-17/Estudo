package org.example;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;

        Vendedor v = new Vendedor();
        System.out.println("Digite o nome do vendedor: ");
        v.setNome (sc.next());
        System.out.println("Digite o saldo do vendedor: ");
        v.setSalario(sc.nextDouble());
        System.out.println("Digita o seu CPF: ");
        v.setCpf(sc.next());
        v.setDataNascimento(new Date(1998-01-17));
        v.setComicaoPorItem(10.00);
        v.setTotalItemVendido(20);

        System.out.println("O salario do vendedor e : " + v.calculaSalario());
        Motorista m = new Motorista();


    }
}