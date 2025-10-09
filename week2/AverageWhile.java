import java.util.Scanner;

public class AverageWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers (enter 0 to stop):");
        double sum = 0;
        int count = 0;
        double num;
        
        while ((num = sc.nextDouble()) != 0) {
            sum += num;
            count++;
        }
        
        if (count > 0) {
            double average = sum / count;
            System.out.println("Average = " + average);
        } else {
            System.out.println("No numbers entered.");
        }
        
        sc.close();
    }
}