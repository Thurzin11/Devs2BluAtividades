package semanaCinco.exercicioTres;

//classe PessoaJuridica está herdando de contribuinte
public class PessoaJuridica extends Contribuinte {
//    atributo
    private String cnpj;

//contrutor vazio
    public PessoaJuridica() {
//        construtor vazio da classe pai, que é contruinte
        super();
    }

    //contrutor cheio
    public PessoaJuridica(String nome, Double rendaBruta, String cnpj) {
//        construtor cheio da classe pai, que é contruinte
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

//    getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    //override do medodo abstrato, com a respectiva regra de negocio da atividade
    @Override
    public double calculaImposto() {
        return this.getRendaBruta() * 0.10;
    }
}
