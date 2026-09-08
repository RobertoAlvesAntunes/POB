package questoes.atividades04;

import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] leitura = new int[6];

        for (int i = 0; i <= 5; i++) {
            System.out.print("Digite o número: ");
            leitura[i] = sc.nextInt();
        }

        System.out.print("Digite o número de busca: ");
        int numeroBusca = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i <= 5; i++) {
            if (leitura[i] == numeroBusca) {
                System.out.println("O número está no vetor na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O número não está no vetor.");
        }

        sc.close();
    }
}