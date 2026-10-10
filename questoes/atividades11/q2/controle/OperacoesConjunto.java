package questoes.atividades11.q2.controle;

import java.util.HashSet;
import java.util.Scanner;

public class OperacoesConjunto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> turmaA = new HashSet<Integer>();
        HashSet<Integer> turmaB = new HashSet<Integer>();

        System.out.print("Quantos códigos serão informados para a turma A? ");
        int quantidadeA = sc.nextInt();

        for (int i = 0; i < quantidadeA; i++) {
            System.out.print("Digite o código da turma A: ");
            int codigo = sc.nextInt();
            turmaA.add(codigo);
        }

        System.out.print("\nQuantos códigos serão informados para a turma B? ");
        int quantidadeB = sc.nextInt();

        for (int i = 0; i < quantidadeB; i++) {
            System.out.print("Digite o código da turma B: ");
            int codigo = sc.nextInt();
            turmaB.add(codigo);
        }

        HashSet<Integer> uniao = new HashSet<Integer>();
        uniao.addAll(turmaA);
        uniao.addAll(turmaB);

        HashSet<Integer> intersecao = new HashSet<Integer>();
        intersecao.addAll(turmaA);
        intersecao.retainAll(turmaB);

        System.out.println("\nCódigos da turma A: " + turmaA);
        System.out.println("Códigos da turma B: " + turmaB);
        System.out.println("União das turmas: " + uniao);
        System.out.println("Interseção das turmas: " + intersecao);

        sc.close();
    }
}