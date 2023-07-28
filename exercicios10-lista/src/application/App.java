package application;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n;
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionários você quer registrar? ");
        n = leitor.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Funcionário #" + i + 1 + ": ");
            System.out.print("Id: ");
            int id = leitor.nextInt();
            while (existeId(funcionarios, id)) {
                System.out.println("Esse id já existe. Tente novamente: ");
                id = leitor.nextInt();
            }

            System.out.print("Nome: ");
            leitor.nextLine();
            String nome = leitor.nextLine();
            System.out.print("Salario: ");
            double salario = leitor.nextDouble();

            funcionarios.add(new Funcionario(id, nome, salario));
        }

        // Atualizando salário
        System.out.println();
        System.out.print("Informe o id do funcionário que terá aumento salarial: ");
        int id = leitor.nextInt();
        Funcionario f = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (f == null) {
            System.out.println("Esse id não existe!");
        }
        else {
            System.out.print("Digite a porcentagem: ");
            double porcentagem = leitor.nextDouble();
            f.aumentarSalario(porcentagem);
        }

        // Listando funcionários
        System.out.println();
        System.out.println("Lista de funcioários:");
        for (Funcionario fun : funcionarios) {
            System.out.println(fun);
        }
        leitor.close();
    }

    public static boolean existeId(List<Funcionario> list, int id) {
        Funcionario f = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return f != null;
    }
}