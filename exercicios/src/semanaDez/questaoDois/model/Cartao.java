package semanaDez.questaoDois.model;

public class Cartao implements Pagamento{
    @Override
    public void processarPagamento() {
        System.out.println("Pagando com Cartao");
    }
}
