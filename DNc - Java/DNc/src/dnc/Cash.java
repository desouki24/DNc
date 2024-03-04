package dnc;
public class Cash extends Payment{
    double cashTend;

    @Override
    public String toString() {
        return "Cash{" + "cashTend=" + cashTend + '}';
    }

    public Cash(double cashTend) {
        this.cashTend = cashTend;
    }

    public Cash() {
    }

    public void setCashTend(double cashTend) {
        this.cashTend = cashTend;
    }

    public double getCashTend() {
        return cashTend;
    }
    
    
 
}
