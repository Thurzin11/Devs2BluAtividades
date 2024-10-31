package semanaOito.AtividadeQuatro;

public class ExameCovid extends Exame {
    public ExameCovid(String nomePaciente) {
        super(nomePaciente);
    }

    @Override
    public String realizarExame() {
        return "Resultado do Exame de Covid para o paciente " + this.getNomePaciente() + ": Negativo.";
    }
}
