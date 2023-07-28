package application;

import java.util.Scanner;

public class Ex05MaiorPosicao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n;
        int posicaoMaior = 0;
        double maior = 0;

        System.out.print("Quantos números você vai digitar? ");
        n = leitor.nextInt();

        double[] vetor = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = leitor.nextDouble();
        }

        maior = vetor[0];
        posicaoMaior = 0;

        for (int i=1; i< vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f", maior);
        System.out.printf("\nPOSICAO DO MAIOR VALOR = %d", posicaoMaior);

        leitor.close();
    }
}
