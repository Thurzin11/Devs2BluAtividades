package semanaCinco.exercicioDois;

public abstract class TipoIngresso {
//    atributo
    private String tipoIngresso;

    //contrutor vazio
    public TipoIngresso() {}

//    contrutr cheio
    public TipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

//    getters e setters
    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

//    metodo abstrato
    public abstract String imprimeTipo();

}
