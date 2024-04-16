import java.util.Scanner;

public class ScannerString {
	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		Scanner str = new Scanner(System.in);
		String yourName;
		yourName = str.nextLine();
		System.out.println("Your name is: " + yourName);
	}
}