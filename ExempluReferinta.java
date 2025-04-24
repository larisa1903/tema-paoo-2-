class Masina {
    String marca;
    public Masina(String marca) { this.marca = marca; }
}

public class ExempluReferinta {
    public static void schimbaMarca(Masina m) {
        m.marca = "BMW"; // modifică obiectul original
    }

    public static void reatribuie(Masina m) {
        m = new Masina("Audi"); // doar în interiorul metodei
    }

    public static void main(String[] args) {
        Masina masina = new Masina("Dacia");

        schimbaMarca(masina);
        System.out.println(masina.marca); // => BMW

        reatribuie(masina);
        System.out.println(masina.marca); // => BMW, nu Audi!
    }
}
