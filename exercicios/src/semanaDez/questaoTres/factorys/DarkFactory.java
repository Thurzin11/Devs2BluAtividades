package semanaDez.questaoTres.factorys;

import semanaDez.questaoTres.models.DarkLabel;
import semanaDez.questaoTres.models.DarkTextBox;
import semanaDez.questaoTres.models.Label;
import semanaDez.questaoTres.models.Textbox;

public class DarkFactory implements GUIFactory{

    @Override
    public Textbox createTextbox() {
        return new DarkTextBox();
    }

    @Override
    public Label createLabel() {
        return new DarkLabel();
    }
}
