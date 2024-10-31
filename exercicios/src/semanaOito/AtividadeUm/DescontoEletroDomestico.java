package semanaOito.AtividadeUm;


public class DescontoEletroDomestico implements Desconto {

	@Override
	public double calcularDesconto(Produto produto) {
		// TODO Auto-generated method stub
		 return produto.getPreco() * 0.20; 
	}

}
