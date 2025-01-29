package optionals.src;

import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercise_1 {
    public static Optional<String> getGreetings(){
        String message = "Hello!";
        Optional<String> checker = Optional.ofNullable(message);
        if (checker.isPresent()){
            return Optional.of(message);
        } else {
            return Optional.empty();
        }
    }
    public static void main(String[] args){
        System.out.println(getGreetings());
    }
}