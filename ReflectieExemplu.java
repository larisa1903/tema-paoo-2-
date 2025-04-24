import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Persoana {
    private String nume = "Andrei";

    public void saluta() {
        System.out.println("Salut, sunt " + nume);
    }
}

public class ReflectieExemplu {
    public static void main(String[] args) throws Exception {
        Class<?> clasa = Class.forName("Persoana");
        Object obiect = clasa.getDeclaredConstructor().newInstance();

        // Accesare câmp privat
        Field field = clasa.getDeclaredField("nume");
        field.setAccessible(true);
        field.set(obiect, "Ioana");

        // Apelare metodă
        Method metoda = clasa.getMethod("saluta");
        metoda.invoke(obiect);
    }
}
