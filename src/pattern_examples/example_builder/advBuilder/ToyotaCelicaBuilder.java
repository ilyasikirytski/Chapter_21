package pattern_examples.example_builder.advBuilder;

public class ToyotaCelicaBuilder extends AdvPatternCarBuilder {
    @Override
    void buildModel() {
        car.setModel("Toyota celica");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(200);
    }
}
