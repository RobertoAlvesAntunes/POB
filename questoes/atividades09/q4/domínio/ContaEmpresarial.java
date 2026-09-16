package questoes.atividades09.q4.domínio;

public class ContaEmpresarial extends ContaBancaria {

    public ContaEmpresarial(String numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void cobrarTaxaMensal() {
        double taxa = 30.00 + (getSaldo() * 0.5 / 100);
        setSaldo(getSaldo() - taxa);
    }
}