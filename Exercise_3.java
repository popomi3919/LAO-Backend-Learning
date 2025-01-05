import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir une phrase: ");
        String phrase = scanner.nextLine();

        String[] mots = phrase.split("\\s+");

        HashMap<String, Integer> occurenceMot = new HashMap<>();

        for(String mot : mots){
            occurenceMot.put(mot, occurenceMot.getOrDefault(mot,0) + 1);
        }

        for (Map.Entry<String,Integer> entry: occurenceMot.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
     }
}
