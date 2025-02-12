package optionals.src;

import java.util.Optional;

public class Exercise_2 {
    public static void displayOptional(Optional<String> message){
        message.ifPresentOrElse(System.out::println, () -> System.out.println("Aucune valeur"));
    }
    public static void main(String[] args){
        displayOptional(Optional.of("Nouveaux message"));
        displayOptional(Optional.ofNullable(null));
    }
}
