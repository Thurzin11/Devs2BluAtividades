package SemanaUm.nivel2;

import javax.swing.*;

public class QuestaoQuatro {
    public static void main(String[] args) {
        int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Informe o velocidade em que o carro está viajando: "));
        double distancia = velocidade * 5;
        double distancia2 = velocidade * 8;
        double distancia3 = velocidade * 12;
        JOptionPane.showMessageDialog(null, "A distancia percorrida em 5 horas foi será: "+distancia+ "\n" +
                "A distancia percorrida em 8 horas é de: "+distancia2+"\n" +
                "A distancia percorrida em 12 horas é de: "+distancia3);
    }
}
