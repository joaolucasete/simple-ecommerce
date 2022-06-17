import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TesteEstoque {

    @Test
    public void testCadastraProdutos()
    {
        Estoque loja = new Estoque();
        Produto prod1 = new Produto("Notebook", 2000, 10);

        assertTrue(loja.cadastraProduto(prod1, 2));
    }

    @Test
    public void testRemoveProdutos()
    {
        Estoque loja = new Estoque();
        Produto prod1 = new Produto("Notebook", 2000, 10);

        loja.cadastraProduto(prod1, 10);
        assertTrue(loja.retiraProduto(prod1, 1));
    }

    @Test
    public void testRetiraProdutos()
    {
        //Variação do método retira produto...onde se a quantidade for 1, remove o produto do estoque.
        Estoque loja = new Estoque();
        Produto prod1 = new Produto("Notebook", 2000, 1);

        loja.cadastraProduto(prod1, 1);

        assertFalse(loja.retiraProduto(prod1, 1));
    }
}
