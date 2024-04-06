package has;

public class TravelPackage {
    public Flight flight;

    public TravelPackage(Flight flight) {
        this.flight = flight;
    }
//public Hotel hotel;

//    public TravelPackage(Flight flight, Hotel hotel) {
//        this.flight = flight;
//        this.hotel = hotel;
//    }
    public void display(){
        System.out.println("Flight Details");
       // System.out.println("Hotel Details");

    }
}
