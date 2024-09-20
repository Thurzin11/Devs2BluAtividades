package SemanaDois;

import javax.swing.*;

public class QuestaoDois {
    public static void main(String[] args) {
        // vetor q se aplica a quantidade de alunos necessaria, se precisar mais, só alterar o tamanho do vetor e o tamanho da matriz
        String[] nomesAlunos = new String[1];
        //matriz é baseada assim
        //[nota1][nota2][nota3][mediaExercicios]
        //cada linha é um aluno e cada coluna um "campo"
        Double[][] notasAlunos = new Double[1][4];
        //percorre o vetor ate o tamanho do vetor
        for (int i = 0; i < nomesAlunos.length; i++) {
            nomesAlunos[i] = JOptionPane.showInputDialog("Informe o nome do aluno");
            //percorre ate a ultima coluna da matriz atribuindo valores
            for (int j = 0; j < 4; j++) {
                //se a coluna for a ultima, ele muda o tipo de pergunta pergunta
                if (j == 3) {
                    notasAlunos[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da media dos exercicios do aluno " + nomesAlunos[i]));
                } else {
                    notasAlunos[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da " + (j + 1) + " nota do aluno " + nomesAlunos[i]));
                }
            }
        }
        double mediaAproveitamento = 0;
        //percorre o vetor com base no tamanho dele que é a quantidade de alunos
        for (int i = 0; i < nomesAlunos.length; i++) {
            mediaAproveitamento = 0;
            //percorre as colunas da matriz
            for (int j = 0; j < 4; j++) {
                //verifica o indice com base no calculo nota1 = j = 0, nota2 = j = 1 e assim sucessivamente
                // e faz o calculo necessario para cada nota
                switch (j) {
                    case 0:
                        mediaAproveitamento = notasAlunos[i][j];
                        break;
                    case 1:
                        mediaAproveitamento += notasAlunos[i][j] * 2;
                        break;
                    case 2:
                        mediaAproveitamento += notasAlunos[i][j] * 3;
                        break;
                    case 3:
                        mediaAproveitamento += notasAlunos[i][j];
                }
            }
            mediaAproveitamento = mediaAproveitamento / 7;
            //mostra a media formatada
            System.out.printf("Media de aproveitamento do aluno "+nomesAlunos[i]+": é de %.2f", mediaAproveitamento);
        }
        //mostra a nota final com base na media
        if (mediaAproveitamento<6){
            JOptionPane.showMessageDialog(null,"Sua nota final é D");
        }
        if (mediaAproveitamento>=6 && mediaAproveitamento<7.5){
            JOptionPane.showMessageDialog(null,"Sua nota final é C");
        }
        if (mediaAproveitamento>=7.5 && mediaAproveitamento<9){
            JOptionPane.showMessageDialog(null,"Sua nota final é B");
        }
        if (mediaAproveitamento>=9){
            JOptionPane.showMessageDialog(null,"Sua nota final é A");
        }
    }
}
