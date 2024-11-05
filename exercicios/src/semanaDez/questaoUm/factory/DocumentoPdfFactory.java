package semanaDez.questaoUm.factory;

import semanaDez.questaoUm.models.Documento;
import semanaDez.questaoUm.models.DocumentoPDF;

public class DocumentoPdfFactory extends DocumentoFactory{
    @Override
    public Documento criarDocumento() {
        return new DocumentoPDF();
    }
}
