class VWPassat extends Car {
    public VWPassat(double availableFuel, String chassisNumber) {
        super(60, FuelType.BENZINA, 220, 7.5, availableFuel, 16, chassisNumber);
    }

    @Override
    protected double getMileage() {

        return 0;
    }
}