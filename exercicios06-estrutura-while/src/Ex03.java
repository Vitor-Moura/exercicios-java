import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int codigo;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite um código de produto");
        codigo = leitor.nextInt();

            while (codigo != 4) {

                if (codigo == 1) {
                    alcool++;
                } else if (codigo == 2) {
                    gasolina++;
                } else if (codigo == 3) {
                    diesel++;
                }

                if (codigo < 1 || codigo > 4) {
                    System.out.println("Digite um código válido");
                } else {
                    System.out.println("Digite um código novamente");
                }
                codigo = leitor.nextInt();
            }
            System.out.printf("MUITO OBRIGADO\n" +
                            "Alcool: %d\n" +
                            "Gasolina: %d\n" +
                            "Diesel: %d\n",
                    alcool, gasolina, diesel);
    }
}
