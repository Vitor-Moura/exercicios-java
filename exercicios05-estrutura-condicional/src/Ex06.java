import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        double valorDigitado;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor qualquer");
        valorDigitado = leitor.nextDouble();

        if (valorDigitado < 0.0 || valorDigitado > 100.0) {
            System.out.println("Fora de intervalo");
        } else if (valorDigitado <= 25 ) {
            System.out.println("Intervalo (0, 25)");
        } else if (valorDigitado <= 50 ) {
            System.out.println("Intervalo (25, 50)");
        } else if (valorDigitado <= 75) {
            System.out.println("Intervalo (50, 75)");
        } else {
            System.out.println("Intervalo (75, 100)");
        }
    }
}
