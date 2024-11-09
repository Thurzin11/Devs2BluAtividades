package semanaDez.questaoTres.factorys;

import semanaDez.questaoTres.models.Label;
import semanaDez.questaoTres.models.Textbox;

public interface GUIFactory {
    Textbox createTextbox();
    Label createLabel();
}