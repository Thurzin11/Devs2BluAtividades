package SemanaTres;

import java.util.Random;
//Questão 3 - Criar um vetor A com 10 elementos inteiros. Escrever um programa
//que calcule e escreva:
//a) a soma de elementos armazenados neste vetor que são inferiores a 15;
//b) a quantidade de elementos armazenados no vetor que são iguais a 15;
//c) a média dos elementos armazenados no vetor que são superiores a 15.
public class QuestaoTres {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int contaQuinze = 0;
        int somaInferioresQuinze = 0;
        int contasSuperioresQuinze = 0;
        double mediaSuperioresQuinze = 0;
        //Instanciando a classe random para gerar e popular o vetor idadesPessoas com idades aleatorias entre 0 e 100
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
            //verifica as condicoes em relacao ao numero e se for, é executado o comando correto para cada caso
            if (numeros[i]<15){
                somaInferioresQuinze += numeros[i];
            }else if (numeros[i]==15){
                contaQuinze++;
            } else if (numeros[i]>15){
                mediaSuperioresQuinze += numeros[i];
                contasSuperioresQuinze++;
            }
        }

        //mostra os elementos
        for(int numero: numeros){
            System.out.print("["+numero+"]");
        }
        //mostra o que foi solicitado
        System.out.println("\nSoma de elementos armazenados neste vetor que são inferiores a 15 é de:"+ somaInferioresQuinze);
        System.out.println("Quantidade de elementos armazenados no vetor que são iguais a 15 é de: " + contaQuinze);
        //faz o calculo de media baseado em Media por quantidade de numeros
        mediaSuperioresQuinze = mediaSuperioresQuinze/contasSuperioresQuinze;
        //mostra ao usuario arredondado com o template string
        System.out.printf("Média dos elementos armazenados no vetor que são superiores a 15 é de: %.2f", mediaSuperioresQuinze);
    }
}
