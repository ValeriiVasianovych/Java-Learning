class Airplane {
    private String model;
    private int year;
    private int capacity;
    private double maxSpeed;

    public Airplane(String model, int year, int capacity, double maxSpeed) {
        this.model = model;
        this.year = year;
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Capacity: " + capacity + " passengers");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }

    public void takeOff() {
        System.out.println("The airplane is taking off.");
    }

    public void land() {
        System.out.println("The airplane is landing.");
    }
}
