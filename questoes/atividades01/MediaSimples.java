package questoes.atividades01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MediaSimples {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média é: " + df.format(media));

        sc.close();
    }
}
