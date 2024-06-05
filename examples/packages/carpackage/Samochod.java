package carpackage;

public class Samochod {
    private String color;
    public double speed;
    protected int year;
    String firm;

    public Samochod(String color, double speed, int year, String firm) {
        this.color = color;
        this.speed = speed;
        this.year = year;
        this.firm = firm;
    }

    public void info() {
        System.out.println("Color of Car: " + color);
        System.out.println("Speed of Car: " + speed);
        System.out.println("Year: " + year);
        System.out.println("Firm: " + firm);
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    void packageMethod() {
        System.out.println("This is a package method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    public static void publicStaticMethod() {
        System.out.println("This is a public static method.");
    }

    protected static void protectedStaticMethod() {
        System.out.println("This is a protected static method.");
    }
}
