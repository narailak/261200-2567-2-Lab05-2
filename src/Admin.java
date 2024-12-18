import java.time.LocalDate;

public class Admin extends User {
    public Admin(){
        super();
    }
    public Admin(String name, int year, int month, int date) {
        super(name, year, month, date);
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("User type: admin.");
    }
    public void displayInfo(boolean full) {
        if(full == true){
            System.out.println("Your name: " + name);
            System.out.println("Your birthday: " + dob);
            System.out.println("User type: admin.");
            System.out.println("Today's Date: " + LocalDate.now());
        }else {
            System.out.println("Your name: " + name);
        }

    }
}