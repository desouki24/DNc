package dnc;
public class Organizer extends Staff {
Reservation R;
    public Organizer() {
    }

    public Organizer(Reservation R) {
        this.R = R;
    }

    public void setR(Reservation R) {
        this.R = R;
    }

    public Reservation getR() {
        return R;
    }
    public void acceptReservation(int reservationID){
    System.out.println ("Reservation has been accepted");
    }
    public void addPlan(String startTime,String endTime){
    System.out.println ("Reservation plan has been added");
    }
    
}
