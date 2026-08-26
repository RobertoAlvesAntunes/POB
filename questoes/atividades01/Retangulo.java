package questoes.atividades01;

import java.util.Scanner;

public class Retangulo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = sc.nextInt();
        System.out.print("Digite a altura: ");
        int altura = sc.nextInt();

        int area = base * altura;

        int perimetro = 2 * (base + altura);

        System.out.println("A area é: " + area);
        System.out.println("O perímetro é: " + perimetro);
        sc.close();
    }
}