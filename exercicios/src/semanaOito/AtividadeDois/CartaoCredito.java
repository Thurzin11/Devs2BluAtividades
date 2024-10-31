package semanaOito.AtividadeDois;

public class CartaoCredito implements Pagamento{

    @Override
    public String processarPagamento() {
        return "Pagamento sendo processado com Cartao de Credito";
    }
}
