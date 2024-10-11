public class Pecas extends Produto {
    public Pecas(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public double CalcularDesconto(double porcentagem){
        double descontoFinal = porcentagem < 10 ? 10 : porcentagem;
        return preco - (preco * descontoFinal * 0.1);
    }
}
