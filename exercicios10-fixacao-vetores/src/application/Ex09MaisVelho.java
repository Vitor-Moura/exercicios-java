package application;

import java.util.Scanner;

public class Ex09MaisVelho {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n;
        int idadeMaior = 0;
        int posicaoMaior = 0;

        System.out.print("Quantas pessoas você vai digitar? ");
        n = leitor.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Dados da %dª pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = leitor.next();
            System.out.print("Idade: ");
            idades[i] = leitor.nextInt();
        }

        for (int i=0; i<n; i++) {
            if (idades[i] > idadeMaior) {
                idadeMaior = idades[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaoMaior]);

        leitor.close();
    }
}
