package pl.com.agora.workshop;

public class PeselSprawdzenie {
    public static void main(String[] args) {
        //9×a + 7×b + 3×c + 1×d + 9×e + 7×f + 3×g + 1×h + 9×i + 7×j
        // 87072902827
        // ostatnia cyfra = suma kontrolna
        int ps = ((9 * 8) + (7 * 7) + (0 * 3) + (7 * 1) + (2 * 9) + (9 * 7) + (3 * 0) + (1 * 2) + (9 * 8) + (7 * 2)) % 10;
        System.out.println(ps);
    }
}
