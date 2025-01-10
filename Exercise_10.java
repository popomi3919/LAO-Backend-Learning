import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise_10 {
    public static void main(String[] args){
        HashMap<String, Set<String>> categories = new HashMap<>();

        HashSet<String> sports = new HashSet<>();
        sports.add("Football");
        sports.add("Basketball");
        sports.add("Baseball");

        HashSet<String> technologies = new HashSet<>();
        technologies.add("Java");
        technologies.add("Python");
        technologies.add("Javascript");

        categories.put("Sports",sports);
        categories.put("Technologies", technologies);

        String keyword = "Java";

        categories.forEach(
                (categorie, mots) -> {
                    if (mots.contains(keyword)){
                        System.out.println(keyword + " appartient a la catégorie: " + categorie);
                    }
                }
        );
    }
    }
