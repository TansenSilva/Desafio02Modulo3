import java.util.ArrayList;

public class Cliente extends DadosCadastrais{




    @Override
    public void cadastrar() {
        super.cadastrar();
    }

    @Override
    public String toString() {
        return "Cliente: {" +
                "nome: '" + this.getNome() + '\'' +
                ", cpf: '" + this.getCpf() + '\'' +
                ", email: '" + this.getEmail() + '\'' +
                '}';
    }



}
