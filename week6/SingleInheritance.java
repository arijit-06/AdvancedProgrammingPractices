class Teacher {
    String name;
    String subject;
    
    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    
    void displayDetails() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

class MathTeacher extends Teacher {
    int classesHandled;
    
    MathTeacher(String name, String subject, int classesHandled) {
        super(name, subject);
        this.classesHandled = classesHandled;
    }
    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Classes Handled: " + classesHandled);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        MathTeacher mt = new MathTeacher("John Smith", "Mathematics", 5);
        mt.displayDetails();
    }
}