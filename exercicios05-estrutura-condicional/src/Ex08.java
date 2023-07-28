import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        double salario, imposto = 0.00;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do salário");
        salario = leitor.nextDouble();

        if (salario <= 2000.0) {
            System.out.println("Isento");;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        System.out.printf("R$ %.2f", imposto);

    }
}
