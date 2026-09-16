package questoes.atividades09.q1.domínio;

public class Pix implements MetodoPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Pix realizado.");
    }

    @Override
    public String obterDetalhes() {
        return "Pix: " + chavePix;
    }
}