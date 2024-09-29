package semana4.QuestaDois;

import javax.swing.*;

public class Materia {
    String nome;
    Disciplina disciplina;
    Integer serie;

    public Materia() {}

    public Materia(String nome, Disciplina disciplina, Integer serie) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.serie = serie;
    }

    public void gerarMateria(Disciplina disciplina){
        this.nome = JOptionPane.showInputDialog("Informe o nome da materia");
        this.serie = Integer.parseInt(JOptionPane.showInputDialog("Informe a serie"));
        this.disciplina = disciplina;
    }

    public String mostraMateria() {
        return nome +
               "\n Serie: " + serie+
                "\n Disciplina: " + this.disciplina.mostrarDisciplina();
    }
}
