package semanaCinco.exercicioUm;

public class Tecnico extends Assistente{

    public Tecnico(String nome, double salario, Integer matricula) {
        super(nome, salario, matricula);
    }

    public Tecnico() {
        super();
    }

    @Override
    public void exibeDados() {
        System.out.println("Esse é um tecnico");
        super.exibeDados();
    }
}
