public class Teacher extends Workers {
    private String subject;

    public Teacher(String name, int age, int experience, String subject) {
        super(name, age, experience);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void showQuote() {
        System.out.println("Teachers are the best!");
    }
}