import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int resposta;
        boolean c = true;

        HashMap<String, Vendedor> mapaVendedores = new HashMap<>();
        HashMap<String, Cliente> mapaClientes = new HashMap<>();

        ArrayList<Venda> vendasFeitas = new ArrayList<>();
        ListaDeProdutos listaDeProdutos = new ListaDeProdutos();

        System.out.println("           ======CADASTRO=======");
        System.out.println("Faça o cadastro de 2 vendedores e 2 clientes: ");

        //Vendedores:
        Vendedor v1 = new Vendedor();
        System.out.println("Vendedor 1");
        v1.cadastrar();
        Vendedor v2 = new Vendedor();
        System.out.println("Vendedor 2");
        v2.cadastrar();

        mapaVendedores.put(v1.getNome(), v1);
        mapaVendedores.put(v2.getNome(), v2);

        //Clientes:
        Cliente c1 = new Cliente();
        System.out.println("Cliente 1");
        c1.cadastrar();
        Cliente c2 = new Cliente();
        System.out.println("Cliente 2");
        c2.cadastrar();

        mapaClientes.put(c1.getNome(), c1);
        mapaClientes.put(c2.getNome(), c2);

        //Produtos:


        listaDeProdutos.adicionarProdutos("Martelo", 50.00);
        listaDeProdutos.adicionarProdutos("Alicate", 30.00);
        listaDeProdutos.adicionarProdutos("Arame", 10.00);
        listaDeProdutos.adicionarProdutos("Prego", 40.00);


        //Vendas:
        Venda venda1 = new Venda();


        do {

            System.out.println("              ========MATERIAIS DE CONSTRUÇÃO=========");

            do {
                System.out.println("Quem está efetuando esta venda?: ");
                System.out.println(mapaVendedores.keySet());
                venda1.setVendedor(input.nextLine());
                if (!mapaVendedores.containsKey(venda1.getVendedor())) {
                    System.out.println("Vendedor não cadastrado!");
                }

            } while (!mapaVendedores.containsKey(venda1.getVendedor()));


            do {
                System.out.println("Quem está efetuando esta compra?: ");
                System.out.println(mapaClientes.keySet());
                venda1.setCliente(input.nextLine());
                if (!mapaClientes.containsKey(venda1.getCliente())) {
                    System.out.println("Cliente não cadastrado!");
                }

            } while (!mapaClientes.containsKey(venda1.getCliente()));


            System.out.println("Qual produto?");
            listaDeProdutos.listarProdutos();
            venda1.setProduto(input.next());

            System.out.print("Digite o valor da venda: ");
            venda1.setValorDaVenda(input.nextDouble());

            System.out.println("Qual a data?: ");
            venda1.setDataDeRegistro(input.next());

            System.out.println("Venda realizada com sucesso!");
            vendasFeitas.add(venda1);

            System.out.println("Deseja fazer mais alguma venda? 1-sim 2- não ");
            resposta = input.nextInt();

        } while (resposta == 1);


        while (c) {
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Listar todas as vendas cadastradas.");
            System.out.println("2 - Listar todos os vendedores cadastrados.");
            System.out.println("3 - Listar todos os clientes cadastrados.");
            System.out.println("4 - Listar todos os produtos cadastrados.");
            System.out.println("0 - sair.");

            resposta = input.nextInt();

            switch (resposta) {
                case 0:
                    c = false;
                    System.out.println("Obrigado por usar nosso sistema!");
                    break;
                case 1:
                    System.out.println(vendasFeitas);
                    break;
                case 2:
                    System.out.println(mapaVendedores);
                    break;
                case 3:
                    System.out.println(mapaClientes);
                    break;
                case 4:
                    listaDeProdutos.listarProdutos();
                    break;

                default:
                    System.out.println("Ação inválida.");
            }
        }
    }

}
