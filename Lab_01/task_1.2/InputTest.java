import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Jak sie nazywasz? ");
		String name = in.nextLine();

		System.out.print("Ile masz lat? ");
		int age = in.nextInt();

		System.out.println("Witaj uzytkowniku " + name + ". W przyszłym roku będziesz miec " + (age + 1) + " lat.");
	}
}
