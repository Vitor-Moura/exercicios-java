import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        int n;
        int fatorial = 1;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número para saber seu fatorial");
        n = leitor.nextInt();

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);

        leitor.close();
    }
}
