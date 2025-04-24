public class Student {
    private String nume;
    private int varsta;

    public Student(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    // GSON are nevoie de constructor gol
    public Student() {}

    public String getNume() { return nume; }
    public int getVarsta() { return varsta; }
}
