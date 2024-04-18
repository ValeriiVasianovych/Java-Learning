class Movie {
    private String name;
    private int amountOfMovies;

    public Movie(String name, int amountOfMovies) {
        this.name = name;
        this.amountOfMovies = amountOfMovies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfMovies() {
        return amountOfMovies;
    }

    public void setAmountOfMovies(int amountOfMovies) {
        this.amountOfMovies = amountOfMovies;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Amount of movies: " + amountOfMovies);
    }
}