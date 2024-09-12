import javax.swing.*;

//QUESTÃO _9: Em épocas de pouco dinheiro, os comerciantes
//estão procurando aumentar suas vendas oferecendo desconto. Faça
//um programa que possa receber um valor de um produto e que
//escreva o novo valor tendo em vista que o desconto foi de 9%.
public class QuestaoNove {
    public static void main(String[] args) {
        //Pega o input do usuario
        Double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de um produto que possa receber o desconto de 9%"));

        //Calcula o valor do desconto
        Double desconto = valorProduto*0.09;

        //Diminui o desconto
        valorProduto = valorProduto - desconto;

        //Mostra ao usuario o valor do desconto e o valor do produto com o desconto
        JOptionPane.showMessageDialog(null,"O valor do produto com o desconto de 9% ficaria: R$"+valorProduto+ " voce recebeu o desconto de R$"+desconto+"!!!");
    }
}
