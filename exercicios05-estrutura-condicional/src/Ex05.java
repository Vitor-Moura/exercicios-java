import java.awt.*;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        int codigo, quantidade;
        double total;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o código do ítem");
        codigo = leitor.nextInt();
        System.out.println("Digite a quantidade de ítens");
        quantidade = leitor.nextInt();

        if (codigo == 1) {
            total = quantidade * 4.00;
        } else if (codigo == 2) {
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00;
        } else if (codigo == 4) {
            total = quantidade * 2.00;
        } else {
            total = quantidade * 1.50;
        }
        System.out.printf("Total: R$ %.2f", total);
    }
}