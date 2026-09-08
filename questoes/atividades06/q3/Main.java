package questoes.atividades06.q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "João";
        conta.numeroConta = "12345";

        conta.consultarSaldo();

        conta.depositar(1000);
        conta.consultarSaldo();

        conta.sacar(300);
        conta.consultarSaldo();

        conta.sacar(800);
        conta.consultarSaldo();

        conta.depositar(-100);

        conta.sacar(-50);

        sc.close();
    }
}
