package questoes.atividades02;

import java.util.Scanner;

public class ParOuImpar {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int numero = sc.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("O número é par ");
        } else {
            System.out.println("O número é impar ");
        }

        sc.close();
    }
}