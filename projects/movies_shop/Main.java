public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("The Godfather", 3);
        movie.displayInfo();
        System.out.println();

        Serials serial = new Serials("Breaking Bad", 5, 3);
        serial.displayInfo();
        System.out.println();

        Comedy comedy = new Comedy("Some Comedy Movie", 2, "Medium", 8.5);
        comedy.displayInfo();
        System.out.println();

        Fantasy fantasy = new Fantasy("Fantasy Movie", 1, "Low", 1000000);
        fantasy.displayInfo();
    }
}