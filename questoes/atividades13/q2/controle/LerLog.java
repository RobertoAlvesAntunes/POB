
package questoes.atividades13.q2.controle;

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class LerLog {
    public static void main(String[] args) {

        Path arquivo = Path.of("questoes", "atividades13", "q2", "servidor.log");

        try (var linhas = Files.lines(arquivo)) {

            List<String> erros = linhas
                    .filter(linha -> linha.startsWith("[ERROR]"))
                    .map(linha -> linha.replace("[ERROR] ", ""))
                    .collect(Collectors.toList());

            System.out.println("Total de erros encontrados: " + erros.size());

            System.out.println("\nMensagens de erro:");

            erros.forEach(mensagem -> System.out.println(mensagem));

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
