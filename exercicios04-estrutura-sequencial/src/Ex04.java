import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        int funcionarioNumero, horasTrabalhadas;
        double valorHora, salario;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número do funcionário");
        funcionarioNumero = leitor.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas");
        horasTrabalhadas = leitor.nextInt();

        System.out.println("Digite o valor recebido por hora trabalhada");
        valorHora = leitor.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.printf("\nNUMBER = %d" +
                "\nSALARY = US %.2f", funcionarioNumero,salario);
    }
}
