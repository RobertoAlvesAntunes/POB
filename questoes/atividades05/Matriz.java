package questoes.atividades05;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] leitura = new int[3][3];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print("Digite o número: ");
                leitura[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz:");

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(leitura[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}