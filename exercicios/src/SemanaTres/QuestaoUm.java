package SemanaTres;

import java.util.Random;
//Questão 1 - Criar um vetor A com 10 elementos inteiros. Implementar um programa
//que defina e escreva a média aritmética simples dos elementos
//ímpares armazenados neste vetor.
public class QuestaoUm {
    public static void main(String[] args) {
        //Criando o vetor com 10 posicoes
        int[] a = new int[10];
        //Instanciando a classe random para gerar e popular o vetor a
        Random random = new Random();
        int contaImpar = 0;
        double mediaImpar = 0;

        //for utilizado para percorrer o array e adicionar numeros aleatorios entre 0 a 10
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
            if (a[i]%2!=0){
                mediaImpar += a[i];
                contaImpar++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print("["+a[i]+"]");
        }
        mediaImpar = mediaImpar/contaImpar;
        System.out.println("\nQuantidade de elementos impares é de: "+ contaImpar);
        System.out.printf("Média dos elementos impares é de: %.2f", mediaImpar);

    }
}
