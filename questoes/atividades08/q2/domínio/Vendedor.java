package questoes.atividades08.q2.domínio;

public class Vendedor extends Funcionario {
    private double totalVendas;
    private double comissaoPercentual;

    public Vendedor(String nome, double salarioBase, double totalVendas, double comissaoPercentual) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.comissaoPercentual = comissaoPercentual;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getComissaoPercentual() {
        return comissaoPercentual;
    }

    public void setComissaoPercentual(double comissaoPercentual) {
        this.comissaoPercentual = comissaoPercentual;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (totalVendas * comissaoPercentual / 100);
    }
}