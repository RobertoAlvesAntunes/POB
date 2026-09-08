package questoes.atividades05;

import java.util.Scanner;

public class diagonalPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] leitura = new double[4][4];

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print("Digite o número: ");
                leitura[i][j] = sc.nextDouble();
            }
        }

        double soma = 0;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (i == j) {
                    soma += leitura[i][j];
                }
            }
        }

        System.out.print(soma);

        sc.close();
    }
}