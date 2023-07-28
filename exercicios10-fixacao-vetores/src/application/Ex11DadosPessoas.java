package application;

import java.util.Scanner;

public class Ex11DadosPessoas {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n, qtdHomens =0 , qtdMulheres = 0;
        double menorAltura, maiorAltura, alturaFemTotal = 0, alturaFemMedia;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = leitor.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Altura da %dª pessoa: ", i + 1);
            alturas[i] = leitor.nextDouble();
            System.out.printf("Gênero da %dª pessoa: ", i + 1);
            generos[i] = leitor.next().charAt(0);
        }

        menorAltura = alturas[0];
        maiorAltura = alturas[0];

        for (int i=0; i<n; i++) {
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
        }

        for (int i=0; i<n; i++) {
            if (generos[i]=='M') {
                qtdHomens++;
            }
            else {
                qtdMulheres++;
                alturaFemTotal = alturaFemTotal + alturas[i];
            }
        }

        alturaFemMedia = alturaFemTotal / qtdMulheres;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturaFemMedia);
        System.out.printf("Numero de homens = %d\n", qtdHomens);

        leitor.close();
    }
}
