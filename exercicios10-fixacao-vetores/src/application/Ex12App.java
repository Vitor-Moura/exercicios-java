package application;

import entities.Ex12Pensionato;

import java.util.Scanner;

public class Ex12App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Ex12Pensionato [] vetor = new Ex12Pensionato[10];
        System.out.print("Quantos quartos serão alugados? ");
        int n = leitor.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println();
            System.out.println("Aluguel #" + i + 1 + ":");
            System.out.print("Nome: ");
            leitor.nextLine();
            String name = leitor.nextLine();
            System.out.print("Email: ");
            String email = leitor.nextLine();
            System.out.print("Quarto: ");
            int room = leitor.nextInt();
            vetor[room] = new Ex12Pensionato(name, email);
        }
        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i=0; i<10; i++) {
            if (vetor[i] != null) {
                System.out.println(i + ": " + vetor[i]);
            }
        }
        leitor.close();
    }




}
