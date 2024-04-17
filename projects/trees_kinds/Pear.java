public class Pear extends Tree {
    private double diameter;

    public Pear(double height, int age, int amount, double diameter) {
        super(height, age, amount);
        this.diameter = diameter;
    }

    @Override
    public void printDetails() {
        System.out.println("Pear Diameter: " + diameter);
    }

    public void printDiameter() {
        System.out.println("Pear Diameter: " + diameter);
    }
}
