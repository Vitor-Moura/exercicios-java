import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        int A, B;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor inteira de A");
        A = leitor.nextInt();
        System.out.println("Digite o valor inteira de B");
        B = leitor.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São Múltiplos");
        }
        else {
            System.out.println("Não são Múltiplos");
        }
    }
}
