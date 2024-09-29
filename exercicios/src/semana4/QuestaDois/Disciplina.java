package semana4.QuestaDois;

import javax.swing.*;
import java.util.Arrays;

public class Disciplina {
    String nome;
    Questao[] questoes;

    public Disciplina() {}

    public Disciplina(String nome, Questao[] questoes) {
        this.nome = nome;
        this.questoes = questoes;
    }

    public void adicionarQuestao(Questao[] questoes){
        this.questoes = questoes;
    }

    public void gerarDiciplina(int quantidadeQuestao){
        this.nome = JOptionPane.showInputDialog("Informe o nome da disciplina");
        this.questoes = new Questao[quantidadeQuestao];
        for (int i = 0; i < this.questoes.length; i++) {
            this.questoes[i] = new Questao().gerarQuestao(this);
        }
    }

    public String mostrarDisciplina() {
        return nome;
    }
}
