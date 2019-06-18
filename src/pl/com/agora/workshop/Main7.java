package pl.com.agora.workshop;

import java.util.Random;

public class Main7 {

    public static void main(String[] args) {

        //tablica zawiwerająca 100 liczb całkowitych z zakresu 20-200; wypisujemy podzielne przez 13


        int[] numbers = new int[100];
        Random random = new Random();


        for (int i = 0; i < numbers.length; i++) {

            final int number = random.nextInt(181) + 20;
            numbers[i] = number;
    }

        for (int i = 0; i < numbers.length; i++) {
            final int number =  numbers[i];

            if (number % 13 == 0 ) {

                System.out.println("Liczba " + number);
            }
        }


    }


}
