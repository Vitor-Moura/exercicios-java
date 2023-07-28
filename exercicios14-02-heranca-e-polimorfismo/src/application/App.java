package application;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.print("Digite o número de produtos: ");
        int n = leitor.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Datos do produto #" + i + ":");
            System.out.print("Comum, usado, importado (c/u/i)? ");
            char tipo = leitor.next().charAt(0);
            System.out.print("Nome: ");
            leitor.nextLine();
            String nome = leitor.nextLine();
            System.out.print("Preço: ");
            double preco = leitor.nextDouble();
            if (tipo == 'c') {
                list.add(new Produto(nome, preco));
            }
            else if (tipo == 'u') {
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                LocalDate data = LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new ProdutoUsado(nome, preco, data));
            }
            else {
                System.out.print("Taxa de importação: ");
                double taxaAlfandegaria = leitor.nextDouble();
                list.add(new ProdutoImportado(nome, preco, taxaAlfandegaria));
            }
        }

        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        for (Produto prod : list) {
            System.out.println(prod.etiquetaDePreco());
        }

        leitor.close();
    }

}
