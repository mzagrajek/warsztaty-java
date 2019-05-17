package pl.com.agora.workshop;

import pl.com.agora.workshop.HelloWorld;

public class Main {
    public static void main(String[] args) {
        HelloWorld.ballVolume(3);

        float volume = HelloWorld.ballVolume(3);
        System.out.println(volume + HelloWorld.FACTOR); //nazwy pola statyczne i niezmienialne powinny byc wielkimi literami
    }
}
