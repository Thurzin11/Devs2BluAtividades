import entity.Pessoa;

import javax.swing.*;

//QUESTÃO _7: Que leia o nome e a idade de uma pessoal.
//Determine quantos dias aproximadamente esta pessoa já viveu.
//Escreva o nome da pessoa e o número de dias vividos
public class QuestaoSete {
    public static void main(String[] args) {
        //Pega o input do usuario
        String nome = JOptionPane.showInputDialog("Informe o seu nome");
        Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));

        // Cria um novo objeto da classe pessoa com os dados informados
        Pessoa pessoa1 =  new Pessoa(nome,idade);

        //Mostra ao usuario a idade deles em dias com base na funcao da propria classe
        JOptionPane.showMessageDialog(null,pessoa1.getNome()+" tem "+pessoa1.calculaIdadeDias()+" dias vividos");
    }
}
