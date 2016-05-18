import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Кирил on 17.05.2016. !!Украденно у Богдана!!
 */
public class FlightIOUtils {
    public static final String CSV_DELIMITER = ";";


    // Символьный вывод

    public static void outputFlightIntoFile(Flight flight, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            outputFlight(flight, writer);
        }
    }

    public static void outputFlightsIntoFile(List<Flight> flights, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            outputFlight(flights, writer);
        }
    }

    public static void outputFlight(Flight flight, PrintWriter writer) {
        writer.println(convertFlightToCsv(flight));
    }

    public static void outputFlight(List<Flight> flights, PrintWriter writer) {
        for (Flight flight : flights) {
            outputFlight(flight, writer);
        }
    }

    // Символьный ввод

    public static Flight readPersonFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readFlight(reader);
        }
    }

    private static Flight readFlight(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return parseFlightFromCsv(line);
    }

    public static List<Flight> readFlighFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readFligh(reader);
        }
    }

    public static List<Flight> readFligh(BufferedReader reader) throws IOException {
        List<Flight> flights = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            Flight flight = parseFlightFromCsv(line);
            if (flight != null) {
                flights.add(flight);
            }
        }

        return flights;
    }

    // Преобразования Flight <-> csv

    public static String convertFlightToCsv(Flight flight) {
        return  flight.getAirlineName() + CSV_DELIMITER +
                flight.getDepartureAirport() + CSV_DELIMITER + flight.getArrivalAirport()+ CSV_DELIMITER +
                flight.getDepartureDate()    + CSV_DELIMITER + flight.getArrivalDate()   +  CSV_DELIMITER+
                flight.getAirliner().getType().getName() + CSV_DELIMITER +
                flight.getPriceFoTiket() + CSV_DELIMITER +
                flight.getAirliner().getFreeSeatsCaunt();
    }

    public static Flight parseFlightFromCsv(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        String[] tokens = s.split(CSV_DELIMITER);

//        if (!Validator.isInt(tokens[0]) || !Validator.isInt(tokens[2])) { // Не успел
//            return null;
//        }

        String airlineName=  tokens[0];
        Airport arrivalAirport=(Airport.valueOf(tokens[1]));
        Airport departureAirport=Airport.valueOf(tokens[2]);
        int departureDate=Integer.parseInt(tokens[3]);
        int arrivalDate=Integer.parseInt(tokens[4]);
        int priceFoTiket=(Integer.parseInt(tokens[5]));
        Airliner airliner= new Airliner(AirlinerType.valueOf(tokens[6]));

        return new Flight(departureAirport,arrivalAirport, departureDate, arrivalDate,  priceFoTiket,  airliner, airlineName);
    }

    // Бинарный вывод

    public static void outputBinaryPersonsIntoFile(List<Flight> flights, String fileName) throws IOException {
        try (ObjectOutput outputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
            outputStream.writeObject(flights);
        }
    }

    // Бинарный ввод

    public static List<Flight> readBinaryPersonsFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInput objectInput = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Flight>) objectInput.readObject();
        }
    }
}
