package questoes.atividades04;

import java.util.Scanner;

public class LeituraInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] leitura = new int[5];

        for (int i = 0; i <= 4; i++) {
            System.out.print("Digite o número: ");
            leitura[i] = sc.nextInt();
        }

        for (int i = 4; i >= 0; i--) {
            System.out.println(leitura[i]);
        }

        sc.close();
    }
}