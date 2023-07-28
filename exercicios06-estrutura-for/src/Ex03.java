import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        int n;

        double valorReal1 = 0;
        double valorReal2 = 0;
        double valorReal3 = 0;


        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de testes");
        n = leitor.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um valor real com uma casa decimal para o %d° teste\n", i+1);
            valorReal1 = leitor.nextDouble();
            System.out.printf("Digite um valor real com uma casa decimal para o %d° teste\n", i+1);
            valorReal2 = leitor.nextDouble();
            System.out.printf("Digite um valor real com uma casa decimal para o %d° teste\n", i+1);
            valorReal3 = leitor.nextDouble();

            double media = (valorReal1 * 2.0 + valorReal2 * 3.0 + valorReal3 * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }
        leitor.close();
    }
}
