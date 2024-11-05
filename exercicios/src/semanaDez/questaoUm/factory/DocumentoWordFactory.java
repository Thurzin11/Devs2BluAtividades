package semanaDez.questaoUm.factory;

import semanaDez.questaoUm.models.Documento;
import semanaDez.questaoUm.models.DocumentoWord;

public class DocumentoWordFactory extends DocumentoFactory{
    @Override
    public Documento criarDocumento() {
        return new DocumentoWord();
    }
}
