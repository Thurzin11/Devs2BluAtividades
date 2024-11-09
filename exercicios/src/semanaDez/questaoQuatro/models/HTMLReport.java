package semanaDez.questaoQuatro.models;

public class HTMLReport implements Report {
    @Override
    public void generateReport() {
        System.out.println("Gerando HTML Report");
    }
}
