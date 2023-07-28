package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<Contribuinte> contribuintes = new ArrayList<>();

        System.out.print("Insira a quantidade de contibuintes: ");
        int n = leitor.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Dados do contribuinte #" + i + ":");
            System.out.print("Pessoa física ou jurídica (pf/pj)? ");
            leitor.nextLine();
            String tipo = leitor.nextLine();
            System.out.print("Nome: ");
            String nome = leitor.nextLine();
            System.out.print("Renda anual: ");
            double renda = leitor.nextDouble();
            if (tipo.equalsIgnoreCase("pf")) {
                System.out.print("Gastos com saúde: ");
                double gastosComSaude = leitor.nextDouble();
                contribuintes.add(new PessoaFisica(nome, renda, gastosComSaude));
            }
            else {
                System.out.print("Quantidade de funcionários: ");
                int qtdFuncionarios = leitor.nextInt();
                contribuintes.add(new PessoaJuridica(nome, renda, qtdFuncionarios));
            }
        }

        double soma = 0.0;
        System.out.println();
        System.out.println("IMPOSTO PAGO:");
        for (Contribuinte c : contribuintes) {
            double imposto = c.imposto();
            System.out.println(c.getNome() + ": $ " + String.format("%.2f", imposto));
            soma += imposto;
        }

        System.out.println();
        System.out.println("TOTAL DE IMPOSTOS: $ " + String.format("%.2f", soma));

        leitor.close();
    }
}
