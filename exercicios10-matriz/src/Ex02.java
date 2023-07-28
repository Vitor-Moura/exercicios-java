import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int m = leitor.nextInt();
        int n = leitor.nextInt();
        int[][] matriz = new int[m][n];

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }

        int x = leitor.nextInt();

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Posição " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Direita: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Baixo: " + matriz[i+1][j]);
                    }
                }
            }
        }

        leitor.close();
    }
}
