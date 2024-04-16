public class NumberFunction {
	public void printNumber() {
		int number = 3;

		switch(number) {
			case 1:
				System.out.println("You selected 1");
				break;
			case 2:
				System.out.println("You selected 2");
				break;
			case 3:
				System.out.println("You selected 3");
				break;
			default:
				System.out.println("Invalid number selection");
		}
	}
}