import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Кирил on 16.05.2016.
 */
public class Airline {
    private final String airlineName;
    private List<Flight> flights;
    public Airline(String airlineName, List<Flight> flights) {
        this.airlineName = airlineName;
        this.flights = flights;
    }
    public Airline(String airlineName) {
        this.airlineName = airlineName;
        this.flights = readFlights(airlineName);  // вставить чтение данных(полетеов) из файла по имени компании
    }

    private static List<Flight> readFlights(String airlineName){
        String fileName = "D:\\Airline\\Airlines\\"+airlineName;
        List<String> resultStringList = new ArrayList<String>();
        String thisLine ;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((thisLine = br.readLine()) != null) {
                    resultStringList.add(thisLine);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


         // resultStringList распарстить для инициализации Flight
        // инициализировать флайтс



        System.out.println("Ошибка в чтении файла модуль в разработке");
    return null;}

    public String getAirlineName() {
        return airlineName;
    }
    public List<Flight> getFlights() {
        return flights;
    }
    public void setFlights(List<Flight> flights) {
        for (Flight flight:flights             ) {
            flight.setAirlineName(this.airlineName);
        }
        this.flights = flights;
    }
    public void addAllFlights(List<Flight> flights) {
        for (Flight flight:flights             ) {
            flight.setAirlineName(this.airlineName);
        }
        this.flights.addAll(  flights);
    }
    public void addFlight(Flight flight) {
        flight.setAirlineName(this.airlineName);
        this.flights.add( flight);

    }
}
