package pl.com.agora.workshop;

public interface NotificationService {

    int CONSTANT = 23;

    void notify (int customerId, String message);

    default void test() {
        System.out.println("Domyślna implementacja metody test");
    }

}
