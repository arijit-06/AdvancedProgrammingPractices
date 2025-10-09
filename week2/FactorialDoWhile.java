import java.util.Scanner;

public class FactorialDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();
        
        long factorial = 1;
        int i = 1;
        do {
            if (i <= n) {
                factorial *= i;
                i++;
            }
        } while (i <= n);
        
        System.out.println("Factorial of " + n + " = " + factorial);
        sc.close();
    }
}