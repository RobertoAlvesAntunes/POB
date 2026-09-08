package questoes.atividades06.q4;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "João";
        funcionario.cargo = "Analista";
        funcionario.salarioBruto = 3000;

        System.out.println("Salário antes do aumento: R$ " + funcionario.salarioBruto);

        funcionario.aplicarAumento(10);

        System.out.println("Salário após o aumento: R$ " + funcionario.salarioBruto);

        double salarioLiquido = funcionario.calcularSalarioLiquido(500);

        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}
