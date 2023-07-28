package application;

import entities.Ex02Funcionario;

import java.util.Scanner;

public class Ex02App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Ex02Funcionario funcionario = new Ex02Funcionario();

        System.out.println("Digite o nome do funcionário");
        funcionario.name = leitor.nextLine();

        System.out.println("Digite o salário bruto");
        funcionario.grossSalary = leitor.nextDouble();

        System.out.println("Digite a taxa");
        funcionario.tax = leitor.nextDouble();

        System.out.println("Funcionário: " + funcionario);

        System.out.println("Digite o percentual para aumentar o salário");
        funcionario.increaseSalary(leitor.nextDouble());

        System.out.println("Funcionário: " + funcionario);

        leitor.close();
    }
}
