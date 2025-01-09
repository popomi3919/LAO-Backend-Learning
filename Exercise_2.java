import java.util.ArrayList;

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

        System.out.println("Collection avant supression: " + liste);

        ArrayList<Integer> list = new ArrayList<>(liste);

        liste.clear();

        for (int k  : list) {
            if(!liste.contains(k)){
                liste.add(k);
            } else {
                liste.remove((Integer) k);
            }
        }


        System.out.println("Collection aprés supression: " + liste);
     }
}
