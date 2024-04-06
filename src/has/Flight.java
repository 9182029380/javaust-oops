package has;

public class Flight {
    public String airline;
    public String flightNumber;
    public String departure;
    public String destination;
    public String departureTime;
    public String arrivalTime;

    public Flight(String airline, String flightNumber, String departure, String destination, String departureTime, String arrivalTime) {
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
}
