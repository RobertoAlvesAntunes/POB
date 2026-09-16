package questoes.atividades09.q1.controle;

import questoes.atividades09.q1.domínio.CartaoCredito;
import questoes.atividades09.q1.domínio.MetodoPagamento;
import questoes.atividades09.q1.domínio.Pix;

public class ControlePagamento {

    public static void main(String[] args) {

        MetodoPagamento cartao = new CartaoCredito("1234-5678", 2000);
        MetodoPagamento pix = new Pix("email@exemplo.com");

        finalizarCompra(cartao, 500);
        System.out.println(cartao.obterDetalhes());

        System.out.println();

        finalizarCompra(pix, 300);
        System.out.println(pix.obterDetalhes());
    }

    public static void finalizarCompra(MetodoPagamento metodo, double total) {
        metodo.processarPagamento(total);
    }
}