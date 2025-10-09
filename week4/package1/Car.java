package package1;

public class Car extends Vehicle {
    public void setSpeed(int speed) {
        this.speed = speed; // Accessing protected variable from same package
        System.out.println("Car speed set to: " + speed + " km/h");
    }
    
    public void accelerate() {
        speed += 20; // Modifying protected variable
        System.out.println("Car accelerated! New speed: " + speed + " km/h");
    }
    
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(60);
        car.accelerate();
        car.displaySpeed();
        
        System.out.println("Protected variable 'speed' accessible in same package subclass");
    }
}