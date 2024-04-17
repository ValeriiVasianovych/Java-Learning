public class Main {
    public static void main(String[] args) {
		PassengerCar passengerCar = new PassengerCar("BMW", "X5", 2015, 150);
        CargoCar cargoCar = new CargoCar("Mazda", "DEF456", 2008, true);
        Tram tram = new Tram("Praga", "BH402", 1987);

        info("Passenger Car Info:");
        Transport.printInfo(passengerCar);

        info("\nCargo Car Info:");
        Transport.printInfo(cargoCar);

        info("\nTram Info:");
        Transport.printInfo(tram);
    }

    public static void info(String message) {
        System.out.println(message);
    }
}
