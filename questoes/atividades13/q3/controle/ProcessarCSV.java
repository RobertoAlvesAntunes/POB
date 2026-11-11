package questoes.atividades13.q3.controle;

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.util.List;

public class ProcessarCSV {
    public static void main(String[] args) {

        Path arquivo = Path.of("questoes", "atividades13", "q3", "produtos.csv");

        try {
            List<String> linhas = Files.readAllLines(arquivo);

            double totalInventario = 0.0;

            for (int i = 1; i < linhas.size(); i++) {

                String[] campos = linhas.get(i).split(",");

                String nome = campos[0];
                int quantidade = Integer.parseInt(campos[1]);
                double preco = Double.parseDouble(campos[2]);

                double totalItem = quantidade * preco;

                totalInventario += totalItem;

                System.out.println("Produto: " + nome);
                System.out.println("Quantidade: " + quantidade);
                System.out.println("Preço unitário: R$ " + preco);
                System.out.println("Valor total: R$ " + totalItem);
                System.out.println();
            }

            System.out.println("Valor total do inventário: R$ " + totalInventario);

        } catch (NumberFormatException e) {
            System.out.println("Erro: formato numérico inválido no arquivo CSV.");

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}