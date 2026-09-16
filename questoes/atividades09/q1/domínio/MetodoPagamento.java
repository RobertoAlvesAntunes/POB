package questoes.atividades09.q1.domínio;

public interface MetodoPagamento {

    void processarPagamento(double valor);

    String obterDetalhes();
}