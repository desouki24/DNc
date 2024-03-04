package dnc;
public class Chef extends Staff{
    // object from order class
    Order R;

    // compotiosn relationship(order)
    public Chef(Order R) {
        this.R = R;
    }

    @Override
    public String toString() {
        return "Chef{" + "R=" + R + '}';
    }

    public Chef() {
    }

    public void setR(Order R) {
        this.R = R;
    }

    public Order getR() {
        return R;
    }

    public void acceptOrder(int orderID){
    System.out.println ("Order has being prepair");
    }
    public void finishOrder(int orderID){
    System.out.println ("Order has been finished");
    }
    
}
