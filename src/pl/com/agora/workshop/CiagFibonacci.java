package pl.com.agora.workshop;

public class CiagFibonacci {

    public static void main(String[] args) {
        int tab[] = new int[20];
        tab[1] = 1;
        tab[0] = 1;
        for (int i = 2; i < 20; i++)
            tab[i] = tab[i - 2] + tab[i - 1];

        for (int i = 0; i < 20; i++)
            System.out.println(i + 1 + " liczba = " + tab[i]);
    }


/*

public class Main {

    public static void main(String[] args) {
        double tab[] = new double[20];         //deklaracja tablicy 20-elementowej typu double (w zasadzie bardziej pasowałby int, jako, że w ciągu Fibonacciego są tylko liczby całkowite, także polecam zmienić :) )
        tab[1]=1; //drugiemu elementowi przypisujemy liczbę 1, a jako że drugi jest taki sam, to linijkę niżej robimy to samo z pierwszym
        tab[0]=1;
        for (int i=2; i<20; i++) //pętla, która zatrzyma się po 20 obiegach
            tab[i]=tab[i-2]+tab[i-1]; //jak widzisz i=2, więc pętla zacznie się od tego, że elementowi o indeksie 2 (w rzeczywistości jest to trzeci element, jako że zaczynamy od 0) przypisze sumę elementu zerowego i pierwszego. Z następnym obiegiem elementowi o indeksie 3 przypisze sumę elementów 1 oraz 2 itd.

        for (int i=0; i<20; i++) //taka sama pętla jak powyżej
            System.out.println(i+1 + " liczba = " + tab[i]); //tu następuje wypisanie na ekran klasycznym strumieniem wyjścia tabelki wynikowej. Jak widać mamy "sklejone" numer elementu (zaczynamy od 0 stąd aby była wypisana 1 potrzeba nam i+1, słowo liczba = oraz i-ty element tablicy, zaczynając od zera, czyli od początku.
    }*/


//rekurencyjnie

    public static int fib(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            return fib(N - 1) + fib(N - 2);
        }
    }

}