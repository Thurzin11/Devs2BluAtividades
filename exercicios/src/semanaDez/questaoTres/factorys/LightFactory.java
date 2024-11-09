package semanaDez.questaoTres.factorys;

import semanaDez.questaoTres.models.Label;
import semanaDez.questaoTres.models.LightLabel;
import semanaDez.questaoTres.models.LightTextBox;
import semanaDez.questaoTres.models.Textbox;

public class LightFactory implements GUIFactory{

    @Override
    public Textbox createTextbox() {
        return new LightTextBox();
    }

    @Override
    public Label createLabel() {
        return new LightLabel();
    }
}
