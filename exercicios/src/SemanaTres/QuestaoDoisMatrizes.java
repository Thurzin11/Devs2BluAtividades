package SemanaTres;

import javax.swing.*;

//Questão 2 –  Acrescente na questão anterior a idade dos filhos e imprima além dos nomes
//dos filhos  também a idade.
public class QuestaoDoisMatrizes {
    public static void main(String[] args) {
        //É setado apenas a quantidade de entrevistados pois cada entrevistado tera uma quantidade de filhos diferente
        int quantidadeEntrevistados = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de entrevistados"));
        String[][][] filhos = new String[quantidadeEntrevistados][][];

        //percorrera a matriz de acordo com a quantidade de entrevistados e de acordo com a quantidade de filhos deles
        for (int i = 0; i < quantidadeEntrevistados; i++) {
            int quantidadeFilhos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de filhos "));
            //é criado um matriz de string dentro da coluna da matriz de acordo com a quantidade de filhos do entrevistado
            filhos[i] = new String[quantidadeFilhos][2];
            for (int j = 0; j < quantidadeFilhos; j++) {
                //popula com os nomes e idades
                filhos[i][j][0] = JOptionPane.showInputDialog("Informe o nome do seu " + (j + 1) + " filho");
                filhos[i][j][1] = JOptionPane.showInputDialog("Informe a idade do seu " + (j + 1) + " filho");
            }
        }
        //percorre a matriz e o array dentro da matriz para mostrar os nomes dos filhos e as idades
        for (int i = 0; i < filhos.length; i++) {
            System.out.println("Entrevistado " + (i + 1) + " tem " + filhos[i].length + " filhos: ");
            for (int j = 0; j < filhos[i].length; j++) {
                System.out.println("Nome: " + filhos[i][j][0] + ", Idade: " + filhos[i][j][1]);
            }
            System.out.println();
        }
    }
}
