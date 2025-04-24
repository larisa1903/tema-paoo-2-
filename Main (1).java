import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Aplicația a pornit");
        logger.debug("Aceasta este o informație pentru depanare");
        logger.warn("Avertisment: ceva ar putea merge prost");
        logger.error("Eroare simulată pentru exemplu");
    }
}
