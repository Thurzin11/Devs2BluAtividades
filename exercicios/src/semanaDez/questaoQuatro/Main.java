package semanaDez.questaoQuatro;

import semanaDez.questaoQuatro.factory.GUIFactory;
import semanaDez.questaoQuatro.factory.HTMLGUIFactory;
import semanaDez.questaoQuatro.factory.PDFGUIFactory;
import semanaDez.questaoTres.ThemeApplication;
import semanaDez.questaoTres.factorys.DarkFactory;
import semanaDez.questaoTres.factorys.LightFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        factory = new HTMLGUIFactory();
        factory.createChart();
        factory.createReport();
        ClientApplication client = new ClientApplication(factory);
        client.generate();
        factory = new PDFGUIFactory();
        factory.createChart();
        factory.createReport();
        client = new ClientApplication(factory);
        client.generate();
    }
}
