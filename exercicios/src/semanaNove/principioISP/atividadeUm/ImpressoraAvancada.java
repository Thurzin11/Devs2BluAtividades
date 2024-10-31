package semanaNove.principioISP.atividadeUm;

public class ImpressoraAvancada implements ImpressoraTexto,ImpressoraImagem,ImpressoraRelatorio{
    @Override
    public void imprimirImagem() {
        System.out.println("Imprimindo Imagem");
    }

    @Override
    public void imprimirRelatorioFinanceiro() {
        System.out.println("Imprimindo Relatorio Financeiro");
    }

    @Override
    public void imprimirTexto() {
        System.out.println("Imprimindo Texto");
    }
}
