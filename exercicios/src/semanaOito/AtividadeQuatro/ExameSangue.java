package semanaOito.AtividadeQuatro;

public class ExameSangue extends Exame {
    public ExameSangue(String nomePaciente) {
        super(nomePaciente);
    }

    @Override
    public String realizarExame() {
        return "Resultado do Exame de Sangue para o paciente " + this.getNomePaciente() + ": Hemoglobina normal.";
    }
}
