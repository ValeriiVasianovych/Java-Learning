public class PassengerCar extends Vehicle {
    private int enginePower;

    public PassengerCar(String brand, String registration, int productionYear, int enginePower) {
        super(brand, registration, productionYear);
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }
}
