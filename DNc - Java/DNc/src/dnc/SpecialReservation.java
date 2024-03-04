package dnc;
public class SpecialReservation extends Reservation {
    String reservationType;
    String startTime;
    String endTime;

    public SpecialReservation(String reservationType, String startTime, String endTime, int reservationID, long reservationDate, String reservationTime, int numOfPeople, double reservationPrice, Organizer H, Order R) {
        super(reservationID, reservationDate, reservationTime, numOfPeople, reservationPrice, H, R);
        this.reservationType = reservationType;
        this.startTime = startTime;
        this.endTime = endTime;
    }



    

    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getReservationType() {
        return reservationType;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }
    

    @Override
    public String toString() {
        return "SpecialReservation{" + "reservationType=" + reservationType + ", startTime=" + startTime + ", endTime=" + endTime + '}';
    }
    
    
}
