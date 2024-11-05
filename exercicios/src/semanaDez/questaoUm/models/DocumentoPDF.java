package semanaDez.questaoUm.models;

public class DocumentoPDF implements Documento{
    @Override
    public void abrir() {
        System.out.println("Abrindo um documento do tipo PDF");
    }
}
