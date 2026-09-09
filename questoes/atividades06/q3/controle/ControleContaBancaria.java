package questoes.atividades06.q3.controle;

import questoes.atividades06.q3.domínio.ContaBancaria;

public class ControleContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("João", "12345");

        conta.consultarSaldo();

        conta.depositar(1000);
        conta.consultarSaldo();

        conta.sacar(300);
        conta.consultarSaldo();

        conta.sacar(800);
        conta.consultarSaldo();

        conta.depositar(-100);

        conta.sacar(-50);

        conta.consultarSaldo();
    }
}