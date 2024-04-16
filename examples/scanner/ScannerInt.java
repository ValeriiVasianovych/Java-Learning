import java.util.Scanner;

public class ScannerInt {
	public static void main(String[] args) {
		System.out.println("Print first number: ");
		Scanner numOne = new Scanner(System.in);
		int valueOne;
		valueOne = numOne.nextInt();

		System.out.println("Print second number: ");
		Scanner numTwo = new Scanner(System.in);
		int valueTwo;
		valueTwo = numTwo.nextInt();

		int sum = valueOne + valueTwo;
		System.out.println("Sum: " + sum);
	}
}