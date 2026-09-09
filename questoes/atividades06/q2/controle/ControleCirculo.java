package questoes.atividades06.q2.controle;

import questoes.atividades06.q2.domínio.Circulo;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ControleCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        Circulo circulo = new Circulo(raio);

        System.out.println("Área: " + df.format(circulo.calcularArea()));
        System.out.println("Perímetro: " + df.format(circulo.calcularPerimetro()));

        sc.close();
    }
}