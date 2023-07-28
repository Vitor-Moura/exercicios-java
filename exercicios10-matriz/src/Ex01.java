import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        int[][] matriz = new int[n][n];

//        for (int i=0; i<n; i++) {
//            for (int j=0; j<n; j++) {
//                matriz[i][j] = leitor.nextInt();
//            }
//        }

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }

        System.out.println("Diagonal:");
        for (int i=0; i<matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        int contador = 0;
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    contador++;
                }
            }
        }
        System.out.println("Números negativos = " + contador);

        leitor.close();
    }
}
