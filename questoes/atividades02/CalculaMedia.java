package questoes.atividades02;

import java.util.Scanner;

public class ParOuImpar {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        
        
        if (numero % 2 ==0){
            System.out.println("O número é par ");
        } else {
            System.out.println("O número é impar ");
        }

        sc.close();
    }
}