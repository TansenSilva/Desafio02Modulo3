import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nomeProduto;
    private double precoProduto;


    public Produto(String nome, double precoProduto) {
        this.nomeProduto = nome;
        this.precoProduto = precoProduto;

    }
    public Produto() {
    }



    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nomeProduto + '\'' +
                '}';
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nome) {
        this.nomeProduto = nome;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }


}
