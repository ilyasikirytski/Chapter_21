package pattern_examples.example_builder.advBuilder;

public class Director {
    AdvPatternCarBuilder builder;

    void setBuilder(AdvPatternCarBuilder builder) {
        this.builder = builder;
    }

    AdvPatternCar buildCar() {
        builder.createCar();
        builder.buildModel();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        AdvPatternCar car = builder.getCar();
        return car;
    }
}
