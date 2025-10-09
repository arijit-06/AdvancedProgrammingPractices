class Employee {
    String name;
    double salary;
    
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    String department;
    
    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class SeniorManager extends Manager {
    int teamSize;
    
    SeniorManager(String name, double salary, String department, int teamSize) {
        super(name, salary, department);
        this.teamSize = teamSize;
    }
    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        SeniorManager sm = new SeniorManager("Alice Johnson", 120000, "IT", 15);
        sm.displayDetails();
    }
}