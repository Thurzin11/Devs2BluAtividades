package semanaDez.questaoTres.models;

public class DarkTextBox implements Textbox{
    @Override
    public void render() {
        System.out.println("Renderizando no modo Escuro Text Box");
    }
}
