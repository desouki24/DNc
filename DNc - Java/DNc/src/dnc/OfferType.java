
package dnc;

public interface OfferType {
    void getOffer(Observer observer);
    void didNotGetOffer(Observer observer);
    void notifyAllGettingOffers();
}
