package semanaCinco.exercicioUm;

public class Administrativo extends Assistente{
    public Administrativo() {
        super();
    }

    public Administrativo(String nome, double salario, Integer matricula) {
        super(nome, salario, matricula);
    }

    @Override
    public void exibeDados(){
        System.out.println("Esse é um administrativo");
        super.exibeDados();
    }
}
