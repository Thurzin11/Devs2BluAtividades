package semanaOito.AtividadeDois;

public class Paypal implements Pagamento{

    @Override
    public String processarPagamento() {
        return "Pagamento sendo processado com Paypal";
    }
}
