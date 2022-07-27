
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class DadosCadastrais implements Cadastro {
    private String nome;
    private String cpf;
    private String email;


    //métodos
    @Override
    public void cadastrar() {
        Scanner input = new Scanner(System.in);
        String _email = "";
        System.out.println("Digite o nome: ");
        this.setNome(input.nextLine());

        do {
            System.out.println("Digite o CPF: ");
            this.setCpf(input.next());
            if (getCpf().length() > 14 || getCpf().length() < 14) {
                System.out.println("O CPF deverá ter no máximo 14 caracteres, incluindo pontos e traço.");
            }

        } while ((getCpf().length() > 14) || getCpf().length() < 14);

        do {

            System.out.println("Digite o e-mail: ");
            _email = input.next();
            if (validaEmail(_email)) {
                this.setEmail(_email);
            } else {
                System.out.println("E-mail inválido");
            }


        } while (!validaEmail(_email));


    }

    //método para validação de e-mail:
    private boolean validaEmail(String email) {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }


    //métodos especiais:

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
