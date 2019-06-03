package pl.com.agora.workshop;

public class Main3 {

    public static void main(String[] args) {
        NotificationService notificationService = new EmailService();
        notificationService.notify(123, "To nie twoja poczta ");
    }



}
