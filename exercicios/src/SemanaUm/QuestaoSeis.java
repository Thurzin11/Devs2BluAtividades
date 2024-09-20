package SemanaUm;

import javax.swing.*;

//QUESTÃO _6: Sabendo que a Copiadora da Faculdade Maurício
//de Nassau cobra R$ 0,08 por cada cópia feita, escreva um
//programa que receba como entrada a quantidade de folhas de um
//livro e exiba o valor total a ser pago para copiá-lo. (Lembrete:
//cada folha corresponde a duas páginas, frente e verso).
public class QuestaoSeis {
    public static void main(String[] args) {
        //Pega o input do usuario
        int quantidadeFolhas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de folhas para o calculo do valor das cópias"));

        //Dobra a quantidade de folhas pois a folha equivale a duas
        quantidadeFolhas = quantidadeFolhas*2;

        //Faz o calculo do valor a ser pago com base no valor da copia
        double valorPagar = quantidadeFolhas*0.08;

        //Mostra ao usuario o valor a ser pago
        JOptionPane.showMessageDialog(null,"O valor a ser pago por cada folha é de: "+valorPagar);
    }
}
