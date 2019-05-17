package pl.com.agora.workshop;

public class For {

    public static void main(String[] args) {

        testFor2(5);
    }
        private static void testFor(int n) {

            for (int h = 0; h < 100; h++ ) {
                System.out.println("Dupa " + h);
            }

        }

        private static void testFor2(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    System.out.print(i);
 //wtedy nie ma gwiazdek po prawej stronie
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
