import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

//QUESTÃO _4: Exiba a idade de um usuário qualquer.
public class QuestaoQuatro {
    public static void main(String[] args) {
        //Pega o input do usuario
        Integer d = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia de nascimento"));
        Integer m = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes de nascimento"));
        Integer y = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento"));

        //Cria uma data de nascimento no formato yyyy-mm-dd
        LocalDate dataNascimento = LocalDate.of(y,m,d);

        //Cria uma data Atual com base em yyyy-mm-dd
        LocalDate dataAtual = LocalDate.now();

        //Faz o calculo entre as datas(dataAtual - dataNascimento)
        Period idade = Period.between(dataNascimento,dataAtual);

        //Exibe ao usuario a sua idade com base em anos e meses e dias
        JOptionPane.showMessageDialog(null,"A idade atual sua é de "+idade.getYears()+" anos, "+idade.getMonths()+" meses, "+idade.getDays()+" dias");
    }
}
