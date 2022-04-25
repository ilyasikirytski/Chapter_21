package example_builder.advBuilder;

import example_builder.simpleBuilder.Transmission;

public class AdvPatternCar {
    private String model;
    private Transmission transmission;
    private int maxSpeed;

    public void setModel(String model) {
        this.model = model;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "AdvPatternCar{" +
                "model='" + model + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
