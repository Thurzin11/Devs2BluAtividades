package semanaCinco.exercicioUm;

public class Assistente extends Funcionario{
    private Integer matricula;

    public Assistente() {
        super();
    }

    public Assistente(String nome, double salario, Integer matricula) {
        super(nome,salario);
        this.matricula = matricula;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibeDados() {
        System.out.println("Esse é um assistente");
        super.exibeDados();
        System.out.println("Matricula: " + matricula);
    }
}
