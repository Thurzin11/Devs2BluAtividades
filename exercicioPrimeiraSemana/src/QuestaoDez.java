import javax.swing.*;

//QUESTÃO _10: Que receba o salário-base de um funcionário,
//calcule e mostre o salário a receber, sabendo-se que esse
//funcionário tem gratificação de 5% sobre o salário-base e paga
//imposto de 7% também sobre o salário-base.
public class QuestaoDez {
    public static void main(String[] args) {
        //Pega o input do usuario
        Double salarioFuncionario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salario-base"));

        //Faz o calculo do salario funcionario, como ele tem 5 de bonificacao e 7 de imposto, 7-5 = 2 entao sobra 2% de imposto, fiz o calculo direto
        salarioFuncionario = salarioFuncionario - (salarioFuncionario * 0.02);

        //Mostra o salario final do usuario
        JOptionPane.showMessageDialog(null,"O salario final ira ficar "+ salarioFuncionario);
    }
}
