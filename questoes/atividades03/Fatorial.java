package questoes.atividades03;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long soma = 1;

        System.out.print("Digite o número1: ");
        int numero1 = sc.nextInt();

        for (int i = numero1; i > 0; i--) {
            soma = soma * i;
        }

        System.out.println(soma);

        sc.close();
    }
}