/**
 * Created by Кирил on 16.05.2016.
 */
public class Flight {
    private String airlineName;
    private  Airport departureAirport;
    private  Airport arrivalAirport;
    private  int departureDate;
    private  int arrivalDate;
    private  int priceFoTiket;
    private Airliner airliner;
    private int freeSeats;


    public Flight(Airport departure, Airport arrival, int departureDate, int arrivalDate, int price, Airliner airliner, String airlineName) {
        this.departureAirport = departure;
        this.arrivalAirport = arrival;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.priceFoTiket = price;
        this.airliner = airliner;
        this.freeSeats = airliner.getFreeSeatsCaunt();
        this.airlineName = airlineName;
    }

    public Flight() {

    }

    @Override
    public String toString(){
        String result =this.getDepartureAirport().toString()+"-" + this.getArrivalAirport().toString() +"  "+
                " time Departure:" + this.departureDate+" "+
                " time Arrival: " + this.arrivalDate+" "+
                "Type of plane: "+ this.airliner.toString()+" "+
                "Airline: "+ this.airlineName+" ";

        return result;}

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public int getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(int departureDate) {
        this.departureDate = departureDate;
    }

    public int getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(int arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getPriceFoTiket() {
        return priceFoTiket;
    }

    public void setPriceFoTiket(int priceFoTiket) {
        this.priceFoTiket = priceFoTiket;
    }

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public String getAirlineName() {
        return airlineName;
    }

}
