package questoes.atividades07.q2.controle;

import questoes.atividades07.q2.domínio.ContaBancaria;

public class ControleContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("12345", "João");

        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: " + conta.getSaldo());

        conta.depositar(1000);

        System.out.println("Saldo após depósito: " + conta.getSaldo());

        conta.sacar(300);

        System.out.println("Saldo após saque: " + conta.getSaldo());

        conta.setTitular("Carlos");

        System.out.println("Novo titular: " + conta.getTitular());
    }
}