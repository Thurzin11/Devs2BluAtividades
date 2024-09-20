package SemanaUm.nivel2;

import javax.swing.*;

public class QuestaoUm {
    public static void main(String[] args) {
        double catetoUm = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do primeiro cateto: "));
        double catetoDois = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do segundo cateto: "));
        double hipotenusa = (catetoDois*catetoDois) + (catetoUm*catetoUm);
        hipotenusa = Math.sqrt(hipotenusa);
        JOptionPane.showMessageDialog(null, "O valor do cateto: " + hipotenusa);
    }
}
