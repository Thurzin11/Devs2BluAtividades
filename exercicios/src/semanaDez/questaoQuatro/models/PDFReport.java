package semanaDez.questaoQuatro.models;

public class PDFReport implements Report {
    @Override
    public void generateReport() {
        System.out.println("Gerando PDF report");
    }
}
