public class Apple extends Tree {
    private String flavor;

    public Apple(double height, int age, int amount, String flavor) {
        super(height, age, amount);
        this.flavor = flavor;
    }

    @Override
    public void printDetails() {
        System.out.println("Apple Flavor: " + flavor);
    }

    public void printFlavor() {
        System.out.println("Apple Flavor: " + flavor);
    }
}
