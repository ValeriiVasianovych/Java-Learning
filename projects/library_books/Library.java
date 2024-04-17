public class Library {
    public static void main(String[] args) {
        Fantasy fantasy = new Fantasy("Harry Potter", "J.K. Rowling", 1997, 4.8);
        fantasy.getGrades();

        Science science = new Science("The Origin of Species", "Charles Darwin", 1859, 502);
        science.getAmountOfPages();

        Book[] books = new Book[6];
        books[0] = fantasy;
        books[1] = science;
        books[2] = new Fantasy("The Hobbit", "J.R.R. Tolkien", 1937, 0);
        books[3] = new Science("The Selfish Gene", "Richard Dawkins", 1976, 0);
        books[4] = new Fantasy("The Lion, the Witch and the Wardrobe", "C.S. Lewis", 1950, 0);
        books[5] = new Science("The Double Helix", "James D. Watson", 1968, 0);

        for (Book book : books) {
            System.out.println("Name: " + book.getTitle() + "\nAuthor: " + book.getAuthor() + "\nYear: " + book.getYear() + "\n");
        }

        if (science instanceof Book) {
            System.out.println("Science is a Book");
        }
        if (fantasy instanceof Book) {
            System.out.println("Fantasy is a Book");
        }
        if (books[0] instanceof Fantasy) {
            System.out.println("The first book is a Fantasy");
        }
		if (books[1] instanceof Science) {
			System.out.println("The second book is a Science");
		}
    }
}
