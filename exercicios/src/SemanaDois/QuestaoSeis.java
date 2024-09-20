package SemanaDois;

import javax.swing.*;

public class QuestaoSeis {
    public static void main(String[] args) {
        String letra = JOptionPane.showInputDialog("Informe uma letra para verificar se é uma vogal ou consoante");
        char letra2 = letra.charAt(0);

        if ("AEIOUaeiou".indexOf(letra2) != -1 && Character.isLetter(letra2)) {
            JOptionPane.showMessageDialog(null,letra + " é uma vogal.");
        } else if (Character.isLetter(letra2)) {
            JOptionPane.showMessageDialog(null,letra + " é uma consoante.");
        } else {
            JOptionPane.showMessageDialog(null,letra + " não é uma letra.");
        }
    }
}
