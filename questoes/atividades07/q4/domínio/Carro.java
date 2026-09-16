package questoes.atividades07.q4.domínio;

public class Carro {
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(int incremento) {
        velocidadeAtual += incremento;
    }

    public void frear(int decremento) {
        velocidadeAtual -= decremento;

        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public boolean isEmMovimento() {
        if (velocidadeAtual > 0) {
            return true;
        } else {
            return false;
        }
    }
}
