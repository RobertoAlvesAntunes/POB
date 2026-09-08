package questoes.atividades05;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] leitura = new int[3][4];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print("Digite o número: ");
                leitura[i][j] = sc.nextInt();
            }
        }

        int maior = leitura[0][0];
        int i2 = 0;
        int j2 = 0;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                if (leitura[i][j] > maior) {
                    maior = leitura[i][j];
                    i2 = i;
                    j2 = j;
                }
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Linha: " + i2);
        System.out.println("Coluna: " + j2);

        sc.close();
    }
}