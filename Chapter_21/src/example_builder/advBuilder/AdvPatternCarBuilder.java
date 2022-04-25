package example_builder.advBuilder;

public abstract class AdvPatternCarBuilder {
    AdvPatternCar car;

    void createCar() {
        car = new AdvPatternCar();
    }

    abstract void buildModel();

    abstract void buildTransmission();

    abstract void buildMaxSpeed();

    AdvPatternCar getCar() {
        return car;
    }
}
