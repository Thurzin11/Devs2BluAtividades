package entity;
public class Pessoa {
    String nome;
    Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    //Calcula a idade em dias com base na idade atual
    public Integer calculaIdadeDias(){
        return this.idade*365;
    }

}
