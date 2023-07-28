import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        int n;
        double numerador = 0;
        double denominador = 0;


        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de operações");
        n = leitor.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o numerador da %dª operação\n", i + 1);
            numerador = leitor.nextDouble();
            System.out.printf("Digite o denominador da %dª operação\n", i + 1);
            denominador = leitor.nextDouble();

            if (denominador == 0) {
                System.out.println("divisão impossível");
            } else {
                System.out.println(numerador / denominador);
            }
        }
        leitor.close();
    }
}
