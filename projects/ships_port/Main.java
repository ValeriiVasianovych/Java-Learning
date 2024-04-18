public class Main {
    public static void main(String[] args) {
        WaterTransport waterTransport = new WaterTransport("Generic Transport", 2000);
        Warship warship = new Warship("Battleship", 2022, 100);
        Ship ship = new Ship("Cargo Ship", 2015, 5000, 25.5);
        FishingShip fishingShip = new FishingShip("Fishing Boat", 2010, 20, 10.0, 10);
        
        System.out.println("Water Transport:");
        waterTransport.displayInfo();
        waterTransport.dock();
        
        System.out.println("\nWarship:");
        warship.displayInfo();
        warship.dock();
        
        System.out.println("\nShip:");
        ship.displayInfo();
        ship.dock();
        
        System.out.println("\nFishing Ship:");
        fishingShip.displayInfo();
        fishingShip.dock();
    }
}
