class MercedesCKlasse extends Car {
    public MercedesCKlasse(double availableFuel, String chassisNumber) {
        super(70, FuelType.DIESEL, 210, 6.5, availableFuel, 18, chassisNumber);
    }

    @Override
    protected double getMileage() {

        return 0;
    }
}