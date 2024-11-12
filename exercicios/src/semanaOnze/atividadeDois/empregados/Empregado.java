package semanaOnze.atividadeDois.empregados;

import semanaOnze.atividadeDois.formatos.Arquivo;

public abstract class Empregado {
    private String nome;
    private Integer idade;
    private Double salario;
    private Arquivo arquivo;

    public Empregado(String nome, Integer idade, Double salario,Arquivo arquivo) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.arquivo = arquivo;
    }

    public Arquivo getArquivo() {
        return arquivo;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }

    public Empregado() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public abstract void gerarArquivo();
}
