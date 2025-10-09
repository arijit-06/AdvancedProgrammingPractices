class Bank {
    double interestRate = 5.0;
    
    void displayRate() {
        System.out.println("Bank interest rate: " + interestRate + "%");
    }
}

class SBI extends Bank {
    double interestRate = 8.5;
    
    void displayRate() {
        super.displayRate();
        System.out.println("SBI interest rate: " + interestRate + "%");
        System.out.println("Parent bank rate: " + super.interestRate + "%");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.displayRate();
    }
}