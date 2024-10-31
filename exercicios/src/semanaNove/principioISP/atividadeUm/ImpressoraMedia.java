package semanaNove.principioISP.atividadeUm;

public class ImpressoraMedia implements ImpressoraTexto,ImpressoraImagem{
    @Override
    public void imprimirImagem() {
        System.out.println("Imprimindo Imagem");
    }


    @Override
    public void imprimirTexto() {
        System.out.println("Imprimindo Texto");
    }
}
