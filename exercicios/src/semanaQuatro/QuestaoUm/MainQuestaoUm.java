package semanaQuatro.QuestaoUm;
import java.time.LocalTime;
import java.util.Date;

public class MainQuestaoUm {
    public static void main(String[] args) {
        //Criando um objeto do tipo cliente atraves do contrutor
        Cliente cliente1 = new Cliente("Arthur","4799999999","Rua seila");
        //Criando items e adicionando a uma vetor de items para simular a lista
        Item item1 = new Item("Castelo");
        Item item2 = new Item("Boneca da Cinderela");
        Item item3 = new Item("Bruxa");
        Item[] items = new Item[]{item1, item2, item3};
        //Criando um tema
        Tema temaCinderela = new Tema("Cinderela",items,600.00,"Azul");
        //Gerando a data da festa e os horarios
        Date dataFesta = new Date(2024,10,15);
        LocalTime horaInicio = LocalTime.of(10,0);
        LocalTime horaFim = LocalTime.of(18,0);
//        Gerando o aluguel
        Aluguel aluguel = new Aluguel(cliente1,temaCinderela,dataFesta,horaInicio,horaFim,500.00,10.00);
        aluguel.calcularValorFinal();
        System.out.println(aluguel.valorTotal);
    }
}
