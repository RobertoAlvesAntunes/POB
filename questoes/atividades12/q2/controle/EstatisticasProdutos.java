package questoes.atividades12.q2.controle;

import java.util.ArrayList;
import java.util.Comparator;

import questoes.atividades12.q2.domínio.Produto;

public class EstatisticasProdutos {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<Produto>();

        produtos.add(new Produto("Teclado", 150.00));
        produtos.add(new Produto("Mouse", 80.00));
        produtos.add(new Produto("Monitor", 900.00));
        produtos.add(new Produto("Fone", 120.00));
        produtos.add(new Produto("Notebook", 2500.00));
        produtos.add(new Produto("Webcam", 200.00));

        double total = produtos.stream()
                .mapToDouble(produto -> produto.getPreco())
                .sum();

        System.out.println("Valor total: R$ " + total);

        double media = produtos.stream()
                .mapToDouble(produto -> produto.getPreco())
                .average()
                .orElse(0.0);

        System.out.println("Preço médio: R$ " + media);

        Produto maiorPreco = produtos.stream()
                .max(Comparator.comparingDouble(produto -> produto.getPreco()))
                .orElse(null);

        if (maiorPreco != null) {
            System.out.println("Produto mais caro: " + maiorPreco.getNome());
            System.out.println("Preço: R$ " + maiorPreco.getPreco());
        }
    }
}