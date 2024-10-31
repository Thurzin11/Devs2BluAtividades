package semanaOito.AtividadeQuatro;

public class Main {
    public static void main(String[] args) {
        String nomePaciente = "Jose";
        ExameUrina urina = new ExameUrina(nomePaciente);
        System.out.println(urina.realizarExame());
        ExameSangue sangue = new ExameSangue(nomePaciente);
        System.out.println(sangue.realizarExame());
        ExameCovid covid = new ExameCovid(nomePaciente);
        System.out.println(covid.realizarExame());
    }
}