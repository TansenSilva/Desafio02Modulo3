public class Vendedor extends DadosCadastrais{



    @Override
    public void cadastrar() {
        super.cadastrar();
    }

    @Override
    public String toString() {
        return "Vendedor: {" +
                "nome: '" + this.getNome() + '\'' +
                ", cpf: '" + this.getCpf() + '\'' +
                ", email: '" + this.getEmail() + '\'' +
                '}';
    }


}
