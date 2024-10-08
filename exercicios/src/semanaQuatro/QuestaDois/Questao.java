package semanaQuatro.QuestaDois;

import javax.swing.*;
import java.util.Arrays;

public class Questao {
    String enunciado;
    String[] opcoes;
    String respostaCorreta;
    Integer bimestre;
    Materia materia;

    public Questao() {}

    public Questao(String enunciado, String[] opcoes, String respostaCorreta, Integer bimestre, Materia materia) {
        this.enunciado = enunciado;
        this.opcoes = opcoes;
        this.respostaCorreta = respostaCorreta;
        this.bimestre = bimestre;
        this.materia = materia;
    }

    public Questao gerarQuestao(Disciplina disciplina){
        this.enunciado = JOptionPane.showInputDialog("Informe um enunciado");
        int quantidadeOpcoes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de opcoes"));
        this.opcoes = new String[quantidadeOpcoes];
        for (int i = 0; i < opcoes.length ; i++) {
            opcoes[i] = JOptionPane.showInputDialog("Informe a "+(i+1)+" opcão");
        }
        this.respostaCorreta = JOptionPane.showInputDialog("Informe a resposta correta");
        this.bimestre = Integer.parseInt(JOptionPane.showInputDialog("Informe o bimestre"));
        this.materia = new Materia();
        materia.gerarMateria(disciplina);
        return this;
    }

    public String mostrarQuestao(int numeroQuestao) {
        return  "\n Enunciado: "+numeroQuestao+ ") " + enunciado +
                "\n Opcoes: " + Arrays.toString(opcoes) +
                "\n Resposta Correta: " + respostaCorreta +
                "\n Bimestre: " + bimestre +
                "\n Materia: " + materia.mostraMateria();
    }
}
