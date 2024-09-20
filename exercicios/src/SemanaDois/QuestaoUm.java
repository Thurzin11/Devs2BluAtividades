package SemanaDois;

import javax.swing.*;

public class QuestaoUm {
    public static void main(String[] args) {
        int valorCompra,valorPagamento;
        valorCompra = Integer.parseInt(JOptionPane.showInputDialog("Informe quando foi o valor da compra: "));
        valorPagamento = Integer.parseInt(JOptionPane.showInputDialog("Informe quando foi o valor do pagamento: "));
        if (valorPagamento<valorCompra){
            JOptionPane.showMessageDialog(null,"Pagamento Negado");
        }else {
            int troco = valorPagamento - valorCompra;
            JOptionPane.showMessageDialog(null,"Valor da compra: "+valorCompra);
            JOptionPane.showMessageDialog(null,"Valor do pagamento: "+valorPagamento);
            JOptionPane.showMessageDialog(null,"Valor do troco: "+troco);
            int notas100,notas10;
            notas100 = troco / 100;
            troco%=100;
            notas10 = troco / 10;
            troco%=10;
            JOptionPane.showMessageDialog(null,"Notas de troco: "+notas100+" de R$100, "
                    +notas10+" de R$10, "+troco+" notas de 1");
        }
    }
}
