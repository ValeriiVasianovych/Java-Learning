public class CycleTypes extends Cycle {
    private int amountOfCycles;

    CycleTypes(String name, int year, int amountOfCycles) {
        super(name, year);
        this.amountOfCycles = amountOfCycles;
    }

    public int getCycles() {
        return amountOfCycles;
    }

    public void setCycles(int amountOfCycles) {
        this.amountOfCycles = amountOfCycles;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Amount Of Cycles: " + amountOfCycles);
    }
}