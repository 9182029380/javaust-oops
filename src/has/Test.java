package has;

public class Test {
    public static void main(String[] args)  {
        Flight f=new Flight("airindia","12345","Hyderabad",
                "mumbai","23:30","1:30");
        Hotel h=new Hotel("Itc","newmumbai",5,20000,3,20);

        TravelPackage p=new TravelPackage(f);
        p.display();

    }
}
