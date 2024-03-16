import java.util.Scanner;

public class ObszarProstokata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długość boku a:");
        double a = scanner.nextDouble();

        System.out.println("Podaj długość boku b:");
        double b = scanner.nextDouble();

        double area = calculateArea(a, b);
        System.out.println("Pole prostokąta o bokach " + a + " i " + b + " wynosi: " + area);

        scanner.close();
    }

    public static double calculateArea(double a, double b) {
        return a * b;
    }
}