package optionals.src;

import java.util.ArrayList;
import java.util.List;

public class Exercise_10 {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(33);
        numbers.add(5);
        numbers.add(10);
        numbers.add(18);
        numbers.add(19);
        numbers.add(4);
        numbers.add(17);

       numbers.stream()
               .filter(i -> i % 2 == 0)
               .findFirst()
               .ifPresentOrElse(System.out::println, () -> System.out.println("Aucun Element"));
    }
}
