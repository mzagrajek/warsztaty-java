package pl.com.agora.workshop;

public class While {

    public static void main(String[] args) {
        testFor2(3);
    }
        private static void testWhile ( boolean test){
            while (test) {

            }
        }

        private static void testDoWhile ( boolean test2){
            do {

            } while (test2);
        }

        private static void testFor2 (int n) {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.println("*");
                }
            }
        }
    }

   // PRACA DOMOWA
  //  * * * * * * * *
//  * * * * * * * * *