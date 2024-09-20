package SemanaDois;

import javax.swing.*;

public class QuestaoSete {
    public static void main(String[] args) {
        int ano;
        Boolean isBissexto;
        ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano para verificar se é bissexto "));
        //mostra ao usuario com base no retorno da funcao no if ternario
        JOptionPane.showMessageDialog(null,"O ano informado "+(verificaAno(ano)? "é bissexto":"nao é bissexto"));

    }

    public static boolean verificaAno(int ano){
        //verifica se o ano é bissexto
        if (ano%400==0)
            return true;
        return false;
    }
}
