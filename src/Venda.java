public class Venda {
    private String vendedor;
    private String cliente;
    private Produto produto;
    private String dataDeRegistro;

    @Override
    public String toString() {
        return "Venda{" +
                "vendedor: " + this.vendedor +
                ", cliente: " + this.cliente +
                ", produto: " + this.produto.getNomeProduto() +
                ", dataDeRegistro: '" + dataDeRegistro + '\'' +
                '}';
    }

    // construtor
    public Venda() {

    }

    public Venda(String vendedor, String cliente, Produto produto, String dataDeRegistro) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.produto = produto;

        this.dataDeRegistro = dataDeRegistro;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }
}
