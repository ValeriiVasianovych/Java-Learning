public class Chery extends Tree {
    private String kind;

    public Chery(double height, int age, int amount, String kind) {
        super(height, age, amount);
        this.kind = kind;
    }

    @Override
    public void printDetails() {
        System.out.println("Chery Kind: " + kind);
    }

    public void printKind() {
        System.out.println("Chery Kind: " + kind);
    }
}
