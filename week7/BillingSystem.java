class BillingCounter {
    public void generateBill(String item1, double price1, String item2, double price2) {
        System.out.println("Bill with 2 items:");
        System.out.println(item1 + ": $" + price1);
        System.out.println(item2 + ": $" + price2);
        System.out.println("Total: $" + (price1 + price2));
        System.out.println();
    }
    
    public void generateBill(String item1, double price1, String item2, double price2, String item3, double price3) {
        System.out.println("Bill with 3 items:");
        System.out.println(item1 + ": $" + price1);
        System.out.println(item2 + ": $" + price2);
        System.out.println(item3 + ": $" + price3);
        System.out.println("Total: $" + (price1 + price2 + price3));
        System.out.println();
    }
    
    public void generateBill(String item1, double price1, String item2, double price2, String item3, double price3, String item4, double price4) {
        System.out.println("Bill with 4 items:");
        System.out.println(item1 + ": $" + price1);
        System.out.println(item2 + ": $" + price2);
        System.out.println(item3 + ": $" + price3);
        System.out.println(item4 + ": $" + price4);
        System.out.println("Total: $" + (price1 + price2 + price3 + price4));
        System.out.println();
    }
}

public class BillingSystem {
    public static void main(String[] args) {
        BillingCounter counter = new BillingCounter();
        
        counter.generateBill("Bread", 2.50, "Milk", 3.00);
        counter.generateBill("Bread", 2.50, "Milk", 3.00, "Eggs", 4.00);
        counter.generateBill("Bread", 2.50, "Milk", 3.00, "Eggs", 4.00, "Butter", 5.50);
    }
}