package semanaOito.AtividadeUm;


public class DescontoRoupa implements Desconto {

	@Override
	public double calcularDesconto(Produto produto) {
		// TODO Auto-generated method stub
		 return produto.getPreco() * 0.15; 
	}

}
