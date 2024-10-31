package semanaOito.AtividadeUm;

import java.util.List;


public class CalculadoraDesconto{

	public double calcularDesconto(Produto produto, Desconto desconto) {
	        return desconto.calcularDesconto(produto);
	}

	public double calcularDescontoTotal(List<Produto> produtos, List<Desconto> descontos) {
        if (produtos.size() != descontos.size()){
            throw new IllegalArgumentException("A lista de produtos e a lista de descontos devem ter o mesmo tamanho");
        }else {
            double totalDesconto = 0;
            for (int i = 0; i < produtos.size(); i++) {
                totalDesconto += descontos.get(i).calcularDesconto(produtos.get(i));
            }
            return totalDesconto;
        }
    }
}