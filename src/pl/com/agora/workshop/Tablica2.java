package pl.com.agora.workshop;

public class Tablica2 {

    public static void main(String[] args) {

        String[] tab = new String[20];

        tab[0] = "Anna";
        tab[1] = "Marek";
        tab[2] = "Tomek";
        tab[3] = "Aśka";
        tab[4] = "Paweł";
        tab[5] = "Joanna";
        tab[6] = "Luiza";
        tab[7] = "Marta";
        tab[8] = "Marcin";
        tab[9] = "Tomek";
        tab[10] = "Michał";
        tab[11] = "Damian";
        tab[12] = "Krzysiek";
        tab[13] = "Kasia";
        tab[14] = "Piotr";
        tab[15] = "Łukasz";
        tab[16] = "Iwona";
        tab[17] = "Kamil";
        tab[18] = "Gosia";
        tab[19] = "Paweł";

        System.out.println(tab.length);

        for (int i = 0; i < tab.length; i++)
            System.out.println(tab[i]); //pokazą sie imiona, jak samo i pokaza sie indexy
    }
}
