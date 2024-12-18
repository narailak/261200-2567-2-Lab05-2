public class Main {
    public static void main(String[] args) {
        User john = new User("john",1954,2,18);
        john.displayInfo();
        Admin nicolas = new Admin("nicolas",1964,1,7);
        nicolas.displayInfo();
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
    }
}