public class Tree {
    private double height;
    private int age;
    private int amount;

    public Tree(double height, int age, int amount) {
        this.height = height;
        this.age = age;
        this.amount = amount;
    }

    public void printDetails() {
        System.out.println("Height: " + height);
        System.out.println("Age: " + age);
        System.out.println("Amount: " + amount);
    }
}
