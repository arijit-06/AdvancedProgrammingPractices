package package2;
import package1.Vehicle;

public class Bike extends Vehicle {
    public void setSpeed(int speed) {
        this.speed = speed; // Accessing protected variable from different package (subclass)
        System.out.println("Bike speed set to: " + speed + " km/h");
    }
    
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.setSpeed(40);
        bike.displaySpeed();
        
        System.out.println("Protected variable 'speed' accessible in different package subclass");
    }
}