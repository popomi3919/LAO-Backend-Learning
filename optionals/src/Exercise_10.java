package optionals.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

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

        Stream<Integer> convertion = numbers.stream().filter(i -> i % 2 == 0);
        Optional<Integer> output = convertion.findFirst();
        int outputAlternative = output.orElse(0);

        System.out.println(outputAlternative);

    }
}
