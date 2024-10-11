package semanaCinco.exercicioTres;

//classe PessoaFisica está herdando de contribuinte
public class PessoaFisica extends Contribuinte{
    //atributos
    private String cpf;

    //construtor vazio
    public PessoaFisica() {
//        construtor vazio da classe pai, que é contruinte
        super();
    }

//    contrutor cheio
    public PessoaFisica(String nome, double rendaBruta, String cpf) {
//        construtor cheio da classe pai, que é contruinte
        super(nome,rendaBruta);
        this.cpf = cpf;
    }
//getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //override do medodo abstrato, com a respectiva regra de negocio da atividade
    @Override
    public double calculaImposto() {
        if (this.getRendaBruta() >= 0 && this.getRendaBruta() <= 1400) {
            return this.getRendaBruta();
        } else if (this.getRendaBruta() > 1400 && this.getRendaBruta() <= 2100) {
            return this.getRendaBruta() * 0.10 - 100;
        } else if (this.getRendaBruta() > 2100 && this.getRendaBruta() <= 2800) {
            return this.getRendaBruta() * 0.15 - 270;
        } else if (this.getRendaBruta() > 2800 && this.getRendaBruta() <= 3600) {
            return this.getRendaBruta() * 0.25 - 500;
        } else if (this.getRendaBruta() > 3600) {
            return this.getRendaBruta() * 0.30 - 700;
        } else {
            return 0;
        }
    }
}
