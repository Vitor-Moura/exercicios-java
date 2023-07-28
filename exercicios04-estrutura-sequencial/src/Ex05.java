import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        int cdPeca1, cdPeca2, qtdPeca1, qtdPeca2;
        double valorPeca1, valorPeca2, total;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o código da peça 1");
        cdPeca1 = leitor.nextInt();
        System.out.println("Digite a quantidade da peça 1");
        qtdPeca1 = leitor.nextInt();
        System.out.println("Digite o valor unitário da peça 1");
        valorPeca1 = leitor.nextDouble();

        System.out.println("Digite o código da peça 2");
        cdPeca2 = leitor.nextInt();
        System.out.println("Digite a quantidade da peça 2");
        qtdPeca2 = leitor.nextInt();
        System.out.println("Digite o valor unitário da peça 2");
        valorPeca2 = leitor.nextDouble();

        total = qtdPeca1 * valorPeca1 + qtdPeca2 * valorPeca2;

        System.out.printf("VALOR A PARAR: R$ %.2f", total);
    }
}
