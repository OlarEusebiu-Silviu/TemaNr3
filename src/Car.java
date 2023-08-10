abstract class Car implements Vehicle {
    protected double carburantTankSize;
    protected FuelType fuelType;
    protected int maxSpeed;
    protected double consumptionPer100Km;
    protected double availableFuel;
    protected int pneuSize;
    protected String chassisNumber;
    protected int currentGear;
    protected double totalConsumption;

    public Car(double carburantTankSize, FuelType fuelType, int maxSpeed, double consumptionPer100Km, double availableFuel, int pneuSize, String chassisNumber) {
        this.carburantTankSize = carburantTankSize;
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
        this.consumptionPer100Km = consumptionPer100Km;
        this.availableFuel = availableFuel;
        this.pneuSize = pneuSize;
        this.chassisNumber = chassisNumber;
        this.currentGear = 0;
        this.totalConsumption = 0;
    }

    @Override
    public void start() {
        totalConsumption = 0;
    }

    @Override
    public void drive(double distance) {
        if (currentGear == 0) {
            System.out.println("Shift gears first.");
            return;
        }

        double consumption = consumptionPer100Km * (pneuSize / 15.0) * (1 + currentGear * 0.1);
        double consumedFuel = (consumption / 100) * distance;
        totalConsumption += consumedFuel;

        availableFuel -= consumedFuel;
    }

    @Override
    public void stop() {
        // Implementați opțiunile de oprire a mașinii
    }

    @Override
    public double getAvailableFuel() {
        return availableFuel;
    }

    @Override
    public double getAverageFuelConsumption() {
        if (totalConsumption == 0) {
            return 0;
        }
        return (totalConsumption / 100) / getMileage();
    }

    protected abstract double getMileage();
}


enum FuelType {
    BENZINA, MOTORINA, ELECTRIC, DIESEL, HIBRID
}
