package semanaCinco.exercicioDois;

//heranca sendo aplicada da classe TipoIngresso
public class Ingresso extends TipoIngresso {
//    atributos
    private double valor;
    private double valorAdicional;
    private String localizacao;

//    conrtutor vazio
    public Ingresso() {
//        contrutor pai vazio
        super();
    }

//    contrutor cheio
    public Ingresso(double valor, double valorAdicional, String localizacao,String tipoIngresso) {
//        contrutor pai cheio
        super(tipoIngresso);
        this.valor = valor;
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }

//    getters e setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

//    metodos
    public void imprimeValor() {
        System.out.println("Valor: " + valor);
    }

    public double valorTotal() {
        return valor + valorAdicional;
    }

//     override do metodo abstrato
    @Override
    public String imprimeTipo() {
        return "Tipo: " + this.getTipoIngresso();
    }

}
