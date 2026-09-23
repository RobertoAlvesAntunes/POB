package questoes.atividades10.q3.controle;

import questoes.atividades10.q3.domínio.ContaCorrente;
import questoes.atividades10.q3.domínio.SaldoInsuficienteException;

public class ControleConta {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente("001", 1000);

        try {
            conta.sacar(500);
            System.out.println("Saque realizado.");
            System.out.println("Saldo: R$ " + conta.getSaldo());

            conta.sacar(700);
            System.out.println("Saque realizado.");

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}