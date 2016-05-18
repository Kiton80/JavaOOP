/**
 * Created by Кирил on 16.05.2016.
 */
public class Airliner  {
    private final AirlinerType type;
    private int freeSeatsCaunt;


    public Airliner(AirlinerType type) {
        this.type = type;
        this.freeSeatsCaunt=type.getSeats();  // обернуть в трай кетч!!
    }

    public int getFreeSeatsCount() {
        return freeSeatsCaunt;
    }

    public void setFreeSeatsCaunt(int freeSeatsCount) {
        try {
            if (freeSeatsCount<this.type.getSeats()) this.freeSeatsCaunt ++ ;
        } catch (Exception e) {
            System.out.println("Операция не прошла. Свободных мест нет");
            e.printStackTrace();
        }
    }

    public AirlinerType getType() {
        return type;
    }

    public static void main(String[] args) {

        //Airliner boeing=new Airliner(AirlinerType.AIRBUS_A380);
    }


}
