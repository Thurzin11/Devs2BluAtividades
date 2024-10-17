package semanaSeis.projetoPesquisa;

public class Funcionario {
//atributos
    private Double salario;


//    contrutores
    public Funcionario(Double salario) {
        this.salario = salario;
    }

    public Funcionario() {}


//    getters e setters
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
