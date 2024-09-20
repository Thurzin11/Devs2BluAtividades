package SemanaDois;

import javax.swing.*;

public class QuestaoSeis {
    public static void main(String[] args) {
//        recebe uma string mas pega o primeiro caracter com o charAt
        String letra = JOptionPane.showInputDialog("Informe uma letra para verificar se é uma vogal ou consoante");
        char letra2 = letra.charAt(0);

        //valida se a letra informada esta dentro do vetor, se estiver, a funcao indexOf retornara 1 senao 0
        // e valida tbm se é uma letra e mostra a messagem com base no resultado
        if ("AEIOUaeiou".indexOf(letra2) != -1 && Character.isLetter(letra2)) {
            JOptionPane.showMessageDialog(null,letra + " é uma vogal.");
        } else if (Character.isLetter(letra2)) {
            JOptionPane.showMessageDialog(null,letra + " é uma consoante.");
        } else {
            JOptionPane.showMessageDialog(null,letra + " não é uma letra.");
        }
    }
}
