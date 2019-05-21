package pl.com.agora.workshop;

public class LiczenieSilni {

    public static void main(String[] args) {
        int result = factor (5);
        int result2 = rekurencja (10);

        System.out.println("Silnia od 5 to: " + result);
        System.out.println("Przykład rekurencji to: " + result2);
    }

    private static int factor (int n) {

        int result = 1;

        if (n >= 1) {
            for (int i =1;  i <= n ; i++){
                result = result * i; //zawsze wykonuje się najpierw prawa strona, dopiero potem operator przypisania  result *=1
            }

        }
        return result;
    }


    private static int rekurencja (int n) {

        int result2 = 1;

        if (n < 0) {
            System.out.println("Rezultat jest ujemny");
            return  -1;
        }

        if (n == 0) {

            return 1;

        }   else   {

            return n * rekurencja(n - 1);
            }

        }
}

// napisać ciąg fibonacciego w Javie