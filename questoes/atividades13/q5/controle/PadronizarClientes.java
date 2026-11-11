
package questoes.atividades13.q5.controle;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class PadronizarClientes {
    public static void main(String[] args) {

        Path diretorio = Path.of("questoes", "atividades13", "q5");
        Path arquivoEntrada = diretorio.resolve("clientes_bruto.txt");
        Path arquivoSaida = diretorio.resolve("clientes_padronizados.txt");

        try {
            List<String> clientes;

            try (var linhas = Files.lines(arquivoEntrada)) {

                clientes = linhas
                        .map(linha -> linha.trim())
                        .filter(linha -> !linha.isBlank())
                        .map(nome -> nome.substring(0, 1).toUpperCase()
                                + nome.substring(1).toLowerCase())
                        .collect(Collectors.toList());
            }

            Files.write(arquivoSaida, clientes,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Arquivo padronizado criado com sucesso!");
            System.out.println("Local: " + arquivoSaida.toAbsolutePath());

            System.out.println("\nClientes padronizados:");

            clientes.forEach(nome -> System.out.println(nome));

        } catch (IOException e) {
            System.out.println("Erro ao processar os arquivos: " + e.getMessage());
        }
    }
}
