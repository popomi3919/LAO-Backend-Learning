package optionals.src;

import java.util.Optional;

public class Exercise_5 {
    public static String mapConversion(Optional<String> value) {
        String text = "Bonjour";
        Optional<String> capital = value.map(String::toUpperCase);
        Optional<String> concat = capital.flatMap(s -> Optional.of(s).map(s1 -> text + " " + s1));

        return concat.get();
    }

    public static void main(String[] args) {
        System.out.println(mapConversion(Optional.ofNullable("jimmy")));
    }
}
