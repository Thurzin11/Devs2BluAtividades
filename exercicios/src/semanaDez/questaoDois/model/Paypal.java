package semanaDez.questaoDois.model;

public class Paypal implements Pagamento{
    @Override
    public void processarPagamento() {
        System.out.println("Pagando com o Paypal");
    }
}
