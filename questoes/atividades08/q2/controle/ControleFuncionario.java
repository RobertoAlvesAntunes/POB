package questoes.atividades08.q2.controle;

import questoes.atividades08.q2.domínio.Funcionario;
import questoes.atividades08.q2.domínio.Gerente;
import questoes.atividades08.q2.domínio.Vendedor;

public class ControleFuncionario {

    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Funcionario("João", 2000);
        funcionarios[1] = new Gerente("Maria", 4000, 1000);
        funcionarios[2] = new Vendedor("Carlos", 2000, 10000, 5);

        double folhaTotal = 0;

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: R$ " + funcionario.calcularSalario());
            System.out.println();

            folhaTotal += funcionario.calcularSalario();
        }

        System.out.println("Folha total: R$ " + folhaTotal);
    }
}