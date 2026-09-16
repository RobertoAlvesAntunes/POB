package questoes.atividades07.q1.controle;

import questoes.atividades07.q1.domínio.Produto;

public class ControleProduto {
    public static void main(String[] args) {

        Produto produtoA = new Produto("Arroz", 25.00, 10);

        Produto produtoB = new Produto("Feijão", 10.00);

        System.out.println("Produto A:");
        System.out.println("Nome: " + produtoA.getNome());
        System.out.println("Preço: " + produtoA.getPreco());
        System.out.println("Estoque: " + produtoA.getQuantidadeEstoque());
        System.out.println("Valor total em estoque: " + produtoA.calcularValorTotalEmEstoque());

        System.out.println();

        System.out.println("Produto B:");
        System.out.println("Nome: " + produtoB.getNome());
        System.out.println("Preço: " + produtoB.getPreco());
        System.out.println("Estoque: " + produtoB.getQuantidadeEstoque());

        System.out.println();

        produtoB.setPreco(-10.0);

        System.out.println("Preço após tentativa de alteração: " + produtoB.getPreco());
    }
}