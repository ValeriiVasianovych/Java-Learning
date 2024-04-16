public class FruitFunction {
	public void printFruit() {
        String fruit = "apple";

        switch(fruit) {
            case "apple":
                System.out.println("You selected apple");
                break;
            case "banana":
                System.out.println("You selected banana");
                break;
            case "orange":
                System.out.println("You selected orange");
                break;
            default:
                System.out.println("Invalid fruit selection");
        }
	}
}