import java.util.ArrayList;
import java.util.List;

public class Estoque {

    List<Produto> produtos = new ArrayList<Produto>();

    public void cadastraProduto(Produto produto, int quantidade)
    {
        boolean achou = false;
        for(int i = 0; i< produtos.size(); i++){
            if(produtos.get(i).nome == produto.getNome())
            {
                achou = true;
                produto.quantidade += quantidade;
            }
        }
        if(!achou){
            produtos.add(produto);
        }
    }
    public void retiraProduto(Produto produto, int quantidade)
    {
        boolean achou = false;
        for(int i = 0; i< produtos.size(); i++){
            if(produtos.get(i).nome == produto.getNome())
            {
                achou = true;
                if(produto.quantidade > 1)
                {
                    produto.quantidade -= quantidade;
                }
                else
                {
                    produtos.remove(produto);
                }
            }
        }
    }
}
