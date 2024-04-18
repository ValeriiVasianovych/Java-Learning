public class Main {
    public static void main(String[] args) {
        SingleCycle singleCycle = new SingleCycle("Single Cycle", 2020, 10, "High");
        singleCycle.displayInfo();
        System.out.println();

        DuoCycle duoCycle = new DuoCycle("Duo Cycle", 2020, 20, 2);
        duoCycle.displayInfo();
        System.out.println();

        ThreeWheelCycle threeWheelCycle = new ThreeWheelCycle("Three Wheel Cycle", 2020, 1000.0);
        threeWheelCycle.displayInfo();
        System.out.println();
    }
}