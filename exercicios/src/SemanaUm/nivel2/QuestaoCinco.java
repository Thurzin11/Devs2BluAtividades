package SemanaUm.nivel2;

import javax.swing.*;

public class QuestaoCinco {
    public static void main(String[] args) {
        double coeficientes[] = new double[6];
        double x,y;
        for (int i = 0; i < 6; i++) {
            coeficientes[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do coeficiente: "));
        }

        double delta = (coeficientes[0]*coeficientes[4] - coeficientes[1]*coeficientes[3]);

        y = (coeficientes[0] * coeficientes[5] - coeficientes[2]*coeficientes[3]) / delta;
        JOptionPane.showMessageDialog(null, "Valor de y: "+y);

        x = (coeficientes[2]*coeficientes[4] - coeficientes[1]*coeficientes[4]) / delta;
        JOptionPane.showMessageDialog(null, "Valor de x: "+x);
    }
}
