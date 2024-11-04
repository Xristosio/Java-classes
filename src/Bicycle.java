public class Bicycle extends AbstractVehicle{
    private String brand;
    private String type;

    public Bicycle(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println(brand + " " + type + " is pedaling.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + type + " has stopped.");
    }

    @Override
    public void move() {
        System.out.println(brand + " " + type + " is moving.");
    }

    @Override
    public void honk(){
        System.out.println(brand + " " + type + " is honking.");
    }

    // Επιπλέον μέθοδος για τα ποδήλατα
    public void adjustSeatHeight(int height) {
        System.out.println("Adjusting seat height to " + height + " cm for " + brand + " " + type + ".");
    }
}
