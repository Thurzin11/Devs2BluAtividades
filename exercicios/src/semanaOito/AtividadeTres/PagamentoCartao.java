package semanaOito.AtividadeTres;

public class PagamentoCartao extends Pagamento{
    @Override
    public String processarPagamento() {
        return "Pagamento sendo feito com Cartao";
    }
}
