package dnc;
public class Inventory {
    String itemName;
    String itemID;
    String itemCategory;
    int itemQuantity;
    String itemType;
    
    DNc dnc;
    Manager M;

    public Inventory(String itemName, String itemID, String itemCategory, int itemQuantity, String itemType) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.itemCategory = itemCategory;
        this.itemQuantity = itemQuantity;
        this.itemType = itemType;
    }

    public Inventory() {
    }
    
    
    

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }



    public String getItemName() {
        return itemName;
    }

    public String getItemID() {
        return itemID;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public String getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return "Inventory{" + "itemName=" + itemName + ", itemID=" + itemID + ", itemCategory=" + itemCategory + ", itemQuantity=" + itemQuantity + ", itemType=" + itemType + ", dnc=" + dnc + ", M=" + M + '}';
    }
    
    
    
}
