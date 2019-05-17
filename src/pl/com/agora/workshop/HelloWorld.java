package pl.com.agora.workshop;

import java.beans.JavaBean;

public class HelloWorld {

    static final int FACTOR = 12; // (pole statyczne klasy HelloWorld, mozna je wykorzystywac w innej klasie)

    public static void main(String[] args) { //tylko args może się tutaj zmieniać, void oznacza że ta metoda nic nie zwraca, zawsze musi być tablica stringów []
        System.out.println("Hello World"); //stringi zawsze w podwojnych ciapkach; system to klasa, ktora ma pole out, a to pole ma metode println; ln (line) w nastepnej linii
        System.out.println("Hello" + " Test " + "World");
        System.out.println("Hello \n" + "\t World \" \" \\"); //eskejpowanie znakow specjalnych + znaki specjalne

        int a = (int) 535555555; //rzutowanie na sile konkretnego typu (jest wyzsze niz inne operatory)
        byte b = 83;
        long c = 98L; // lepiej z duzym L ; bez tego kompilator tworzy inta
        double d = 9.988;
        float t = 3.49F; // float wymaga F na koncu
        long i = 1_000_000_000L;
        // a++ == a+=1 == a = a +1
        System.out.println(90 % 7);
        System.out.println(b++); //postinkrementacja
        System.out.println(b++);
        System.out.println(b);
        System.out.println(++b); //preinkrementacja
        System.out.println(++b);

        float volume = ballVolume(1);
        System.out.println("Wynik + " + volume);
    }

    static float ballVolume(float r) {

        float volume = (float) ((4.0 / 3) * Math.PI * r * r * r); //bez 4.0 źle wylicza, cały czas 3.14 //Math.pow ?
        return volume;
    }

}

// metody statyczne - nie ma koniecznosci tworzenia obiektu, sa zwiazane tylko z klasa; metody instancyjne - musza miec obiekt
// typy liczbowe - prymitywne - jedyne, które nie są obiektowe
// byte, short, int, long - domyslna wartosc = 0
// double, float - domyslna wartosc = 0,0
// boolean - domyslna wartosc = false
// char - domyslna wartosc = 0000
// zeby otrzymac zmiennoprzecinkowe trzeba albo double albo x.x zeby on zrozumial

// metodę pisze się małą nazwą ale camel case;
// private static int nazwa(np. int a, int b - args lub pusty) {
// int c = 10;
// ........
// return c;
// }
// zwraca się także wyjątki jeśli metoda jest błędna lub nie zadziała
// modyfikatory metody - nic, public, protected, private w kolejności od możliwości wykonywania