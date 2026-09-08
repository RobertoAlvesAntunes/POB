package questoes.atividades02;

import java.util.Scanner;

public class SituacaoAluno {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7){
            System.out.println("Aluno aprovado ");
        } else if (media<=6.9&&media>=5){
            System.out.println("Aluno em recuperação ");
        }else
        {
             System.out.println("Aluno reprovado ");
        }

        sc.close();
    }
}