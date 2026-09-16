package questoes.atividades09.q5.domínio;

public abstract class Item {
    private int codigo;
    private double precoBase;

    public Item(int codigo, double precoBase) {
        this.codigo = codigo;
        this.precoBase = precoBase;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
}