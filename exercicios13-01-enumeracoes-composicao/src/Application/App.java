package Application;

import entities.ContratoDeHoras;
import entities.Departamento;
import entities.Funcionario;
import entities.enums.NivelFuncionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ParseException {

        Scanner leitor = new Scanner(System.in);
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Insira o nome do departamento: ");
        String nomeDepartamento = leitor.nextLine();
        System.out.println("Insira os dados do funcionário:");
        System.out.print("Nome: ");
        String nomeFuncionario = leitor.nextLine();
        System.out.print("Nível: ");
        String nivelFuncionario = leitor.nextLine();
        System.out.print("Salário base: ");
        double salarioBase = leitor.nextDouble();
        Funcionario funcionario = new Funcionario(nomeFuncionario, NivelFuncionario.valueOf(nivelFuncionario),
                                        salarioBase, new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos terá esse funcionário? ");
        int n = leitor.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Digite o dados do contrato #" + i + ":");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataDoContrato = formatoData.parse(leitor.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = leitor.nextDouble();
            System.out.print("Duração (horas): ");
            int qtdHoras = leitor.nextInt();
            ContratoDeHoras contract = new ContratoDeHoras(dataDoContrato, valorPorHora, qtdHoras);
            funcionario.adicionaContrato(contract);
        }

        System.out.println();
        System.out.print("Insira mês e ano para calcular a renda (MM/YYYY): ");
        String mesEAno = leitor.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
        System.out.println("Renda em " + mesEAno + ": " + String.format("%.2f", funcionario.renda(mes, ano)));

        leitor.close();
    }
}