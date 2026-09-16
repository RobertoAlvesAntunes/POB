package questoes.atividades09.q2.controle;

import questoes.atividades09.q2.domínio.Circulo;
import questoes.atividades09.q2.domínio.Forma;
import questoes.atividades09.q2.domínio.Retangulo;

public class ControleForma {

    public static void main(String[] args) {

        Forma retangulo = new Retangulo("Azul", 5, 4);
        Forma circulo = new Circulo("Vermelho", 3);

        retangulo.exibirCor();
        System.out.println("Área: " + retangulo.calcularArea());

        System.out.println();

        circulo.exibirCor();
        System.out.println("Área: " + circulo.calcularArea());
    }
}