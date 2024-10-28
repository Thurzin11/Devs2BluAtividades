package semanaSete.questaoUm;

public class RelatorioLivro {
    private Livro livro;

    public RelatorioLivro(Livro livro) {
        this.livro = livro;
    }

    public RelatorioLivro() {}

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void gerarRelatorio() {
        System.out.println("Titulo: " + this.livro.getTitulo());
        System.out.println("Autor: " + this.livro.getAutor().getNome());
        System.out.println("Status: " + (this.livro.isAlugado() ? "Alugado" : "Disponivel"));
    }
}
