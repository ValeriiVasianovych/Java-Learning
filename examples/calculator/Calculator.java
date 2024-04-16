import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Do you want to use calculator? (y/n)");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();

		choice = choice.toLowerCase();
		
		if (choice.equals("y")) {
			System.out.println("Number 1:");
			double valueOne;
            if (scanner.hasNextDouble()) {
                valueOne = scanner.nextDouble();
            } else {
                System.out.println("Invalid input for Number 1.");
                return;
            }

			System.out.println("Number 2:");
			double valueTwo;
            if (scanner.hasNextDouble()) {
                valueTwo = scanner.nextDouble();
            } else {
                System.out.println("Invalid input for Number 2.");
                return;
            }
			CalculatorFunctions calculator = new CalculatorFunctions();
            calculator.calculate(valueOne, valueTwo);
		}
		else {
			System.out.println("Enter (y/n)");
		}
	}
}