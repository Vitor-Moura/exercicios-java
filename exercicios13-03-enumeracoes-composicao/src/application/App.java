package application;

import model.entities.Cliente;
import model.entities.ItemDoPedido;
import model.entities.Pedido;
import model.entities.Produto;
import model.enums.StatusDoPedido;

import java.sql.SQLClientInfoException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ParseException {

        Scanner leitor = new Scanner(System.in);
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Insira os dados do cliente:");
        System.out.print("Nome: ");
        String nome = leitor.nextLine();
        System.out.print("Email: ");
        String email = leitor.next();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date dataNascimento = formatoData.parse(leitor.next());

        Cliente cliente = new Cliente(nome, email, dataNascimento);

        System.out.println("Insira os dados do pedido:");
        System.out.print("Status: ");
        StatusDoPedido status = StatusDoPedido.valueOf(leitor.next());

        Pedido pedido = new Pedido(new Date(), status, cliente);

        System.out.print("Quantos items tem esse pedido? ");
        int n = leitor.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("Insira os dados do item #" + i + ":");
            System.out.print("Nome do produto: ");
            leitor.nextLine();
            String productName = leitor.nextLine();
            System.out.print("Preço do produto: ");
            double precoProduto = leitor.nextDouble();

            Produto product = new Produto(productName, precoProduto);

            System.out.print("Quantidade: ");
            int quantidade = leitor.nextInt();

            ItemDoPedido itemDoPedido = new ItemDoPedido(quantidade, precoProduto, product);

            pedido.adicionaItem(itemDoPedido);
        }

        System.out.println();
        System.out.println("RESUMO DO PEDIDO:");
        System.out.println(pedido);

        leitor.close();
    }
}
