package dnc;

public class Visa extends Payment{
    int cardPassword;

    public Visa(int cardPassword) {
        this.cardPassword = cardPassword;
    }

    public Visa() {
    }

    public void setCardPassword(int cardPassword) {
        this.cardPassword = cardPassword;
    }

    public int getCardPassword() {
        return cardPassword;
    }
    

    @Override
    public String toString() {
        return "Visa{" + "cardPassword=" + cardPassword + '}';
    }
    
    
}
