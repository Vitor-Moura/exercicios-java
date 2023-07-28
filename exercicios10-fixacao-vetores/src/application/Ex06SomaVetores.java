package application;

import java.util.Scanner;

public class Ex06SomaVetores {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n;

        System.out.print("Quantos valores vai ter cada vetor? ");
        n = leitor.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i=0; i<n; i++) {
            vetorA[i] = leitor.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i=0; i<n; i++) {
            vetorB[i] = leitor.nextInt();
        }

        for (int i=0; i<n; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VETOR RESULTANTE:");

        for (int i=0; i<vetorC.length; i++) {
            System.out.printf("%d\n", vetorC[i]);
        }

        leitor.close();
    }
}
