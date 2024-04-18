class Genre extends Movie {
    private String popularity;

    public Genre(String name, int amountOfMovies, String popularity) {
        super(name, amountOfMovies);
        this.popularity = popularity;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Popularity: " + popularity);
    }
}