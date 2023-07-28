import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a senha");
        int senha = leitor.nextInt();

        while (senha != 2002){
            System.out.println("Senha Inválida");
            senha = leitor.nextInt();
        }
        System.out.println("Acesso Permitido");

        leitor.close();
    }
}