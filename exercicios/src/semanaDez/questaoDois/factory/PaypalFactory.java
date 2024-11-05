package semanaDez.questaoDois.factory;

import semanaDez.questaoDois.model.Pagamento;
import semanaDez.questaoDois.model.Paypal;

public class PaypalFactory implements PagamentoFactory{
    @Override
    public Pagamento criarPagamento() {
        return new Paypal();
    }
}
