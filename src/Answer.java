import java.util.List;

/**
 * Created by Кирил on 16.05.2016.
 */
public class Answer {
    private Request request;
    private List<Airline> airlines;

    public Answer(Request request, List<Airline> airlines) {
        this.request = request;
        this.airlines = airlines;
    }
}
