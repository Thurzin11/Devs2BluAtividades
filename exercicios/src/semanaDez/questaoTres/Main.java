package semanaDez.questaoTres;

import semanaDez.questaoTres.factorys.DarkFactory;
import semanaDez.questaoTres.factorys.GUIFactory;
import semanaDez.questaoTres.factorys.LightFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        factory = new DarkFactory();
        factory.createLabel();
        factory.createTextbox();
        ThemeApplication theme = new ThemeApplication(factory);
        theme.render();
        factory = new LightFactory();
        factory.createLabel();
        factory.createTextbox();
        theme = new ThemeApplication(factory);
        theme.render();
    }
}
