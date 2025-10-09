public class Age {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
