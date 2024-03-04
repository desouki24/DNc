package dnc;
public class DNc {
Inventory I;
Table T;

    public void setI(Inventory I) {
        this.I = I;
    }

    public void setT(Table T) {
        this.T = T;
    }

    @Override
    public String toString() {
        return "DNc{" + "I=" + I + ", T=" + T + '}';
    }

    public DNc() {
    }

    public Inventory getI() {
        return I;
    }

    public Table getT() {
        return T;
    }

    
    public static void main(String[] args) {
      /*  Staff manager = new Staff (10000,"business");
        manager.signUp("Ahmed","Mohamed",1,30,"male",546465465,"Nasr City","ahmed@gmail.com","ahmed1","dsgsd4g54sd0");
        manager.logIn("ahmed1","dsgsd4g54sd0");
        Manager HRmanager = new Manager();
        HRmanager.generateMenu("Pasta","1","Pasta","Pasta","50","Pasta red or white");
        Staff cashier = new Staff (3000,"business");
        cashier.signUp("Omar","Mohamed",2,30,"male",546775465,"Nasr City","omar@gmail.com","omar1","dsgskkg54sd0");
        cashier.logIn("omar1","dsgskkg54sd0");

        Staff chef = new Staff (6000,"cooking");
        chef.signUp("Ali","Mohamed",3,30,"male",548865465,"Nasr City","ali@gmail.com","ali1","dsgsd4gjjsd0");
        chef.logIn("ali1","dsgsd4gjjsd0");
        Staff waiter = new Staff (2000,"business");
        waiter.signUp("khlaed","Mohamed",4,30,"male",543365465,"Nasr City","khlaed@gmail.com","khaled1","dsrrd4g54sd0");
        waiter.logIn("khaled1","dsrrd4g54sd0");
        Staff cleaner = new Staff (1000,"");
        cleaner.signUp("Yasser","Mohamed",5,30,"male",776465465,"Nasr City","yasser@gmail.com","yasser1","dsgsd4pp4sd0");
        cleaner.logIn("yasser1","dsgsd4pp4sd0");
        Staff organizer = new Staff (2000,"business");
        organizer.signUp("Ramzy","Mohamed",6,30,"male",755465465,"Nasr City","ramzy@gmail.com","ramzy1","rrgsd4pp4sd0");
        organizer.logIn("ramzy1","rrgsd4pp4sd0");
        
        Item item = new Item ("50","pasta red or white","pasta","101","pasta",100,"pasta");
        
        Customer customer = new Customer () {};
        customer.signUp("Oamr", "Khaled", 7, 30, "male", 45464645, "Cairo", "omar55@gmail.com", "omar22", "dsgsdgsdgdsg");
        customer.logIn("omar22", "dsgsdgsdgdsg");
        customer.makeOrder("Pasta");
        customer.cancelOrder("pasta");
        customer.logOut();
        
        Cahsier HRcashier = new Cahsier();
        HRcashier.generateReciept("Omar", 101, 31/12/2021, 50, 0.1, 51, "cash");
        */
      Customer Omar = new Customer ("Omar") {};
      Customer Ali = new Customer ("Ali") {};
      Customer Mahmoud = new Customer ("Mahmoud") {};
      
      Offer xxx = new Offer ("xxx offer");
      
      xxx.getOffer(Omar);
      xxx.getOffer(Ali);
      xxx.getOffer(Mahmoud);
      xxx.didNotGetOffer(Mahmoud);
      
      xxx.setAvailablility(true);
        
        
        
       

        
    }
    
}
