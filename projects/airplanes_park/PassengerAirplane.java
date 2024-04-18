public class PassengerAirplane extends Airplane {
	private int numberOfStewardesses;

	public PassengerAirplane(String model, int year, int capacity, double maxSpeed, int numberOfStewardesses) {
		super(model, year, capacity, maxSpeed);
		this.numberOfStewardesses = numberOfStewardesses;
	}

	public int getNumberOfStewardesses() {
		return numberOfStewardesses;
	}

	public void setNumberOfStewardesses(int numberOfStewardesses) {
		this.numberOfStewardesses = numberOfStewardesses;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Number of Stewardesses: " + numberOfStewardesses);
	}

	@Override
	public void land() {
        super.land();
        System.out.println("Passenger airplane is landing.");
    }
}


// 