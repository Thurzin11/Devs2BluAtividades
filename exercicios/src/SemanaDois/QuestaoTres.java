package SemanaDois;

import javax.swing.*;

public class QuestaoTres {
    public static void main(String[] args) {
        //entrada de dados
        double saldoMedio = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo medio"));
        //mostra o retorno da funcao calculaCredito()
        JOptionPane.showMessageDialog(null,calculaCredito(saldoMedio));
    }

    public static String calculaCredito(Double saldoMedio){
        String messagem;
        //valida e retorna de acordo com a regra
        if (saldoMedio>=201 && saldoMedio<=400) {
            return messagem = "Parabens voce recebeu um credito de: "+saldoMedio*0.20;
        }
        if (saldoMedio>=401 && saldoMedio<=600) {
            return messagem = "Parabens voce recebeu um credito de: "+saldoMedio*0.30;
        }
        if (saldoMedio>=601) {
            return messagem = "Parabens voce recebeu um credito de: "+saldoMedio*0.40;
        }
        return messagem = "Nenhum crédito";
    }
}
