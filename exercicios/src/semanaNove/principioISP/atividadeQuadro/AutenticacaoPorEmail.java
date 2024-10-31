package semanaNove.principioISP.atividadeQuadro;

public class AutenticacaoPorEmail implements Autenticacao {
    @Override
    public void autenticar() {
        System.out.println("Autenticado por Email");
    }
}
