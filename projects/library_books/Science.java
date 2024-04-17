public class Science extends Book {
    private int pages;

    public Science() {
        super();
        this.pages = 0;
    }

    public Science(String title, String author, int year, int pages) {
        super(title, author, year);
        this.pages = pages;
    }

    @Override
    public int getAmountOfPages() {
        return pages;
    }
}
