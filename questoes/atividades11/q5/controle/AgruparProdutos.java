package questoes.atividades11.q5.controle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import questoes.atividades11.q5.domínio.Produto;

public class AgruparProdutos {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        produtos.add(new Produto("Arroz", "Alimentos", 25.90));
        produtos.add(new Produto("Feijão", "Alimentos", 8.50));
        produtos.add(new Produto("Sabonete", "Higiene", 3.99));
        produtos.add(new Produto("Shampoo", "Higiene", 15.90));
        produtos.add(new Produto("Detergente", "Limpeza", 2.99));

        HashMap<String, List<Produto>> categorias =
            new HashMap<String, List<Produto>>();

        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            String categoria = produto.getCategoria();

            if (!categorias.containsKey(categoria)) {
                categorias.put(categoria, new ArrayList<Produto>());
            }

            categorias.get(categoria).add(produto);
        }

        for (Map.Entry<String, List<Produto>> entrada
                : categorias.entrySet()) {

            System.out.println("\nCategoria: " + entrada.getKey());

            List<Produto> listaProdutos = entrada.getValue();

            for (int i = 0; i < listaProdutos.size(); i++) {
                Produto produto = listaProdutos.get(i);

                System.out.println("Nome: " + produto.getNome());
                System.out.println("Preço: R$ " + produto.getPreco());
            }
        }
    }
}