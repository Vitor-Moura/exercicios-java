import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        double x, y;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de x");
        x = leitor.nextDouble();
        System.out.println("Digite o valor de y");
        y = leitor.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x == 0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0) {
            System.out.println("Eixo X");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }
    }
}
