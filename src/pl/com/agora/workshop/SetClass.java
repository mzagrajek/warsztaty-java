package pl.com.agora.workshop;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClass {

    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>(); //glownie forEach, nie ma indexOf albo lastIndexOf
        integers.add(13);
        integers.add(234);
        integers.add(423);
        integers.add(423);
        integers.add(423); //nie zwraca dubli


        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()) {
            Integer number =iterator.next();
            System.out.println(number);
        }
    }
}
