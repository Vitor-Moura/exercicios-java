package application;

import entities.Ex01Retangulo;

import java.util.Scanner;

public class Ex01App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Ex01Retangulo retangulo = new Ex01Retangulo();

        System.out.println("Digite a largura do retângulo");
        retangulo.width = leitor.nextDouble();

        System.out.println("Digite a altura do retângulo");
        retangulo.height = leitor.nextDouble();

        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETER = %.2f%n", retangulo.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());

        leitor.close();
    }
}
