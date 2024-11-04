public class Car extends AbstractVehicle{
    //private String make;
    //private String model;       Κλασσικές δηλώσεις αν δεν υπήρεχε το record VehicleInfo
    //private int year;

    private VehicleInfo info;
    private boolean isRunning;
    final int MAX_SPEED = 300;

    public Car(String make, String model, int year) {
        // this.make = make;
        // this.model = model;
        // this.year = year;

        this.info= new VehicleInfo(make, model, year);
        this.isRunning = false;
    }

    @Override
    public void start() throws VehicleAlreadyStartedException{
        if(isRunning){
            throw new VehicleAlreadyStartedException(info.make() + " " + info.model() + " is already running");
        }
        isRunning = true;
        System.out.println(info.make()+" "+info.model() +" is starting.");
    }

    @Override
    public void stop() throws VehicleAlreadyStoppedException {
        if(!isRunning){
            throw new VehicleAlreadyStoppedException(info.make() + " " + info.model() + " is already stopped");
        }
        isRunning = false;
        System.out.println(info.make()+" "+info.model() +" is stopping.");
    }

    @Override
    public void move(){
        System.out.println(info.make()+" "+info.model() +" is moving.");
    }

    @Override
    public void honk(){
        System.out.println(info.make() + " " + info.model() + " is honking.");
    }

    // Επιπλέον μέθοδος για αυτοκίνητα
    public void openTrunk() {
        System.out.println(info.make() + " " + info.model() + "'s trunk is now open.");
    }
}
