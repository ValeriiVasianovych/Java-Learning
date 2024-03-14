import java.util.Scanner;

public class square {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Value a: ");
		double a = in.nextDouble();

		System.out.print("Value b: ");
		double b = in.nextDouble();

		System.out.print("Value c: ");
		double c = in.nextDouble();

		double delta = b * b - 4 * a * c;

		if (delta > 0) {
			double x1 = (-b - Math.sqrt(delta)) / (2 * a);
			double x2 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("Rozwiązania: x1 = " + x1 + ", x2 = " + x2);
		} else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.println("Rozwiązanie: x = " + x);
		} else {
			System.out.println("Brak rozwiązań");
		}
	}
}