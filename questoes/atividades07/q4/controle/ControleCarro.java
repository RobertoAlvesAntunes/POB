package questoes.atividades07.q4.controle;

import questoes.atividades07.q4.domínio.Carro;

public class ControleCarro {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota Corolla", 2025);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Velocidade: " + carro.getVelocidadeAtual());
        System.out.println("Está em movimento: " + carro.isEmMovimento());

        System.out.println();

        carro.acelerar(50);

        System.out.println("Velocidade após acelerar: " + carro.getVelocidadeAtual());
        System.out.println("Está em movimento: " + carro.isEmMovimento());

        carro.frear(20);

        System.out.println("Velocidade após frear: " + carro.getVelocidadeAtual());

        carro.frear(50);

        System.out.println("Velocidade após frear novamente: " + carro.getVelocidadeAtual());
        System.out.println("Está em movimento: " + carro.isEmMovimento());
    }
}
