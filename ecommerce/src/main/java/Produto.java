public class Produto {

    protected String nome;
    protected double valor;
    protected int quantidade;

    public Produto(String nome,double valor, int quantidade)
    {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
