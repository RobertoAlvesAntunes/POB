package questoes.atividades06.q4.domínio;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salarioBruto;

    public Funcionario(String nome, String cargo, double salarioBruto) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void aplicarAumento(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    public double calcularSalarioLiquido(double descontoImposto) {
        return salarioBruto - descontoImposto;
    }
}