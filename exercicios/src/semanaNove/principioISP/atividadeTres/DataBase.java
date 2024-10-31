package semanaNove.principioISP.atividadeTres;

public class DataBase {
    private Armazenamento armazenamento;

    public DataBase(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void salvar(){
        this.armazenamento.armazenar();
    }
}
