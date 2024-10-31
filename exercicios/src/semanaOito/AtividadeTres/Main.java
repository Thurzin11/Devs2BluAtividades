package semanaOito.AtividadeTres;

public class Main {
    public static void main(String[] args) {
        PagamentoCartao cartao = new PagamentoCartao();
        System.out.println(cartao.processarPagamento());
        PagamentoPix pix = new PagamentoPix();
        System.out.println(pix.processarPagamento());
    }
}
