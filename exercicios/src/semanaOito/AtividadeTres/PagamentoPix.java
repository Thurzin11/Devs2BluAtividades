package semanaOito.AtividadeTres;

public class PagamentoPix extends Pagamento{
    @Override
    public String processarPagamento() {
        return "Pagamento sendo feito com Pix";
    }
}
