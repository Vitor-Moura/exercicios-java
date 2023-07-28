import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        int numero;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        numero = leitor.nextInt();

        if (numero >= 0){
            System.out.println("NÃO NEGATIVO");
        } else{
            System.out.println("NEGATIVO");
        }
    }
}