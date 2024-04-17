public class CargoCar extends Vehicle {
    private boolean cargoReadiness;

    public CargoCar(String brand, String registration, int productionYear, boolean cargoReadiness) {
        super(brand, registration, productionYear);
        this.cargoReadiness = cargoReadiness;
    }

    public boolean isCargoReadiness() {
        return cargoReadiness;
    }
}
