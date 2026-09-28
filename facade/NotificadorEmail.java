package tp3.facade;

public class NotificadorEmail {

    public void enviar(String destino, String mensaje) {
        System.out.println("  [Email a " + destino + "] " + mensaje);
    }
}
