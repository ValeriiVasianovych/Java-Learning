public class Main {
	public static void main(String[] args) {
		Movies movie = new Movies("The Godfather", 3);
		movie.displayInfo();
		movie.play();
		System.out.println();

		Serials serial = new Serials("Breaking Bad", 5, 3);
		serial.displayInfo();
		serial.play();
		System.out.println();

		Genre genre = new Genre("Action", 10, "High");
		genre.displayInfo();
		genre.play();
		System.out.println();

		WaterTransport waterTransport = new WaterTransport("Boat", 2010);
		waterTransport.displayInfo();
		waterTransport.dock();
	}
}