public class Tram {
    private String brand;
    private String registration;
    private int productionYear;

    public Tram(String brand, String registration, int productionYear) {
        this.brand = brand;
        this.registration = registration;
        this.productionYear = productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getRegistration() {
        return registration;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int passengers_amount() {
        return Transport.passengers_amount();
    }
}
