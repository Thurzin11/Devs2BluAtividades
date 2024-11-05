package semanaDez.questaoUm;

import semanaDez.questaoUm.factory.DocumentoFactory;
import semanaDez.questaoUm.factory.DocumentoPdfFactory;
import semanaDez.questaoUm.factory.DocumentoWordFactory;
import semanaDez.questaoUm.models.Documento;

public class Cliente {
    public static void main(String[] args) {
        DocumentoFactory factory = new DocumentoWordFactory();
        Documento documentoWord = factory.criarDocumento();
        documentoWord.abrir();

        factory = new DocumentoPdfFactory();
        Documento documentoPDF = factory.criarDocumento();
        documentoPDF.abrir();
    }
}
