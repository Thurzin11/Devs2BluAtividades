package SemanaDois;

import javax.swing.*;

public class QuestaoQuatro {
    public static void main(String[] args) {
        double[] valores = new double[2];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + ": "));
        }
        String operacao = JOptionPane.showInputDialog("Digite a operação a ser feita: ");
        double valor = 0;
        System.out.println(calculaValores(operacao,valores));
    }

    public static String calculaValores(String operacao,double[] valores){
        double resultado;
        switch (operacao) {
            case "+":
                resultado = valores[0] + valores[1];
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
