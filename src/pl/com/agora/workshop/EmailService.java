package pl.com.agora.workshop;

public class EmailService implements NotificationService {

    @Override
    public void notify(int customerId, String message) {
        System.out.println("Wysyłamy wiadomość na maila " + message + "do użytkownika " + customerId);

    }
}
