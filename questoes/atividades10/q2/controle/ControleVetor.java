package questoes.atividades10.q2.controle;

import java.util.Scanner;

public class ControleVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] valores = {"10", "25", "abc", "50"};

        try {
            System.out.print("Digite o índice: ");
            int indice = sc.nextInt();

            int numero = Integer.parseInt(valores[indice]);

            System.out.println("Número: " + numero);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice inválido.");

        } catch (NumberFormatException e) {
            System.out.println("O valor não é um número válido.");

        } finally {
            sc.close();
        }
    }
}