package application;

import java.util.Scanner;

public class Ex01Negativos {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n;

        System.out.print("Quantos nímeros voce vai digitar (máximo =  10)? ");
        n = leitor.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leitor.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0)
            System.out.println(vetor[i]);
        }
        leitor.close();
    }
}
