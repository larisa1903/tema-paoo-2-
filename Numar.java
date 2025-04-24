class Numar {
    int valoare;
}

public class Test {
    public static void modifica(Numar n) {
        n.valoare = 42;
    }

    public static void main(String[] args) {
        Numar a = new Numar();
        a.valoare = 7;
        modifica(a);
        System.out.println(a.valoare);  // => 42 (S-a modificat)
    }
}
