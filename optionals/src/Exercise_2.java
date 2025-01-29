package optionals.src;

import java.util.Optional;

public class Exercise_2 {
    public static void displayOptional(Optional<String> message){
        if (message.isPresent()){
            System.out.println(message.get());
        }
        else {
            System.out.println("Aucune valeur");
        }
    }
    public static void main(String[] args){
        displayOptional(Optional.ofNullable("Nouveaux message"));
        displayOptional(Optional.ofNullable(null));
    }
}
