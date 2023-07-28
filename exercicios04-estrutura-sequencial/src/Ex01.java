import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int valor1, valor2, total;

        System.out.println("Digite o primeiro valor");
        valor1 = leitor.nextInt();
        System.out.println("Digite o segundo valor");
        valor2 = leitor.nextInt();

        total = valor1 + valor2;

        System.out.printf("O resultado de %d + %d é %d", valor1, valor2, total);
    }
}