package questoes.atividades07.q5.controle;

import questoes.atividades07.q5.domínio.Funcionario;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João", "12345", 3000);

        funcionario.exibirDados();

        System.out.println();

        funcionario.setSalario(3500);

        funcionario.exibirDados();

        System.out.println();

        funcionario.setSalario(3000);

        funcionario.exibirDados();
    }
}