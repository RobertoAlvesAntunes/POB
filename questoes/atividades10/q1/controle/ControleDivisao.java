package questoes.atividades10.q1.controle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleDivisao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int numero1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int numero2 = sc.nextInt();

            int resultado = numero1 / numero2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero.");

        } catch (InputMismatchException e) {
            System.out.println("Digite apenas números inteiros.");

        } finally {
            System.out.println("Operação finalizada.");
            sc.close();
        }
    }
}