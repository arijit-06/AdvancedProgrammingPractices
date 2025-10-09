import java.util.Scanner;

public class SumEvenDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int sum = 0;
        int i = 2;
        do {
            if (i <= n) {
                sum += i;
                i += 2;
            }
        } while (i <= n);
        
        System.out.println("Sum of even numbers from 1 to " + n + " = " + sum);
        sc.close();
    }
}