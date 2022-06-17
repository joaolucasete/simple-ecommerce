
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Produto> produtos;

    public CarrinhoCompras()
    {
        produtos = new ArrayList<Produto>();
    }

    public void addProduto(Produto prod)
    {
        if(prod.quantidade > 0)
        {
            produtos.add(prod);
        }
        else
        {
            System.out.println("Não é possível adicionar o produto");
        }
    }

    public double somaValor()
    {
        double total = 0;
        for(Produto produto : produtos)
        {
            total += produto.getValor();
        }
        return total;
    }

    public double somaValorDesconto(double total, double desconto)
    {
        return total - (total * desconto);
    }
}
