package pl.com.agora.workshop;

public class TabliceWielowymiarowe {

    public static void main(String[] args) {
        nDimensionArray();
    }

    private static void nDimensionArray() {
        int [] [] array2d = {
                {1,2,3},
                {5},
                {4,49,34,59} //wywołuję indeks 0 drugiej tablicy array2d[0][0], a jak chcę całość to array2d[0]
        };

        for (int[] d : array2d) { //albo Arrays.toString(d)
            System.out.print("[");
            for (int a : d) {
                System.out.print(a + " ");
            }
            System.out.println("]");
        }
    }
}
