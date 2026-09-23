package questoes.atividades10.q5.controle;

import questoes.atividades10.q5.domínio.ProcessamentoDadosException;
import questoes.atividades10.q5.domínio.ServicoProcessamento;

public class ControleProcessamento {

    public static void main(String[] args) {

        ServicoProcessamento servico = new ServicoProcessamento();

        try {

            servico.processarArquivo("");

        } catch (ProcessamentoDadosException e) {

            System.out.println("Erro: " + e.getMessage());
            System.out.println("Causa: " + e.getCause().getMessage());
        }
    }
}