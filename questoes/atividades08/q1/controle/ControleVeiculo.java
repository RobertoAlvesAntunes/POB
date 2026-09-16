package questoes.atividades08.q1.controle;

import questoes.atividades08.q1.domínio.Carro;
import questoes.atividades08.q1.domínio.Moto;

public class ControleVeiculo {

    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 4);

        Moto moto = new Moto("Honda", "CB 500", 500);

        System.out.println("===== CARRO =====");
        carro.exibirDetalhes();

        System.out.println();

        System.out.println("===== MOTO =====");
        moto.exibirDetalhes();
    }
}