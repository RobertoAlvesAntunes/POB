package questoes.atividades04;

import java.util.Scanner;

public class AcimaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] leitura = new double[8];
        double soma = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota: ");
            leitura[i] = sc.nextDouble();
            soma += leitura[i];
        }

        double media = soma / 8;

        for (int i = 0; i < 8; i++) {
            if (leitura[i] > media) {
                System.out.println(leitura[i]);
            }
        }

        sc.close();
    }
}