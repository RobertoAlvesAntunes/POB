package questoes.atividades07.q3.controle;

import questoes.atividades07.q3.domínio.Retangulo;

public class ControleRetangulo {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(5, 3);

        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());

        System.out.println();

        Retangulo retangulo2 = new Retangulo(-2, 0);

        System.out.println("Largura: " + retangulo2.getLargura());
        System.out.println("Altura: " + retangulo2.getAltura());
        System.out.println("Área: " + retangulo2.calcularArea());
        System.out.println("Perímetro: " + retangulo2.calcularPerimetro());
    }
}
