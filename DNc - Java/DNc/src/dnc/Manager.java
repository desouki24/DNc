package dnc;
import java.util.List;
public class Manager extends Staff{
    
    List<Inventroy>I;

    private static class Inventroy {

        public Inventroy() {
        }
        
    }

    public Manager() {
    }

    public void setI(List<Inventroy> I) {
        this.I = I;
    }

    public List<Inventroy> getI() {
        return I;
    }

    @Override
    public String toString() {
        return "Manager{" + "I=" + I + '}';
    }
    
    public void addItem(    
    String itemName,
    String itemID,
    String itemCategory,
    int itemQuantity,
    String itemType,    
    String itemPrice,
    String itemDescription){
    String items[]= {itemName,itemID,itemCategory,itemType,itemPrice,itemDescription,itemCategory};
    System.out.println ("Item added");
    }
    public void deleteUtem(String itemID){
    System.out.println ("Item deleted");
    }
    public void searchItem(String ItemId){
    if(true){
    System.out.println ("Item found");
    }
    else
    System.out.println ("Item not found");
    }
    public void generateMenu(    
    String itemName,
    String itemID,
    String itemCategory,
    String itemType,    
    String itemPrice,
    String itemDescription){
        
    String menu[] = {itemName,itemID,itemCategory,itemType,itemPrice,itemDescription}; 
    System.out.println(menu);
    System.out.println ("Menu generated");
    }   
}
