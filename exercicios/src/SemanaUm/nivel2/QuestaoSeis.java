package SemanaUm.nivel2;

import javax.swing.*;

public class QuestaoSeis {
    public static void main(String[] args) {
        Double area = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do area do terreno em metros quadrados: "));
        JOptionPane.showMessageDialog(null, "O valor do terreno convertido em acres é de: "+area*0.000247+
                "\nO valor do terreno em pes quadrados é de: "+area*10.7639+
                "\nO valor do terreno em hectares: "+area*0.0001);
    }
}
