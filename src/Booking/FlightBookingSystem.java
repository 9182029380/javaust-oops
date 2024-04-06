package Booking;

public class FlightBookingSystem {

    public void bookFlight(String flightnumber,int passengerAge,double baggageWeight) throws FlightNotFoundException, FlightFullBookedException, ImcompleteBookingException, UnderageBookingException, OverweightBookingException {
        if (!flightExists(flightnumber)){
            throw new FlightNotFoundException("Flight not found");
        }
        if(isFlightFullyBooked(flightnumber)){
            throw new FlightFullBookedException("Flight is full");
        }
        if(passengerAge<=0 && baggageWeight<=0){
            throw new ImcompleteBookingException("Age and weight cannot be negative");
        }
        if (passengerAge<=18){
            throw new UnderageBookingException("passenger age must be greater than 18");
        }

        double maxBaggageWeight = getMaxBaggageWeight(flightnumber);
        if (baggageWeight>maxBaggageWeight){
            throw new OverweightBookingException("Baggage weight cannot be more than "+maxBaggageWeight);
        }
    }

    private double getMaxBaggageWeight(String flightnumber) {
        return 20.00;
    }

    private boolean isFlightFullyBooked(String flightnumber) {
        return false;
    }

    private boolean flightExists(String flightnumber) {
        return true;
    }
    public void book(String flightnumber,int passengerAge,double baggageWeight) {
        System.out.println("Flight booked successful for flight " + flightnumber);
    }
}
