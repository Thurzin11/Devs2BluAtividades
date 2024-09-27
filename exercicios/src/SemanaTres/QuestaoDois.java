package SemanaTres;

import java.util.Random;

//Questão 2 - Ler um vetor A com 10 elementos inteiros correspondentes as idades
//de um grupo de pessoas. Escreva um programa que determine e
//escreva a quantidade de pessoas que possuem idade superior a 35
//anos.
public class QuestaoDois {
    public static void main(String[] args) {
        int[] idadesPessoas = new int[10];
        int contaPessoasMaisVelhas = 0;
        //Instanciando a classe random para gerar e popular o vetor idadesPessoas com idades aleatorias entre 0 e 80
        Random random = new Random();
        for (int i = 0; i < idadesPessoas.length; i++) {
            idadesPessoas[i] = random.nextInt(80);
            //verifica se a idade é maior q 35 e se for, atribui 1 ao contador
            if (idadesPessoas[i]>35){
                contaPessoasMaisVelhas++;
            }
        }
        //Somente mostra o vetor completo
        for (int i = 0; i < idadesPessoas.length; i++) {
            System.out.print("["+idadesPessoas[i]+"]");
        }
        //Mostra o resultado final
        System.out.println("\nA quantidade de pessoas com idade acima de 35 é de "+contaPessoasMaisVelhas);
    }
}
