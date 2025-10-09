package package1;

public class Vehicle {
    protected int speed;
    
    public Vehicle() {
        speed = 0;
    }
    
    public void displaySpeed() {
        System.out.println("Vehicle speed: " + speed + " km/h");
    }
}