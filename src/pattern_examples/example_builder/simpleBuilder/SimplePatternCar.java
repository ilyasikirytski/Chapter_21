package pattern_examples.example_builder.simpleBuilder;

public class SimplePatternCar {
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
        return "Car{" +
                "model='" + model + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
