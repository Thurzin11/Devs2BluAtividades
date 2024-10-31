package semanaOito.AtividadeDois;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cartaoCredito = new CartaoCredito();
        System.out.println(cartaoCredito.processarPagamento());
        Bitcoin bitcoin = new Bitcoin();
        System.out.println(bitcoin.processarPagamento());
        Paypal paypal = new Paypal();
        System.out.println(paypal.processarPagamento());
    }
}
