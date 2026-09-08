package questoes.atividades03;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;

        while (numero != 2026) {
            System.out.print("Digite o número: ");
            numero = sc.nextInt();

            if (numero != 2026) {
                System.out.println("Senha Incorreta! Tente novamente.");
            }
        }

        System.out.println("Acesso Permitido!");

        sc.close();
    }
}