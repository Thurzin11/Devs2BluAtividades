package SemanaDois;

import javax.swing.*;

public class QuestaoQuatro {
    public static void main(String[] args) {
        double[] valores = new double[2];
        //pede ao usuario dois valores e os valores serao armazenados em um vetor
        for (int i = 0; i < valores.length; i++) {
            valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + ": "));
        }
        String operacao = JOptionPane.showInputDialog("Digite a operação a ser feita: ");
        double valor = 0;
        //mostra o retorno da funcao calculaValores() q é do tipo string
        System.out.println(calculaValores(operacao,valores));
    }

    //funcao q retorna uma string e recebe dois parametros
    public static String calculaValores(String operacao,double[] valores){
        double resultado;
        //valida a operacao escolhida
        switch (operacao) {
            case "+":
                //faz o calculo de acordo com a operacao escolhida
                resultado = valores[0] + valores[1];
                //retorna uma string q contem dois if ternario q passam strings tbm
                return "Resultado: "+resultado+" e resultado é "+((resultado% 2 == 0) ? " Par" : " Ímpar")
                        +" e "+ ((resultado>= 0) ? "Positivo" : "Negativo");
            case "-":
                resultado = valores[0] - valores[1];
                return "Resultado: "+resultado+" e resultado é "+((resultado% 2 == 0) ? "Par" : "Ímpar")
                        +" e "+ ((resultado>= 0) ? "Positivo" : "Negativo");
            case "*":
                resultado = valores[0] * valores[1];
                return "Resultado: "+resultado+" e resultado é "+((resultado% 2 == 0) ? "Par" : "Ímpar")
                        +" e "+ ((resultado>= 0) ? "Positivo" : "Negativo");
            case "/":
                resultado = valores[0] / valores[1];
                return "Resultado: "+resultado+" e resultado é "+((resultado% 2 == 0) ? "Par" : "Ímpar")
                        +" e "+ ((resultado>= 0) ? "Positivo" : "Negativo");
            default:
                return "Operacao invalida";
        }
    }
}
