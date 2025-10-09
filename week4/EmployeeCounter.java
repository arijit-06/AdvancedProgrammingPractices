class Employee {
    private String name;
    private static int count = 0;
    
    public Employee(String name) {
        this.name = name;
        count++; // Increment count for each new object
    }
    
    public String getName() {
        return name;
    }
    
    public static int getCount() {
        return count;
    }
}

public class EmployeeCounter {
    public static void main(String[] args) {
        System.out.println("Initial employee count: " + Employee.getCount());
        
        Employee emp1 = new Employee("Alice");
        System.out.println("After creating " + emp1.getName() + ": " + Employee.getCount());
        
        Employee emp2 = new Employee("Bob");
        System.out.println("After creating " + emp2.getName() + ": " + Employee.getCount());
        
        Employee emp3 = new Employee("Charlie");
        System.out.println("After creating " + emp3.getName() + ": " + Employee.getCount());
        
        System.out.println("Total employees created: " + Employee.getCount());
    }
}