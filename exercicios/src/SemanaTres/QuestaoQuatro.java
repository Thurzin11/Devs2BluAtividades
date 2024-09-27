package SemanaTres;

import javax.swing.*;

//Questão 4 – Escreva um programa que receba o nome de cinco clientes e armazene-os em
//um vetor. Em um segundo vetor, armazene a quantidade de DVDs locados em 2022 por
//cada um dos cinco clientes. Sabe-se que, para cada dez locações, o cliente tem direito a
//uma locação grátis. O programa deverá mostrar todos os nomes dos clientes com a
//quantidade de locação grátis que ele tem direito.
public class QuestaoQuatro {
    public static void main(String[] args) {
        String[] nomeClientes = new String[5];
        int[] quantidadeDvdsAlocadosCliente = new int[nomeClientes.length];
        for(int i = 0;i < nomeClientes.length;i++){
            nomeClientes[i] = JOptionPane.showInputDialog("Informe o seu nome");
            quantidadeDvdsAlocadosCliente[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de DVDs locados em 2022"));
        }
        for(int i = 0;i < nomeClientes.length;i++){
            System.out.print("["+nomeClientes[i]+" "+quantidadeDvdsAlocadosCliente[i]+"]");
        }
        System.out.println();
        for(int i = 0;i < nomeClientes.length;i++){
            System.out.println("O cliente "+nomeClientes[i]+" tem direito a : "+quantidadeDvdsAlocadosCliente[i]/10);
        }

    }
}
