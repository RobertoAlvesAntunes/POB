package questoes.atividades06.q5;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.nome = "João";
        aluno.matricula = "12345";
        aluno.nota1 = 8;
        aluno.nota2 = 7.5;

        aluno.imprimirBoletim();
    }
}
