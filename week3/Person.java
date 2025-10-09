class Person {
    String name;
    int age;
    String address;
    
    // Default constructor
    Person() {
        name = "Unknown";
        age = 0;
        address = "Not specified";
    }
    
    // Parameterized constructor
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println();
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        // Using default constructor
        Person person1 = new Person();
        
        // Using parameterized constructor
        Person person2 = new Person("John Smith", 25, "123 Main Street");
        
        System.out.println("Person 1 (Default Constructor):");
        person1.displayPersonInfo();
        
        System.out.println("Person 2 (Parameterized Constructor):");
        person2.displayPersonInfo();
    }
}