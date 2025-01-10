import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> notes = new ArrayList<>();

        System.out.println("Entrez les notes (entre 0 et 20). Entrez -1 pour terminé: ");

        while (true){
            int note = scanner.nextInt();
            if(note == -1){
                break;
            }
            if(note >= 0 && note <= 20){
                notes.add(note);
            } else {
                System.out.println("Note invalide, entrez une note entre 0 et 20");
            }
        }

        if(notes.isEmpty()){
            System.out.println("Aucune note saisi");
        }

        Collections.sort(notes);
        int noteMax = Collections.max(notes);
        int noteMin = Collections.min(notes);
        int sommeNote = 0;

        for( int note : notes){
            sommeNote  += note ;
        }

        double moyenne = (double) sommeNote / notes.size();

        System.out.println("\n Notes ordonée: " + notes);

        System.out.println("\n Note Maximal: " + noteMax);

        System.out.println("\n Note Minimal: " + noteMin);

        System.out.println("\n Moyenne des notes: " + moyenne);
    }

}
