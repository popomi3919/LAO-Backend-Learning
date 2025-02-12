package optionals.src;

import java.util.Optional;


public class Exercise_4 {
    public static void checkDoubles(Optional<Integer> number){
        Optional<Integer> even = number.filter(y -> y % 2 == 0);
        even.ifPresentOrElse(System.out::println, () -> System.out.println("Nombre impair ou absent"));
    }
    public static void main(String[] args){
        checkDoubles(Optional.of(2));
        checkDoubles(Optional.of(5));
        checkDoubles(Optional.ofNullable(null));
    }
}
