package questoes.atividades13.q1.controle;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.time.LocalDateTime;

public class CriarRelatorio {
    public static void main(String[] args) {

        Path diretorio = Path.of("dados", "relatorios");
        Path arquivo = diretorio.resolve("sumario.txt");

        try {
            Files.createDirectories(diretorio);

            String conteudo = "RELATÓRIO DE EXECUÇÃO DO SISTEMA\n"
                    + "--------------------------------\n"
                    + "Sistema executado com sucesso.\n"
                    + "Data e hora: " + LocalDateTime.now() + "\n";

            Files.writeString(arquivo, conteudo,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Arquivo criado em: " + arquivo);

        } catch (IOException e) {
            System.out.println("Erro ao criar o relatório: " + e.getMessage());
        }
    }
}