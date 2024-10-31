package semanaOito.AtividadeUm;



public class DescontoAlimento implements Desconto {

    @Override
    public double calcularDesconto(Produto produto) {
        return produto.getPreco() * 0.05; 
    }
}
