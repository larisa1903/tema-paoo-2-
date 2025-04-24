public class Test {
    public static void modifica(int x) {
        x = 99;
    }

    public static void main(String[] args) {
        int a = 5;
        modifica(a);
        System.out.println(a);  // => 5 (NU s-a modificat)
    }
}
