package application;

import java.util.Scanner;

public class Ex10Aprovados {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n;
        double media;

        System.out.print("Quantos alunos serão digitados? ");
        n = leitor.nextInt();

        String[] nomes = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %dº aluno:\n", i + 1);
            leitor.nextLine();
            nomes[i] = leitor.nextLine();
            notas1[i] = leitor.nextDouble();
            notas2[i] = leitor.nextDouble();
        }

        System.out.println("Alunos aprovados:");

        for (int i=0; i<n; i++) {
            media = (notas1[i] + notas2[i]) / 2;

            if(media >= 6.0) {
                System.out.printf("%s\n", nomes[i]);
            }
        }
        leitor.close();
    }
}
