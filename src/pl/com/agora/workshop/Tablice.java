package pl.com.agora.workshop;

import java.util.Arrays;

public class Tablice {

    public static void main(String[] args) {
        tabTest();
        tabTest2();
        int[] array = {9,10,22,34,89,90};
        int max = max(array);
        System.out.println("Wynik największy " + max);
    }

    private static void tabTest() {

        int[] arrayTest = {15, 2, 8, 3, 25, 31};
        int[] arrayTest2 = new int[6]; //zawsze ma same zera, false lub null (zależy od typów danych)

        arrayTest2[0] = 15;
        arrayTest2[1] = 2;
        arrayTest2[2] = 8;
        arrayTest2[3] = 3;
        arrayTest2[4] = 25;
        arrayTest2[5] = 31;
        //arrayTest2[6] = 10; //kompilator nie wyłapie takiego błędu!

        //NIE MOŻNA ZMIENIAĆ WIELKOŚCI TABLIC, nie są rozciągliwe
        System.out.println("Tablica 1: " + arrayTest.length);

        for (int i = 0; i < arrayTest.length; i++) {
            System.out.println(arrayTest[i] + " ");
        }

        System.out.println("Tablica 2: " + arrayTest2.length);

        for (int i = 0; i < arrayTest2.length; i++) {
            System.out.println(arrayTest2[i] + " ");
        }
    }

    private static void tabTest2() {

        int[] arr1 = {4, 6, 7};
        int[] arr2 = {9, 10, 11};

        arr1 = arr2; //referencja a nie PODMIANA tablicy

        for (int a : arr1) { //foreach jest bezpieczniejszy, bo nie wychodzi poza tablicę jak zwykły for; dobry jak nie potrzebujemy żadnego licznika
            System.out.println(a);
        }


        Object[] dupa = {false, 2, "ala ma kota", 'a', 2.3}; //de facto jest to tablica referencji do dużych odpowiedników, np. duży Boolean, duży Integer, duży Char czy duży Double ; dziedziczą po Object

        for (Object x : dupa) {
            System.out.println(x); //rzutowanie na tostring
        }
    }
        private static int max(int[] array) {


        int currentMax = array[0];

        for (int i = 1; i < array.length; i++) {
                if (array[i] > currentMax) {
                    currentMax = array[i];
                }
            }
            return currentMax;
        }



        private static void varargs(int... a) { //zawsze tworzy tablicę, nawet zeroelementową

            System.out.println(Arrays.toString(a));
        }
}


/*
 przechowuje dane tego samego typu
 najmniejsze elementy z tablicy
 wszystkie parzyste (podzielne przez 2)
 znaleźć jakiś element w tablicy nie używając metod
 find (int[] array, int key)
 odwrócenie kolejności, np zamiast 1, 2 i 3 -> 3, 2, 1
 kod sumujący liczby w danej tablicy
 wyszukaj podciąg, np. [1,5,8,9,3,3,2] -> [9,3]
 znalezienie maksymalnego elementu w tablicy dwuwymiarowej
 trójmian albo wielomian - do pocwiczenia petli
 średnia z macierzy wielowymiarowej
*/
