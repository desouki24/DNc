package dnc;
public class Cahsier extends Staff{
    //object from order class
    Order R;

    // compostion relationship (order)
    public Cahsier(Order R) {
        
        this.R = R;
    }

    @Override
    public String toString() {
        return "Cahsier{" + "R=" + R + '}';
    }

    public Cahsier() {
    }

    public void setR(Order R) {
        this.R = R;
    }

    public Order getR() {
        return R;
    }
   
   public void generateReciept (String personName,int orderID,long orderDate,double orderTax,double orderPrice,double totalAmount,String paymentType){
   //System.out.println (personName,orderID,orderDate,orderTax,orderPrice,totalAmount,paymentType);
   Object reciept [] = new Object[7];
   reciept [0]=personName;
   reciept [1]=orderID;
   reciept [2]=orderDate;
   reciept [3]=orderPrice;
   reciept [4]=orderTax;
   reciept [5]=totalAmount;
   reciept [6]=paymentType;
   System.out.println(reciept);
   System.out.println("Reciept generated");
}
   
    
}
