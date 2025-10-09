import java.util.Scanner;

public class PositiveInputDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number;
        do {
            System.out.print("Enter a positive number: ");
            number = sc.nextInt();
            if (number <= 0) {
                System.out.println("Invalid input! Please enter a positive number.");
            }
        } while (number <= 0);
        
        System.out.println("Thank you! You entered: " + number);
        sc.close();
    }
}