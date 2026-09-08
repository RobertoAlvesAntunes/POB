package questoes.atividades06.q4;

public class Funcionario {
    String nome;
    String cargo;
    double salarioBruto;

    public void aplicarAumento(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    public double calcularSalarioLiquido(double descontoImposto) {
        return salarioBruto - descontoImposto;
    }
}
