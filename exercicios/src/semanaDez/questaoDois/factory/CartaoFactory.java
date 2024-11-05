package semanaDez.questaoDois.factory;

import semanaDez.questaoDois.model.Cartao;
import semanaDez.questaoDois.model.Pagamento;

public class CartaoFactory implements PagamentoFactory{
    @Override
    public Pagamento criarPagamento() {
        return new Cartao();
    }
}
