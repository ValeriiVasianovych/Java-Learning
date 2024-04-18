public class SingleCycle extends CycleTypes {
    private String comfort;

    SingleCycle(String name, int year, int amountOfCycles, String comfort) {
        super(name, year, amountOfCycles);
        this.comfort = comfort;
    }

    public String getComfort() {
        return comfort;
    }

    public void setComfort(String comfort) {
        this.comfort = comfort;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Comfort: " + comfort);
    }
}