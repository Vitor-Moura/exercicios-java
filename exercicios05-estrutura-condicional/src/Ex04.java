import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        int horaInicial, horaFinal, duracao;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a hora inicial do jogo");
        horaInicial = leitor.nextInt();
        System.out.println("Digite a hora final do jogo");
        horaFinal = leitor.nextInt();

        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);

    }
}
