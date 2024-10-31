package semanaNove.principioISP.atividadeDois;

public class NotificacaoAlerta implements NotificacaoPush {
    @Override
    public void enviarPushNotification() {
        System.out.println("Enviando notifica��o por PUSH.");
    }
}
