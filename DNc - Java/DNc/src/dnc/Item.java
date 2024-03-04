package dnc;
public class Item extends Inventory{
    String itemPrice;
    String itemDescription;

    public Item(String itemPrice, String itemDescription, String itemName, String itemID, String itemCategory, int itemQuantity, String itemType) {
        super(itemName, itemID, itemCategory, itemQuantity, itemType);
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
    }



    public Item() {
    }

    Item(String string, String pasta_red_or_white, String pasta, int i, String pasta0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }
    

    @Override
    public String toString() {
        return "Item{" + "itemPrice=" + itemPrice + ", itemDescription=" + itemDescription + '}';
    }
    
}
