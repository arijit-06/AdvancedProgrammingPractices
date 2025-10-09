class Student {
    private int marks;
    
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0-100");
        }
    }
    
    public int getMarks() {
        return marks;
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Student student = new Student();
        
        // Using public methods to access private variable
        student.setMarks(85);
        System.out.println("Marks: " + student.getMarks());
        
        // Direct access not possible - would cause compilation error
        // student.marks = 90; // Error: marks has private access
        
        System.out.println("Direct access to private variable 'marks' is not allowed");
    }
}