package pl.com.agora.workshop;

import java.util.StringJoiner;

import static java.lang.Integer.valueOf;

public class Main8 {

    public static void main(String[] args) {


        String str = "Ala ma kota";  // skrócona forma tworzenia obiektu bez konstruktora

        String str2 = new String("Ala ma kota"); // tak nie robimy bo to redundantne - nie sprawdza wtedy czy taki string już jest przez co potrafi przechowywać za dużo w pamięci

        User user1 = new User ("Marcin" , "Troscianczyk");
        User user2 = new User ("Marcin" , "Troscianczyk");

        System.out.println(user1==user2); //to działa przy singletonach (np. enumy)
        System.out.println(user1.equals(user2)); //equals z object dziala tak samo jak == wiec nie nadaje sie do porownywania stringow
    }


    static class User {
        private final String name;
        private final String surname;

        public User(String name, String surname) {
            this.name = name;
            this.surname = surname;

            String str = "Dupa";
            String str2 = "Blada";
            String str3 = str + str2;


            StringBuilder builder = new StringBuilder("Ala ma kota");
            builder.append(" filemona");
            builder.append(" z czarną łapką");

            StringJoiner joiner = new StringJoiner(" ", " sectionId:(", ")");
            joiner.add(String.valueOf(123));
            joiner.add(Integer.toString(125));
            joiner.add("" + 124);

            System.out.println("zaytanie" + joiner);

            System.out.println(builder);
        }
//kolejność, nazwa i typy muszą się zgadzać aby obiekty były równe
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            User user = (User) o;

            if (name != null ? !name.equals(user.name) : user.name != null) return false;
            return surname != null ? surname.equals(user.surname) : user.surname == null;

        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (surname != null ? surname.hashCode() : 0);
            return result;
        }
    }
}

//heap - pamięć w której są obiekty
// new zawsze tworzy obiekt
//replace tworzy nowego stringa, a nie nadpisuje istniejacego - immutable String
