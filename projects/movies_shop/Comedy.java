class Comedy extends Genre {
    private double rating;

    public Comedy(String name, int amountOfMovies, String popularity, double rating) {
        super(name, amountOfMovies, popularity);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Rating: " + rating);
    }
}