package questoes.atividades11.q4.controle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> estoque = new HashMap<String, Integer>();

        System.out.print("Quantos produtos deseja cadastrar? ");
        int quantidadeProdutos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.print("Digite o código do produto: ");
            String codigo = sc.nextLine();

            System.out.print("Digite a quantidade em estoque: ");
            int quantidade = sc.nextInt();
            sc.nextLine();

            estoque.put(codigo, quantidade);
        }

        System.out.print("\nDigite o código do produto que deseja atualizar: ");
        String codigoBuscar = sc.nextLine();

        if (estoque.containsKey(codigoBuscar)) {
            System.out.println("1 - Adicionar unidades");
            System.out.println("2 - Retirar unidades");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();

            if (opcao == 1) {
                estoque.put(codigoBuscar,
                    estoque.get(codigoBuscar) + quantidade);
                System.out.println("Estoque atualizado.");
            } else if (opcao == 2) {
                estoque.put(codigoBuscar,
                    estoque.get(codigoBuscar) - quantidade);
                System.out.println("Estoque atualizado.");
            } else {
                System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("Produto não encontrado.");
        }

        System.out.println("\nProdutos com estoque abaixo de 5 unidades:");

        for (Map.Entry<String, Integer> produto : estoque.entrySet()) {
            if (produto.getValue() < 5) {
                System.out.println("Código: " + produto.getKey()
                    + " | Estoque: " + produto.getValue());
            }
        }

        sc.close();
    }
}