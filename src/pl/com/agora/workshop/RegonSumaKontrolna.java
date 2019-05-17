package pl.com.agora.workshop;

public class RegonSumaKontrolna {
    public static void main(String[] args) {

// W przypadku REGON-ów 14-cyfrowych cyfrę kontrolną oblicza się następująco:
//
//Wagi: 2 4 8 5 0 9 7 3 6 1 2 4 8
//
//Pierwsze trzynaście cyfr REGON: 1 2 3 4 5 6 7 8 5 1 2 3 4
//
//Wynik: 1*2 + 2*4 + 3*8 + 4*5 + 5*0 + 6*9 + 7*7 + 8*3 + 5*6 + 1*1 + 2*2 + 3*4 + 4*8 = 260
//
//Cyfra kontrolna: 260 mod 11 = 7
//
//Cały REGON: 12345678512347

        int regon = 7;
        System.out.println(regon);
    }
}
