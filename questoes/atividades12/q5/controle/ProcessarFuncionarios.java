package questoes.atividades12.q5.controle;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import questoes.atividades12.q5.dominio.Funcionario;

public class ProcessarFuncionarios {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        funcionarios.add(new Funcionario("Ana", "TI", 3500.00));
        funcionarios.add(new Funcionario("Carlos", "Vendas", 2800.00));
        funcionarios.add(new Funcionario("Beatriz", "TI", 4200.00));
        funcionarios.add(new Funcionario("Pedro", "RH", 3000.00));
        funcionarios.add(new Funcionario("Mariana", "TI", 5000.00));
        funcionarios.add(new Funcionario("João", "Vendas", 3200.00));

        Predicate<Funcionario> filtroTI =
                funcionario -> funcionario.getDepartamento().equals("TI");

        Function<Funcionario, Double> reajuste =
                funcionario -> funcionario.getSalario() * 1.10;

        Consumer<Double> imprimir =
                salario -> System.out.printf("Salário projetado: R$ %.2f%n", salario);

        funcionarios.stream()
                .filter(filtroTI)
                .map(reajuste)
                .forEach(imprimir);
    }
}