package semanaDez.questaoTres.models;

public class DarkLabel implements Label {
    @Override
    public void render() {
        System.out.println("Renderizando no modo Escuro Label");
    }
}
