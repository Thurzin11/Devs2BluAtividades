package semanaNove.principioISP.atividadeQuadro;

public class Main {
    public static void main(String[] args) {
        AutenticacaoPorEmail autenticacaoPorEmail = new AutenticacaoPorEmail();
        AutenticacaoPorBiometria biometria = new AutenticacaoPorBiometria();

        Login login1 = new Login(autenticacaoPorEmail);
        login1.logar();
        Login login2 = new Login(biometria);
        login2.logar();
    }
}
