package dnc;
public class Staff extends Person {
    double sallary;
    String education;

    public Staff(double sallary, String education, String personFirstNme, String personLastName, int personID, int personAge, String personGender, int personPhoeneNumber, String personAddress, String personEmail, String personUserName, String personPassword) {
        super(personFirstNme, personLastName, personID, personAge, personGender, personPhoeneNumber, personAddress, personEmail, personUserName, personPassword);
        this.sallary = sallary;
        this.education = education;
    }

    public Staff(double sallary, String education) {
        this.sallary = sallary;
        this.education = education;
    }
    
    public Staff() {
    }



    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public double getSallary() {
        return sallary;
    }

    public String getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return "Staff{" + "sallary=" + sallary + ", education=" + education + '}';
    }


    
    
}
