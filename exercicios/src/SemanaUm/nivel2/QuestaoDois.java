package SemanaUm.nivel2;

import javax.swing.*;

public class QuestaoDois {
    public static void main(String[] args) {
        double lado = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do lado de um quadrado: "));
        double area = lado * lado;
        JOptionPane.showMessageDialog(null, "O valor da area do quadrado: " + area);
    }
}
