import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your exam score: ");
        int score = sc.nextInt();
        
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A (Excellent)");
                break;
            case 8:
                System.out.println("B (Very Good)");
                break;
            case 7:
                System.out.println("C (Good)");
                break;
            case 6:
                System.out.println("D (Satisfactory)");
                break;
            default:
                if (score >= 0 && score < 60) {
                    System.out.println("F (Fail)");
                } else {
                    System.out.println("Invalid score input");
                }
                break;
        }
        
        sc.close();
    }
}