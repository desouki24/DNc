package dnc;

public class RegularReservation extends Reservation{
    
    public RegularReservation(int reservationID, long reservationDate, String reservationTime, int numOfPeople, double reservationPrice, Organizer H, Order R) {
        super(reservationID, reservationDate, reservationTime, numOfPeople, reservationPrice, H, R);
    }

    
    
}
