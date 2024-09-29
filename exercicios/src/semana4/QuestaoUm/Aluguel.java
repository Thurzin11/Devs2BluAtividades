package semana4.QuestaoUm;

import java.time.LocalTime;
import java.util.Date;

public class Aluguel {
    Cliente cliente;
    Tema tema;
    Date dataFesta;
    LocalTime horaInicio;
    LocalTime horaFim;
    Double valorTotal;
    Double desconto;

    public Aluguel(Cliente cliente, Tema tema, Date dataFesta, LocalTime horaInicio, LocalTime horaFim, Double valorTotal, Double desconto) {
        this.cliente = cliente;
        this.tema = tema;
        this.dataFesta = dataFesta;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
    }
    public Aluguel() {}


//    Calcula o valor final baseado com o desconto informado na criacao do aluguel
    public double calcularValorFinal() {
        return valorTotal -= (valorTotal * (desconto / 100));
    }
}
