class MathUtility {
    // Static method - can be called without creating object
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Non-static method - requires object to call
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class MathUtilityDemo {
    public static void main(String[] args) {
        // Calling static method directly with class name
        int sum = MathUtility.add(10, 20);
        System.out.println("Sum (static method): " + sum);
        
        // Creating object to call non-static method
        MathUtility math = new MathUtility();
        int product = math.multiply(5, 6);
        System.out.println("Product (non-static method): " + product);
        
        System.out.println("Static method called without object, non-static method requires object");
    }
}