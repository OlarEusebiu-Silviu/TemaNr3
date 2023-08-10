class MercedesSKlasse extends Car {
    public MercedesSKlasse(double availableFuel, String chassisNumber) {
        super(80, FuelType.DIESEL, 240, 8.0, availableFuel, 19, chassisNumber);
    }

    @Override
    protected double getMileage() {

        return 0;
    }
}

