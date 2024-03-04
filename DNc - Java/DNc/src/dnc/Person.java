package dnc;
public class Person {
    String personFirstNme;
    String personLastName;
    int personID;
    int personAge;
    String personGender;
    int personPhoeneNumber;
    String personAddress;
    String personEmail;
    String personUserName;
    String personPassword;

    public Person(String personFirstNme, String personLastName, int personID, int personAge, String personGender, int personPhoeneNumber, String personAddress, String personEmail, String personUserName, String personPassword) {
        this.personFirstNme = personFirstNme;
        this.personLastName = personLastName;
        this.personID = personID;
        this.personAge = personAge;
        this.personGender = personGender;
        this.personPhoeneNumber = personPhoeneNumber;
        this.personAddress = personAddress;
        this.personEmail = personEmail;
        this.personUserName = personUserName;
        this.personPassword = personPassword;
    }

    public Person() {
    }

    Person(String ahmed, String mohamed, int i, int i0, String male, int i1, String nasr_City, String ahmedgmailcom, String ahmed1, String dsgsd4g54sd, int i2, String fhfhd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPersonFirstNme(String personFirstNme) {
        this.personFirstNme = personFirstNme;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public void setPersonPhoeneNumber(int personPhoeneNumber) {
        this.personPhoeneNumber = personPhoeneNumber;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public void setPersonUserName(String personUserName) {
        this.personUserName = personUserName;
    }

    public void setPersonPassword(String personPassword) {
        this.personPassword = personPassword;
    }

    public String getPersonFirstNme() {
        return personFirstNme;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public int getPersonID() {
        return personID;
    }

    public int getPersonAge() {
        return personAge;
    }

    public String getPersonGender() {
        return personGender;
    }

    public int getPersonPhoeneNumber() {
        return personPhoeneNumber;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public String getPersonUserName() {
        return personUserName;
    }

    public String getPersonPassword() {
        return personPassword;
    }

    @Override
    public String toString() {
        return "Person{" + "personFirstNme=" + personFirstNme + ", personLastName=" + personLastName + ", personID=" + personID + ", personAge=" + personAge + ", personGender=" + personGender + ", personPhoeneNumber=" + personPhoeneNumber + ", personAddress=" + personAddress + ", personEmail=" + personEmail + ", personUserName=" + personUserName + ", personPassword=" + personPassword + '}';
    }
    public void signUp (
    String personFirstNme,
    String personLastName,
    int personID,
    int personAge,        
    String personGender,
    int personPhoeneNumber,
    String personAddress,
    String personEmail,
    String personUserName,
    String personPassword){
    System.out.println("Your DNc account has been created"); 
    }
    
    public void logIn (
    String personUserName,
    String personPassword){
    System.out.println("Wellcome DNc"); 
    }
    
    public void logOut(){
    System.out.println ("Goodbye");
    }  
}
