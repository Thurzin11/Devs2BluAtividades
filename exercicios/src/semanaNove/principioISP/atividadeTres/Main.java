package semanaNove.principioISP.atividadeTres;

public class Main {
    public static void main(String[] args) {
        BancoDados bd = new BancoDados();
        ArquivoTexto arq = new ArquivoTexto();
        DataBase dataBase1 = new DataBase(bd);
        dataBase1.salvar();
        DataBase dataBase2 = new DataBase(arq);
        dataBase2.salvar();
    }
}
