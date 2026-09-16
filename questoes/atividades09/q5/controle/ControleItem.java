package questoes.atividades09.q5.controle;

import java.util.ArrayList;
import java.util.List;

import questoes.atividades09.q5.domínio.Eletronico;
import questoes.atividades09.q5.domínio.Tributavel;

public class ControleItem {

    public static void main(String[] args) {

        List<Tributavel> itensTributaveis = new ArrayList<>();

        itensTributaveis.add(new Eletronico(1, 1000));
        itensTributaveis.add(new Eletronico(2, 2000));

        double totalImpostos = calcularTotalImpostos(itensTributaveis);

        System.out.println("Total de impostos: R$ " + totalImpostos);
    }

    public static double calcularTotalImpostos(List<Tributavel> itensTributaveis) {
        double total = 0;

        for (Tributavel item : itensTributaveis) {
            total += item.calcularTributo();
        }

        return total;
    }
}

