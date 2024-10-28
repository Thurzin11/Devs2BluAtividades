package semanaSete.questaoUm;

public class Aluguel {
    public void alugar(Livro livro) {
        if (!livro.isAlugado()) {
            livro.setAlugado(true);
            System.out.println("O livro " + livro.getTitulo() + " foi alugado.");
        } else {
            System.out.println("O livro " + livro.getTitulo() + " j� est� alugado.");
        }
    }
}
