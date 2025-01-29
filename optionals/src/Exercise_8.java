package optionals.src;

import java.util.Optional;

public class Exercise_8 {
    public static Optional<Integer> conversion(String value){
       try {
           int convert = Integer.parseInt(value);
           return Optional.of(convert);
       } catch (NumberFormatException e) {
           return Optional.empty();
       }
    }
    public static void main(String[] args){
        System.out.println(conversion("t"));
        System.out.println(conversion("320").get());
    }
}
