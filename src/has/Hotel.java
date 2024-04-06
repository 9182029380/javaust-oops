package has;

public class Hotel {
    public String hotelName;
    public String location;
    public int rating;
    public int price;
    public int rooms;
    public int bookings;

    public Hotel(String hotelName, String location, int rating, int price, int rooms, int bookings) {
        this.hotelName = hotelName;
        this.location = location;
        this.rating = rating;
        this.price = price;
        this.rooms = rooms;
        this.bookings = bookings;
    }
}
