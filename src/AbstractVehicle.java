public abstract class AbstractVehicle implements Vehicle {
    private int speed;
    private int fuel;

    public AbstractVehicle(){
        this.speed=0;
        this.fuel=100; // ξεκινά με πλήρες καύσιμο
    }

    public void accelerate(int increment){
        speed += increment;
        fuel -= increment / 2; // μείωση καυσίμου ανάλογα με την ταχύτητα
        System.out.println("Accelerating by " + increment + " km/h. Current speed: " + speed + " km/h. Fuel: " + fuel + "%");
    }

    public void decelerate(int decrement) {
        speed -= decrement;
        System.out.println("Decelerating by " + decrement + " km/h. Current speed: " + speed + " km/h.");
    }

    public void refuel(int amount) {
        if(fuel + amount >= fuel){
            fuel=100;
        }else{
            fuel += amount;
        }
        System.out.println("Refueling. Current fuel level: " + fuel + "%");
    }

    @Override
    public abstract void start();

    @Override
    public abstract void stop();

    @Override
    public abstract void honk();

}
