class Bank {
    public double rateOfInterest() {
        return 0.0;
    }
}

class SBI extends Bank {
    public double rateOfInterest() {
        return 8.5;
    }
}

class ICICI extends Bank {
    public double rateOfInterest() {
        return 7.8;
    }
}

class HDFC extends Bank {
    public double rateOfInterest() {
        return 8.2;
    }
}

public class BankPolymorphism {
    public static void main(String[] args) {
        Bank bank;
        
        bank = new SBI();
        System.out.println("SBI Rate of Interest: " + bank.rateOfInterest() + "%");
        
        bank = new ICICI();
        System.out.println("ICICI Rate of Interest: " + bank.rateOfInterest() + "%");
        
        bank = new HDFC();
        System.out.println("HDFC Rate of Interest: " + bank.rateOfInterest() + "%");
    }
}