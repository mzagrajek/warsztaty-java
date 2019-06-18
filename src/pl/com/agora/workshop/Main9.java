package pl.com.agora.workshop;

import java.util.*;

public class Main9 {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1); //duzy Integer

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            Integer number = (Integer) it.next();
/*            if (i instanceof Integer) {
                Integer a = (Integer) i;
            }   else if (i instanceof String) {
                String b = (String) i; //to nam załatwia List<Integer> lub List<Object>
            }*/
        }

        //Collection<Integer> coll;  //extenduje Iterable
        //List<Integer> list1; //extenduje Collection - dopiero tu zwracamy jakies indexy (mozliwosc zwrocenia, pobrania, zamiany indexu)// lista zachowuje kolejnosc elementow
        //najpopularniejsza to ArrayList(bazuje na tablicy - dostep do elementu jest mega szybki) i LinkedList oraz Vector

        List<Integer> list4 = new ArrayList<>(5);
                list4.add(1);
                list4.add(null);
                list4.add(4);
                list4.add(54);
        System.out.println(list4);
    }

}



//kolekcje przechowuja tylko referencje obiektow, nie przechowuja typow prostych (prymitywnych); musza byc utworzone
// wszystko znajduje sie w pakiecie java.util
// iterable i iterator są generycznymi interfejsami
//set nie ma indeksu