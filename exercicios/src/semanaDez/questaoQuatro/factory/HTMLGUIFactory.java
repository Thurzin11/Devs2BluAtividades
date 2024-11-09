package semanaDez.questaoQuatro.factory;

import semanaDez.questaoQuatro.models.Chart;
import semanaDez.questaoQuatro.models.HTMLChart;
import semanaDez.questaoQuatro.models.HTMLReport;
import semanaDez.questaoQuatro.models.Report;

public class HTMLGUIFactory implements GUIFactory {
    @Override
    public Report createReport() {
        return new HTMLReport();
    }

    @Override
    public Chart createChart() {
        return new HTMLChart();
    }
}
