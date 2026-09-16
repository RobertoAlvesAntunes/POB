package questoes.atividades08.q5.controle;

import questoes.atividades08.q5.domínio.ContaPoupanca;
import questoes.atividades08.q5.domínio.ContaCorrente;

public class ControleConta {

    public static void main(String[] args) {

        ContaPoupanca poupanca = new ContaPoupanca("001", 1000, 5);

        ContaCorrente corrente = new ContaCorrente("002", 500, 1000);

        System.out.println("===== CONTA POUPANÇA =====");

        System.out.println("Saldo: R$ " + poupanca.getSaldo());

        poupanca.aplicarRendimento();

        System.out.println("Saldo após rendimento: R$ " + poupanca.getSaldo());

        poupanca.sacar(200);

        System.out.println("Saldo após saque: R$ " + poupanca.getSaldo());

        System.out.println();

        System.out.println("===== CONTA CORRENTE =====");

        System.out.println("Saldo: R$ " + corrente.getSaldo());

        corrente.sacar(1000);

        System.out.println("Saldo após saque: R$ " + corrente.getSaldo());
    }
}