import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int x, y;

        System.out.println("Digite o valor de x");
        x = leitor.nextInt();
        System.out.println("Digite o valor de y");
        y = leitor.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }

            System.out.println("Digite o valor de x");
            x = leitor.nextInt();
            System.out.println("Digite o valor de y");
            y = leitor.nextInt();
        }

        leitor.close();
    }
}
