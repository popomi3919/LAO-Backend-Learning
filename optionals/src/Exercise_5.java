package optionals.src;

import java.util.Optional;

public class Exercise_5 {
    public static String mapConversion(Optional<String> value) {
        String text = "Bonjour";
        Optional<String> s3 = value
                .map(s -> s.map(String::toUpperCase))
                .flatMap(s -> s.map(s1 -> text + " " + s1));


        Optional<String> capital = value.map(String::toUpperCase);
        Optional<String> s2 = value.flatMap(
                s -> Optional.of(s)
                        .map(s1 -> s1 + " " + "bonjour")
                        .orElseThrow()
        );
        return s2.get();
    }

    public static void main(String[] args) {
        System.out.println(s);
    }
}
