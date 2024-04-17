public class Book {
    private String title;
    private String author;
    private int year;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getAmountOfPages() {
        return 0;
    }

    public double getGrades() {
        return 0.0;
    }
}
