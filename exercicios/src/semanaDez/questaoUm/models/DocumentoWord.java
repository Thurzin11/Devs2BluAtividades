package semanaDez.questaoUm.models;

public class DocumentoWord implements Documento {
    @Override
    public void abrir() {
        System.out.println("Abrindo um Documento do tipo Word");
    }
}
