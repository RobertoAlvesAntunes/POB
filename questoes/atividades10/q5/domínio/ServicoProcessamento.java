package questoes.atividades10.q5.domínio;

import java.io.IOException;

public class ServicoProcessamento {

    public void processarArquivo(String caminho) throws ProcessamentoDadosException {

        try {
            if (caminho == null || caminho.isEmpty()) {
                throw new IOException("Caminho do arquivo inválido.");
            }

            System.out.println("Arquivo processado com sucesso.");

        } catch (IOException e) {
            throw new ProcessamentoDadosException(
                    "Erro ao processar o arquivo.",
                    e
            );
        }
    }
}