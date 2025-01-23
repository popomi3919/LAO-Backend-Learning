package src;

import java.util.Optional;

public class Optionals{
    public static void main(String[] args){
        String probablyNullValue = null;
        Optional<String> optString = Optional.ofNullable(probablyNullValue);
    }
}