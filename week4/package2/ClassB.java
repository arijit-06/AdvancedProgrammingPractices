package package2;
import package1.ClassA;

public class ClassB {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        objA.display(); // Calling public method from different package
        
        System.out.println("Public method accessible across different packages");
    }
}