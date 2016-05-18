/**
 * Created by Кирил on 16.05.2016.
 */
public enum AirlinerType {
    BOEING_787("BOEING_787",300),
    AIRBUS_A380("AIRBUS_A380",550),
    EMBRAER_E190("EMBRAER_E190",80);

    private final String name;
    private final int seats;


    AirlinerType(String name, int seats) {
        this.name = name;
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Type "+ this.name;
    }
}
