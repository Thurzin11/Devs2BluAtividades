package semanaOito.AtividadeQuatro;

public class ExameUrina extends Exame {
    public ExameUrina(String nomePaciente) {
        super(nomePaciente);
    }

    @Override
    public String realizarExame() {
        return "Resultado do Exame de Urina para o paciente " + this.getNomePaciente() + ": Normal.";
    }
}