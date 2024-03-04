package dnc;

public class Waiter  extends Staff{
    // object from order class
    Order R;

    //compostion relationship (order)
    public Waiter(Order R) {
        this.R = R;
    }

    public Waiter() {
    }

    public void setR(Order R) {
        this.R = R;
    }

    public Order getR() {
        return R;
    }
    

    @Override
    public String toString() {
        return "Waiter{" + "R=" + R + '}';
    }
    
    public void pickupOrder (int orderID){
    System.out.println ("Order "+orderID+ "Has finished");
    }
    
    
}
