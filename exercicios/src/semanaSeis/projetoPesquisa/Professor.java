package semanaSeis.projetoPesquisa;

public class Professor extends Funcionario implements Pesquisador {
    private String nome;

    public Professor(String nome,Double salario) {
        super(salario);
        this.nome = nome;
    }

    public Professor() {
        super();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return "Professor";
    }
}