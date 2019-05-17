package pl.com.agora.workshop;

public class TrojmianKwadratowy {

    public static void main(String[] args) {

        double a = 4;
        double b = -4;
        double c = 1;
        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Brak pierwiastkow");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Jeden podwójny pierwiastek:" + x);
        }   else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Pierwszy pierwiastek " + x1);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Drugi pierwiastek " + x2);
        }

        //ax2 + bc + c, delta = b2 - 4 * a * c; if delta <0 brak pierwiastkow, if delta == 0 = 1 pierwiastek -b/2a; else = 2 pierwiastki 1) -b + pierwiastek z delty/2a pierwiastek 1 = -b-pierwiastek z delty/2a
    }

    private static double roots(double a, double b, double c) {

        return 0.0;
    }


}



