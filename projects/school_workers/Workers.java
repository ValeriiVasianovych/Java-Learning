public class Workers {
    public String name;
    public int age;
    public int experience;

    public Workers(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public void showQuote() {
        System.out.println("Workers are the best!");
    }
}