import java.util.Scanner;

public class PowersOfTwoDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        
        System.out.println("Powers of 2 up to 2^" + exponent + ":");
        int i = 0;
        do {
            int power = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + power);
            i++;
        } while (i <= exponent);
        
        sc.close();
    }
}