public class Fantasy extends Book {
    private double grade;

    public Fantasy() {
        super();
        this.grade = 0.0;
    }

    public Fantasy(String title, String author, int year, double grade) {
        super(title, author, year);
        this.grade = grade;
    }

    @Override
    public double getGrades() {
        return grade;
    }
}
