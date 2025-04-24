import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExemple {
    public static void main(String[] args) {
        List<String> nume = Arrays.asList("Ana", "George", "Elena", "Mihai");

        // FILTER – păstrează doar numele cu mai mult de 4 caractere
        List<String> filtrate = nume.stream()
                                    .filter(n -> n.length() > 4)
                                    .collect(Collectors.toList());
        System.out.println("Filtrate: " + filtrate);

        // MAP – transformă fiecare nume în majuscule
        List<String> upper = nume.stream()
                                 .map(String::toUpperCase)
                                 .collect(Collectors.toList());
        System.out.println("Majuscule: " + upper);

        // SORTED – sortare alfabetică inversă
        List<String> sortate = nume.stream()
                                   .sorted((a, b) -> b.compareTo(a))
                                   .collect(Collectors.toList());
        System.out.println("Sortate invers: " + sortate);
    }
}
