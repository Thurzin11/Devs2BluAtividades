package semanaNove.principioISP.atividadeQuadro;

public class Login {
    private Autenticacao autenticacao;

    public Login(Autenticacao autenticacao) {
        this.autenticacao = autenticacao;
    }

    public void logar() {
        autenticacao.autenticar();
    }
}
