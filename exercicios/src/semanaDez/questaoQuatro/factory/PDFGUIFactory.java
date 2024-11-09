package semanaDez.questaoQuatro.factory;

import semanaDez.questaoQuatro.models.Chart;
import semanaDez.questaoQuatro.models.PDFChart;
import semanaDez.questaoQuatro.models.PDFReport;
import semanaDez.questaoQuatro.models.Report;

public class PDFGUIFactory implements GUIFactory {
    @Override
    public Report createReport() {
        return new PDFReport();
    }

    @Override
    public Chart createChart() {
        return new PDFChart();
    }
}
