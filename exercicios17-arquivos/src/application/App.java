package application;

import entities.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<Produto> items = new ArrayList<>();

        System.out.println("Insira o caminho do arquivo: ");
        String caminhoArquivoEntrada = leitor.nextLine();

        File arquivoEntrada = new File(caminhoArquivoEntrada);
        String caminhoDiretorio = arquivoEntrada.getParent();

        boolean sucesso = new File(caminhoDiretorio + "\\saida").mkdir();

        String caminhoArquivoSaida = caminhoDiretorio + "\\saida\\arquivo-17-saida.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivoEntrada))) {

            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String nome = fields[0];
                double preco = Double.parseDouble(fields[1]);
                int quantidade = Integer.parseInt(fields[2]);

                items.add(new Produto(nome, preco, quantidade));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivoSaida))) {

                for (Produto item : items) {
                    bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(caminhoArquivoSaida + " ARQUIVO CRIADO!");

            } catch (IOException e) {
                System.out.println("Erro ao escrever arquivo: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        leitor.close();
    }
}
