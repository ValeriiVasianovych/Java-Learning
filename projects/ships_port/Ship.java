public class Ship extends WaterTransport {
    private int capacity;
    private double maxSpeed;

    public Ship(String model, int year, int capacity, double maxSpeed) {
        super(model, year);
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Capacity: " + capacity);
        System.out.println("Max Speed: " + maxSpeed);
    }
}