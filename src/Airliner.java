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

    public int getFreeSeatsCaunt() {
        return freeSeatsCaunt;
    }

    public void setFreeSeatsCaunt(int freeSeatsCaunt) {
        try {
            if (freeSeatsCaunt<this.type.getSeats()) this.freeSeatsCaunt ++ ;
        } catch (Exception e) {
            System.out.println("Операция не прошла. Свободных мест нет");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Airliner boeing=new Airliner(AirlinerType.AIRBUS_A380);
    }

}
