package semanaOito.AtividadeQuatro;

abstract class Exame {
    private String nomePaciente;

    public Exame(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public Exame() {}

    public abstract String realizarExame();

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
}
