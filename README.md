# Desafio02Modulo3

    Equipe:
        Ana Clara
        Saulo Henrique
        Paulo Renan
        Tansen Gabriel

    Projeto: Sistema para loja de materiais de contrução.

O sistema inicia com um cadastro de vendedores e em seguida o cadastro dos clientes.
Recebe de ambos os atributos nome, cpf e emai. Todos são do tipo String, o cpf tem
de ter OBRIGATÓRIAMENTE 14 caractéres, enquanto não for digitado um cpf válido o
sistema não passa para próxima fase. O email tembém possui um válidação para ser
aceito, caso não contenha "nome + @ + servidor de e-mail" ele não será aceito.
Os vendedores e clientes cadastrados são armazenados dentro de suas respectivas
listas.

Após os cadastros efetuados sera exibido a lista de vendedores e o sistema pedirá
o nome do vendedor para darmos início a venda. Depois é exibida a lista de clientes
e o sistema espera a entrada do nome do cliente.

Em seguda será exibida a lista dos produtos, onde seram exibidos os produtos cadastrados
para que o vendedor digite o nome do produto escolhido. Quando o  nome do produto é
digitado ele busca esse produto na lista de produtos onde cada objeto do tipo produto
possui um nome e um valor. Assim que o produto é digitado o próximo passo será inserir
a data da venda que será armazenada em uma variável.
.....................venda conluída.................
Essa venda é armazenda em uma lista e em seguida o programa pergunta ao usuário se ele
deseja efetuar outra venda. Caso queira ele retoma ao inicio do processo de venda caso
não ele abre um medo com 4 opções:

"1 - Listar todas as vendas cadastradas.");
"2 - Listar todos os vendedores cadastrados.");
"3 - Listar todos os clientes cadastrados.");
"4 - sair.");

apos digitar o numero o programa executa a ação correspondente.