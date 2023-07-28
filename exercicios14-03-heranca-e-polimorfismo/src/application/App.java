package application;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<Forma> formas = new ArrayList<>();

        System.out.print("Digite a quantidade de formas: ");
        int n = leitor.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Dados da forma #" + i + ":");
            System.out.print("Retangulo ou círculo (r/c)? ");
            char tipo = leitor.next().charAt(0);
            System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
            Cor cor = Cor.valueOf(leitor.next());
            if (tipo == 'r') {
                System.out.print("Largura: ");
                double largura = leitor.nextDouble();
                System.out.print("Altura: ");
                double altura = leitor.nextDouble();
                formas.add(new Retangulo(cor, largura, altura));
            }
            else {
                System.out.print("Raio: ");
                double raio = leitor.nextDouble();
                formas.add(new Circulo(cor, raio));
            }
        }

        System.out.println();
        System.out.println("ÁREAS DAS FORMAS:");
        for (Forma area : formas) {
            System.out.println(String.format("%.2f", area.area()));
        }

        leitor.close();
    }
}
