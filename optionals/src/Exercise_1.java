package optionals.src;

import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercise_1 {
    public static Optional<String> getGreetings(){
        String message = null;
        Optional<String> checker = Optional.ofNullable(message);
        return checker;
    }
    public static void main(String[] args){
        getGreetings().ifPresentOrElse(System.out::println,
                Optional::empty);
    }
}