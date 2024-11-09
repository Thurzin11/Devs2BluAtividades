package semanaDez.questaoTres;

import semanaDez.questaoTres.factorys.GUIFactory;
import semanaDez.questaoTres.models.Label;
import semanaDez.questaoTres.models.Textbox;

public class ThemeApplication {
    public Textbox textbox;
    public Label label;

    public ThemeApplication(GUIFactory factory) {
        this.textbox = factory.createTextbox();
        this.label = factory.createLabel();
    }

    public void render(){
        this.textbox.render();
        this.label.render();
    }
}
