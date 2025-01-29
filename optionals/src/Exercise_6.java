package optionals.src;

import java.util.Optional;

public class Exercise_6 {
    public static Optional<Integer>checkValues(Optional<Integer> number){
        Optional<Integer> even = number.filter(y -> y > 10);
        if(even.isPresent()){
            return number;
        } else {
            return Optional.empty();
        }
    }
    public static void main(String[] args){
        System.out.println(checkValues(Optional.of(5)));
        System.out.println(checkValues(Optional.of(15)));
        System.out.println(checkValues(Optional.empty()));
    }
}
