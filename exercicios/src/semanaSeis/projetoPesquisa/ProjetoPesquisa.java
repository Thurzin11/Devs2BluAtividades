package semanaSeis.projetoPesquisa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ProjetoPesquisa {
//  atributos
    private String codigo;
    private String titulo;
    private Date dataInicio;
    private Date dataFim;
    private Professor professorResponsavel;
    private List<Pesquisador> equipe;

//    contrutores
    public ProjetoPesquisa(String codigo, String titulo, Date dataInicio, Date dataFim, Professor professorResponsavel,List<Pesquisador> equipe) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.professorResponsavel = professorResponsavel;
        this.equipe = equipe;
    }
    public ProjetoPesquisa() {}


//    getters e setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public List<Pesquisador> getEquipe() {
        return equipe;
    }

    public void setEquipe(List<Pesquisador> equipe) {
        this.equipe = equipe;
    }

//  metodo que retorna uma string dos destalher do Porjeto
    public String mostrarDetalhes() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder messagem = new StringBuilder("Código do Projeto: " + codigo)
                .append("\nTítulo: ").append(titulo)
                .append("\nData de início: ").append(dateFormat.format(dataInicio))
                .append("\nData de fim: ").append(dateFormat.format(dataFim))
                .append("\nProfessor: ").append(professorResponsavel.getNome())
                .append("\nEquipe: ");
        for (Pesquisador pesquisador : equipe) {
            messagem.append("\nNome: ").append(pesquisador.getNome()).append(", Tipo: ").append(pesquisador.getTipo());
        }
        return messagem.toString();
    }
}
