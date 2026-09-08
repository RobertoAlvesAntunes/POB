package questoes.atividades05;

import java.util.Scanner;

public class Transposta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] leitura = new int[2][3];
        int[][] transposta = new int[3][2];

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print("Digite o número: ");
                leitura[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                transposta[j][i] = leitura[i][j];
            }
        }

        System.out.println("Matriz transposta:");

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}