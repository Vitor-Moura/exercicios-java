import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        int A, B, C, D, diferenca;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        A = leitor.nextInt();
        System.out.println("Digite o valor de B");
        B = leitor.nextInt();
        System.out.println("Digite o valor de C");
        C = leitor.nextInt();
        System.out.println("Digite o valor de D");
        D = leitor.nextInt();

        diferenca = A * B - C * D;

        System.out.printf("Resultado = %d", diferenca);
    }
}
