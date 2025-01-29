package optionals.src;

import java.util.Optional;
import java.util.Scanner;

public class Exercise_2 {
    public static void displayOptional(Optional<String> message){
        if (message.isPresent()){
            System.out.println(message);
        }
        else {
            System.out.println("Aucune valeur");
        }
    }
    public static void main(String[] args){
//        String value = "Hey voici ne valeur";
        String value = null;
        Optional<String> parameter = Optional.ofNullable(value);
        displayOptional(parameter);
    }
}
