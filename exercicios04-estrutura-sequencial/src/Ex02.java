import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        double raio, area;
        double pi = 3.14159;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do raio");
        raio = leitor.nextDouble();

        area = pi * Math.pow(raio, 2);

        System.out.printf("A área do círculo é de %.4f", area);

    }
}
