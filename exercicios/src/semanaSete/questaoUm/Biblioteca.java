package semanaSete.questaoUm;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private RelatorioLivro relatorio;

    public Biblioteca() {
        livros = new ArrayList<Livro>();
        relatorio = new RelatorioLivro();
    }

    Biblioteca(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivro(Livro livro) {
        this.livros.add(livro);
    }
    
    public void mostrarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
    }
}