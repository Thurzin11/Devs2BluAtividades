package SemanaUm;

import javax.swing.*;
//QUESTÃO _8: Que informando uma hora qualquer, retorne
//quantos minutos e segundos correspondem a hora informada.
public class QuestaoOito {
    public static void main(String[] args) {
        //Pega o input do usuario
        Double horaInformada = Double.parseDouble(JOptionPane.showInputDialog("Informe uma hora no formato abaixo \n hh"));

        //Mostra ao usuario a hora informada em minutos e a hora em segundos
        JOptionPane.showMessageDialog(null,"A hora informada tem "+horaInformada*60+ " minutos e tem "+horaInformada*3600+" segundos");
    }
}
