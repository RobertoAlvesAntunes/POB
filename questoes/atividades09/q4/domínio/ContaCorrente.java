package questoes.atividades09.q4.domínio;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void cobrarTaxaMensal() {
        setSaldo(getSaldo() - 15.00);
    }
}