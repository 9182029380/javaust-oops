package Simpleinheritance;

public class FlightBooking  extends TravelBooking {
    public String airline;

    public FlightBooking(String destination, int duration, double price, String airline) {
        super(destination, duration, price);
        this.airline = airline;
    }
    public void displayBookingDetails() {
        super.displayBookingDetails();
        System.out.println("Airline: " + airline);
    }
}
