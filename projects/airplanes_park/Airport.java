public class Airport {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing 747", 2000, 416, 920);
        System.out.println("Airplane Information:");
        airplane.displayInfo();
        airplane.takeOff();
        airplane.land();

        PassengerAirplane passengerAirplane = new PassengerAirplane("Airbus A380", 2015, 853, 1020, 20);
        System.out.println("\nPassenger Airplane Information:");
        passengerAirplane.displayInfo();
        passengerAirplane.takeOff();
        passengerAirplane.land();
    }
}