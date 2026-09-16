package questoes.atividades08.q4.controle;

import questoes.atividades08.q4.domínio.Circulo;
import questoes.atividades08.q4.domínio.FiguraGeometrica;
import questoes.atividades08.q4.domínio.Quadrado;
import questoes.atividades08.q4.domínio.Retangulo;

public class ControleFigura {

    public static void main(String[] args) {

        FiguraGeometrica[] figuras = new FiguraGeometrica[3];

        figuras[0] = new Quadrado(5);
        figuras[1] = new Retangulo(4, 6);
        figuras[2] = new Circulo(3);

        for (FiguraGeometrica figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
        }
    }
}