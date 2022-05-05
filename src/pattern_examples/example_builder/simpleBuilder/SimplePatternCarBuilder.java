package pattern_examples.example_builder.simpleBuilder;

public class SimplePatternCarBuilder {
    private String m = "Default";
    private Transmission t = Transmission.MANUAL;
    private int s = 120;

    SimplePatternCarBuilder model(String m) {
        this.m = m;
        return this;
    }

    SimplePatternCarBuilder transmission(Transmission t) {
        this.t = t;
        return this;
    }

    SimplePatternCarBuilder maxSpeed(int s) {
        this.s = s;
        return this;
    }

    SimplePatternCar build() {
        SimplePatternCar car = new SimplePatternCar();
        car.setModel(m);
        car.setTransmission(t);
        car.setMaxSpeed(s);
        return car;
    }
}
