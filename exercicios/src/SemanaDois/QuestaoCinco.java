package SemanaDois;

import javax.swing.*;

public class QuestaoCinco {
    public static void main(String[] args) {
        Double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da compra"));
        String tipoPagamento = JOptionPane.showInputDialog("Informe o tipo do pagamento");

        //valida o tipo do pagamento e se estiver na regra de desconto aplica o desconto
        if (tipoPagamento.equals("dinheiro") || tipoPagamento.equals("cheque")){
            valorProduto = valorProduto-(valorProduto*0.10);
        }
        JOptionPane.showMessageDialog(null,"Valor total da compra será de: "+valorProduto);
    }
}
