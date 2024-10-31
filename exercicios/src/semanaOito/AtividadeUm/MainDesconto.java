package semanaOito.AtividadeUm;

import java.util.ArrayList;
import java.util.List;

public class MainDesconto {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<Produto>();
        List<Desconto> descontos = new ArrayList<Desconto>();
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        Produto produto1 = new Produto("Eletronico",50);
        DescontoEletronico descontoEletronico = new DescontoEletronico();
        double descontoUnico =  calculadora.calcularDesconto(produto1,descontoEletronico);
        System.out.println("O desconto unico do "+produto1.getTipoProduto()+" é "+descontoUnico);
        produtos.add(produto1);
        descontos.add(descontoEletronico);
        Produto produto2 = new Produto("Roupa",20);
        DescontoRoupa descontoRoupa = new DescontoRoupa();
        produtos.add(produto2);
        descontos.add(descontoRoupa);
        Produto produto3 = new Produto("EletroDomestico",500);
        DescontoEletroDomestico descontoEletroDomestico = new DescontoEletroDomestico();
        produtos.add(produto3);
        descontos.add(descontoEletroDomestico);
        Produto produto4 = new Produto("Alimento",10);
        DescontoAlimento descontoAlimento = new DescontoAlimento();
        produtos.add(produto4);
        descontos.add(descontoAlimento);
        Produto produto5 = new Produto("ProdutoXXX",200);
        Descontoxxxx descontoxxxx = new Descontoxxxx();
        produtos.add(produto5);
        descontos.add(descontoxxxx);
        double descontoTotalProdutos = calculadora.calcularDescontoTotal(produtos,descontos);
        System.out.println("O desconto total dos produtos é "+descontoTotalProdutos);
    }
}
