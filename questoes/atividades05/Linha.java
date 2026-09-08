package questoes.atividades05;

import java.util.Scanner;

public class Linha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] leitura = new int[4][3];
        int[] linha = new int[4];

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print("Digite o número: ");
                leitura[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 2; j++) {
                linha[i] += leitura[i][j];
            }
        }

        for (int i = 0; i <= 3; i++) {
            System.out.println(linha[i]);
        }

        sc.close();
    }
}