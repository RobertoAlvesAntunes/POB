package questoes.atividades09.q1.domínio;

public class CartaoCredito implements MetodoPagamento {
    private String numeroCartao;
    private double limite;

    public CartaoCredito(String numeroCartao, double limite) {
        this.numeroCartao = numeroCartao;
        this.limite = limite;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void processarPagamento(double valor) {
        if (valor <= limite) {
            limite -= valor;
            System.out.println("Pagamento com cartão aprovado.");
        } else {
            System.out.println("Limite insuficiente.");
        }
    }

    @Override
    public String obterDetalhes() {
        return "Cartão de crédito: " + numeroCartao +
               " | Limite: R$ " + limite;
    }
}