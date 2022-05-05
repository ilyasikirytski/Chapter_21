package pattern_examples.example_abstract_factory;

public class FordSedan implements Sedan {
    @Override
    public void startRide() {
        System.out.println("ford sedan ride");
    }
}
