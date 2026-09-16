package questoes.atividades08.q5.domínio;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double saldo, double limiteChequeEspecial) {
        super(numero, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        double taxa = 2.00;

        if (valor > 0 && getSaldo() - valor - taxa >= -limiteChequeEspecial) {
            setSaldo(getSaldo() - valor - taxa);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}