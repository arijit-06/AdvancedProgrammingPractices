interface PrimeFeatures {
    void freeShipping();
    void exclusiveDeals();
}

class User {
    String name;
    String email;
    
    User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    void displayUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

class Customer extends User {
    String customerId;
    
    Customer(String name, String email, String customerId) {
        super(name, email);
        this.customerId = customerId;
    }
    
    void displayCustomerInfo() {
        displayUserInfo();
        System.out.println("Customer ID: " + customerId);
    }
}

class Seller extends User {
    String sellerId;
    
    Seller(String name, String email, String sellerId) {
        super(name, email);
        this.sellerId = sellerId;
    }
    
    void displaySellerInfo() {
        displayUserInfo();
        System.out.println("Seller ID: " + sellerId);
    }
}

class PrimeCustomer extends Customer implements PrimeFeatures {
    PrimeCustomer(String name, String email, String customerId) {
        super(name, email, customerId);
    }
    
    public void freeShipping() {
        System.out.println("Free shipping available for " + name);
    }
    
    public void exclusiveDeals() {
        System.out.println("Exclusive deals available for " + name);
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        PrimeCustomer pc = new PrimeCustomer("Bob Wilson", "bob@email.com", "C001");
        pc.displayCustomerInfo();
        pc.freeShipping();
        pc.exclusiveDeals();
    }
}