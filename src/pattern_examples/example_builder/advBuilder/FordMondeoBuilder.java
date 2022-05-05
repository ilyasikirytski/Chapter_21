package pattern_examples.example_builder.advBuilder;

public class FordMondeoBuilder extends AdvPatternCarBuilder {
    @Override
    void buildModel() {
        car.setModel("Ford mondeo");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(180);
    }
}
