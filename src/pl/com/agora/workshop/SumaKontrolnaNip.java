package pl.com.agora.workshop;

public class SumaKontrolnaNip {

    public static void main(String[] args) {
        //123-456-32-18

        //wagi 6 5 7 2 3 4 5 6 7

        //suma kontrola = ostatnia cyfra

        int cr = ((1 * 6) + (2 * 5) + (3 * 7) + (4 * 2) + (5 * 3) + (6 * 4) + (3 * 5) + (2 * 6) + (1 * 7)) % 11;
        System.out.println(cr);

    }
}
