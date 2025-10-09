class Animal {
    String name;
    int age;
    
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Lion extends Animal {
    Lion(String name, int age) {
        super(name, age);
    }
    
    void roar() {
        System.out.println(name + " roars loudly!");
    }
}

class Elephant extends Animal {
    Elephant(String name, int age) {
        super(name, age);
    }
    
    void trumpet() {
        System.out.println(name + " trumpets with its trunk!");
    }
}

class Monkey extends Animal {
    Monkey(String name, int age) {
        super(name, age);
    }
    
    void climb() {
        System.out.println(name + " climbs the tree swiftly!");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 5);
        lion.displayInfo();
        lion.roar();
        System.out.println();
        
        Elephant elephant = new Elephant("Dumbo", 8);
        elephant.displayInfo();
        elephant.trumpet();
        System.out.println();
        
        Monkey monkey = new Monkey("George", 3);
        monkey.displayInfo();
        monkey.climb();
    }
}