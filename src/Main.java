//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("audi","A4",2001);
        car1.start();
        car1.stop();

        try {
            // Εκκίνηση του οχήματος
            car1.start();

            // Δοκιμή διπλής εκκίνησης για να δούμε την εξαίρεση
            car1.start();
        } catch (VehicleAlreadyStartedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try{
            car1.stop();
            car1.stop();
        }catch (VehicleAlreadyStoppedException e) {
            System.out.println("Error: " + e.getMessage());
        }


        Car myCar = new Car("Toyota", "Corolla", 2020);
        myCar.start();  // Θα εκτυπώσει: "Toyota Corolla is starting."
        myCar.accelerate(30);
        myCar.honk();
        myCar.move();
        myCar.decelerate(10);
        myCar.accelerate(30);
        myCar.refuel(20);
        myCar.refuel(20);
        myCar.stop();   // Θα εκτυπώσει: "Toyota Corolla is stopping."
        myCar.openTrunk();

        Bicycle myBicycle = new Bicycle("Giant", "Mountain Bike");
        myBicycle.start();  // Θα εκτυπώσει: "Giant Mountain Bike is pedaling."
        myBicycle.stop();   // Θα εκτυπώσει: "Giant Mountain Bike has stopped."
        myBicycle.accelerate(10);
        myBicycle.move();
        myBicycle.honk();
        myBicycle.decelerate(5);
        myBicycle.adjustSeatHeight(80);

        SessionManager sessionManager = new SessionManager();
        // Δημιουργία συνεδρίας για έναν χρήστη
        sessionManager.createSession(1, "chris", "Admin");
        // Προβολή στοιχείων χρήστη από τη συνεδρία
        sessionManager.printUserInfo();
        // Εκκαθάριση συνεδρίας
        sessionManager.clearSession();

        sessionManager.printUserInfo();

        //Test comment for pull request
   }
}