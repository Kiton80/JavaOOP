/**
 * Created by Кирил on 16.05.2016.
 */
public enum Airport {
    KIEV("KIEV"),
    FRANKFURT("FRANKFURT"),
    LONDON("LONDON"),
    MEXICO("MEXICO");
    private String airportName;

    Airport(String airportName) {
        this.airportName = airportName;
    }


    public String getAirportName() {
        return airportName;
    }
}
