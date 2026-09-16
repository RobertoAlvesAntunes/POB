package questoes.atividades09.q4.controle;

import java.util.ArrayList;
import java.util.List;

import questoes.atividades09.q4.domínio.ContaBancaria;
import questoes.atividades09.q4.domínio.ContaCorrente;
import questoes.atividades09.q4.domínio.ContaEmpresarial;

public class ControleConta {

    public static void main(String[] args) {

        List<ContaBancaria> contas = new ArrayList<>();

        contas.add(new ContaCorrente("001", 1000));
        contas.add(new ContaEmpresarial("002", 2000));

        System.out.println("===== ANTES DA TAXA =====");

        for (ContaBancaria conta : contas) {
            conta.consultarSaldo();
        }

        for (ContaBancaria conta : contas) {
            conta.cobrarTaxaMensal();
        }

        System.out.println("\n===== APÓS A TAXA =====");

        for (ContaBancaria conta : contas) {
            conta.consultarSaldo();
        }
    }
}