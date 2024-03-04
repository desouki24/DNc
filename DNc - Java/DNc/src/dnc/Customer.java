package dnc;
public abstract class Customer extends Person implements Observer {
    Order O;
    Reservation R;

    public Customer(String personFirstNme, String personLastName, int personID, int personAge, String personGender, int personPhoeneNumber, String personAddress, String personEmail, String personUserName, String personPassword) {
        super(personFirstNme, personLastName, personID, personAge, personGender, personPhoeneNumber, personAddress, personEmail, personUserName, personPassword);
    }
    
    // use for observer
    public Customer (String personFirstName){
    this.personFirstNme = personFirstName;
    }
    
    public void setO(Order O) {
        this.O = O;
    }

    public void setR(Reservation R) {
        this.R = R;
    }
    

    @Override
    public String toString() {
        return "Customer{" + "O=" + O + ", R=" + R + '}';
    }

    public Customer() {
    }
    
    public void makeOrder(String itemName){
    System.out.println("Your order has been submit"); 
    }
    public void cancelOrder(String itemName){
    System.out.println ("Your order has been cancled");
    }
    public void reserveTable(long reservationDate, String reservationTime){
    System.out.println ("Your Table has been reserved");
    }
    public void reserveEvent(String reservationType, long reservationDate, String startTime, String endTime, int numOfPeople){
    System.out.println ("Your event has been reserved");
    }
    public void payOrder(String paymentType, double totalAmount){
    System.out.println ("Your reciept hass been generated");
    }
    
    public void update(String message){
    System.out.println(this.personFirstNme + "has new notification : " + message);
    }
    
    
}
