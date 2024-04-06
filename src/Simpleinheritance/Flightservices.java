package Simpleinheritance;

public class Flightservices extends FlightBooking{

    public String services;

    public Flightservices(String destination, int duration, double price, String airline, String services) {
        super(destination, duration, price, airline);
        this.services = services;
    }
    public void displayBookingDetails(){
        super.displayBookingDetails();
        System.out.println("Services: " + services);
    }

}

