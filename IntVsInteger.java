import java.util.ArrayList;
import java.util.List;

public class IntVsInteger {
    public static void main(String[] args) {
        // Tip primitiv
        int a = 10;
        int b = a;   // copie directă
        b = 20;
        System.out.println("a = " + a + ", b = " + b);  // a = 10, b = 20

        // Tip wrapper (Integer este un obiect)
        Integer x = 30;
        Integer y = x; // referință către același obiect
        y = 40;        // y primește un nou obiect, x rămâne 30
        System.out.println("x = " + x + ", y = " + y);  // x = 30, y = 40

        // Autoboxing și unboxing
        Integer obj = a;  // autoboxing (int → Integer)
        int val = obj;    // unboxing (Integer → int)

        // Integer poate fi null, int nu
        Integer poateFiNull = null;
        // int nuPoateFiNull = null; // EROARE la compilare

        // Exemplu cu listă – doar Integer este acceptat
        List<Integer> lista = new ArrayList<>();
        lista.add(100);
        lista.add(200);

        int suma = 0;
        for (Integer nr : lista) {
            suma += nr; // unboxing automat
        }

        System.out.println("Suma listei: " + suma);
    }
}
