package application;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Insira o número de funcionários: ");
        int n = leitor.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Dados do funcionário #" + i + ":");
            System.out.print("Terceirizado (s/n)? ");
            char ch = leitor.next().charAt(0);
            System.out.print("Nome: ");
            leitor.nextLine();
            String nome = leitor.nextLine();
            System.out.print("Horas: ");
            int horas = leitor.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = leitor.nextDouble();
            if (ch == 's') {
                System.out.print("Cobrança adicional: ");
                double cobrancaAdicional = leitor.nextDouble();
                funcionarios.add(new FuncionarioTerceirizado(nome, horas, valorPorHora, cobrancaAdicional));
            }
            else {
                funcionarios.add(new Funcionario(nome, horas, valorPorHora));
            }
        }

        System.out.println();
        System.out.println("PAGAMENTOS:");
        for (Funcionario fun : funcionarios) {
            System.out.println(fun.getNome() + " - $ " + String.format("%.2f", fun.pagamento()));
        }

        leitor.close();
    }
}
