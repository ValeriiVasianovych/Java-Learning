import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		System.out.println("Choose Fruits or Numbers: (f/n)");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		choice = choice.toLowerCase();

		if (choice.equals("f")) {
			FruitFunction fruit = new FruitFunction();
			fruit.printFruit();
		} else if (choice.equals("n")) {
			NumberFunction number = new NumberFunction();
			number.printNumber();
		} else {
			System.out.println("Invalid input.");
		}
	}
}