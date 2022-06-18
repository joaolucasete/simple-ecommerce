
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Produto> produtos;

    public CarrinhoCompras() {
        produtos = new ArrayList<Produto>();
    }

    public void addProduto(Produto prod) {
        if (prod.quantidade > 0) {
            produtos.add(prod);
        } else {
            System.out.println("Não é possível adicionar o produto");
        }
    }

    public void removeProduto(String nome) {
        for (Produto prod : produtos) {
            if (prod.nome.equals(nome)) {
                produtos.remove(prod);
                break;
            }
        }
    }

    public void listarProdutos() {
        if (produtos.size() == 0) {
            System.out.println("Não existem produtos no carrinho");
        } else {
            for (Produto prod : produtos) {
                System.out.println(prod.toString());
            }
        }
    }

    public double somaValor() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getValor() * produto.getQuantidade();
        }
        return total;
    }

    public int getQuantidadeProdutos() {
        return produtos.size();
    }

    public double somaValorDesconto(double total, double desconto) {
        return total - (total * desconto);
    }
}
