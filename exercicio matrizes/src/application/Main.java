package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [][] mat = new int[n][n];

        for (int i=0; i<n; i++) { // for para percorrer as linhas
            for (int j=0; j<n; j++) {  // for para percorrer cada elemento da coluna e preencher a matriz
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i<n; i++) {
            System.out.print(mat[i][i] + " "); // pegando o número da linha i e da coluna i e imprimindo no terminal
            /*
          0  5 -3 10
          1  15 8 2
          2  7 9 -4
             */
        }

        System.out.println();

        int countNegativeNumbers = 0;
        for (int i=0; i<n; i++) {     // for para percorrer as linhas
            for (int j=0; j<n; j++) { // for para percorrer cada elemento da coluna
                if (mat[i][j] < 0) {  // se o elemento da matriz "mat" na linha i e na coluna j for menor que 0
                    countNegativeNumbers++; // variavel "countNegativeNumbers é incrementada
                }
            }
        }

        System.out.println("Negative numbers = " + countNegativeNumbers);

        scanner.close();

    }
}

