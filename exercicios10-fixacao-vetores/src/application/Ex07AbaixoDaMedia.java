package application;

import java.util.Scanner;

public class Ex07AbaixoDaMedia {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n;
        double soma = 0;
        double media;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = leitor.nextInt();

        double[] vetor = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leitor.nextDouble();
        }

        for (int i=0; i< vetor.length; i++) {
            soma = soma + vetor[i];
        }

        media = soma / n;

        System.out.printf("\nMÉDIA DO VETOR = %.3f", media);
        System.out.println("\nELEMENTOS ABAIXO DA MÉDIA:");

        for (int i=0; i< vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.1f\n", vetor[i]);
            }
        }
        leitor.close();
    }
}
