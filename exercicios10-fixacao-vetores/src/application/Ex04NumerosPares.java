package application;

import java.util.Scanner;

public class Ex04NumerosPares {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n, qtdPares;

        System.out.print("Quantos números voce vai digitar? ");
        n = leitor.nextInt();

        int[] vetor = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leitor.nextInt();
        }

        System.out.println("\nNÚMEROS PARES:");

        qtdPares = 0;
        for (int i=0; i< vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.printf("%d  ", vetor[i]);
                qtdPares++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdPares);

        leitor.close();
    }
}
