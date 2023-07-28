package application;

import entities.Ex01Conta;

import java.util.Scanner;

public class Ex01App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Ex01Conta conta;

        System.out.println("Digite o número da conta");
        int numero = leitor.nextInt();
        System.out.println("Digite o nome do titular");
        leitor.nextLine();
        String titular = leitor.nextLine();

        System.out.println("Gostaria de fazer um depósito inicial (S/N)?");
        char opcaoDigitada = leitor.next().charAt(0);
        if (Character.toUpperCase(opcaoDigitada) == 'S') {
            System.out.print("Digite o valor do depósito: ");
            double depositoInicial = leitor.nextDouble();
            conta = new Ex01Conta(numero, titular, depositoInicial);
        }
        else {
            conta = new Ex01Conta(numero, titular);
        }


        System.out.println("\nDados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor do depósito: ");
        double depositValue = leitor.nextDouble();
        conta.depositar(depositValue);
        System.out.println("Dados atualizados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor do saque: ");
        double withdrawValue = leitor.nextDouble();
        conta.sacar(withdrawValue);
        System.out.println("Dados atualizados da conta:");
        System.out.println(conta);

        leitor.close();
    }
}
