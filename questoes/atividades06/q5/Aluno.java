package questoes.atividades06.q5;

public class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarAprovacao() {
        if (calcularMedia() > 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public void imprimirBoletim() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média final: " + calcularMedia());
        System.out.println("Situação: " + verificarAprovacao());
    }
}
