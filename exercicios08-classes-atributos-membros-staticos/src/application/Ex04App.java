package application;

import util.Ex04CurrencyConverter;

import java.util.Scanner;

public class Ex04App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da cotação do dolar");
        double cotacao = leitor.nextDouble();
        System.out.println("Digite a quantidade de dolares desejada");
        double qtdDolar = leitor.nextDouble();

        System.out.printf("O valor para comprar %.2f dólares é de %.2f reais",
                qtdDolar, Ex04CurrencyConverter.conversao(cotacao, qtdDolar));
    }
}
