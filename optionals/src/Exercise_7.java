package optionals.src;

import java.util.Optional;

public class Exercise_7 {
    public static Optional<String> combineOptionals(Optional<String> firstName, Optional<String> lastName) {
        if (firstName.isEmpty() || lastName.isEmpty()) {
            return Optional.empty();
        }
        else{
            return Optional.of(firstName.get() + Optional.of(" ").get() + lastName.get());
        }
    }
    public static void main(String[] args){
        System.out.println(combineOptionals(Optional.of("John"), Optional.of("Doe")).get());
    }
}
