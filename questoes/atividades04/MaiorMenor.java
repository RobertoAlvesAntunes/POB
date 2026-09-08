package questoes.atividades04;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] leitura = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número: ");
            leitura[i] = sc.nextInt();
        }

        int maior = leitura[0];
        int menor = leitura[0];

        int posMaior = 0;
        int posMenor = 0;

        for (int i = 1; i < 10; i++) {
            if (leitura[i] > maior) {
                maior = leitura[i];
                posMaior = i;
            }

            if (leitura[i] < menor) {
                menor = leitura[i];
                posMenor = i;
            }
        }

        System.out.println(maior);
        System.out.println(posMaior);
        System.out.println(menor);
        System.out.println(posMenor);

        sc.close();
    }
}