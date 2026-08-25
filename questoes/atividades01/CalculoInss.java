package questoes.atividades01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoInss {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite o valor da hora de trabalho: ");
        double valor = sc.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horas = sc.nextInt();

        double bruto = valor * horas;

        double taxa = bruto * 0.10;

        double liquido = bruto - taxa;

        System.out.println("Salário bruto: R$ " + df.format(bruto));
        System.out.println("Salário liquido: R$ " + df.format(liquido));
        sc.close();
    }
}