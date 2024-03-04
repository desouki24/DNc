package dnc;
public class Table {
    int tableID;
    int tableCapacity;
    boolean tableReservation;
    String tableCategory;
    
    DNc dnc;

    public Table(int tableID, int tableCapacity, boolean tableReservation, String tableCategory) {
        this.tableID = tableID;
        this.tableCapacity = tableCapacity;
        this.tableReservation = tableReservation;
        this.tableCategory = tableCategory;
    }

    public Table() {
    }
    
    

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public void setTableCapacity(int tableCapacity) {
        this.tableCapacity = tableCapacity;
    }

    public void setTableReservation(boolean tableReservation) {
        this.tableReservation = tableReservation;
    }

    public void setTableCategory(String tableCategory) {
        this.tableCategory = tableCategory;
    }

    public int getTableID() {
        return tableID;
    }

    public int getTableCapacity() {
        return tableCapacity;
    }

    public boolean isTableReservation() {
        return tableReservation;
    }

    public String getTableCategory() {
        return tableCategory;
    }

    @Override
    public String toString() {
        return "Table{" + "tableID=" + tableID + ", tableCapacity=" + tableCapacity + ", tableReservation=" + tableReservation + ", tableCategory=" + tableCategory + ", dnc=" + dnc + '}';
    }

   
    
    
}
