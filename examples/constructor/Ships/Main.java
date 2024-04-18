public class Main {
	public static void main(String[] args) {
		Ship titanic = new Ship ("Titanic", 1912, "RMS");
		System.out.println("Name: " + titanic.name);
		System.out.println("Year: " + titanic.year);
		System.out.println("Type: " + titanic.type);

		Ship queenMary = new Ship ("Queen Mary", 1936, "RMS");
		System.out.println("Name: " + queenMary.name);
		System.out.println("Year: " + queenMary.year);
		System.out.println("Type: " + queenMary.type);
	}
} 