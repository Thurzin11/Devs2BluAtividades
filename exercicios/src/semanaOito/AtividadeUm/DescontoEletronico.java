package semanaOito.AtividadeUm;


public class DescontoEletronico implements Desconto {
	
    @Override
    public double calcularDesconto(Produto produto) {
        return produto.getPreco() * 0.10; 
    }

}
