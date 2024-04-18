public class WaterTransport {
    private String model;
    private int year;

    public WaterTransport(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public void dock() {
        System.out.println("Water transport is docking.");
    }
}