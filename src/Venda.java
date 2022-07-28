public class Venda {
    private String vendedor;
    private String cliente;
    private String produto;
    private double valorDaVenda;
    private String dataDeRegistro;



    // construtor
    public Venda() {

    }

    public Venda(String vendedor, String cliente, String produto, String dataDeRegistro, double valorDaVenda) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.produto = produto;
        this.dataDeRegistro = dataDeRegistro;
        this.valorDaVenda = valorDaVenda;
    }

    @Override
    public String toString() {
        return "Venda { " +
                "Vendedor: '" + vendedor + '\'' +
                ", Cliente: '" + cliente + '\'' +
                ", Produto: '" + produto + '\'' +
                ", Valor da venda: R$ " + valorDaVenda +
                ", Data: '" + dataDeRegistro + '\'' +
                '}';
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

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }

    public double getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(double valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }
}
