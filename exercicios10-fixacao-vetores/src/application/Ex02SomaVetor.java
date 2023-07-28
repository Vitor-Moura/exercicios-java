package application;

import java.util.Scanner;

public class Ex02SomaVetor {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n;
        double soma = 0;
        double media = 0;


        System.out.print("Quantos numeros voce vai digitar? ");
        n = leitor.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leitor.nextDouble();
            soma += vetor[i];
        }
        media = soma / vetor.length;


        System.out.print("VALORES = ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.1f  ", vetor[i]);
        }
        System.out.printf("\nSOMA = %.2f", soma);
        System.out.printf("\nMÉDIA = %.2f", media);

        leitor.close();
    }
}
