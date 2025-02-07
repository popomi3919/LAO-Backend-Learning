package Complexe.exercise8;

public class Exercise8 {
    public static void main(String[] args){
        Representation concert = new Representation("10/2/2022", 210);

        concert.reservationClient("Paul", 25);
        concert.reservationClient("Janet", 52);

        concert.afficherReservation();
    }
}
