package SemanaTres;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Questão 1 - Escreva um programa para guardar dados de uma pesquisa feita com uma
//amostra de pessoas da avenida mais movimentada da cidade onde você mora.
//A pesquisa  consiste em perguntar ao cidadão a quantidade de filhos  e o nome de cada
//filho.  Guarde  essas  informações em uma matriz  de forma que cada pessoa entrevistada
//ocupe  somente o espaço necessário  na memória para guardar os nomes  dos filhos.
//Imprima a quantidade de pessoas entrevistadas, a quantidade  de filhos  de cada
//entrevistado  e os  respectivos nomes dos filhos.
public class QuestraoUmMatrizes {
    public static void main(String[] args) {
        //É setado apenas a quantidade de entrevistados pois cada entrevistado tera uma quantidade de filhos diferente
        int quantidadeEntrevistados = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de entrevistados"));
        String[][] filhos = new String[quantidadeEntrevistados][];

        //percorrera a matriz de acordo com a quantidade de entrevistados e de acordo com a quantidade de filhos deles
        for (int i = 0; i < quantidadeEntrevistados; i++) {
            int quantidadeFilhos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de filhos "));
            //é criado um array de string dentro da coluna da matriz de acordo com a quantidade de filhos do entrevistado
            filhos[i] = new String[quantidadeFilhos];
            for (int j = 0; j < quantidadeFilhos; j++) {
                //popula com os nomes
                filhos[i][j] = JOptionPane.showInputDialog("Informe o nome do seu "+(j+1)+" filho");
            }
        }
        //percorre a matriz e o array dentro da matriz para mostrar os nomes dos filhos
            for(int i = 0;i < filhos.length;i++) {
                System.out.println("Entrevistado "+ (i+1)+" tem "+filhos[i].length+ " filhos: ");
                for (String filho: filhos[i]){
                    System.out.print(filho + " ");
                }
                System.out.println();
            }
    }
}
