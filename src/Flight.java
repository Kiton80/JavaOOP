/**
 * Created by Кирил on 16.05.2016.
 */
public class Flight {
    private  Airport departure;
    private  Airport arrival;
    private  int departureDate;
    private  int arrivalDate;
    private  int price;
    private Airliner airliner;
    private int seats;
    private String airlineName;

    public Flight(Airport departure, Airport arrival, int departureDate, int arrivalDate, int price, Airliner airliner, String airlineName) {
        this.departure = departure;
        this.arrival = arrival;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.price = price;
        this.airliner = airliner;
        this.seats = airliner.getFreeSeatsCount();
        this.airlineName = airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public static void main(String[] args) {


    }
    @Override
    public String toString(){
    String result =this.getDeparture().toString()+"-" + this.getArrival().toString() +"  "+
            " time Departure:" + this.departureDate+" "+
            " time Arrival: " + this.arrivalDate+" "+
            "Type of plane: "+ this.airliner.toString()+" "+
            "Airline: "+ this.airlineName+" ";

    return result;}

    public Airport getDeparture() {
        return departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    public int getDepartureDate() {
        return departureDate;
    }

    public int getArrivalDate() {
        return arrivalDate;
    }

    public int getPrice() {
        return price;
    }

    public Airliner getAirliner() {
        return airliner;
    }

    public int getSeats() {
        return seats;
    }

    public String getAirlineName() {
        return airlineName;
    }
}
