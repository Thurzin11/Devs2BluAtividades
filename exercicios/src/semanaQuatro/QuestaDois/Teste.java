package semanaQuatro.QuestaDois;
import javax.swing.*;
import java.time.LocalTime;

public class Teste {
    LocalTime dataGeracao = LocalTime.now();
    Questao[] questoes;

    public Teste() {}

    public Teste(LocalTime dataGeracao, Questao[] questoes) {
        this.dataGeracao = dataGeracao;
        this.questoes = questoes;
    }
    public void gerarTeste(){
        int quantidadeQuestao = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de questoes"));
        this.questoes = new Questao[quantidadeQuestao];
        Disciplina disciplina = new Disciplina();
        disciplina.gerarDiciplina(quantidadeQuestao);
        this.questoes = disciplina.questoes;
    }

    public String exibeQuestoes(){
        StringBuilder questoes = new StringBuilder();
        for (int i = 0; i < this.questoes.length; i++) {
            questoes.append(" ").append(this.questoes[i].mostrarQuestao(i+1));
        }
        return questoes.toString();
    }

    public String mostrarTeste() {
        return "Teste:" +
                "\n DataGeracao: " + dataGeracao.getHour() +":"+ dataGeracao.getMinute()+
                "\n Questoes:" + this.exibeQuestoes();
    }
}
