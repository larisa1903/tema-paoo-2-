public class Calculator {
    public int aduna(int a, int b) {
        return a + b;
    }

    public int imparte(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Împărțire la zero");
        return a / b;
    }
}
