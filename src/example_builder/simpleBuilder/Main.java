package example_builder.simpleBuilder;

public class Main {
    public static void main(String[] args) {
        SimplePatternCar car = new SimplePatternCarBuilder()
                .model("Mersedes")
                .transmission(Transmission.AUTO)
                .maxSpeed(220)
                .build();
        System.out.println(car);
    }
}

