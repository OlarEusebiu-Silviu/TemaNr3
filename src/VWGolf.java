class VWGolf extends Car {
    public VWGolf(double availableFuel, String chassisNumber) {
        super(50, FuelType.BENZINA, 200, 7.0, availableFuel, 17, chassisNumber);
    }

    @Override
    protected double getMileage() {

        return 0;
    }
}