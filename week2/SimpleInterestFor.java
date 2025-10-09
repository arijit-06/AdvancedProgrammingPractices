import java.util.Scanner;

public class SimpleInterestFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        
        System.out.println("Year\tSimple Interest\tTotal Amount");
        for (int i = 1; i <= years; i++) {
            double si = (principal * rate * i) / 100;
            double total = principal + si;
            System.out.println(i + "\t" + si + "\t\t" + total);
        }
        
        sc.close();
    }
}