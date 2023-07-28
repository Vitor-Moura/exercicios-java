package application;

import model.entities.Conta;
import model.exceptions.BusinessException;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.print("Número: ");
        int number = leitor.nextInt();
        System.out.print("Titular: ");
        leitor.nextLine();
        String holder = leitor.nextLine();
        System.out.print("Saldo inicial: ");
        double balance = leitor.nextDouble();
        System.out.print("Limite de saque: ");
        double withdrawLimit = leitor.nextDouble();

        Conta acc = new Conta(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double amount = leitor.nextDouble();

        try {
            acc.saque(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getSaldo());
        }
        catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

        leitor.close();
    }
}
