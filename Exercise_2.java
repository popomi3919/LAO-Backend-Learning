import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Exercise_2 {
    public static void main(String[] args){
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(2);
        liste.add(50);
        liste.add(5);
        liste.add(41);
        liste.add(13);
        liste.add(7);
        liste.add(19);
        liste.add(41);
        liste.add(10);
        liste.add(2);
        liste.add(50);

        Collections.sort(liste);

        HashSet<Integer> listeSansDoublon = new HashSet<>(liste);

        System.out.println("Collection avant supression: " + liste);
        System.out.println("Collection aprés supression: " + listeSansDoublon);
     }
}
