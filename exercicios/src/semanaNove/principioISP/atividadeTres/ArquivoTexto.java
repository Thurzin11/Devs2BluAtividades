package semanaNove.principioISP.atividadeTres;

public class ArquivoTexto implements Armazenamento {
    @Override
    public void armazenar() {
        System.out.println("Armazenado em um arquivo texto");
    }
}
