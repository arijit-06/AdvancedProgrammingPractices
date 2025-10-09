class UPIAccount {
    private String accountPin;
    private String bankDetails;
    private double balance;
    
    public UPIAccount(String pin, String bankDetails, double balance) {
        this.accountPin = pin;
        this.bankDetails = bankDetails;
        this.balance = balance;
    }
    
    private boolean validatePin(String pin) {
        return this.accountPin.equals(pin);
    }
    
    private void communicateWithBank() {
        System.out.println("Secure communication with bank...");
    }
    
    // Simple interface - hides complex bank operations
    public void sendMoney(double amount, String recipientId) {
        System.out.println("Sending ₹" + amount + " to " + recipientId);
        communicateWithBank();
        System.out.println("Money sent successfully!");
    }
    
    // Encapsulated access to balance
    public double getBalance(String pin) {
        if (validatePin(pin)) {
            return balance;
        }
        System.out.println("Invalid PIN");
        return -1;
    }
}

public class UPIPaymentApp {
    public static void main(String[] args) {
        UPIAccount account = new UPIAccount("1234", "SBI-123456789", 5000.0);
        
        // Abstraction: Simple interface hides complex operations
        account.sendMoney(500.0, "friend@upi");
        
        // Encapsulation: PIN required to access sensitive data
        System.out.println("Balance: ₹" + account.getBalance("1234"));
        System.out.println("Balance with wrong PIN: ₹" + account.getBalance("0000"));
        
        System.out.println("\nPrinciples Used: ABSTRACTION + ENCAPSULATION");
        System.out.println("1. Abstraction: Complex bank operations hidden behind simple interface");
        System.out.println("2. Encapsulation: PIN and account details are private and protected");
    }
}