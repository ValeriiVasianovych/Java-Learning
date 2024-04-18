class Yacht extends Ship {
    private int numberOfGuests;

    public Yacht(String model, int year, int capacity, double maxSpeed, int numberOfGuests) {
        super(model, year, capacity, maxSpeed);
        this.numberOfGuests = numberOfGuests;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Guests: " + numberOfGuests);
    }

    @Override
    public void dock() {
        super.dock();
        System.out.println("Yacht is docking.");
    }
}