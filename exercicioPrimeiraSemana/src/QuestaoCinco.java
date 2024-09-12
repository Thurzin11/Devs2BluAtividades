import javax.swing.*;

//QUESTÃO _5: Receba como entrada o total de minutos usados
//por um cliente e exiba o valor a ser pago por ele. Sabe-se que a
//lanhouse cobra R$ 2,30 por cada hora de acesso (Lembrete: 1 hora
//        = 60 minutos).
public class QuestaoCinco {
    public static void main(String[] args) {
        //Pega o input do usuario
        int minutosUsados = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de minutos usados: "));

        //Converte os minutos em horas
        double horasUsadas = minutosUsados/60.00;

        //Faz o calculo do custo com base no valor da hora
        double custo = horasUsadas*2.30;

        //Mostra os valores a ser pago arredondando eles
        JOptionPane.showMessageDialog(null,"Valor a ser pago por "+Math.round(horasUsadas * 100.0) / 100.0+" horas usadas é de: R$"+Math.round(custo * 100.0) / 100.0);
    }
}
