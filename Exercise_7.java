import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise_7 {
    public static void main(String[] args){
        ArrayList<String> collection1 = new ArrayList<>(Arrays.asList("A", "B", "C", "F", "P", "F", "A"));
        HashSet<String> collection2 = new HashSet<>(Arrays.asList("Q", "R", "T", "A", "B", "P", "N"));

        Set<String> elementCommun = new HashSet<>(collection1);
        elementCommun.retainAll(collection2);
        System.out.println("Elements Commun: " + elementCommun);

        Set<String> elementUnique = new HashSet<>(collection1);
        elementUnique.removeAll(collection2);
        System.out.println("Elements Unique dans la premier collection: " + elementUnique);

    }

    }
