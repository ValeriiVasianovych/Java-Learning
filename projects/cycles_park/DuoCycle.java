public class DuoCycle extends CycleTypes {
    private int amountOfPassengers;

    DuoCycle(String name, int year, int amountOfCycles, int amountOfPassengers) {
        super(name, year, amountOfCycles);
        this.amountOfPassengers = amountOfPassengers;
    }

    public int getPassengers() {
        return amountOfPassengers;
    }

    public void setPassengers(int amountOfPassengers) {
        this.amountOfPassengers = amountOfPassengers;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Amount Of Passengers: " + amountOfPassengers);
    }
}