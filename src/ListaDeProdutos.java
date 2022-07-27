import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListaDeProdutos {

    private HashMap<String,Produto> mapProdutos = new HashMap<>();

    // ********* metodos ******************

    public void adicionarProdutos(String nome, double preco){
        this.mapProdutos.put(nome,new Produto(nome,preco));

    }
    public void listarProdutos(){
        for (Produto produto : mapProdutos.values()) {
            System.out.printf("Produto: %s - Preço: %.2f \n",produto.getNomeProduto(),produto.getPrecoProduto());
        }
    }

    public Produto obterProduto(String nome){
        return mapProdutos.get(nome);
    }
}
