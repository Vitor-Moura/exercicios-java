import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        int n, linha, quandrado, cubo;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas");
        n = leitor.nextInt();

        for (int i = 1; i <= n; i++) {
               linha = i;
               quandrado = i * i;
               cubo = i * i * i;

            System.out.printf("%d %d %d\n", linha, quandrado, cubo);
        }
        leitor.close();
    }
}
