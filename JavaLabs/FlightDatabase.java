import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


enum EngineType {Jet, Rocket, Electric, TurboPop, Piston}



class Flight {
    private final String airline;
    private final String flightNumber;
    private final String origin;
    private final String destination;
    private final Date departureTime;
    private final Date arrivalTime;
    private final AircraftType aircraftType;
    private final int gateNum;

    public Flight(String airline, String flightNumber, String origin, String destination, Date departureTime, Date arrivalTime, AircraftType aircraftType, int gateNum) {
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraftType = aircraftType;
        this.gateNum = gateNum;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm");
        String depTime = formatter.format(departureTime);
        String arvTime = formatter.format(arrivalTime);
        return "|   " + airline + "    |   " + flightNumber + "   | " + origin + "  | " + destination + " | " + depTime + " | " + arvTime + " |   " + gateNum + "   | "+ aircraftType;
    }
}

class AircraftType {
    private final String manufacturer;
    private final String model;
    private final String typeDesignator;
    private final EngineType engineType;
    private final int numEngines;

    public AircraftType(String manufacturer, String model, String typeDesignator, EngineType engineType, int numEngines) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.typeDesignator = typeDesignator;
        this.engineType = engineType;
        this.numEngines = numEngines;
    }

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + ", Model: " + model + ", Type: " + typeDesignator + ", Engine: " + engineType + ", # of Engines: " + numEngines;
    }
}

public class FlightDatabase {
    ArrayList<Flight> flights = new ArrayList<>();
    ArrayList<AircraftType> aircrafts = new ArrayList<>();

    public void addAircrafts() {
        aircrafts.add(new AircraftType("Boeing", "737-600", "B736", EngineType.Jet, 2));
        aircrafts.add(new AircraftType("Boeing", "737-800", "B738", EngineType.Rocket, 2));
        aircrafts.add(new AircraftType("Airbus", "A-310", "A310", EngineType.Electric, 2));
        aircrafts.add(new AircraftType("Airbus", "A-300B2", "A30B", EngineType.Piston, 2));
        aircrafts.add(new AircraftType("Airbus", "A-340-500", "A-340-500", EngineType.Jet, 2));
        aircrafts.add(new AircraftType("Embraer", "A-20", "E314", EngineType.TurboPop, 1));
        aircrafts.add(new AircraftType("Embraer", "195", "E195", EngineType.Jet, 2));
    }

    public void addFlights() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm");

        flights.add(new Flight("AA", "10", "PHL", "ORD", sdf.parse("09-09-2020 09:35"), sdf.parse("09-09-2020 11:37"), aircrafts.get(0), 18));
        flights.add(new Flight("DL", "37", "LAX", "JFK", sdf.parse("10-31-2020 13:37"), sdf.parse("11-02-2022 12:00"), aircrafts.get(1), 14));
        flights.add(new Flight("CA", "89", "DFW", "STL", sdf.parse("12-02-2021 14:20"), sdf.parse("09-09-2020 14:25"), aircrafts.get(2), 13));
        flights.add(new Flight("SW", "20", "EWR", "PHL", sdf.parse("04-01-2007 06:02"), sdf.parse("07-09-2020 18:02"), aircrafts.get(3), 44));
        flights.add(new Flight("AS", "48", "RDU", "CHO", sdf.parse("09-09-2020 02:35"), sdf.parse("09-09-2020 01:35"), aircrafts.get(4), 36));
        flights.add(new Flight("NW", "11", "PHX", "TUS", sdf.parse("09-23-2019 00:01"), sdf.parse("09-09-2020 23:59"), aircrafts.get(5), 17));
        flights.add(new Flight("AA", "99", "PHL", "ORD", sdf.parse("06-11-2018 05:45"), sdf.parse("09-09-2020 11:30"), aircrafts.get(6), 78));

    }

    public void printAircraft() {
        for (AircraftType i : aircrafts) {
            System.out.println(i);
        }
    }

    public void printFlight() {
        System.out.println("+---------+--------+------+-----+------------------+------------------+--------+-----------------------------------------+");
        System.out.println("| Airline | Flight | From | To  | Departure        | Arrival          | Gate # | Aircraft ");
        System.out.println("+---------+--------+------+-----+------------------+------------------+--------+-----------------------------------------+");
        for (Flight i : flights) {
            System.out.println(i);
        }
        System.out.println("+---------+--------+------+-----+------------------+------------------+--------+-----------------------------------------+");

    }

    public static void main(String[] args) throws ParseException {

        FlightDatabase flightList = new FlightDatabase();
        flightList.addAircrafts();
        flightList.printAircraft();
        flightList.addFlights();
        flightList.printFlight();
    }
}
