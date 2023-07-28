package application;

import java.util.Scanner;

public class Ex08MediaPares {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n;
        int somaPares = 0;
        int qtdPares = 0;
        double mediaAritimetica;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = leitor.nextInt();

        int[] vetor = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leitor.nextInt();
        }

        for (int i=0; i< vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                somaPares +=  vetor[i];
                qtdPares++;
            }
        }

        if (qtdPares == 0) {
            System.out.println("NENHUM NÚMERO PAR");
        }
        else {
            mediaAritimetica = (double)somaPares / qtdPares;

            System.out.printf("MÉDIA DOS PARES = %.1f\n", mediaAritimetica);
        }
        leitor.close();
    }
}
