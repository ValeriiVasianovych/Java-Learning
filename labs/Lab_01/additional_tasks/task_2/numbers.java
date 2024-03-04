package labs.Lab_01.additional_tasks.task_2;
import java.util.Scanner;

public class numbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ile liczb chcesz wprowadzić? ");
		int n = in.nextInt();
		int max = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Podaj liczbę: ");
			int number = in.nextInt();
			if (number > max) {
				max = number;
			}
		}
		System.out.println("Największa liczba to: " + max);
	}
}

// Na bierzaco zrobic wydawanie liczb