package SemanaDois;

import javax.swing.*;

public class QuestaoUm {
    public static void main(String[] args) {
        int valorCompra,valorPagamento;

        //recebe os dados
        valorCompra = Integer.parseInt(JOptionPane.showInputDialog("Informe quando foi o valor da compra: "));
        valorPagamento = Integer.parseInt(JOptionPane.showInputDialog("Informe quando foi o valor do pagamento: "));
        //valida se o valor do pagamento é menor, se for, é impossivel ser pago, senao ele caira no else para continuar
        if (valorPagamento<valorCompra){
            JOptionPane.showMessageDialog(null,"Pagamento Negado");
        }else {
            //calcula o valor do troco
            int troco = valorPagamento - valorCompra;
            //mostra pro usuario os dados
            JOptionPane.showMessageDialog(null,"Valor da compra: "+valorCompra);
            JOptionPane.showMessageDialog(null,"Valor do pagamento: "+valorPagamento);
            JOptionPane.showMessageDialog(null,"Valor do troco: "+troco);
            int notas100,notas10;
            //calcula a quantidade de notas com base na divisao pois se ele ira atribuir o valor inteiro da divisao
            notas100 = troco / 100;
            // logo apos ele pega o valor q sobrou, no caso o resto e atribui a variavel troco
            troco%=100;
            notas10 = troco / 10;
            troco%=10;

            //informa ao usuario as notas necessarias para o troco
            JOptionPane.showMessageDialog(null,"Notas de troco: "+notas100+" de R$100, "
                    +notas10+" de R$10, "+troco+" notas de 1");
        }
    }
}
