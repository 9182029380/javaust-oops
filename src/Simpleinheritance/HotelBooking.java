package Simpleinheritance;

public class HotelBooking  extends TravelBooking{
    private String hotelname;

    public HotelBooking(String destination, int duration, double price, String hotelname) {
        super(destination, duration, price);
        this.hotelname = hotelname;
    }
    public void displayBookingDetails(){
        System.out.println("Hotel name: "+hotelname);
        super.displayBookingDetails();
    }
}
