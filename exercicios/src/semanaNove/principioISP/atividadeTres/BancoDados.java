package semanaNove.principioISP.atividadeTres;

public class BancoDados implements Armazenamento{
    @Override
    public void armazenar() {
        System.out.println("Armazenado no banco de dados");
    }
}
