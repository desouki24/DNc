package dnc;
public class Order {
    int orderID;
    long orderDate;
    double orderTax;
    double orderPrice;
    // Object from table class
    Table T;
    // oject from item class
    Item I;
    // object from payment class
    Payment P;
    // object from customer class
    Customer C;
    // compostion relationship (table , item , payment)

    public Order(int orderID, long orderDate, double orderTax, double orderPrice, Table T, Item I, Payment P) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.orderTax = orderTax;
        this.orderPrice = orderPrice;
        this.T = T;
        this.I = I;
        this.P = P;
    }

    public Order() {
    }
    

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setOrderDate(long orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderTax(double orderTax) {
        this.orderTax = orderTax;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setT(Table T) {
        this.T = T;
    }

    public void setI(Item I) {
        this.I = I;
    }

    public void setP(Payment P) {
        this.P = P;
    }

    public void setC(Customer C) {
        this.C = C;
    }

    public int getOrderID() {
        return orderID;
    }

    public long getOrderDate() {
        return orderDate;
    }

    public double getOrderTax() {
        return orderTax;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public Table getT() {
        return T;
    }

    public Item getI() {
        return I;
    }

    public Payment getP() {
        return P;
    }

    public Customer getC() {
        return C;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", orderDate=" + orderDate + ", orderTax=" + orderTax + ", orderPrice=" + orderPrice + ", T=" + T + ", I=" + I + ", P=" + P + ", C=" + C + '}';
    }
    
    

    
}
