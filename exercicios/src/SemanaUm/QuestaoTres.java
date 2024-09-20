package SemanaUm;

import javax.swing.*;

//QUESTÃO_3: Imprima a soma de dois valores e o seu dobro.
public class QuestaoTres {
    public static void main(String[] args) {
        //Pega os inputs do usuario
        Double valorUm = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
        Double valorDois = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));

        //Soma os valores
        Double somaValores = valorUm + valorDois;

        //Mostra a soma dos valores e o dobro deles e o dobro da soma deles
        JOptionPane.showMessageDialog(null,"Soma dos valores: "+somaValores);
        JOptionPane.showMessageDialog(null,"Dobro do primeiro valor: "+valorUm*2);
        JOptionPane.showMessageDialog(null,"Dobro do segundo valor: "+valorDois*2);
        JOptionPane.showMessageDialog(null,"Dobro da soma dos valores: "+somaValores*2);
    }
}
