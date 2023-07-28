import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        int n, valorDigitado;
        int qtdXIn = 0;
        int qtdXOut = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de valores inteiros a ser analisada");
        n = leitor.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %d° valor inteiro\n", i+1);
            valorDigitado = leitor.nextInt();

            if (valorDigitado >= 10 && valorDigitado <= 20) {
                qtdXIn++;
            }
            else {
                qtdXOut++;
            }
        }
        System.out.printf("%d in\n%d out", qtdXIn, qtdXOut);

        leitor.close();
    }
}
