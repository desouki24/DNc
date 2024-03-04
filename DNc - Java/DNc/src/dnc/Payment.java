package dnc;
public class Payment {
    String paymentType;
    double totalAmount;

    public Payment(String paymentType, double totalAmount) {
        this.paymentType = paymentType;
        this.totalAmount = totalAmount;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Payment() {
    }

    public String getPaymentType() {
        return paymentType;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Payment{" + "paymentType=" + paymentType + ", totalAmount=" + totalAmount + '}';
    }
    
    
}
