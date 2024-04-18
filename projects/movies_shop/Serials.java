class Serials extends Movie {
    private int numberOfSeries;

    Serials(String name, int amountOfMovies, int numberOfSeries) {
        super(name, amountOfMovies);
        this.numberOfSeries = numberOfSeries;
    }

    public int getNumberOfSeries() {
        return numberOfSeries;
    }

    public void setNumberOfSeries(int numberOfSeries) {
        this.numberOfSeries = numberOfSeries;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of series: " + numberOfSeries);
    }
}