package questoes.atividades06.q5.controle;

import questoes.atividades06.q5.domínio.Aluno;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("João", "12345", 8, 7.5);

        aluno.imprimirBoletim();
    }
}