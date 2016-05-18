import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

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


    public Flight( String airlineName,String departure, String arrival, int departureDate, int arrivalDate, int price, String airliner) {
        this.airlineName = airlineName;
        this.departureAirport=Airport.valueOf(departure);
        this.arrivalAirport = Airport.valueOf(arrival);
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.priceFoTiket = price;
        this.airliner =new Airliner(AirlinerType.valueOf(airliner));
        this.freeSeats = this.airliner.getFreeSeatsCaunt();

    }

    public Flight() {

    }

    @Override
    public String toString(){
        SimpleDateFormat format=new SimpleDateFormat("dd.MM.yy  hh.mm");
        String result ="Airline: "+ this.airlineName+"   "+
                this.getDepartureAirport().toString()+"-" + this.getArrivalAirport().toString() +"  \r\n"+
                " time Departure:" + format.format(this.departureDate)+" "+
                " time Arrival: " + format.format(this.arrivalDate)+" "+
                "Type of plane: "+ this.airliner.toString()+". ";

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
