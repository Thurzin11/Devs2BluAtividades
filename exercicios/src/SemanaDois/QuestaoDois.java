package SemanaDois;

import javax.swing.*;

public class QuestaoDois {
    public static void main(String[] args) {
        String nomesAlunos[] = new String[1];
        Double notasAlunos[][] = new Double[1][4];
        for (int i = 0; i < nomesAlunos.length; i++) {
            nomesAlunos[i] = JOptionPane.showInputDialog("Informe o nome do aluno");
            for (int j = 0; j < 4; j++) {
                if (j == 3) {
                    notasAlunos[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da media dos exercicios do aluno " + nomesAlunos[i]));
                } else {
                    notasAlunos[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da " + (j + 1) + " nota do aluno " + nomesAlunos[i]));
                }
            }
        }
        double mediaAproveitamento = 0;
        for (int i = 0; i < nomesAlunos.length; i++) {
            mediaAproveitamento = 0;
            for (int j = 0; j < 4; j++) {
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
            System.out.printf("Media de aproveitamento do aluno "+nomesAlunos[i]+": é de %.2f", mediaAproveitamento);
        }
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
