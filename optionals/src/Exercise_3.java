package optionals.src;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;

public class Exercise_3 {
    public static void checker(String text){
        Optional<String> optionalMessage = Optional.ofNullable(text);
        if (optionalMessage.isEmpty()){
            System.out.println("This optional is empty");
        }
    }

    public static void comparaison(String text){
        Optional<String> optionalMessage = Optional.ofNullable(text);
        System.out.println(optionalMessage.orElse("This is a default message to say the optional is empty"));
        System.out.println(optionalMessage.orElseGet(() -> String.valueOf(Timestamp.from(Instant.now()))));
    }
    public static void main(String[] args){
        String text = null;
        checker(text);
        comparaison(text);

        System.out.println("\nWith a value");
        String anotherText = "hello";
        checker(anotherText);
        comparaison(anotherText);
    }
}
