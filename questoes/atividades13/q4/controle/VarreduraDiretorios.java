package questoes.atividades13.q4.controle;

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;

public class VarreduraDiretorios {
    public static void main(String[] args) {

        Path diretorio = Path.of("questoes");

        long tamanhoTotal = 0;

        try (Stream<Path> caminhos = Files.walk(diretorio)) {

            Stream<Path> arquivosJava = caminhos
                    .filter(Files::isRegularFile)
                    .filter(caminho -> caminho.toString().endsWith(".java"));

            for (Path arquivo : arquivosJava.toList()) {

                long tamanho = Files.size(arquivo);

                System.out.println("Arquivo: " + diretorio.relativize(arquivo));
                System.out.println("Tamanho: " + tamanho + " bytes");
                System.out.println();

                tamanhoTotal += tamanho;
            }

            System.out.println("Tamanho total dos arquivos Java: "
                    + tamanhoTotal + " bytes");

        } catch (IOException e) {
            System.out.println("Erro ao percorrer o diretório: " + e.getMessage());
        }
    }
}