import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/salut")
public class SalutController {

    private String nume = "lume";

    @GetMapping
    public String salut() {
        return "Salut, " + nume + "!";
    }

    @PutMapping
    public String actualizeaza(@RequestParam String numeNou) {
        this.nume = numeNou;
        return "Numele a fost actualizat la: " + nume;
    }
}
