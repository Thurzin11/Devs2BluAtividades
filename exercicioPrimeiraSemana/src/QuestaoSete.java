import javax.swing.*;

//QUESTÃO _7: Que leia o nome e a idade de uma pessoal.
//Determine quantos dias aproximadamente esta pessoa já viveu.
//Escreva o nome da pessoa e o número de dias vividos
public class QuestaoSete {
    public static void main(String[] args) {
        //Pega o input do usuario
        String nome = JOptionPane.showInputDialog("Informe o seu nome");
        Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));

        //Mostra ao usuario a idade deles em dias com base na funcao da propria classe
        JOptionPane.showMessageDialog(null,nome+" tem "+idade*365+" dias vividos");
    }
}
