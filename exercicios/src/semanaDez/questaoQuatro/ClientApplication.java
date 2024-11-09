package semanaDez.questaoQuatro;

import semanaDez.questaoQuatro.factory.GUIFactory;
import semanaDez.questaoQuatro.models.Chart;
import semanaDez.questaoQuatro.models.Report;

public class ClientApplication {
    Report report;
    Chart chart;
    public ClientApplication(GUIFactory guiFactory) {
        this.chart = guiFactory.createChart();
        this.report = guiFactory.createReport();
    }
    public void generate(){
        this.chart.generateChart();
        this.report.generateReport();
    }
}
