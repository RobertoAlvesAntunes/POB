package questoes.atividades02;

import java.util.Scanner;

public class MaiorTres { 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiro = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundo = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int terceiro = sc.nextInt();

        if (primeiro>segundo && primeiro>terceiro){
            System.out.println("O maior número é " + primeiro);
        } else if (segundo>primeiro && segundo>terceiro){
            System.out.println("O maior número é " + segundo);
        }else
        {
             System.out.println("O maior número é " + terceiro);
        }

        sc.close();
    }
}
