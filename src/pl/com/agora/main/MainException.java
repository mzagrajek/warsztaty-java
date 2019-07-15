package pl.com.agora.main;

public class MainException {


    public static void main(String[] args) {


        Integer i = null;

        try {
            System.out.println(i.toString());
        } catch (NullPointerException e) {
            System.out.println("Poleciał wyjątek");
        }

    }
}

