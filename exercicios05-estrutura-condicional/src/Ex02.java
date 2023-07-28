import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        int numero;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        numero = leitor.nextInt();

        if (numero %2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
