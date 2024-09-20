import javax.swing.*;

//    QUESTÃO_1: Imprima um saldo com reajuste de 1%.
public class QuestaoUm {
    public static void main(String[] args) {
        //Pega o input do usuario
        Double saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe um saldo para o reajuste"));
        //Calcula com base no reajuste
        saldo = saldo + (saldo*0.01);
        //Mostra
        System.out.println("Saldo com o reajuste de 1% "+saldo);
    }
}