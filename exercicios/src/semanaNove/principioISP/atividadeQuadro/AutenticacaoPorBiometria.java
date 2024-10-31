package semanaNove.principioISP.atividadeQuadro;

public class AutenticacaoPorBiometria implements Autenticacao {
    @Override
    public void autenticar() {
        System.out.println("Autenticado por Biometria");
    }
}
