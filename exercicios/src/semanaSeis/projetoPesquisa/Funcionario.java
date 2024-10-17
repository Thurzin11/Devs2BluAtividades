package semanaSeis.projetoPesquisa;

public class Funcionario {
    private Double salario;

    public Funcionario(Double salario) {
        this.salario = salario;
    }

    public Funcionario() {}

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
