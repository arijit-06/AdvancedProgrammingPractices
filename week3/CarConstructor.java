class Car {
    String model;
    int year;
    String color;
    
    Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
    
    void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println();
    }
}

public class CarConstructor {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", 2022, "Blue");
        Car car2 = new Car("Honda Civic", 2021, "Red");
        
        System.out.println("Car 1 Information:");
        car1.displayCarInfo();
        
        System.out.println("Car 2 Information:");
        car2.displayCarInfo();
    }
}