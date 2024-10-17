package semanaSeis.projetoPesquisa;

//aluno implementando a interface pesquisador
public class Aluno implements Pesquisador {
//    atributo
    private String nome;

//    getters e setters
    public Aluno(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return "Aluno";
    }
}