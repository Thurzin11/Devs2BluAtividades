package semanaDez.questaoQuatro.factory;

import semanaDez.questaoQuatro.models.Chart;
import semanaDez.questaoQuatro.models.Report;

public interface GUIFactory {
    Report createReport();
    Chart createChart();
}
