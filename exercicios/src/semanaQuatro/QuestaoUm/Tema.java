package semanaQuatro.QuestaoUm;

public class Tema {
    String nome;
    Item[] itens;
    Double valorAluguel;
    String corToalha;

    public Tema(String nome, Item[] itens, Double valorAluguel, String corToalha) {
        this.nome = nome;
        this.itens = itens;
        this.valorAluguel = valorAluguel;
        this.corToalha = corToalha;
    }

    public Tema() {}
}
