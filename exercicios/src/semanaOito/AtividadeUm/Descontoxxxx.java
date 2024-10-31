package semanaOito.AtividadeUm;

public class Descontoxxxx implements Desconto {
    @Override
    public double calcularDesconto(Produto produto) {
        return produto.getPreco() * 0.25;
    }
}
