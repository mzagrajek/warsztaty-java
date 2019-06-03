package pl.com.agora.workshop;

public class SmsService implements NotificationService {

    @Override
    public void notify(int customerId, String message) {
        System.out.println("Wysyłamy wiadomość na SMS " + message + "do użytkownika " + customerId);

    }
}
