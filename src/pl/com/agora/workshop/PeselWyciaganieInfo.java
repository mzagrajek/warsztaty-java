package pl.com.agora.workshop;

public class PeselWyciaganieInfo {

    public static void main(String[] args) {

        short year = yearOfBirth(87072902827L);
        System.out.println(year + "\n");

        short month = monthOfBirth(87072902827L);
        System.out.println(month+ "\n");

        short day = dayOfBirth(87072902827L);
        System.out.println(day+ "\n");
    }

    static short yearOfBirth(long pesel) {
        short year = (short) (pesel / 1_000_000_000);
        return year;
    }

    static short monthOfBirth(long pesel) {
        short month = (short) (pesel / 1_000_000_000);
        return month;
    }

    static short dayOfBirth(long pesel) {
        short day = (short) (pesel / 1_000_000_000);
        return day;
    }


}

// PRACA DOMOWA - Z Peselu wyjac dzien i miesiac
