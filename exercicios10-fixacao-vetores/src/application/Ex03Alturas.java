package application;

import java.util.Scanner;

public class Ex03Alturas {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n;
        int menorDezesseis = 0;
        double mediaAlturas, porcentagemMenorDezesseis;
        double somaAlturas = 0;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = leitor.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Dados da %dª pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = leitor.next();

            System.out.print("Idade: ");
            idades[i] = leitor.nextInt();

            System.out.print("Altura: ");
            alturas[i] = leitor.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            somaAlturas += alturas[i];

            if (idades[i] < 16) {
                menorDezesseis++;
            }
        }
        mediaAlturas = somaAlturas / n;
        porcentagemMenorDezesseis = ((double)menorDezesseis / n) * 100.00;

        System.out.printf("\nAntura média = %.2f", mediaAlturas);
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%\n", porcentagemMenorDezesseis);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }
        leitor.close();
    }
}
