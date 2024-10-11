import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Este é um software de estoque de produtos, coloque as informações abaixo.");
        System.out.println("Quantos produtos você deseja cadastrar: ");
        int quantidade = leitor.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("1 - Peças");
            System.out.println("2 - Equipamentos");
            System.out.println("Opção escolhida: ");
            int opcao = leitor.nextInt();

            System.out.println("Nome do produto: ");
            String nome = leitor.next();

            System.out.println("Valor do produto: ");
            double valor = leitor.nextDouble();

            Produto produto;

            if (opcao == 1) {
                produto = new Pecas(nome, valor);
            }
            else {
                produto = new Equipamentos(nome, valor);
            }
            estoque.adicionarProduto(produto);

            System.out.println("Digite o desconto aplicado da seguinte forma, Resposta: 50 para 50% de desconto.");
            System.out.println(("Qual será a porcentagem de desconto nos produtos: "));
            double desconto = leitor.nextDouble();

            estoque.exibirPrecosDesc(desconto);



        }
    }

}