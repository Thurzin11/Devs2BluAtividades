package semanaDez.questaoDois;

import semanaDez.questaoDois.factory.CartaoFactory;
import semanaDez.questaoDois.factory.PagamentoFactory;
import semanaDez.questaoDois.factory.PaypalFactory;
import semanaDez.questaoDois.model.Pagamento;

public class Main {
    public static void main(String[] args) {
        PagamentoFactory factory = new CartaoFactory();
        Pagamento pagamento = factory.criarPagamento();
        pagamento.processarPagamento();

        factory = new PaypalFactory();
        pagamento = factory.criarPagamento();
        pagamento.processarPagamento();
    }
}
