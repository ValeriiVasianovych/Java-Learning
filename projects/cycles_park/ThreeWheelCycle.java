public class ThreeWheelCycle extends Cycle {
    private double price;

    ThreeWheelCycle(String name, int year, double price) {
        super(name, year);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Price: " + price);
    }
}