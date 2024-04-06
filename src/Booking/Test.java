package Booking;

public class Test {
    public static void main(String[] args) throws FlightNotFoundException, UnderageBookingException, FlightFullBookedException, OverweightBookingException, ImcompleteBookingException {
        FlightBookingSystem flightBookingSystem = new FlightBookingSystem();
        try {
            flightBookingSystem.bookFlight("A1", 20, 20);
            System.out.println("flight is booked successfully");

        }catch(FlightNotFoundException | UnderageBookingException | FlightFullBookedException | OverweightBookingException | ImcompleteBookingException e){
            System.out.println(e.getMessage());
        }
    }
}
