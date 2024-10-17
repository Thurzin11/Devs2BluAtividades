package semanaSeis.projetoPesquisa;

//classe extendendo de funcionario e implementando a interface pesquisador
public class Professor extends Funcionario implements Pesquisador {
//    atributos
    private String nome;

//    contrutores
    public Professor(String nome,Double salario) {
        super(salario);
        this.nome = nome;
    }

    public Professor() {
        super();
    }

//    getters e setters
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