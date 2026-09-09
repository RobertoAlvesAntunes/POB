package questoes.atividades06.q4.controle;

import questoes.atividades06.q4.domínio.Funcionario;
import java.text.DecimalFormat;

public class ControleFuncionario {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");

        Funcionario funcionario = new Funcionario("João", "Analista", 3000);

        System.out.println("Salário antes do aumento: R$ " + df.format(funcionario.getSalarioBruto()));

        funcionario.aplicarAumento(10);

        System.out.println("Salário após o aumento: R$ " + df.format(funcionario.getSalarioBruto()));

        System.out.println("Salário líquido: R$ " + 
                df.format(funcionario.calcularSalarioLiquido(500)));
    }
}