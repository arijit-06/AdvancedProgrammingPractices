class Student {
    String name;
    int rollNumber;
    double marks;
    
    char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }
    
    void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Alice Johnson";
        student.rollNumber = 101;
        student.marks = 85.5;
        
        student.displayStudentInfo();
    }
}