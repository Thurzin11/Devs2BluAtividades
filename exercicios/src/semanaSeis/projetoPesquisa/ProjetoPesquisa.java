package semanaSeis.projetoPesquisa;

import java.util.Date;
import java.util.List;

public class ProjetoPesquisa {
    private String codigo;
    private String titulo;
    private Date dataInicio;
    private Date dataFim;
    private Professor professorResponsavel;
    private List<Pesquisador> equipe;

    public ProjetoPesquisa(String codigo, String titulo, Date dataInicio, Date dataFim, Professor professorResponsavel,List<Pesquisador> equipe) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.professorResponsavel = professorResponsavel;
        this.equipe = equipe;
    }

    public ProjetoPesquisa() {}

    public void adicionarPesquisador(Pesquisador pesquisador) {
        equipe.add(pesquisador);
    }

    public String getCodigo() {
        return codigo;
    }

    public void mostrarDetalhes() {
        System.out.println("Código do Projeto: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Data de Início: " + dataInicio);
        System.out.println("Data de Fim: " + dataFim);
        System.out.println("Professor Responsável: " + professorResponsavel.getNome());
        System.out.println("Equipe:");
        for (Pesquisador pesquisador : equipe) {
            System.out.println("- Nome: " + pesquisador.getNome() + ", Tipo: " + pesquisador.getTipo());
        }
    }
}
