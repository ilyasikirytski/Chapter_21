package pattern_examples.example_abstract_factory;

public class ToyotaSedan implements Sedan {
    @Override
    public void startRide() {
        System.out.println("toyota sedan ride");
    }
}
