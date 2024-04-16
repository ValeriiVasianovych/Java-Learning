import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		LoopFunction loop = new LoopFunction();
		loop.printloop(num);

		WhileFunction whileLoop = new WhileFunction();
		whileLoop.printloop(num);
	}
}

class LoopFunction {
    public void printloop(int value) {
		for (int i = 0; i <= value; i++) {
			System.out.println(i);
		}
    }
}

class WhileFunction {
	public void printloop(int value) {
		int i = 20;
		while (i >= value) {
			System.out.println(i);
			i--;
		}
	}
}

