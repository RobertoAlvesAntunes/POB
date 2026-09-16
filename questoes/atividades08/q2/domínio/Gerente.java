package questoes.atividades08.q2.domínio;

public class Gerente extends Funcionario {
    private double bonusFixo;

    public Gerente(String nome, double salarioBase, double bonusFixo) {
        super(nome, salarioBase);
        this.bonusFixo = bonusFixo;
    }

    public double getBonusFixo() {
        return bonusFixo;
    }

    public void setBonusFixo(double bonusFixo) {
        this.bonusFixo = bonusFixo;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonusFixo;
    }
}