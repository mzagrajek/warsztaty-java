package pl.com.agora.workshop;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main10 {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();
        queue.add("Ala ");
        queue.add("ma ");
        queue.add("kota ");
        queue.add("Filemona");

        while (!queue.isEmpty()) {
         String a = queue.poll();
            System.out.println(a);
        }
    }
}
