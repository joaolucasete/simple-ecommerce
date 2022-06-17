import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteCarrinhoCompras {

    @Test
    public void testeSomaValor()
    {
        Produto prod1 = new Produto("Notebook", 2000);
        Produto prod2 = new Produto("Celular", 900);

        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.addProduto(prod1);
        carrinho.addProduto(prod2);

        assertEquals(2900, carrinho.somaValor(), 0.01);
    }

    @Test
    public void testeSomaValorDesconto(){
        double total = 1000;
        double desconto = 0.10;

        CarrinhoCompras carrinho = new CarrinhoCompras();

        assertEquals(900, carrinho.somaValorDesconto(total, desconto), 0.01);

    }
}
