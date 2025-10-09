class Rectangle {
    double width;
    double height;
    
    double calculateArea() {
        return width * height;
    }
    
    double calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.width = 5.5;
        rect.height = 3.2;
        
        double area = rect.calculateArea();
        double perimeter = rect.calculatePerimeter();
        
        System.out.println("Rectangle Dimensions:");
        System.out.println("Width: " + rect.width);
        System.out.println("Height: " + rect.height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}