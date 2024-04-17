public class Transport {
    public static void info(String message) {
        System.out.println(message);
    }

    public static void printInfo(Object vehicle) {
        if (vehicle instanceof Vehicle) {
            Vehicle v = (Vehicle) vehicle;
            info("Brand: " + v.getBrand());
            info("Registration: " + v.getRegistration());
            info("Production Year: " + v.getProductionYear());
        } else if (vehicle instanceof Tram) {
            Tram t = (Tram) vehicle;
            info("Brand: " + t.getBrand());
            info("Registration: " + t.getRegistration());
            info("Production Year: " + t.getProductionYear());
            info("Passengers Amount: " + passengers_amount());
        }
    }

    public static int passengers_amount() {
        return 100;
    }
}
