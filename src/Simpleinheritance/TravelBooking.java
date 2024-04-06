package Simpleinheritance;

public class TravelBooking {
    public String destination;
    public int duration;
    public double price;

    public TravelBooking(String destination, int duration, double price) {
        this.destination = destination;
        this.duration = duration;
        this.price = price;
    }
    public void displayBookingDetails(){
        System.out.println("Destination: "+destination);
        System.out.println("Duration: "+duration);
        System.out.println("Price: "+price);
    }
}
