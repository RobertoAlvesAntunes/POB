package questoes.atividades02;

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int lado1 = sc.nextInt();

        System.out.print("Digite o segundo lado: ");
        int lado2 = sc.nextInt();

        System.out.print("Digite o terceiro lado: ");
        int lado3 = sc.nextInt();

        if ((lado1 + lado2 > lado3) &&
            (lado1 + lado3 > lado2) &&
            (lado2 + lado3 > lado1)) {

            if ((lado1 == lado2) && (lado2 == lado3)) {
                System.out.println("O triângulo é equilátero");
            } else if ((lado1 == lado2) ||
                       (lado1 == lado3) ||
                       (lado2 == lado3)) {
                System.out.println("O triângulo é isósceles");
            } else {
                System.out.println("O triângulo é escaleno");
            }

        } else {
            System.out.println("Os lados não formam um triângulo");
        }

        sc.close();
    }
}
