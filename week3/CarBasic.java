class Car {
    String model;
    int year;
    String color;
    
    void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println();
    }
}

public class CarBasic {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Toyota Camry";
        car1.year = 2022;
        car1.color = "Blue";
        
        Car car2 = new Car();
        car2.model = "Honda Civic";
        car2.year = 2021;
        car2.color = "Red";
        
        System.out.println("Car 1 Information:");
        car1.displayCarInfo();
        
        System.out.println("Car 2 Information:");
        car2.displayCarInfo();
    }
}