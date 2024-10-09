package semanaCinco.exercicioUm;

public class Funcionario {
    private String nome;
    private Double salario;

    public Funcionario() {}

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double addAumento(double aumento) {
        this.salario += aumento;
        return this.salario;
    }

    public double ganhoAnual(){
        return this.salario*12;
    }

    public void exibeDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
