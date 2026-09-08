package questoes.atividades04;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] leitura = new int[10];
        int[] par = new int[10];
        int[] impar = new int[10];

        for (int i = 0; i <= 9; i++) {
            System.out.print("Digite o número: ");
            leitura[i] = sc.nextInt();
        }

        int j = 0, k = 0;

        for (int i = 0; i <= 9; i++) {
            if (leitura[i] % 2 == 0) {
                par[j] = leitura[i];
                j++;
            } else {
                impar[k] = leitura[i];
                k++;
            }
        }

        System.out.println("Números pares:");

        for (int i = 0; i < j; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.println();

        System.out.println("Números ímpares:");

        for (int i = 0; i < k; i++) {
            System.out.print(impar[i] + " ");
        }

        sc.close();
    }
}