public class Equipamentos extends Produto {
    public Equipamentos(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public double CalcularDesconto(double porcentagem){
        double descontoFinal = porcentagem < 15 ? 15 : porcentagem;
        return preco - (preco * descontoFinal * 0.1);
    }
}
