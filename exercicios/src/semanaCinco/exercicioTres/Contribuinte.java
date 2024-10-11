package semanaCinco.exercicioTres;


//Criação da clsse abstract como foi proposto na questão
public abstract class Contribuinte {
    //atributos
    private String nome;
    private Double rendaBruta;

    //construtores
    public Contribuinte() {}

    public Contribuinte(String nome, Double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(Double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    //funcao calcula imposto
    public abstract double calculaImposto();


}
