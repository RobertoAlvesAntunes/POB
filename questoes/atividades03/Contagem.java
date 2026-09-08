package questoes.atividades03;

import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número1: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o número2: ");
        int numero2 = sc.nextInt();

        int contPar = 0;
        int contImpar = 0;

        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }

        System.out.println("Quantidade de pares: " + contPar);
        System.out.println("Quantidade de ímpares: " + contImpar);

        sc.close();
    }
}