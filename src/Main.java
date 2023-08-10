


public class Main {
    public static void main(String[] args) {
        Car vwGolf = new VWGolf(30, "1987ddkshik289");
        vwGolf.start();
        vwGolf.drive(100);
        vwGolf.stop();
        float availableFuel = (float) vwGolf.getAvailableFuel();
        float fuelConsumedPer100Km = (float) vwGolf.getAverageFuelConsumption();
        System.out.println("Available fuel: " + availableFuel + " liters");
        System.out.println("Average fuel consumption: " + fuelConsumedPer100Km + " liters/100 km");


    }
}





