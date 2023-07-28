import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        A = leitor.nextDouble();
        System.out.println("Digite o segundo valor");
        B = leitor.nextDouble();
        System.out.println("Digite o terceiro valor");
        C = leitor.nextDouble();

        triangulo = A * C / 2;
        circulo = 3.14159 * Math.pow(C, 2);
        trapezio = (A + B) / 2 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
    }
}
