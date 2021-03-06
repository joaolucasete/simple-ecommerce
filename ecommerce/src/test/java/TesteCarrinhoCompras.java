import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCarrinhoCompras {

    @Test
    public void adicionarProduto() {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        Produto produto = new Produto("Cachorro", 10.0, 1);
        carrinho.addProduto(produto);
        assertEquals(1, carrinho.getQuantidadeProdutos());
    }

    @Test
    public void testeSomaValor() {
        Produto prod1 = new Produto("Notebook", 2000, 1);
        Produto prod2 = new Produto("Celular", 900, 1);

        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.addProduto(prod1);
        carrinho.addProduto(prod2);

        assertEquals(2900, carrinho.somaValor(), 0.01);
    }

    @Test
    public void testeSomaValorDesconto() {
        double total = 1000;
        double desconto = 0.10;

        CarrinhoCompras carrinho = new CarrinhoCompras();

        assertEquals(900, carrinho.somaValorDesconto(total, desconto), 0.01);
    }
}
