package semanaOito.AtividadeDois;

public class Bitcoin implements Pagamento{
    @Override
    public String processarPagamento() {
        return "Pagamento sendo processado com Bitcoin";
    }
}
