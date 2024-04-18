public class FishingShip extends Ship {
    private int numberOfFishermen;

    public FishingShip(String model, int year, int capacity, double maxSpeed, int numberOfFishermen) {
        super(model, year, capacity, maxSpeed);
        this.numberOfFishermen = numberOfFishermen;
    }

    public int getNumberOfFishermen() {
        return numberOfFishermen;
    }

    public void setNumberOfFishermen(int numberOfFishermen) {
        this.numberOfFishermen = numberOfFishermen;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Fishermen: " + numberOfFishermen);
    }

    @Override
    public void dock() {
        super.dock();
        System.out.println("Fishing ship is docking.");
    }
}