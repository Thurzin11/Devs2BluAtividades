package semanaDez.questaoTres.models;

public class LightLabel implements Label {
    @Override
    public void render() {
        System.out.println("Renderizando no modo Claro Label");
    }
}
