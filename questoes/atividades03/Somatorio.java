package questoes.atividades03;

import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int soma = 0;
        int numero = 0;

        while (numero >= 0) {
            System.out.print("Digite o número: ");
            numero = sc.nextInt();

            if (numero >= 0) {
                cont++;
                soma += numero;
            }
        }

        System.out.println(cont);
        System.out.println(soma);
        System.out.println((double) soma / cont);

        sc.close();
    }
}
