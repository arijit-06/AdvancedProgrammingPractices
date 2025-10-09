class RideBooking {
    private void trackGPS() {
        System.out.println("GPS tracking activated...");
    }
    
    private void assignDriver() {
        System.out.println("Driver assigned based on location...");
    }
    
    private void processPayment() {
        System.out.println("Payment processed securely...");
    }
    
    // Simple interface for user - hides complex internal operations
    public void bookRide(String destination) {
        System.out.println("Booking ride to: " + destination);
        trackGPS();
        assignDriver();
        processPayment();
        System.out.println("Ride booked successfully!");
    }
}

public class RideBookingApp {
    public static void main(String[] args) {
        RideBooking booking = new RideBooking();
        
        // User just clicks once - internal complexity is hidden
        booking.bookRide("Airport");
        
        System.out.println("\nPrinciple Used: ABSTRACTION");
        System.out.println("Complex internal processes are hidden from the user");
    }
}