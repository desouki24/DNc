package dnc;
public class Reservation {
    int reservationID;
    long reservationDate;
    String reservationTime;
    int numOfPeople;
    double reservationPrice;
    // object from organizer class
    Organizer H;
    // object from order class
    Order R;
    
    Customer C;

    // compotiosn relationship (organzier,order)
    public Reservation(int reservationID, long reservationDate, String reservationTime, int numOfPeople, double reservationPrice, Organizer H, Order R) {
        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.numOfPeople = numOfPeople;
        this.reservationPrice = reservationPrice;
        this.H = H;
        this.R = R;
    }

    public Reservation() {
    }
    

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public void setReservationDate(long reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setReservationTime(String reservationTime) {
        this.reservationTime = reservationTime;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public void setReservationPrice(double reservationPrice) {
        this.reservationPrice = reservationPrice;
    }

    public void setH(Organizer H) {
        this.H = H;
    }

    public void setR(Order R) {
        this.R = R;
    }

    public void setC(Customer C) {
        this.C = C;
    }

    public int getReservationID() {
        return reservationID;
    }

    public long getReservationDate() {
        return reservationDate;
    }

    public String getReservationTime() {
        return reservationTime;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public double getReservationPrice() {
        return reservationPrice;
    }

    public Organizer getH() {
        return H;
    }

    public Order getR() {
        return R;
    }

    public Customer getC() {
        return C;
    }

    @Override
    public String toString() {
        return "Reservation{" + "reservationID=" + reservationID + ", reservationDate=" + reservationDate + ", reservationTime=" + reservationTime + ", numOfPeople=" + numOfPeople + ", reservationPrice=" + reservationPrice + ", H=" + H + ", R=" + R + ", C=" + C + '}';
    }


    
}
