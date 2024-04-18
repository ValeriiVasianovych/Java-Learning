public class Warship extends WaterTransport {
    private int numberOfGuns;

    public Warship(String model, int year, int numberOfGuns) {
        super(model, year);
        this.numberOfGuns = numberOfGuns;
    }

    public int getNumberOfGuns() {
        return numberOfGuns;
    }

    public void setNumberOfGuns(int numberOfGuns) {
        this.numberOfGuns = numberOfGuns;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Guns: " + numberOfGuns);
    }

    @Override
    public void dock() {
        super.dock();
        System.out.println("Warship is docking.");
    }
}