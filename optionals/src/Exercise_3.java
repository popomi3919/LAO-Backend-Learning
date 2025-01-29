package optionals.src;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;

public class Exercise_3 {
    public static String message(){
        return "Optional vide";
    }

    public static void comparaison(Optional<String> text){
        System.out.println(text.orElse(message()));
        System.out.println(text.orElseGet(() -> message() + " a " + Timestamp.from(Instant.now())));
    }
    public static void main(String[] args){
        System.out.println("Optional sans valeur");
        comparaison(Optional.ofNullable(null));

        System.out.println("\n Optional avec valeur");
        comparaison(Optional.of("Bonjour"));

    }
}
