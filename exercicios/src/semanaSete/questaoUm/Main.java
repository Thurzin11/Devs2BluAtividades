package semanaSete.questaoUm;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Autor autor = new Autor("George Orwell");
        Livro livro1 = new Livro("1984",autor);

        autor.setNome("Miguel de Cervantes");
        Livro livro2 = new Livro("Dom Quixote",autor );
        biblioteca.setLivro(livro1);
        biblioteca.setLivro(livro2);

        Aluguel aluguel = new Aluguel();
        aluguel.alugar(livro1);
        aluguel.alugar(livro2);

        RelatorioLivro relatorioLivro1 = new RelatorioLivro(livro1);
        RelatorioLivro relatorioLivro2 = new RelatorioLivro(livro1);
        relatorioLivro1.gerarRelatorio();
        relatorioLivro2.gerarRelatorio();
    }
}