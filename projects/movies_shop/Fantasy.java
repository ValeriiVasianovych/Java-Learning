class Fantasy extends Genre {
    private int views;

    public Fantasy(String name, int amountOfMovies, String popularity, int views) {
        super(name, amountOfMovies, popularity);
        this.views = views;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Views: " + views);
    }
}