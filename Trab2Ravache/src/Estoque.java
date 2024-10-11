import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtosDisponiveis = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtosDisponiveis.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtosDisponiveis.remove(produto);
    }

    public void exibirPrecosDesc (double porcentagem) {
        for (Produto produto : produtosDisponiveis) {
            double precoComDesconto = produto.calcularDesconto(porcentagem);
            System.out.println(produto.getNome() + " com Desconto R$: " + precoComDesconto);
        }
    }
}
