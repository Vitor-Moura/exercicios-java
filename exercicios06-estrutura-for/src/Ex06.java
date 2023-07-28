import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        int n;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número para saber ses divisores");
        n = leitor.nextInt();

        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        leitor.close();
    }
}
