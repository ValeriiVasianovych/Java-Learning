public class Main {
	public static void main(String[] args) {
		Car audi = new Car("Audi", 2003, "blue", 220);
		System.out.println("Name: " + audi.name);
		System.out.println("Year: " + audi.year);
		System.out.println("Color: " + audi.color);
		System.out.println("Speed: " + audi.speed);


		Car bmw = new Car("BMW", 2010, "black", 250);
		System.out.println("Name: " + bmw.name);
		System.out.println("Year: " + bmw.year);
		System.out.println("Color: " + bmw.color);
		System.out.println("Speed: " + bmw.speed);

		Car mazda = new Car("Mazda", 2006, "silver", 240);
		System.out.println("Name: " + mazda.name);
		System.out.println("Year: " + mazda.year);
		System.out.println("Color: " + mazda.color);
		System.out.println("Speed: " + mazda.speed);

	}
}

