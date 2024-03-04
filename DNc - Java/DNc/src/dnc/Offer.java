package dnc;

import java.util.ArrayList;
import java.util.List;

public class Offer implements OfferType {
   String name;
   String availablility;
   
   private List<Observer> observerList;
   public Offer (String name){
   this.name = name;
   observerList = new ArrayList<>();
   }
   
    public void getOffer(Observer observer){
    observerList.add(observer);
    }
    public void didNotGetOffer(Observer observer){
    observerList.remove(observer);
    }
    public void notifyAllGettingOffers(){
    for(Observer observer : observerList){
    observer.update(availablility);
    }
    }
    public void setAvailablility(boolean available){
    availablility = this.name + (available ? "Available" : "Not Available");
    notifyAllGettingOffers();
    }
    
}
